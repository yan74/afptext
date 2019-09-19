package org.afplib.generator;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.List;

import javax.xml.bind.DatatypeConverter;

import org.afplib.afpText.structuredField;
import org.afplib.afplib.AfplibFactory;
import org.afplib.afplib.AfplibPackage;
import org.afplib.base.BasePackage;
import org.afplib.base.SF;
import org.afplib.base.Triplet;
import org.afplib.io.AfpOutputStream;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

public class Text2AFP {

	private static final EClass sfEClass = BasePackage.eINSTANCE.getSF();
	private static final EClass tripletEClass = BasePackage.eINSTANCE.getTriplet();
	
	private ByteArrayOutputStream result = new ByteArrayOutputStream();
	private AfpOutputStream out;
	
	public Text2AFP() {
		out = new AfpOutputStream(result);
	}
	
	public void add(structuredField text) throws IOException {
		System.out.println(text);
		out.writeStructuredField(toSF(text));
	}
	
	public byte[] get() {
		return result.toByteArray();
	}
	
	public static SF toSF(EObject text) {
		String sfName = text.eClass().getName();
		EClass sfClass = AfplibPackage.eINSTANCE.getEClassifiers().stream()
			.filter(EClass.class::isInstance)
			.map(EClass.class::cast)
			.filter(sfEClass::isSuperTypeOf)
			.filter(clazz -> clazz.getName().equals(sfName))
			.findAny().orElse(null);
		
		SF sf = (SF) AfplibFactory.eINSTANCE.create(sfClass);
		
		copyAttributes(text, sf);
		copyContainments(text, sf);

		return sf;
	}
	
	public static Triplet toTriplet(EObject text) {
		String tName = text.eClass().getName();
		EClass tClass = AfplibPackage.eINSTANCE.getEClassifiers().stream()
			.filter(EClass.class::isInstance)
			.map(EClass.class::cast)
			.filter(tripletEClass::isSuperTypeOf)
			.filter(clazz -> clazz.getName().equals(tName))
			.findAny().orElse(null);
		
		Triplet triplet = (Triplet) AfplibFactory.eINSTANCE.create(tClass);
		copyAttributes(text, triplet);
		copyContainments(text, triplet);
		
		return triplet;
	}

	public static void copyAttributes(EObject text, EObject afp) {
		for(EAttribute attr : text.eClass().getEAllAttributes()) {
			afp.eClass().getEAllAttributes().stream()
				.filter(a -> a.getName().equals(attr.getName()))
				.findAny().ifPresent((a) -> {
					Object value = text.eGet(attr);
					if(value != null && a.getEType().getInstanceClass().equals(String.class)) {
						value = ((String)value).substring(1, ((String)value).length() - 1); // remove "" or ''
					}
					if(value != null && a.getEType().getInstanceClass().equals(byte[].class)) {
						value = ((String)value).substring(1, ((String)value).length() - 1); // remove [ and ]
						value = DatatypeConverter.parseHexBinary((String) value);
					}
					afp.eSet(a, value);
				});
		}
	}

	public static void copyContainments(EObject text, EObject afp) {
		
		text.eClass().getEAllContainments().stream()
			.filter(c -> c.getName().equalsIgnoreCase("triplets"))
			.findAny().ifPresent(c -> {
				List<EObject> triplets = (List<EObject>) text.eGet(c);
				afp.eClass().getEAllContainments().stream()
					.filter(c2 -> c2.getName().equalsIgnoreCase("triplets"))
					.findAny().ifPresent(c2 -> {
						List<EObject> afpTriplets = (List<EObject>) afp.eGet(c2);
						triplets.stream().map(Text2AFP::toTriplet)
							.forEach(afpTriplets::add);
					});
			});
	
		text.eClass().getEAllContainments().stream()
			.filter(c -> c.getName().equalsIgnoreCase("rg"))
				.forEach(c -> {
					List<EObject> rg = (List<EObject>) text.eGet(c);
					afp.eClass().getEAllContainments().stream()
						.filter(c2 -> c2.getName().equalsIgnoreCase("rg"))
						.findAny().ifPresent(c2 -> {
							List<EObject> afpRG = (List<EObject>) afp.eGet(c2);
							rg.stream().map(Text2AFP::toTriplet)
								.forEach(afpRG::add);
						});
				});

	}
}
