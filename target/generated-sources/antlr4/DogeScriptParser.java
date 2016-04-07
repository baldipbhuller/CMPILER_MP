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
		Terminator=7, VarDecStarter=8, FuncStarter=9, ConstantStarter=10, AssOp=11, 
		PrintStarter=12, ScanStarter=13, IfKeyword=14, ElseKeyword=15, ElseIfKeyword=16, 
		EventLoopKeyword=17, CountLoopKeyword=18, RepeatUntilLoopKeyword=19, VoidKeyword=20, 
		MainKeyword=21, Comma=22, NullKeyword=23, ReturnKeyword=24, BoolLit=25, 
		AddOp=26, SubOp=27, MulOp=28, DivOp=29, ModOp=30, EquaOp=31, GreaterThanOp=32, 
		LessThanOp=33, GreaterThanEqualTo=34, LessThanEqualTo=35, NotEqualToOp=36, 
		AndOp=37, OrOp=38, IncrementOp=39, DecrementOp=40, OpenBrace=41, CloseBrace=42, 
		OpenParenthesis=43, CloseParenthesis=44, IntLit=45, FloatLit=46, StringLit=47, 
		CharLit=48, Array=49, VarIdentifier=50, EndOfFile=51;
	public static final String[] tokenNames = {
		"<INVALID>", "WS", "CommentBlock", "'int'", "'char'", "'boolean'", "'string'", 
		"Terminator", "'such'", "'much'", "'very'", "'as'", "'print'", "'scan'", 
		"'rily'", "'but'", "'but rily'", "'so'", "'many'", "'nice'", "'void'", 
		"'dogeIntensifies'", "','", "'null'", "'bow'", "BoolLit", "'+'", "'-'", 
		"'*'", "'/'", "'%'", "'is'", "'>'", "'<'", "'>='", "'<='", "'!='", "'and'", 
		"'or'", "'++'", "'--'", "'{'", "'}'", "'('", "')'", "IntLit", "FloatLit", 
		"StringLit", "CharLit", "Array", "VarIdentifier", "'$'"
	};
	public static final int
		RULE_start = 0, RULE_source_code = 1, RULE_main_function = 2, RULE_function_block = 3, 
		RULE_codeblock = 4, RULE_all_possible_statements = 5, RULE_all_possible_single_statements = 6, 
		RULE_afterthought_statement = 7, RULE_function_declaration = 8, RULE_function_declaration_paramaters = 9, 
		RULE_return_statement = 10, RULE_print_statement = 11, RULE_all_possible_print = 12, 
		RULE_scan_statement = 13, RULE_variable_declaration = 14, RULE_literal = 15, 
		RULE_array_literal = 16, RULE_datatype = 17, RULE_datatype_array = 18, 
		RULE_variable_instance = 19, RULE_returns_value = 20, RULE_expression = 21, 
		RULE_low_prior = 22, RULE_high_prior = 23, RULE_signint = 24, RULE_top_prior = 25, 
		RULE_assignment_statement = 26, RULE_conditional_statement = 27, RULE_start_condition = 28, 
		RULE_end_condition = 29, RULE_continue_condition = 30, RULE_loop_statement = 31, 
		RULE_event_loop_statement = 32, RULE_count_loop_statement = 33, RULE_repeatuntil_loop_statement = 34, 
		RULE_condition = 35, RULE_conditionB = 36, RULE_conditionV = 37, RULE_conditionE = 38, 
		RULE_conditionF = 39, RULE_comparison_bool_lit = 40, RULE_comparison = 41, 
		RULE_logical_operator = 42, RULE_function_call = 43, RULE_function_call_parameters = 44;
	public static final String[] ruleNames = {
		"start", "source_code", "main_function", "function_block", "codeblock", 
		"all_possible_statements", "all_possible_single_statements", "afterthought_statement", 
		"function_declaration", "function_declaration_paramaters", "return_statement", 
		"print_statement", "all_possible_print", "scan_statement", "variable_declaration", 
		"literal", "array_literal", "datatype", "datatype_array", "variable_instance", 
		"returns_value", "expression", "low_prior", "high_prior", "signint", "top_prior", 
		"assignment_statement", "conditional_statement", "start_condition", "end_condition", 
		"continue_condition", "loop_statement", "event_loop_statement", "count_loop_statement", 
		"repeatuntil_loop_statement", "condition", "conditionB", "conditionV", 
		"conditionE", "conditionF", "comparison_bool_lit", "comparison", "logical_operator", 
		"function_call", "function_call_parameters"
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
			setState(90); source_code();
			setState(91); match(EOF);
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
			setState(93); function_block();
			setState(94); main_function();
			setState(95); function_block();
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
			setState(98); match(FuncStarter);
			setState(99); match(VoidKeyword);
			setState(100); match(MainKeyword);
			setState(101); match(OpenParenthesis);
			setState(102); match(CloseParenthesis);
			setState(103); match(OpenBrace);
			setState(104); codeblock();
			setState(105); match(CloseBrace);
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
			setState(112);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				System.out.println("in function_block");
				setState(108); function_declaration();
				setState(109); function_block();
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
			setState(119);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				System.out.println("in code_block");
				setState(115); all_possible_statements();
				setState(116); codeblock();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(118); all_possible_statements();
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
			setState(140);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				System.out.println("in all_possible");
				setState(122); variable_declaration();
				setState(123); match(Terminator);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(125); assignment_statement();
				setState(126); match(Terminator);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(128); function_call();
				setState(129); match(Terminator);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(131); conditional_statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(132); loop_statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(133); print_statement();
				setState(134); match(Terminator);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(136); scan_statement();
				setState(137); match(Terminator);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(139); match(Terminator);
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
			setState(155);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				System.out.println("in single_all_possible");
				setState(143); variable_declaration();
				setState(144); match(Terminator);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(146); assignment_statement();
				setState(147); match(Terminator);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(149); function_call();
				setState(150); match(Terminator);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(152); conditional_statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(153); loop_statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(154); match(Terminator);
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
			setState(160);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				System.out.println("in afterthought_statement");
				setState(158); assignment_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(159); function_call();
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
			setState(163); match(FuncStarter);
			setState(164); datatype();
			setState(165); match(VarIdentifier);
			setState(166); match(OpenParenthesis);
			setState(167); function_declaration_paramaters();
			setState(168); match(CloseParenthesis);
			setState(169); match(OpenBrace);
			setState(170); codeblock();
			setState(171); return_statement();
			setState(172); match(CloseBrace);
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
			setState(183);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				System.out.println("in function_declaration_paramaters");
				setState(175); datatype();
				setState(176); match(VarIdentifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(178); datatype();
				setState(179); match(VarIdentifier);
				setState(180); match(Comma);
				setState(181); function_declaration_paramaters();
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
			setState(185); match(ReturnKeyword);
			setState(186); returns_value();
			setState(187); match(Terminator);
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
			setState(189); match(PrintStarter);
			setState(190); all_possible_print();
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
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode VarIdentifier() { return getToken(DogeScriptParser.VarIdentifier, 0); }
		public All_possible_printContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_all_possible_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).enterAll_possible_print(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).exitAll_possible_print(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DogeScriptVisitor ) return ((DogeScriptVisitor<? extends T>)visitor).visitAll_possible_print(this);
			else return visitor.visitChildren(this);
		}
	}

	public final All_possible_printContext all_possible_print() throws RecognitionException {
		All_possible_printContext _localctx = new All_possible_printContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_all_possible_print);
		try {
			setState(196);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(192); literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(193); match(VarIdentifier);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(194); function_call();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(195); expression();
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
		public TerminalNode ScanStarter() { return getToken(DogeScriptParser.ScanStarter, 0); }
		public DatatypeContext datatype() {
			return getRuleContext(DatatypeContext.class,0);
		}
		public TerminalNode VarIdentifier() { return getToken(DogeScriptParser.VarIdentifier, 0); }
		public Scan_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scan_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).enterScan_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).exitScan_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DogeScriptVisitor ) return ((DogeScriptVisitor<? extends T>)visitor).visitScan_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Scan_statementContext scan_statement() throws RecognitionException {
		Scan_statementContext _localctx = new Scan_statementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_scan_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198); match(ScanStarter);
			setState(199); datatype();
			setState(200); match(VarIdentifier);
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
		public Returns_valueContext returns_value() {
			return getRuleContext(Returns_valueContext.class,0);
		}
		public TerminalNode VarDecStarter() { return getToken(DogeScriptParser.VarDecStarter, 0); }
		public TerminalNode AssOp() { return getToken(DogeScriptParser.AssOp, 0); }
		public TerminalNode VarIdentifier() { return getToken(DogeScriptParser.VarIdentifier, 0); }
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
			setState(219);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new VardecContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				System.out.println("in variable_declaration");
				setState(203); match(VarDecStarter);
				setState(204); datatype();
				setState(205); variable_instance();
				}
				break;
			case 2:
				_localctx = new Vardec2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(207); match(VarDecStarter);
				setState(208); datatype();
				setState(209); match(VarIdentifier);
				setState(210); match(AssOp);
				setState(211); returns_value();
				}
				break;
			case 3:
				_localctx = new Vardec3Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(213); match(VarDecStarter);
				setState(214); datatype_array();
				setState(215); match(VarIdentifier);
				setState(216); match(AssOp);
				setState(217); returns_value();
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
		enterRule(_localctx, 30, RULE_literal);
		try {
			setState(227);
			switch (_input.LA(1)) {
			case IntLit:
				enterOuterAlt(_localctx, 1);
				{
				System.out.println("in literal");
				setState(222); match(IntLit);
				}
				break;
			case FloatLit:
				enterOuterAlt(_localctx, 2);
				{
				setState(223); match(FloatLit);
				}
				break;
			case StringLit:
				enterOuterAlt(_localctx, 3);
				{
				setState(224); match(StringLit);
				}
				break;
			case CharLit:
				enterOuterAlt(_localctx, 4);
				{
				setState(225); match(CharLit);
				}
				break;
			case BoolLit:
				enterOuterAlt(_localctx, 5);
				{
				setState(226); match(BoolLit);
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
		enterRule(_localctx, 32, RULE_array_literal);
		try {
			setState(235);
			switch (_input.LA(1)) {
			case Comma:
				enterOuterAlt(_localctx, 1);
				{
				System.out.println("in array literal");
				setState(230); match(Comma);
				setState(231); literal();
				setState(232); array_literal();
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
		enterRule(_localctx, 34, RULE_datatype);
		try {
			setState(242);
			switch (_input.LA(1)) {
			case IntDataType:
				enterOuterAlt(_localctx, 1);
				{
				System.out.println("in datatype");
				setState(238); match(IntDataType);
				}
				break;
			case CharDataType:
				enterOuterAlt(_localctx, 2);
				{
				setState(239); match(CharDataType);
				}
				break;
			case BoolDataType:
				enterOuterAlt(_localctx, 3);
				{
				setState(240); match(BoolDataType);
				}
				break;
			case StringDataType:
				enterOuterAlt(_localctx, 4);
				{
				setState(241); match(StringDataType);
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
		enterRule(_localctx, 36, RULE_datatype_array);
		try {
			enterOuterAlt(_localctx, 1);
			{
			System.out.println("in datatype array");
			setState(245); datatype();
			setState(246); match(Array);
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
		enterRule(_localctx, 38, RULE_variable_instance);
		try {
			setState(253);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				System.out.println("in variable_instance");
				setState(249); match(VarIdentifier);
				setState(250); match(Comma);
				setState(251); variable_instance();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(252); match(VarIdentifier);
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
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public TerminalNode CloseBrace() { return getToken(DogeScriptParser.CloseBrace, 0); }
		public Array_literalContext array_literal() {
			return getRuleContext(Array_literalContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode NullKeyword() { return getToken(DogeScriptParser.NullKeyword, 0); }
		public TerminalNode OpenBrace() { return getToken(DogeScriptParser.OpenBrace, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode VarIdentifier() { return getToken(DogeScriptParser.VarIdentifier, 0); }
		public Returns_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returns_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).enterReturns_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).exitReturns_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DogeScriptVisitor ) return ((DogeScriptVisitor<? extends T>)visitor).visitReturns_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Returns_valueContext returns_value() throws RecognitionException {
		Returns_valueContext _localctx = new Returns_valueContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_returns_value);
		try {
			setState(266);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				System.out.println("in returns_value");
				setState(256); literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(257); match(OpenBrace);
				setState(258); literal();
				setState(259); array_literal();
				setState(260); match(CloseBrace);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(262); match(VarIdentifier);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(263); expression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(264); function_call();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(265); match(NullKeyword);
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
		enterRule(_localctx, 42, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268); low_prior();
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
		public Token op;
		public List<High_priorContext> high_prior() {
			return getRuleContexts(High_priorContext.class);
		}
		public High_priorContext high_prior(int i) {
			return getRuleContext(High_priorContext.class,i);
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
		enterRule(_localctx, 44, RULE_low_prior);
		int _la;
		try {
			setState(276);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				_localctx = new LpExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(271); high_prior();
				setState(272);
				((LpExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==AddOp || _la==SubOp) ) {
					((LpExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(273); high_prior();
				}
				break;
			case 2:
				_localctx = new Low_prior2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(275); high_prior();
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
		public SignintContext signint(int i) {
			return getRuleContext(SignintContext.class,i);
		}
		public TerminalNode ModOp() { return getToken(DogeScriptParser.ModOp, 0); }
		public List<SignintContext> signint() {
			return getRuleContexts(SignintContext.class);
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
		enterRule(_localctx, 46, RULE_high_prior);
		int _la;
		try {
			setState(283);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new HpExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(278); signint();
				setState(279);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MulOp) | (1L << DivOp) | (1L << ModOp))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(280); signint();
				}
				break;
			case 2:
				_localctx = new High_prior2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(282); signint();
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
		enterRule(_localctx, 48, RULE_signint);
		try {
			setState(288);
			switch (_input.LA(1)) {
			case SubOp:
				_localctx = new NegSignIntContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(285); match(SubOp);
				setState(286); top_prior();
				}
				break;
			case OpenParenthesis:
			case IntLit:
			case VarIdentifier:
				_localctx = new PosSignIntContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(287); top_prior();
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
		enterRule(_localctx, 50, RULE_top_prior);
		try {
			setState(296);
			switch (_input.LA(1)) {
			case IntLit:
				_localctx = new TpIntLitContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(290); match(IntLit);
				}
				break;
			case OpenParenthesis:
				_localctx = new TpParenthesisContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(291); match(OpenParenthesis);
				setState(292); expression();
				setState(293); match(CloseParenthesis);
				}
				break;
			case VarIdentifier:
				_localctx = new TpVarIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(295); match(VarIdentifier);
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
		public TerminalNode IncrementOp() { return getToken(DogeScriptParser.IncrementOp, 0); }
		public Returns_valueContext returns_value() {
			return getRuleContext(Returns_valueContext.class,0);
		}
		public TerminalNode DecrementOp() { return getToken(DogeScriptParser.DecrementOp, 0); }
		public TerminalNode AssOp() { return getToken(DogeScriptParser.AssOp, 0); }
		public TerminalNode VarIdentifier() { return getToken(DogeScriptParser.VarIdentifier, 0); }
		public Assignment_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).enterAssignment_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).exitAssignment_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DogeScriptVisitor ) return ((DogeScriptVisitor<? extends T>)visitor).visitAssignment_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assignment_statementContext assignment_statement() throws RecognitionException {
		Assignment_statementContext _localctx = new Assignment_statementContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_assignment_statement);
		try {
			setState(306);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				System.out.println("in assignment_statement");
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(299); match(VarIdentifier);
				setState(300); match(AssOp);
				setState(301); returns_value();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(302); match(VarIdentifier);
				setState(303); match(IncrementOp);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(304); match(VarIdentifier);
				setState(305); match(DecrementOp);
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
		enterRule(_localctx, 54, RULE_conditional_statement);
		try {
			setState(320);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				System.out.println("in conditional_statement");
				setState(309); start_condition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(310); start_condition();
				setState(311); end_condition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(313); start_condition();
				setState(314); continue_condition();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(316); start_condition();
				setState(317); continue_condition();
				setState(318); end_condition();
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
		enterRule(_localctx, 56, RULE_start_condition);
		try {
			setState(345);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				System.out.println("in start_condition");
				setState(323); match(IfKeyword);
				setState(324); match(OpenParenthesis);
				setState(325); condition();
				setState(326); match(CloseParenthesis);
				setState(327); all_possible_single_statements();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(329); match(IfKeyword);
				setState(330); match(OpenParenthesis);
				setState(331); condition();
				setState(332); match(CloseParenthesis);
				setState(333); match(OpenBrace);
				setState(334); all_possible_single_statements();
				setState(335); match(CloseBrace);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(337); match(IfKeyword);
				setState(338); match(OpenParenthesis);
				setState(339); condition();
				setState(340); match(CloseParenthesis);
				setState(341); match(OpenBrace);
				setState(342); codeblock();
				setState(343); match(CloseBrace);
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
		enterRule(_localctx, 58, RULE_end_condition);
		try {
			setState(372);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				System.out.println("in end_condition");
				setState(348); match(ElseKeyword);
				setState(349); match(OpenParenthesis);
				setState(350); condition();
				setState(351); match(CloseParenthesis);
				setState(352); all_possible_single_statements();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(354); match(ElseKeyword);
				setState(355); match(OpenParenthesis);
				setState(356); condition();
				setState(357); match(CloseParenthesis);
				setState(358); match(OpenBrace);
				setState(359); all_possible_single_statements();
				setState(360); match(CloseBrace);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(362); match(ElseKeyword);
				setState(363); match(OpenParenthesis);
				setState(364); condition();
				setState(365); match(CloseParenthesis);
				setState(366); match(OpenBrace);
				setState(367); codeblock();
				setState(368); match(CloseBrace);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(370); match(ElseKeyword);
				setState(371); all_possible_single_statements();
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
		enterRule(_localctx, 60, RULE_continue_condition);
		try {
			setState(396);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				System.out.println("in continue_condition");
				setState(375); match(ElseIfKeyword);
				setState(376); match(OpenParenthesis);
				setState(377); condition();
				setState(378); match(CloseParenthesis);
				setState(379); all_possible_single_statements();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(381); match(ElseIfKeyword);
				setState(382); match(OpenParenthesis);
				setState(383); condition();
				setState(384); match(CloseParenthesis);
				setState(385); all_possible_single_statements();
				setState(386); match(CloseBrace);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(388); match(ElseIfKeyword);
				setState(389); match(OpenParenthesis);
				setState(390); condition();
				setState(391); match(CloseParenthesis);
				setState(392); match(OpenBrace);
				setState(393); codeblock();
				setState(394); match(CloseBrace);
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
		enterRule(_localctx, 62, RULE_loop_statement);
		try {
			setState(402);
			switch (_input.LA(1)) {
			case EventLoopKeyword:
				enterOuterAlt(_localctx, 1);
				{
				System.out.println("in LOOPS");
				setState(399); event_loop_statement();
				}
				break;
			case CountLoopKeyword:
				enterOuterAlt(_localctx, 2);
				{
				setState(400); count_loop_statement();
				}
				break;
			case RepeatUntilLoopKeyword:
				enterOuterAlt(_localctx, 3);
				{
				setState(401); repeatuntil_loop_statement();
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
		enterRule(_localctx, 64, RULE_event_loop_statement);
		try {
			setState(419);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				System.out.println("in event_loop_statement");
				setState(405); match(EventLoopKeyword);
				setState(406); match(OpenParenthesis);
				setState(407); condition();
				setState(408); match(CloseParenthesis);
				setState(409); match(OpenBrace);
				setState(410); codeblock();
				setState(411); match(CloseBrace);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(413); match(EventLoopKeyword);
				setState(414); match(OpenParenthesis);
				setState(415); condition();
				setState(416); match(CloseParenthesis);
				setState(417); all_possible_single_statements();
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
		enterRule(_localctx, 66, RULE_count_loop_statement);
		try {
			setState(446);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				System.out.println("in count_loop_statement");
				setState(422); match(CountLoopKeyword);
				setState(423); match(OpenParenthesis);
				setState(424); variable_declaration();
				setState(425); match(Terminator);
				setState(426); condition();
				setState(427); match(Terminator);
				setState(428); afterthought_statement();
				setState(429); match(CloseParenthesis);
				setState(430); match(OpenBrace);
				setState(431); codeblock();
				setState(432); match(CloseBrace);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(434); match(CountLoopKeyword);
				setState(435); match(OpenParenthesis);
				setState(436); assignment_statement();
				setState(437); match(Terminator);
				setState(438); condition();
				setState(439); match(Terminator);
				setState(440); afterthought_statement();
				setState(441); match(CloseParenthesis);
				setState(442); match(OpenBrace);
				setState(443); codeblock();
				setState(444); match(CloseBrace);
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
		enterRule(_localctx, 68, RULE_repeatuntil_loop_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			System.out.println("in repeatuntil_loop_statement");
			setState(449); match(RepeatUntilLoopKeyword);
			setState(450); match(OpenBrace);
			setState(451); codeblock();
			setState(452); match(CloseBrace);
			setState(453); match(EventLoopKeyword);
			setState(454); match(OpenParenthesis);
			setState(455); condition();
			setState(456); match(CloseParenthesis);
			setState(457); match(Terminator);
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
		enterRule(_localctx, 70, RULE_condition);
		try {
			setState(483);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(459); conditionV();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(460); conditionE();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(461); conditionF();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(462); conditionB();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(463); match(OpenParenthesis);
				setState(464); condition();
				setState(465); match(CloseParenthesis);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(467); conditionV();
				setState(468); logical_operator();
				setState(469); condition();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(471); conditionE();
				setState(472); logical_operator();
				setState(473); condition();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(475); conditionF();
				setState(476); logical_operator();
				setState(477); condition();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(479); conditionB();
				setState(480); logical_operator();
				setState(481); condition();
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
		enterRule(_localctx, 72, RULE_conditionB);
		try {
			setState(490);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(485); match(BoolLit);
				setState(486); comparison_bool_lit();
				setState(487); function_call();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(489); match(BoolLit);
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
		enterRule(_localctx, 74, RULE_conditionV);
		try {
			setState(505);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(492); match(VarIdentifier);
				setState(493); comparison();
				setState(494); match(VarIdentifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(496); match(VarIdentifier);
				setState(497); comparison();
				setState(498); expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(500); match(VarIdentifier);
				setState(501); comparison();
				setState(502); function_call();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(504); match(VarIdentifier);
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
		enterRule(_localctx, 76, RULE_conditionE);
		try {
			setState(519);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(507); expression();
				setState(508); comparison();
				setState(509); match(VarIdentifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(511); expression();
				setState(512); comparison();
				setState(513); expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(515); expression();
				setState(516); comparison();
				setState(517); function_call();
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
		enterRule(_localctx, 78, RULE_conditionF);
		try {
			setState(538);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(521); function_call();
				setState(522); comparison();
				setState(523); function_call();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(525); function_call();
				setState(526); comparison();
				setState(527); match(VarIdentifier);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(529); function_call();
				setState(530); comparison();
				setState(531); expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(533); function_call();
				setState(534); comparison();
				setState(535); match(BoolLit);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(537); function_call();
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
		enterRule(_localctx, 80, RULE_comparison_bool_lit);
		try {
			setState(543);
			switch (_input.LA(1)) {
			case EquaOp:
				enterOuterAlt(_localctx, 1);
				{
				System.out.println("in comparison bool lit");
				setState(541); match(EquaOp);
				}
				break;
			case NotEqualToOp:
				enterOuterAlt(_localctx, 2);
				{
				setState(542); match(NotEqualToOp);
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
		enterRule(_localctx, 82, RULE_comparison);
		try {
			setState(552);
			switch (_input.LA(1)) {
			case EquaOp:
				enterOuterAlt(_localctx, 1);
				{
				System.out.println("in comparison");
				setState(546); match(EquaOp);
				}
				break;
			case GreaterThanOp:
				enterOuterAlt(_localctx, 2);
				{
				setState(547); match(GreaterThanOp);
				}
				break;
			case LessThanOp:
				enterOuterAlt(_localctx, 3);
				{
				setState(548); match(LessThanOp);
				}
				break;
			case GreaterThanEqualTo:
				enterOuterAlt(_localctx, 4);
				{
				setState(549); match(GreaterThanEqualTo);
				}
				break;
			case LessThanEqualTo:
				enterOuterAlt(_localctx, 5);
				{
				setState(550); match(LessThanEqualTo);
				}
				break;
			case NotEqualToOp:
				enterOuterAlt(_localctx, 6);
				{
				setState(551); match(NotEqualToOp);
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
		enterRule(_localctx, 84, RULE_logical_operator);
		try {
			setState(557);
			switch (_input.LA(1)) {
			case AndOp:
				enterOuterAlt(_localctx, 1);
				{
				System.out.println("in logical_operator");
				setState(555); match(AndOp);
				}
				break;
			case OrOp:
				enterOuterAlt(_localctx, 2);
				{
				setState(556); match(OrOp);
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
		enterRule(_localctx, 86, RULE_function_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			System.out.println("in function_call");
			setState(560); match(VarIdentifier);
			setState(561); match(OpenParenthesis);
			setState(562); function_call_parameters();
			setState(563); match(CloseParenthesis);
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
		enterRule(_localctx, 88, RULE_function_call_parameters);
		try {
			setState(571);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				System.out.println("in function_call_parameters");
				setState(566); returns_value();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(567); returns_value();
				setState(568); match(Comma);
				setState(569); function_call_parameters();
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\65\u0240\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\5\5s\n\5\3\6\3\6\3\6\3\6\3\6\5\6z\n"+
		"\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\5\7\u008f\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\5\b\u009e\n\b\3\t\3\t\3\t\5\t\u00a3\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5"+
		"\13\u00ba\n\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\5\16\u00c7"+
		"\n\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00de\n\20\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\5\21\u00e6\n\21\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00ee"+
		"\n\22\3\23\3\23\3\23\3\23\3\23\5\23\u00f5\n\23\3\24\3\24\3\24\3\24\3\25"+
		"\3\25\3\25\3\25\3\25\5\25\u0100\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\5\26\u010d\n\26\3\27\3\27\3\27\3\30\3\30\3\30\3\30"+
		"\3\30\5\30\u0117\n\30\3\31\3\31\3\31\3\31\3\31\5\31\u011e\n\31\3\32\3"+
		"\32\3\32\5\32\u0123\n\32\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u012b\n\33"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u0135\n\34\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u0143\n\35\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u015c\n\36\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u0177\n\37\3 \3 \3 \3 \3 \3 "+
		"\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \5 \u018f\n \3!\3!\3!"+
		"\3!\5!\u0195\n!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3"+
		"\"\3\"\5\"\u01a6\n\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3"+
		"#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u01c1\n#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3"+
		"$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3"+
		"%\3%\5%\u01e6\n%\3&\3&\3&\3&\3&\5&\u01ed\n&\3\'\3\'\3\'\3\'\3\'\3\'\3"+
		"\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u01fc\n\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\3"+
		"(\3(\3(\5(\u020a\n(\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3"+
		")\5)\u021d\n)\3*\3*\3*\5*\u0222\n*\3+\3+\3+\3+\3+\3+\3+\5+\u022b\n+\3"+
		",\3,\3,\5,\u0230\n,\3-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\5.\u023e\n.\3"+
		".\2\2/\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<"+
		">@BDFHJLNPRTVXZ\2\4\3\2\34\35\3\2\36 \u0265\2\\\3\2\2\2\4_\3\2\2\2\6c"+
		"\3\2\2\2\br\3\2\2\2\ny\3\2\2\2\f\u008e\3\2\2\2\16\u009d\3\2\2\2\20\u00a2"+
		"\3\2\2\2\22\u00a4\3\2\2\2\24\u00b9\3\2\2\2\26\u00bb\3\2\2\2\30\u00bf\3"+
		"\2\2\2\32\u00c6\3\2\2\2\34\u00c8\3\2\2\2\36\u00dd\3\2\2\2 \u00e5\3\2\2"+
		"\2\"\u00ed\3\2\2\2$\u00f4\3\2\2\2&\u00f6\3\2\2\2(\u00ff\3\2\2\2*\u010c"+
		"\3\2\2\2,\u010e\3\2\2\2.\u0116\3\2\2\2\60\u011d\3\2\2\2\62\u0122\3\2\2"+
		"\2\64\u012a\3\2\2\2\66\u0134\3\2\2\28\u0142\3\2\2\2:\u015b\3\2\2\2<\u0176"+
		"\3\2\2\2>\u018e\3\2\2\2@\u0194\3\2\2\2B\u01a5\3\2\2\2D\u01c0\3\2\2\2F"+
		"\u01c2\3\2\2\2H\u01e5\3\2\2\2J\u01ec\3\2\2\2L\u01fb\3\2\2\2N\u0209\3\2"+
		"\2\2P\u021c\3\2\2\2R\u0221\3\2\2\2T\u022a\3\2\2\2V\u022f\3\2\2\2X\u0231"+
		"\3\2\2\2Z\u023d\3\2\2\2\\]\5\4\3\2]^\7\2\2\3^\3\3\2\2\2_`\5\b\5\2`a\5"+
		"\6\4\2ab\5\b\5\2b\5\3\2\2\2cd\b\4\1\2de\7\13\2\2ef\7\26\2\2fg\7\27\2\2"+
		"gh\7-\2\2hi\7.\2\2ij\7+\2\2jk\5\n\6\2kl\7,\2\2l\7\3\2\2\2mn\b\5\1\2no"+
		"\5\22\n\2op\5\b\5\2ps\3\2\2\2qs\3\2\2\2rm\3\2\2\2rq\3\2\2\2s\t\3\2\2\2"+
		"tu\b\6\1\2uv\5\f\7\2vw\5\n\6\2wz\3\2\2\2xz\5\f\7\2yt\3\2\2\2yx\3\2\2\2"+
		"z\13\3\2\2\2{|\b\7\1\2|}\5\36\20\2}~\7\t\2\2~\u008f\3\2\2\2\177\u0080"+
		"\5\66\34\2\u0080\u0081\7\t\2\2\u0081\u008f\3\2\2\2\u0082\u0083\5X-\2\u0083"+
		"\u0084\7\t\2\2\u0084\u008f\3\2\2\2\u0085\u008f\58\35\2\u0086\u008f\5@"+
		"!\2\u0087\u0088\5\30\r\2\u0088\u0089\7\t\2\2\u0089\u008f\3\2\2\2\u008a"+
		"\u008b\5\34\17\2\u008b\u008c\7\t\2\2\u008c\u008f\3\2\2\2\u008d\u008f\7"+
		"\t\2\2\u008e{\3\2\2\2\u008e\177\3\2\2\2\u008e\u0082\3\2\2\2\u008e\u0085"+
		"\3\2\2\2\u008e\u0086\3\2\2\2\u008e\u0087\3\2\2\2\u008e\u008a\3\2\2\2\u008e"+
		"\u008d\3\2\2\2\u008f\r\3\2\2\2\u0090\u0091\b\b\1\2\u0091\u0092\5\36\20"+
		"\2\u0092\u0093\7\t\2\2\u0093\u009e\3\2\2\2\u0094\u0095\5\66\34\2\u0095"+
		"\u0096\7\t\2\2\u0096\u009e\3\2\2\2\u0097\u0098\5X-\2\u0098\u0099\7\t\2"+
		"\2\u0099\u009e\3\2\2\2\u009a\u009e\58\35\2\u009b\u009e\5@!\2\u009c\u009e"+
		"\7\t\2\2\u009d\u0090\3\2\2\2\u009d\u0094\3\2\2\2\u009d\u0097\3\2\2\2\u009d"+
		"\u009a\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009c\3\2\2\2\u009e\17\3\2\2"+
		"\2\u009f\u00a0\b\t\1\2\u00a0\u00a3\5\66\34\2\u00a1\u00a3\5X-\2\u00a2\u009f"+
		"\3\2\2\2\u00a2\u00a1\3\2\2\2\u00a3\21\3\2\2\2\u00a4\u00a5\b\n\1\2\u00a5"+
		"\u00a6\7\13\2\2\u00a6\u00a7\5$\23\2\u00a7\u00a8\7\64\2\2\u00a8\u00a9\7"+
		"-\2\2\u00a9\u00aa\5\24\13\2\u00aa\u00ab\7.\2\2\u00ab\u00ac\7+\2\2\u00ac"+
		"\u00ad\5\n\6\2\u00ad\u00ae\5\26\f\2\u00ae\u00af\7,\2\2\u00af\23\3\2\2"+
		"\2\u00b0\u00b1\b\13\1\2\u00b1\u00b2\5$\23\2\u00b2\u00b3\7\64\2\2\u00b3"+
		"\u00ba\3\2\2\2\u00b4\u00b5\5$\23\2\u00b5\u00b6\7\64\2\2\u00b6\u00b7\7"+
		"\30\2\2\u00b7\u00b8\5\24\13\2\u00b8\u00ba\3\2\2\2\u00b9\u00b0\3\2\2\2"+
		"\u00b9\u00b4\3\2\2\2\u00ba\25\3\2\2\2\u00bb\u00bc\7\32\2\2\u00bc\u00bd"+
		"\5*\26\2\u00bd\u00be\7\t\2\2\u00be\27\3\2\2\2\u00bf\u00c0\7\16\2\2\u00c0"+
		"\u00c1\5\32\16\2\u00c1\31\3\2\2\2\u00c2\u00c7\5 \21\2\u00c3\u00c7\7\64"+
		"\2\2\u00c4\u00c7\5X-\2\u00c5\u00c7\5,\27\2\u00c6\u00c2\3\2\2\2\u00c6\u00c3"+
		"\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c5\3\2\2\2\u00c7\33\3\2\2\2\u00c8"+
		"\u00c9\7\17\2\2\u00c9\u00ca\5$\23\2\u00ca\u00cb\7\64\2\2\u00cb\35\3\2"+
		"\2\2\u00cc\u00cd\b\20\1\2\u00cd\u00ce\7\n\2\2\u00ce\u00cf\5$\23\2\u00cf"+
		"\u00d0\5(\25\2\u00d0\u00de\3\2\2\2\u00d1\u00d2\7\n\2\2\u00d2\u00d3\5$"+
		"\23\2\u00d3\u00d4\7\64\2\2\u00d4\u00d5\7\r\2\2\u00d5\u00d6\5*\26\2\u00d6"+
		"\u00de\3\2\2\2\u00d7\u00d8\7\n\2\2\u00d8\u00d9\5&\24\2\u00d9\u00da\7\64"+
		"\2\2\u00da\u00db\7\r\2\2\u00db\u00dc\5*\26\2\u00dc\u00de\3\2\2\2\u00dd"+
		"\u00cc\3\2\2\2\u00dd\u00d1\3\2\2\2\u00dd\u00d7\3\2\2\2\u00de\37\3\2\2"+
		"\2\u00df\u00e0\b\21\1\2\u00e0\u00e6\7/\2\2\u00e1\u00e6\7\60\2\2\u00e2"+
		"\u00e6\7\61\2\2\u00e3\u00e6\7\62\2\2\u00e4\u00e6\7\33\2\2\u00e5\u00df"+
		"\3\2\2\2\u00e5\u00e1\3\2\2\2\u00e5\u00e2\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5"+
		"\u00e4\3\2\2\2\u00e6!\3\2\2\2\u00e7\u00e8\b\22\1\2\u00e8\u00e9\7\30\2"+
		"\2\u00e9\u00ea\5 \21\2\u00ea\u00eb\5\"\22\2\u00eb\u00ee\3\2\2\2\u00ec"+
		"\u00ee\3\2\2\2\u00ed\u00e7\3\2\2\2\u00ed\u00ec\3\2\2\2\u00ee#\3\2\2\2"+
		"\u00ef\u00f0\b\23\1\2\u00f0\u00f5\7\5\2\2\u00f1\u00f5\7\6\2\2\u00f2\u00f5"+
		"\7\7\2\2\u00f3\u00f5\7\b\2\2\u00f4\u00ef\3\2\2\2\u00f4\u00f1\3\2\2\2\u00f4"+
		"\u00f2\3\2\2\2\u00f4\u00f3\3\2\2\2\u00f5%\3\2\2\2\u00f6\u00f7\b\24\1\2"+
		"\u00f7\u00f8\5$\23\2\u00f8\u00f9\7\63\2\2\u00f9\'\3\2\2\2\u00fa\u00fb"+
		"\b\25\1\2\u00fb\u00fc\7\64\2\2\u00fc\u00fd\7\30\2\2\u00fd\u0100\5(\25"+
		"\2\u00fe\u0100\7\64\2\2\u00ff\u00fa\3\2\2\2\u00ff\u00fe\3\2\2\2\u0100"+
		")\3\2\2\2\u0101\u0102\b\26\1\2\u0102\u010d\5 \21\2\u0103\u0104\7+\2\2"+
		"\u0104\u0105\5 \21\2\u0105\u0106\5\"\22\2\u0106\u0107\7,\2\2\u0107\u010d"+
		"\3\2\2\2\u0108\u010d\7\64\2\2\u0109\u010d\5,\27\2\u010a\u010d\5X-\2\u010b"+
		"\u010d\7\31\2\2\u010c\u0101\3\2\2\2\u010c\u0103\3\2\2\2\u010c\u0108\3"+
		"\2\2\2\u010c\u0109\3\2\2\2\u010c\u010a\3\2\2\2\u010c\u010b\3\2\2\2\u010d"+
		"+\3\2\2\2\u010e\u010f\5.\30\2\u010f\u0110\b\27\1\2\u0110-\3\2\2\2\u0111"+
		"\u0112\5\60\31\2\u0112\u0113\t\2\2\2\u0113\u0114\5\60\31\2\u0114\u0117"+
		"\3\2\2\2\u0115\u0117\5\60\31\2\u0116\u0111\3\2\2\2\u0116\u0115\3\2\2\2"+
		"\u0117/\3\2\2\2\u0118\u0119\5\62\32\2\u0119\u011a\t\3\2\2\u011a\u011b"+
		"\5\62\32\2\u011b\u011e\3\2\2\2\u011c\u011e\5\62\32\2\u011d\u0118\3\2\2"+
		"\2\u011d\u011c\3\2\2\2\u011e\61\3\2\2\2\u011f\u0120\7\35\2\2\u0120\u0123"+
		"\5\64\33\2\u0121\u0123\5\64\33\2\u0122\u011f\3\2\2\2\u0122\u0121\3\2\2"+
		"\2\u0123\63\3\2\2\2\u0124\u012b\7/\2\2\u0125\u0126\7-\2\2\u0126\u0127"+
		"\5,\27\2\u0127\u0128\7.\2\2\u0128\u012b\3\2\2\2\u0129\u012b\7\64\2\2\u012a"+
		"\u0124\3\2\2\2\u012a\u0125\3\2\2\2\u012a\u0129\3\2\2\2\u012b\65\3\2\2"+
		"\2\u012c\u0135\b\34\1\2\u012d\u012e\7\64\2\2\u012e\u012f\7\r\2\2\u012f"+
		"\u0135\5*\26\2\u0130\u0131\7\64\2\2\u0131\u0135\7)\2\2\u0132\u0133\7\64"+
		"\2\2\u0133\u0135\7*\2\2\u0134\u012c\3\2\2\2\u0134\u012d\3\2\2\2\u0134"+
		"\u0130\3\2\2\2\u0134\u0132\3\2\2\2\u0135\67\3\2\2\2\u0136\u0137\b\35\1"+
		"\2\u0137\u0143\5:\36\2\u0138\u0139\5:\36\2\u0139\u013a\5<\37\2\u013a\u0143"+
		"\3\2\2\2\u013b\u013c\5:\36\2\u013c\u013d\5> \2\u013d\u0143\3\2\2\2\u013e"+
		"\u013f\5:\36\2\u013f\u0140\5> \2\u0140\u0141\5<\37\2\u0141\u0143\3\2\2"+
		"\2\u0142\u0136\3\2\2\2\u0142\u0138\3\2\2\2\u0142\u013b\3\2\2\2\u0142\u013e"+
		"\3\2\2\2\u01439\3\2\2\2\u0144\u0145\b\36\1\2\u0145\u0146\7\20\2\2\u0146"+
		"\u0147\7-\2\2\u0147\u0148\5H%\2\u0148\u0149\7.\2\2\u0149\u014a\5\16\b"+
		"\2\u014a\u015c\3\2\2\2\u014b\u014c\7\20\2\2\u014c\u014d\7-\2\2\u014d\u014e"+
		"\5H%\2\u014e\u014f\7.\2\2\u014f\u0150\7+\2\2\u0150\u0151\5\16\b\2\u0151"+
		"\u0152\7,\2\2\u0152\u015c\3\2\2\2\u0153\u0154\7\20\2\2\u0154\u0155\7-"+
		"\2\2\u0155\u0156\5H%\2\u0156\u0157\7.\2\2\u0157\u0158\7+\2\2\u0158\u0159"+
		"\5\n\6\2\u0159\u015a\7,\2\2\u015a\u015c\3\2\2\2\u015b\u0144\3\2\2\2\u015b"+
		"\u014b\3\2\2\2\u015b\u0153\3\2\2\2\u015c;\3\2\2\2\u015d\u015e\b\37\1\2"+
		"\u015e\u015f\7\21\2\2\u015f\u0160\7-\2\2\u0160\u0161\5H%\2\u0161\u0162"+
		"\7.\2\2\u0162\u0163\5\16\b\2\u0163\u0177\3\2\2\2\u0164\u0165\7\21\2\2"+
		"\u0165\u0166\7-\2\2\u0166\u0167\5H%\2\u0167\u0168\7.\2\2\u0168\u0169\7"+
		"+\2\2\u0169\u016a\5\16\b\2\u016a\u016b\7,\2\2\u016b\u0177\3\2\2\2\u016c"+
		"\u016d\7\21\2\2\u016d\u016e\7-\2\2\u016e\u016f\5H%\2\u016f\u0170\7.\2"+
		"\2\u0170\u0171\7+\2\2\u0171\u0172\5\n\6\2\u0172\u0173\7,\2\2\u0173\u0177"+
		"\3\2\2\2\u0174\u0175\7\21\2\2\u0175\u0177\5\16\b\2\u0176\u015d\3\2\2\2"+
		"\u0176\u0164\3\2\2\2\u0176\u016c\3\2\2\2\u0176\u0174\3\2\2\2\u0177=\3"+
		"\2\2\2\u0178\u0179\b \1\2\u0179\u017a\7\22\2\2\u017a\u017b\7-\2\2\u017b"+
		"\u017c\5H%\2\u017c\u017d\7.\2\2\u017d\u017e\5\16\b\2\u017e\u018f\3\2\2"+
		"\2\u017f\u0180\7\22\2\2\u0180\u0181\7-\2\2\u0181\u0182\5H%\2\u0182\u0183"+
		"\7.\2\2\u0183\u0184\5\16\b\2\u0184\u0185\7,\2\2\u0185\u018f\3\2\2\2\u0186"+
		"\u0187\7\22\2\2\u0187\u0188\7-\2\2\u0188\u0189\5H%\2\u0189\u018a\7.\2"+
		"\2\u018a\u018b\7+\2\2\u018b\u018c\5\n\6\2\u018c\u018d\7,\2\2\u018d\u018f"+
		"\3\2\2\2\u018e\u0178\3\2\2\2\u018e\u017f\3\2\2\2\u018e\u0186\3\2\2\2\u018f"+
		"?\3\2\2\2\u0190\u0191\b!\1\2\u0191\u0195\5B\"\2\u0192\u0195\5D#\2\u0193"+
		"\u0195\5F$\2\u0194\u0190\3\2\2\2\u0194\u0192\3\2\2\2\u0194\u0193\3\2\2"+
		"\2\u0195A\3\2\2\2\u0196\u0197\b\"\1\2\u0197\u0198\7\23\2\2\u0198\u0199"+
		"\7-\2\2\u0199\u019a\5H%\2\u019a\u019b\7.\2\2\u019b\u019c\7+\2\2\u019c"+
		"\u019d\5\n\6\2\u019d\u019e\7,\2\2\u019e\u01a6\3\2\2\2\u019f\u01a0\7\23"+
		"\2\2\u01a0\u01a1\7-\2\2\u01a1\u01a2\5H%\2\u01a2\u01a3\7.\2\2\u01a3\u01a4"+
		"\5\16\b\2\u01a4\u01a6\3\2\2\2\u01a5\u0196\3\2\2\2\u01a5\u019f\3\2\2\2"+
		"\u01a6C\3\2\2\2\u01a7\u01a8\b#\1\2\u01a8\u01a9\7\24\2\2\u01a9\u01aa\7"+
		"-\2\2\u01aa\u01ab\5\36\20\2\u01ab\u01ac\7\t\2\2\u01ac\u01ad\5H%\2\u01ad"+
		"\u01ae\7\t\2\2\u01ae\u01af\5\20\t\2\u01af\u01b0\7.\2\2\u01b0\u01b1\7+"+
		"\2\2\u01b1\u01b2\5\n\6\2\u01b2\u01b3\7,\2\2\u01b3\u01c1\3\2\2\2\u01b4"+
		"\u01b5\7\24\2\2\u01b5\u01b6\7-\2\2\u01b6\u01b7\5\66\34\2\u01b7\u01b8\7"+
		"\t\2\2\u01b8\u01b9\5H%\2\u01b9\u01ba\7\t\2\2\u01ba\u01bb\5\20\t\2\u01bb"+
		"\u01bc\7.\2\2\u01bc\u01bd\7+\2\2\u01bd\u01be\5\n\6\2\u01be\u01bf\7,\2"+
		"\2\u01bf\u01c1\3\2\2\2\u01c0\u01a7\3\2\2\2\u01c0\u01b4\3\2\2\2\u01c1E"+
		"\3\2\2\2\u01c2\u01c3\b$\1\2\u01c3\u01c4\7\25\2\2\u01c4\u01c5\7+\2\2\u01c5"+
		"\u01c6\5\n\6\2\u01c6\u01c7\7,\2\2\u01c7\u01c8\7\23\2\2\u01c8\u01c9\7-"+
		"\2\2\u01c9\u01ca\5H%\2\u01ca\u01cb\7.\2\2\u01cb\u01cc\7\t\2\2\u01ccG\3"+
		"\2\2\2\u01cd\u01e6\5L\'\2\u01ce\u01e6\5N(\2\u01cf\u01e6\5P)\2\u01d0\u01e6"+
		"\5J&\2\u01d1\u01d2\7-\2\2\u01d2\u01d3\5H%\2\u01d3\u01d4\7.\2\2\u01d4\u01e6"+
		"\3\2\2\2\u01d5\u01d6\5L\'\2\u01d6\u01d7\5V,\2\u01d7\u01d8\5H%\2\u01d8"+
		"\u01e6\3\2\2\2\u01d9\u01da\5N(\2\u01da\u01db\5V,\2\u01db\u01dc\5H%\2\u01dc"+
		"\u01e6\3\2\2\2\u01dd\u01de\5P)\2\u01de\u01df\5V,\2\u01df\u01e0\5H%\2\u01e0"+
		"\u01e6\3\2\2\2\u01e1\u01e2\5J&\2\u01e2\u01e3\5V,\2\u01e3\u01e4\5H%\2\u01e4"+
		"\u01e6\3\2\2\2\u01e5\u01cd\3\2\2\2\u01e5\u01ce\3\2\2\2\u01e5\u01cf\3\2"+
		"\2\2\u01e5\u01d0\3\2\2\2\u01e5\u01d1\3\2\2\2\u01e5\u01d5\3\2\2\2\u01e5"+
		"\u01d9\3\2\2\2\u01e5\u01dd\3\2\2\2\u01e5\u01e1\3\2\2\2\u01e6I\3\2\2\2"+
		"\u01e7\u01e8\7\33\2\2\u01e8\u01e9\5R*\2\u01e9\u01ea\5X-\2\u01ea\u01ed"+
		"\3\2\2\2\u01eb\u01ed\7\33\2\2\u01ec\u01e7\3\2\2\2\u01ec\u01eb\3\2\2\2"+
		"\u01edK\3\2\2\2\u01ee\u01ef\7\64\2\2\u01ef\u01f0\5T+\2\u01f0\u01f1\7\64"+
		"\2\2\u01f1\u01fc\3\2\2\2\u01f2\u01f3\7\64\2\2\u01f3\u01f4\5T+\2\u01f4"+
		"\u01f5\5,\27\2\u01f5\u01fc\3\2\2\2\u01f6\u01f7\7\64\2\2\u01f7\u01f8\5"+
		"T+\2\u01f8\u01f9\5X-\2\u01f9\u01fc\3\2\2\2\u01fa\u01fc\7\64\2\2\u01fb"+
		"\u01ee\3\2\2\2\u01fb\u01f2\3\2\2\2\u01fb\u01f6\3\2\2\2\u01fb\u01fa\3\2"+
		"\2\2\u01fcM\3\2\2\2\u01fd\u01fe\5,\27\2\u01fe\u01ff\5T+\2\u01ff\u0200"+
		"\7\64\2\2\u0200\u020a\3\2\2\2\u0201\u0202\5,\27\2\u0202\u0203\5T+\2\u0203"+
		"\u0204\5,\27\2\u0204\u020a\3\2\2\2\u0205\u0206\5,\27\2\u0206\u0207\5T"+
		"+\2\u0207\u0208\5X-\2\u0208\u020a\3\2\2\2\u0209\u01fd\3\2\2\2\u0209\u0201"+
		"\3\2\2\2\u0209\u0205\3\2\2\2\u020aO\3\2\2\2\u020b\u020c\5X-\2\u020c\u020d"+
		"\5T+\2\u020d\u020e\5X-\2\u020e\u021d\3\2\2\2\u020f\u0210\5X-\2\u0210\u0211"+
		"\5T+\2\u0211\u0212\7\64\2\2\u0212\u021d\3\2\2\2\u0213\u0214\5X-\2\u0214"+
		"\u0215\5T+\2\u0215\u0216\5,\27\2\u0216\u021d\3\2\2\2\u0217\u0218\5X-\2"+
		"\u0218\u0219\5T+\2\u0219\u021a\7\33\2\2\u021a\u021d\3\2\2\2\u021b\u021d"+
		"\5X-\2\u021c\u020b\3\2\2\2\u021c\u020f\3\2\2\2\u021c\u0213\3\2\2\2\u021c"+
		"\u0217\3\2\2\2\u021c\u021b\3\2\2\2\u021dQ\3\2\2\2\u021e\u021f\b*\1\2\u021f"+
		"\u0222\7!\2\2\u0220\u0222\7&\2\2\u0221\u021e\3\2\2\2\u0221\u0220\3\2\2"+
		"\2\u0222S\3\2\2\2\u0223\u0224\b+\1\2\u0224\u022b\7!\2\2\u0225\u022b\7"+
		"\"\2\2\u0226\u022b\7#\2\2\u0227\u022b\7$\2\2\u0228\u022b\7%\2\2\u0229"+
		"\u022b\7&\2\2\u022a\u0223\3\2\2\2\u022a\u0225\3\2\2\2\u022a\u0226\3\2"+
		"\2\2\u022a\u0227\3\2\2\2\u022a\u0228\3\2\2\2\u022a\u0229\3\2\2\2\u022b"+
		"U\3\2\2\2\u022c\u022d\b,\1\2\u022d\u0230\7\'\2\2\u022e\u0230\7(\2\2\u022f"+
		"\u022c\3\2\2\2\u022f\u022e\3\2\2\2\u0230W\3\2\2\2\u0231\u0232\b-\1\2\u0232"+
		"\u0233\7\64\2\2\u0233\u0234\7-\2\2\u0234\u0235\5Z.\2\u0235\u0236\7.\2"+
		"\2\u0236Y\3\2\2\2\u0237\u0238\b.\1\2\u0238\u023e\5*\26\2\u0239\u023a\5"+
		"*\26\2\u023a\u023b\7\30\2\2\u023b\u023c\5Z.\2\u023c\u023e\3\2\2\2\u023d"+
		"\u0237\3\2\2\2\u023d\u0239\3\2\2\2\u023e[\3\2\2\2$ry\u008e\u009d\u00a2"+
		"\u00b9\u00c6\u00dd\u00e5\u00ed\u00f4\u00ff\u010c\u0116\u011d\u0122\u012a"+
		"\u0134\u0142\u015b\u0176\u018e\u0194\u01a5\u01c0\u01e5\u01ec\u01fb\u0209"+
		"\u021c\u0221\u022a\u022f\u023d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}