package org.afplib.generator;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

import javax.xml.bind.DatatypeConverter;

import org.afplib.afpText.structuredField;
import org.afplib.afplib.AfplibFactory;
import org.afplib.afplib.AfplibPackage;
import org.afplib.base.BasePackage;
import org.afplib.base.SF;
import org.afplib.base.Triplet;
import org.afplib.io.AfpOutputStream;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.util.CancelIndicator;

public class Text2AFP extends InputStream {

	private static final EClass sfEClass = BasePackage.eINSTANCE.getSF();
	private static final EClass tripletEClass = BasePackage.eINSTANCE.getTriplet();
	
	private AfpOutputStream out;
	private CancelIndicator cancelIndicator;
	private byte[] current;
	private int currentLength;
	private int pointer;
	private TreeIterator<EObject> iterator;

	class AfpOut extends AfpOutputStream {
		public AfpOut() {
			super(null);
		}

		@Override
		public void write(byte[] b, int off, int len) throws IOException {
			current = b;
			currentLength = len;
		}
	}
	
	public Text2AFP(Resource resource, CancelIndicator indicator) {
		this.cancelIndicator = indicator;
		this.out = new AfpOut();
		this.iterator = resource.getAllContents();
	}

	@Override
	public int read() throws IOException {
		if(current == null) {
			if(!next()) {
				return -1;
			}
			pointer = 0;
		}
		if(pointer >= currentLength) {
			if(!next()) {
				return -1;
			}
			pointer = 0;
		}
		
		return current[pointer++] & 0xff;
	}

	private boolean next() throws IOException {
		
		if(cancelIndicator.isCanceled()) return false;
		
		EObject next = null;
		do {
			if(!iterator.hasNext()) return false;
			next = iterator.next();
			if(!(next instanceof structuredField)) next = null;
		} while(next == null);
		
		out.writeStructuredField(toSF(next));
		return true;
	}
	
	private static SF toSF(EObject text) {
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
	
	private static Triplet toTriplet(EObject text) {
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

	private static void copyAttributes(EObject text, EObject afp) {
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
					if(value != null) afp.eSet(a, value);
				});
		}
	}

	private static void copyContainments(EObject text, EObject afp) {
		
		text.eClass().getEAllContainments().stream()
			.filter(c -> c.getName().equalsIgnoreCase("triplets"))
			.findAny().ifPresent(c -> {
				List<EObject> triplets = (List<EObject>) text.eGet(c);
				afp.eClass().getEAllContainments().stream()
					.filter(c2 -> !c2.equals(BasePackage.eINSTANCE.getSF_Children()))
					.filter(c2 -> !c2.getName().equalsIgnoreCase("rg") && !c2.getName().equalsIgnoreCase("FixedLengthRG"))
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
						.filter(c2 -> c2.getName().equalsIgnoreCase("rg") || c2.getName().equalsIgnoreCase("FixedLengthRG"))
						.findAny().ifPresent(c2 -> {
							List<EObject> afpRG = (List<EObject>) afp.eGet(c2);
							rg.stream().map(Text2AFP::toTriplet)
								.forEach(afpRG::add);
						});
				});

	}

}
