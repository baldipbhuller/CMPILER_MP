// Generated from DogeScript.g4 by ANTLR 4.4
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DogeScriptParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, CommentBlock=2, IntDataType=3, CharDataType=4, BoolDataType=5, StringDataType=6, 
		ConDecStarter=7, Terminator=8, VarDecStarter=9, FuncStarter=10, ConstantStarter=11, 
		AssOp=12, PrintStarter=13, ScanStarter=14, IfKeyword=15, ElseKeyword=16, 
		ElseIfKeyword=17, EventLoopKeyword=18, CountLoopKeyword=19, RepeatUntilLoopKeyword=20, 
		VoidKeyword=21, MainKeyword=22, Comma=23, NullKeyword=24, ReturnKeyword=25, 
		BoolLit=26, AddOp=27, SubOp=28, MulOp=29, DivOp=30, ModOp=31, EquaOp=32, 
		GreaterThanOp=33, LessThanOp=34, GreaterThanEqualTo=35, LessThanEqualTo=36, 
		NotEqualToOp=37, AndOp=38, OrOp=39, IncrementOp=40, DecrementOp=41, OpenBrace=42, 
		CloseBrace=43, OpenParenthesis=44, CloseParenthesis=45, IntLit=46, FloatLit=47, 
		StringLit=48, CharLit=49, Array=50, VarIdentifier=51, EndOfFile=52;
	public static final String[] tokenNames = {
		"<INVALID>", "WS", "CommentBlock", "'int'", "'char'", "'boolean'", "'string'", 
		"'constant'", "Terminator", "'such'", "'much'", "'very'", "'as'", "'print'", 
		"'scan'", "'rily'", "'but'", "'but rily'", "'so'", "'many'", "'nice'", 
		"'void'", "'dogeIntensifies'", "','", "'null'", "'bow'", "BoolLit", "'+'", 
		"'-'", "'*'", "'/'", "'%'", "'is'", "'>'", "'<'", "'>='", "'<='", "'!='", 
		"'and'", "'or'", "'++'", "'--'", "'{'", "'}'", "'('", "')'", "IntLit", 
		"FloatLit", "StringLit", "CharLit", "Array", "VarIdentifier", "'$'"
	};
	public static final int
		RULE_start = 0, RULE_source_code = 1, RULE_main_function = 2, RULE_function_block = 3, 
		RULE_codeblock = 4, RULE_all_possible_statements = 5, RULE_all_possible_single_statements = 6, 
		RULE_afterthought_statement = 7, RULE_function_declaration = 8, RULE_function_declaration_paramaters = 9, 
		RULE_return_statement = 10, RULE_print_statement = 11, RULE_all_possible_print = 12, 
		RULE_scan_statement = 13, RULE_variable_declaration = 14, RULE_constant_declaration = 15, 
		RULE_literal = 16, RULE_array_literal = 17, RULE_datatype = 18, RULE_datatype_array = 19, 
		RULE_variable_instance = 20, RULE_returns_value = 21, RULE_returns_array_value = 22, 
		RULE_expression = 23, RULE_low_prior = 24, RULE_high_prior = 25, RULE_signint = 26, 
		RULE_top_prior = 27, RULE_assignment_statement = 28, RULE_conditional_statement = 29, 
		RULE_start_condition = 30, RULE_end_condition = 31, RULE_continue_condition = 32, 
		RULE_loop_statement = 33, RULE_event_loop_statement = 34, RULE_count_loop_statement = 35, 
		RULE_repeatuntil_loop_statement = 36, RULE_condition = 37, RULE_conditionB = 38, 
		RULE_conditionV = 39, RULE_conditionE = 40, RULE_conditionF = 41, RULE_comparison_bool_lit = 42, 
		RULE_comparison = 43, RULE_logical_operator = 44, RULE_function_call = 45, 
		RULE_function_call_parameters = 46;
	public static final String[] ruleNames = {
		"start", "source_code", "main_function", "function_block", "codeblock", 
		"all_possible_statements", "all_possible_single_statements", "afterthought_statement", 
		"function_declaration", "function_declaration_paramaters", "return_statement", 
		"print_statement", "all_possible_print", "scan_statement", "variable_declaration", 
		"constant_declaration", "literal", "array_literal", "datatype", "datatype_array", 
		"variable_instance", "returns_value", "returns_array_value", "expression", 
		"low_prior", "high_prior", "signint", "top_prior", "assignment_statement", 
		"conditional_statement", "start_condition", "end_condition", "continue_condition", 
		"loop_statement", "event_loop_statement", "count_loop_statement", "repeatuntil_loop_statement", 
		"condition", "conditionB", "conditionV", "conditionE", "conditionF", "comparison_bool_lit", 
		"comparison", "logical_operator", "function_call", "function_call_parameters"
	};

	@Override
	public String getGrammarFileName() { return "DogeScript.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DogeScriptParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StartContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(DogeScriptParser.EOF, 0); }
		public Source_codeContext source_code() {
			return getRuleContext(Source_codeContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DogeScriptVisitor ) return ((DogeScriptVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94); source_code();
			setState(95); match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Source_codeContext extends ParserRuleContext {
		public Function_blockContext function_block(int i) {
			return getRuleContext(Function_blockContext.class,i);
		}
		public Main_functionContext main_function() {
			return getRuleContext(Main_functionContext.class,0);
		}
		public List<Function_blockContext> function_block() {
			return getRuleContexts(Function_blockContext.class);
		}
		public Source_codeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_source_code; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).enterSource_code(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).exitSource_code(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DogeScriptVisitor ) return ((DogeScriptVisitor<? extends T>)visitor).visitSource_code(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Source_codeContext source_code() throws RecognitionException {
		Source_codeContext _localctx = new Source_codeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_source_code);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97); function_block();
			setState(98); main_function();
			setState(99); function_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Main_functionContext extends ParserRuleContext {
		public TerminalNode CloseBrace() { return getToken(DogeScriptParser.CloseBrace, 0); }
		public TerminalNode OpenParenthesis() { return getToken(DogeScriptParser.OpenParenthesis, 0); }
		public TerminalNode CloseParenthesis() { return getToken(DogeScriptParser.CloseParenthesis, 0); }
		public TerminalNode FuncStarter() { return getToken(DogeScriptParser.FuncStarter, 0); }
		public TerminalNode VoidKeyword() { return getToken(DogeScriptParser.VoidKeyword, 0); }
		public TerminalNode MainKeyword() { return getToken(DogeScriptParser.MainKeyword, 0); }
		public TerminalNode OpenBrace() { return getToken(DogeScriptParser.OpenBrace, 0); }
		public CodeblockContext codeblock() {
			return getRuleContext(CodeblockContext.class,0);
		}
		public Main_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).enterMain_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).exitMain_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DogeScriptVisitor ) return ((DogeScriptVisitor<? extends T>)visitor).visitMain_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Main_functionContext main_function() throws RecognitionException {
		Main_functionContext _localctx = new Main_functionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_main_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			System.out.println("in main_function");
			setState(102); match(FuncStarter);
			setState(103); match(VoidKeyword);
			setState(104); match(MainKeyword);
			setState(105); match(OpenParenthesis);
			setState(106); match(CloseParenthesis);
			setState(107); match(OpenBrace);
			setState(108); codeblock();
			setState(109); match(CloseBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_blockContext extends ParserRuleContext {
		public Function_declarationContext function_declaration() {
			return getRuleContext(Function_declarationContext.class,0);
		}
		public Function_blockContext function_block() {
			return getRuleContext(Function_blockContext.class,0);
		}
		public Function_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).enterFunction_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).exitFunction_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DogeScriptVisitor ) return ((DogeScriptVisitor<? extends T>)visitor).visitFunction_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_blockContext function_block() throws RecognitionException {
		Function_blockContext _localctx = new Function_blockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_function_block);
		try {
			setState(116);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				System.out.println("in function_block");
				setState(112); function_declaration();
				setState(113); function_block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CodeblockContext extends ParserRuleContext {
		public All_possible_statementsContext all_possible_statements() {
			return getRuleContext(All_possible_statementsContext.class,0);
		}
		public CodeblockContext codeblock() {
			return getRuleContext(CodeblockContext.class,0);
		}
		public CodeblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codeblock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).enterCodeblock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).exitCodeblock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DogeScriptVisitor ) return ((DogeScriptVisitor<? extends T>)visitor).visitCodeblock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CodeblockContext codeblock() throws RecognitionException {
		CodeblockContext _localctx = new CodeblockContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_codeblock);
		try {
			setState(123);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				System.out.println("in code_block");
				setState(119); all_possible_statements();
				setState(120); codeblock();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(122); all_possible_statements();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class All_possible_statementsContext extends ParserRuleContext {
		public Constant_declarationContext constant_declaration() {
			return getRuleContext(Constant_declarationContext.class,0);
		}
		public Conditional_statementContext conditional_statement() {
			return getRuleContext(Conditional_statementContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public Scan_statementContext scan_statement() {
			return getRuleContext(Scan_statementContext.class,0);
		}
		public Variable_declarationContext variable_declaration() {
			return getRuleContext(Variable_declarationContext.class,0);
		}
		public TerminalNode Terminator() { return getToken(DogeScriptParser.Terminator, 0); }
		public Assignment_statementContext assignment_statement() {
			return getRuleContext(Assignment_statementContext.class,0);
		}
		public Loop_statementContext loop_statement() {
			return getRuleContext(Loop_statementContext.class,0);
		}
		public Print_statementContext print_statement() {
			return getRuleContext(Print_statementContext.class,0);
		}
		public All_possible_statementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_all_possible_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).enterAll_possible_statements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).exitAll_possible_statements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DogeScriptVisitor ) return ((DogeScriptVisitor<? extends T>)visitor).visitAll_possible_statements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final All_possible_statementsContext all_possible_statements() throws RecognitionException {
		All_possible_statementsContext _localctx = new All_possible_statementsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_all_possible_statements);
		try {
			setState(147);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				System.out.println("in all_possible");
				setState(126); variable_declaration();
				setState(127); match(Terminator);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(129); assignment_statement();
				setState(130); match(Terminator);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(132); function_call();
				setState(133); match(Terminator);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(135); constant_declaration();
				setState(136); match(Terminator);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(138); conditional_statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(139); loop_statement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(140); print_statement();
				setState(141); match(Terminator);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(143); scan_statement();
				setState(144); match(Terminator);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(146); match(Terminator);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class All_possible_single_statementsContext extends ParserRuleContext {
		public Conditional_statementContext conditional_statement() {
			return getRuleContext(Conditional_statementContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public Variable_declarationContext variable_declaration() {
			return getRuleContext(Variable_declarationContext.class,0);
		}
		public TerminalNode Terminator() { return getToken(DogeScriptParser.Terminator, 0); }
		public Assignment_statementContext assignment_statement() {
			return getRuleContext(Assignment_statementContext.class,0);
		}
		public Loop_statementContext loop_statement() {
			return getRuleContext(Loop_statementContext.class,0);
		}
		public All_possible_single_statementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_all_possible_single_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).enterAll_possible_single_statements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).exitAll_possible_single_statements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DogeScriptVisitor ) return ((DogeScriptVisitor<? extends T>)visitor).visitAll_possible_single_statements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final All_possible_single_statementsContext all_possible_single_statements() throws RecognitionException {
		All_possible_single_statementsContext _localctx = new All_possible_single_statementsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_all_possible_single_statements);
		try {
			setState(162);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				System.out.println("in single_all_possible");
				setState(150); variable_declaration();
				setState(151); match(Terminator);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(153); assignment_statement();
				setState(154); match(Terminator);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(156); function_call();
				setState(157); match(Terminator);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(159); conditional_statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(160); loop_statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(161); match(Terminator);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Afterthought_statementContext extends ParserRuleContext {
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public Assignment_statementContext assignment_statement() {
			return getRuleContext(Assignment_statementContext.class,0);
		}
		public Afterthought_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_afterthought_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).enterAfterthought_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).exitAfterthought_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DogeScriptVisitor ) return ((DogeScriptVisitor<? extends T>)visitor).visitAfterthought_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Afterthought_statementContext afterthought_statement() throws RecognitionException {
		Afterthought_statementContext _localctx = new Afterthought_statementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_afterthought_statement);
		try {
			setState(167);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				System.out.println("in afterthought_statement");
				setState(165); assignment_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(166); function_call();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_declarationContext extends ParserRuleContext {
		public Return_statementContext return_statement() {
			return getRuleContext(Return_statementContext.class,0);
		}
		public TerminalNode CloseBrace() { return getToken(DogeScriptParser.CloseBrace, 0); }
		public TerminalNode OpenParenthesis() { return getToken(DogeScriptParser.OpenParenthesis, 0); }
		public TerminalNode CloseParenthesis() { return getToken(DogeScriptParser.CloseParenthesis, 0); }
		public TerminalNode FuncStarter() { return getToken(DogeScriptParser.FuncStarter, 0); }
		public DatatypeContext datatype() {
			return getRuleContext(DatatypeContext.class,0);
		}
		public TerminalNode OpenBrace() { return getToken(DogeScriptParser.OpenBrace, 0); }
		public Function_declaration_paramatersContext function_declaration_paramaters() {
			return getRuleContext(Function_declaration_paramatersContext.class,0);
		}
		public TerminalNode VarIdentifier() { return getToken(DogeScriptParser.VarIdentifier, 0); }
		public CodeblockContext codeblock() {
			return getRuleContext(CodeblockContext.class,0);
		}
		public Function_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).enterFunction_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).exitFunction_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DogeScriptVisitor ) return ((DogeScriptVisitor<? extends T>)visitor).visitFunction_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_declarationContext function_declaration() throws RecognitionException {
		Function_declarationContext _localctx = new Function_declarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_function_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			System.out.println("in function_declaration");
			setState(170); match(FuncStarter);
			setState(171); datatype();
			setState(172); match(VarIdentifier);
			setState(173); match(OpenParenthesis);
			setState(174); function_declaration_paramaters();
			setState(175); match(CloseParenthesis);
			setState(176); match(OpenBrace);
			setState(177); codeblock();
			setState(178); return_statement();
			setState(179); match(CloseBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_declaration_paramatersContext extends ParserRuleContext {
		public DatatypeContext datatype() {
			return getRuleContext(DatatypeContext.class,0);
		}
		public TerminalNode Comma() { return getToken(DogeScriptParser.Comma, 0); }
		public Function_declaration_paramatersContext function_declaration_paramaters() {
			return getRuleContext(Function_declaration_paramatersContext.class,0);
		}
		public TerminalNode VarIdentifier() { return getToken(DogeScriptParser.VarIdentifier, 0); }
		public Function_declaration_paramatersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_declaration_paramaters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).enterFunction_declaration_paramaters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).exitFunction_declaration_paramaters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DogeScriptVisitor ) return ((DogeScriptVisitor<? extends T>)visitor).visitFunction_declaration_paramaters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_declaration_paramatersContext function_declaration_paramaters() throws RecognitionException {
		Function_declaration_paramatersContext _localctx = new Function_declaration_paramatersContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_function_declaration_paramaters);
		try {
			setState(190);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				System.out.println("in function_declaration_paramaters");
				setState(182); datatype();
				setState(183); match(VarIdentifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(185); datatype();
				setState(186); match(VarIdentifier);
				setState(187); match(Comma);
				setState(188); function_declaration_paramaters();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Return_statementContext extends ParserRuleContext {
		public TerminalNode ReturnKeyword() { return getToken(DogeScriptParser.ReturnKeyword, 0); }
		public Returns_valueContext returns_value() {
			return getRuleContext(Returns_valueContext.class,0);
		}
		public TerminalNode Terminator() { return getToken(DogeScriptParser.Terminator, 0); }
		public Return_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).enterReturn_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).exitReturn_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DogeScriptVisitor ) return ((DogeScriptVisitor<? extends T>)visitor).visitReturn_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_statementContext return_statement() throws RecognitionException {
		Return_statementContext _localctx = new Return_statementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_return_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192); match(ReturnKeyword);
			setState(193); returns_value();
			setState(194); match(Terminator);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Print_statementContext extends ParserRuleContext {
		public All_possible_printContext all_possible_print() {
			return getRuleContext(All_possible_printContext.class,0);
		}
		public TerminalNode PrintStarter() { return getToken(DogeScriptParser.PrintStarter, 0); }
		public Print_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).enterPrint_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).exitPrint_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DogeScriptVisitor ) return ((DogeScriptVisitor<? extends T>)visitor).visitPrint_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Print_statementContext print_statement() throws RecognitionException {
		Print_statementContext _localctx = new Print_statementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_print_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196); match(PrintStarter);
			setState(197); all_possible_print();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class All_possible_printContext extends ParserRuleContext {
		public All_possible_printContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_all_possible_print; }
	 
		public All_possible_printContext() { }
		public void copyFrom(All_possible_printContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PrintLitContext extends All_possible_printContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public PrintLitContext(All_possible_printContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).enterPrintLit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).exitPrintLit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DogeScriptVisitor ) return ((DogeScriptVisitor<? extends T>)visitor).visitPrintLit(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintVarContext extends All_possible_printContext {
		public TerminalNode VarIdentifier() { return getToken(DogeScriptParser.VarIdentifier, 0); }
		public PrintVarContext(All_possible_printContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).enterPrintVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).exitPrintVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DogeScriptVisitor ) return ((DogeScriptVisitor<? extends T>)visitor).visitPrintVar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintFunctionContext extends All_possible_printContext {
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public PrintFunctionContext(All_possible_printContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).enterPrintFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).exitPrintFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DogeScriptVisitor ) return ((DogeScriptVisitor<? extends T>)visitor).visitPrintFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintExprContext extends All_possible_printContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrintExprContext(All_possible_printContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).enterPrintExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).exitPrintExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DogeScriptVisitor ) return ((DogeScriptVisitor<? extends T>)visitor).visitPrintExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final All_possible_printContext all_possible_print() throws RecognitionException {
		All_possible_printContext _localctx = new All_possible_printContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_all_possible_print);
		try {
			setState(203);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new PrintLitContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(199); literal();
				}
				break;
			case 2:
				_localctx = new PrintVarContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(200); match(VarIdentifier);
				}
				break;
			case 3:
				_localctx = new PrintFunctionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(201); function_call();
				}
				break;
			case 4:
				_localctx = new PrintExprContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(202); expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Scan_statementContext extends ParserRuleContext {
		public Scan_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scan_statement; }
	 
		public Scan_statementContext() { }
		public void copyFrom(Scan_statementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ScanStatementContext extends Scan_statementContext {
		public TerminalNode ScanStarter() { return getToken(DogeScriptParser.ScanStarter, 0); }
		public DatatypeContext datatype() {
			return getRuleContext(DatatypeContext.class,0);
		}
		public TerminalNode VarIdentifier() { return getToken(DogeScriptParser.VarIdentifier, 0); }
		public ScanStatementContext(Scan_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).enterScanStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).exitScanStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DogeScriptVisitor ) return ((DogeScriptVisitor<? extends T>)visitor).visitScanStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Scan_statementContext scan_statement() throws RecognitionException {
		Scan_statementContext _localctx = new Scan_statementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_scan_statement);
		try {
			_localctx = new ScanStatementContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(205); match(ScanStarter);
			setState(206); datatype();
			setState(207); match(VarIdentifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Variable_declarationContext extends ParserRuleContext {
		public Variable_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_declaration; }
	 
		public Variable_declarationContext() { }
		public void copyFrom(Variable_declarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Vardec3Context extends Variable_declarationContext {
		public TerminalNode VarDecStarter() { return getToken(DogeScriptParser.VarDecStarter, 0); }
		public TerminalNode AssOp() { return getToken(DogeScriptParser.AssOp, 0); }
		public TerminalNode VarIdentifier() { return getToken(DogeScriptParser.VarIdentifier, 0); }
		public Returns_array_valueContext returns_array_value() {
			return getRuleContext(Returns_array_valueContext.class,0);
		}
		public Datatype_arrayContext datatype_array() {
			return getRuleContext(Datatype_arrayContext.class,0);
		}
		public Vardec3Context(Variable_declarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).enterVardec3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).exitVardec3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DogeScriptVisitor ) return ((DogeScriptVisitor<? extends T>)visitor).visitVardec3(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VardecContext extends Variable_declarationContext {
		public TerminalNode VarDecStarter() { return getToken(DogeScriptParser.VarDecStarter, 0); }
		public Variable_instanceContext variable_instance() {
			return getRuleContext(Variable_instanceContext.class,0);
		}
		public DatatypeContext datatype() {
			return getRuleContext(DatatypeContext.class,0);
		}
		public VardecContext(Variable_declarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).enterVardec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).exitVardec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DogeScriptVisitor ) return ((DogeScriptVisitor<? extends T>)visitor).visitVardec(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Vardec2Context extends Variable_declarationContext {
		public Returns_valueContext returns_value() {
			return getRuleContext(Returns_valueContext.class,0);
		}
		public TerminalNode VarDecStarter() { return getToken(DogeScriptParser.VarDecStarter, 0); }
		public DatatypeContext datatype() {
			return getRuleContext(DatatypeContext.class,0);
		}
		public TerminalNode AssOp() { return getToken(DogeScriptParser.AssOp, 0); }
		public TerminalNode VarIdentifier() { return getToken(DogeScriptParser.VarIdentifier, 0); }
		public Vardec2Context(Variable_declarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).enterVardec2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).exitVardec2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DogeScriptVisitor ) return ((DogeScriptVisitor<? extends T>)visitor).visitVardec2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_declarationContext variable_declaration() throws RecognitionException {
		Variable_declarationContext _localctx = new Variable_declarationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_variable_declaration);
		try {
			setState(226);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new VardecContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				System.out.println("in variable_declaration");
				setState(210); match(VarDecStarter);
				setState(211); datatype();
				setState(212); variable_instance();
				}
				break;
			case 2:
				_localctx = new Vardec2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(214); match(VarDecStarter);
				setState(215); datatype();
				setState(216); match(VarIdentifier);
				setState(217); match(AssOp);
				setState(218); returns_value();
				}
				break;
			case 3:
				_localctx = new Vardec3Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(220); match(VarDecStarter);
				setState(221); datatype_array();
				setState(222); match(VarIdentifier);
				setState(223); match(AssOp);
				setState(224); returns_array_value();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Constant_declarationContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode ConDecStarter() { return getToken(DogeScriptParser.ConDecStarter, 0); }
		public DatatypeContext datatype() {
			return getRuleContext(DatatypeContext.class,0);
		}
		public TerminalNode AssOp() { return getToken(DogeScriptParser.AssOp, 0); }
		public TerminalNode VarIdentifier() { return getToken(DogeScriptParser.VarIdentifier, 0); }
		public Constant_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).enterConstant_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).exitConstant_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DogeScriptVisitor ) return ((DogeScriptVisitor<? extends T>)visitor).visitConstant_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Constant_declarationContext constant_declaration() throws RecognitionException {
		Constant_declarationContext _localctx = new Constant_declarationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_constant_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228); match(ConDecStarter);
			setState(229); datatype();
			setState(230); match(VarIdentifier);
			setState(231); match(AssOp);
			setState(232); literal();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode CharLit() { return getToken(DogeScriptParser.CharLit, 0); }
		public TerminalNode BoolLit() { return getToken(DogeScriptParser.BoolLit, 0); }
		public TerminalNode FloatLit() { return getToken(DogeScriptParser.FloatLit, 0); }
		public TerminalNode IntLit() { return getToken(DogeScriptParser.IntLit, 0); }
		public TerminalNode StringLit() { return getToken(DogeScriptParser.StringLit, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DogeScriptVisitor ) return ((DogeScriptVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_literal);
		try {
			setState(240);
			switch (_input.LA(1)) {
			case IntLit:
				enterOuterAlt(_localctx, 1);
				{
				System.out.println("in literal");
				setState(235); match(IntLit);
				}
				break;
			case FloatLit:
				enterOuterAlt(_localctx, 2);
				{
				setState(236); match(FloatLit);
				}
				break;
			case StringLit:
				enterOuterAlt(_localctx, 3);
				{
				setState(237); match(StringLit);
				}
				break;
			case CharLit:
				enterOuterAlt(_localctx, 4);
				{
				setState(238); match(CharLit);
				}
				break;
			case BoolLit:
				enterOuterAlt(_localctx, 5);
				{
				setState(239); match(BoolLit);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Array_literalContext extends ParserRuleContext {
		public Array_literalContext array_literal() {
			return getRuleContext(Array_literalContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode Comma() { return getToken(DogeScriptParser.Comma, 0); }
		public Array_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).enterArray_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).exitArray_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DogeScriptVisitor ) return ((DogeScriptVisitor<? extends T>)visitor).visitArray_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_literalContext array_literal() throws RecognitionException {
		Array_literalContext _localctx = new Array_literalContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_array_literal);
		try {
			setState(248);
			switch (_input.LA(1)) {
			case Comma:
				enterOuterAlt(_localctx, 1);
				{
				System.out.println("in array literal");
				setState(243); match(Comma);
				setState(244); literal();
				setState(245); array_literal();
				}
				break;
			case CloseBrace:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DatatypeContext extends ParserRuleContext {
		public TerminalNode IntDataType() { return getToken(DogeScriptParser.IntDataType, 0); }
		public TerminalNode BoolDataType() { return getToken(DogeScriptParser.BoolDataType, 0); }
		public TerminalNode CharDataType() { return getToken(DogeScriptParser.CharDataType, 0); }
		public TerminalNode StringDataType() { return getToken(DogeScriptParser.StringDataType, 0); }
		public DatatypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_datatype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).enterDatatype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).exitDatatype(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DogeScriptVisitor ) return ((DogeScriptVisitor<? extends T>)visitor).visitDatatype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DatatypeContext datatype() throws RecognitionException {
		DatatypeContext _localctx = new DatatypeContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_datatype);
		try {
			setState(255);
			switch (_input.LA(1)) {
			case IntDataType:
				enterOuterAlt(_localctx, 1);
				{
				System.out.println("in datatype");
				setState(251); match(IntDataType);
				}
				break;
			case CharDataType:
				enterOuterAlt(_localctx, 2);
				{
				setState(252); match(CharDataType);
				}
				break;
			case BoolDataType:
				enterOuterAlt(_localctx, 3);
				{
				setState(253); match(BoolDataType);
				}
				break;
			case StringDataType:
				enterOuterAlt(_localctx, 4);
				{
				setState(254); match(StringDataType);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Datatype_arrayContext extends ParserRuleContext {
		public TerminalNode Array() { return getToken(DogeScriptParser.Array, 0); }
		public DatatypeContext datatype() {
			return getRuleContext(DatatypeContext.class,0);
		}
		public Datatype_arrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_datatype_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).enterDatatype_array(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).exitDatatype_array(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DogeScriptVisitor ) return ((DogeScriptVisitor<? extends T>)visitor).visitDatatype_array(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Datatype_arrayContext datatype_array() throws RecognitionException {
		Datatype_arrayContext _localctx = new Datatype_arrayContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_datatype_array);
		try {
			enterOuterAlt(_localctx, 1);
			{
			System.out.println("in datatype array");
			setState(258); datatype();
			setState(259); match(Array);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Variable_instanceContext extends ParserRuleContext {
		public Variable_instanceContext variable_instance() {
			return getRuleContext(Variable_instanceContext.class,0);
		}
		public TerminalNode Comma() { return getToken(DogeScriptParser.Comma, 0); }
		public TerminalNode VarIdentifier() { return getToken(DogeScriptParser.VarIdentifier, 0); }
		public Variable_instanceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_instance; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).enterVariable_instance(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).exitVariable_instance(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DogeScriptVisitor ) return ((DogeScriptVisitor<? extends T>)visitor).visitVariable_instance(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_instanceContext variable_instance() throws RecognitionException {
		Variable_instanceContext _localctx = new Variable_instanceContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_variable_instance);
		try {
			setState(266);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				System.out.println("in variable_instance");
				setState(262); match(VarIdentifier);
				setState(263); match(Comma);
				setState(264); variable_instance();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(265); match(VarIdentifier);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Returns_valueContext extends ParserRuleContext {
		public Returns_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returns_value; }
	 
		public Returns_valueContext() { }
		public void copyFrom(Returns_valueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ReturnLitContext extends Returns_valueContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ReturnLitContext(Returns_valueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).enterReturnLit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).exitReturnLit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DogeScriptVisitor ) return ((DogeScriptVisitor<? extends T>)visitor).visitReturnLit(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReturnVarContext extends Returns_valueContext {
		public TerminalNode VarIdentifier() { return getToken(DogeScriptParser.VarIdentifier, 0); }
		public ReturnVarContext(Returns_valueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).enterReturnVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).exitReturnVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DogeScriptVisitor ) return ((DogeScriptVisitor<? extends T>)visitor).visitReturnVar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReturnNullContext extends Returns_valueContext {
		public TerminalNode NullKeyword() { return getToken(DogeScriptParser.NullKeyword, 0); }
		public ReturnNullContext(Returns_valueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).enterReturnNull(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).exitReturnNull(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DogeScriptVisitor ) return ((DogeScriptVisitor<? extends T>)visitor).visitReturnNull(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReturnExprContext extends Returns_valueContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnExprContext(Returns_valueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).enterReturnExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).exitReturnExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DogeScriptVisitor ) return ((DogeScriptVisitor<? extends T>)visitor).visitReturnExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReturnFuncCallContext extends Returns_valueContext {
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public ReturnFuncCallContext(Returns_valueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).enterReturnFuncCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).exitReturnFuncCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DogeScriptVisitor ) return ((DogeScriptVisitor<? extends T>)visitor).visitReturnFuncCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Returns_valueContext returns_value() throws RecognitionException {
		Returns_valueContext _localctx = new Returns_valueContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_returns_value);
		try {
			setState(274);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				_localctx = new ReturnLitContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				System.out.println("in returns_value");
				setState(269); literal();
				}
				break;
			case 2:
				_localctx = new ReturnVarContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(270); match(VarIdentifier);
				}
				break;
			case 3:
				_localctx = new ReturnExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(271); expression();
				}
				break;
			case 4:
				_localctx = new ReturnFuncCallContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(272); function_call();
				}
				break;
			case 5:
				_localctx = new ReturnNullContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(273); match(NullKeyword);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Returns_array_valueContext extends ParserRuleContext {
		public TerminalNode CloseBrace() { return getToken(DogeScriptParser.CloseBrace, 0); }
		public Array_literalContext array_literal() {
			return getRuleContext(Array_literalContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode OpenBrace() { return getToken(DogeScriptParser.OpenBrace, 0); }
		public Returns_array_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returns_array_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).enterReturns_array_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).exitReturns_array_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DogeScriptVisitor ) return ((DogeScriptVisitor<? extends T>)visitor).visitReturns_array_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Returns_array_valueContext returns_array_value() throws RecognitionException {
		Returns_array_valueContext _localctx = new Returns_array_valueContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_returns_array_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276); match(OpenBrace);
			setState(277); literal();
			setState(278); array_literal();
			setState(279); match(CloseBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public Low_priorContext low_prior() {
			return getRuleContext(Low_priorContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DogeScriptVisitor ) return ((DogeScriptVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281); low_prior();
			System.out.println("in expression");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Low_priorContext extends ParserRuleContext {
		public Low_priorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_low_prior; }
	 
		public Low_priorContext() { }
		public void copyFrom(Low_priorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Low_prior2Context extends Low_priorContext {
		public High_priorContext high_prior() {
			return getRuleContext(High_priorContext.class,0);
		}
		public Low_prior2Context(Low_priorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).enterLow_prior2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).exitLow_prior2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DogeScriptVisitor ) return ((DogeScriptVisitor<? extends T>)visitor).visitLow_prior2(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LpExprContext extends Low_priorContext {
		public High_priorContext high_prior() {
			return getRuleContext(High_priorContext.class,0);
		}
		public Low_priorContext low_prior() {
			return getRuleContext(Low_priorContext.class,0);
		}
		public TerminalNode AddOp() { return getToken(DogeScriptParser.AddOp, 0); }
		public TerminalNode SubOp() { return getToken(DogeScriptParser.SubOp, 0); }
		public LpExprContext(Low_priorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).enterLpExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).exitLpExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DogeScriptVisitor ) return ((DogeScriptVisitor<? extends T>)visitor).visitLpExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Low_priorContext low_prior() throws RecognitionException {
		Low_priorContext _localctx = new Low_priorContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_low_prior);
		int _la;
		try {
			setState(289);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				_localctx = new LpExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(284); high_prior();
				setState(285);
				_la = _input.LA(1);
				if ( !(_la==AddOp || _la==SubOp) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(286); low_prior();
				}
				break;
			case 2:
				_localctx = new Low_prior2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(288); high_prior();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class High_priorContext extends ParserRuleContext {
		public High_priorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_high_prior; }
	 
		public High_priorContext() { }
		public void copyFrom(High_priorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class High_prior2Context extends High_priorContext {
		public SignintContext signint() {
			return getRuleContext(SignintContext.class,0);
		}
		public High_prior2Context(High_priorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).enterHigh_prior2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).exitHigh_prior2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DogeScriptVisitor ) return ((DogeScriptVisitor<? extends T>)visitor).visitHigh_prior2(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class HpExprContext extends High_priorContext {
		public TerminalNode MulOp() { return getToken(DogeScriptParser.MulOp, 0); }
		public TerminalNode DivOp() { return getToken(DogeScriptParser.DivOp, 0); }
		public High_priorContext high_prior() {
			return getRuleContext(High_priorContext.class,0);
		}
		public TerminalNode ModOp() { return getToken(DogeScriptParser.ModOp, 0); }
		public SignintContext signint() {
			return getRuleContext(SignintContext.class,0);
		}
		public HpExprContext(High_priorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).enterHpExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).exitHpExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DogeScriptVisitor ) return ((DogeScriptVisitor<? extends T>)visitor).visitHpExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final High_priorContext high_prior() throws RecognitionException {
		High_priorContext _localctx = new High_priorContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_high_prior);
		int _la;
		try {
			setState(296);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new HpExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(291); signint();
				setState(292);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MulOp) | (1L << DivOp) | (1L << ModOp))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(293); high_prior();
				}
				break;
			case 2:
				_localctx = new High_prior2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(295); signint();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SignintContext extends ParserRuleContext {
		public SignintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signint; }
	 
		public SignintContext() { }
		public void copyFrom(SignintContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NegSignIntContext extends SignintContext {
		public Top_priorContext top_prior() {
			return getRuleContext(Top_priorContext.class,0);
		}
		public NegSignIntContext(SignintContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).enterNegSignInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).exitNegSignInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DogeScriptVisitor ) return ((DogeScriptVisitor<? extends T>)visitor).visitNegSignInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PosSignIntContext extends SignintContext {
		public Top_priorContext top_prior() {
			return getRuleContext(Top_priorContext.class,0);
		}
		public PosSignIntContext(SignintContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).enterPosSignInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).exitPosSignInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DogeScriptVisitor ) return ((DogeScriptVisitor<? extends T>)visitor).visitPosSignInt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SignintContext signint() throws RecognitionException {
		SignintContext _localctx = new SignintContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_signint);
		try {
			setState(301);
			switch (_input.LA(1)) {
			case SubOp:
				_localctx = new NegSignIntContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(298); match(SubOp);
				setState(299); top_prior();
				}
				break;
			case OpenParenthesis:
			case IntLit:
			case VarIdentifier:
				_localctx = new PosSignIntContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(300); top_prior();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Top_priorContext extends ParserRuleContext {
		public Top_priorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_top_prior; }
	 
		public Top_priorContext() { }
		public void copyFrom(Top_priorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TpParenthesisContext extends Top_priorContext {
		public TerminalNode OpenParenthesis() { return getToken(DogeScriptParser.OpenParenthesis, 0); }
		public TerminalNode CloseParenthesis() { return getToken(DogeScriptParser.CloseParenthesis, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TpParenthesisContext(Top_priorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).enterTpParenthesis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).exitTpParenthesis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DogeScriptVisitor ) return ((DogeScriptVisitor<? extends T>)visitor).visitTpParenthesis(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TpIntLitContext extends Top_priorContext {
		public TerminalNode IntLit() { return getToken(DogeScriptParser.IntLit, 0); }
		public TpIntLitContext(Top_priorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).enterTpIntLit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).exitTpIntLit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DogeScriptVisitor ) return ((DogeScriptVisitor<? extends T>)visitor).visitTpIntLit(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TpVarIdentifierContext extends Top_priorContext {
		public TerminalNode VarIdentifier() { return getToken(DogeScriptParser.VarIdentifier, 0); }
		public TpVarIdentifierContext(Top_priorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).enterTpVarIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).exitTpVarIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DogeScriptVisitor ) return ((DogeScriptVisitor<? extends T>)visitor).visitTpVarIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Top_priorContext top_prior() throws RecognitionException {
		Top_priorContext _localctx = new Top_priorContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_top_prior);
		try {
			setState(309);
			switch (_input.LA(1)) {
			case IntLit:
				_localctx = new TpIntLitContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(303); match(IntLit);
				}
				break;
			case OpenParenthesis:
				_localctx = new TpParenthesisContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(304); match(OpenParenthesis);
				setState(305); expression();
				setState(306); match(CloseParenthesis);
				}
				break;
			case VarIdentifier:
				_localctx = new TpVarIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(308); match(VarIdentifier);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assignment_statementContext extends ParserRuleContext {
		public Assignment_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_statement; }
	 
		public Assignment_statementContext() { }
		public void copyFrom(Assignment_statementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AssignIncContext extends Assignment_statementContext {
		public TerminalNode IncrementOp() { return getToken(DogeScriptParser.IncrementOp, 0); }
		public TerminalNode VarIdentifier() { return getToken(DogeScriptParser.VarIdentifier, 0); }
		public AssignIncContext(Assignment_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).enterAssignInc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).exitAssignInc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DogeScriptVisitor ) return ((DogeScriptVisitor<? extends T>)visitor).visitAssignInc(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignVarContext extends Assignment_statementContext {
		public Returns_valueContext returns_value() {
			return getRuleContext(Returns_valueContext.class,0);
		}
		public TerminalNode AssOp() { return getToken(DogeScriptParser.AssOp, 0); }
		public TerminalNode VarIdentifier() { return getToken(DogeScriptParser.VarIdentifier, 0); }
		public AssignVarContext(Assignment_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).enterAssignVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).exitAssignVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DogeScriptVisitor ) return ((DogeScriptVisitor<? extends T>)visitor).visitAssignVar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignDecContext extends Assignment_statementContext {
		public TerminalNode DecrementOp() { return getToken(DogeScriptParser.DecrementOp, 0); }
		public TerminalNode VarIdentifier() { return getToken(DogeScriptParser.VarIdentifier, 0); }
		public AssignDecContext(Assignment_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).enterAssignDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).exitAssignDec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DogeScriptVisitor ) return ((DogeScriptVisitor<? extends T>)visitor).visitAssignDec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assignment_statementContext assignment_statement() throws RecognitionException {
		Assignment_statementContext _localctx = new Assignment_statementContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_assignment_statement);
		try {
			setState(319);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				_localctx = new AssignVarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				System.out.println("in assignment_statement");
				setState(312); match(VarIdentifier);
				setState(313); match(AssOp);
				setState(314); returns_value();
				}
				break;
			case 2:
				_localctx = new AssignIncContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(315); match(VarIdentifier);
				setState(316); match(IncrementOp);
				}
				break;
			case 3:
				_localctx = new AssignDecContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(317); match(VarIdentifier);
				setState(318); match(DecrementOp);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Conditional_statementContext extends ParserRuleContext {
		public Continue_conditionContext continue_condition() {
			return getRuleContext(Continue_conditionContext.class,0);
		}
		public Start_conditionContext start_condition() {
			return getRuleContext(Start_conditionContext.class,0);
		}
		public End_conditionContext end_condition() {
			return getRuleContext(End_conditionContext.class,0);
		}
		public Conditional_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).enterConditional_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).exitConditional_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DogeScriptVisitor ) return ((DogeScriptVisitor<? extends T>)visitor).visitConditional_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Conditional_statementContext conditional_statement() throws RecognitionException {
		Conditional_statementContext _localctx = new Conditional_statementContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_conditional_statement);
		try {
			setState(333);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				System.out.println("in conditional_statement");
				setState(322); start_condition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(323); start_condition();
				setState(324); end_condition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(326); start_condition();
				setState(327); continue_condition();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(329); start_condition();
				setState(330); continue_condition();
				setState(331); end_condition();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Start_conditionContext extends ParserRuleContext {
		public All_possible_single_statementsContext all_possible_single_statements() {
			return getRuleContext(All_possible_single_statementsContext.class,0);
		}
		public TerminalNode CloseBrace() { return getToken(DogeScriptParser.CloseBrace, 0); }
		public TerminalNode OpenParenthesis() { return getToken(DogeScriptParser.OpenParenthesis, 0); }
		public TerminalNode CloseParenthesis() { return getToken(DogeScriptParser.CloseParenthesis, 0); }
		public TerminalNode OpenBrace() { return getToken(DogeScriptParser.OpenBrace, 0); }
		public TerminalNode IfKeyword() { return getToken(DogeScriptParser.IfKeyword, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public CodeblockContext codeblock() {
			return getRuleContext(CodeblockContext.class,0);
		}
		public Start_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).enterStart_condition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).exitStart_condition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DogeScriptVisitor ) return ((DogeScriptVisitor<? extends T>)visitor).visitStart_condition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Start_conditionContext start_condition() throws RecognitionException {
		Start_conditionContext _localctx = new Start_conditionContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_start_condition);
		try {
			setState(358);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				System.out.println("in start_condition");
				setState(336); match(IfKeyword);
				setState(337); match(OpenParenthesis);
				setState(338); condition();
				setState(339); match(CloseParenthesis);
				setState(340); all_possible_single_statements();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(342); match(IfKeyword);
				setState(343); match(OpenParenthesis);
				setState(344); condition();
				setState(345); match(CloseParenthesis);
				setState(346); match(OpenBrace);
				setState(347); all_possible_single_statements();
				setState(348); match(CloseBrace);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(350); match(IfKeyword);
				setState(351); match(OpenParenthesis);
				setState(352); condition();
				setState(353); match(CloseParenthesis);
				setState(354); match(OpenBrace);
				setState(355); codeblock();
				setState(356); match(CloseBrace);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class End_conditionContext extends ParserRuleContext {
		public All_possible_single_statementsContext all_possible_single_statements() {
			return getRuleContext(All_possible_single_statementsContext.class,0);
		}
		public TerminalNode CloseBrace() { return getToken(DogeScriptParser.CloseBrace, 0); }
		public TerminalNode OpenParenthesis() { return getToken(DogeScriptParser.OpenParenthesis, 0); }
		public TerminalNode CloseParenthesis() { return getToken(DogeScriptParser.CloseParenthesis, 0); }
		public TerminalNode OpenBrace() { return getToken(DogeScriptParser.OpenBrace, 0); }
		public TerminalNode ElseKeyword() { return getToken(DogeScriptParser.ElseKeyword, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public CodeblockContext codeblock() {
			return getRuleContext(CodeblockContext.class,0);
		}
		public End_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_end_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).enterEnd_condition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).exitEnd_condition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DogeScriptVisitor ) return ((DogeScriptVisitor<? extends T>)visitor).visitEnd_condition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final End_conditionContext end_condition() throws RecognitionException {
		End_conditionContext _localctx = new End_conditionContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_end_condition);
		try {
			setState(385);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				System.out.println("in end_condition");
				setState(361); match(ElseKeyword);
				setState(362); match(OpenParenthesis);
				setState(363); condition();
				setState(364); match(CloseParenthesis);
				setState(365); all_possible_single_statements();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(367); match(ElseKeyword);
				setState(368); match(OpenParenthesis);
				setState(369); condition();
				setState(370); match(CloseParenthesis);
				setState(371); match(OpenBrace);
				setState(372); all_possible_single_statements();
				setState(373); match(CloseBrace);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(375); match(ElseKeyword);
				setState(376); match(OpenParenthesis);
				setState(377); condition();
				setState(378); match(CloseParenthesis);
				setState(379); match(OpenBrace);
				setState(380); codeblock();
				setState(381); match(CloseBrace);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(383); match(ElseKeyword);
				setState(384); all_possible_single_statements();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Continue_conditionContext extends ParserRuleContext {
		public All_possible_single_statementsContext all_possible_single_statements() {
			return getRuleContext(All_possible_single_statementsContext.class,0);
		}
		public TerminalNode CloseBrace() { return getToken(DogeScriptParser.CloseBrace, 0); }
		public TerminalNode OpenParenthesis() { return getToken(DogeScriptParser.OpenParenthesis, 0); }
		public TerminalNode CloseParenthesis() { return getToken(DogeScriptParser.CloseParenthesis, 0); }
		public TerminalNode OpenBrace() { return getToken(DogeScriptParser.OpenBrace, 0); }
		public TerminalNode ElseIfKeyword() { return getToken(DogeScriptParser.ElseIfKeyword, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public CodeblockContext codeblock() {
			return getRuleContext(CodeblockContext.class,0);
		}
		public Continue_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continue_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).enterContinue_condition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).exitContinue_condition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DogeScriptVisitor ) return ((DogeScriptVisitor<? extends T>)visitor).visitContinue_condition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Continue_conditionContext continue_condition() throws RecognitionException {
		Continue_conditionContext _localctx = new Continue_conditionContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_continue_condition);
		try {
			setState(409);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				System.out.println("in continue_condition");
				setState(388); match(ElseIfKeyword);
				setState(389); match(OpenParenthesis);
				setState(390); condition();
				setState(391); match(CloseParenthesis);
				setState(392); all_possible_single_statements();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(394); match(ElseIfKeyword);
				setState(395); match(OpenParenthesis);
				setState(396); condition();
				setState(397); match(CloseParenthesis);
				setState(398); all_possible_single_statements();
				setState(399); match(CloseBrace);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(401); match(ElseIfKeyword);
				setState(402); match(OpenParenthesis);
				setState(403); condition();
				setState(404); match(CloseParenthesis);
				setState(405); match(OpenBrace);
				setState(406); codeblock();
				setState(407); match(CloseBrace);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Loop_statementContext extends ParserRuleContext {
		public Event_loop_statementContext event_loop_statement() {
			return getRuleContext(Event_loop_statementContext.class,0);
		}
		public Count_loop_statementContext count_loop_statement() {
			return getRuleContext(Count_loop_statementContext.class,0);
		}
		public Repeatuntil_loop_statementContext repeatuntil_loop_statement() {
			return getRuleContext(Repeatuntil_loop_statementContext.class,0);
		}
		public Loop_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).enterLoop_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).exitLoop_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DogeScriptVisitor ) return ((DogeScriptVisitor<? extends T>)visitor).visitLoop_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Loop_statementContext loop_statement() throws RecognitionException {
		Loop_statementContext _localctx = new Loop_statementContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_loop_statement);
		try {
			setState(415);
			switch (_input.LA(1)) {
			case EventLoopKeyword:
				enterOuterAlt(_localctx, 1);
				{
				System.out.println("in LOOPS");
				setState(412); event_loop_statement();
				}
				break;
			case CountLoopKeyword:
				enterOuterAlt(_localctx, 2);
				{
				setState(413); count_loop_statement();
				}
				break;
			case RepeatUntilLoopKeyword:
				enterOuterAlt(_localctx, 3);
				{
				setState(414); repeatuntil_loop_statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Event_loop_statementContext extends ParserRuleContext {
		public All_possible_single_statementsContext all_possible_single_statements() {
			return getRuleContext(All_possible_single_statementsContext.class,0);
		}
		public TerminalNode EventLoopKeyword() { return getToken(DogeScriptParser.EventLoopKeyword, 0); }
		public TerminalNode CloseBrace() { return getToken(DogeScriptParser.CloseBrace, 0); }
		public TerminalNode OpenParenthesis() { return getToken(DogeScriptParser.OpenParenthesis, 0); }
		public TerminalNode CloseParenthesis() { return getToken(DogeScriptParser.CloseParenthesis, 0); }
		public TerminalNode OpenBrace() { return getToken(DogeScriptParser.OpenBrace, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public CodeblockContext codeblock() {
			return getRuleContext(CodeblockContext.class,0);
		}
		public Event_loop_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_event_loop_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).enterEvent_loop_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).exitEvent_loop_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DogeScriptVisitor ) return ((DogeScriptVisitor<? extends T>)visitor).visitEvent_loop_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Event_loop_statementContext event_loop_statement() throws RecognitionException {
		Event_loop_statementContext _localctx = new Event_loop_statementContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_event_loop_statement);
		try {
			setState(432);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				System.out.println("in event_loop_statement");
				setState(418); match(EventLoopKeyword);
				setState(419); match(OpenParenthesis);
				setState(420); condition();
				setState(421); match(CloseParenthesis);
				setState(422); match(OpenBrace);
				setState(423); codeblock();
				setState(424); match(CloseBrace);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(426); match(EventLoopKeyword);
				setState(427); match(OpenParenthesis);
				setState(428); condition();
				setState(429); match(CloseParenthesis);
				setState(430); all_possible_single_statements();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Count_loop_statementContext extends ParserRuleContext {
		public TerminalNode Terminator(int i) {
			return getToken(DogeScriptParser.Terminator, i);
		}
		public TerminalNode CloseBrace() { return getToken(DogeScriptParser.CloseBrace, 0); }
		public TerminalNode OpenParenthesis() { return getToken(DogeScriptParser.OpenParenthesis, 0); }
		public Afterthought_statementContext afterthought_statement() {
			return getRuleContext(Afterthought_statementContext.class,0);
		}
		public TerminalNode CloseParenthesis() { return getToken(DogeScriptParser.CloseParenthesis, 0); }
		public Variable_declarationContext variable_declaration() {
			return getRuleContext(Variable_declarationContext.class,0);
		}
		public List<TerminalNode> Terminator() { return getTokens(DogeScriptParser.Terminator); }
		public TerminalNode OpenBrace() { return getToken(DogeScriptParser.OpenBrace, 0); }
		public Assignment_statementContext assignment_statement() {
			return getRuleContext(Assignment_statementContext.class,0);
		}
		public TerminalNode CountLoopKeyword() { return getToken(DogeScriptParser.CountLoopKeyword, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public CodeblockContext codeblock() {
			return getRuleContext(CodeblockContext.class,0);
		}
		public Count_loop_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_count_loop_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).enterCount_loop_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).exitCount_loop_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DogeScriptVisitor ) return ((DogeScriptVisitor<? extends T>)visitor).visitCount_loop_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Count_loop_statementContext count_loop_statement() throws RecognitionException {
		Count_loop_statementContext _localctx = new Count_loop_statementContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_count_loop_statement);
		try {
			setState(459);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				System.out.println("in count_loop_statement");
				setState(435); match(CountLoopKeyword);
				setState(436); match(OpenParenthesis);
				setState(437); variable_declaration();
				setState(438); match(Terminator);
				setState(439); condition();
				setState(440); match(Terminator);
				setState(441); afterthought_statement();
				setState(442); match(CloseParenthesis);
				setState(443); match(OpenBrace);
				setState(444); codeblock();
				setState(445); match(CloseBrace);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(447); match(CountLoopKeyword);
				setState(448); match(OpenParenthesis);
				setState(449); assignment_statement();
				setState(450); match(Terminator);
				setState(451); condition();
				setState(452); match(Terminator);
				setState(453); afterthought_statement();
				setState(454); match(CloseParenthesis);
				setState(455); match(OpenBrace);
				setState(456); codeblock();
				setState(457); match(CloseBrace);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Repeatuntil_loop_statementContext extends ParserRuleContext {
		public TerminalNode RepeatUntilLoopKeyword() { return getToken(DogeScriptParser.RepeatUntilLoopKeyword, 0); }
		public TerminalNode CloseBrace() { return getToken(DogeScriptParser.CloseBrace, 0); }
		public TerminalNode EventLoopKeyword() { return getToken(DogeScriptParser.EventLoopKeyword, 0); }
		public TerminalNode OpenParenthesis() { return getToken(DogeScriptParser.OpenParenthesis, 0); }
		public TerminalNode CloseParenthesis() { return getToken(DogeScriptParser.CloseParenthesis, 0); }
		public TerminalNode OpenBrace() { return getToken(DogeScriptParser.OpenBrace, 0); }
		public TerminalNode Terminator() { return getToken(DogeScriptParser.Terminator, 0); }
		public CodeblockContext codeblock() {
			return getRuleContext(CodeblockContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public Repeatuntil_loop_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeatuntil_loop_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).enterRepeatuntil_loop_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).exitRepeatuntil_loop_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DogeScriptVisitor ) return ((DogeScriptVisitor<? extends T>)visitor).visitRepeatuntil_loop_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Repeatuntil_loop_statementContext repeatuntil_loop_statement() throws RecognitionException {
		Repeatuntil_loop_statementContext _localctx = new Repeatuntil_loop_statementContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_repeatuntil_loop_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			System.out.println("in repeatuntil_loop_statement");
			setState(462); match(RepeatUntilLoopKeyword);
			setState(463); match(OpenBrace);
			setState(464); codeblock();
			setState(465); match(CloseBrace);
			setState(466); match(EventLoopKeyword);
			setState(467); match(OpenParenthesis);
			setState(468); condition();
			setState(469); match(CloseParenthesis);
			setState(470); match(Terminator);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionContext extends ParserRuleContext {
		public Logical_operatorContext logical_operator() {
			return getRuleContext(Logical_operatorContext.class,0);
		}
		public ConditionBContext conditionB() {
			return getRuleContext(ConditionBContext.class,0);
		}
		public TerminalNode OpenParenthesis() { return getToken(DogeScriptParser.OpenParenthesis, 0); }
		public TerminalNode CloseParenthesis() { return getToken(DogeScriptParser.CloseParenthesis, 0); }
		public ConditionEContext conditionE() {
			return getRuleContext(ConditionEContext.class,0);
		}
		public ConditionVContext conditionV() {
			return getRuleContext(ConditionVContext.class,0);
		}
		public ConditionFContext conditionF() {
			return getRuleContext(ConditionFContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DogeScriptVisitor ) return ((DogeScriptVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_condition);
		try {
			setState(496);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(472); conditionV();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(473); conditionE();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(474); conditionF();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(475); conditionB();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(476); match(OpenParenthesis);
				setState(477); condition();
				setState(478); match(CloseParenthesis);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(480); conditionV();
				setState(481); logical_operator();
				setState(482); condition();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(484); conditionE();
				setState(485); logical_operator();
				setState(486); condition();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(488); conditionF();
				setState(489); logical_operator();
				setState(490); condition();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(492); conditionB();
				setState(493); logical_operator();
				setState(494); condition();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionBContext extends ParserRuleContext {
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public TerminalNode BoolLit() { return getToken(DogeScriptParser.BoolLit, 0); }
		public Comparison_bool_litContext comparison_bool_lit() {
			return getRuleContext(Comparison_bool_litContext.class,0);
		}
		public ConditionBContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionB; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).enterConditionB(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).exitConditionB(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DogeScriptVisitor ) return ((DogeScriptVisitor<? extends T>)visitor).visitConditionB(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionBContext conditionB() throws RecognitionException {
		ConditionBContext _localctx = new ConditionBContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_conditionB);
		try {
			setState(503);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(498); match(BoolLit);
				setState(499); comparison_bool_lit();
				setState(500); function_call();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(502); match(BoolLit);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionVContext extends ParserRuleContext {
		public TerminalNode VarIdentifier(int i) {
			return getToken(DogeScriptParser.VarIdentifier, i);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> VarIdentifier() { return getTokens(DogeScriptParser.VarIdentifier); }
		public ConditionVContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionV; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).enterConditionV(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).exitConditionV(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DogeScriptVisitor ) return ((DogeScriptVisitor<? extends T>)visitor).visitConditionV(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionVContext conditionV() throws RecognitionException {
		ConditionVContext _localctx = new ConditionVContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_conditionV);
		try {
			setState(518);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(505); match(VarIdentifier);
				setState(506); comparison();
				setState(507); match(VarIdentifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(509); match(VarIdentifier);
				setState(510); comparison();
				setState(511); expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(513); match(VarIdentifier);
				setState(514); comparison();
				setState(515); function_call();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(517); match(VarIdentifier);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionEContext extends ParserRuleContext {
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode VarIdentifier() { return getToken(DogeScriptParser.VarIdentifier, 0); }
		public ConditionEContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionE; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).enterConditionE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).exitConditionE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DogeScriptVisitor ) return ((DogeScriptVisitor<? extends T>)visitor).visitConditionE(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionEContext conditionE() throws RecognitionException {
		ConditionEContext _localctx = new ConditionEContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_conditionE);
		try {
			setState(532);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(520); expression();
				setState(521); comparison();
				setState(522); match(VarIdentifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(524); expression();
				setState(525); comparison();
				setState(526); expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(528); expression();
				setState(529); comparison();
				setState(530); function_call();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionFContext extends ParserRuleContext {
		public Function_callContext function_call(int i) {
			return getRuleContext(Function_callContext.class,i);
		}
		public List<Function_callContext> function_call() {
			return getRuleContexts(Function_callContext.class);
		}
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public TerminalNode BoolLit() { return getToken(DogeScriptParser.BoolLit, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode VarIdentifier() { return getToken(DogeScriptParser.VarIdentifier, 0); }
		public ConditionFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).enterConditionF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).exitConditionF(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DogeScriptVisitor ) return ((DogeScriptVisitor<? extends T>)visitor).visitConditionF(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionFContext conditionF() throws RecognitionException {
		ConditionFContext _localctx = new ConditionFContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_conditionF);
		try {
			setState(551);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(534); function_call();
				setState(535); comparison();
				setState(536); function_call();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(538); function_call();
				setState(539); comparison();
				setState(540); match(VarIdentifier);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(542); function_call();
				setState(543); comparison();
				setState(544); expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(546); function_call();
				setState(547); comparison();
				setState(548); match(BoolLit);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(550); function_call();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Comparison_bool_litContext extends ParserRuleContext {
		public TerminalNode NotEqualToOp() { return getToken(DogeScriptParser.NotEqualToOp, 0); }
		public TerminalNode EquaOp() { return getToken(DogeScriptParser.EquaOp, 0); }
		public Comparison_bool_litContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison_bool_lit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).enterComparison_bool_lit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).exitComparison_bool_lit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DogeScriptVisitor ) return ((DogeScriptVisitor<? extends T>)visitor).visitComparison_bool_lit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comparison_bool_litContext comparison_bool_lit() throws RecognitionException {
		Comparison_bool_litContext _localctx = new Comparison_bool_litContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_comparison_bool_lit);
		try {
			setState(556);
			switch (_input.LA(1)) {
			case EquaOp:
				enterOuterAlt(_localctx, 1);
				{
				System.out.println("in comparison bool lit");
				setState(554); match(EquaOp);
				}
				break;
			case NotEqualToOp:
				enterOuterAlt(_localctx, 2);
				{
				setState(555); match(NotEqualToOp);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComparisonContext extends ParserRuleContext {
		public TerminalNode LessThanOp() { return getToken(DogeScriptParser.LessThanOp, 0); }
		public TerminalNode GreaterThanEqualTo() { return getToken(DogeScriptParser.GreaterThanEqualTo, 0); }
		public TerminalNode GreaterThanOp() { return getToken(DogeScriptParser.GreaterThanOp, 0); }
		public TerminalNode LessThanEqualTo() { return getToken(DogeScriptParser.LessThanEqualTo, 0); }
		public TerminalNode NotEqualToOp() { return getToken(DogeScriptParser.NotEqualToOp, 0); }
		public TerminalNode EquaOp() { return getToken(DogeScriptParser.EquaOp, 0); }
		public ComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).enterComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).exitComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DogeScriptVisitor ) return ((DogeScriptVisitor<? extends T>)visitor).visitComparison(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonContext comparison() throws RecognitionException {
		ComparisonContext _localctx = new ComparisonContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_comparison);
		try {
			setState(565);
			switch (_input.LA(1)) {
			case EquaOp:
				enterOuterAlt(_localctx, 1);
				{
				System.out.println("in comparison");
				setState(559); match(EquaOp);
				}
				break;
			case GreaterThanOp:
				enterOuterAlt(_localctx, 2);
				{
				setState(560); match(GreaterThanOp);
				}
				break;
			case LessThanOp:
				enterOuterAlt(_localctx, 3);
				{
				setState(561); match(LessThanOp);
				}
				break;
			case GreaterThanEqualTo:
				enterOuterAlt(_localctx, 4);
				{
				setState(562); match(GreaterThanEqualTo);
				}
				break;
			case LessThanEqualTo:
				enterOuterAlt(_localctx, 5);
				{
				setState(563); match(LessThanEqualTo);
				}
				break;
			case NotEqualToOp:
				enterOuterAlt(_localctx, 6);
				{
				setState(564); match(NotEqualToOp);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Logical_operatorContext extends ParserRuleContext {
		public TerminalNode AndOp() { return getToken(DogeScriptParser.AndOp, 0); }
		public TerminalNode OrOp() { return getToken(DogeScriptParser.OrOp, 0); }
		public Logical_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).enterLogical_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).exitLogical_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DogeScriptVisitor ) return ((DogeScriptVisitor<? extends T>)visitor).visitLogical_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logical_operatorContext logical_operator() throws RecognitionException {
		Logical_operatorContext _localctx = new Logical_operatorContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_logical_operator);
		try {
			setState(570);
			switch (_input.LA(1)) {
			case AndOp:
				enterOuterAlt(_localctx, 1);
				{
				System.out.println("in logical_operator");
				setState(568); match(AndOp);
				}
				break;
			case OrOp:
				enterOuterAlt(_localctx, 2);
				{
				setState(569); match(OrOp);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_callContext extends ParserRuleContext {
		public TerminalNode OpenParenthesis() { return getToken(DogeScriptParser.OpenParenthesis, 0); }
		public TerminalNode CloseParenthesis() { return getToken(DogeScriptParser.CloseParenthesis, 0); }
		public TerminalNode VarIdentifier() { return getToken(DogeScriptParser.VarIdentifier, 0); }
		public Function_call_parametersContext function_call_parameters() {
			return getRuleContext(Function_call_parametersContext.class,0);
		}
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).enterFunction_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).exitFunction_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DogeScriptVisitor ) return ((DogeScriptVisitor<? extends T>)visitor).visitFunction_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_function_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			System.out.println("in function_call");
			setState(573); match(VarIdentifier);
			setState(574); match(OpenParenthesis);
			setState(575); function_call_parameters();
			setState(576); match(CloseParenthesis);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_call_parametersContext extends ParserRuleContext {
		public Returns_valueContext returns_value() {
			return getRuleContext(Returns_valueContext.class,0);
		}
		public TerminalNode Comma() { return getToken(DogeScriptParser.Comma, 0); }
		public Function_call_parametersContext function_call_parameters() {
			return getRuleContext(Function_call_parametersContext.class,0);
		}
		public Function_call_parametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).enterFunction_call_parameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).exitFunction_call_parameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DogeScriptVisitor ) return ((DogeScriptVisitor<? extends T>)visitor).visitFunction_call_parameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_call_parametersContext function_call_parameters() throws RecognitionException {
		Function_call_parametersContext _localctx = new Function_call_parametersContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_function_call_parameters);
		try {
			setState(584);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				System.out.println("in function_call_parameters");
				setState(579); returns_value();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(580); returns_value();
				setState(581); match(Comma);
				setState(582); function_call_parameters();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\66\u024d\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\5\5w\n\5\3\6\3\6\3"+
		"\6\3\6\3\6\5\6~\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0096\n\7\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00a5\n\b\3\t\3\t\3\t\5\t\u00aa"+
		"\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\5\13\u00c1\n\13\3\f\3\f\3\f\3\f\3\r\3\r\3"+
		"\r\3\16\3\16\3\16\3\16\5\16\u00ce\n\16\3\17\3\17\3\17\3\17\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\5\20\u00e5\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\5\22\u00f3\n\22\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00fb\n"+
		"\23\3\24\3\24\3\24\3\24\3\24\5\24\u0102\n\24\3\25\3\25\3\25\3\25\3\26"+
		"\3\26\3\26\3\26\3\26\5\26\u010d\n\26\3\27\3\27\3\27\3\27\3\27\3\27\5\27"+
		"\u0115\n\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\32"+
		"\3\32\5\32\u0124\n\32\3\33\3\33\3\33\3\33\3\33\5\33\u012b\n\33\3\34\3"+
		"\34\3\34\5\34\u0130\n\34\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u0138\n\35"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u0142\n\36\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u0150\n\37\3 \3 \3"+
		" \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \5 \u0169"+
		"\n \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!"+
		"\3!\3!\3!\5!\u0184\n!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\""+
		"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u019c\n\"\3#\3#\3#\3#\5#"+
		"\u01a2\n#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\5$\u01b3\n$\3%"+
		"\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%"+
		"\3%\5%\u01ce\n%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3"+
		"\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'"+
		"\3\'\5\'\u01f3\n\'\3(\3(\3(\3(\3(\5(\u01fa\n(\3)\3)\3)\3)\3)\3)\3)\3)"+
		"\3)\3)\3)\3)\3)\5)\u0209\n)\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\5*\u0217"+
		"\n*\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\5+\u022a\n+\3,"+
		"\3,\3,\5,\u022f\n,\3-\3-\3-\3-\3-\3-\3-\5-\u0238\n-\3.\3.\3.\5.\u023d"+
		"\n.\3/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\5\60\u024b\n\60\3"+
		"\60\2\2\61\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66"+
		"8:<>@BDFHJLNPRTVXZ\\^\2\4\3\2\35\36\3\2\37!\u026f\2`\3\2\2\2\4c\3\2\2"+
		"\2\6g\3\2\2\2\bv\3\2\2\2\n}\3\2\2\2\f\u0095\3\2\2\2\16\u00a4\3\2\2\2\20"+
		"\u00a9\3\2\2\2\22\u00ab\3\2\2\2\24\u00c0\3\2\2\2\26\u00c2\3\2\2\2\30\u00c6"+
		"\3\2\2\2\32\u00cd\3\2\2\2\34\u00cf\3\2\2\2\36\u00e4\3\2\2\2 \u00e6\3\2"+
		"\2\2\"\u00f2\3\2\2\2$\u00fa\3\2\2\2&\u0101\3\2\2\2(\u0103\3\2\2\2*\u010c"+
		"\3\2\2\2,\u0114\3\2\2\2.\u0116\3\2\2\2\60\u011b\3\2\2\2\62\u0123\3\2\2"+
		"\2\64\u012a\3\2\2\2\66\u012f\3\2\2\28\u0137\3\2\2\2:\u0141\3\2\2\2<\u014f"+
		"\3\2\2\2>\u0168\3\2\2\2@\u0183\3\2\2\2B\u019b\3\2\2\2D\u01a1\3\2\2\2F"+
		"\u01b2\3\2\2\2H\u01cd\3\2\2\2J\u01cf\3\2\2\2L\u01f2\3\2\2\2N\u01f9\3\2"+
		"\2\2P\u0208\3\2\2\2R\u0216\3\2\2\2T\u0229\3\2\2\2V\u022e\3\2\2\2X\u0237"+
		"\3\2\2\2Z\u023c\3\2\2\2\\\u023e\3\2\2\2^\u024a\3\2\2\2`a\5\4\3\2ab\7\2"+
		"\2\3b\3\3\2\2\2cd\5\b\5\2de\5\6\4\2ef\5\b\5\2f\5\3\2\2\2gh\b\4\1\2hi\7"+
		"\f\2\2ij\7\27\2\2jk\7\30\2\2kl\7.\2\2lm\7/\2\2mn\7,\2\2no\5\n\6\2op\7"+
		"-\2\2p\7\3\2\2\2qr\b\5\1\2rs\5\22\n\2st\5\b\5\2tw\3\2\2\2uw\3\2\2\2vq"+
		"\3\2\2\2vu\3\2\2\2w\t\3\2\2\2xy\b\6\1\2yz\5\f\7\2z{\5\n\6\2{~\3\2\2\2"+
		"|~\5\f\7\2}x\3\2\2\2}|\3\2\2\2~\13\3\2\2\2\177\u0080\b\7\1\2\u0080\u0081"+
		"\5\36\20\2\u0081\u0082\7\n\2\2\u0082\u0096\3\2\2\2\u0083\u0084\5:\36\2"+
		"\u0084\u0085\7\n\2\2\u0085\u0096\3\2\2\2\u0086\u0087\5\\/\2\u0087\u0088"+
		"\7\n\2\2\u0088\u0096\3\2\2\2\u0089\u008a\5 \21\2\u008a\u008b\7\n\2\2\u008b"+
		"\u0096\3\2\2\2\u008c\u0096\5<\37\2\u008d\u0096\5D#\2\u008e\u008f\5\30"+
		"\r\2\u008f\u0090\7\n\2\2\u0090\u0096\3\2\2\2\u0091\u0092\5\34\17\2\u0092"+
		"\u0093\7\n\2\2\u0093\u0096\3\2\2\2\u0094\u0096\7\n\2\2\u0095\177\3\2\2"+
		"\2\u0095\u0083\3\2\2\2\u0095\u0086\3\2\2\2\u0095\u0089\3\2\2\2\u0095\u008c"+
		"\3\2\2\2\u0095\u008d\3\2\2\2\u0095\u008e\3\2\2\2\u0095\u0091\3\2\2\2\u0095"+
		"\u0094\3\2\2\2\u0096\r\3\2\2\2\u0097\u0098\b\b\1\2\u0098\u0099\5\36\20"+
		"\2\u0099\u009a\7\n\2\2\u009a\u00a5\3\2\2\2\u009b\u009c\5:\36\2\u009c\u009d"+
		"\7\n\2\2\u009d\u00a5\3\2\2\2\u009e\u009f\5\\/\2\u009f\u00a0\7\n\2\2\u00a0"+
		"\u00a5\3\2\2\2\u00a1\u00a5\5<\37\2\u00a2\u00a5\5D#\2\u00a3\u00a5\7\n\2"+
		"\2\u00a4\u0097\3\2\2\2\u00a4\u009b\3\2\2\2\u00a4\u009e\3\2\2\2\u00a4\u00a1"+
		"\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a3\3\2\2\2\u00a5\17\3\2\2\2\u00a6"+
		"\u00a7\b\t\1\2\u00a7\u00aa\5:\36\2\u00a8\u00aa\5\\/\2\u00a9\u00a6\3\2"+
		"\2\2\u00a9\u00a8\3\2\2\2\u00aa\21\3\2\2\2\u00ab\u00ac\b\n\1\2\u00ac\u00ad"+
		"\7\f\2\2\u00ad\u00ae\5&\24\2\u00ae\u00af\7\65\2\2\u00af\u00b0\7.\2\2\u00b0"+
		"\u00b1\5\24\13\2\u00b1\u00b2\7/\2\2\u00b2\u00b3\7,\2\2\u00b3\u00b4\5\n"+
		"\6\2\u00b4\u00b5\5\26\f\2\u00b5\u00b6\7-\2\2\u00b6\23\3\2\2\2\u00b7\u00b8"+
		"\b\13\1\2\u00b8\u00b9\5&\24\2\u00b9\u00ba\7\65\2\2\u00ba\u00c1\3\2\2\2"+
		"\u00bb\u00bc\5&\24\2\u00bc\u00bd\7\65\2\2\u00bd\u00be\7\31\2\2\u00be\u00bf"+
		"\5\24\13\2\u00bf\u00c1\3\2\2\2\u00c0\u00b7\3\2\2\2\u00c0\u00bb\3\2\2\2"+
		"\u00c1\25\3\2\2\2\u00c2\u00c3\7\33\2\2\u00c3\u00c4\5,\27\2\u00c4\u00c5"+
		"\7\n\2\2\u00c5\27\3\2\2\2\u00c6\u00c7\7\17\2\2\u00c7\u00c8\5\32\16\2\u00c8"+
		"\31\3\2\2\2\u00c9\u00ce\5\"\22\2\u00ca\u00ce\7\65\2\2\u00cb\u00ce\5\\"+
		"/\2\u00cc\u00ce\5\60\31\2\u00cd\u00c9\3\2\2\2\u00cd\u00ca\3\2\2\2\u00cd"+
		"\u00cb\3\2\2\2\u00cd\u00cc\3\2\2\2\u00ce\33\3\2\2\2\u00cf\u00d0\7\20\2"+
		"\2\u00d0\u00d1\5&\24\2\u00d1\u00d2\7\65\2\2\u00d2\35\3\2\2\2\u00d3\u00d4"+
		"\b\20\1\2\u00d4\u00d5\7\13\2\2\u00d5\u00d6\5&\24\2\u00d6\u00d7\5*\26\2"+
		"\u00d7\u00e5\3\2\2\2\u00d8\u00d9\7\13\2\2\u00d9\u00da\5&\24\2\u00da\u00db"+
		"\7\65\2\2\u00db\u00dc\7\16\2\2\u00dc\u00dd\5,\27\2\u00dd\u00e5\3\2\2\2"+
		"\u00de\u00df\7\13\2\2\u00df\u00e0\5(\25\2\u00e0\u00e1\7\65\2\2\u00e1\u00e2"+
		"\7\16\2\2\u00e2\u00e3\5.\30\2\u00e3\u00e5\3\2\2\2\u00e4\u00d3\3\2\2\2"+
		"\u00e4\u00d8\3\2\2\2\u00e4\u00de\3\2\2\2\u00e5\37\3\2\2\2\u00e6\u00e7"+
		"\7\t\2\2\u00e7\u00e8\5&\24\2\u00e8\u00e9\7\65\2\2\u00e9\u00ea\7\16\2\2"+
		"\u00ea\u00eb\5\"\22\2\u00eb!\3\2\2\2\u00ec\u00ed\b\22\1\2\u00ed\u00f3"+
		"\7\60\2\2\u00ee\u00f3\7\61\2\2\u00ef\u00f3\7\62\2\2\u00f0\u00f3\7\63\2"+
		"\2\u00f1\u00f3\7\34\2\2\u00f2\u00ec\3\2\2\2\u00f2\u00ee\3\2\2\2\u00f2"+
		"\u00ef\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f2\u00f1\3\2\2\2\u00f3#\3\2\2\2"+
		"\u00f4\u00f5\b\23\1\2\u00f5\u00f6\7\31\2\2\u00f6\u00f7\5\"\22\2\u00f7"+
		"\u00f8\5$\23\2\u00f8\u00fb\3\2\2\2\u00f9\u00fb\3\2\2\2\u00fa\u00f4\3\2"+
		"\2\2\u00fa\u00f9\3\2\2\2\u00fb%\3\2\2\2\u00fc\u00fd\b\24\1\2\u00fd\u0102"+
		"\7\5\2\2\u00fe\u0102\7\6\2\2\u00ff\u0102\7\7\2\2\u0100\u0102\7\b\2\2\u0101"+
		"\u00fc\3\2\2\2\u0101\u00fe\3\2\2\2\u0101\u00ff\3\2\2\2\u0101\u0100\3\2"+
		"\2\2\u0102\'\3\2\2\2\u0103\u0104\b\25\1\2\u0104\u0105\5&\24\2\u0105\u0106"+
		"\7\64\2\2\u0106)\3\2\2\2\u0107\u0108\b\26\1\2\u0108\u0109\7\65\2\2\u0109"+
		"\u010a\7\31\2\2\u010a\u010d\5*\26\2\u010b\u010d\7\65\2\2\u010c\u0107\3"+
		"\2\2\2\u010c\u010b\3\2\2\2\u010d+\3\2\2\2\u010e\u010f\b\27\1\2\u010f\u0115"+
		"\5\"\22\2\u0110\u0115\7\65\2\2\u0111\u0115\5\60\31\2\u0112\u0115\5\\/"+
		"\2\u0113\u0115\7\32\2\2\u0114\u010e\3\2\2\2\u0114\u0110\3\2\2\2\u0114"+
		"\u0111\3\2\2\2\u0114\u0112\3\2\2\2\u0114\u0113\3\2\2\2\u0115-\3\2\2\2"+
		"\u0116\u0117\7,\2\2\u0117\u0118\5\"\22\2\u0118\u0119\5$\23\2\u0119\u011a"+
		"\7-\2\2\u011a/\3\2\2\2\u011b\u011c\5\62\32\2\u011c\u011d\b\31\1\2\u011d"+
		"\61\3\2\2\2\u011e\u011f\5\64\33\2\u011f\u0120\t\2\2\2\u0120\u0121\5\62"+
		"\32\2\u0121\u0124\3\2\2\2\u0122\u0124\5\64\33\2\u0123\u011e\3\2\2\2\u0123"+
		"\u0122\3\2\2\2\u0124\63\3\2\2\2\u0125\u0126\5\66\34\2\u0126\u0127\t\3"+
		"\2\2\u0127\u0128\5\64\33\2\u0128\u012b\3\2\2\2\u0129\u012b\5\66\34\2\u012a"+
		"\u0125\3\2\2\2\u012a\u0129\3\2\2\2\u012b\65\3\2\2\2\u012c\u012d\7\36\2"+
		"\2\u012d\u0130\58\35\2\u012e\u0130\58\35\2\u012f\u012c\3\2\2\2\u012f\u012e"+
		"\3\2\2\2\u0130\67\3\2\2\2\u0131\u0138\7\60\2\2\u0132\u0133\7.\2\2\u0133"+
		"\u0134\5\60\31\2\u0134\u0135\7/\2\2\u0135\u0138\3\2\2\2\u0136\u0138\7"+
		"\65\2\2\u0137\u0131\3\2\2\2\u0137\u0132\3\2\2\2\u0137\u0136\3\2\2\2\u0138"+
		"9\3\2\2\2\u0139\u013a\b\36\1\2\u013a\u013b\7\65\2\2\u013b\u013c\7\16\2"+
		"\2\u013c\u0142\5,\27\2\u013d\u013e\7\65\2\2\u013e\u0142\7*\2\2\u013f\u0140"+
		"\7\65\2\2\u0140\u0142\7+\2\2\u0141\u0139\3\2\2\2\u0141\u013d\3\2\2\2\u0141"+
		"\u013f\3\2\2\2\u0142;\3\2\2\2\u0143\u0144\b\37\1\2\u0144\u0150\5> \2\u0145"+
		"\u0146\5> \2\u0146\u0147\5@!\2\u0147\u0150\3\2\2\2\u0148\u0149\5> \2\u0149"+
		"\u014a\5B\"\2\u014a\u0150\3\2\2\2\u014b\u014c\5> \2\u014c\u014d\5B\"\2"+
		"\u014d\u014e\5@!\2\u014e\u0150\3\2\2\2\u014f\u0143\3\2\2\2\u014f\u0145"+
		"\3\2\2\2\u014f\u0148\3\2\2\2\u014f\u014b\3\2\2\2\u0150=\3\2\2\2\u0151"+
		"\u0152\b \1\2\u0152\u0153\7\21\2\2\u0153\u0154\7.\2\2\u0154\u0155\5L\'"+
		"\2\u0155\u0156\7/\2\2\u0156\u0157\5\16\b\2\u0157\u0169\3\2\2\2\u0158\u0159"+
		"\7\21\2\2\u0159\u015a\7.\2\2\u015a\u015b\5L\'\2\u015b\u015c\7/\2\2\u015c"+
		"\u015d\7,\2\2\u015d\u015e\5\16\b\2\u015e\u015f\7-\2\2\u015f\u0169\3\2"+
		"\2\2\u0160\u0161\7\21\2\2\u0161\u0162\7.\2\2\u0162\u0163\5L\'\2\u0163"+
		"\u0164\7/\2\2\u0164\u0165\7,\2\2\u0165\u0166\5\n\6\2\u0166\u0167\7-\2"+
		"\2\u0167\u0169\3\2\2\2\u0168\u0151\3\2\2\2\u0168\u0158\3\2\2\2\u0168\u0160"+
		"\3\2\2\2\u0169?\3\2\2\2\u016a\u016b\b!\1\2\u016b\u016c\7\22\2\2\u016c"+
		"\u016d\7.\2\2\u016d\u016e\5L\'\2\u016e\u016f\7/\2\2\u016f\u0170\5\16\b"+
		"\2\u0170\u0184\3\2\2\2\u0171\u0172\7\22\2\2\u0172\u0173\7.\2\2\u0173\u0174"+
		"\5L\'\2\u0174\u0175\7/\2\2\u0175\u0176\7,\2\2\u0176\u0177\5\16\b\2\u0177"+
		"\u0178\7-\2\2\u0178\u0184\3\2\2\2\u0179\u017a\7\22\2\2\u017a\u017b\7."+
		"\2\2\u017b\u017c\5L\'\2\u017c\u017d\7/\2\2\u017d\u017e\7,\2\2\u017e\u017f"+
		"\5\n\6\2\u017f\u0180\7-\2\2\u0180\u0184\3\2\2\2\u0181\u0182\7\22\2\2\u0182"+
		"\u0184\5\16\b\2\u0183\u016a\3\2\2\2\u0183\u0171\3\2\2\2\u0183\u0179\3"+
		"\2\2\2\u0183\u0181\3\2\2\2\u0184A\3\2\2\2\u0185\u0186\b\"\1\2\u0186\u0187"+
		"\7\23\2\2\u0187\u0188\7.\2\2\u0188\u0189\5L\'\2\u0189\u018a\7/\2\2\u018a"+
		"\u018b\5\16\b\2\u018b\u019c\3\2\2\2\u018c\u018d\7\23\2\2\u018d\u018e\7"+
		".\2\2\u018e\u018f\5L\'\2\u018f\u0190\7/\2\2\u0190\u0191\5\16\b\2\u0191"+
		"\u0192\7-\2\2\u0192\u019c\3\2\2\2\u0193\u0194\7\23\2\2\u0194\u0195\7."+
		"\2\2\u0195\u0196\5L\'\2\u0196\u0197\7/\2\2\u0197\u0198\7,\2\2\u0198\u0199"+
		"\5\n\6\2\u0199\u019a\7-\2\2\u019a\u019c\3\2\2\2\u019b\u0185\3\2\2\2\u019b"+
		"\u018c\3\2\2\2\u019b\u0193\3\2\2\2\u019cC\3\2\2\2\u019d\u019e\b#\1\2\u019e"+
		"\u01a2\5F$\2\u019f\u01a2\5H%\2\u01a0\u01a2\5J&\2\u01a1\u019d\3\2\2\2\u01a1"+
		"\u019f\3\2\2\2\u01a1\u01a0\3\2\2\2\u01a2E\3\2\2\2\u01a3\u01a4\b$\1\2\u01a4"+
		"\u01a5\7\24\2\2\u01a5\u01a6\7.\2\2\u01a6\u01a7\5L\'\2\u01a7\u01a8\7/\2"+
		"\2\u01a8\u01a9\7,\2\2\u01a9\u01aa\5\n\6\2\u01aa\u01ab\7-\2\2\u01ab\u01b3"+
		"\3\2\2\2\u01ac\u01ad\7\24\2\2\u01ad\u01ae\7.\2\2\u01ae\u01af\5L\'\2\u01af"+
		"\u01b0\7/\2\2\u01b0\u01b1\5\16\b\2\u01b1\u01b3\3\2\2\2\u01b2\u01a3\3\2"+
		"\2\2\u01b2\u01ac\3\2\2\2\u01b3G\3\2\2\2\u01b4\u01b5\b%\1\2\u01b5\u01b6"+
		"\7\25\2\2\u01b6\u01b7\7.\2\2\u01b7\u01b8\5\36\20\2\u01b8\u01b9\7\n\2\2"+
		"\u01b9\u01ba\5L\'\2\u01ba\u01bb\7\n\2\2\u01bb\u01bc\5\20\t\2\u01bc\u01bd"+
		"\7/\2\2\u01bd\u01be\7,\2\2\u01be\u01bf\5\n\6\2\u01bf\u01c0\7-\2\2\u01c0"+
		"\u01ce\3\2\2\2\u01c1\u01c2\7\25\2\2\u01c2\u01c3\7.\2\2\u01c3\u01c4\5:"+
		"\36\2\u01c4\u01c5\7\n\2\2\u01c5\u01c6\5L\'\2\u01c6\u01c7\7\n\2\2\u01c7"+
		"\u01c8\5\20\t\2\u01c8\u01c9\7/\2\2\u01c9\u01ca\7,\2\2\u01ca\u01cb\5\n"+
		"\6\2\u01cb\u01cc\7-\2\2\u01cc\u01ce\3\2\2\2\u01cd\u01b4\3\2\2\2\u01cd"+
		"\u01c1\3\2\2\2\u01ceI\3\2\2\2\u01cf\u01d0\b&\1\2\u01d0\u01d1\7\26\2\2"+
		"\u01d1\u01d2\7,\2\2\u01d2\u01d3\5\n\6\2\u01d3\u01d4\7-\2\2\u01d4\u01d5"+
		"\7\24\2\2\u01d5\u01d6\7.\2\2\u01d6\u01d7\5L\'\2\u01d7\u01d8\7/\2\2\u01d8"+
		"\u01d9\7\n\2\2\u01d9K\3\2\2\2\u01da\u01f3\5P)\2\u01db\u01f3\5R*\2\u01dc"+
		"\u01f3\5T+\2\u01dd\u01f3\5N(\2\u01de\u01df\7.\2\2\u01df\u01e0\5L\'\2\u01e0"+
		"\u01e1\7/\2\2\u01e1\u01f3\3\2\2\2\u01e2\u01e3\5P)\2\u01e3\u01e4\5Z.\2"+
		"\u01e4\u01e5\5L\'\2\u01e5\u01f3\3\2\2\2\u01e6\u01e7\5R*\2\u01e7\u01e8"+
		"\5Z.\2\u01e8\u01e9\5L\'\2\u01e9\u01f3\3\2\2\2\u01ea\u01eb\5T+\2\u01eb"+
		"\u01ec\5Z.\2\u01ec\u01ed\5L\'\2\u01ed\u01f3\3\2\2\2\u01ee\u01ef\5N(\2"+
		"\u01ef\u01f0\5Z.\2\u01f0\u01f1\5L\'\2\u01f1\u01f3\3\2\2\2\u01f2\u01da"+
		"\3\2\2\2\u01f2\u01db\3\2\2\2\u01f2\u01dc\3\2\2\2\u01f2\u01dd\3\2\2\2\u01f2"+
		"\u01de\3\2\2\2\u01f2\u01e2\3\2\2\2\u01f2\u01e6\3\2\2\2\u01f2\u01ea\3\2"+
		"\2\2\u01f2\u01ee\3\2\2\2\u01f3M\3\2\2\2\u01f4\u01f5\7\34\2\2\u01f5\u01f6"+
		"\5V,\2\u01f6\u01f7\5\\/\2\u01f7\u01fa\3\2\2\2\u01f8\u01fa\7\34\2\2\u01f9"+
		"\u01f4\3\2\2\2\u01f9\u01f8\3\2\2\2\u01faO\3\2\2\2\u01fb\u01fc\7\65\2\2"+
		"\u01fc\u01fd\5X-\2\u01fd\u01fe\7\65\2\2\u01fe\u0209\3\2\2\2\u01ff\u0200"+
		"\7\65\2\2\u0200\u0201\5X-\2\u0201\u0202\5\60\31\2\u0202\u0209\3\2\2\2"+
		"\u0203\u0204\7\65\2\2\u0204\u0205\5X-\2\u0205\u0206\5\\/\2\u0206\u0209"+
		"\3\2\2\2\u0207\u0209\7\65\2\2\u0208\u01fb\3\2\2\2\u0208\u01ff\3\2\2\2"+
		"\u0208\u0203\3\2\2\2\u0208\u0207\3\2\2\2\u0209Q\3\2\2\2\u020a\u020b\5"+
		"\60\31\2\u020b\u020c\5X-\2\u020c\u020d\7\65\2\2\u020d\u0217\3\2\2\2\u020e"+
		"\u020f\5\60\31\2\u020f\u0210\5X-\2\u0210\u0211\5\60\31\2\u0211\u0217\3"+
		"\2\2\2\u0212\u0213\5\60\31\2\u0213\u0214\5X-\2\u0214\u0215\5\\/\2\u0215"+
		"\u0217\3\2\2\2\u0216\u020a\3\2\2\2\u0216\u020e\3\2\2\2\u0216\u0212\3\2"+
		"\2\2\u0217S\3\2\2\2\u0218\u0219\5\\/\2\u0219\u021a\5X-\2\u021a\u021b\5"+
		"\\/\2\u021b\u022a\3\2\2\2\u021c\u021d\5\\/\2\u021d\u021e\5X-\2\u021e\u021f"+
		"\7\65\2\2\u021f\u022a\3\2\2\2\u0220\u0221\5\\/\2\u0221\u0222\5X-\2\u0222"+
		"\u0223\5\60\31\2\u0223\u022a\3\2\2\2\u0224\u0225\5\\/\2\u0225\u0226\5"+
		"X-\2\u0226\u0227\7\34\2\2\u0227\u022a\3\2\2\2\u0228\u022a\5\\/\2\u0229"+
		"\u0218\3\2\2\2\u0229\u021c\3\2\2\2\u0229\u0220\3\2\2\2\u0229\u0224\3\2"+
		"\2\2\u0229\u0228\3\2\2\2\u022aU\3\2\2\2\u022b\u022c\b,\1\2\u022c\u022f"+
		"\7\"\2\2\u022d\u022f\7\'\2\2\u022e\u022b\3\2\2\2\u022e\u022d\3\2\2\2\u022f"+
		"W\3\2\2\2\u0230\u0231\b-\1\2\u0231\u0238\7\"\2\2\u0232\u0238\7#\2\2\u0233"+
		"\u0238\7$\2\2\u0234\u0238\7%\2\2\u0235\u0238\7&\2\2\u0236\u0238\7\'\2"+
		"\2\u0237\u0230\3\2\2\2\u0237\u0232\3\2\2\2\u0237\u0233\3\2\2\2\u0237\u0234"+
		"\3\2\2\2\u0237\u0235\3\2\2\2\u0237\u0236\3\2\2\2\u0238Y\3\2\2\2\u0239"+
		"\u023a\b.\1\2\u023a\u023d\7(\2\2\u023b\u023d\7)\2\2\u023c\u0239\3\2\2"+
		"\2\u023c\u023b\3\2\2\2\u023d[\3\2\2\2\u023e\u023f\b/\1\2\u023f\u0240\7"+
		"\65\2\2\u0240\u0241\7.\2\2\u0241\u0242\5^\60\2\u0242\u0243\7/\2\2\u0243"+
		"]\3\2\2\2\u0244\u0245\b\60\1\2\u0245\u024b\5,\27\2\u0246\u0247\5,\27\2"+
		"\u0247\u0248\7\31\2\2\u0248\u0249\5^\60\2\u0249\u024b\3\2\2\2\u024a\u0244"+
		"\3\2\2\2\u024a\u0246\3\2\2\2\u024b_\3\2\2\2$v}\u0095\u00a4\u00a9\u00c0"+
		"\u00cd\u00e4\u00f2\u00fa\u0101\u010c\u0114\u0123\u012a\u012f\u0137\u0141"+
		"\u014f\u0168\u0183\u019b\u01a1\u01b2\u01cd\u01f2\u01f9\u0208\u0216\u0229"+
		"\u022e\u0237\u023c\u024a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}