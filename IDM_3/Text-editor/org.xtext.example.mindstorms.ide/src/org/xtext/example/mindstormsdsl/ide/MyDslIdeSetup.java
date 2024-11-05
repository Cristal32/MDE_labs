/*
 * generated by Xtext 2.36.0
 */
package org.xtext.example.mindstormsdsl.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import org.xtext.example.mindstormsdsl.MyDslRuntimeModule;
import org.xtext.example.mindstormsdsl.MyDslStandaloneSetup;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class MyDslIdeSetup extends MyDslStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new MyDslRuntimeModule(), new MyDslIdeModule()));
	}
	
}
