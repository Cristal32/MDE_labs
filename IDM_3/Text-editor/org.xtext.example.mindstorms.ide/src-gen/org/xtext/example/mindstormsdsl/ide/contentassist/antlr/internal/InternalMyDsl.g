/*
 * generated by Xtext 2.36.0
 */
grammar InternalMyDsl;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package org.xtext.example.mindstormsdsl.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package org.xtext.example.mindstormsdsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mindstormsdsl.services.MyDslGrammarAccess;

}
@parser::members {
	private MyDslGrammarAccess grammarAccess;

	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}

	@Override
	protected Grammar getGrammar() {
		return grammarAccess.getGrammar();
	}

	@Override
	protected String getValueForTokenName(String tokenName) {
		return tokenName;
	}
}

// Entry rule entryRuleChoreography
entryRuleChoreography
:
{ before(grammarAccess.getChoreographyRule()); }
	 ruleChoreography
{ after(grammarAccess.getChoreographyRule()); } 
	 EOF 
;

// Rule Choreography
ruleChoreography 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getChoreographyAccess().getGroup()); }
		(rule__Choreography__Group__0)
		{ after(grammarAccess.getChoreographyAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleInstruction
entryRuleInstruction
:
{ before(grammarAccess.getInstructionRule()); }
	 ruleInstruction
{ after(grammarAccess.getInstructionRule()); } 
	 EOF 
;

// Rule Instruction
ruleInstruction 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getInstructionAccess().getAlternatives()); }
		(rule__Instruction__Alternatives)
		{ after(grammarAccess.getInstructionAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEString
entryRuleEString
:
{ before(grammarAccess.getEStringRule()); }
	 ruleEString
{ after(grammarAccess.getEStringRule()); } 
	 EOF 
;

// Rule EString
ruleEString 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEStringAccess().getAlternatives()); }
		(rule__EString__Alternatives)
		{ after(grammarAccess.getEStringAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGrab
entryRuleGrab
:
{ before(grammarAccess.getGrabRule()); }
	 ruleGrab
{ after(grammarAccess.getGrabRule()); } 
	 EOF 
;

// Rule Grab
ruleGrab 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGrabAccess().getGroup()); }
		(rule__Grab__Group__0)
		{ after(grammarAccess.getGrabAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleRelease
entryRuleRelease
:
{ before(grammarAccess.getReleaseRule()); }
	 ruleRelease
{ after(grammarAccess.getReleaseRule()); } 
	 EOF 
;

// Rule Release
ruleRelease 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getReleaseAccess().getGroup()); }
		(rule__Release__Group__0)
		{ after(grammarAccess.getReleaseAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleRotate
entryRuleRotate
:
{ before(grammarAccess.getRotateRule()); }
	 ruleRotate
{ after(grammarAccess.getRotateRule()); } 
	 EOF 
;

// Rule Rotate
ruleRotate 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getRotateAccess().getGroup()); }
		(rule__Rotate__Group__0)
		{ after(grammarAccess.getRotateAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGoForward
entryRuleGoForward
:
{ before(grammarAccess.getGoForwardRule()); }
	 ruleGoForward
{ after(grammarAccess.getGoForwardRule()); } 
	 EOF 
;

// Rule GoForward
ruleGoForward 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGoForwardAccess().getGroup()); }
		(rule__GoForward__Group__0)
		{ after(grammarAccess.getGoForwardAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEInt
entryRuleEInt
:
{ before(grammarAccess.getEIntRule()); }
	 ruleEInt
{ after(grammarAccess.getEIntRule()); } 
	 EOF 
;

// Rule EInt
ruleEInt 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEIntAccess().getGroup()); }
		(rule__EInt__Group__0)
		{ after(grammarAccess.getEIntAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Instruction__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getInstructionAccess().getChoreographyParserRuleCall_0()); }
		ruleChoreography
		{ after(grammarAccess.getInstructionAccess().getChoreographyParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getInstructionAccess().getGrabParserRuleCall_1()); }
		ruleGrab
		{ after(grammarAccess.getInstructionAccess().getGrabParserRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getInstructionAccess().getReleaseParserRuleCall_2()); }
		ruleRelease
		{ after(grammarAccess.getInstructionAccess().getReleaseParserRuleCall_2()); }
	)
	|
	(
		{ before(grammarAccess.getInstructionAccess().getRotateParserRuleCall_3()); }
		ruleRotate
		{ after(grammarAccess.getInstructionAccess().getRotateParserRuleCall_3()); }
	)
	|
	(
		{ before(grammarAccess.getInstructionAccess().getGoForwardParserRuleCall_4()); }
		ruleGoForward
		{ after(grammarAccess.getInstructionAccess().getGoForwardParserRuleCall_4()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EString__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); }
		RULE_STRING
		{ after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); }
		RULE_ID
		{ after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Choreography__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Choreography__Group__0__Impl
	rule__Choreography__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Choreography__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getChoreographyAccess().getChoreographyAction_0()); }
	()
	{ after(grammarAccess.getChoreographyAccess().getChoreographyAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Choreography__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Choreography__Group__1__Impl
	rule__Choreography__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Choreography__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getChoreographyAccess().getChoreographyKeyword_1()); }
	'Choreography'
	{ after(grammarAccess.getChoreographyAccess().getChoreographyKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Choreography__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Choreography__Group__2__Impl
	rule__Choreography__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Choreography__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getChoreographyAccess().getNameAssignment_2()); }
	(rule__Choreography__NameAssignment_2)
	{ after(grammarAccess.getChoreographyAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Choreography__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Choreography__Group__3__Impl
	rule__Choreography__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Choreography__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getChoreographyAccess().getLeftCurlyBracketKeyword_3()); }
	'{'
	{ after(grammarAccess.getChoreographyAccess().getLeftCurlyBracketKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Choreography__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Choreography__Group__4__Impl
	rule__Choreography__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Choreography__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getChoreographyAccess().getGroup_4()); }
	(rule__Choreography__Group_4__0)?
	{ after(grammarAccess.getChoreographyAccess().getGroup_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Choreography__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Choreography__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Choreography__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getChoreographyAccess().getRightCurlyBracketKeyword_5()); }
	'}'
	{ after(grammarAccess.getChoreographyAccess().getRightCurlyBracketKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Choreography__Group_4__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Choreography__Group_4__0__Impl
	rule__Choreography__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Choreography__Group_4__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getChoreographyAccess().getInstructionsKeyword_4_0()); }
	'instructions'
	{ after(grammarAccess.getChoreographyAccess().getInstructionsKeyword_4_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Choreography__Group_4__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Choreography__Group_4__1__Impl
	rule__Choreography__Group_4__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Choreography__Group_4__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getChoreographyAccess().getLeftCurlyBracketKeyword_4_1()); }
	'{'
	{ after(grammarAccess.getChoreographyAccess().getLeftCurlyBracketKeyword_4_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Choreography__Group_4__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Choreography__Group_4__2__Impl
	rule__Choreography__Group_4__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Choreography__Group_4__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getChoreographyAccess().getInstructionsAssignment_4_2()); }
	(rule__Choreography__InstructionsAssignment_4_2)
	{ after(grammarAccess.getChoreographyAccess().getInstructionsAssignment_4_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Choreography__Group_4__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Choreography__Group_4__3__Impl
	rule__Choreography__Group_4__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Choreography__Group_4__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getChoreographyAccess().getGroup_4_3()); }
	(rule__Choreography__Group_4_3__0)*
	{ after(grammarAccess.getChoreographyAccess().getGroup_4_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Choreography__Group_4__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Choreography__Group_4__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Choreography__Group_4__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getChoreographyAccess().getRightCurlyBracketKeyword_4_4()); }
	'}'
	{ after(grammarAccess.getChoreographyAccess().getRightCurlyBracketKeyword_4_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Choreography__Group_4_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Choreography__Group_4_3__0__Impl
	rule__Choreography__Group_4_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Choreography__Group_4_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getChoreographyAccess().getCommaKeyword_4_3_0()); }
	','
	{ after(grammarAccess.getChoreographyAccess().getCommaKeyword_4_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Choreography__Group_4_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Choreography__Group_4_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Choreography__Group_4_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getChoreographyAccess().getInstructionsAssignment_4_3_1()); }
	(rule__Choreography__InstructionsAssignment_4_3_1)
	{ after(grammarAccess.getChoreographyAccess().getInstructionsAssignment_4_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Grab__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Grab__Group__0__Impl
	rule__Grab__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Grab__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGrabAccess().getGrabAction_0()); }
	()
	{ after(grammarAccess.getGrabAccess().getGrabAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Grab__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Grab__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Grab__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGrabAccess().getGrabKeyword_1()); }
	'Grab'
	{ after(grammarAccess.getGrabAccess().getGrabKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Release__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Release__Group__0__Impl
	rule__Release__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Release__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getReleaseAccess().getReleaseAction_0()); }
	()
	{ after(grammarAccess.getReleaseAccess().getReleaseAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Release__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Release__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Release__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getReleaseAccess().getReleaseKeyword_1()); }
	'Release'
	{ after(grammarAccess.getReleaseAccess().getReleaseKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Rotate__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Rotate__Group__0__Impl
	rule__Rotate__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Rotate__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRotateAccess().getRotateAction_0()); }
	()
	{ after(grammarAccess.getRotateAccess().getRotateAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Rotate__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Rotate__Group__1__Impl
	rule__Rotate__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Rotate__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRotateAccess().getRandomAssignment_1()); }
	(rule__Rotate__RandomAssignment_1)?
	{ after(grammarAccess.getRotateAccess().getRandomAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Rotate__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Rotate__Group__2__Impl
	rule__Rotate__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Rotate__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRotateAccess().getRotateKeyword_2()); }
	'Rotate'
	{ after(grammarAccess.getRotateAccess().getRotateKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Rotate__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Rotate__Group__3__Impl
	rule__Rotate__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Rotate__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRotateAccess().getLeftCurlyBracketKeyword_3()); }
	'{'
	{ after(grammarAccess.getRotateAccess().getLeftCurlyBracketKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Rotate__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Rotate__Group__4__Impl
	rule__Rotate__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Rotate__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRotateAccess().getGroup_4()); }
	(rule__Rotate__Group_4__0)?
	{ after(grammarAccess.getRotateAccess().getGroup_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Rotate__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Rotate__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Rotate__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRotateAccess().getRightCurlyBracketKeyword_5()); }
	'}'
	{ after(grammarAccess.getRotateAccess().getRightCurlyBracketKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Rotate__Group_4__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Rotate__Group_4__0__Impl
	rule__Rotate__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Rotate__Group_4__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRotateAccess().getDegreesKeyword_4_0()); }
	'degrees'
	{ after(grammarAccess.getRotateAccess().getDegreesKeyword_4_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Rotate__Group_4__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Rotate__Group_4__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Rotate__Group_4__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRotateAccess().getDegreesAssignment_4_1()); }
	(rule__Rotate__DegreesAssignment_4_1)
	{ after(grammarAccess.getRotateAccess().getDegreesAssignment_4_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GoForward__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GoForward__Group__0__Impl
	rule__GoForward__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GoForward__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGoForwardAccess().getGoForwardAction_0()); }
	()
	{ after(grammarAccess.getGoForwardAccess().getGoForwardAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GoForward__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GoForward__Group__1__Impl
	rule__GoForward__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GoForward__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGoForwardAccess().getGoForwardKeyword_1()); }
	'GoForward'
	{ after(grammarAccess.getGoForwardAccess().getGoForwardKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GoForward__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GoForward__Group__2__Impl
	rule__GoForward__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GoForward__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGoForwardAccess().getLeftCurlyBracketKeyword_2()); }
	'{'
	{ after(grammarAccess.getGoForwardAccess().getLeftCurlyBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GoForward__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GoForward__Group__3__Impl
	rule__GoForward__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GoForward__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGoForwardAccess().getGroup_3()); }
	(rule__GoForward__Group_3__0)?
	{ after(grammarAccess.getGoForwardAccess().getGroup_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GoForward__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GoForward__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GoForward__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGoForwardAccess().getRightCurlyBracketKeyword_4()); }
	'}'
	{ after(grammarAccess.getGoForwardAccess().getRightCurlyBracketKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GoForward__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GoForward__Group_3__0__Impl
	rule__GoForward__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GoForward__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGoForwardAccess().getCmKeyword_3_0()); }
	'cm'
	{ after(grammarAccess.getGoForwardAccess().getCmKeyword_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GoForward__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GoForward__Group_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GoForward__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGoForwardAccess().getCmAssignment_3_1()); }
	(rule__GoForward__CmAssignment_3_1)
	{ after(grammarAccess.getGoForwardAccess().getCmAssignment_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__EInt__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EInt__Group__0__Impl
	rule__EInt__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__EInt__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); }
	('-')?
	{ after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EInt__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EInt__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__EInt__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); }
	RULE_INT
	{ after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Choreography__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getChoreographyAccess().getNameEStringParserRuleCall_2_0()); }
		ruleEString
		{ after(grammarAccess.getChoreographyAccess().getNameEStringParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Choreography__InstructionsAssignment_4_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getChoreographyAccess().getInstructionsInstructionParserRuleCall_4_2_0()); }
		ruleInstruction
		{ after(grammarAccess.getChoreographyAccess().getInstructionsInstructionParserRuleCall_4_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Choreography__InstructionsAssignment_4_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getChoreographyAccess().getInstructionsInstructionParserRuleCall_4_3_1_0()); }
		ruleInstruction
		{ after(grammarAccess.getChoreographyAccess().getInstructionsInstructionParserRuleCall_4_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Rotate__RandomAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRotateAccess().getRandomRandomKeyword_1_0()); }
		(
			{ before(grammarAccess.getRotateAccess().getRandomRandomKeyword_1_0()); }
			'random'
			{ after(grammarAccess.getRotateAccess().getRandomRandomKeyword_1_0()); }
		)
		{ after(grammarAccess.getRotateAccess().getRandomRandomKeyword_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Rotate__DegreesAssignment_4_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRotateAccess().getDegreesEIntParserRuleCall_4_1_0()); }
		ruleEInt
		{ after(grammarAccess.getRotateAccess().getDegreesEIntParserRuleCall_4_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GoForward__CmAssignment_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGoForwardAccess().getCmEIntParserRuleCall_3_1_0()); }
		ruleEInt
		{ after(grammarAccess.getGoForwardAccess().getCmEIntParserRuleCall_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;