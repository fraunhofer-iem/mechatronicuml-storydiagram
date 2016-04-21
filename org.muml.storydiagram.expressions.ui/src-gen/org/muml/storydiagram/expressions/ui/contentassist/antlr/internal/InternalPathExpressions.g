/*
 * generated by Xtext
 */
grammar InternalPathExpressions;

options {
	superClass=AbstractInternalContentAssistParser;
	
}

@lexer::header {
package org.muml.storydiagram.expressions.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package org.muml.storydiagram.expressions.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.muml.storydiagram.expressions.services.PathExpressionsGrammarAccess;

}

@parser::members {
 
 	private PathExpressionsGrammarAccess grammarAccess;
 	
    public void setGrammarAccess(PathExpressionsGrammarAccess grammarAccess) {
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




// Entry rule entryRulePathExpression
entryRulePathExpression 
:
{ before(grammarAccess.getPathExpressionRule()); }
	 rulePathExpression
{ after(grammarAccess.getPathExpressionRule()); } 
	 EOF 
;

// Rule PathExpression
rulePathExpression
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getPathExpressionAccess().getAlternatives()); }
(rule__PathExpression__Alternatives)
{ after(grammarAccess.getPathExpressionAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRulePath
entryRulePath 
:
{ before(grammarAccess.getPathRule()); }
	 rulePath
{ after(grammarAccess.getPathRule()); } 
	 EOF 
;

// Rule Path
rulePath
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getPathAccess().getGroup()); }
(rule__Path__Group__0)
{ after(grammarAccess.getPathAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRulePathSegment
entryRulePathSegment 
:
{ before(grammarAccess.getPathSegmentRule()); }
	 rulePathSegment
{ after(grammarAccess.getPathSegmentRule()); } 
	 EOF 
;

// Rule PathSegment
rulePathSegment
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getPathSegmentAccess().getGroup()); }
(rule__PathSegment__Group__0)
{ after(grammarAccess.getPathSegmentAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRulePathSegmentDescription
entryRulePathSegmentDescription 
:
{ before(grammarAccess.getPathSegmentDescriptionRule()); }
	 rulePathSegmentDescription
{ after(grammarAccess.getPathSegmentDescriptionRule()); } 
	 EOF 
;

// Rule PathSegmentDescription
rulePathSegmentDescription
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getPathSegmentDescriptionAccess().getGroup()); }
(rule__PathSegmentDescription__Group__0)
{ after(grammarAccess.getPathSegmentDescriptionAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleRestrictionList
entryRuleRestrictionList 
:
{ before(grammarAccess.getRestrictionListRule()); }
	 ruleRestrictionList
{ after(grammarAccess.getRestrictionListRule()); } 
	 EOF 
;

// Rule RestrictionList
ruleRestrictionList
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getRestrictionListAccess().getGroup()); }
(rule__RestrictionList__Group__0)
{ after(grammarAccess.getRestrictionListAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleImplicitPathDescription
entryRuleImplicitPathDescription 
:
{ before(grammarAccess.getImplicitPathDescriptionRule()); }
	 ruleImplicitPathDescription
{ after(grammarAccess.getImplicitPathDescriptionRule()); } 
	 EOF 
;

// Rule ImplicitPathDescription
ruleImplicitPathDescription
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getImplicitPathDescriptionAccess().getKindAssignment()); }
(rule__ImplicitPathDescription__KindAssignment)
{ after(grammarAccess.getImplicitPathDescriptionAccess().getKindAssignment()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleExplicitPathDescription
entryRuleExplicitPathDescription 
:
{ before(grammarAccess.getExplicitPathDescriptionRule()); }
	 ruleExplicitPathDescription
{ after(grammarAccess.getExplicitPathDescriptionRule()); } 
	 EOF 
;

// Rule ExplicitPathDescription
ruleExplicitPathDescription
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getExplicitPathDescriptionAccess().getAssociationNameAssignment()); }
(rule__ExplicitPathDescription__AssociationNameAssignment)
{ after(grammarAccess.getExplicitPathDescriptionAccess().getAssociationNameAssignment()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleTypeRestriction
entryRuleTypeRestriction 
:
{ before(grammarAccess.getTypeRestrictionRule()); }
	 ruleTypeRestriction
{ after(grammarAccess.getTypeRestrictionRule()); } 
	 EOF 
;

// Rule TypeRestriction
ruleTypeRestriction
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getTypeRestrictionAccess().getGroup()); }
(rule__TypeRestriction__Group__0)
{ after(grammarAccess.getTypeRestrictionAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}




// Rule RepeatOperator
ruleRepeatOperator
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRepeatOperatorAccess().getAlternatives()); }
(rule__RepeatOperator__Alternatives)
{ after(grammarAccess.getRepeatOperatorAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Rule ImplicitPathKind
ruleImplicitPathKind
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getImplicitPathKindAccess().getAlternatives()); }
(rule__ImplicitPathKind__Alternatives)
{ after(grammarAccess.getImplicitPathKindAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



rule__PathExpression__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPathExpressionAccess().getPathAlternativesAssignment_0()); }
(rule__PathExpression__PathAlternativesAssignment_0)
{ after(grammarAccess.getPathExpressionAccess().getPathAlternativesAssignment_0()); }
)

    |(
{ before(grammarAccess.getPathExpressionAccess().getGroup_1()); }
(rule__PathExpression__Group_1__0)
{ after(grammarAccess.getPathExpressionAccess().getGroup_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__PathSegment__Alternatives_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPathSegmentAccess().getAlternativesAssignment_0_0()); }
(rule__PathSegment__AlternativesAssignment_0_0)
{ after(grammarAccess.getPathSegmentAccess().getAlternativesAssignment_0_0()); }
)

    |(
{ before(grammarAccess.getPathSegmentAccess().getGroup_0_1()); }
(rule__PathSegment__Group_0_1__0)
{ after(grammarAccess.getPathSegmentAccess().getGroup_0_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__PathSegmentDescription__Alternatives_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPathSegmentDescriptionAccess().getImplicitPathDescriptionParserRuleCall_0_0()); }
	ruleImplicitPathDescription
{ after(grammarAccess.getPathSegmentDescriptionAccess().getImplicitPathDescriptionParserRuleCall_0_0()); }
)

    |(
{ before(grammarAccess.getPathSegmentDescriptionAccess().getExplicitPathDescriptionParserRuleCall_0_1()); }
	ruleExplicitPathDescription
{ after(grammarAccess.getPathSegmentDescriptionAccess().getExplicitPathDescriptionParserRuleCall_0_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__RepeatOperator__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRepeatOperatorAccess().getNO_REPEATEnumLiteralDeclaration_0()); }
(	'NO_REPEAT' 
)
{ after(grammarAccess.getRepeatOperatorAccess().getNO_REPEATEnumLiteralDeclaration_0()); }
)

    |(
{ before(grammarAccess.getRepeatOperatorAccess().getAT_LEAST_ONCEEnumLiteralDeclaration_1()); }
(	'+' 
)
{ after(grammarAccess.getRepeatOperatorAccess().getAT_LEAST_ONCEEnumLiteralDeclaration_1()); }
)

    |(
{ before(grammarAccess.getRepeatOperatorAccess().getARBITRARYEnumLiteralDeclaration_2()); }
(	'*' 
)
{ after(grammarAccess.getRepeatOperatorAccess().getARBITRARYEnumLiteralDeclaration_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ImplicitPathKind__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getImplicitPathKindAccess().getANYEnumLiteralDeclaration_0()); }
(	'-->' 
)
{ after(grammarAccess.getImplicitPathKindAccess().getANYEnumLiteralDeclaration_0()); }
)

    |(
{ before(grammarAccess.getImplicitPathKindAccess().getCONTAINMENT_SOURCEEnumLiteralDeclaration_1()); }
(	'<>-->' 
)
{ after(grammarAccess.getImplicitPathKindAccess().getCONTAINMENT_SOURCEEnumLiteralDeclaration_1()); }
)

    |(
{ before(grammarAccess.getImplicitPathKindAccess().getCONTAINMENT_TARGETEnumLiteralDeclaration_2()); }
(	'--><>' 
)
{ after(grammarAccess.getImplicitPathKindAccess().getCONTAINMENT_TARGETEnumLiteralDeclaration_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}



rule__PathExpression__Group_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__PathExpression__Group_1__0__Impl
	rule__PathExpression__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__PathExpression__Group_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPathExpressionAccess().getLeftParenthesisKeyword_1_0()); }

	'(' 

{ after(grammarAccess.getPathExpressionAccess().getLeftParenthesisKeyword_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__PathExpression__Group_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__PathExpression__Group_1__1__Impl
	rule__PathExpression__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__PathExpression__Group_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPathExpressionAccess().getPathAlternativesAssignment_1_1()); }
(rule__PathExpression__PathAlternativesAssignment_1_1)
{ after(grammarAccess.getPathExpressionAccess().getPathAlternativesAssignment_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__PathExpression__Group_1__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__PathExpression__Group_1__2__Impl
	rule__PathExpression__Group_1__3
;
finally {
	restoreStackSize(stackSize);
}

rule__PathExpression__Group_1__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPathExpressionAccess().getRightParenthesisKeyword_1_2()); }

	')' 

{ after(grammarAccess.getPathExpressionAccess().getRightParenthesisKeyword_1_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__PathExpression__Group_1__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__PathExpression__Group_1__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__PathExpression__Group_1__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getPathExpressionAccess().getGroup_1_3()); }
(rule__PathExpression__Group_1_3__0)
{ after(grammarAccess.getPathExpressionAccess().getGroup_1_3()); }
)
(
{ before(grammarAccess.getPathExpressionAccess().getGroup_1_3()); }
(rule__PathExpression__Group_1_3__0)*
{ after(grammarAccess.getPathExpressionAccess().getGroup_1_3()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}










rule__PathExpression__Group_1_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__PathExpression__Group_1_3__0__Impl
	rule__PathExpression__Group_1_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__PathExpression__Group_1_3__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPathExpressionAccess().getVerticalLineKeyword_1_3_0()); }

	'|' 

{ after(grammarAccess.getPathExpressionAccess().getVerticalLineKeyword_1_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__PathExpression__Group_1_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__PathExpression__Group_1_3__1__Impl
	rule__PathExpression__Group_1_3__2
;
finally {
	restoreStackSize(stackSize);
}

rule__PathExpression__Group_1_3__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPathExpressionAccess().getLeftParenthesisKeyword_1_3_1()); }

	'(' 

{ after(grammarAccess.getPathExpressionAccess().getLeftParenthesisKeyword_1_3_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__PathExpression__Group_1_3__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__PathExpression__Group_1_3__2__Impl
	rule__PathExpression__Group_1_3__3
;
finally {
	restoreStackSize(stackSize);
}

rule__PathExpression__Group_1_3__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPathExpressionAccess().getPathAlternativesAssignment_1_3_2()); }
(rule__PathExpression__PathAlternativesAssignment_1_3_2)
{ after(grammarAccess.getPathExpressionAccess().getPathAlternativesAssignment_1_3_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__PathExpression__Group_1_3__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__PathExpression__Group_1_3__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__PathExpression__Group_1_3__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPathExpressionAccess().getRightParenthesisKeyword_1_3_3()); }

	')' 

{ after(grammarAccess.getPathExpressionAccess().getRightParenthesisKeyword_1_3_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__Path__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Path__Group__0__Impl
	rule__Path__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Path__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPathAccess().getSegmentsAssignment_0()); }
(rule__Path__SegmentsAssignment_0)
{ after(grammarAccess.getPathAccess().getSegmentsAssignment_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Path__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Path__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Path__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPathAccess().getGroup_1()); }
(rule__Path__Group_1__0)*
{ after(grammarAccess.getPathAccess().getGroup_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Path__Group_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Path__Group_1__0__Impl
	rule__Path__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Path__Group_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPathAccess().getFullStopKeyword_1_0()); }

	'.' 

{ after(grammarAccess.getPathAccess().getFullStopKeyword_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Path__Group_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Path__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Path__Group_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPathAccess().getSegmentsAssignment_1_1()); }
(rule__Path__SegmentsAssignment_1_1)
{ after(grammarAccess.getPathAccess().getSegmentsAssignment_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__PathSegment__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__PathSegment__Group__0__Impl
	rule__PathSegment__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__PathSegment__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPathSegmentAccess().getAlternatives_0()); }
(rule__PathSegment__Alternatives_0)
{ after(grammarAccess.getPathSegmentAccess().getAlternatives_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__PathSegment__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__PathSegment__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__PathSegment__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPathSegmentAccess().getRepeatOperatorAssignment_1()); }
(rule__PathSegment__RepeatOperatorAssignment_1)?
{ after(grammarAccess.getPathSegmentAccess().getRepeatOperatorAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__PathSegment__Group_0_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__PathSegment__Group_0_1__0__Impl
	rule__PathSegment__Group_0_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__PathSegment__Group_0_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPathSegmentAccess().getLeftParenthesisKeyword_0_1_0()); }

	'(' 

{ after(grammarAccess.getPathSegmentAccess().getLeftParenthesisKeyword_0_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__PathSegment__Group_0_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__PathSegment__Group_0_1__1__Impl
	rule__PathSegment__Group_0_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__PathSegment__Group_0_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPathSegmentAccess().getAlternativesAssignment_0_1_1()); }
(rule__PathSegment__AlternativesAssignment_0_1_1)
{ after(grammarAccess.getPathSegmentAccess().getAlternativesAssignment_0_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__PathSegment__Group_0_1__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__PathSegment__Group_0_1__2__Impl
	rule__PathSegment__Group_0_1__3
;
finally {
	restoreStackSize(stackSize);
}

rule__PathSegment__Group_0_1__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getPathSegmentAccess().getGroup_0_1_2()); }
(rule__PathSegment__Group_0_1_2__0)
{ after(grammarAccess.getPathSegmentAccess().getGroup_0_1_2()); }
)
(
{ before(grammarAccess.getPathSegmentAccess().getGroup_0_1_2()); }
(rule__PathSegment__Group_0_1_2__0)*
{ after(grammarAccess.getPathSegmentAccess().getGroup_0_1_2()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}


rule__PathSegment__Group_0_1__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__PathSegment__Group_0_1__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__PathSegment__Group_0_1__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPathSegmentAccess().getRightParenthesisKeyword_0_1_3()); }

	')' 

{ after(grammarAccess.getPathSegmentAccess().getRightParenthesisKeyword_0_1_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__PathSegment__Group_0_1_2__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__PathSegment__Group_0_1_2__0__Impl
	rule__PathSegment__Group_0_1_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__PathSegment__Group_0_1_2__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPathSegmentAccess().getVerticalLineKeyword_0_1_2_0()); }

	'|' 

{ after(grammarAccess.getPathSegmentAccess().getVerticalLineKeyword_0_1_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__PathSegment__Group_0_1_2__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__PathSegment__Group_0_1_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__PathSegment__Group_0_1_2__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPathSegmentAccess().getAlternativesAssignment_0_1_2_1()); }
(rule__PathSegment__AlternativesAssignment_0_1_2_1)
{ after(grammarAccess.getPathSegmentAccess().getAlternativesAssignment_0_1_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__PathSegmentDescription__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__PathSegmentDescription__Group__0__Impl
	rule__PathSegmentDescription__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__PathSegmentDescription__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPathSegmentDescriptionAccess().getAlternatives_0()); }
(rule__PathSegmentDescription__Alternatives_0)
{ after(grammarAccess.getPathSegmentDescriptionAccess().getAlternatives_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__PathSegmentDescription__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__PathSegmentDescription__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__PathSegmentDescription__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPathSegmentDescriptionAccess().getRestrictionListAssignment_1()); }
(rule__PathSegmentDescription__RestrictionListAssignment_1)?
{ after(grammarAccess.getPathSegmentDescriptionAccess().getRestrictionListAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__RestrictionList__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__RestrictionList__Group__0__Impl
	rule__RestrictionList__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__RestrictionList__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRestrictionListAccess().getLeftSquareBracketKeyword_0()); }

	'[' 

{ after(grammarAccess.getRestrictionListAccess().getLeftSquareBracketKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__RestrictionList__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__RestrictionList__Group__1__Impl
	rule__RestrictionList__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__RestrictionList__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRestrictionListAccess().getRestrictionsAssignment_1()); }
(rule__RestrictionList__RestrictionsAssignment_1)
{ after(grammarAccess.getRestrictionListAccess().getRestrictionsAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__RestrictionList__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__RestrictionList__Group__2__Impl
	rule__RestrictionList__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__RestrictionList__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRestrictionListAccess().getGroup_2()); }
(rule__RestrictionList__Group_2__0)*
{ after(grammarAccess.getRestrictionListAccess().getGroup_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__RestrictionList__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__RestrictionList__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__RestrictionList__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRestrictionListAccess().getRightSquareBracketKeyword_3()); }

	']' 

{ after(grammarAccess.getRestrictionListAccess().getRightSquareBracketKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__RestrictionList__Group_2__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__RestrictionList__Group_2__0__Impl
	rule__RestrictionList__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__RestrictionList__Group_2__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRestrictionListAccess().getCommaKeyword_2_0()); }

	',' 

{ after(grammarAccess.getRestrictionListAccess().getCommaKeyword_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__RestrictionList__Group_2__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__RestrictionList__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__RestrictionList__Group_2__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRestrictionListAccess().getRestrictionsAssignment_2_1()); }
(rule__RestrictionList__RestrictionsAssignment_2_1)
{ after(grammarAccess.getRestrictionListAccess().getRestrictionsAssignment_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__TypeRestriction__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__TypeRestriction__Group__0__Impl
	rule__TypeRestriction__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeRestriction__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTypeRestrictionAccess().getForbiddenAssignment_0()); }
(rule__TypeRestriction__ForbiddenAssignment_0)?
{ after(grammarAccess.getTypeRestrictionAccess().getForbiddenAssignment_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__TypeRestriction__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__TypeRestriction__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeRestriction__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTypeRestrictionAccess().getTypeNameAssignment_1()); }
(rule__TypeRestriction__TypeNameAssignment_1)
{ after(grammarAccess.getTypeRestrictionAccess().getTypeNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}







rule__PathExpression__PathAlternativesAssignment_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPathExpressionAccess().getPathAlternativesPathParserRuleCall_0_0()); }
	rulePath{ after(grammarAccess.getPathExpressionAccess().getPathAlternativesPathParserRuleCall_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__PathExpression__PathAlternativesAssignment_1_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPathExpressionAccess().getPathAlternativesPathParserRuleCall_1_1_0()); }
	rulePath{ after(grammarAccess.getPathExpressionAccess().getPathAlternativesPathParserRuleCall_1_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__PathExpression__PathAlternativesAssignment_1_3_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPathExpressionAccess().getPathAlternativesPathParserRuleCall_1_3_2_0()); }
	rulePath{ after(grammarAccess.getPathExpressionAccess().getPathAlternativesPathParserRuleCall_1_3_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Path__SegmentsAssignment_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPathAccess().getSegmentsPathSegmentParserRuleCall_0_0()); }
	rulePathSegment{ after(grammarAccess.getPathAccess().getSegmentsPathSegmentParserRuleCall_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Path__SegmentsAssignment_1_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPathAccess().getSegmentsPathSegmentParserRuleCall_1_1_0()); }
	rulePathSegment{ after(grammarAccess.getPathAccess().getSegmentsPathSegmentParserRuleCall_1_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__PathSegment__AlternativesAssignment_0_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPathSegmentAccess().getAlternativesPathSegmentDescriptionParserRuleCall_0_0_0()); }
	rulePathSegmentDescription{ after(grammarAccess.getPathSegmentAccess().getAlternativesPathSegmentDescriptionParserRuleCall_0_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__PathSegment__AlternativesAssignment_0_1_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPathSegmentAccess().getAlternativesPathSegmentDescriptionParserRuleCall_0_1_1_0()); }
	rulePathSegmentDescription{ after(grammarAccess.getPathSegmentAccess().getAlternativesPathSegmentDescriptionParserRuleCall_0_1_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__PathSegment__AlternativesAssignment_0_1_2_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPathSegmentAccess().getAlternativesPathSegmentDescriptionParserRuleCall_0_1_2_1_0()); }
	rulePathSegmentDescription{ after(grammarAccess.getPathSegmentAccess().getAlternativesPathSegmentDescriptionParserRuleCall_0_1_2_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__PathSegment__RepeatOperatorAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPathSegmentAccess().getRepeatOperatorRepeatOperatorEnumRuleCall_1_0()); }
	ruleRepeatOperator{ after(grammarAccess.getPathSegmentAccess().getRepeatOperatorRepeatOperatorEnumRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__PathSegmentDescription__RestrictionListAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPathSegmentDescriptionAccess().getRestrictionListRestrictionListParserRuleCall_1_0()); }
	ruleRestrictionList{ after(grammarAccess.getPathSegmentDescriptionAccess().getRestrictionListRestrictionListParserRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__RestrictionList__RestrictionsAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRestrictionListAccess().getRestrictionsTypeRestrictionParserRuleCall_1_0()); }
	ruleTypeRestriction{ after(grammarAccess.getRestrictionListAccess().getRestrictionsTypeRestrictionParserRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__RestrictionList__RestrictionsAssignment_2_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRestrictionListAccess().getRestrictionsTypeRestrictionParserRuleCall_2_1_0()); }
	ruleTypeRestriction{ after(grammarAccess.getRestrictionListAccess().getRestrictionsTypeRestrictionParserRuleCall_2_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ImplicitPathDescription__KindAssignment
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getImplicitPathDescriptionAccess().getKindImplicitPathKindEnumRuleCall_0()); }
	ruleImplicitPathKind{ after(grammarAccess.getImplicitPathDescriptionAccess().getKindImplicitPathKindEnumRuleCall_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ExplicitPathDescription__AssociationNameAssignment
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getExplicitPathDescriptionAccess().getAssociationNameIDTerminalRuleCall_0()); }
	RULE_ID{ after(grammarAccess.getExplicitPathDescriptionAccess().getAssociationNameIDTerminalRuleCall_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__TypeRestriction__ForbiddenAssignment_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTypeRestrictionAccess().getForbiddenExclamationMarkKeyword_0_0()); }
(
{ before(grammarAccess.getTypeRestrictionAccess().getForbiddenExclamationMarkKeyword_0_0()); }

	'!' 

{ after(grammarAccess.getTypeRestrictionAccess().getForbiddenExclamationMarkKeyword_0_0()); }
)

{ after(grammarAccess.getTypeRestrictionAccess().getForbiddenExclamationMarkKeyword_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__TypeRestriction__TypeNameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTypeRestrictionAccess().getTypeNameIDTerminalRuleCall_1_0()); }
	RULE_ID{ after(grammarAccess.getTypeRestrictionAccess().getTypeNameIDTerminalRuleCall_1_0()); }
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


