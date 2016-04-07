// Generated from Expression.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ExpressionParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ExpressionVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#topPrior}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTopPrior(@NotNull ExpressionParser.TopPriorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#lowPrior}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLowPrior(@NotNull ExpressionParser.LowPriorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#highPrior}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHighPrior(@NotNull ExpressionParser.HighPriorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(@NotNull ExpressionParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(@NotNull ExpressionParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#signInt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignInt(@NotNull ExpressionParser.SignIntContext ctx);
}