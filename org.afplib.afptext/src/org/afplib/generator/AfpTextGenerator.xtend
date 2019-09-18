/*
 * generated by Xtext 2.18.0.M3
 */
package org.afplib.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.afplib.afpText.structuredField
import java.io.ByteArrayInputStream

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class AfpTextGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
			
			val afpfile = resource.URI.lastSegment.replace(".afptext", ".afp")

			val text2Afp = new Text2AFP()

			for(sf : resource.allContents.toIterable.filter(typeof(structuredField))) {
				text2Afp.add(sf)
			}
			val stream = new ByteArrayInputStream(text2Afp.get())
			fsa.generateFile(afpfile, stream)
			
//		fsa.generateFile('greetings.txt', 'People to greet: ' + 
//			resource.allContents
//				.filter(Greeting)
//				.map[name]
//				.join(', '))
	}
}
