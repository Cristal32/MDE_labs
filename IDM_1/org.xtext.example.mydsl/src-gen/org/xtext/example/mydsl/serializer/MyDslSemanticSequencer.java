/*
 * generated by Xtext 2.36.0
 */
package org.xtext.example.mydsl.serializer;

import SQL.Column;
import SQL.DB;
import SQL.SQLPackage;
import SQL.Table;
import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;

@SuppressWarnings("all")
public class MyDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private MyDslGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == SQLPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case SQLPackage.COLUMN:
				sequence_Column(context, (Column) semanticObject); 
				return; 
			case SQLPackage.DB:
				sequence_DB(context, (DB) semanticObject); 
				return; 
			case SQLPackage.TABLE:
				sequence_Table(context, (Table) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * <pre>
	 * Contexts:
	 *     Column returns Column
	 *
	 * Constraint:
	 *     (name=EString type=EString?)
	 * </pre>
	 */
	protected void sequence_Column(ISerializationContext context, Column semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     DB returns DB
	 *
	 * Constraint:
	 *     (name=EString (tables+=Table tables+=Table*)?)
	 * </pre>
	 */
	protected void sequence_DB(ISerializationContext context, DB semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Table returns Table
	 *
	 * Constraint:
	 *     (name=EString (columns+=Column columns+=Column*)?)
	 * </pre>
	 */
	protected void sequence_Table(ISerializationContext context, Table semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
