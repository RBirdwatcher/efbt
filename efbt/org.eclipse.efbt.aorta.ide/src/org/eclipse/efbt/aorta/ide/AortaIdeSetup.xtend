/*
 * generated by Xtext 2.19.0
 */
package org.eclipse.efbt.aorta.ide

import com.google.inject.Guice
import org.eclipse.efbt.aorta.AortaRuntimeModule
import org.eclipse.efbt.aorta.AortaStandaloneSetup
import org.eclipse.xtext.util.Modules2

/**
 * Initialization support for running Xtext languages as language servers.
 */
class AortaIdeSetup extends AortaStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new AortaRuntimeModule, new AortaIdeModule))
	}
	
}