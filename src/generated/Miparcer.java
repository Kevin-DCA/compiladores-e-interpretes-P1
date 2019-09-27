// Generated from C:/Users/kevin/Documents/repositorios/compiladores-e-interpretes-P1\Miparcer.g4 by ANTLR 4.7.2
package generated;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Miparcer extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IF=1, Then=2, Else=3, While=4, Do=5, Let=6, In=7, End=8, Const=9, Var=10, 
		Begin=11, Estruc=12, Function=13, Identifier=14, Literal=15, Float=16, 
		Operator=17, Char=18, String=19, Pyc=20, Parnt=21, Dpig=22, Lin=23, Dp=24, 
		Com=25, Comf=26, Comi=27, Pc=28, Llave=29, NEXT=30, TEXT=31, Lines=32, 
		Alin=33, WS=34, Next=35, Digit=36, Struct=37, Funtion=38, Indetifier=39;
	public static final int
		RULE_program = 0, RULE_command = 1, RULE_singleCommand = 2, RULE_declaration = 3, 
		RULE_singleDeclaration = 4, RULE_typedenoter = 5, RULE_expression = 6, 
		RULE_primaryExpression = 7, RULE_metodDeclaration = 8, RULE_metodCall = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "command", "singleCommand", "declaration", "singleDeclaration", 
			"typedenoter", "expression", "primaryExpression", "metodDeclaration", 
			"metodCall"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IF", "Then", "Else", "While", "Do", "Let", "In", "End", "Const", 
			"Var", "Begin", "Estruc", "Function", "Identifier", "Literal", "Float", 
			"Operator", "Char", "String", "Pyc", "Parnt", "Dpig", "Lin", "Dp", "Com", 
			"Comf", "Comi", "Pc", "Llave", "NEXT", "TEXT", "Lines", "Alin", "WS", 
			"Next", "Digit", "Struct", "Funtion", "Indetifier"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "Miparcer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Miparcer(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public SingleCommandContext singleCommand() {
			return getRuleContext(SingleCommandContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiparcerListener ) ((MiparcerListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiparcerListener ) ((MiparcerListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			singleCommand();
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

	public static class CommandContext extends ParserRuleContext {
		public List<SingleCommandContext> singleCommand() {
			return getRuleContexts(SingleCommandContext.class);
		}
		public SingleCommandContext singleCommand(int i) {
			return getRuleContext(SingleCommandContext.class,i);
		}
		public List<TerminalNode> Pyc() { return getTokens(Miparcer.Pyc); }
		public TerminalNode Pyc(int i) {
			return getToken(Miparcer.Pyc, i);
		}
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiparcerListener ) ((MiparcerListener)listener).enterCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiparcerListener ) ((MiparcerListener)listener).exitCommand(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_command);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			singleCommand();
			setState(27);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Pyc) {
				{
				{
				setState(23);
				match(Pyc);
				setState(24);
				singleCommand();
				}
				}
				setState(29);
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

	public static class SingleCommandContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Miparcer.Identifier, 0); }
		public TerminalNode Dpig() { return getToken(Miparcer.Dpig, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode IF() { return getToken(Miparcer.IF, 0); }
		public TerminalNode Then() { return getToken(Miparcer.Then, 0); }
		public List<SingleCommandContext> singleCommand() {
			return getRuleContexts(SingleCommandContext.class);
		}
		public SingleCommandContext singleCommand(int i) {
			return getRuleContext(SingleCommandContext.class,i);
		}
		public List<TerminalNode> Else() { return getTokens(Miparcer.Else); }
		public TerminalNode Else(int i) {
			return getToken(Miparcer.Else, i);
		}
		public TerminalNode While() { return getToken(Miparcer.While, 0); }
		public TerminalNode Do() { return getToken(Miparcer.Do, 0); }
		public List<TerminalNode> Llave() { return getTokens(Miparcer.Llave); }
		public TerminalNode Llave(int i) {
			return getToken(Miparcer.Llave, i);
		}
		public TerminalNode Let() { return getToken(Miparcer.Let, 0); }
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public TerminalNode In() { return getToken(Miparcer.In, 0); }
		public TerminalNode Begin() { return getToken(Miparcer.Begin, 0); }
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
		}
		public TerminalNode End() { return getToken(Miparcer.End, 0); }
		public TerminalNode Comi() { return getToken(Miparcer.Comi, 0); }
		public TerminalNode TEXT() { return getToken(Miparcer.TEXT, 0); }
		public TerminalNode Comf() { return getToken(Miparcer.Comf, 0); }
		public TerminalNode Lines() { return getToken(Miparcer.Lines, 0); }
		public TerminalNode Next() { return getToken(Miparcer.Next, 0); }
		public SingleCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleCommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiparcerListener ) ((MiparcerListener)listener).enterSingleCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiparcerListener ) ((MiparcerListener)listener).exitSingleCommand(this);
		}
	}

	public final SingleCommandContext singleCommand() throws RecognitionException {
		SingleCommandContext _localctx = new SingleCommandContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_singleCommand);
		try {
			int _alt;
			setState(70);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(30);
				match(Identifier);
				setState(34);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Dpig:
					{
					setState(31);
					match(Dpig);
					setState(32);
					expression();
					}
					break;
				case Identifier:
				case Literal:
				case Char:
				case String:
				case Parnt:
					{
					setState(33);
					expression();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(36);
				match(IF);
				setState(37);
				expression();
				setState(38);
				match(Then);
				setState(39);
				singleCommand();
				setState(44);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(40);
						match(Else);
						setState(41);
						singleCommand();
						}
						} 
					}
					setState(46);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				}
				}
				break;
			case While:
				enterOuterAlt(_localctx, 3);
				{
				setState(47);
				match(While);
				setState(48);
				expression();
				setState(49);
				match(Do);
				setState(50);
				match(Llave);
				setState(51);
				singleCommand();
				setState(52);
				match(Llave);
				}
				break;
			case Let:
				enterOuterAlt(_localctx, 4);
				{
				setState(54);
				match(Let);
				setState(55);
				declaration();
				setState(56);
				match(In);
				setState(57);
				match(Llave);
				setState(58);
				singleCommand();
				setState(59);
				match(Llave);
				}
				break;
			case Begin:
				enterOuterAlt(_localctx, 5);
				{
				setState(61);
				match(Begin);
				setState(62);
				command();
				setState(63);
				match(End);
				}
				break;
			case Comi:
				enterOuterAlt(_localctx, 6);
				{
				setState(65);
				match(Comi);
				setState(66);
				match(TEXT);
				setState(67);
				match(Comf);
				}
				break;
			case Lines:
				enterOuterAlt(_localctx, 7);
				{
				setState(68);
				match(Lines);
				setState(69);
				match(Next);
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

	public static class DeclarationContext extends ParserRuleContext {
		public List<SingleDeclarationContext> singleDeclaration() {
			return getRuleContexts(SingleDeclarationContext.class);
		}
		public SingleDeclarationContext singleDeclaration(int i) {
			return getRuleContext(SingleDeclarationContext.class,i);
		}
		public List<TerminalNode> Pyc() { return getTokens(Miparcer.Pyc); }
		public TerminalNode Pyc(int i) {
			return getToken(Miparcer.Pyc, i);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiparcerListener ) ((MiparcerListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiparcerListener ) ((MiparcerListener)listener).exitDeclaration(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			singleDeclaration();
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Pyc) {
				{
				{
				setState(73);
				match(Pyc);
				setState(74);
				singleDeclaration();
				}
				}
				setState(79);
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

	public static class SingleDeclarationContext extends ParserRuleContext {
		public TerminalNode Const() { return getToken(Miparcer.Const, 0); }
		public List<TerminalNode> Identifier() { return getTokens(Miparcer.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(Miparcer.Identifier, i);
		}
		public TerminalNode Lin() { return getToken(Miparcer.Lin, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> Var() { return getTokens(Miparcer.Var); }
		public TerminalNode Var(int i) {
			return getToken(Miparcer.Var, i);
		}
		public List<TerminalNode> Dp() { return getTokens(Miparcer.Dp); }
		public TerminalNode Dp(int i) {
			return getToken(Miparcer.Dp, i);
		}
		public List<TypedenoterContext> typedenoter() {
			return getRuleContexts(TypedenoterContext.class);
		}
		public TypedenoterContext typedenoter(int i) {
			return getRuleContext(TypedenoterContext.class,i);
		}
		public TerminalNode Pc() { return getToken(Miparcer.Pc, 0); }
		public TerminalNode Digit() { return getToken(Miparcer.Digit, 0); }
		public TerminalNode Struct() { return getToken(Miparcer.Struct, 0); }
		public List<TerminalNode> Llave() { return getTokens(Miparcer.Llave); }
		public TerminalNode Llave(int i) {
			return getToken(Miparcer.Llave, i);
		}
		public SingleDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiparcerListener ) ((MiparcerListener)listener).enterSingleDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiparcerListener ) ((MiparcerListener)listener).exitSingleDeclaration(this);
		}
	}

	public final SingleDeclarationContext singleDeclaration() throws RecognitionException {
		SingleDeclarationContext _localctx = new SingleDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_singleDeclaration);
		int _la;
		try {
			setState(107);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				match(Const);
				setState(81);
				match(Identifier);
				setState(82);
				match(Lin);
				setState(83);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(84);
				match(Var);
				setState(85);
				match(Identifier);
				setState(86);
				match(Dp);
				setState(87);
				typedenoter();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(88);
				match(Var);
				setState(89);
				match(Identifier);
				setState(90);
				match(Dp);
				setState(91);
				typedenoter();
				setState(92);
				match(Pc);
				setState(93);
				match(Digit);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(95);
				match(Struct);
				setState(96);
				match(Llave);
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Var) {
					{
					{
					setState(97);
					match(Var);
					setState(98);
					match(Identifier);
					setState(99);
					match(Dp);
					setState(100);
					typedenoter();
					}
					}
					setState(105);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(106);
				match(Llave);
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

	public static class TypedenoterContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Miparcer.Identifier, 0); }
		public TypedenoterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typedenoter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiparcerListener ) ((MiparcerListener)listener).enterTypedenoter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiparcerListener ) ((MiparcerListener)listener).exitTypedenoter(this);
		}
	}

	public final TypedenoterContext typedenoter() throws RecognitionException {
		TypedenoterContext _localctx = new TypedenoterContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_typedenoter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(Identifier);
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
		public List<PrimaryExpressionContext> primaryExpression() {
			return getRuleContexts(PrimaryExpressionContext.class);
		}
		public PrimaryExpressionContext primaryExpression(int i) {
			return getRuleContext(PrimaryExpressionContext.class,i);
		}
		public List<TerminalNode> Operator() { return getTokens(Miparcer.Operator); }
		public TerminalNode Operator(int i) {
			return getToken(Miparcer.Operator, i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiparcerListener ) ((MiparcerListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiparcerListener ) ((MiparcerListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			primaryExpression();
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Operator) {
				{
				{
				setState(112);
				match(Operator);
				setState(113);
				primaryExpression();
				}
				}
				setState(118);
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

	public static class PrimaryExpressionContext extends ParserRuleContext {
		public TerminalNode Literal() { return getToken(Miparcer.Literal, 0); }
		public TerminalNode Identifier() { return getToken(Miparcer.Identifier, 0); }
		public List<TerminalNode> Parnt() { return getTokens(Miparcer.Parnt); }
		public TerminalNode Parnt(int i) {
			return getToken(Miparcer.Parnt, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Char() { return getToken(Miparcer.Char, 0); }
		public TerminalNode String() { return getToken(Miparcer.String, 0); }
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiparcerListener ) ((MiparcerListener)listener).enterPrimaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiparcerListener ) ((MiparcerListener)listener).exitPrimaryExpression(this);
		}
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_primaryExpression);
		try {
			setState(127);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Literal:
				enterOuterAlt(_localctx, 1);
				{
				setState(119);
				match(Literal);
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(120);
				match(Identifier);
				}
				break;
			case Parnt:
				enterOuterAlt(_localctx, 3);
				{
				setState(121);
				match(Parnt);
				setState(122);
				expression();
				setState(123);
				match(Parnt);
				}
				break;
			case Char:
				enterOuterAlt(_localctx, 4);
				{
				setState(125);
				match(Char);
				}
				break;
			case String:
				enterOuterAlt(_localctx, 5);
				{
				setState(126);
				match(String);
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

	public static class MetodDeclarationContext extends ParserRuleContext {
		public TerminalNode Funtion() { return getToken(Miparcer.Funtion, 0); }
		public List<TerminalNode> Identifier() { return getTokens(Miparcer.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(Miparcer.Identifier, i);
		}
		public List<TerminalNode> Parnt() { return getTokens(Miparcer.Parnt); }
		public TerminalNode Parnt(int i) {
			return getToken(Miparcer.Parnt, i);
		}
		public List<TerminalNode> Llave() { return getTokens(Miparcer.Llave); }
		public TerminalNode Llave(int i) {
			return getToken(Miparcer.Llave, i);
		}
		public SingleCommandContext singleCommand() {
			return getRuleContext(SingleCommandContext.class,0);
		}
		public MetodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_metodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiparcerListener ) ((MiparcerListener)listener).enterMetodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiparcerListener ) ((MiparcerListener)listener).exitMetodDeclaration(this);
		}
	}

	public final MetodDeclarationContext metodDeclaration() throws RecognitionException {
		MetodDeclarationContext _localctx = new MetodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_metodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(Funtion);
			setState(130);
			match(Identifier);
			setState(131);
			match(Parnt);
			setState(133); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(132);
				match(Identifier);
				}
				}
				setState(135); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Identifier );
			setState(137);
			match(Parnt);
			setState(138);
			match(Llave);
			setState(139);
			singleCommand();
			setState(140);
			match(Llave);
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

	public static class MetodCallContext extends ParserRuleContext {
		public TerminalNode Indetifier() { return getToken(Miparcer.Indetifier, 0); }
		public List<TerminalNode> Parnt() { return getTokens(Miparcer.Parnt); }
		public TerminalNode Parnt(int i) {
			return getToken(Miparcer.Parnt, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public MetodCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_metodCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiparcerListener ) ((MiparcerListener)listener).enterMetodCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiparcerListener ) ((MiparcerListener)listener).exitMetodCall(this);
		}
	}

	public final MetodCallContext metodCall() throws RecognitionException {
		MetodCallContext _localctx = new MetodCallContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_metodCall);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(Indetifier);
			setState(143);
			match(Parnt);
			setState(147);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(144);
					expression();
					}
					} 
				}
				setState(149);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			setState(150);
			match(Parnt);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3)\u009b\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\3\2\3\2\3\3\3\3\3\3\7\3\34\n\3\f\3\16\3\37\13\3\3\4\3\4\3\4\3\4\5"+
		"\4%\n\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4-\n\4\f\4\16\4\60\13\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\5\4I\n\4\3\5\3\5\3\5\7\5N\n\5\f\5\16\5Q\13\5\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\7\6h\n\6\f\6\16\6k\13\6\3\6\5\6n\n\6\3\7\3\7\3\b\3\b\3\b\7\bu\n\b\f\b"+
		"\16\bx\13\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0082\n\t\3\n\3\n\3\n"+
		"\3\n\6\n\u0088\n\n\r\n\16\n\u0089\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\7"+
		"\13\u0094\n\13\f\13\16\13\u0097\13\13\3\13\3\13\3\13\2\2\f\2\4\6\b\n\f"+
		"\16\20\22\24\2\2\2\u00a5\2\26\3\2\2\2\4\30\3\2\2\2\6H\3\2\2\2\bJ\3\2\2"+
		"\2\nm\3\2\2\2\fo\3\2\2\2\16q\3\2\2\2\20\u0081\3\2\2\2\22\u0083\3\2\2\2"+
		"\24\u0090\3\2\2\2\26\27\5\6\4\2\27\3\3\2\2\2\30\35\5\6\4\2\31\32\7\26"+
		"\2\2\32\34\5\6\4\2\33\31\3\2\2\2\34\37\3\2\2\2\35\33\3\2\2\2\35\36\3\2"+
		"\2\2\36\5\3\2\2\2\37\35\3\2\2\2 $\7\20\2\2!\"\7\30\2\2\"%\5\16\b\2#%\5"+
		"\16\b\2$!\3\2\2\2$#\3\2\2\2%I\3\2\2\2&\'\7\3\2\2\'(\5\16\b\2()\7\4\2\2"+
		").\5\6\4\2*+\7\5\2\2+-\5\6\4\2,*\3\2\2\2-\60\3\2\2\2.,\3\2\2\2./\3\2\2"+
		"\2/I\3\2\2\2\60.\3\2\2\2\61\62\7\6\2\2\62\63\5\16\b\2\63\64\7\7\2\2\64"+
		"\65\7\37\2\2\65\66\5\6\4\2\66\67\7\37\2\2\67I\3\2\2\289\7\b\2\29:\5\b"+
		"\5\2:;\7\t\2\2;<\7\37\2\2<=\5\6\4\2=>\7\37\2\2>I\3\2\2\2?@\7\r\2\2@A\5"+
		"\4\3\2AB\7\n\2\2BI\3\2\2\2CD\7\35\2\2DE\7!\2\2EI\7\34\2\2FG\7\"\2\2GI"+
		"\7%\2\2H \3\2\2\2H&\3\2\2\2H\61\3\2\2\2H8\3\2\2\2H?\3\2\2\2HC\3\2\2\2"+
		"HF\3\2\2\2I\7\3\2\2\2JO\5\n\6\2KL\7\26\2\2LN\5\n\6\2MK\3\2\2\2NQ\3\2\2"+
		"\2OM\3\2\2\2OP\3\2\2\2P\t\3\2\2\2QO\3\2\2\2RS\7\13\2\2ST\7\20\2\2TU\7"+
		"\31\2\2Un\5\16\b\2VW\7\f\2\2WX\7\20\2\2XY\7\32\2\2Yn\5\f\7\2Z[\7\f\2\2"+
		"[\\\7\20\2\2\\]\7\32\2\2]^\5\f\7\2^_\7\36\2\2_`\7&\2\2`n\3\2\2\2ab\7\'"+
		"\2\2bi\7\37\2\2cd\7\f\2\2de\7\20\2\2ef\7\32\2\2fh\5\f\7\2gc\3\2\2\2hk"+
		"\3\2\2\2ig\3\2\2\2ij\3\2\2\2jl\3\2\2\2ki\3\2\2\2ln\7\37\2\2mR\3\2\2\2"+
		"mV\3\2\2\2mZ\3\2\2\2ma\3\2\2\2n\13\3\2\2\2op\7\20\2\2p\r\3\2\2\2qv\5\20"+
		"\t\2rs\7\23\2\2su\5\20\t\2tr\3\2\2\2ux\3\2\2\2vt\3\2\2\2vw\3\2\2\2w\17"+
		"\3\2\2\2xv\3\2\2\2y\u0082\7\21\2\2z\u0082\7\20\2\2{|\7\27\2\2|}\5\16\b"+
		"\2}~\7\27\2\2~\u0082\3\2\2\2\177\u0082\7\24\2\2\u0080\u0082\7\25\2\2\u0081"+
		"y\3\2\2\2\u0081z\3\2\2\2\u0081{\3\2\2\2\u0081\177\3\2\2\2\u0081\u0080"+
		"\3\2\2\2\u0082\21\3\2\2\2\u0083\u0084\7(\2\2\u0084\u0085\7\20\2\2\u0085"+
		"\u0087\7\27\2\2\u0086\u0088\7\20\2\2\u0087\u0086\3\2\2\2\u0088\u0089\3"+
		"\2\2\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008b\3\2\2\2\u008b"+
		"\u008c\7\27\2\2\u008c\u008d\7\37\2\2\u008d\u008e\5\6\4\2\u008e\u008f\7"+
		"\37\2\2\u008f\23\3\2\2\2\u0090\u0091\7)\2\2\u0091\u0095\7\27\2\2\u0092"+
		"\u0094\5\16\b\2\u0093\u0092\3\2\2\2\u0094\u0097\3\2\2\2\u0095\u0093\3"+
		"\2\2\2\u0095\u0096\3\2\2\2\u0096\u0098\3\2\2\2\u0097\u0095\3\2\2\2\u0098"+
		"\u0099\7\27\2\2\u0099\25\3\2\2\2\r\35$.HOimv\u0081\u0089\u0095";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}