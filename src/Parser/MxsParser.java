package Parser;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MxsParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, STR=52, NUM=53, 
		WS=54, LINE_COMMENT=55, BLOCK_COMMENT=56, TRUE=57, FALSE=58, ID=59;
	public static final int
		RULE_compilationUnit = 0, RULE_varname = 1, RULE_defvars = 2, RULE_defvar = 3, 
		RULE_type = 4, RULE_typename = 5, RULE_arraytype = 6, RULE_basetype = 7, 
		RULE_classname = 8, RULE_defclass = 9, RULE_funcname = 10, RULE_defunc = 11, 
		RULE_params = 12, RULE_param = 13, RULE_block = 14, RULE_stmt = 15, RULE_exprs = 16, 
		RULE_expr = 17, RULE_news = 18, RULE_functionCall = 19;
	public static final String[] ruleNames = {
		"compilationUnit", "varname", "defvars", "defvar", "type", "typename", 
		"arraytype", "basetype", "classname", "defclass", "funcname", "defunc", 
		"params", "param", "block", "stmt", "exprs", "expr", "news", "functionCall"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'='", "';'", "'['", "']'", "'int'", "'bool'", "'void'", "'string'", 
		"'class'", "'{'", "'}'", "'('", "')'", "','", "'if'", "'else'", "'for'", 
		"'while'", "'return'", "'break'", "'continue'", "'new'", "'.'", "'++'", 
		"'--'", "'-'", "'!'", "'~'", "'+'", "'*'", "'/'", "'%'", "'<<'", "'>>'", 
		"'&'", "'^'", "'|'", "'>'", "'<'", "'>='", "'<='", "'=='", "'!='", "'&&'", 
		"'||'", "'null'", "'TRUE'", "'true'", "'FALSE'", "'false'", "'this'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, "STR", "NUM", "WS", "LINE_COMMENT", "BLOCK_COMMENT", 
		"TRUE", "FALSE", "ID"
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
	public String getGrammarFileName() { return "Mxs.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MxsParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class CompilationUnitContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(MxsParser.EOF, 0); }
		public List<DefuncContext> defunc() {
			return getRuleContexts(DefuncContext.class);
		}
		public DefuncContext defunc(int i) {
			return getRuleContext(DefuncContext.class,i);
		}
		public List<DefvarsContext> defvars() {
			return getRuleContexts(DefvarsContext.class);
		}
		public DefvarsContext defvars(int i) {
			return getRuleContext(DefvarsContext.class,i);
		}
		public List<DefclassContext> defclass() {
			return getRuleContexts(DefclassContext.class);
		}
		public DefclassContext defclass(int i) {
			return getRuleContext(DefclassContext.class,i);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxsListener ) ((MxsListener)listener).enterCompilationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxsListener ) ((MxsListener)listener).exitCompilationUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxsVisitor ) return ((MxsVisitor<? extends T>)visitor).visitCompilationUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << ID))) != 0)) {
				{
				setState(43);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(40);
					defunc();
					}
					break;
				case 2:
					{
					setState(41);
					defvars();
					}
					break;
				case 3:
					{
					setState(42);
					defclass();
					}
					break;
				}
				}
				setState(47);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(48);
			match(EOF);
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

	public static class VarnameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MxsParser.ID, 0); }
		public VarnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxsListener ) ((MxsListener)listener).enterVarname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxsListener ) ((MxsListener)listener).exitVarname(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxsVisitor ) return ((MxsVisitor<? extends T>)visitor).visitVarname(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarnameContext varname() throws RecognitionException {
		VarnameContext _localctx = new VarnameContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_varname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(ID);
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

	public static class DefvarsContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VarnameContext varname() {
			return getRuleContext(VarnameContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DefvarsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defvars; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxsListener ) ((MxsListener)listener).enterDefvars(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxsListener ) ((MxsListener)listener).exitDefvars(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxsVisitor ) return ((MxsVisitor<? extends T>)visitor).visitDefvars(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefvarsContext defvars() throws RecognitionException {
		DefvarsContext _localctx = new DefvarsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_defvars);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			type();
			setState(53);
			varname();
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(54);
				match(T__0);
				setState(55);
				expr(0);
				}
			}

			setState(58);
			match(T__1);
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

	public static class DefvarContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VarnameContext varname() {
			return getRuleContext(VarnameContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DefvarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defvar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxsListener ) ((MxsListener)listener).enterDefvar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxsListener ) ((MxsListener)listener).exitDefvar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxsVisitor ) return ((MxsVisitor<? extends T>)visitor).visitDefvar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefvarContext defvar() throws RecognitionException {
		DefvarContext _localctx = new DefvarContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_defvar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			type();
			setState(61);
			varname();
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(62);
				match(T__0);
				setState(63);
				expr(0);
				}
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

	public static class TypeContext extends ParserRuleContext {
		public BasetypeContext basetype() {
			return getRuleContext(BasetypeContext.class,0);
		}
		public TypenameContext typename() {
			return getRuleContext(TypenameContext.class,0);
		}
		public ArraytypeContext arraytype() {
			return getRuleContext(ArraytypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxsListener ) ((MxsListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxsListener ) ((MxsListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxsVisitor ) return ((MxsVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(66);
				basetype();
				}
				break;
			case 2:
				{
				setState(67);
				typename();
				}
				break;
			case 3:
				{
				setState(68);
				arraytype();
				}
				break;
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

	public static class TypenameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MxsParser.ID, 0); }
		public TypenameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typename; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxsListener ) ((MxsListener)listener).enterTypename(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxsListener ) ((MxsListener)listener).exitTypename(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxsVisitor ) return ((MxsVisitor<? extends T>)visitor).visitTypename(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypenameContext typename() throws RecognitionException {
		TypenameContext _localctx = new TypenameContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_typename);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(ID);
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

	public static class ArraytypeContext extends ParserRuleContext {
		public BasetypeContext basetype() {
			return getRuleContext(BasetypeContext.class,0);
		}
		public TypenameContext typename() {
			return getRuleContext(TypenameContext.class,0);
		}
		public ArraytypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arraytype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxsListener ) ((MxsListener)listener).enterArraytype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxsListener ) ((MxsListener)listener).exitArraytype(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxsVisitor ) return ((MxsVisitor<? extends T>)visitor).visitArraytype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArraytypeContext arraytype() throws RecognitionException {
		ArraytypeContext _localctx = new ArraytypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_arraytype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
			case T__5:
			case T__6:
			case T__7:
				{
				setState(73);
				basetype();
				}
				break;
			case ID:
				{
				setState(74);
				typename();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(77);
				match(T__2);
				setState(78);
				match(T__3);
				}
				}
				setState(83);
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

	public static class BasetypeContext extends ParserRuleContext {
		public BasetypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basetype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxsListener ) ((MxsListener)listener).enterBasetype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxsListener ) ((MxsListener)listener).exitBasetype(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxsVisitor ) return ((MxsVisitor<? extends T>)visitor).visitBasetype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BasetypeContext basetype() throws RecognitionException {
		BasetypeContext _localctx = new BasetypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_basetype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class ClassnameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MxsParser.ID, 0); }
		public ClassnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxsListener ) ((MxsListener)listener).enterClassname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxsListener ) ((MxsListener)listener).exitClassname(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxsVisitor ) return ((MxsVisitor<? extends T>)visitor).visitClassname(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassnameContext classname() throws RecognitionException {
		ClassnameContext _localctx = new ClassnameContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_classname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(ID);
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

	public static class DefclassContext extends ParserRuleContext {
		public ClassnameContext classname() {
			return getRuleContext(ClassnameContext.class,0);
		}
		public List<DefuncContext> defunc() {
			return getRuleContexts(DefuncContext.class);
		}
		public DefuncContext defunc(int i) {
			return getRuleContext(DefuncContext.class,i);
		}
		public List<DefvarsContext> defvars() {
			return getRuleContexts(DefvarsContext.class);
		}
		public DefvarsContext defvars(int i) {
			return getRuleContext(DefvarsContext.class,i);
		}
		public DefclassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defclass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxsListener ) ((MxsListener)listener).enterDefclass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxsListener ) ((MxsListener)listener).exitDefclass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxsVisitor ) return ((MxsVisitor<? extends T>)visitor).visitDefclass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefclassContext defclass() throws RecognitionException {
		DefclassContext _localctx = new DefclassContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_defclass);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(T__8);
			setState(89);
			classname();
			setState(90);
			match(T__9);
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << ID))) != 0)) {
				{
				setState(93);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(91);
					defunc();
					}
					break;
				case 2:
					{
					setState(92);
					defvars();
					}
					break;
				}
				}
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(98);
			match(T__10);
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

	public static class FuncnameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MxsParser.ID, 0); }
		public FuncnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxsListener ) ((MxsListener)listener).enterFuncname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxsListener ) ((MxsListener)listener).exitFuncname(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxsVisitor ) return ((MxsVisitor<? extends T>)visitor).visitFuncname(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncnameContext funcname() throws RecognitionException {
		FuncnameContext _localctx = new FuncnameContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_funcname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(ID);
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

	public static class DefuncContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public FuncnameContext funcname() {
			return getRuleContext(FuncnameContext.class,0);
		}
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public DefuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defunc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxsListener ) ((MxsListener)listener).enterDefunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxsListener ) ((MxsListener)listener).exitDefunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxsVisitor ) return ((MxsVisitor<? extends T>)visitor).visitDefunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefuncContext defunc() throws RecognitionException {
		DefuncContext _localctx = new DefuncContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_defunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			type();
			setState(103);
			funcname();
			setState(104);
			match(T__11);
			setState(105);
			params();
			setState(106);
			match(T__12);
			setState(107);
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

	public static class ParamsContext extends ParserRuleContext {
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxsListener ) ((MxsListener)listener).enterParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxsListener ) ((MxsListener)listener).exitParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxsVisitor ) return ((MxsVisitor<? extends T>)visitor).visitParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << ID))) != 0)) {
				{
				setState(109);
				param();
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__13) {
					{
					{
					setState(110);
					match(T__13);
					setState(111);
					param();
					}
					}
					setState(116);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
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

	public static class ParamContext extends ParserRuleContext {
		public DefvarContext defvar() {
			return getRuleContext(DefvarContext.class,0);
		}
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxsListener ) ((MxsListener)listener).enterParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxsListener ) ((MxsListener)listener).exitParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxsVisitor ) return ((MxsVisitor<? extends T>)visitor).visitParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			defvar();
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
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxsListener ) ((MxsListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxsListener ) ((MxsListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxsVisitor ) return ((MxsVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(T__9);
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__9) | (1L << T__11) | (1L << T__14) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << STR) | (1L << NUM) | (1L << ID))) != 0)) {
				{
				{
				setState(122);
				stmt();
				}
				}
				setState(127);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(128);
			match(T__10);
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
	public static class ForStmtContext extends StmtContext {
		public Token op;
		public ExprContext start;
		public ExprContext condition;
		public ExprContext update;
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ForStmtContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxsListener ) ((MxsListener)listener).enterForStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxsListener ) ((MxsListener)listener).exitForStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxsVisitor ) return ((MxsVisitor<? extends T>)visitor).visitForStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprStmtContext extends StmtContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprStmtContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxsListener ) ((MxsListener)listener).enterExprStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxsListener ) ((MxsListener)listener).exitExprStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxsVisitor ) return ((MxsVisitor<? extends T>)visitor).visitExprStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WhileStmtContext extends StmtContext {
		public Token op;
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public WhileStmtContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxsListener ) ((MxsListener)listener).enterWhileStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxsListener ) ((MxsListener)listener).exitWhileStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxsVisitor ) return ((MxsVisitor<? extends T>)visitor).visitWhileStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfStmtContext extends StmtContext {
		public Token op;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public IfStmtContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxsListener ) ((MxsListener)listener).enterIfStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxsListener ) ((MxsListener)listener).exitIfStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxsVisitor ) return ((MxsVisitor<? extends T>)visitor).visitIfStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BlockStmtContext extends StmtContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public BlockStmtContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxsListener ) ((MxsListener)listener).enterBlockStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxsListener ) ((MxsListener)listener).exitBlockStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxsVisitor ) return ((MxsVisitor<? extends T>)visitor).visitBlockStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BreakStmtContext extends StmtContext {
		public BreakStmtContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxsListener ) ((MxsListener)listener).enterBreakStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxsListener ) ((MxsListener)listener).exitBreakStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxsVisitor ) return ((MxsVisitor<? extends T>)visitor).visitBreakStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EmptyStmtContext extends StmtContext {
		public EmptyStmtContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxsListener ) ((MxsListener)listener).enterEmptyStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxsListener ) ((MxsListener)listener).exitEmptyStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxsVisitor ) return ((MxsVisitor<? extends T>)visitor).visitEmptyStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReturnStmtContext extends StmtContext {
		public Token op;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ReturnStmtContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxsListener ) ((MxsListener)listener).enterReturnStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxsListener ) ((MxsListener)listener).exitReturnStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxsVisitor ) return ((MxsVisitor<? extends T>)visitor).visitReturnStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ContinueStmtContext extends StmtContext {
		public ContinueStmtContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxsListener ) ((MxsListener)listener).enterContinueStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxsListener ) ((MxsListener)listener).exitContinueStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxsVisitor ) return ((MxsVisitor<? extends T>)visitor).visitContinueStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarDeclStmtContext extends StmtContext {
		public DefvarsContext defvars() {
			return getRuleContext(DefvarsContext.class,0);
		}
		public VarDeclStmtContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxsListener ) ((MxsListener)listener).enterVarDeclStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxsListener ) ((MxsListener)listener).exitVarDeclStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxsVisitor ) return ((MxsVisitor<? extends T>)visitor).visitVarDeclStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_stmt);
		int _la;
		try {
			setState(176);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				_localctx = new BlockStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				block();
				}
				break;
			case 2:
				_localctx = new IfStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(131);
				((IfStmtContext)_localctx).op = match(T__14);
				setState(132);
				match(T__11);
				setState(133);
				expr(0);
				setState(134);
				match(T__12);
				setState(135);
				stmt();
				setState(138);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(136);
					match(T__15);
					setState(137);
					stmt();
					}
					break;
				}
				}
				break;
			case 3:
				_localctx = new ForStmtContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(140);
				((ForStmtContext)_localctx).op = match(T__16);
				setState(141);
				match(T__11);
				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__21) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << STR) | (1L << NUM) | (1L << ID))) != 0)) {
					{
					setState(142);
					((ForStmtContext)_localctx).start = expr(0);
					}
				}

				setState(145);
				match(T__1);
				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__21) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << STR) | (1L << NUM) | (1L << ID))) != 0)) {
					{
					setState(146);
					((ForStmtContext)_localctx).condition = expr(0);
					}
				}

				setState(149);
				match(T__1);
				setState(151);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__21) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << STR) | (1L << NUM) | (1L << ID))) != 0)) {
					{
					setState(150);
					((ForStmtContext)_localctx).update = expr(0);
					}
				}

				setState(153);
				match(T__12);
				setState(154);
				stmt();
				}
				break;
			case 4:
				_localctx = new WhileStmtContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(155);
				((WhileStmtContext)_localctx).op = match(T__17);
				setState(156);
				match(T__11);
				setState(158);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__21) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << STR) | (1L << NUM) | (1L << ID))) != 0)) {
					{
					setState(157);
					expr(0);
					}
				}

				setState(160);
				match(T__12);
				setState(161);
				stmt();
				}
				break;
			case 5:
				_localctx = new ReturnStmtContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(162);
				((ReturnStmtContext)_localctx).op = match(T__18);
				setState(164);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__21) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << STR) | (1L << NUM) | (1L << ID))) != 0)) {
					{
					setState(163);
					expr(0);
					}
				}

				setState(166);
				match(T__1);
				}
				break;
			case 6:
				_localctx = new BreakStmtContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(167);
				match(T__19);
				setState(168);
				match(T__1);
				}
				break;
			case 7:
				_localctx = new ContinueStmtContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(169);
				match(T__20);
				setState(170);
				match(T__1);
				}
				break;
			case 8:
				_localctx = new VarDeclStmtContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(171);
				defvars();
				}
				break;
			case 9:
				_localctx = new EmptyStmtContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(172);
				match(T__1);
				}
				break;
			case 10:
				_localctx = new ExprStmtContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(173);
				expr(0);
				setState(174);
				match(T__1);
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

	public static class ExprsContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxsListener ) ((MxsListener)listener).enterExprs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxsListener ) ((MxsListener)listener).exitExprs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxsVisitor ) return ((MxsVisitor<? extends T>)visitor).visitExprs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprsContext exprs() throws RecognitionException {
		ExprsContext _localctx = new ExprsContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_exprs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			expr(0);
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(179);
				match(T__13);
				setState(180);
				expr(0);
				}
				}
				setState(185);
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
	public static class NewExprContext extends ExprContext {
		public NewsContext news() {
			return getRuleContext(NewsContext.class,0);
		}
		public NewExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxsListener ) ((MxsListener)listener).enterNewExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxsListener ) ((MxsListener)listener).exitNewExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxsVisitor ) return ((MxsVisitor<? extends T>)visitor).visitNewExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolConstExprContext extends ExprContext {
		public BoolConstExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxsListener ) ((MxsListener)listener).enterBoolConstExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxsListener ) ((MxsListener)listener).exitBoolConstExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxsVisitor ) return ((MxsVisitor<? extends T>)visitor).visitBoolConstExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ThisExprContext extends ExprContext {
		public ThisExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxsListener ) ((MxsListener)listener).enterThisExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxsListener ) ((MxsListener)listener).exitThisExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxsVisitor ) return ((MxsVisitor<? extends T>)visitor).visitThisExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NullExprContext extends ExprContext {
		public NullExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxsListener ) ((MxsListener)listener).enterNullExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxsListener ) ((MxsListener)listener).exitNullExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxsVisitor ) return ((MxsVisitor<? extends T>)visitor).visitNullExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ArrayExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxsListener ) ((MxsListener)listener).enterArrayExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxsListener ) ((MxsListener)listener).exitArrayExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxsVisitor ) return ((MxsVisitor<? extends T>)visitor).visitArrayExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MemberExprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ID() { return getToken(MxsParser.ID, 0); }
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public MemberExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxsListener ) ((MxsListener)listener).enterMemberExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxsListener ) ((MxsListener)listener).exitMemberExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxsVisitor ) return ((MxsVisitor<? extends T>)visitor).visitMemberExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SuffixExprContext extends ExprContext {
		public Token op;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public SuffixExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxsListener ) ((MxsListener)listener).enterSuffixExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxsListener ) ((MxsListener)listener).exitSuffixExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxsVisitor ) return ((MxsVisitor<? extends T>)visitor).visitSuffixExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BinaryExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public BinaryExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxsListener ) ((MxsListener)listener).enterBinaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxsListener ) ((MxsListener)listener).exitBinaryExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxsVisitor ) return ((MxsVisitor<? extends T>)visitor).visitBinaryExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public OrExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxsListener ) ((MxsListener)listener).enterOrExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxsListener ) ((MxsListener)listener).exitOrExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxsVisitor ) return ((MxsVisitor<? extends T>)visitor).visitOrExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntConstExprContext extends ExprContext {
		public TerminalNode NUM() { return getToken(MxsParser.NUM, 0); }
		public IntConstExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxsListener ) ((MxsListener)listener).enterIntConstExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxsListener ) ((MxsListener)listener).exitIntConstExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxsVisitor ) return ((MxsVisitor<? extends T>)visitor).visitIntConstExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubExprContext extends ExprContext {
		public Token op;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public SubExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxsListener ) ((MxsListener)listener).enterSubExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxsListener ) ((MxsListener)listener).exitSubExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxsVisitor ) return ((MxsVisitor<? extends T>)visitor).visitSubExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrefixExprContext extends ExprContext {
		public Token op;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PrefixExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxsListener ) ((MxsListener)listener).enterPrefixExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxsListener ) ((MxsListener)listener).exitPrefixExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxsVisitor ) return ((MxsVisitor<? extends T>)visitor).visitPrefixExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringConstExprContext extends ExprContext {
		public TerminalNode STR() { return getToken(MxsParser.STR, 0); }
		public StringConstExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxsListener ) ((MxsListener)listener).enterStringConstExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxsListener ) ((MxsListener)listener).exitStringConstExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxsVisitor ) return ((MxsVisitor<? extends T>)visitor).visitStringConstExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CallExprContext extends ExprContext {
		public FuncnameContext funcname() {
			return getRuleContext(FuncnameContext.class,0);
		}
		public ExprsContext exprs() {
			return getRuleContext(ExprsContext.class,0);
		}
		public CallExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxsListener ) ((MxsListener)listener).enterCallExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxsListener ) ((MxsListener)listener).exitCallExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxsVisitor ) return ((MxsVisitor<? extends T>)visitor).visitCallExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public AssignExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxsListener ) ((MxsListener)listener).enterAssignExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxsListener ) ((MxsListener)listener).exitAssignExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxsVisitor ) return ((MxsVisitor<? extends T>)visitor).visitAssignExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdExprContext extends ExprContext {
		public VarnameContext varname() {
			return getRuleContext(VarnameContext.class,0);
		}
		public IdExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxsListener ) ((MxsListener)listener).enterIdExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxsListener ) ((MxsListener)listener).exitIdExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxsVisitor ) return ((MxsVisitor<? extends T>)visitor).visitIdExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public AndExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxsListener ) ((MxsListener)listener).enterAndExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxsListener ) ((MxsListener)listener).exitAndExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxsVisitor ) return ((MxsVisitor<? extends T>)visitor).visitAndExpr(this);
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
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				_localctx = new CallExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(187);
				funcname();
				setState(188);
				match(T__11);
				setState(190);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__21) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << STR) | (1L << NUM) | (1L << ID))) != 0)) {
					{
					setState(189);
					exprs();
					}
				}

				setState(192);
				match(T__12);
				}
				break;
			case 2:
				{
				_localctx = new NewExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(194);
				match(T__21);
				setState(195);
				news();
				}
				break;
			case 3:
				{
				_localctx = new SubExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(196);
				((SubExprContext)_localctx).op = match(T__11);
				setState(197);
				expr(0);
				setState(198);
				match(T__12);
				}
				break;
			case 4:
				{
				_localctx = new PrefixExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(200);
				((PrefixExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__23 || _la==T__24) ) {
					((PrefixExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(201);
				expr(19);
				}
				break;
			case 5:
				{
				_localctx = new PrefixExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(202);
				((PrefixExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__25) | (1L << T__26) | (1L << T__27))) != 0)) ) {
					((PrefixExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(203);
				expr(17);
				}
				break;
			case 6:
				{
				_localctx = new IdExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(204);
				varname();
				}
				break;
			case 7:
				{
				_localctx = new IntConstExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(205);
				match(NUM);
				}
				break;
			case 8:
				{
				_localctx = new StringConstExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(206);
				match(STR);
				}
				break;
			case 9:
				{
				_localctx = new NullExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(207);
				match(T__45);
				}
				break;
			case 10:
				{
				_localctx = new BoolConstExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(208);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 11:
				{
				_localctx = new ThisExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(209);
				match(T__50);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(257);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(255);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
					case 1:
						{
						_localctx = new BinaryExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(212);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(213);
						((BinaryExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__25 || _la==T__28) ) {
							((BinaryExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(214);
						expr(17);
						}
						break;
					case 2:
						{
						_localctx = new BinaryExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(215);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(216);
						((BinaryExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__29) | (1L << T__30) | (1L << T__31))) != 0)) ) {
							((BinaryExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(217);
						expr(16);
						}
						break;
					case 3:
						{
						_localctx = new BinaryExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(218);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(219);
						((BinaryExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__32 || _la==T__33) ) {
							((BinaryExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(220);
						expr(15);
						}
						break;
					case 4:
						{
						_localctx = new BinaryExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(221);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(222);
						((BinaryExprContext)_localctx).op = match(T__34);
						setState(223);
						expr(14);
						}
						break;
					case 5:
						{
						_localctx = new BinaryExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(224);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(225);
						((BinaryExprContext)_localctx).op = match(T__35);
						setState(226);
						expr(13);
						}
						break;
					case 6:
						{
						_localctx = new BinaryExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(227);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(228);
						((BinaryExprContext)_localctx).op = match(T__36);
						setState(229);
						expr(12);
						}
						break;
					case 7:
						{
						_localctx = new BinaryExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(230);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(231);
						((BinaryExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42))) != 0)) ) {
							((BinaryExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(232);
						expr(11);
						}
						break;
					case 8:
						{
						_localctx = new AndExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(233);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(234);
						((AndExprContext)_localctx).op = match(T__43);
						setState(235);
						expr(10);
						}
						break;
					case 9:
						{
						_localctx = new OrExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(236);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(237);
						((OrExprContext)_localctx).op = match(T__44);
						setState(238);
						expr(9);
						}
						break;
					case 10:
						{
						_localctx = new AssignExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(239);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(240);
						((AssignExprContext)_localctx).op = match(T__0);
						setState(241);
						expr(2);
						}
						break;
					case 11:
						{
						_localctx = new ArrayExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(242);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(243);
						match(T__2);
						setState(244);
						expr(0);
						setState(245);
						match(T__3);
						}
						break;
					case 12:
						{
						_localctx = new MemberExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(247);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(248);
						match(T__22);
						setState(251);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
						case 1:
							{
							setState(249);
							match(ID);
							}
							break;
						case 2:
							{
							setState(250);
							functionCall();
							}
							break;
						}
						}
						break;
					case 13:
						{
						_localctx = new SuffixExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(253);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(254);
						((SuffixExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__23 || _la==T__24) ) {
							((SuffixExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					}
					} 
				}
				setState(259);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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

	public static class NewsContext extends ParserRuleContext {
		public NewsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_news; }
	 
		public NewsContext() { }
		public void copyFrom(NewsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ArrayNewContext extends NewsContext {
		public ClassnameContext classname() {
			return getRuleContext(ClassnameContext.class,0);
		}
		public BasetypeContext basetype() {
			return getRuleContext(BasetypeContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ArrayNewContext(NewsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxsListener ) ((MxsListener)listener).enterArrayNew(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxsListener ) ((MxsListener)listener).exitArrayNew(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxsVisitor ) return ((MxsVisitor<? extends T>)visitor).visitArrayNew(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WrongNewContext extends NewsContext {
		public ClassnameContext classname() {
			return getRuleContext(ClassnameContext.class,0);
		}
		public BasetypeContext basetype() {
			return getRuleContext(BasetypeContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public WrongNewContext(NewsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxsListener ) ((MxsListener)listener).enterWrongNew(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxsListener ) ((MxsListener)listener).exitWrongNew(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxsVisitor ) return ((MxsVisitor<? extends T>)visitor).visitWrongNew(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NonArrayNewContext extends NewsContext {
		public ClassnameContext classname() {
			return getRuleContext(ClassnameContext.class,0);
		}
		public BasetypeContext basetype() {
			return getRuleContext(BasetypeContext.class,0);
		}
		public ExprsContext exprs() {
			return getRuleContext(ExprsContext.class,0);
		}
		public NonArrayNewContext(NewsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxsListener ) ((MxsListener)listener).enterNonArrayNew(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxsListener ) ((MxsListener)listener).exitNonArrayNew(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxsVisitor ) return ((MxsVisitor<? extends T>)visitor).visitNonArrayNew(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewsContext news() throws RecognitionException {
		NewsContext _localctx = new NewsContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_news);
		try {
			int _alt;
			setState(316);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				_localctx = new WrongNewContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(262);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(260);
					classname();
					}
					break;
				case T__4:
				case T__5:
				case T__6:
				case T__7:
					{
					setState(261);
					basetype();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(270);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(264);
						match(T__2);
						setState(265);
						expr(0);
						setState(266);
						match(T__3);
						}
						} 
					}
					setState(272);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
				}
				setState(275); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(273);
						match(T__2);
						setState(274);
						match(T__3);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(277); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(283); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(279);
						match(T__2);
						setState(280);
						expr(0);
						setState(281);
						match(T__3);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(285); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				_localctx = new ArrayNewContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(289);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(287);
					classname();
					}
					break;
				case T__4:
				case T__5:
				case T__6:
				case T__7:
					{
					setState(288);
					basetype();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(295); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(291);
						match(T__2);
						setState(292);
						expr(0);
						setState(293);
						match(T__3);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(297); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(303);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(299);
						match(T__2);
						setState(300);
						match(T__3);
						}
						} 
					}
					setState(305);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
				}
				}
				break;
			case 3:
				_localctx = new NonArrayNewContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(308);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(306);
					classname();
					}
					break;
				case T__4:
				case T__5:
				case T__6:
				case T__7:
					{
					setState(307);
					basetype();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(314);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
				case 1:
					{
					setState(310);
					match(T__11);
					setState(311);
					exprs();
					setState(312);
					match(T__12);
					}
					break;
				}
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

	public static class FunctionCallContext extends ParserRuleContext {
		public FuncnameContext funcname() {
			return getRuleContext(FuncnameContext.class,0);
		}
		public ExprsContext exprs() {
			return getRuleContext(ExprsContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxsListener ) ((MxsListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxsListener ) ((MxsListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxsVisitor ) return ((MxsVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			funcname();
			setState(319);
			match(T__11);
			setState(321);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__21) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << STR) | (1L << NUM) | (1L << ID))) != 0)) {
				{
				setState(320);
				exprs();
				}
			}

			setState(323);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 17:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 16);
		case 1:
			return precpred(_ctx, 15);
		case 2:
			return precpred(_ctx, 14);
		case 3:
			return precpred(_ctx, 13);
		case 4:
			return precpred(_ctx, 12);
		case 5:
			return precpred(_ctx, 11);
		case 6:
			return precpred(_ctx, 10);
		case 7:
			return precpred(_ctx, 9);
		case 8:
			return precpred(_ctx, 8);
		case 9:
			return precpred(_ctx, 2);
		case 10:
			return precpred(_ctx, 22);
		case 11:
			return precpred(_ctx, 20);
		case 12:
			return precpred(_ctx, 18);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3=\u0148\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\7\2.\n\2\f\2\16\2\61\13\2\3"+
		"\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\5\4;\n\4\3\4\3\4\3\5\3\5\3\5\3\5\5\5C\n"+
		"\5\3\6\3\6\3\6\5\6H\n\6\3\7\3\7\3\b\3\b\5\bN\n\b\3\b\3\b\7\bR\n\b\f\b"+
		"\16\bU\13\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\7\13`\n\13\f\13\16"+
		"\13c\13\13\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\7\16s\n\16\f\16\16\16v\13\16\5\16x\n\16\3\17\3\17\3\20\3\20\7\20~\n\20"+
		"\f\20\16\20\u0081\13\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\5\21\u008d\n\21\3\21\3\21\3\21\5\21\u0092\n\21\3\21\3\21\5\21\u0096"+
		"\n\21\3\21\3\21\5\21\u009a\n\21\3\21\3\21\3\21\3\21\3\21\5\21\u00a1\n"+
		"\21\3\21\3\21\3\21\3\21\5\21\u00a7\n\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\5\21\u00b3\n\21\3\22\3\22\3\22\7\22\u00b8\n\22\f"+
		"\22\16\22\u00bb\13\22\3\23\3\23\3\23\3\23\5\23\u00c1\n\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\5\23\u00d5\n\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\5\23\u00fe\n\23\3\23\3\23\7\23\u0102\n\23\f\23\16\23\u0105"+
		"\13\23\3\24\3\24\5\24\u0109\n\24\3\24\3\24\3\24\3\24\7\24\u010f\n\24\f"+
		"\24\16\24\u0112\13\24\3\24\3\24\6\24\u0116\n\24\r\24\16\24\u0117\3\24"+
		"\3\24\3\24\3\24\6\24\u011e\n\24\r\24\16\24\u011f\3\24\3\24\5\24\u0124"+
		"\n\24\3\24\3\24\3\24\3\24\6\24\u012a\n\24\r\24\16\24\u012b\3\24\3\24\7"+
		"\24\u0130\n\24\f\24\16\24\u0133\13\24\3\24\3\24\5\24\u0137\n\24\3\24\3"+
		"\24\3\24\3\24\5\24\u013d\n\24\5\24\u013f\n\24\3\25\3\25\3\25\5\25\u0144"+
		"\n\25\3\25\3\25\3\25\2\3$\26\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \""+
		"$&(\2\n\3\2\7\n\3\2\32\33\3\2\34\36\3\2\61\64\4\2\34\34\37\37\3\2 \"\3"+
		"\2#$\3\2(-\2\u0176\2/\3\2\2\2\4\64\3\2\2\2\6\66\3\2\2\2\b>\3\2\2\2\nG"+
		"\3\2\2\2\fI\3\2\2\2\16M\3\2\2\2\20V\3\2\2\2\22X\3\2\2\2\24Z\3\2\2\2\26"+
		"f\3\2\2\2\30h\3\2\2\2\32w\3\2\2\2\34y\3\2\2\2\36{\3\2\2\2 \u00b2\3\2\2"+
		"\2\"\u00b4\3\2\2\2$\u00d4\3\2\2\2&\u013e\3\2\2\2(\u0140\3\2\2\2*.\5\30"+
		"\r\2+.\5\6\4\2,.\5\24\13\2-*\3\2\2\2-+\3\2\2\2-,\3\2\2\2.\61\3\2\2\2/"+
		"-\3\2\2\2/\60\3\2\2\2\60\62\3\2\2\2\61/\3\2\2\2\62\63\7\2\2\3\63\3\3\2"+
		"\2\2\64\65\7=\2\2\65\5\3\2\2\2\66\67\5\n\6\2\67:\5\4\3\289\7\3\2\29;\5"+
		"$\23\2:8\3\2\2\2:;\3\2\2\2;<\3\2\2\2<=\7\4\2\2=\7\3\2\2\2>?\5\n\6\2?B"+
		"\5\4\3\2@A\7\3\2\2AC\5$\23\2B@\3\2\2\2BC\3\2\2\2C\t\3\2\2\2DH\5\20\t\2"+
		"EH\5\f\7\2FH\5\16\b\2GD\3\2\2\2GE\3\2\2\2GF\3\2\2\2H\13\3\2\2\2IJ\7=\2"+
		"\2J\r\3\2\2\2KN\5\20\t\2LN\5\f\7\2MK\3\2\2\2ML\3\2\2\2NS\3\2\2\2OP\7\5"+
		"\2\2PR\7\6\2\2QO\3\2\2\2RU\3\2\2\2SQ\3\2\2\2ST\3\2\2\2T\17\3\2\2\2US\3"+
		"\2\2\2VW\t\2\2\2W\21\3\2\2\2XY\7=\2\2Y\23\3\2\2\2Z[\7\13\2\2[\\\5\22\n"+
		"\2\\a\7\f\2\2]`\5\30\r\2^`\5\6\4\2_]\3\2\2\2_^\3\2\2\2`c\3\2\2\2a_\3\2"+
		"\2\2ab\3\2\2\2bd\3\2\2\2ca\3\2\2\2de\7\r\2\2e\25\3\2\2\2fg\7=\2\2g\27"+
		"\3\2\2\2hi\5\n\6\2ij\5\26\f\2jk\7\16\2\2kl\5\32\16\2lm\7\17\2\2mn\5\36"+
		"\20\2n\31\3\2\2\2ot\5\34\17\2pq\7\20\2\2qs\5\34\17\2rp\3\2\2\2sv\3\2\2"+
		"\2tr\3\2\2\2tu\3\2\2\2ux\3\2\2\2vt\3\2\2\2wo\3\2\2\2wx\3\2\2\2x\33\3\2"+
		"\2\2yz\5\b\5\2z\35\3\2\2\2{\177\7\f\2\2|~\5 \21\2}|\3\2\2\2~\u0081\3\2"+
		"\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080\u0082\3\2\2\2\u0081\177\3\2"+
		"\2\2\u0082\u0083\7\r\2\2\u0083\37\3\2\2\2\u0084\u00b3\5\36\20\2\u0085"+
		"\u0086\7\21\2\2\u0086\u0087\7\16\2\2\u0087\u0088\5$\23\2\u0088\u0089\7"+
		"\17\2\2\u0089\u008c\5 \21\2\u008a\u008b\7\22\2\2\u008b\u008d\5 \21\2\u008c"+
		"\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u00b3\3\2\2\2\u008e\u008f\7\23"+
		"\2\2\u008f\u0091\7\16\2\2\u0090\u0092\5$\23\2\u0091\u0090\3\2\2\2\u0091"+
		"\u0092\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0095\7\4\2\2\u0094\u0096\5$"+
		"\23\2\u0095\u0094\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0097\3\2\2\2\u0097"+
		"\u0099\7\4\2\2\u0098\u009a\5$\23\2\u0099\u0098\3\2\2\2\u0099\u009a\3\2"+
		"\2\2\u009a\u009b\3\2\2\2\u009b\u009c\7\17\2\2\u009c\u00b3\5 \21\2\u009d"+
		"\u009e\7\24\2\2\u009e\u00a0\7\16\2\2\u009f\u00a1\5$\23\2\u00a0\u009f\3"+
		"\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a3\7\17\2\2\u00a3"+
		"\u00b3\5 \21\2\u00a4\u00a6\7\25\2\2\u00a5\u00a7\5$\23\2\u00a6\u00a5\3"+
		"\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00b3\7\4\2\2\u00a9"+
		"\u00aa\7\26\2\2\u00aa\u00b3\7\4\2\2\u00ab\u00ac\7\27\2\2\u00ac\u00b3\7"+
		"\4\2\2\u00ad\u00b3\5\6\4\2\u00ae\u00b3\7\4\2\2\u00af\u00b0\5$\23\2\u00b0"+
		"\u00b1\7\4\2\2\u00b1\u00b3\3\2\2\2\u00b2\u0084\3\2\2\2\u00b2\u0085\3\2"+
		"\2\2\u00b2\u008e\3\2\2\2\u00b2\u009d\3\2\2\2\u00b2\u00a4\3\2\2\2\u00b2"+
		"\u00a9\3\2\2\2\u00b2\u00ab\3\2\2\2\u00b2\u00ad\3\2\2\2\u00b2\u00ae\3\2"+
		"\2\2\u00b2\u00af\3\2\2\2\u00b3!\3\2\2\2\u00b4\u00b9\5$\23\2\u00b5\u00b6"+
		"\7\20\2\2\u00b6\u00b8\5$\23\2\u00b7\u00b5\3\2\2\2\u00b8\u00bb\3\2\2\2"+
		"\u00b9\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba#\3\2\2\2\u00bb\u00b9\3"+
		"\2\2\2\u00bc\u00bd\b\23\1\2\u00bd\u00be\5\26\f\2\u00be\u00c0\7\16\2\2"+
		"\u00bf\u00c1\5\"\22\2\u00c0\u00bf\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c2"+
		"\3\2\2\2\u00c2\u00c3\7\17\2\2\u00c3\u00d5\3\2\2\2\u00c4\u00c5\7\30\2\2"+
		"\u00c5\u00d5\5&\24\2\u00c6\u00c7\7\16\2\2\u00c7\u00c8\5$\23\2\u00c8\u00c9"+
		"\7\17\2\2\u00c9\u00d5\3\2\2\2\u00ca\u00cb\t\3\2\2\u00cb\u00d5\5$\23\25"+
		"\u00cc\u00cd\t\4\2\2\u00cd\u00d5\5$\23\23\u00ce\u00d5\5\4\3\2\u00cf\u00d5"+
		"\7\67\2\2\u00d0\u00d5\7\66\2\2\u00d1\u00d5\7\60\2\2\u00d2\u00d5\t\5\2"+
		"\2\u00d3\u00d5\7\65\2\2\u00d4\u00bc\3\2\2\2\u00d4\u00c4\3\2\2\2\u00d4"+
		"\u00c6\3\2\2\2\u00d4\u00ca\3\2\2\2\u00d4\u00cc\3\2\2\2\u00d4\u00ce\3\2"+
		"\2\2\u00d4\u00cf\3\2\2\2\u00d4\u00d0\3\2\2\2\u00d4\u00d1\3\2\2\2\u00d4"+
		"\u00d2\3\2\2\2\u00d4\u00d3\3\2\2\2\u00d5\u0103\3\2\2\2\u00d6\u00d7\f\22"+
		"\2\2\u00d7\u00d8\t\6\2\2\u00d8\u0102\5$\23\23\u00d9\u00da\f\21\2\2\u00da"+
		"\u00db\t\7\2\2\u00db\u0102\5$\23\22\u00dc\u00dd\f\20\2\2\u00dd\u00de\t"+
		"\b\2\2\u00de\u0102\5$\23\21\u00df\u00e0\f\17\2\2\u00e0\u00e1\7%\2\2\u00e1"+
		"\u0102\5$\23\20\u00e2\u00e3\f\16\2\2\u00e3\u00e4\7&\2\2\u00e4\u0102\5"+
		"$\23\17\u00e5\u00e6\f\r\2\2\u00e6\u00e7\7\'\2\2\u00e7\u0102\5$\23\16\u00e8"+
		"\u00e9\f\f\2\2\u00e9\u00ea\t\t\2\2\u00ea\u0102\5$\23\r\u00eb\u00ec\f\13"+
		"\2\2\u00ec\u00ed\7.\2\2\u00ed\u0102\5$\23\f\u00ee\u00ef\f\n\2\2\u00ef"+
		"\u00f0\7/\2\2\u00f0\u0102\5$\23\13\u00f1\u00f2\f\4\2\2\u00f2\u00f3\7\3"+
		"\2\2\u00f3\u0102\5$\23\4\u00f4\u00f5\f\30\2\2\u00f5\u00f6\7\5\2\2\u00f6"+
		"\u00f7\5$\23\2\u00f7\u00f8\7\6\2\2\u00f8\u0102\3\2\2\2\u00f9\u00fa\f\26"+
		"\2\2\u00fa\u00fd\7\31\2\2\u00fb\u00fe\7=\2\2\u00fc\u00fe\5(\25\2\u00fd"+
		"\u00fb\3\2\2\2\u00fd\u00fc\3\2\2\2\u00fe\u0102\3\2\2\2\u00ff\u0100\f\24"+
		"\2\2\u0100\u0102\t\3\2\2\u0101\u00d6\3\2\2\2\u0101\u00d9\3\2\2\2\u0101"+
		"\u00dc\3\2\2\2\u0101\u00df\3\2\2\2\u0101\u00e2\3\2\2\2\u0101\u00e5\3\2"+
		"\2\2\u0101\u00e8\3\2\2\2\u0101\u00eb\3\2\2\2\u0101\u00ee\3\2\2\2\u0101"+
		"\u00f1\3\2\2\2\u0101\u00f4\3\2\2\2\u0101\u00f9\3\2\2\2\u0101\u00ff\3\2"+
		"\2\2\u0102\u0105\3\2\2\2\u0103\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104"+
		"%\3\2\2\2\u0105\u0103\3\2\2\2\u0106\u0109\5\22\n\2\u0107\u0109\5\20\t"+
		"\2\u0108\u0106\3\2\2\2\u0108\u0107\3\2\2\2\u0109\u0110\3\2\2\2\u010a\u010b"+
		"\7\5\2\2\u010b\u010c\5$\23\2\u010c\u010d\7\6\2\2\u010d\u010f\3\2\2\2\u010e"+
		"\u010a\3\2\2\2\u010f\u0112\3\2\2\2\u0110\u010e\3\2\2\2\u0110\u0111\3\2"+
		"\2\2\u0111\u0115\3\2\2\2\u0112\u0110\3\2\2\2\u0113\u0114\7\5\2\2\u0114"+
		"\u0116\7\6\2\2\u0115\u0113\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0115\3\2"+
		"\2\2\u0117\u0118\3\2\2\2\u0118\u011d\3\2\2\2\u0119\u011a\7\5\2\2\u011a"+
		"\u011b\5$\23\2\u011b\u011c\7\6\2\2\u011c\u011e\3\2\2\2\u011d\u0119\3\2"+
		"\2\2\u011e\u011f\3\2\2\2\u011f\u011d\3\2\2\2\u011f\u0120\3\2\2\2\u0120"+
		"\u013f\3\2\2\2\u0121\u0124\5\22\n\2\u0122\u0124\5\20\t\2\u0123\u0121\3"+
		"\2\2\2\u0123\u0122\3\2\2\2\u0124\u0129\3\2\2\2\u0125\u0126\7\5\2\2\u0126"+
		"\u0127\5$\23\2\u0127\u0128\7\6\2\2\u0128\u012a\3\2\2\2\u0129\u0125\3\2"+
		"\2\2\u012a\u012b\3\2\2\2\u012b\u0129\3\2\2\2\u012b\u012c\3\2\2\2\u012c"+
		"\u0131\3\2\2\2\u012d\u012e\7\5\2\2\u012e\u0130\7\6\2\2\u012f\u012d\3\2"+
		"\2\2\u0130\u0133\3\2\2\2\u0131\u012f\3\2\2\2\u0131\u0132\3\2\2\2\u0132"+
		"\u013f\3\2\2\2\u0133\u0131\3\2\2\2\u0134\u0137\5\22\n\2\u0135\u0137\5"+
		"\20\t\2\u0136\u0134\3\2\2\2\u0136\u0135\3\2\2\2\u0137\u013c\3\2\2\2\u0138"+
		"\u0139\7\16\2\2\u0139\u013a\5\"\22\2\u013a\u013b\7\17\2\2\u013b\u013d"+
		"\3\2\2\2\u013c\u0138\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u013f\3\2\2\2\u013e"+
		"\u0108\3\2\2\2\u013e\u0123\3\2\2\2\u013e\u0136\3\2\2\2\u013f\'\3\2\2\2"+
		"\u0140\u0141\5\26\f\2\u0141\u0143\7\16\2\2\u0142\u0144\5\"\22\2\u0143"+
		"\u0142\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0145\3\2\2\2\u0145\u0146\7\17"+
		"\2\2\u0146)\3\2\2\2&-/:BGMS_atw\177\u008c\u0091\u0095\u0099\u00a0\u00a6"+
		"\u00b2\u00b9\u00c0\u00d4\u00fd\u0101\u0103\u0108\u0110\u0117\u011f\u0123"+
		"\u012b\u0131\u0136\u013c\u013e\u0143";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}