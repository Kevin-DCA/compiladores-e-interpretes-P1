// Generated from C:/Users/kevin/Documents/repositorios/compiladores-e-interpretes-P1\Miparcer.g4 by ANTLR 4.7.2
package generated;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Miparcer}.
 */
public interface MiparcerListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Miparcer#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(Miparcer.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link Miparcer#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(Miparcer.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link Miparcer#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(Miparcer.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link Miparcer#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(Miparcer.CommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link Miparcer#singleCommand}.
	 * @param ctx the parse tree
	 */
	void enterSingleCommand(Miparcer.SingleCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link Miparcer#singleCommand}.
	 * @param ctx the parse tree
	 */
	void exitSingleCommand(Miparcer.SingleCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link Miparcer#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(Miparcer.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Miparcer#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(Miparcer.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Miparcer#singleDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterSingleDeclaration(Miparcer.SingleDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Miparcer#singleDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitSingleDeclaration(Miparcer.SingleDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Miparcer#typedenoter}.
	 * @param ctx the parse tree
	 */
	void enterTypedenoter(Miparcer.TypedenoterContext ctx);
	/**
	 * Exit a parse tree produced by {@link Miparcer#typedenoter}.
	 * @param ctx the parse tree
	 */
	void exitTypedenoter(Miparcer.TypedenoterContext ctx);
	/**
	 * Enter a parse tree produced by {@link Miparcer#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(Miparcer.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Miparcer#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(Miparcer.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Miparcer#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpression(Miparcer.PrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Miparcer#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpression(Miparcer.PrimaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Miparcer#metodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMetodDeclaration(Miparcer.MetodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Miparcer#metodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMetodDeclaration(Miparcer.MetodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Miparcer#metodCall}.
	 * @param ctx the parse tree
	 */
	void enterMetodCall(Miparcer.MetodCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link Miparcer#metodCall}.
	 * @param ctx the parse tree
	 */
	void exitMetodCall(Miparcer.MetodCallContext ctx);
}