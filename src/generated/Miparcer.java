// Generated from C:/Users/kevin/Documents/tarea\Miparcer.g4 by ANTLR 4.7.2
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
		Identifier=11, Literal=12, Float=13, Operator=14, Pyc=15, Parnt=16, Dpig=17, 
		Lin=18, Dp=19, Com=20, Comi=21, Comf=22, Pc=23, TEXT=24, WS=25, Eet=26, 
		Begin=27;
	public static final int
		RULE_program = 0, RULE_command = 1, RULE_singleCommand = 2, RULE_declaration = 3, 
		RULE_singleDeclaration = 4, RULE_typedenoter = 5, RULE_expression = 6, 
		RULE_primaryExpression = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "command", "singleCommand", "declaration", "singleDeclaration", 
			"typedenoter", "expression", "primaryExpression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "';'", null, "':='", "'~'", "':'", "'//'", "'*/'", 
			"'/*'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IF", "Then", "Else", "While", "Do", "Let", "In", "End", "Const", 
			"Var", "Identifier", "Literal", "Float", "Operator", "Pyc", "Parnt", 
			"Dpig", "Lin", "Dp", "Com", "Comi", "Comf", "Pc", "TEXT", "WS", "Eet", 
			"Begin"
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
			setState(16);
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
			setState(18);
			singleCommand();
			setState(23);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Pyc) {
				{
				{
				setState(19);
				match(Pyc);
				setState(20);
				singleCommand();
				}
				}
				setState(25);
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
		public List<TerminalNode> Parnt() { return getTokens(Miparcer.Parnt); }
		public TerminalNode Parnt(int i) {
			return getToken(Miparcer.Parnt, i);
		}
		public TerminalNode IF() { return getToken(Miparcer.IF, 0); }
		public TerminalNode Then() { return getToken(Miparcer.Then, 0); }
		public List<SingleCommandContext> singleCommand() {
			return getRuleContexts(SingleCommandContext.class);
		}
		public SingleCommandContext singleCommand(int i) {
			return getRuleContext(SingleCommandContext.class,i);
		}
		public TerminalNode Else() { return getToken(Miparcer.Else, 0); }
		public TerminalNode While() { return getToken(Miparcer.While, 0); }
		public TerminalNode Do() { return getToken(Miparcer.Do, 0); }
		public TerminalNode Eet() { return getToken(Miparcer.Eet, 0); }
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public TerminalNode In() { return getToken(Miparcer.In, 0); }
		public TerminalNode Begin() { return getToken(Miparcer.Begin, 0); }
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
		}
		public TerminalNode End() { return getToken(Miparcer.End, 0); }
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
			setState(56);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(26);
				match(Identifier);
				setState(33);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Dpig:
					{
					setState(27);
					match(Dpig);
					setState(28);
					expression();
					}
					break;
				case Parnt:
					{
					setState(29);
					match(Parnt);
					setState(30);
					expression();
					setState(31);
					match(Parnt);
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
				setState(35);
				match(IF);
				setState(36);
				expression();
				setState(37);
				match(Then);
				setState(38);
				singleCommand();
				setState(39);
				match(Else);
				setState(40);
				singleCommand();
				}
				break;
			case While:
				enterOuterAlt(_localctx, 3);
				{
				setState(42);
				match(While);
				setState(43);
				expression();
				setState(44);
				match(Do);
				setState(45);
				singleCommand();
				}
				break;
			case Eet:
				enterOuterAlt(_localctx, 4);
				{
				setState(47);
				match(Eet);
				setState(48);
				declaration();
				setState(49);
				match(In);
				setState(50);
				singleCommand();
				}
				break;
			case Begin:
				enterOuterAlt(_localctx, 5);
				{
				setState(52);
				match(Begin);
				setState(53);
				command();
				setState(54);
				match(End);
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
			setState(58);
			singleDeclaration();
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Pyc) {
				{
				{
				setState(59);
				match(Pyc);
				setState(60);
				singleDeclaration();
				}
				}
				setState(65);
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
		public TerminalNode Identifier() { return getToken(Miparcer.Identifier, 0); }
		public TerminalNode Lin() { return getToken(Miparcer.Lin, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Var() { return getToken(Miparcer.Var, 0); }
		public TerminalNode Dp() { return getToken(Miparcer.Dp, 0); }
		public TypedenoterContext typedenoter() {
			return getRuleContext(TypedenoterContext.class,0);
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
		try {
			setState(74);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Const:
				enterOuterAlt(_localctx, 1);
				{
				setState(66);
				match(Const);
				setState(67);
				match(Identifier);
				setState(68);
				match(Lin);
				setState(69);
				expression();
				}
				break;
			case Var:
				enterOuterAlt(_localctx, 2);
				{
				setState(70);
				match(Var);
				setState(71);
				match(Identifier);
				setState(72);
				match(Dp);
				setState(73);
				typedenoter();
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
			setState(76);
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
			setState(78);
			primaryExpression();
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Operator) {
				{
				{
				setState(79);
				match(Operator);
				setState(80);
				primaryExpression();
				}
				}
				setState(85);
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
			setState(92);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Literal:
				enterOuterAlt(_localctx, 1);
				{
				setState(86);
				match(Literal);
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(87);
				match(Identifier);
				}
				break;
			case Parnt:
				enterOuterAlt(_localctx, 3);
				{
				setState(88);
				match(Parnt);
				setState(89);
				expression();
				setState(90);
				match(Parnt);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\35a\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\3\3\3\3\3"+
		"\7\3\30\n\3\f\3\16\3\33\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4$\n\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\5\4;\n\4\3\5\3\5\3\5\7\5@\n\5\f\5\16\5C\13\5\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\5\6M\n\6\3\7\3\7\3\b\3\b\3\b\7\bT\n\b\f\b\16\bW\13"+
		"\b\3\t\3\t\3\t\3\t\3\t\3\t\5\t_\n\t\3\t\2\2\n\2\4\6\b\n\f\16\20\2\2\2"+
		"c\2\22\3\2\2\2\4\24\3\2\2\2\6:\3\2\2\2\b<\3\2\2\2\nL\3\2\2\2\fN\3\2\2"+
		"\2\16P\3\2\2\2\20^\3\2\2\2\22\23\5\6\4\2\23\3\3\2\2\2\24\31\5\6\4\2\25"+
		"\26\7\21\2\2\26\30\5\6\4\2\27\25\3\2\2\2\30\33\3\2\2\2\31\27\3\2\2\2\31"+
		"\32\3\2\2\2\32\5\3\2\2\2\33\31\3\2\2\2\34#\7\r\2\2\35\36\7\23\2\2\36$"+
		"\5\16\b\2\37 \7\22\2\2 !\5\16\b\2!\"\7\22\2\2\"$\3\2\2\2#\35\3\2\2\2#"+
		"\37\3\2\2\2$;\3\2\2\2%&\7\3\2\2&\'\5\16\b\2\'(\7\4\2\2()\5\6\4\2)*\7\5"+
		"\2\2*+\5\6\4\2+;\3\2\2\2,-\7\6\2\2-.\5\16\b\2./\7\7\2\2/\60\5\6\4\2\60"+
		";\3\2\2\2\61\62\7\34\2\2\62\63\5\b\5\2\63\64\7\t\2\2\64\65\5\6\4\2\65"+
		";\3\2\2\2\66\67\7\35\2\2\678\5\4\3\289\7\n\2\29;\3\2\2\2:\34\3\2\2\2:"+
		"%\3\2\2\2:,\3\2\2\2:\61\3\2\2\2:\66\3\2\2\2;\7\3\2\2\2<A\5\n\6\2=>\7\21"+
		"\2\2>@\5\n\6\2?=\3\2\2\2@C\3\2\2\2A?\3\2\2\2AB\3\2\2\2B\t\3\2\2\2CA\3"+
		"\2\2\2DE\7\13\2\2EF\7\r\2\2FG\7\24\2\2GM\5\16\b\2HI\7\f\2\2IJ\7\r\2\2"+
		"JK\7\25\2\2KM\5\f\7\2LD\3\2\2\2LH\3\2\2\2M\13\3\2\2\2NO\7\r\2\2O\r\3\2"+
		"\2\2PU\5\20\t\2QR\7\20\2\2RT\5\20\t\2SQ\3\2\2\2TW\3\2\2\2US\3\2\2\2UV"+
		"\3\2\2\2V\17\3\2\2\2WU\3\2\2\2X_\7\16\2\2Y_\7\r\2\2Z[\7\22\2\2[\\\5\16"+
		"\b\2\\]\7\22\2\2]_\3\2\2\2^X\3\2\2\2^Y\3\2\2\2^Z\3\2\2\2_\21\3\2\2\2\t"+
		"\31#:ALU^";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}