// Generated from Pipifax.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PipifaxParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, Identifier=31, 
		Integer=32, Double=33, String=34, Comment=35, WS=36;
	public static final int
		RULE_program = 0, RULE_gvar_decl = 1, RULE_fn_def = 2, RULE_param_decls = 3, 
		RULE_param_decl = 4, RULE_type = 5, RULE_block = 6, RULE_lvar_decl = 7, 
		RULE_stmt = 8, RULE_if_stmt = 9, RULE_while_stmt = 10, RULE_fn_call_stmt = 11, 
		RULE_assignment = 12, RULE_lvalue = 13, RULE_expr = 14, RULE_fn_call = 15, 
		RULE_args = 16;
	public static final String[] ruleNames = {
		"program", "gvar_decl", "fn_def", "param_decls", "param_decl", "type", 
		"block", "lvar_decl", "stmt", "if_stmt", "while_stmt", "fn_call_stmt", 
		"assignment", "lvalue", "expr", "fn_call", "args"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'var'", "'fn'", "'('", "')'", "','", "'int'", "'double'", "'string'", 
		"'['", "']'", "'*'", "'{'", "'}'", "'if'", "'else'", "'while'", "'='", 
		"'-'", "'!'", "'/'", "'+'", "'<'", "'>'", "'<='", "'>='", "'<=>'", "'=='", 
		"'!='", "'&&'", "'||'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, "Identifier", "Integer", "Double", 
		"String", "Comment", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Pipifax.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PipifaxParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public List<Gvar_declContext> gvar_decl() {
			return getRuleContexts(Gvar_declContext.class);
		}
		public Gvar_declContext gvar_decl(int i) {
			return getRuleContext(Gvar_declContext.class,i);
		}
		public List<Fn_defContext> fn_def() {
			return getRuleContexts(Fn_defContext.class);
		}
		public Fn_defContext fn_def(int i) {
			return getRuleContext(Fn_defContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PipifaxVisitor ) return ((PipifaxVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0 || _la==T__1) {
				{
				setState(36);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
					{
					setState(34);
					gvar_decl();
					}
					break;
				case T__1:
					{
					setState(35);
					fn_def();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(40);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class Gvar_declContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(PipifaxParser.Identifier, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Gvar_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gvar_decl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PipifaxVisitor ) return ((PipifaxVisitor<? extends T>)visitor).visitGvar_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Gvar_declContext gvar_decl() throws RecognitionException {
		Gvar_declContext _localctx = new Gvar_declContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_gvar_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			match(T__0);
			setState(42);
			match(Identifier);
			setState(43);
			type();
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

	public static class Fn_defContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(PipifaxParser.Identifier, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Param_declsContext param_decls() {
			return getRuleContext(Param_declsContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Fn_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fn_def; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PipifaxVisitor ) return ((PipifaxVisitor<? extends T>)visitor).visitFn_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fn_defContext fn_def() throws RecognitionException {
		Fn_defContext _localctx = new Fn_defContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_fn_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			match(T__1);
			setState(46);
			match(Identifier);
			setState(47);
			match(T__2);
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(48);
				param_decls();
				}
			}

			setState(51);
			match(T__3);
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__10))) != 0)) {
				{
				setState(52);
				type();
				}
			}

			setState(55);
			block();
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

	public static class Param_declsContext extends ParserRuleContext {
		public List<Param_declContext> param_decl() {
			return getRuleContexts(Param_declContext.class);
		}
		public Param_declContext param_decl(int i) {
			return getRuleContext(Param_declContext.class,i);
		}
		public Param_declsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_decls; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PipifaxVisitor ) return ((PipifaxVisitor<? extends T>)visitor).visitParam_decls(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Param_declsContext param_decls() throws RecognitionException {
		Param_declsContext _localctx = new Param_declsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_param_decls);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			param_decl();
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(58);
				match(T__4);
				setState(59);
				param_decl();
				}
				}
				setState(64);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class Param_declContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(PipifaxParser.Identifier, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Param_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_decl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PipifaxVisitor ) return ((PipifaxVisitor<? extends T>)visitor).visitParam_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Param_declContext param_decl() throws RecognitionException {
		Param_declContext _localctx = new Param_declContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_param_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(Identifier);
			setState(66);
			type();
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

	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	 
		public TypeContext() { }
		public void copyFrom(TypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DoubleTypeContext extends TypeContext {
		public DoubleTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PipifaxVisitor ) return ((PipifaxVisitor<? extends T>)visitor).visitDoubleType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayRefTypeContext extends TypeContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ArrayRefTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PipifaxVisitor ) return ((PipifaxVisitor<? extends T>)visitor).visitArrayRefType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayTypeContext extends TypeContext {
		public TerminalNode Integer() { return getToken(PipifaxParser.Integer, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ArrayTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PipifaxVisitor ) return ((PipifaxVisitor<? extends T>)visitor).visitArrayType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntTypeContext extends TypeContext {
		public IntTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PipifaxVisitor ) return ((PipifaxVisitor<? extends T>)visitor).visitIntType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringTypeContext extends TypeContext {
		public StringTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PipifaxVisitor ) return ((PipifaxVisitor<? extends T>)visitor).visitStringType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReferenceTypeContext extends TypeContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ReferenceTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PipifaxVisitor ) return ((PipifaxVisitor<? extends T>)visitor).visitReferenceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_type);
		try {
			setState(81);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new IntTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(68);
				match(T__5);
				}
				break;
			case 2:
				_localctx = new DoubleTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(69);
				match(T__6);
				}
				break;
			case 3:
				_localctx = new StringTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(70);
				match(T__7);
				}
				break;
			case 4:
				_localctx = new ArrayTypeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(71);
				match(T__8);
				setState(72);
				match(Integer);
				setState(73);
				match(T__9);
				setState(74);
				type();
				}
				break;
			case 5:
				_localctx = new ReferenceTypeContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(75);
				match(T__10);
				setState(76);
				type();
				}
				break;
			case 6:
				_localctx = new ArrayRefTypeContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(77);
				match(T__10);
				setState(78);
				match(T__8);
				setState(79);
				match(T__9);
				setState(80);
				type();
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

	public static class BlockContext extends ParserRuleContext {
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public List<Lvar_declContext> lvar_decl() {
			return getRuleContexts(Lvar_declContext.class);
		}
		public Lvar_declContext lvar_decl(int i) {
			return getRuleContext(Lvar_declContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PipifaxVisitor ) return ((PipifaxVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(T__11);
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__11) | (1L << T__13) | (1L << T__15) | (1L << Identifier))) != 0)) {
				{
				setState(86);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__11:
				case T__13:
				case T__15:
				case Identifier:
					{
					setState(84);
					stmt();
					}
					break;
				case T__0:
					{
					setState(85);
					lvar_decl();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(91);
			match(T__12);
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

	public static class Lvar_declContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(PipifaxParser.Identifier, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Lvar_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lvar_decl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PipifaxVisitor ) return ((PipifaxVisitor<? extends T>)visitor).visitLvar_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lvar_declContext lvar_decl() throws RecognitionException {
		Lvar_declContext _localctx = new Lvar_declContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_lvar_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(T__0);
			setState(94);
			match(Identifier);
			setState(95);
			type();
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

	public static class StmtContext extends ParserRuleContext {
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
	 
		public StmtContext() { }
		public void copyFrom(StmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WhileStmtContext extends StmtContext {
		public While_stmtContext while_stmt() {
			return getRuleContext(While_stmtContext.class,0);
		}
		public WhileStmtContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PipifaxVisitor ) return ((PipifaxVisitor<? extends T>)visitor).visitWhileStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CallStmtContext extends StmtContext {
		public Fn_call_stmtContext fn_call_stmt() {
			return getRuleContext(Fn_call_stmtContext.class,0);
		}
		public CallStmtContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PipifaxVisitor ) return ((PipifaxVisitor<? extends T>)visitor).visitCallStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfStmtContext extends StmtContext {
		public If_stmtContext if_stmt() {
			return getRuleContext(If_stmtContext.class,0);
		}
		public IfStmtContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PipifaxVisitor ) return ((PipifaxVisitor<? extends T>)visitor).visitIfStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BlockStmtContext extends StmtContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public BlockStmtContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PipifaxVisitor ) return ((PipifaxVisitor<? extends T>)visitor).visitBlockStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignStmtContext extends StmtContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public AssignStmtContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PipifaxVisitor ) return ((PipifaxVisitor<? extends T>)visitor).visitAssignStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_stmt);
		try {
			setState(102);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new IfStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(97);
				if_stmt();
				}
				break;
			case 2:
				_localctx = new WhileStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(98);
				while_stmt();
				}
				break;
			case 3:
				_localctx = new CallStmtContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(99);
				fn_call_stmt();
				}
				break;
			case 4:
				_localctx = new AssignStmtContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(100);
				assignment();
				}
				break;
			case 5:
				_localctx = new BlockStmtContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(101);
				block();
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

	public static class If_stmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public If_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PipifaxVisitor ) return ((PipifaxVisitor<? extends T>)visitor).visitIf_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_stmtContext if_stmt() throws RecognitionException {
		If_stmtContext _localctx = new If_stmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_if_stmt);
		try {
			setState(114);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(104);
				match(T__13);
				setState(105);
				expr(0);
				setState(106);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(108);
				match(T__13);
				setState(109);
				expr(0);
				setState(110);
				block();
				setState(111);
				match(T__14);
				setState(112);
				block();
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

	public static class While_stmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public While_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PipifaxVisitor ) return ((PipifaxVisitor<? extends T>)visitor).visitWhile_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_stmtContext while_stmt() throws RecognitionException {
		While_stmtContext _localctx = new While_stmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_while_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(T__15);
			setState(117);
			expr(0);
			setState(118);
			block();
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

	public static class Fn_call_stmtContext extends ParserRuleContext {
		public Fn_callContext fn_call() {
			return getRuleContext(Fn_callContext.class,0);
		}
		public Fn_call_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fn_call_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PipifaxVisitor ) return ((PipifaxVisitor<? extends T>)visitor).visitFn_call_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fn_call_stmtContext fn_call_stmt() throws RecognitionException {
		Fn_call_stmtContext _localctx = new Fn_call_stmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_fn_call_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			fn_call();
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

	public static class AssignmentContext extends ParserRuleContext {
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PipifaxVisitor ) return ((PipifaxVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			lvalue(0);
			setState(123);
			match(T__16);
			setState(124);
			expr(0);
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

	public static class LvalueContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(PipifaxParser.Identifier, 0); }
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public LvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lvalue; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PipifaxVisitor ) return ((PipifaxVisitor<? extends T>)visitor).visitLvalue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LvalueContext lvalue() throws RecognitionException {
		return lvalue(0);
	}

	private LvalueContext lvalue(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LvalueContext _localctx = new LvalueContext(_ctx, _parentState);
		LvalueContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_lvalue, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(127);
			match(Identifier);
			}
			_ctx.stop = _input.LT(-1);
			setState(136);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LvalueContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_lvalue);
					setState(129);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(130);
					match(T__8);
					setState(131);
					expr(0);
					setState(132);
					match(T__9);
					}
					} 
				}
				setState(138);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BracketExprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BracketExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PipifaxVisitor ) return ((PipifaxVisitor<? extends T>)visitor).visitBracketExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntLiteralContext extends ExprContext {
		public TerminalNode Integer() { return getToken(PipifaxParser.Integer, 0); }
		public IntLiteralContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PipifaxVisitor ) return ((PipifaxVisitor<? extends T>)visitor).visitIntLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntCastExprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public IntCastExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PipifaxVisitor ) return ((PipifaxVisitor<? extends T>)visitor).visitIntCastExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LessExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public LessExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PipifaxVisitor ) return ((PipifaxVisitor<? extends T>)visitor).visitLessExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public OrExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PipifaxVisitor ) return ((PipifaxVisitor<? extends T>)visitor).visitOrExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public SubExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PipifaxVisitor ) return ((PipifaxVisitor<? extends T>)visitor).visitSubExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public MultExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PipifaxVisitor ) return ((PipifaxVisitor<? extends T>)visitor).visitMultExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GreaterEqualExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public GreaterEqualExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PipifaxVisitor ) return ((PipifaxVisitor<? extends T>)visitor).visitGreaterEqualExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LessEqualExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public LessEqualExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PipifaxVisitor ) return ((PipifaxVisitor<? extends T>)visitor).visitLessEqualExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GreaterExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public GreaterExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PipifaxVisitor ) return ((PipifaxVisitor<? extends T>)visitor).visitGreaterExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DoubleCastExprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DoubleCastExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PipifaxVisitor ) return ((PipifaxVisitor<? extends T>)visitor).visitDoubleCastExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotExprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NotExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PipifaxVisitor ) return ((PipifaxVisitor<? extends T>)visitor).visitNotExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringLiteralContext extends ExprContext {
		public TerminalNode String() { return getToken(PipifaxParser.String, 0); }
		public StringLiteralContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PipifaxVisitor ) return ((PipifaxVisitor<? extends T>)visitor).visitStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public AddExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PipifaxVisitor ) return ((PipifaxVisitor<? extends T>)visitor).visitAddExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NegExprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NegExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PipifaxVisitor ) return ((PipifaxVisitor<? extends T>)visitor).visitNegExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CompExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public CompExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PipifaxVisitor ) return ((PipifaxVisitor<? extends T>)visitor).visitCompExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DoubleLiteralContext extends ExprContext {
		public TerminalNode Double() { return getToken(PipifaxParser.Double, 0); }
		public DoubleLiteralContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PipifaxVisitor ) return ((PipifaxVisitor<? extends T>)visitor).visitDoubleLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotEqualExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public NotEqualExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PipifaxVisitor ) return ((PipifaxVisitor<? extends T>)visitor).visitNotEqualExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DivExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public DivExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PipifaxVisitor ) return ((PipifaxVisitor<? extends T>)visitor).visitDivExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CallExprContext extends ExprContext {
		public Fn_callContext fn_call() {
			return getRuleContext(Fn_callContext.class,0);
		}
		public CallExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PipifaxVisitor ) return ((PipifaxVisitor<? extends T>)visitor).visitCallExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LvalExprContext extends ExprContext {
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public LvalExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PipifaxVisitor ) return ((PipifaxVisitor<? extends T>)visitor).visitLvalExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqualExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public EqualExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PipifaxVisitor ) return ((PipifaxVisitor<? extends T>)visitor).visitEqualExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public AndExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PipifaxVisitor ) return ((PipifaxVisitor<? extends T>)visitor).visitAndExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				_localctx = new IntLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(140);
				match(Integer);
				}
				break;
			case 2:
				{
				_localctx = new DoubleLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(141);
				match(Double);
				}
				break;
			case 3:
				{
				_localctx = new StringLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(142);
				match(String);
				}
				break;
			case 4:
				{
				_localctx = new LvalExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(143);
				lvalue(0);
				}
				break;
			case 5:
				{
				_localctx = new CallExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(144);
				fn_call();
				}
				break;
			case 6:
				{
				_localctx = new BracketExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(145);
				match(T__2);
				setState(146);
				expr(0);
				setState(147);
				match(T__3);
				}
				break;
			case 7:
				{
				_localctx = new NegExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(149);
				match(T__17);
				setState(150);
				expr(17);
				}
				break;
			case 8:
				{
				_localctx = new NotExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(151);
				match(T__18);
				setState(152);
				expr(16);
				}
				break;
			case 9:
				{
				_localctx = new IntCastExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(153);
				match(T__2);
				setState(154);
				match(T__5);
				setState(155);
				match(T__3);
				setState(156);
				expr(15);
				}
				break;
			case 10:
				{
				_localctx = new DoubleCastExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(157);
				match(T__2);
				setState(158);
				match(T__6);
				setState(159);
				match(T__3);
				setState(160);
				expr(14);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(204);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(202);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new MultExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(163);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(164);
						match(T__10);
						setState(165);
						expr(14);
						}
						break;
					case 2:
						{
						_localctx = new DivExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(166);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(167);
						match(T__19);
						setState(168);
						expr(13);
						}
						break;
					case 3:
						{
						_localctx = new AddExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(169);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(170);
						match(T__20);
						setState(171);
						expr(12);
						}
						break;
					case 4:
						{
						_localctx = new SubExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(172);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(173);
						match(T__17);
						setState(174);
						expr(11);
						}
						break;
					case 5:
						{
						_localctx = new LessExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(175);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(176);
						match(T__21);
						setState(177);
						expr(10);
						}
						break;
					case 6:
						{
						_localctx = new GreaterExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(178);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(179);
						match(T__22);
						setState(180);
						expr(9);
						}
						break;
					case 7:
						{
						_localctx = new LessEqualExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(181);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(182);
						match(T__23);
						setState(183);
						expr(8);
						}
						break;
					case 8:
						{
						_localctx = new GreaterEqualExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(184);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(185);
						match(T__24);
						setState(186);
						expr(7);
						}
						break;
					case 9:
						{
						_localctx = new CompExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(187);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(188);
						match(T__25);
						setState(189);
						expr(6);
						}
						break;
					case 10:
						{
						_localctx = new EqualExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(190);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(191);
						match(T__26);
						setState(192);
						expr(5);
						}
						break;
					case 11:
						{
						_localctx = new NotEqualExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(193);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(194);
						match(T__27);
						setState(195);
						expr(4);
						}
						break;
					case 12:
						{
						_localctx = new AndExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(196);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(197);
						match(T__28);
						setState(198);
						expr(3);
						}
						break;
					case 13:
						{
						_localctx = new OrExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(199);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(200);
						match(T__29);
						setState(201);
						expr(2);
						}
						break;
					}
					} 
				}
				setState(206);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Fn_callContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(PipifaxParser.Identifier, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public Fn_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fn_call; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PipifaxVisitor ) return ((PipifaxVisitor<? extends T>)visitor).visitFn_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fn_callContext fn_call() throws RecognitionException {
		Fn_callContext _localctx = new Fn_callContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_fn_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			match(Identifier);
			setState(208);
			match(T__2);
			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__17) | (1L << T__18) | (1L << Identifier) | (1L << Integer) | (1L << Double) | (1L << String))) != 0)) {
				{
				setState(209);
				args();
				}
			}

			setState(212);
			match(T__3);
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

	public static class ArgsContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PipifaxVisitor ) return ((PipifaxVisitor<? extends T>)visitor).visitArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			expr(0);
			setState(219);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(215);
				match(T__4);
				setState(216);
				expr(0);
				}
				}
				setState(221);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 13:
			return lvalue_sempred((LvalueContext)_localctx, predIndex);
		case 14:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean lvalue_sempred(LvalueContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 13);
		case 2:
			return precpred(_ctx, 12);
		case 3:
			return precpred(_ctx, 11);
		case 4:
			return precpred(_ctx, 10);
		case 5:
			return precpred(_ctx, 9);
		case 6:
			return precpred(_ctx, 8);
		case 7:
			return precpred(_ctx, 7);
		case 8:
			return precpred(_ctx, 6);
		case 9:
			return precpred(_ctx, 5);
		case 10:
			return precpred(_ctx, 4);
		case 11:
			return precpred(_ctx, 3);
		case 12:
			return precpred(_ctx, 2);
		case 13:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3&\u00e1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\7\2\'\n\2\f\2\16\2*\13\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\5\4"+
		"\64\n\4\3\4\3\4\5\48\n\4\3\4\3\4\3\5\3\5\3\5\7\5?\n\5\f\5\16\5B\13\5\3"+
		"\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7T\n"+
		"\7\3\b\3\b\3\b\7\bY\n\b\f\b\16\b\\\13\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3"+
		"\n\3\n\3\n\3\n\5\ni\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\5\13u\n\13\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\7\17\u0089\n\17\f\17\16\17\u008c\13\17\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00a4\n\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u00cd\n\20\f\20\16\20\u00d0"+
		"\13\20\3\21\3\21\3\21\5\21\u00d5\n\21\3\21\3\21\3\22\3\22\3\22\7\22\u00dc"+
		"\n\22\f\22\16\22\u00df\13\22\3\22\2\4\34\36\23\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"\2\2\2\u00f9\2(\3\2\2\2\4+\3\2\2\2\6/\3\2\2\2\b;\3\2"+
		"\2\2\nC\3\2\2\2\fS\3\2\2\2\16U\3\2\2\2\20_\3\2\2\2\22h\3\2\2\2\24t\3\2"+
		"\2\2\26v\3\2\2\2\30z\3\2\2\2\32|\3\2\2\2\34\u0080\3\2\2\2\36\u00a3\3\2"+
		"\2\2 \u00d1\3\2\2\2\"\u00d8\3\2\2\2$\'\5\4\3\2%\'\5\6\4\2&$\3\2\2\2&%"+
		"\3\2\2\2\'*\3\2\2\2(&\3\2\2\2()\3\2\2\2)\3\3\2\2\2*(\3\2\2\2+,\7\3\2\2"+
		",-\7!\2\2-.\5\f\7\2.\5\3\2\2\2/\60\7\4\2\2\60\61\7!\2\2\61\63\7\5\2\2"+
		"\62\64\5\b\5\2\63\62\3\2\2\2\63\64\3\2\2\2\64\65\3\2\2\2\65\67\7\6\2\2"+
		"\668\5\f\7\2\67\66\3\2\2\2\678\3\2\2\289\3\2\2\29:\5\16\b\2:\7\3\2\2\2"+
		";@\5\n\6\2<=\7\7\2\2=?\5\n\6\2><\3\2\2\2?B\3\2\2\2@>\3\2\2\2@A\3\2\2\2"+
		"A\t\3\2\2\2B@\3\2\2\2CD\7!\2\2DE\5\f\7\2E\13\3\2\2\2FT\7\b\2\2GT\7\t\2"+
		"\2HT\7\n\2\2IJ\7\13\2\2JK\7\"\2\2KL\7\f\2\2LT\5\f\7\2MN\7\r\2\2NT\5\f"+
		"\7\2OP\7\r\2\2PQ\7\13\2\2QR\7\f\2\2RT\5\f\7\2SF\3\2\2\2SG\3\2\2\2SH\3"+
		"\2\2\2SI\3\2\2\2SM\3\2\2\2SO\3\2\2\2T\r\3\2\2\2UZ\7\16\2\2VY\5\22\n\2"+
		"WY\5\20\t\2XV\3\2\2\2XW\3\2\2\2Y\\\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[]\3\2\2"+
		"\2\\Z\3\2\2\2]^\7\17\2\2^\17\3\2\2\2_`\7\3\2\2`a\7!\2\2ab\5\f\7\2b\21"+
		"\3\2\2\2ci\5\24\13\2di\5\26\f\2ei\5\30\r\2fi\5\32\16\2gi\5\16\b\2hc\3"+
		"\2\2\2hd\3\2\2\2he\3\2\2\2hf\3\2\2\2hg\3\2\2\2i\23\3\2\2\2jk\7\20\2\2"+
		"kl\5\36\20\2lm\5\16\b\2mu\3\2\2\2no\7\20\2\2op\5\36\20\2pq\5\16\b\2qr"+
		"\7\21\2\2rs\5\16\b\2su\3\2\2\2tj\3\2\2\2tn\3\2\2\2u\25\3\2\2\2vw\7\22"+
		"\2\2wx\5\36\20\2xy\5\16\b\2y\27\3\2\2\2z{\5 \21\2{\31\3\2\2\2|}\5\34\17"+
		"\2}~\7\23\2\2~\177\5\36\20\2\177\33\3\2\2\2\u0080\u0081\b\17\1\2\u0081"+
		"\u0082\7!\2\2\u0082\u008a\3\2\2\2\u0083\u0084\f\3\2\2\u0084\u0085\7\13"+
		"\2\2\u0085\u0086\5\36\20\2\u0086\u0087\7\f\2\2\u0087\u0089\3\2\2\2\u0088"+
		"\u0083\3\2\2\2\u0089\u008c\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2"+
		"\2\2\u008b\35\3\2\2\2\u008c\u008a\3\2\2\2\u008d\u008e\b\20\1\2\u008e\u00a4"+
		"\7\"\2\2\u008f\u00a4\7#\2\2\u0090\u00a4\7$\2\2\u0091\u00a4\5\34\17\2\u0092"+
		"\u00a4\5 \21\2\u0093\u0094\7\5\2\2\u0094\u0095\5\36\20\2\u0095\u0096\7"+
		"\6\2\2\u0096\u00a4\3\2\2\2\u0097\u0098\7\24\2\2\u0098\u00a4\5\36\20\23"+
		"\u0099\u009a\7\25\2\2\u009a\u00a4\5\36\20\22\u009b\u009c\7\5\2\2\u009c"+
		"\u009d\7\b\2\2\u009d\u009e\7\6\2\2\u009e\u00a4\5\36\20\21\u009f\u00a0"+
		"\7\5\2\2\u00a0\u00a1\7\t\2\2\u00a1\u00a2\7\6\2\2\u00a2\u00a4\5\36\20\20"+
		"\u00a3\u008d\3\2\2\2\u00a3\u008f\3\2\2\2\u00a3\u0090\3\2\2\2\u00a3\u0091"+
		"\3\2\2\2\u00a3\u0092\3\2\2\2\u00a3\u0093\3\2\2\2\u00a3\u0097\3\2\2\2\u00a3"+
		"\u0099\3\2\2\2\u00a3\u009b\3\2\2\2\u00a3\u009f\3\2\2\2\u00a4\u00ce\3\2"+
		"\2\2\u00a5\u00a6\f\17\2\2\u00a6\u00a7\7\r\2\2\u00a7\u00cd\5\36\20\20\u00a8"+
		"\u00a9\f\16\2\2\u00a9\u00aa\7\26\2\2\u00aa\u00cd\5\36\20\17\u00ab\u00ac"+
		"\f\r\2\2\u00ac\u00ad\7\27\2\2\u00ad\u00cd\5\36\20\16\u00ae\u00af\f\f\2"+
		"\2\u00af\u00b0\7\24\2\2\u00b0\u00cd\5\36\20\r\u00b1\u00b2\f\13\2\2\u00b2"+
		"\u00b3\7\30\2\2\u00b3\u00cd\5\36\20\f\u00b4\u00b5\f\n\2\2\u00b5\u00b6"+
		"\7\31\2\2\u00b6\u00cd\5\36\20\13\u00b7\u00b8\f\t\2\2\u00b8\u00b9\7\32"+
		"\2\2\u00b9\u00cd\5\36\20\n\u00ba\u00bb\f\b\2\2\u00bb\u00bc\7\33\2\2\u00bc"+
		"\u00cd\5\36\20\t\u00bd\u00be\f\7\2\2\u00be\u00bf\7\34\2\2\u00bf\u00cd"+
		"\5\36\20\b\u00c0\u00c1\f\6\2\2\u00c1\u00c2\7\35\2\2\u00c2\u00cd\5\36\20"+
		"\7\u00c3\u00c4\f\5\2\2\u00c4\u00c5\7\36\2\2\u00c5\u00cd\5\36\20\6\u00c6"+
		"\u00c7\f\4\2\2\u00c7\u00c8\7\37\2\2\u00c8\u00cd\5\36\20\5\u00c9\u00ca"+
		"\f\3\2\2\u00ca\u00cb\7 \2\2\u00cb\u00cd\5\36\20\4\u00cc\u00a5\3\2\2\2"+
		"\u00cc\u00a8\3\2\2\2\u00cc\u00ab\3\2\2\2\u00cc\u00ae\3\2\2\2\u00cc\u00b1"+
		"\3\2\2\2\u00cc\u00b4\3\2\2\2\u00cc\u00b7\3\2\2\2\u00cc\u00ba\3\2\2\2\u00cc"+
		"\u00bd\3\2\2\2\u00cc\u00c0\3\2\2\2\u00cc\u00c3\3\2\2\2\u00cc\u00c6\3\2"+
		"\2\2\u00cc\u00c9\3\2\2\2\u00cd\u00d0\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce"+
		"\u00cf\3\2\2\2\u00cf\37\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d1\u00d2\7!\2\2"+
		"\u00d2\u00d4\7\5\2\2\u00d3\u00d5\5\"\22\2\u00d4\u00d3\3\2\2\2\u00d4\u00d5"+
		"\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d7\7\6\2\2\u00d7!\3\2\2\2\u00d8"+
		"\u00dd\5\36\20\2\u00d9\u00da\7\7\2\2\u00da\u00dc\5\36\20\2\u00db\u00d9"+
		"\3\2\2\2\u00dc\u00df\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de"+
		"#\3\2\2\2\u00df\u00dd\3\2\2\2\22&(\63\67@SXZht\u008a\u00a3\u00cc\u00ce"+
		"\u00d4\u00dd";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}