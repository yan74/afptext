/*
 * generated by Xtext 2.18.0.M3
 */
package org.afplib.ui;

import com.google.inject.Injector;
import org.afplib.afptext.ui.internal.AfptextActivator;
import org.eclipse.core.runtime.Platform;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class AfpTextExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return Platform.getBundle(AfptextActivator.PLUGIN_ID);
	}
	
	@Override
	protected Injector getInjector() {
		AfptextActivator activator = AfptextActivator.getInstance();
		return activator != null ? activator.getInjector(AfptextActivator.ORG_AFPLIB_AFPTEXT) : null;
	}

}
