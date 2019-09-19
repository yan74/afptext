package org.afplib.generator;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.List;
import java.util.stream.Collectors;

import javax.xml.bind.DatatypeConverter;

import org.afplib.base.BasePackage;
import org.afplib.base.SF;
import org.afplib.base.Triplet;
import org.afplib.io.AfpInputStream;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;

public class AFP2Text extends InputStream {

	private SubMonitor monitor;
	private AfpInputStream afp;
	private String currentText;
	private Charset charset;
	private byte[] current;
	private int pointer = 0;

	public AFP2Text(IFile input, IProgressMonitor monitor) throws FileNotFoundException {
		this(input, Charset.defaultCharset(), monitor);
	}
	
	public AFP2Text(IFile input, Charset charset, IProgressMonitor monitor) throws FileNotFoundException {
		this.charset = charset;
		File realfile = input.getRawLocation().makeAbsolute().toFile();
	    int size = (int) (realfile.length() / 1024L);
	    if(monitor != null) {
			this.monitor = SubMonitor.convert(monitor, size);
	    }
		this.afp = new AfpInputStream(new BufferedInputStream(new FileInputStream(realfile)));
	}
	
	@Override
	public void close() throws IOException {
		if(afp != null) {
			afp.close();
		}
		afp = null;
		super.close();
	}
	
	@Override
	public int read() throws IOException {
		if(current == null) {
			if(!next()) {
				return -1;
			}
			pointer = 0;
		}
		if(pointer >= current.length) {
			if(!next()) {
				return -1;
			}
			pointer = 0;
		}
		
		return current[pointer++] & 0xff;
	}
	
	private boolean next() throws IOException {
		
		if(monitor != null && monitor.isCanceled()) {
			return false;
		}
		
		int before = (int) (afp.getCurrentOffset() / 1024L);
		SF sf = afp.readStructuredField();
		if(sf == null) return false;
		
		int after = (int) (afp.getCurrentOffset() / 1024L);
		if(monitor != null && after > before) {
			monitor.worked(after - before);
		}
		this.currentText = sf.eClass().getName();
		currentText += sf.eClass().getEAllAttributes().stream()
		.filter(a -> !a.equals(BasePackage.eINSTANCE.getSF_Id()))
		.filter(a -> !a.equals(BasePackage.eINSTANCE.getSF_Charset()))
		.filter(a -> !a.equals(BasePackage.eINSTANCE.getSF_Length()))
		.filter(a -> !a.equals(BasePackage.eINSTANCE.getSF_Number()))
		.filter(a -> !a.equals(BasePackage.eINSTANCE.getSF_Offset()))
		.filter(a -> !a.equals(BasePackage.eINSTANCE.getSF_RawData()))
		.map(a -> attribute2Text(sf, a))
		.collect(Collectors.joining());

		currentText += rg2text(sf);

		currentText += triplets2text(sf);

		currentText += "\n";
		
		this.current = currentText.getBytes(charset);
		
		return true;
	}

	private String rg2text(EObject eobj) {
		@SuppressWarnings("unchecked")
		String text = eobj.eClass().getEAllContainments().stream()
		.filter(a -> a.getName().equalsIgnoreCase("rg") || a.getName().equalsIgnoreCase("FixedLengthRG"))
		.map(a -> (List<Triplet>) eobj.eGet(a))
		.flatMap(List::stream)
		.map(rg -> {
			String rgText = "\n.rg";
			rgText += rg.eClass().getEAllAttributes().stream()
			.filter(a -> !a.equals(BasePackage.eINSTANCE.getTriplet_Charset()))
			.filter(a -> !a.equals(BasePackage.eINSTANCE.getTriplet_FileOffset()))
			.filter(a -> !a.equals(BasePackage.eINSTANCE.getTriplet_Label()))
			.filter(a -> !a.equals(BasePackage.eINSTANCE.getTriplet_TripletId()))
			.filter(a -> !a.equals(BasePackage.eINSTANCE.getTriplet_TripletLength()))
			.filter(a -> !a.equals(BasePackage.eINSTANCE.getTriplet_TripletNumber()))
			.map(a -> attribute2Text(rg, a))
			.collect(Collectors.joining());
			
			rgText += triplets2text(rg);
			return rgText;
		})
		.collect(Collectors.joining());
				
		return text == null ? "" : text;
	}

	private String triplets2text(EObject eobj) {
		@SuppressWarnings("unchecked")
		String text = eobj.eClass().getEAllContainments().stream()
		.filter(a -> !a.getName().equalsIgnoreCase("rg") && !a.getName().equalsIgnoreCase("FixedLengthRG"))
		.map(a -> (List<Triplet>) eobj.eGet(a))
		.flatMap(List::stream)
		.map(t -> {
			String tripletText = "\n."+t.eClass().getName();
			tripletText += t.eClass().getEAllAttributes().stream()
			.filter(a -> !a.equals(BasePackage.eINSTANCE.getTriplet_Charset()))
			.filter(a -> !a.equals(BasePackage.eINSTANCE.getTriplet_FileOffset()))
			.filter(a -> !a.equals(BasePackage.eINSTANCE.getTriplet_Label()))
			.filter(a -> !a.equals(BasePackage.eINSTANCE.getTriplet_TripletId()))
			.filter(a -> !a.equals(BasePackage.eINSTANCE.getTriplet_TripletLength()))
			.filter(a -> !a.equals(BasePackage.eINSTANCE.getTriplet_TripletNumber()))
			.map(a -> attribute2Text(t, a))
			.collect(Collectors.joining());
			
			tripletText += rg2text(t);
			return tripletText;
		})
		.collect(Collectors.joining());
		return text == null ? "" : text;
	}

	private String attribute2Text(EObject eobj, EAttribute a) {
		Object value = eobj.eGet(a);
		if(value == null) return "";
		if(a.getEType().getInstanceClass().equals(String.class)) {
			value = "\""+((String)value)+"\"";
		}
		if(a.getEType().getInstanceClass().equals(byte[].class)) {
			value = "["+DatatypeConverter.printHexBinary((byte[]) value)+"]";
		}
		return " "+a.getName()+"="+value;
	}

}
