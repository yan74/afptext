package org.afplib.generator;

import java.util.stream.Collectors;

import org.afplib.afplib.AfplibPackage;
import org.afplib.base.BasePackage;
import org.eclipse.emf.ecore.EClass;

public class Model2Grammar {

	private static final EClass sfEClass = BasePackage.eINSTANCE.getSF();
	private static final EClass tripletEClass = BasePackage.eINSTANCE.getTriplet();

	public static void main(String[] args) {
		
		System.out.println("grammar org.afplib.AfpText with org.eclipse.xtext.common.Terminals\n" + 
				"\n" + 
				"generate afpText \"http://www.afplib.org/AfpText\"\n" + 
				"\n" + 
				"import \"http://www.eclipse.org/emf/2002/Ecore\" as ecore\n" + 
				"\n" + 
				"Model:\n" + 
				"	(structuredFields+=structuredField)*;\n" + 
				"\n" + 
				"terminal MODCASTRING:\n" + 
				"	'\"' ( '\\\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'\"'|\"'\"|'\\\\' */ | !('\\\\'|'\"') )* '\"' |\n" + 
				"	\"'\" ( '\\\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'\"'|\"'\"|'\\\\' */ | !('\\\\'|\"'\") )* \"'\"\n" + 
				";\n" + 
				"\n" + 
				"terminal EINTEGEROBJECT returns ecore::EInt: '-'? ('0'..'9')+;\n" + 
				"\n" + 
				"terminal EBYTEARRAY:\n" + 
				"	'[' ('a'..'z'|'A'..'Z'|'0'..'9')* ']'\n" + 
				"	\n" + 
				"	;\n" + 
				"	\n" + 
				"structuredField:");
		
		System.out.print("    (");
		
		System.out.println(AfplibPackage.eINSTANCE.getEClassifiers().stream()
		.filter(EClass.class::isInstance)
		.map(EClass.class::cast)
		.filter(sfEClass::isSuperTypeOf)
		.map(c -> c.getName())
		.collect(Collectors.joining(" | ")));
		
		System.out.println(") '\\n';");
		
		AfplibPackage.eINSTANCE.getEClassifiers().stream()
		.filter(EClass.class::isInstance)
		.map(EClass.class::cast)
		.filter(sfEClass::isSuperTypeOf)
		.forEach(clazz -> {
			System.out.println(clazz.getName()+":");
			System.out.print("    {"+clazz.getName()+"} '"+clazz.getName()+"'");
			String params = clazz.getEAllAttributes().stream()
			.filter(a -> !a.equals(BasePackage.eINSTANCE.getSF_Id()))
			.filter(a -> !a.equals(BasePackage.eINSTANCE.getSF_Charset()))
			.filter(a -> !a.equals(BasePackage.eINSTANCE.getSF_Length()))
			.filter(a -> !a.equals(BasePackage.eINSTANCE.getSF_Number()))
			.filter(a -> !a.equals(BasePackage.eINSTANCE.getSF_Offset()))
			.filter(a -> !a.equals(BasePackage.eINSTANCE.getSF_RawData()))
			.map(a -> {
				String res = "('"+a.getName()+"=' ("+a.getName()+"=";
				String typeName = a.getEType().getName().toUpperCase();
				if("MODCASTRING4".equals(typeName)) typeName="MODCASTRING";
				if("MODCASTRING8".equals(typeName)) typeName="MODCASTRING";
				if("MODCASTRING32".equals(typeName)) typeName="MODCASTRING";
				res += typeName+"))?";
				return res;
			}).collect(Collectors.joining(" & "));
			if(params!=null && params.length() > 0) {
				System.out.print(" ("+params+")");
			}
			clazz.getEAllContainments().stream()
			.filter(c -> !c.equals(BasePackage.eINSTANCE.getSF_Children()))
			.filter(c -> !c.getName().equalsIgnoreCase("rg") && !c.getName().equalsIgnoreCase("FixedLengthRG"))
			.forEach(c -> {
				System.out.print(" (triplets+=triplet)*");
			});
			clazz.getEAllContainments().stream()
			.filter(c -> c.getName().equalsIgnoreCase("rg") || c.getName().equalsIgnoreCase("FixedLengthRG"))
			.forEach(c -> {
				System.out.print(" (rg+="+clazz.getName()+"RG)*");
			});
			System.out.println(";");
		});
		
		AfplibPackage.eINSTANCE.getEClassifiers().stream()
		.filter(EClass.class::isInstance)
		.map(EClass.class::cast)
		.filter(tripletEClass::isSuperTypeOf)
		.filter(clazz -> clazz.getName().endsWith("RG"))
		.forEach(clazz -> {
			System.out.println(clazz.getName()+":");
			System.out.print("    {"+clazz.getName()+"} '\\n.rg'");
			String params = clazz.getEAllAttributes().stream()
			.filter(a -> !a.equals(BasePackage.eINSTANCE.getTriplet_Charset()))
			.filter(a -> !a.equals(BasePackage.eINSTANCE.getTriplet_FileOffset()))
			.filter(a -> !a.equals(BasePackage.eINSTANCE.getTriplet_Label()))
			.filter(a -> !a.equals(BasePackage.eINSTANCE.getTriplet_TripletId()))
			.filter(a -> !a.equals(BasePackage.eINSTANCE.getTriplet_TripletLength()))
			.filter(a -> !a.equals(BasePackage.eINSTANCE.getTriplet_TripletNumber()))
			.map(a -> {
				String res = "('"+a.getName()+"=' ("+a.getName()+"=";
				String typeName = a.getEType().getName().toUpperCase();
				if("MODCASTRING4".equals(typeName)) typeName="MODCASTRING";
				if("MODCASTRING8".equals(typeName)) typeName="MODCASTRING";
				if("MODCASTRING32".equals(typeName)) typeName="MODCASTRING";
				res += typeName+"))?";
				return res;
			}).collect(Collectors.joining(" & "));
			if(params!=null && params.length() > 0) {
				System.out.print(" ("+params+")");
			}
			clazz.getEAllContainments().stream()
			.filter(c -> !c.getName().equalsIgnoreCase("rg")  && !c.getName().equalsIgnoreCase("FixedLengthRG"))
			.forEach(c -> {
				System.out.print(" (triplets+=triplet)*");
			});
			System.out.println(";");
		});
		
		System.out.println("triplet:");
		System.out.print("    '\\n.' (");

		System.out.println(AfplibPackage.eINSTANCE.getEClassifiers().stream()
		.filter(EClass.class::isInstance)
		.map(EClass.class::cast)
		.filter(tripletEClass::isSuperTypeOf)
		.filter(clazz -> !clazz.getName().endsWith("RG"))
		.map(c -> c.getName())
		.collect(Collectors.joining(" | ")));

		System.out.println(");");

		AfplibPackage.eINSTANCE.getEClassifiers().stream()
		.filter(EClass.class::isInstance)
		.map(EClass.class::cast)
		.filter(tripletEClass::isSuperTypeOf)
		.filter(clazz -> !clazz.getName().endsWith("RG"))
		.forEach(clazz -> {
			System.out.println(clazz.getName()+":");
			System.out.print("    {"+clazz.getName()+"} '"+clazz.getName()+"'");
			String params = clazz.getEAllAttributes().stream()
			.filter(a -> !a.equals(BasePackage.eINSTANCE.getTriplet_Charset()))
			.filter(a -> !a.equals(BasePackage.eINSTANCE.getTriplet_FileOffset()))
			.filter(a -> !a.equals(BasePackage.eINSTANCE.getTriplet_Label()))
			.filter(a -> !a.equals(BasePackage.eINSTANCE.getTriplet_TripletId()))
			.filter(a -> !a.equals(BasePackage.eINSTANCE.getTriplet_TripletLength()))
			.filter(a -> !a.equals(BasePackage.eINSTANCE.getTriplet_TripletNumber()))
			.map(a -> {
				String res = "('"+a.getName()+"=' ("+a.getName()+"=";
				String typeName = a.getEType().getName().toUpperCase();
				if("MODCASTRING4".equals(typeName)) typeName="MODCASTRING";
				if("MODCASTRING8".equals(typeName)) typeName="MODCASTRING";
				if("MODCASTRING32".equals(typeName)) typeName="MODCASTRING";
				res += typeName+"))?";
				return res;
			}).collect(Collectors.joining(" & "));
			if(params!=null && params.length() > 0) {
				System.out.print(" ("+params+")");
			}
			clazz.getEAllContainments().stream()
			.filter(c -> c.getName().equalsIgnoreCase("rg") || c.getName().equalsIgnoreCase("FixedLengthRG"))
			.forEach(c -> {
				System.out.print(" (rg+="+clazz.getName()+"RG)*");
			});
			System.out.println(";");
		});
		

	}
	
}
