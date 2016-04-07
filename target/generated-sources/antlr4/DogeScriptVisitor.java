// Generated from DogeScript.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DogeScriptParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DogeScriptVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DogeScriptParser#constant_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant_declaration(@NotNull DogeScriptParser.Constant_declarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code vardec3}
	 * labeled alternative in {@link DogeScriptParser#variable_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVardec3(@NotNull DogeScriptParser.Vardec3Context ctx);
	/**
	 * Visit a parse tree produced by {@link DogeScriptParser#conditionB}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionB(@NotNull DogeScriptParser.ConditionBContext ctx);
	/**
	 * Visit a parse tree produced by the {@code returnLit}
	 * labeled alternative in {@link DogeScriptParser#returns_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnLit(@NotNull DogeScriptParser.ReturnLitContext ctx);
	/**
	 * Visit a parse tree produced by {@link DogeScriptParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call(@NotNull DogeScriptParser.Function_callContext ctx);
	/**
	 * Visit a parse tree produced by the {@code vardec2}
	 * labeled alternative in {@link DogeScriptParser#variable_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVardec2(@NotNull DogeScriptParser.Vardec2Context ctx);
	/**
	 * Visit a parse tree produced by {@link DogeScriptParser#conditionE}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionE(@NotNull DogeScriptParser.ConditionEContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lpExpr}
	 * labeled alternative in {@link DogeScriptParser#low_prior}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLpExpr(@NotNull DogeScriptParser.LpExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link DogeScriptParser#conditionF}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionF(@NotNull DogeScriptParser.ConditionFContext ctx);
	/**
	 * Visit a parse tree produced by {@link DogeScriptParser#returns_array_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturns_array_value(@NotNull DogeScriptParser.Returns_array_valueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code vardec}
	 * labeled alternative in {@link DogeScriptParser#variable_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVardec(@NotNull DogeScriptParser.VardecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code returnVar}
	 * labeled alternative in {@link DogeScriptParser#returns_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnVar(@NotNull DogeScriptParser.ReturnVarContext ctx);
	/**
	 * Visit a parse tree produced by {@link DogeScriptParser#logical_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogical_operator(@NotNull DogeScriptParser.Logical_operatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code negSignInt}
	 * labeled alternative in {@link DogeScriptParser#signint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegSignInt(@NotNull DogeScriptParser.NegSignIntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code scanStatement}
	 * labeled alternative in {@link DogeScriptParser#scan_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScanStatement(@NotNull DogeScriptParser.ScanStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignDec}
	 * labeled alternative in {@link DogeScriptParser#assignment_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignDec(@NotNull DogeScriptParser.AssignDecContext ctx);
	/**
	 * Visit a parse tree produced by {@link DogeScriptParser#return_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_statement(@NotNull DogeScriptParser.Return_statementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printExpr}
	 * labeled alternative in {@link DogeScriptParser#all_possible_print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintExpr(@NotNull DogeScriptParser.PrintExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link DogeScriptParser#conditionV}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionV(@NotNull DogeScriptParser.ConditionVContext ctx);
	/**
	 * Visit a parse tree produced by {@link DogeScriptParser#start_condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart_condition(@NotNull DogeScriptParser.Start_conditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DogeScriptParser#comparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison(@NotNull DogeScriptParser.ComparisonContext ctx);
	/**
	 * Visit a parse tree produced by the {@code low_prior2}
	 * labeled alternative in {@link DogeScriptParser#low_prior}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLow_prior2(@NotNull DogeScriptParser.Low_prior2Context ctx);
	/**
	 * Visit a parse tree produced by {@link DogeScriptParser#variable_instance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_instance(@NotNull DogeScriptParser.Variable_instanceContext ctx);
	/**
	 * Visit a parse tree produced by {@link DogeScriptParser#datatype_array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatatype_array(@NotNull DogeScriptParser.Datatype_arrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link DogeScriptParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(@NotNull DogeScriptParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DogeScriptParser#print_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint_statement(@NotNull DogeScriptParser.Print_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DogeScriptParser#all_possible_single_statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAll_possible_single_statements(@NotNull DogeScriptParser.All_possible_single_statementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DogeScriptParser#afterthought_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAfterthought_statement(@NotNull DogeScriptParser.Afterthought_statementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignVar}
	 * labeled alternative in {@link DogeScriptParser#assignment_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignVar(@NotNull DogeScriptParser.AssignVarContext ctx);
	/**
	 * Visit a parse tree produced by {@link DogeScriptParser#main_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain_function(@NotNull DogeScriptParser.Main_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DogeScriptParser#event_loop_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvent_loop_statement(@NotNull DogeScriptParser.Event_loop_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DogeScriptParser#codeblock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCodeblock(@NotNull DogeScriptParser.CodeblockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code returnFuncCall}
	 * labeled alternative in {@link DogeScriptParser#returns_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnFuncCall(@NotNull DogeScriptParser.ReturnFuncCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printVar}
	 * labeled alternative in {@link DogeScriptParser#all_possible_print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintVar(@NotNull DogeScriptParser.PrintVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tpParenthesis}
	 * labeled alternative in {@link DogeScriptParser#top_prior}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTpParenthesis(@NotNull DogeScriptParser.TpParenthesisContext ctx);
	/**
	 * Visit a parse tree produced by {@link DogeScriptParser#function_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_block(@NotNull DogeScriptParser.Function_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link DogeScriptParser#continue_condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinue_condition(@NotNull DogeScriptParser.Continue_conditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DogeScriptParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(@NotNull DogeScriptParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printLit}
	 * labeled alternative in {@link DogeScriptParser#all_possible_print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintLit(@NotNull DogeScriptParser.PrintLitContext ctx);
	/**
	 * Visit a parse tree produced by {@link DogeScriptParser#comparison_bool_lit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison_bool_lit(@NotNull DogeScriptParser.Comparison_bool_litContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printFunction}
	 * labeled alternative in {@link DogeScriptParser#all_possible_print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintFunction(@NotNull DogeScriptParser.PrintFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DogeScriptParser#function_call_parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call_parameters(@NotNull DogeScriptParser.Function_call_parametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link DogeScriptParser#datatype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatatype(@NotNull DogeScriptParser.DatatypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DogeScriptParser#count_loop_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCount_loop_statement(@NotNull DogeScriptParser.Count_loop_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DogeScriptParser#repeatuntil_loop_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeatuntil_loop_statement(@NotNull DogeScriptParser.Repeatuntil_loop_statementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code posSignInt}
	 * labeled alternative in {@link DogeScriptParser#signint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPosSignInt(@NotNull DogeScriptParser.PosSignIntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tpIntLit}
	 * labeled alternative in {@link DogeScriptParser#top_prior}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTpIntLit(@NotNull DogeScriptParser.TpIntLitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code hpExpr}
	 * labeled alternative in {@link DogeScriptParser#high_prior}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHpExpr(@NotNull DogeScriptParser.HpExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link DogeScriptParser#function_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_declaration(@NotNull DogeScriptParser.Function_declarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignInc}
	 * labeled alternative in {@link DogeScriptParser#assignment_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignInc(@NotNull DogeScriptParser.AssignIncContext ctx);
	/**
	 * Visit a parse tree produced by {@link DogeScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(@NotNull DogeScriptParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code returnNull}
	 * labeled alternative in {@link DogeScriptParser#returns_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnNull(@NotNull DogeScriptParser.ReturnNullContext ctx);
	/**
	 * Visit a parse tree produced by {@link DogeScriptParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(@NotNull DogeScriptParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link DogeScriptParser#all_possible_statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAll_possible_statements(@NotNull DogeScriptParser.All_possible_statementsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code returnExpr}
	 * labeled alternative in {@link DogeScriptParser#returns_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnExpr(@NotNull DogeScriptParser.ReturnExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link DogeScriptParser#function_declaration_paramaters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_declaration_paramaters(@NotNull DogeScriptParser.Function_declaration_paramatersContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tpVarIdentifier}
	 * labeled alternative in {@link DogeScriptParser#top_prior}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTpVarIdentifier(@NotNull DogeScriptParser.TpVarIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link DogeScriptParser#end_condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnd_condition(@NotNull DogeScriptParser.End_conditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code high_prior2}
	 * labeled alternative in {@link DogeScriptParser#high_prior}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHigh_prior2(@NotNull DogeScriptParser.High_prior2Context ctx);
	/**
	 * Visit a parse tree produced by {@link DogeScriptParser#conditional_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional_statement(@NotNull DogeScriptParser.Conditional_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DogeScriptParser#loop_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop_statement(@NotNull DogeScriptParser.Loop_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DogeScriptParser#source_code}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSource_code(@NotNull DogeScriptParser.Source_codeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DogeScriptParser#array_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_literal(@NotNull DogeScriptParser.Array_literalContext ctx);
}