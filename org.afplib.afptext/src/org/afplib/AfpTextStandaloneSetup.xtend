/*
 * generated by Xtext 2.18.0.M3
 */
package org.afplib


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class AfpTextStandaloneSetup extends AfpTextStandaloneSetupGenerated {

	def static void doSetup() {
		new AfpTextStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
