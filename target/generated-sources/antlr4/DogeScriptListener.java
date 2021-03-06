// Generated from DogeScript.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DogeScriptParser}.
 */
public interface DogeScriptListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DogeScriptParser#constant_declaration}.
	 * @param ctx the parse tree
	 */
	void enterConstant_declaration(@NotNull DogeScriptParser.Constant_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DogeScriptParser#constant_declaration}.
	 * @param ctx the parse tree
	 */
	void exitConstant_declaration(@NotNull DogeScriptParser.Constant_declarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vardec3}
	 * labeled alternative in {@link DogeScriptParser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void enterVardec3(@NotNull DogeScriptParser.Vardec3Context ctx);
	/**
	 * Exit a parse tree produced by the {@code vardec3}
	 * labeled alternative in {@link DogeScriptParser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void exitVardec3(@NotNull DogeScriptParser.Vardec3Context ctx);
	/**
	 * Enter a parse tree produced by {@link DogeScriptParser#conditionB}.
	 * @param ctx the parse tree
	 */
	void enterConditionB(@NotNull DogeScriptParser.ConditionBContext ctx);
	/**
	 * Exit a parse tree produced by {@link DogeScriptParser#conditionB}.
	 * @param ctx the parse tree
	 */
	void exitConditionB(@NotNull DogeScriptParser.ConditionBContext ctx);
	/**
	 * Enter a parse tree produced by the {@code returnLit}
	 * labeled alternative in {@link DogeScriptParser#returns_value}.
	 * @param ctx the parse tree
	 */
	void enterReturnLit(@NotNull DogeScriptParser.ReturnLitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code returnLit}
	 * labeled alternative in {@link DogeScriptParser#returns_value}.
	 * @param ctx the parse tree
	 */
	void exitReturnLit(@NotNull DogeScriptParser.ReturnLitContext ctx);
	/**
	 * Enter a parse tree produced by {@link DogeScriptParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(@NotNull DogeScriptParser.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link DogeScriptParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(@NotNull DogeScriptParser.Function_callContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vardec2}
	 * labeled alternative in {@link DogeScriptParser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void enterVardec2(@NotNull DogeScriptParser.Vardec2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code vardec2}
	 * labeled alternative in {@link DogeScriptParser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void exitVardec2(@NotNull DogeScriptParser.Vardec2Context ctx);
	/**
	 * Enter a parse tree produced by {@link DogeScriptParser#conditionE}.
	 * @param ctx the parse tree
	 */
	void enterConditionE(@NotNull DogeScriptParser.ConditionEContext ctx);
	/**
	 * Exit a parse tree produced by {@link DogeScriptParser#conditionE}.
	 * @param ctx the parse tree
	 */
	void exitConditionE(@NotNull DogeScriptParser.ConditionEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lpExpr}
	 * labeled alternative in {@link DogeScriptParser#low_prior}.
	 * @param ctx the parse tree
	 */
	void enterLpExpr(@NotNull DogeScriptParser.LpExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lpExpr}
	 * labeled alternative in {@link DogeScriptParser#low_prior}.
	 * @param ctx the parse tree
	 */
	void exitLpExpr(@NotNull DogeScriptParser.LpExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link DogeScriptParser#conditionF}.
	 * @param ctx the parse tree
	 */
	void enterConditionF(@NotNull DogeScriptParser.ConditionFContext ctx);
	/**
	 * Exit a parse tree produced by {@link DogeScriptParser#conditionF}.
	 * @param ctx the parse tree
	 */
	void exitConditionF(@NotNull DogeScriptParser.ConditionFContext ctx);
	/**
	 * Enter a parse tree produced by {@link DogeScriptParser#returns_array_value}.
	 * @param ctx the parse tree
	 */
	void enterReturns_array_value(@NotNull DogeScriptParser.Returns_array_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link DogeScriptParser#returns_array_value}.
	 * @param ctx the parse tree
	 */
	void exitReturns_array_value(@NotNull DogeScriptParser.Returns_array_valueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vardec}
	 * labeled alternative in {@link DogeScriptParser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void enterVardec(@NotNull DogeScriptParser.VardecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vardec}
	 * labeled alternative in {@link DogeScriptParser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void exitVardec(@NotNull DogeScriptParser.VardecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code returnVar}
	 * labeled alternative in {@link DogeScriptParser#returns_value}.
	 * @param ctx the parse tree
	 */
	void enterReturnVar(@NotNull DogeScriptParser.ReturnVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code returnVar}
	 * labeled alternative in {@link DogeScriptParser#returns_value}.
	 * @param ctx the parse tree
	 */
	void exitReturnVar(@NotNull DogeScriptParser.ReturnVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link DogeScriptParser#logical_operator}.
	 * @param ctx the parse tree
	 */
	void enterLogical_operator(@NotNull DogeScriptParser.Logical_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link DogeScriptParser#logical_operator}.
	 * @param ctx the parse tree
	 */
	void exitLogical_operator(@NotNull DogeScriptParser.Logical_operatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code negSignInt}
	 * labeled alternative in {@link DogeScriptParser#signint}.
	 * @param ctx the parse tree
	 */
	void enterNegSignInt(@NotNull DogeScriptParser.NegSignIntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code negSignInt}
	 * labeled alternative in {@link DogeScriptParser#signint}.
	 * @param ctx the parse tree
	 */
	void exitNegSignInt(@NotNull DogeScriptParser.NegSignIntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code scanStatement}
	 * labeled alternative in {@link DogeScriptParser#scan_statement}.
	 * @param ctx the parse tree
	 */
	void enterScanStatement(@NotNull DogeScriptParser.ScanStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code scanStatement}
	 * labeled alternative in {@link DogeScriptParser#scan_statement}.
	 * @param ctx the parse tree
	 */
	void exitScanStatement(@NotNull DogeScriptParser.ScanStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignDec}
	 * labeled alternative in {@link DogeScriptParser#assignment_statement}.
	 * @param ctx the parse tree
	 */
	void enterAssignDec(@NotNull DogeScriptParser.AssignDecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignDec}
	 * labeled alternative in {@link DogeScriptParser#assignment_statement}.
	 * @param ctx the parse tree
	 */
	void exitAssignDec(@NotNull DogeScriptParser.AssignDecContext ctx);
	/**
	 * Enter a parse tree produced by {@link DogeScriptParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void enterReturn_statement(@NotNull DogeScriptParser.Return_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DogeScriptParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void exitReturn_statement(@NotNull DogeScriptParser.Return_statementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printExpr}
	 * labeled alternative in {@link DogeScriptParser#all_possible_print}.
	 * @param ctx the parse tree
	 */
	void enterPrintExpr(@NotNull DogeScriptParser.PrintExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printExpr}
	 * labeled alternative in {@link DogeScriptParser#all_possible_print}.
	 * @param ctx the parse tree
	 */
	void exitPrintExpr(@NotNull DogeScriptParser.PrintExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link DogeScriptParser#conditionV}.
	 * @param ctx the parse tree
	 */
	void enterConditionV(@NotNull DogeScriptParser.ConditionVContext ctx);
	/**
	 * Exit a parse tree produced by {@link DogeScriptParser#conditionV}.
	 * @param ctx the parse tree
	 */
	void exitConditionV(@NotNull DogeScriptParser.ConditionVContext ctx);
	/**
	 * Enter a parse tree produced by {@link DogeScriptParser#start_condition}.
	 * @param ctx the parse tree
	 */
	void enterStart_condition(@NotNull DogeScriptParser.Start_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DogeScriptParser#start_condition}.
	 * @param ctx the parse tree
	 */
	void exitStart_condition(@NotNull DogeScriptParser.Start_conditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DogeScriptParser#comparison}.
	 * @param ctx the parse tree
	 */
	void enterComparison(@NotNull DogeScriptParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link DogeScriptParser#comparison}.
	 * @param ctx the parse tree
	 */
	void exitComparison(@NotNull DogeScriptParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code low_prior2}
	 * labeled alternative in {@link DogeScriptParser#low_prior}.
	 * @param ctx the parse tree
	 */
	void enterLow_prior2(@NotNull DogeScriptParser.Low_prior2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code low_prior2}
	 * labeled alternative in {@link DogeScriptParser#low_prior}.
	 * @param ctx the parse tree
	 */
	void exitLow_prior2(@NotNull DogeScriptParser.Low_prior2Context ctx);
	/**
	 * Enter a parse tree produced by {@link DogeScriptParser#variable_instance}.
	 * @param ctx the parse tree
	 */
	void enterVariable_instance(@NotNull DogeScriptParser.Variable_instanceContext ctx);
	/**
	 * Exit a parse tree produced by {@link DogeScriptParser#variable_instance}.
	 * @param ctx the parse tree
	 */
	void exitVariable_instance(@NotNull DogeScriptParser.Variable_instanceContext ctx);
	/**
	 * Enter a parse tree produced by {@link DogeScriptParser#datatype_array}.
	 * @param ctx the parse tree
	 */
	void enterDatatype_array(@NotNull DogeScriptParser.Datatype_arrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link DogeScriptParser#datatype_array}.
	 * @param ctx the parse tree
	 */
	void exitDatatype_array(@NotNull DogeScriptParser.Datatype_arrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link DogeScriptParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(@NotNull DogeScriptParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DogeScriptParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(@NotNull DogeScriptParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DogeScriptParser#print_statement}.
	 * @param ctx the parse tree
	 */
	void enterPrint_statement(@NotNull DogeScriptParser.Print_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DogeScriptParser#print_statement}.
	 * @param ctx the parse tree
	 */
	void exitPrint_statement(@NotNull DogeScriptParser.Print_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DogeScriptParser#all_possible_single_statements}.
	 * @param ctx the parse tree
	 */
	void enterAll_possible_single_statements(@NotNull DogeScriptParser.All_possible_single_statementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DogeScriptParser#all_possible_single_statements}.
	 * @param ctx the parse tree
	 */
	void exitAll_possible_single_statements(@NotNull DogeScriptParser.All_possible_single_statementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DogeScriptParser#afterthought_statement}.
	 * @param ctx the parse tree
	 */
	void enterAfterthought_statement(@NotNull DogeScriptParser.Afterthought_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DogeScriptParser#afterthought_statement}.
	 * @param ctx the parse tree
	 */
	void exitAfterthought_statement(@NotNull DogeScriptParser.Afterthought_statementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignVar}
	 * labeled alternative in {@link DogeScriptParser#assignment_statement}.
	 * @param ctx the parse tree
	 */
	void enterAssignVar(@NotNull DogeScriptParser.AssignVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignVar}
	 * labeled alternative in {@link DogeScriptParser#assignment_statement}.
	 * @param ctx the parse tree
	 */
	void exitAssignVar(@NotNull DogeScriptParser.AssignVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link DogeScriptParser#main_function}.
	 * @param ctx the parse tree
	 */
	void enterMain_function(@NotNull DogeScriptParser.Main_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DogeScriptParser#main_function}.
	 * @param ctx the parse tree
	 */
	void exitMain_function(@NotNull DogeScriptParser.Main_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DogeScriptParser#event_loop_statement}.
	 * @param ctx the parse tree
	 */
	void enterEvent_loop_statement(@NotNull DogeScriptParser.Event_loop_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DogeScriptParser#event_loop_statement}.
	 * @param ctx the parse tree
	 */
	void exitEvent_loop_statement(@NotNull DogeScriptParser.Event_loop_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DogeScriptParser#codeblock}.
	 * @param ctx the parse tree
	 */
	void enterCodeblock(@NotNull DogeScriptParser.CodeblockContext ctx);
	/**
	 * Exit a parse tree produced by {@link DogeScriptParser#codeblock}.
	 * @param ctx the parse tree
	 */
	void exitCodeblock(@NotNull DogeScriptParser.CodeblockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code returnFuncCall}
	 * labeled alternative in {@link DogeScriptParser#returns_value}.
	 * @param ctx the parse tree
	 */
	void enterReturnFuncCall(@NotNull DogeScriptParser.ReturnFuncCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code returnFuncCall}
	 * labeled alternative in {@link DogeScriptParser#returns_value}.
	 * @param ctx the parse tree
	 */
	void exitReturnFuncCall(@NotNull DogeScriptParser.ReturnFuncCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printVar}
	 * labeled alternative in {@link DogeScriptParser#all_possible_print}.
	 * @param ctx the parse tree
	 */
	void enterPrintVar(@NotNull DogeScriptParser.PrintVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printVar}
	 * labeled alternative in {@link DogeScriptParser#all_possible_print}.
	 * @param ctx the parse tree
	 */
	void exitPrintVar(@NotNull DogeScriptParser.PrintVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tpParenthesis}
	 * labeled alternative in {@link DogeScriptParser#top_prior}.
	 * @param ctx the parse tree
	 */
	void enterTpParenthesis(@NotNull DogeScriptParser.TpParenthesisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tpParenthesis}
	 * labeled alternative in {@link DogeScriptParser#top_prior}.
	 * @param ctx the parse tree
	 */
	void exitTpParenthesis(@NotNull DogeScriptParser.TpParenthesisContext ctx);
	/**
	 * Enter a parse tree produced by {@link DogeScriptParser#function_block}.
	 * @param ctx the parse tree
	 */
	void enterFunction_block(@NotNull DogeScriptParser.Function_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link DogeScriptParser#function_block}.
	 * @param ctx the parse tree
	 */
	void exitFunction_block(@NotNull DogeScriptParser.Function_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link DogeScriptParser#continue_condition}.
	 * @param ctx the parse tree
	 */
	void enterContinue_condition(@NotNull DogeScriptParser.Continue_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DogeScriptParser#continue_condition}.
	 * @param ctx the parse tree
	 */
	void exitContinue_condition(@NotNull DogeScriptParser.Continue_conditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DogeScriptParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(@NotNull DogeScriptParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link DogeScriptParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(@NotNull DogeScriptParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printLit}
	 * labeled alternative in {@link DogeScriptParser#all_possible_print}.
	 * @param ctx the parse tree
	 */
	void enterPrintLit(@NotNull DogeScriptParser.PrintLitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printLit}
	 * labeled alternative in {@link DogeScriptParser#all_possible_print}.
	 * @param ctx the parse tree
	 */
	void exitPrintLit(@NotNull DogeScriptParser.PrintLitContext ctx);
	/**
	 * Enter a parse tree produced by {@link DogeScriptParser#comparison_bool_lit}.
	 * @param ctx the parse tree
	 */
	void enterComparison_bool_lit(@NotNull DogeScriptParser.Comparison_bool_litContext ctx);
	/**
	 * Exit a parse tree produced by {@link DogeScriptParser#comparison_bool_lit}.
	 * @param ctx the parse tree
	 */
	void exitComparison_bool_lit(@NotNull DogeScriptParser.Comparison_bool_litContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printFunction}
	 * labeled alternative in {@link DogeScriptParser#all_possible_print}.
	 * @param ctx the parse tree
	 */
	void enterPrintFunction(@NotNull DogeScriptParser.PrintFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printFunction}
	 * labeled alternative in {@link DogeScriptParser#all_possible_print}.
	 * @param ctx the parse tree
	 */
	void exitPrintFunction(@NotNull DogeScriptParser.PrintFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DogeScriptParser#function_call_parameters}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call_parameters(@NotNull DogeScriptParser.Function_call_parametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link DogeScriptParser#function_call_parameters}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call_parameters(@NotNull DogeScriptParser.Function_call_parametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link DogeScriptParser#datatype}.
	 * @param ctx the parse tree
	 */
	void enterDatatype(@NotNull DogeScriptParser.DatatypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DogeScriptParser#datatype}.
	 * @param ctx the parse tree
	 */
	void exitDatatype(@NotNull DogeScriptParser.DatatypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DogeScriptParser#count_loop_statement}.
	 * @param ctx the parse tree
	 */
	void enterCount_loop_statement(@NotNull DogeScriptParser.Count_loop_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DogeScriptParser#count_loop_statement}.
	 * @param ctx the parse tree
	 */
	void exitCount_loop_statement(@NotNull DogeScriptParser.Count_loop_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DogeScriptParser#repeatuntil_loop_statement}.
	 * @param ctx the parse tree
	 */
	void enterRepeatuntil_loop_statement(@NotNull DogeScriptParser.Repeatuntil_loop_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DogeScriptParser#repeatuntil_loop_statement}.
	 * @param ctx the parse tree
	 */
	void exitRepeatuntil_loop_statement(@NotNull DogeScriptParser.Repeatuntil_loop_statementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code posSignInt}
	 * labeled alternative in {@link DogeScriptParser#signint}.
	 * @param ctx the parse tree
	 */
	void enterPosSignInt(@NotNull DogeScriptParser.PosSignIntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code posSignInt}
	 * labeled alternative in {@link DogeScriptParser#signint}.
	 * @param ctx the parse tree
	 */
	void exitPosSignInt(@NotNull DogeScriptParser.PosSignIntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tpIntLit}
	 * labeled alternative in {@link DogeScriptParser#top_prior}.
	 * @param ctx the parse tree
	 */
	void enterTpIntLit(@NotNull DogeScriptParser.TpIntLitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tpIntLit}
	 * labeled alternative in {@link DogeScriptParser#top_prior}.
	 * @param ctx the parse tree
	 */
	void exitTpIntLit(@NotNull DogeScriptParser.TpIntLitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code hpExpr}
	 * labeled alternative in {@link DogeScriptParser#high_prior}.
	 * @param ctx the parse tree
	 */
	void enterHpExpr(@NotNull DogeScriptParser.HpExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code hpExpr}
	 * labeled alternative in {@link DogeScriptParser#high_prior}.
	 * @param ctx the parse tree
	 */
	void exitHpExpr(@NotNull DogeScriptParser.HpExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link DogeScriptParser#function_declaration}.
	 * @param ctx the parse tree
	 */
	void enterFunction_declaration(@NotNull DogeScriptParser.Function_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DogeScriptParser#function_declaration}.
	 * @param ctx the parse tree
	 */
	void exitFunction_declaration(@NotNull DogeScriptParser.Function_declarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignInc}
	 * labeled alternative in {@link DogeScriptParser#assignment_statement}.
	 * @param ctx the parse tree
	 */
	void enterAssignInc(@NotNull DogeScriptParser.AssignIncContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignInc}
	 * labeled alternative in {@link DogeScriptParser#assignment_statement}.
	 * @param ctx the parse tree
	 */
	void exitAssignInc(@NotNull DogeScriptParser.AssignIncContext ctx);
	/**
	 * Enter a parse tree produced by {@link DogeScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull DogeScriptParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DogeScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull DogeScriptParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code returnNull}
	 * labeled alternative in {@link DogeScriptParser#returns_value}.
	 * @param ctx the parse tree
	 */
	void enterReturnNull(@NotNull DogeScriptParser.ReturnNullContext ctx);
	/**
	 * Exit a parse tree produced by the {@code returnNull}
	 * labeled alternative in {@link DogeScriptParser#returns_value}.
	 * @param ctx the parse tree
	 */
	void exitReturnNull(@NotNull DogeScriptParser.ReturnNullContext ctx);
	/**
	 * Enter a parse tree produced by {@link DogeScriptParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(@NotNull DogeScriptParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link DogeScriptParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(@NotNull DogeScriptParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link DogeScriptParser#all_possible_statements}.
	 * @param ctx the parse tree
	 */
	void enterAll_possible_statements(@NotNull DogeScriptParser.All_possible_statementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DogeScriptParser#all_possible_statements}.
	 * @param ctx the parse tree
	 */
	void exitAll_possible_statements(@NotNull DogeScriptParser.All_possible_statementsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code returnExpr}
	 * labeled alternative in {@link DogeScriptParser#returns_value}.
	 * @param ctx the parse tree
	 */
	void enterReturnExpr(@NotNull DogeScriptParser.ReturnExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code returnExpr}
	 * labeled alternative in {@link DogeScriptParser#returns_value}.
	 * @param ctx the parse tree
	 */
	void exitReturnExpr(@NotNull DogeScriptParser.ReturnExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link DogeScriptParser#function_declaration_paramaters}.
	 * @param ctx the parse tree
	 */
	void enterFunction_declaration_paramaters(@NotNull DogeScriptParser.Function_declaration_paramatersContext ctx);
	/**
	 * Exit a parse tree produced by {@link DogeScriptParser#function_declaration_paramaters}.
	 * @param ctx the parse tree
	 */
	void exitFunction_declaration_paramaters(@NotNull DogeScriptParser.Function_declaration_paramatersContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tpVarIdentifier}
	 * labeled alternative in {@link DogeScriptParser#top_prior}.
	 * @param ctx the parse tree
	 */
	void enterTpVarIdentifier(@NotNull DogeScriptParser.TpVarIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tpVarIdentifier}
	 * labeled alternative in {@link DogeScriptParser#top_prior}.
	 * @param ctx the parse tree
	 */
	void exitTpVarIdentifier(@NotNull DogeScriptParser.TpVarIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link DogeScriptParser#end_condition}.
	 * @param ctx the parse tree
	 */
	void enterEnd_condition(@NotNull DogeScriptParser.End_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DogeScriptParser#end_condition}.
	 * @param ctx the parse tree
	 */
	void exitEnd_condition(@NotNull DogeScriptParser.End_conditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code high_prior2}
	 * labeled alternative in {@link DogeScriptParser#high_prior}.
	 * @param ctx the parse tree
	 */
	void enterHigh_prior2(@NotNull DogeScriptParser.High_prior2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code high_prior2}
	 * labeled alternative in {@link DogeScriptParser#high_prior}.
	 * @param ctx the parse tree
	 */
	void exitHigh_prior2(@NotNull DogeScriptParser.High_prior2Context ctx);
	/**
	 * Enter a parse tree produced by {@link DogeScriptParser#conditional_statement}.
	 * @param ctx the parse tree
	 */
	void enterConditional_statement(@NotNull DogeScriptParser.Conditional_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DogeScriptParser#conditional_statement}.
	 * @param ctx the parse tree
	 */
	void exitConditional_statement(@NotNull DogeScriptParser.Conditional_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DogeScriptParser#loop_statement}.
	 * @param ctx the parse tree
	 */
	void enterLoop_statement(@NotNull DogeScriptParser.Loop_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DogeScriptParser#loop_statement}.
	 * @param ctx the parse tree
	 */
	void exitLoop_statement(@NotNull DogeScriptParser.Loop_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DogeScriptParser#source_code}.
	 * @param ctx the parse tree
	 */
	void enterSource_code(@NotNull DogeScriptParser.Source_codeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DogeScriptParser#source_code}.
	 * @param ctx the parse tree
	 */
	void exitSource_code(@NotNull DogeScriptParser.Source_codeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DogeScriptParser#array_literal}.
	 * @param ctx the parse tree
	 */
	void enterArray_literal(@NotNull DogeScriptParser.Array_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link DogeScriptParser#array_literal}.
	 * @param ctx the parse tree
	 */
	void exitArray_literal(@NotNull DogeScriptParser.Array_literalContext ctx);
}