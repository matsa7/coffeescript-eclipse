/*
 * generated by Xtext
 */
package csep.formatting;

import csep.services.CoffeeScriptGrammarAccess;

import org.eclipse.xtext.formatting.impl.AbstractDeclarativeFormatter;
import org.eclipse.xtext.formatting.impl.FormattingConfig;

/**
 * This class contains custom formatting description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation/latest/xtext.html#formatting
 * on how and when to use it 
 * 
 * Also see {@link org.eclipse.xtext.xtext.XtextFormattingTokenSerializer} as an example
 */
public class CoffeeScriptFormatter extends AbstractDeclarativeFormatter {
	
	@Override
	protected void configureFormatting(FormattingConfig c) {
		CoffeeScriptGrammarAccess g = (CoffeeScriptGrammarAccess)getGrammarAccess();
		/* 
		// Not working properly:
		 * 
		 */
		c.setIndentationIncrement().after(g.getAssignmentAccess().getOperatorEQUALTerminalRuleCall_0_0_0_1_0_0());
		c.setLinewrap().after(g.getAssignmentAccess().getOperatorEQUALTerminalRuleCall_0_0_0_1_0_0());
		c.setIndentationDecrement().after(g.getELSERule());
		c.setLinewrap().after(g.getELSERule());
		
// It's usually a good idea to activate the following three statements.
// They will add and preserve newlines around comments
//		c.setLinewrap(0, 1, 2).before(getGrammarAccess().getSL_COMMENTRule());
//		c.setLinewrap(0, 1, 2).before(getGrammarAccess().getML_COMMENTRule());
//		c.setLinewrap(0, 1, 1).after(getGrammarAccess().getML_COMMENTRule());
	}
}
