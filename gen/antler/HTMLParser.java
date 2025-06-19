// Generated from C:/Users/نو ككككككككككككككككك/IdeaProjects/untitled3/src/antler/HTMLParser.g4 by ANTLR 4.13.2
package antler;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class HTMLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NG_FOR=1, NG_IF=2, INTERPOLATION=3, DOUBLE_CURLY_OPEN=4, DOUBLE_CURLY_CLOSE=5, 
		HTML_ELEMENT=6, CSS_PROPERTY=7, COMPONENT=8, SELECTOR=9, TEMPLATE_URL=10, 
		TEMPLATE=11, STYLE_URLS=12, STYLES=13, STANDALONE=14, INJECTABLE=15, ROOT=16, 
		PLATFORM=17, PROVIDED_IN=18, HTML_OPEN_TAG=19, HTML_CLOSE_TAG=20, STYLE_OPEN_TAG=21, 
		CONSOL=22, LOG=23, STYLE_CLOSE_TAG=24, FUNCTION=25, CLASS=26, NEW=27, 
		NUMBER=28, STRING=29, BOOLEAN=30, ARRAY=31, ENUM=32, ANY=33, VOID=34, 
		LET=35, TRUE=36, FALSE=37, AS=38, RETURN=39, INTERFACE=40, THIS=41, CONSTRUCTOR=42, 
		EXTENDS=43, SUPER=44, PUBLIC=45, PRIVATE=46, PROTECTED=47, CONST=48, EXPORT=49, 
		IMPORT=50, IMPORTS=51, FROM=52, SHOW=53, THROW=54, EMIT=55, DECORATOR=56, 
		DASH=57, UNDERSCORE=58, COLON=59, SEMICOLON=60, COMMA=61, LBRACKET=62, 
		RBRACKET=63, LBRACE=64, RBRACE=65, LPAREN=66, RPAREN=67, ASSIGN=68, QUOTE=69, 
		BACKTICK=70, SINGLE_QUOTE=71, OPEN_TAG=72, CLOUSE_TAG=73, ARROW=74, DOT=75, 
		PLUS=76, TAG_OPEN_SLASH=77, HASH=78, SDOLAR=79, SLASH=80, FOR_LOOP=81, 
		STRING_CONTENT=82, VALUE=83, NUMBER_WITH_UNIT=84, KEYWORD=85, IDENTIFIER=86, 
		COLOR_CODE=87, WHITESPACE=88, SINGLE_LINE_COMMENT=89, MULTI_LINE_COMMENT=90, 
		COMMENT=91;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_declaration = 2, RULE_componentDeclaration = 3, 
		RULE_componentBody = 4, RULE_serviceDeclaration = 5, RULE_htmlProgram = 6, 
		RULE_htmlElement = 7, RULE_htmlContent = 8, RULE_attribute = 9, RULE_cssProgram = 10, 
		RULE_cssRule = 11, RULE_cssProperty = 12, RULE_selector = 13, RULE_importModelDeclaration = 14, 
		RULE_exportModelDeclaration = 15, RULE_variableDeclaration = 16, RULE_decorator = 17, 
		RULE_typeAssertion = 18, RULE_enumDeclaration = 19, RULE_enumeratorList = 20, 
		RULE_enumValue = 21, RULE_classDeclaration = 22, RULE_objectClass = 23, 
		RULE_interfaceDeclaration = 24, RULE_objectInterface = 25, RULE_objectInterfaceBody = 26, 
		RULE_functionDeclaration = 27, RULE_parameterList = 28, RULE_callFunctios = 29, 
		RULE_consolDeclaration = 30, RULE_returnStatement = 31, RULE_throwStatement = 32, 
		RULE_expressionStatement = 33, RULE_expression = 34, RULE_block = 35, 
		RULE_thisStatement = 36, RULE_emitStatement = 37, RULE_objectLiteral = 38, 
		RULE_objectProperty = 39, RULE_arrayLiteral = 40, RULE_mapLiteral = 41, 
		RULE_tupleLiteral = 42, RULE_ngDirective = 43, RULE_type = 44, RULE_assignment = 45, 
		RULE_any_type = 46, RULE_product = 47, RULE_objectCreation = 48;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "declaration", "componentDeclaration", "componentBody", 
			"serviceDeclaration", "htmlProgram", "htmlElement", "htmlContent", "attribute", 
			"cssProgram", "cssRule", "cssProperty", "selector", "importModelDeclaration", 
			"exportModelDeclaration", "variableDeclaration", "decorator", "typeAssertion", 
			"enumDeclaration", "enumeratorList", "enumValue", "classDeclaration", 
			"objectClass", "interfaceDeclaration", "objectInterface", "objectInterfaceBody", 
			"functionDeclaration", "parameterList", "callFunctios", "consolDeclaration", 
			"returnStatement", "throwStatement", "expressionStatement", "expression", 
			"block", "thisStatement", "emitStatement", "objectLiteral", "objectProperty", 
			"arrayLiteral", "mapLiteral", "tupleLiteral", "ngDirective", "type", 
			"assignment", "any_type", "product", "objectCreation"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'*ngFor'", "'*ngIf'", null, "'{{'", "'}}'", null, null, "'Component'", 
			"'selector'", "'templateUrl'", "'template'", "'styleUrls'", "'styles'", 
			"'standalone'", "'Injectable'", "'root'", "'platform'", "'providedIn'", 
			"'<html>'", "'</html>'", "'<style>'", "'console'", "'log'", "'</style>'", 
			"'function'", "'class'", "'new'", "'number'", "'string'", "'boolean'", 
			"'Array'", "'enum'", "'any'", "'void'", null, "'true'", "'false'", "'as'", 
			"'return'", "'interface'", "'this'", "'constructor'", "'extends'", "'super'", 
			"'public'", "'private'", "'protected'", "'const'", "'export'", "'import'", 
			"'imports'", "'from'", "'show'", "'throw'", "'emit'", "'@'", "'-'", "'_'", 
			"':'", "';'", "','", "'['", "']'", "'{'", "'}'", "'('", "')'", "'='", 
			"'\"'", "'`'", "'''", "'<'", "'>'", "'=>'", "'.'", "'+'", "'</'", "'#'", 
			"'$'", "'/'", "'for'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NG_FOR", "NG_IF", "INTERPOLATION", "DOUBLE_CURLY_OPEN", "DOUBLE_CURLY_CLOSE", 
			"HTML_ELEMENT", "CSS_PROPERTY", "COMPONENT", "SELECTOR", "TEMPLATE_URL", 
			"TEMPLATE", "STYLE_URLS", "STYLES", "STANDALONE", "INJECTABLE", "ROOT", 
			"PLATFORM", "PROVIDED_IN", "HTML_OPEN_TAG", "HTML_CLOSE_TAG", "STYLE_OPEN_TAG", 
			"CONSOL", "LOG", "STYLE_CLOSE_TAG", "FUNCTION", "CLASS", "NEW", "NUMBER", 
			"STRING", "BOOLEAN", "ARRAY", "ENUM", "ANY", "VOID", "LET", "TRUE", "FALSE", 
			"AS", "RETURN", "INTERFACE", "THIS", "CONSTRUCTOR", "EXTENDS", "SUPER", 
			"PUBLIC", "PRIVATE", "PROTECTED", "CONST", "EXPORT", "IMPORT", "IMPORTS", 
			"FROM", "SHOW", "THROW", "EMIT", "DECORATOR", "DASH", "UNDERSCORE", "COLON", 
			"SEMICOLON", "COMMA", "LBRACKET", "RBRACKET", "LBRACE", "RBRACE", "LPAREN", 
			"RPAREN", "ASSIGN", "QUOTE", "BACKTICK", "SINGLE_QUOTE", "OPEN_TAG", 
			"CLOUSE_TAG", "ARROW", "DOT", "PLUS", "TAG_OPEN_SLASH", "HASH", "SDOLAR", 
			"SLASH", "FOR_LOOP", "STRING_CONTENT", "VALUE", "NUMBER_WITH_UNIT", "KEYWORD", 
			"IDENTIFIER", "COLOR_CODE", "WHITESPACE", "SINGLE_LINE_COMMENT", "MULTI_LINE_COMMENT", 
			"COMMENT"
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
	public String getGrammarFileName() { return "HTMLParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public HTMLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	 
		public ProgramContext() { }
		public void copyFrom(ProgramContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ProgramRootContext extends ProgramContext {
		public TerminalNode EOF() { return getToken(HTMLParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramRootContext(ProgramContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterProgramRoot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitProgramRoot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitProgramRoot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			_localctx = new ProgramRootContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 92292701200318464L) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & 312465L) != 0)) {
				{
				setState(99); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(98);
					statement();
					}
					}
					setState(101); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 92292701200318464L) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & 312465L) != 0) );
				}
			}

			setState(105);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public HtmlProgramContext htmlProgram() {
			return getRuleContext(HtmlProgramContext.class,0);
		}
		public CssProgramContext cssProgram() {
			return getRuleContext(CssProgramContext.class,0);
		}
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public ImportModelDeclarationContext importModelDeclaration() {
			return getRuleContext(ImportModelDeclarationContext.class,0);
		}
		public ExportModelDeclarationContext exportModelDeclaration() {
			return getRuleContext(ExportModelDeclarationContext.class,0);
		}
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public ObjectCreationContext objectCreation() {
			return getRuleContext(ObjectCreationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public ConsolDeclarationContext consolDeclaration() {
			return getRuleContext(ConsolDeclarationContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public ThrowStatementContext throwStatement() {
			return getRuleContext(ThrowStatementContext.class,0);
		}
		public ObjectClassContext objectClass() {
			return getRuleContext(ObjectClassContext.class,0);
		}
		public ObjectInterfaceContext objectInterface() {
			return getRuleContext(ObjectInterfaceContext.class,0);
		}
		public CallFunctiosContext callFunctios() {
			return getRuleContext(CallFunctiosContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public EmitStatementContext emitStatement() {
			return getRuleContext(EmitStatementContext.class,0);
		}
		public ThisStatementContext thisStatement() {
			return getRuleContext(ThisStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(128);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(107);
				declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(108);
				htmlProgram();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(109);
				cssProgram();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(110);
				variableDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(111);
				importModelDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(112);
				exportModelDeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(113);
				functionDeclaration();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(114);
				classDeclaration();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(115);
				interfaceDeclaration();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(116);
				objectCreation();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(117);
				enumDeclaration();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(118);
				consolDeclaration();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(119);
				expressionStatement();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(120);
				returnStatement();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(121);
				throwStatement();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(122);
				objectClass();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(123);
				objectInterface();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(124);
				callFunctios();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(125);
				assignment();
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(126);
				emitStatement();
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(127);
				thisStatement();
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationContext extends ParserRuleContext {
		public ServiceDeclarationContext serviceDeclaration() {
			return getRuleContext(ServiceDeclarationContext.class,0);
		}
		public ComponentDeclarationContext componentDeclaration() {
			return getRuleContext(ComponentDeclarationContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaration);
		try {
			setState(132);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				serviceDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(131);
				componentDeclaration();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ComponentDeclarationContext extends ParserRuleContext {
		public ComponentDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentDeclaration; }
	 
		public ComponentDeclarationContext() { }
		public void copyFrom(ComponentDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComponentdefinitionContext extends ComponentDeclarationContext {
		public TerminalNode DECORATOR() { return getToken(HTMLParser.DECORATOR, 0); }
		public TerminalNode COMPONENT() { return getToken(HTMLParser.COMPONENT, 0); }
		public TerminalNode LPAREN() { return getToken(HTMLParser.LPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(HTMLParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(HTMLParser.RBRACE, 0); }
		public TerminalNode RPAREN() { return getToken(HTMLParser.RPAREN, 0); }
		public List<ComponentBodyContext> componentBody() {
			return getRuleContexts(ComponentBodyContext.class);
		}
		public ComponentBodyContext componentBody(int i) {
			return getRuleContext(ComponentBodyContext.class,i);
		}
		public ComponentdefinitionContext(ComponentDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterComponentdefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitComponentdefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitComponentdefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentDeclarationContext componentDeclaration() throws RecognitionException {
		ComponentDeclarationContext _localctx = new ComponentDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_componentDeclaration);
		int _la;
		try {
			_localctx = new ComponentdefinitionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(DECORATOR);
			setState(135);
			match(COMPONENT);
			setState(136);
			match(LPAREN);
			setState(137);
			match(LBRACE);
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2251799813717504L) != 0)) {
				{
				{
				setState(138);
				componentBody();
				}
				}
				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(144);
			match(RBRACE);
			setState(145);
			match(RPAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ComponentBodyContext extends ParserRuleContext {
		public ComponentBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentBody; }
	 
		public ComponentBodyContext() { }
		public void copyFrom(ComponentBodyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StylesPropContext extends ComponentBodyContext {
		public TerminalNode STYLES() { return getToken(HTMLParser.STYLES, 0); }
		public TerminalNode COLON() { return getToken(HTMLParser.COLON, 0); }
		public TerminalNode LBRACKET() { return getToken(HTMLParser.LBRACKET, 0); }
		public List<TerminalNode> BACKTICK() { return getTokens(HTMLParser.BACKTICK); }
		public TerminalNode BACKTICK(int i) {
			return getToken(HTMLParser.BACKTICK, i);
		}
		public TerminalNode RBRACKET() { return getToken(HTMLParser.RBRACKET, 0); }
		public List<CssProgramContext> cssProgram() {
			return getRuleContexts(CssProgramContext.class);
		}
		public CssProgramContext cssProgram(int i) {
			return getRuleContext(CssProgramContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(HTMLParser.COMMA, 0); }
		public StylesPropContext(ComponentBodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterStylesProp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitStylesProp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitStylesProp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TemplateUrlPropContext extends ComponentBodyContext {
		public TerminalNode TEMPLATE_URL() { return getToken(HTMLParser.TEMPLATE_URL, 0); }
		public TerminalNode COLON() { return getToken(HTMLParser.COLON, 0); }
		public TerminalNode STRING_CONTENT() { return getToken(HTMLParser.STRING_CONTENT, 0); }
		public TerminalNode COMMA() { return getToken(HTMLParser.COMMA, 0); }
		public TemplateUrlPropContext(ComponentBodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterTemplateUrlProp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitTemplateUrlProp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitTemplateUrlProp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ImportsPropContext extends ComponentBodyContext {
		public TerminalNode IMPORTS() { return getToken(HTMLParser.IMPORTS, 0); }
		public TerminalNode COLON() { return getToken(HTMLParser.COLON, 0); }
		public TerminalNode LBRACKET() { return getToken(HTMLParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(HTMLParser.RBRACKET, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(HTMLParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(HTMLParser.IDENTIFIER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(HTMLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(HTMLParser.COMMA, i);
		}
		public ImportsPropContext(ComponentBodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterImportsProp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitImportsProp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitImportsProp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StyleUrlsPropContext extends ComponentBodyContext {
		public TerminalNode STYLE_URLS() { return getToken(HTMLParser.STYLE_URLS, 0); }
		public TerminalNode COLON() { return getToken(HTMLParser.COLON, 0); }
		public ArrayLiteralContext arrayLiteral() {
			return getRuleContext(ArrayLiteralContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(HTMLParser.COMMA, 0); }
		public StyleUrlsPropContext(ComponentBodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterStyleUrlsProp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitStyleUrlsProp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitStyleUrlsProp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InlineTemplatePropContext extends ComponentBodyContext {
		public TerminalNode TEMPLATE() { return getToken(HTMLParser.TEMPLATE, 0); }
		public TerminalNode COLON() { return getToken(HTMLParser.COLON, 0); }
		public List<TerminalNode> BACKTICK() { return getTokens(HTMLParser.BACKTICK); }
		public TerminalNode BACKTICK(int i) {
			return getToken(HTMLParser.BACKTICK, i);
		}
		public HtmlProgramContext htmlProgram() {
			return getRuleContext(HtmlProgramContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(HTMLParser.COMMA, 0); }
		public InlineTemplatePropContext(ComponentBodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterInlineTemplateProp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitInlineTemplateProp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitInlineTemplateProp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SelectorPropContext extends ComponentBodyContext {
		public TerminalNode SELECTOR() { return getToken(HTMLParser.SELECTOR, 0); }
		public TerminalNode COLON() { return getToken(HTMLParser.COLON, 0); }
		public TerminalNode STRING_CONTENT() { return getToken(HTMLParser.STRING_CONTENT, 0); }
		public TerminalNode COMMA() { return getToken(HTMLParser.COMMA, 0); }
		public SelectorPropContext(ComponentBodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterSelectorProp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitSelectorProp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitSelectorProp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StandalonePropContext extends ComponentBodyContext {
		public TerminalNode STANDALONE() { return getToken(HTMLParser.STANDALONE, 0); }
		public TerminalNode COLON() { return getToken(HTMLParser.COLON, 0); }
		public TerminalNode TRUE() { return getToken(HTMLParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(HTMLParser.FALSE, 0); }
		public TerminalNode COMMA() { return getToken(HTMLParser.COMMA, 0); }
		public StandalonePropContext(ComponentBodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterStandaloneProp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitStandaloneProp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitStandaloneProp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentBodyContext componentBody() throws RecognitionException {
		ComponentBodyContext _localctx = new ComponentBodyContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_componentBody);
		int _la;
		try {
			setState(210);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECTOR:
				_localctx = new SelectorPropContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(147);
				match(SELECTOR);
				setState(148);
				match(COLON);
				setState(149);
				match(STRING_CONTENT);
				setState(151);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(150);
					match(COMMA);
					}
				}

				}
				break;
			case TEMPLATE:
				_localctx = new InlineTemplatePropContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(153);
				match(TEMPLATE);
				setState(154);
				match(COLON);
				setState(155);
				match(BACKTICK);
				setState(156);
				htmlProgram();
				setState(157);
				match(BACKTICK);
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(158);
					match(COMMA);
					}
				}

				}
				break;
			case TEMPLATE_URL:
				_localctx = new TemplateUrlPropContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(161);
				match(TEMPLATE_URL);
				setState(162);
				match(COLON);
				setState(163);
				match(STRING_CONTENT);
				setState(165);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(164);
					match(COMMA);
					}
				}

				}
				break;
			case STYLE_URLS:
				_localctx = new StyleUrlsPropContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(167);
				match(STYLE_URLS);
				setState(168);
				match(COLON);
				setState(169);
				arrayLiteral();
				setState(171);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(170);
					match(COMMA);
					}
				}

				}
				break;
			case STYLES:
				_localctx = new StylesPropContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(173);
				match(STYLES);
				setState(174);
				match(COLON);
				setState(175);
				match(LBRACKET);
				setState(176);
				match(BACKTICK);
				setState(180);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==STYLE_OPEN_TAG || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & 2057L) != 0)) {
					{
					{
					setState(177);
					cssProgram();
					}
					}
					setState(182);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(183);
				match(BACKTICK);
				setState(184);
				match(RBRACKET);
				setState(186);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(185);
					match(COMMA);
					}
				}

				}
				break;
			case IMPORTS:
				_localctx = new ImportsPropContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(188);
				match(IMPORTS);
				setState(189);
				match(COLON);
				setState(190);
				match(LBRACKET);
				setState(197);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENTIFIER) {
					{
					{
					setState(191);
					match(IDENTIFIER);
					setState(193);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(192);
						match(COMMA);
						}
					}

					}
					}
					setState(199);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(200);
				match(RBRACKET);
				setState(202);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(201);
					match(COMMA);
					}
				}

				}
				break;
			case STANDALONE:
				_localctx = new StandalonePropContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(204);
				match(STANDALONE);
				setState(205);
				match(COLON);
				setState(206);
				_la = _input.LA(1);
				if ( !(_la==TRUE || _la==FALSE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(208);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(207);
					match(COMMA);
					}
				}

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

	@SuppressWarnings("CheckReturnValue")
	public static class ServiceDeclarationContext extends ParserRuleContext {
		public ServiceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_serviceDeclaration; }
	 
		public ServiceDeclarationContext() { }
		public void copyFrom(ServiceDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InjectableDefinitionContext extends ServiceDeclarationContext {
		public TerminalNode DECORATOR() { return getToken(HTMLParser.DECORATOR, 0); }
		public TerminalNode INJECTABLE() { return getToken(HTMLParser.INJECTABLE, 0); }
		public TerminalNode LPAREN() { return getToken(HTMLParser.LPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(HTMLParser.LBRACE, 0); }
		public TerminalNode PROVIDED_IN() { return getToken(HTMLParser.PROVIDED_IN, 0); }
		public TerminalNode COLON() { return getToken(HTMLParser.COLON, 0); }
		public TerminalNode STRING_CONTENT() { return getToken(HTMLParser.STRING_CONTENT, 0); }
		public TerminalNode RBRACE() { return getToken(HTMLParser.RBRACE, 0); }
		public TerminalNode RPAREN() { return getToken(HTMLParser.RPAREN, 0); }
		public InjectableDefinitionContext(ServiceDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterInjectableDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitInjectableDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitInjectableDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ServiceDeclarationContext serviceDeclaration() throws RecognitionException {
		ServiceDeclarationContext _localctx = new ServiceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_serviceDeclaration);
		try {
			_localctx = new InjectableDefinitionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			match(DECORATOR);
			setState(213);
			match(INJECTABLE);
			setState(214);
			match(LPAREN);
			setState(215);
			match(LBRACE);
			setState(216);
			match(PROVIDED_IN);
			setState(217);
			match(COLON);
			setState(218);
			match(STRING_CONTENT);
			setState(219);
			match(RBRACE);
			setState(220);
			match(RPAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlProgramContext extends ParserRuleContext {
		public HtmlProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlProgram; }
	 
		public HtmlProgramContext() { }
		public void copyFrom(HtmlProgramContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlblockContext extends HtmlProgramContext {
		public TerminalNode HTML_OPEN_TAG() { return getToken(HTMLParser.HTML_OPEN_TAG, 0); }
		public TerminalNode HTML_CLOSE_TAG() { return getToken(HTMLParser.HTML_CLOSE_TAG, 0); }
		public List<HtmlElementContext> htmlElement() {
			return getRuleContexts(HtmlElementContext.class);
		}
		public HtmlElementContext htmlElement(int i) {
			return getRuleContext(HtmlElementContext.class,i);
		}
		public HtmlblockContext(HtmlProgramContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterHtmlblock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitHtmlblock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitHtmlblock(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlelementContext extends HtmlProgramContext {
		public HtmlElementContext htmlElement() {
			return getRuleContext(HtmlElementContext.class,0);
		}
		public HtmlelementContext(HtmlProgramContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterHtmlelement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitHtmlelement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitHtmlelement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlProgramContext htmlProgram() throws RecognitionException {
		HtmlProgramContext _localctx = new HtmlProgramContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_htmlProgram);
		int _la;
		try {
			setState(231);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HTML_OPEN_TAG:
				_localctx = new HtmlblockContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(222);
				match(HTML_OPEN_TAG);
				setState(226);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==OPEN_TAG) {
					{
					{
					setState(223);
					htmlElement();
					}
					}
					setState(228);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(229);
				match(HTML_CLOSE_TAG);
				}
				break;
			case OPEN_TAG:
				_localctx = new HtmlelementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(230);
				htmlElement();
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

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlElementContext extends ParserRuleContext {
		public HtmlElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlElement; }
	 
		public HtmlElementContext() { }
		public void copyFrom(HtmlElementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NestedHtmlContext extends HtmlElementContext {
		public TerminalNode OPEN_TAG() { return getToken(HTMLParser.OPEN_TAG, 0); }
		public List<TerminalNode> HTML_ELEMENT() { return getTokens(HTMLParser.HTML_ELEMENT); }
		public TerminalNode HTML_ELEMENT(int i) {
			return getToken(HTMLParser.HTML_ELEMENT, i);
		}
		public List<TerminalNode> CLOUSE_TAG() { return getTokens(HTMLParser.CLOUSE_TAG); }
		public TerminalNode CLOUSE_TAG(int i) {
			return getToken(HTMLParser.CLOUSE_TAG, i);
		}
		public TerminalNode TAG_OPEN_SLASH() { return getToken(HTMLParser.TAG_OPEN_SLASH, 0); }
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public List<NgDirectiveContext> ngDirective() {
			return getRuleContexts(NgDirectiveContext.class);
		}
		public NgDirectiveContext ngDirective(int i) {
			return getRuleContext(NgDirectiveContext.class,i);
		}
		public List<HtmlElementContext> htmlElement() {
			return getRuleContexts(HtmlElementContext.class);
		}
		public HtmlElementContext htmlElement(int i) {
			return getRuleContext(HtmlElementContext.class,i);
		}
		public List<HtmlContentContext> htmlContent() {
			return getRuleContexts(HtmlContentContext.class);
		}
		public HtmlContentContext htmlContent(int i) {
			return getRuleContext(HtmlContentContext.class,i);
		}
		public NestedHtmlContext(HtmlElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterNestedHtml(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitNestedHtml(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitNestedHtml(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SelfClosingHtmlContext extends HtmlElementContext {
		public TerminalNode OPEN_TAG() { return getToken(HTMLParser.OPEN_TAG, 0); }
		public TerminalNode HTML_ELEMENT() { return getToken(HTMLParser.HTML_ELEMENT, 0); }
		public TerminalNode SLASH() { return getToken(HTMLParser.SLASH, 0); }
		public TerminalNode CLOUSE_TAG() { return getToken(HTMLParser.CLOUSE_TAG, 0); }
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public List<NgDirectiveContext> ngDirective() {
			return getRuleContexts(NgDirectiveContext.class);
		}
		public NgDirectiveContext ngDirective(int i) {
			return getRuleContext(NgDirectiveContext.class,i);
		}
		public SelfClosingHtmlContext(HtmlElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterSelfClosingHtml(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitSelfClosingHtml(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitSelfClosingHtml(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OpenTagOnlyHtmlContext extends HtmlElementContext {
		public TerminalNode OPEN_TAG() { return getToken(HTMLParser.OPEN_TAG, 0); }
		public TerminalNode HTML_ELEMENT() { return getToken(HTMLParser.HTML_ELEMENT, 0); }
		public TerminalNode CLOUSE_TAG() { return getToken(HTMLParser.CLOUSE_TAG, 0); }
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public List<NgDirectiveContext> ngDirective() {
			return getRuleContexts(NgDirectiveContext.class);
		}
		public NgDirectiveContext ngDirective(int i) {
			return getRuleContext(NgDirectiveContext.class,i);
		}
		public OpenTagOnlyHtmlContext(HtmlElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterOpenTagOnlyHtml(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitOpenTagOnlyHtml(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitOpenTagOnlyHtml(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlElementContext htmlElement() throws RecognitionException {
		HtmlElementContext _localctx = new HtmlElementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_htmlElement);
		int _la;
		try {
			setState(274);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				_localctx = new SelfClosingHtmlContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(233);
				match(OPEN_TAG);
				setState(234);
				match(HTML_ELEMENT);
				setState(239);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4611686018494496774L) != 0) || _la==LPAREN || _la==IDENTIFIER) {
					{
					setState(237);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case CLASS:
					case LBRACKET:
					case LPAREN:
					case IDENTIFIER:
						{
						setState(235);
						attribute();
						}
						break;
					case NG_FOR:
					case NG_IF:
						{
						setState(236);
						ngDirective();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(241);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(242);
				match(SLASH);
				setState(243);
				match(CLOUSE_TAG);
				}
				break;
			case 2:
				_localctx = new OpenTagOnlyHtmlContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(244);
				match(OPEN_TAG);
				setState(245);
				match(HTML_ELEMENT);
				setState(250);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4611686018494496774L) != 0) || _la==LPAREN || _la==IDENTIFIER) {
					{
					setState(248);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case CLASS:
					case LBRACKET:
					case LPAREN:
					case IDENTIFIER:
						{
						setState(246);
						attribute();
						}
						break;
					case NG_FOR:
					case NG_IF:
						{
						setState(247);
						ngDirective();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(252);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(253);
				match(CLOUSE_TAG);
				}
				break;
			case 3:
				_localctx = new NestedHtmlContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(254);
				match(OPEN_TAG);
				setState(255);
				match(HTML_ELEMENT);
				setState(260);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4611686018494496774L) != 0) || _la==LPAREN || _la==IDENTIFIER) {
					{
					setState(258);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case CLASS:
					case LBRACKET:
					case LPAREN:
					case IDENTIFIER:
						{
						setState(256);
						attribute();
						}
						break;
					case NG_FOR:
					case NG_IF:
						{
						setState(257);
						ngDirective();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(262);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(263);
				match(CLOUSE_TAG);
				setState(268);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==INTERPOLATION || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & 17409L) != 0)) {
					{
					setState(266);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case OPEN_TAG:
						{
						setState(264);
						htmlElement();
						}
						break;
					case INTERPOLATION:
					case STRING_CONTENT:
					case IDENTIFIER:
						{
						setState(265);
						htmlContent();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(270);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(271);
				match(TAG_OPEN_SLASH);
				setState(272);
				match(HTML_ELEMENT);
				setState(273);
				match(CLOUSE_TAG);
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

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlContentContext extends ParserRuleContext {
		public HtmlContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlContent; }
	 
		public HtmlContentContext() { }
		public void copyFrom(HtmlContentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ColonIdentifierContentContext extends HtmlContentContext {
		public TerminalNode IDENTIFIER() { return getToken(HTMLParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(HTMLParser.COLON, 0); }
		public ColonIdentifierContentContext(HtmlContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterColonIdentifierContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitColonIdentifierContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitColonIdentifierContent(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierContentContext extends HtmlContentContext {
		public TerminalNode IDENTIFIER() { return getToken(HTMLParser.IDENTIFIER, 0); }
		public IdentifierContentContext(HtmlContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterIdentifierContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitIdentifierContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitIdentifierContent(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InterpolationContentContext extends HtmlContentContext {
		public List<TerminalNode> INTERPOLATION() { return getTokens(HTMLParser.INTERPOLATION); }
		public TerminalNode INTERPOLATION(int i) {
			return getToken(HTMLParser.INTERPOLATION, i);
		}
		public List<TerminalNode> DASH() { return getTokens(HTMLParser.DASH); }
		public TerminalNode DASH(int i) {
			return getToken(HTMLParser.DASH, i);
		}
		public List<TerminalNode> COLON() { return getTokens(HTMLParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(HTMLParser.COLON, i);
		}
		public InterpolationContentContext(HtmlContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterInterpolationContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitInterpolationContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitInterpolationContent(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringContentContext extends HtmlContentContext {
		public TerminalNode STRING_CONTENT() { return getToken(HTMLParser.STRING_CONTENT, 0); }
		public StringContentContext(HtmlContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterStringContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitStringContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitStringContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlContentContext htmlContent() throws RecognitionException {
		HtmlContentContext _localctx = new HtmlContentContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_htmlContent);
		int _la;
		try {
			setState(288);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				_localctx = new InterpolationContentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(276);
				match(INTERPOLATION);
				setState(281);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DASH || _la==COLON) {
					{
					{
					setState(277);
					_la = _input.LA(1);
					if ( !(_la==DASH || _la==COLON) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(278);
					match(INTERPOLATION);
					}
					}
					setState(283);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				_localctx = new StringContentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(284);
				match(STRING_CONTENT);
				}
				break;
			case 3:
				_localctx = new IdentifierContentContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(285);
				match(IDENTIFIER);
				}
				break;
			case 4:
				_localctx = new ColonIdentifierContentContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(286);
				match(IDENTIFIER);
				setState(287);
				match(COLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AttributeContext extends ParserRuleContext {
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
	 
		public AttributeContext() { }
		public void copyFrom(AttributeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BoundAttributeContext extends AttributeContext {
		public TerminalNode LBRACKET() { return getToken(HTMLParser.LBRACKET, 0); }
		public TerminalNode IDENTIFIER() { return getToken(HTMLParser.IDENTIFIER, 0); }
		public TerminalNode RBRACKET() { return getToken(HTMLParser.RBRACKET, 0); }
		public TerminalNode ASSIGN() { return getToken(HTMLParser.ASSIGN, 0); }
		public TerminalNode STRING_CONTENT() { return getToken(HTMLParser.STRING_CONTENT, 0); }
		public BoundAttributeContext(AttributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterBoundAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitBoundAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitBoundAttribute(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SimpleAttributeContext extends AttributeContext {
		public TerminalNode ASSIGN() { return getToken(HTMLParser.ASSIGN, 0); }
		public TerminalNode STRING_CONTENT() { return getToken(HTMLParser.STRING_CONTENT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(HTMLParser.IDENTIFIER, 0); }
		public TerminalNode CLASS() { return getToken(HTMLParser.CLASS, 0); }
		public SimpleAttributeContext(AttributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterSimpleAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitSimpleAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitSimpleAttribute(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class QuotedAttributeContext extends AttributeContext {
		public TerminalNode IDENTIFIER() { return getToken(HTMLParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(HTMLParser.ASSIGN, 0); }
		public List<TerminalNode> QUOTE() { return getTokens(HTMLParser.QUOTE); }
		public TerminalNode QUOTE(int i) {
			return getToken(HTMLParser.QUOTE, i);
		}
		public QuotedAttributeContext(AttributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterQuotedAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitQuotedAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitQuotedAttribute(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EventAttributeContext extends AttributeContext {
		public TerminalNode LPAREN() { return getToken(HTMLParser.LPAREN, 0); }
		public TerminalNode IDENTIFIER() { return getToken(HTMLParser.IDENTIFIER, 0); }
		public TerminalNode RPAREN() { return getToken(HTMLParser.RPAREN, 0); }
		public TerminalNode ASSIGN() { return getToken(HTMLParser.ASSIGN, 0); }
		public TerminalNode STRING_CONTENT() { return getToken(HTMLParser.STRING_CONTENT, 0); }
		public EventAttributeContext(AttributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterEventAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitEventAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitEventAttribute(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ColonOnlyAttributeContext extends AttributeContext {
		public TerminalNode IDENTIFIER() { return getToken(HTMLParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(HTMLParser.COLON, 0); }
		public ColonOnlyAttributeContext(AttributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterColonOnlyAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitColonOnlyAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitColonOnlyAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_attribute);
		int _la;
		try {
			int _alt;
			setState(315);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				_localctx = new SimpleAttributeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(290);
				_la = _input.LA(1);
				if ( !(_la==CLASS || _la==IDENTIFIER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(291);
				match(ASSIGN);
				setState(292);
				match(STRING_CONTENT);
				}
				break;
			case 2:
				_localctx = new QuotedAttributeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(293);
				match(IDENTIFIER);
				setState(294);
				match(ASSIGN);
				setState(295);
				match(QUOTE);
				setState(299);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(296);
						matchWildcard();
						}
						} 
					}
					setState(301);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
				}
				setState(302);
				match(QUOTE);
				}
				break;
			case 3:
				_localctx = new BoundAttributeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(303);
				match(LBRACKET);
				setState(304);
				match(IDENTIFIER);
				setState(305);
				match(RBRACKET);
				setState(306);
				match(ASSIGN);
				setState(307);
				match(STRING_CONTENT);
				}
				break;
			case 4:
				_localctx = new EventAttributeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(308);
				match(LPAREN);
				setState(309);
				match(IDENTIFIER);
				setState(310);
				match(RPAREN);
				setState(311);
				match(ASSIGN);
				setState(312);
				match(STRING_CONTENT);
				}
				break;
			case 5:
				_localctx = new ColonOnlyAttributeContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(313);
				match(IDENTIFIER);
				setState(314);
				match(COLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CssProgramContext extends ParserRuleContext {
		public CssProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssProgram; }
	 
		public CssProgramContext() { }
		public void copyFrom(CssProgramContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssMultipleRulesContext extends CssProgramContext {
		public List<CssRuleContext> cssRule() {
			return getRuleContexts(CssRuleContext.class);
		}
		public CssRuleContext cssRule(int i) {
			return getRuleContext(CssRuleContext.class,i);
		}
		public CssMultipleRulesContext(CssProgramContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterCssMultipleRules(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitCssMultipleRules(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitCssMultipleRules(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssBlockWithTagContext extends CssProgramContext {
		public TerminalNode STYLE_OPEN_TAG() { return getToken(HTMLParser.STYLE_OPEN_TAG, 0); }
		public TerminalNode STYLE_CLOSE_TAG() { return getToken(HTMLParser.STYLE_CLOSE_TAG, 0); }
		public List<CssRuleContext> cssRule() {
			return getRuleContexts(CssRuleContext.class);
		}
		public CssRuleContext cssRule(int i) {
			return getRuleContext(CssRuleContext.class,i);
		}
		public CssBlockWithTagContext(CssProgramContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterCssBlockWithTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitCssBlockWithTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitCssBlockWithTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssProgramContext cssProgram() throws RecognitionException {
		CssProgramContext _localctx = new CssProgramContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_cssProgram);
		int _la;
		try {
			int _alt;
			setState(330);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STYLE_OPEN_TAG:
				_localctx = new CssBlockWithTagContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(317);
				match(STYLE_OPEN_TAG);
				setState(321);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & 2057L) != 0)) {
					{
					{
					setState(318);
					cssRule();
					}
					}
					setState(323);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(324);
				match(STYLE_CLOSE_TAG);
				}
				break;
			case DOT:
			case HASH:
			case IDENTIFIER:
				_localctx = new CssMultipleRulesContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(326); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(325);
						cssRule();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(328); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	@SuppressWarnings("CheckReturnValue")
	public static class CssRuleContext extends ParserRuleContext {
		public CssRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssRule; }
	 
		public CssRuleContext() { }
		public void copyFrom(CssRuleContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssBasicRuleContext extends CssRuleContext {
		public SelectorContext selector() {
			return getRuleContext(SelectorContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(HTMLParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(HTMLParser.RBRACE, 0); }
		public TerminalNode HTML_ELEMENT() { return getToken(HTMLParser.HTML_ELEMENT, 0); }
		public List<CssPropertyContext> cssProperty() {
			return getRuleContexts(CssPropertyContext.class);
		}
		public CssPropertyContext cssProperty(int i) {
			return getRuleContext(CssPropertyContext.class,i);
		}
		public List<TerminalNode> COLON() { return getTokens(HTMLParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(HTMLParser.COLON, i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(HTMLParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(HTMLParser.SEMICOLON, i);
		}
		public List<TerminalNode> VALUE() { return getTokens(HTMLParser.VALUE); }
		public TerminalNode VALUE(int i) {
			return getToken(HTMLParser.VALUE, i);
		}
		public List<CallFunctiosContext> callFunctios() {
			return getRuleContexts(CallFunctiosContext.class);
		}
		public CallFunctiosContext callFunctios(int i) {
			return getRuleContext(CallFunctiosContext.class,i);
		}
		public CssBasicRuleContext(CssRuleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterCssBasicRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitCssBasicRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitCssBasicRule(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssNestedRuleContext extends CssRuleContext {
		public SelectorContext selector() {
			return getRuleContext(SelectorContext.class,0);
		}
		public List<TerminalNode> COLON() { return getTokens(HTMLParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(HTMLParser.COLON, i);
		}
		public TerminalNode IDENTIFIER() { return getToken(HTMLParser.IDENTIFIER, 0); }
		public TerminalNode LBRACE() { return getToken(HTMLParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(HTMLParser.RBRACE, 0); }
		public List<TerminalNode> CSS_PROPERTY() { return getTokens(HTMLParser.CSS_PROPERTY); }
		public TerminalNode CSS_PROPERTY(int i) {
			return getToken(HTMLParser.CSS_PROPERTY, i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(HTMLParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(HTMLParser.SEMICOLON, i);
		}
		public List<TerminalNode> VALUE() { return getTokens(HTMLParser.VALUE); }
		public TerminalNode VALUE(int i) {
			return getToken(HTMLParser.VALUE, i);
		}
		public List<TerminalNode> LPAREN() { return getTokens(HTMLParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(HTMLParser.LPAREN, i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(HTMLParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(HTMLParser.RPAREN, i);
		}
		public CssNestedRuleContext(CssRuleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterCssNestedRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitCssNestedRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitCssNestedRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssRuleContext cssRule() throws RecognitionException {
		CssRuleContext _localctx = new CssRuleContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_cssRule);
		int _la;
		try {
			setState(389);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				_localctx = new CssBasicRuleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(332);
				selector();
				setState(334);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==HTML_ELEMENT) {
					{
					setState(333);
					match(HTML_ELEMENT);
					}
				}

				setState(336);
				match(LBRACE);
				setState(359);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CSS_PROPERTY) {
					{
					{
					setState(337);
					cssProperty();
					setState(338);
					match(COLON);
					setState(352);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
					case 1:
						{
						setState(342);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==VALUE) {
							{
							{
							setState(339);
							match(VALUE);
							}
							}
							setState(344);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(346);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==IDENTIFIER) {
							{
							setState(345);
							callFunctios();
							}
						}

						}
						break;
					case 2:
						{
						setState(348);
						cssProperty();
						setState(350);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==VALUE) {
							{
							setState(349);
							match(VALUE);
							}
						}

						}
						break;
					}
					setState(355);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMICOLON) {
						{
						setState(354);
						match(SEMICOLON);
						}
					}

					}
					}
					setState(361);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(362);
				match(RBRACE);
				}
				break;
			case 2:
				_localctx = new CssNestedRuleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(364);
				selector();
				setState(365);
				match(COLON);
				setState(366);
				match(IDENTIFIER);
				setState(367);
				match(LBRACE);
				setState(384);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CSS_PROPERTY) {
					{
					{
					setState(368);
					match(CSS_PROPERTY);
					setState(369);
					match(COLON);
					setState(379);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
					case 1:
						{
						setState(370);
						match(VALUE);
						}
						break;
					case 2:
						{
						setState(371);
						match(CSS_PROPERTY);
						setState(373);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==VALUE) {
							{
							setState(372);
							match(VALUE);
							}
						}

						}
						break;
					case 3:
						{
						setState(375);
						match(VALUE);
						setState(376);
						match(LPAREN);
						setState(377);
						match(VALUE);
						setState(378);
						match(RPAREN);
						}
						break;
					}
					setState(381);
					match(SEMICOLON);
					}
					}
					setState(386);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(387);
				match(RBRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CssPropertyContext extends ParserRuleContext {
		public CssPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssProperty; }
	 
		public CssPropertyContext() { }
		public void copyFrom(CssPropertyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssPropertyNameContext extends CssPropertyContext {
		public TerminalNode CSS_PROPERTY() { return getToken(HTMLParser.CSS_PROPERTY, 0); }
		public CssPropertyNameContext(CssPropertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterCssPropertyName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitCssPropertyName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitCssPropertyName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssPropertyContext cssProperty() throws RecognitionException {
		CssPropertyContext _localctx = new CssPropertyContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_cssProperty);
		try {
			_localctx = new CssPropertyNameContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(391);
			match(CSS_PROPERTY);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SelectorContext extends ParserRuleContext {
		public SelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selector; }
	 
		public SelectorContext() { }
		public void copyFrom(SelectorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DotSelectorContext extends SelectorContext {
		public TerminalNode DOT() { return getToken(HTMLParser.DOT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(HTMLParser.IDENTIFIER, 0); }
		public TerminalNode HTML_ELEMENT() { return getToken(HTMLParser.HTML_ELEMENT, 0); }
		public TerminalNode LOG() { return getToken(HTMLParser.LOG, 0); }
		public TerminalNode AS() { return getToken(HTMLParser.AS, 0); }
		public DotSelectorContext(SelectorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterDotSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitDotSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitDotSelector(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SimpleSelectorContext extends SelectorContext {
		public TerminalNode IDENTIFIER() { return getToken(HTMLParser.IDENTIFIER, 0); }
		public SimpleSelectorContext(SelectorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterSimpleSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitSimpleSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitSimpleSelector(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HashSelectorContext extends SelectorContext {
		public TerminalNode HASH() { return getToken(HTMLParser.HASH, 0); }
		public TerminalNode IDENTIFIER() { return getToken(HTMLParser.IDENTIFIER, 0); }
		public HashSelectorContext(SelectorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterHashSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitHashSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitHashSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectorContext selector() throws RecognitionException {
		SelectorContext _localctx = new SelectorContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_selector);
		int _la;
		try {
			setState(398);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOT:
				_localctx = new DotSelectorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(393);
				match(DOT);
				setState(394);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 274886295616L) != 0) || _la==IDENTIFIER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case HASH:
				_localctx = new HashSelectorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(395);
				match(HASH);
				setState(396);
				match(IDENTIFIER);
				}
				break;
			case IDENTIFIER:
				_localctx = new SimpleSelectorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(397);
				match(IDENTIFIER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ImportModelDeclarationContext extends ParserRuleContext {
		public ImportModelDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importModelDeclaration; }
	 
		public ImportModelDeclarationContext() { }
		public void copyFrom(ImportModelDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ImportModelContext extends ImportModelDeclarationContext {
		public TerminalNode IMPORT() { return getToken(HTMLParser.IMPORT, 0); }
		public TerminalNode LBRACE() { return getToken(HTMLParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(HTMLParser.RBRACE, 0); }
		public TerminalNode FROM() { return getToken(HTMLParser.FROM, 0); }
		public TerminalNode STRING_CONTENT() { return getToken(HTMLParser.STRING_CONTENT, 0); }
		public TerminalNode SEMICOLON() { return getToken(HTMLParser.SEMICOLON, 0); }
		public TerminalNode IDENTIFIER() { return getToken(HTMLParser.IDENTIFIER, 0); }
		public TerminalNode COMPONENT() { return getToken(HTMLParser.COMPONENT, 0); }
		public TerminalNode INJECTABLE() { return getToken(HTMLParser.INJECTABLE, 0); }
		public ImportModelContext(ImportModelDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterImportModel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitImportModel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitImportModel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportModelDeclarationContext importModelDeclaration() throws RecognitionException {
		ImportModelDeclarationContext _localctx = new ImportModelDeclarationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_importModelDeclaration);
		int _la;
		try {
			_localctx = new ImportModelContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(400);
			match(IMPORT);
			setState(401);
			match(LBRACE);
			setState(402);
			_la = _input.LA(1);
			if ( !(_la==COMPONENT || _la==INJECTABLE || _la==IDENTIFIER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(403);
			match(RBRACE);
			setState(404);
			match(FROM);
			setState(405);
			match(STRING_CONTENT);
			setState(406);
			match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExportModelDeclarationContext extends ParserRuleContext {
		public ExportModelDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exportModelDeclaration; }
	 
		public ExportModelDeclarationContext() { }
		public void copyFrom(ExportModelDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExportClassContext extends ExportModelDeclarationContext {
		public TerminalNode EXPORT() { return getToken(HTMLParser.EXPORT, 0); }
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public ExportClassContext(ExportModelDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterExportClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitExportClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitExportClass(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExportSimpleContext extends ExportModelDeclarationContext {
		public TerminalNode EXPORT() { return getToken(HTMLParser.EXPORT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(HTMLParser.IDENTIFIER, 0); }
		public TerminalNode SEMICOLON() { return getToken(HTMLParser.SEMICOLON, 0); }
		public TerminalNode CLASS() { return getToken(HTMLParser.CLASS, 0); }
		public TerminalNode FUNCTION() { return getToken(HTMLParser.FUNCTION, 0); }
		public TerminalNode CONST() { return getToken(HTMLParser.CONST, 0); }
		public TerminalNode INTERFACE() { return getToken(HTMLParser.INTERFACE, 0); }
		public TerminalNode ENUM() { return getToken(HTMLParser.ENUM, 0); }
		public TerminalNode ASSIGN() { return getToken(HTMLParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExportSimpleContext(ExportModelDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterExportSimple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitExportSimple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitExportSimple(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExportModelDeclarationContext exportModelDeclaration() throws RecognitionException {
		ExportModelDeclarationContext _localctx = new ExportModelDeclarationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_exportModelDeclaration);
		int _la;
		try {
			setState(418);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				_localctx = new ExportSimpleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(408);
				match(EXPORT);
				setState(409);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 282578883969024L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(410);
				match(IDENTIFIER);
				setState(413);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(411);
					match(ASSIGN);
					setState(412);
					expression();
					}
				}

				setState(415);
				match(SEMICOLON);
				}
				break;
			case 2:
				_localctx = new ExportClassContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(416);
				match(EXPORT);
				setState(417);
				classDeclaration();
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

	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclarationContext extends ParserRuleContext {
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
	 
		public VariableDeclarationContext() { }
		public void copyFrom(VariableDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VariableTypedContext extends VariableDeclarationContext {
		public TerminalNode IDENTIFIER() { return getToken(HTMLParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(HTMLParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode LET() { return getToken(HTMLParser.LET, 0); }
		public TerminalNode PUBLIC() { return getToken(HTMLParser.PUBLIC, 0); }
		public TerminalNode PRIVATE() { return getToken(HTMLParser.PRIVATE, 0); }
		public TerminalNode PROTECTED() { return getToken(HTMLParser.PROTECTED, 0); }
		public TerminalNode CONST() { return getToken(HTMLParser.CONST, 0); }
		public TerminalNode SEMICOLON() { return getToken(HTMLParser.SEMICOLON, 0); }
		public TerminalNode COMMA() { return getToken(HTMLParser.COMMA, 0); }
		public TerminalNode VALUE() { return getToken(HTMLParser.VALUE, 0); }
		public TerminalNode TRUE() { return getToken(HTMLParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(HTMLParser.FALSE, 0); }
		public TerminalNode STRING_CONTENT() { return getToken(HTMLParser.STRING_CONTENT, 0); }
		public ArrayLiteralContext arrayLiteral() {
			return getRuleContext(ArrayLiteralContext.class,0);
		}
		public TupleLiteralContext tupleLiteral() {
			return getRuleContext(TupleLiteralContext.class,0);
		}
		public EnumValueContext enumValue() {
			return getRuleContext(EnumValueContext.class,0);
		}
		public TypeAssertionContext typeAssertion() {
			return getRuleContext(TypeAssertionContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(HTMLParser.ASSIGN, 0); }
		public VariableTypedContext(VariableDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterVariableTyped(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitVariableTyped(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitVariableTyped(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VariableArrayAssignmentContext extends VariableDeclarationContext {
		public TerminalNode IDENTIFIER() { return getToken(HTMLParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(HTMLParser.ASSIGN, 0); }
		public ArrayLiteralContext arrayLiteral() {
			return getRuleContext(ArrayLiteralContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(HTMLParser.SEMICOLON, 0); }
		public VariableArrayAssignmentContext(VariableDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterVariableArrayAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitVariableArrayAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitVariableArrayAssignment(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VariableDecoratorContext extends VariableDeclarationContext {
		public DecoratorContext decorator() {
			return getRuleContext(DecoratorContext.class,0);
		}
		public VariableDecoratorContext(VariableDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterVariableDecorator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitVariableDecorator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitVariableDecorator(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VariableThisBindingContext extends VariableDeclarationContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(HTMLParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(HTMLParser.IDENTIFIER, i);
		}
		public TerminalNode COLON() { return getToken(HTMLParser.COLON, 0); }
		public TerminalNode SDOLAR() { return getToken(HTMLParser.SDOLAR, 0); }
		public TerminalNode LBRACE() { return getToken(HTMLParser.LBRACE, 0); }
		public TerminalNode THIS() { return getToken(HTMLParser.THIS, 0); }
		public TerminalNode DOT() { return getToken(HTMLParser.DOT, 0); }
		public TerminalNode RBRACE() { return getToken(HTMLParser.RBRACE, 0); }
		public VariableThisBindingContext(VariableDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterVariableThisBinding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitVariableThisBinding(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitVariableThisBinding(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_variableDeclaration);
		int _la;
		try {
			setState(460);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				_localctx = new VariableTypedContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(421);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 527799941070848L) != 0)) {
					{
					setState(420);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 527799941070848L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(423);
				match(IDENTIFIER);
				setState(424);
				match(COLON);
				setState(426);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
				case 1:
					{
					setState(425);
					type();
					}
					break;
				}
				setState(441);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
				case 1:
					{
					setState(429);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ASSIGN) {
						{
						setState(428);
						match(ASSIGN);
						}
					}

					setState(439);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
					case 1:
						{
						setState(431);
						match(VALUE);
						}
						break;
					case 2:
						{
						setState(432);
						match(TRUE);
						}
						break;
					case 3:
						{
						setState(433);
						match(FALSE);
						}
						break;
					case 4:
						{
						setState(434);
						match(STRING_CONTENT);
						}
						break;
					case 5:
						{
						setState(435);
						arrayLiteral();
						}
						break;
					case 6:
						{
						setState(436);
						tupleLiteral();
						}
						break;
					case 7:
						{
						setState(437);
						enumValue();
						}
						break;
					case 8:
						{
						setState(438);
						typeAssertion();
						}
						break;
					}
					}
					break;
				}
				setState(444);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
				case 1:
					{
					setState(443);
					_la = _input.LA(1);
					if ( !(_la==SEMICOLON || _la==COMMA) ) {
					_errHandler.recoverInline(this);
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
				break;
			case 2:
				_localctx = new VariableArrayAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(446);
				match(IDENTIFIER);
				setState(447);
				match(ASSIGN);
				setState(448);
				arrayLiteral();
				setState(449);
				match(SEMICOLON);
				}
				break;
			case 3:
				_localctx = new VariableThisBindingContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(451);
				match(IDENTIFIER);
				setState(452);
				match(COLON);
				{
				setState(453);
				match(SDOLAR);
				setState(454);
				match(LBRACE);
				setState(455);
				match(THIS);
				setState(456);
				match(DOT);
				setState(457);
				match(IDENTIFIER);
				setState(458);
				match(RBRACE);
				}
				}
				break;
			case 4:
				_localctx = new VariableDecoratorContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(459);
				decorator();
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

	@SuppressWarnings("CheckReturnValue")
	public static class DecoratorContext extends ParserRuleContext {
		public DecoratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decorator; }
	 
		public DecoratorContext() { }
		public void copyFrom(DecoratorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DecoratorDefinitionContext extends DecoratorContext {
		public TerminalNode DECORATOR() { return getToken(HTMLParser.DECORATOR, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(HTMLParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(HTMLParser.IDENTIFIER, i);
		}
		public List<TerminalNode> LPAREN() { return getTokens(HTMLParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(HTMLParser.LPAREN, i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(HTMLParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(HTMLParser.RPAREN, i);
		}
		public TerminalNode ASSIGN() { return getToken(HTMLParser.ASSIGN, 0); }
		public TerminalNode NEW() { return getToken(HTMLParser.NEW, 0); }
		public TerminalNode OPEN_TAG() { return getToken(HTMLParser.OPEN_TAG, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode CLOUSE_TAG() { return getToken(HTMLParser.CLOUSE_TAG, 0); }
		public TerminalNode SEMICOLON() { return getToken(HTMLParser.SEMICOLON, 0); }
		public DecoratorDefinitionContext(DecoratorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterDecoratorDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitDecoratorDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitDecoratorDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecoratorContext decorator() throws RecognitionException {
		DecoratorContext _localctx = new DecoratorContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_decorator);
		try {
			_localctx = new DecoratorDefinitionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(462);
			match(DECORATOR);
			setState(463);
			match(IDENTIFIER);
			setState(464);
			match(LPAREN);
			setState(465);
			match(RPAREN);
			setState(466);
			match(IDENTIFIER);
			setState(467);
			match(ASSIGN);
			setState(468);
			match(NEW);
			setState(469);
			match(IDENTIFIER);
			setState(470);
			match(OPEN_TAG);
			setState(471);
			type();
			setState(472);
			match(CLOUSE_TAG);
			setState(473);
			match(LPAREN);
			setState(474);
			match(RPAREN);
			setState(475);
			match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeAssertionContext extends ParserRuleContext {
		public TypeAssertionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeAssertion; }
	 
		public TypeAssertionContext() { }
		public void copyFrom(TypeAssertionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeAssertionExprContext extends TypeAssertionContext {
		public TerminalNode LPAREN() { return getToken(HTMLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(HTMLParser.RPAREN, 0); }
		public TerminalNode DOT() { return getToken(HTMLParser.DOT, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(HTMLParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(HTMLParser.IDENTIFIER, i);
		}
		public TerminalNode AS() { return getToken(HTMLParser.AS, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode OPEN_TAG() { return getToken(HTMLParser.OPEN_TAG, 0); }
		public TerminalNode CLOUSE_TAG() { return getToken(HTMLParser.CLOUSE_TAG, 0); }
		public TypeAssertionExprContext(TypeAssertionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterTypeAssertionExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitTypeAssertionExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitTypeAssertionExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeAssertionContext typeAssertion() throws RecognitionException {
		TypeAssertionContext _localctx = new TypeAssertionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_typeAssertion);
		try {
			_localctx = new TypeAssertionExprContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(477);
			match(LPAREN);
			setState(486);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(478);
				match(IDENTIFIER);
				setState(479);
				match(AS);
				setState(480);
				type();
				}
				break;
			case OPEN_TAG:
				{
				setState(481);
				match(OPEN_TAG);
				setState(482);
				type();
				setState(483);
				match(CLOUSE_TAG);
				setState(484);
				match(IDENTIFIER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(488);
			match(RPAREN);
			setState(489);
			match(DOT);
			setState(490);
			match(IDENTIFIER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class EnumDeclarationContext extends ParserRuleContext {
		public EnumDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumDeclaration; }
	 
		public EnumDeclarationContext() { }
		public void copyFrom(EnumDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EnumDefContext extends EnumDeclarationContext {
		public TerminalNode ENUM() { return getToken(HTMLParser.ENUM, 0); }
		public TerminalNode IDENTIFIER() { return getToken(HTMLParser.IDENTIFIER, 0); }
		public TerminalNode LBRACE() { return getToken(HTMLParser.LBRACE, 0); }
		public EnumeratorListContext enumeratorList() {
			return getRuleContext(EnumeratorListContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(HTMLParser.RBRACE, 0); }
		public EnumDefContext(EnumDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterEnumDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitEnumDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitEnumDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumDeclarationContext enumDeclaration() throws RecognitionException {
		EnumDeclarationContext _localctx = new EnumDeclarationContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_enumDeclaration);
		try {
			_localctx = new EnumDefContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(492);
			match(ENUM);
			setState(493);
			match(IDENTIFIER);
			setState(494);
			match(LBRACE);
			setState(495);
			enumeratorList();
			setState(496);
			match(RBRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class EnumeratorListContext extends ParserRuleContext {
		public EnumeratorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumeratorList; }
	 
		public EnumeratorListContext() { }
		public void copyFrom(EnumeratorListContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EnumValuesContext extends EnumeratorListContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(HTMLParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(HTMLParser.IDENTIFIER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(HTMLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(HTMLParser.COMMA, i);
		}
		public EnumValuesContext(EnumeratorListContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterEnumValues(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitEnumValues(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitEnumValues(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumeratorListContext enumeratorList() throws RecognitionException {
		EnumeratorListContext _localctx = new EnumeratorListContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_enumeratorList);
		int _la;
		try {
			_localctx = new EnumValuesContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(498);
			match(IDENTIFIER);
			setState(503);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(499);
				match(COMMA);
				setState(500);
				match(IDENTIFIER);
				}
				}
				setState(505);
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

	@SuppressWarnings("CheckReturnValue")
	public static class EnumValueContext extends ParserRuleContext {
		public EnumValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumValue; }
	 
		public EnumValueContext() { }
		public void copyFrom(EnumValueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EnumValueRefContext extends EnumValueContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(HTMLParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(HTMLParser.IDENTIFIER, i);
		}
		public TerminalNode DOT() { return getToken(HTMLParser.DOT, 0); }
		public EnumValueRefContext(EnumValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterEnumValueRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitEnumValueRef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitEnumValueRef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumValueContext enumValue() throws RecognitionException {
		EnumValueContext _localctx = new EnumValueContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_enumValue);
		try {
			_localctx = new EnumValueRefContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(506);
			match(IDENTIFIER);
			setState(507);
			match(DOT);
			setState(508);
			match(IDENTIFIER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ClassDeclarationContext extends ParserRuleContext {
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
	 
		public ClassDeclarationContext() { }
		public void copyFrom(ClassDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ClassDefContext extends ClassDeclarationContext {
		public TerminalNode CLASS() { return getToken(HTMLParser.CLASS, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(HTMLParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(HTMLParser.IDENTIFIER, i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode EXTENDS() { return getToken(HTMLParser.EXTENDS, 0); }
		public ClassDefContext(ClassDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterClassDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitClassDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitClassDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_classDeclaration);
		int _la;
		try {
			_localctx = new ClassDefContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(510);
			match(CLASS);
			setState(511);
			match(IDENTIFIER);
			setState(514);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(512);
				match(EXTENDS);
				setState(513);
				match(IDENTIFIER);
				}
			}

			setState(516);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ObjectClassContext extends ParserRuleContext {
		public ObjectClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectClass; }
	 
		public ObjectClassContext() { }
		public void copyFrom(ObjectClassContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ObjectClassInstanceContext extends ObjectClassContext {
		public TerminalNode LET() { return getToken(HTMLParser.LET, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(HTMLParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(HTMLParser.IDENTIFIER, i);
		}
		public TerminalNode ASSIGN() { return getToken(HTMLParser.ASSIGN, 0); }
		public TerminalNode NEW() { return getToken(HTMLParser.NEW, 0); }
		public TerminalNode LPAREN() { return getToken(HTMLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(HTMLParser.RPAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(HTMLParser.SEMICOLON, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(HTMLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(HTMLParser.COMMA, i);
		}
		public ObjectClassInstanceContext(ObjectClassContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterObjectClassInstance(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitObjectClassInstance(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitObjectClassInstance(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectClassContext objectClass() throws RecognitionException {
		ObjectClassContext _localctx = new ObjectClassContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_objectClass);
		int _la;
		try {
			_localctx = new ObjectClassInstanceContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(518);
			match(LET);
			setState(519);
			match(IDENTIFIER);
			setState(520);
			match(ASSIGN);
			setState(521);
			match(NEW);
			setState(522);
			match(IDENTIFIER);
			setState(523);
			match(LPAREN);
			setState(532);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 35)) & ~0x3f) == 0 && ((1L << (_la - 35)) & 2674012280863751L) != 0)) {
				{
				setState(524);
				expression();
				setState(529);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(525);
					match(COMMA);
					setState(526);
					expression();
					}
					}
					setState(531);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(534);
			match(RPAREN);
			setState(535);
			match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class InterfaceDeclarationContext extends ParserRuleContext {
		public InterfaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceDeclaration; }
	 
		public InterfaceDeclarationContext() { }
		public void copyFrom(InterfaceDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InterfaceDefContext extends InterfaceDeclarationContext {
		public TerminalNode INTERFACE() { return getToken(HTMLParser.INTERFACE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(HTMLParser.IDENTIFIER, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public InterfaceDefContext(InterfaceDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterInterfaceDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitInterfaceDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitInterfaceDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceDeclarationContext interfaceDeclaration() throws RecognitionException {
		InterfaceDeclarationContext _localctx = new InterfaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_interfaceDeclaration);
		try {
			_localctx = new InterfaceDefContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(537);
			match(INTERFACE);
			setState(538);
			match(IDENTIFIER);
			setState(539);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ObjectInterfaceContext extends ParserRuleContext {
		public ObjectInterfaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectInterface; }
	 
		public ObjectInterfaceContext() { }
		public void copyFrom(ObjectInterfaceContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ObjectInterfaceInitContext extends ObjectInterfaceContext {
		public TerminalNode LET() { return getToken(HTMLParser.LET, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(HTMLParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(HTMLParser.IDENTIFIER, i);
		}
		public TerminalNode COLON() { return getToken(HTMLParser.COLON, 0); }
		public TerminalNode ASSIGN() { return getToken(HTMLParser.ASSIGN, 0); }
		public TerminalNode LBRACE() { return getToken(HTMLParser.LBRACE, 0); }
		public ObjectInterfaceBodyContext objectInterfaceBody() {
			return getRuleContext(ObjectInterfaceBodyContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(HTMLParser.RBRACE, 0); }
		public TerminalNode SEMICOLON() { return getToken(HTMLParser.SEMICOLON, 0); }
		public ObjectInterfaceInitContext(ObjectInterfaceContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterObjectInterfaceInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitObjectInterfaceInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitObjectInterfaceInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectInterfaceContext objectInterface() throws RecognitionException {
		ObjectInterfaceContext _localctx = new ObjectInterfaceContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_objectInterface);
		try {
			_localctx = new ObjectInterfaceInitContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(541);
			match(LET);
			setState(542);
			match(IDENTIFIER);
			setState(543);
			match(COLON);
			setState(544);
			match(IDENTIFIER);
			setState(545);
			match(ASSIGN);
			setState(546);
			match(LBRACE);
			setState(547);
			objectInterfaceBody();
			setState(548);
			match(RBRACE);
			setState(549);
			match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ObjectInterfaceBodyContext extends ParserRuleContext {
		public ObjectInterfaceBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectInterfaceBody; }
	 
		public ObjectInterfaceBodyContext() { }
		public void copyFrom(ObjectInterfaceBodyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ObjectInterfacePropsContext extends ObjectInterfaceBodyContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(HTMLParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(HTMLParser.IDENTIFIER, i);
		}
		public List<TerminalNode> COLON() { return getTokens(HTMLParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(HTMLParser.COLON, i);
		}
		public List<TerminalNode> VALUE() { return getTokens(HTMLParser.VALUE); }
		public TerminalNode VALUE(int i) {
			return getToken(HTMLParser.VALUE, i);
		}
		public List<TerminalNode> TRUE() { return getTokens(HTMLParser.TRUE); }
		public TerminalNode TRUE(int i) {
			return getToken(HTMLParser.TRUE, i);
		}
		public List<TerminalNode> FALSE() { return getTokens(HTMLParser.FALSE); }
		public TerminalNode FALSE(int i) {
			return getToken(HTMLParser.FALSE, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(HTMLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(HTMLParser.COMMA, i);
		}
		public ObjectInterfacePropsContext(ObjectInterfaceBodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterObjectInterfaceProps(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitObjectInterfaceProps(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitObjectInterfaceProps(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectInterfaceBodyContext objectInterfaceBody() throws RecognitionException {
		ObjectInterfaceBodyContext _localctx = new ObjectInterfaceBodyContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_objectInterfaceBody);
		int _la;
		try {
			_localctx = new ObjectInterfacePropsContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(551);
			match(IDENTIFIER);
			setState(552);
			match(COLON);
			setState(553);
			_la = _input.LA(1);
			if ( !(((((_la - 36)) & ~0x3f) == 0 && ((1L << (_la - 36)) & 140737488355331L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(560);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(554);
				match(COMMA);
				setState(555);
				match(IDENTIFIER);
				setState(556);
				match(COLON);
				setState(557);
				_la = _input.LA(1);
				if ( !(((((_la - 36)) & ~0x3f) == 0 && ((1L << (_la - 36)) & 140737488355331L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(562);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionDeclarationContext extends ParserRuleContext {
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
	 
		public FunctionDeclarationContext() { }
		public void copyFrom(FunctionDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionShorthandContext extends FunctionDeclarationContext {
		public TerminalNode IDENTIFIER() { return getToken(HTMLParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(HTMLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(HTMLParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public FunctionShorthandContext(FunctionDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterFunctionShorthand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitFunctionShorthand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitFunctionShorthand(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionFullContext extends FunctionDeclarationContext {
		public TerminalNode FUNCTION() { return getToken(HTMLParser.FUNCTION, 0); }
		public TerminalNode IDENTIFIER() { return getToken(HTMLParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(HTMLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(HTMLParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public TerminalNode COLON() { return getToken(HTMLParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public FunctionFullContext(FunctionDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterFunctionFull(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitFunctionFull(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitFunctionFull(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionArrowContext extends FunctionDeclarationContext {
		public TerminalNode IDENTIFIER() { return getToken(HTMLParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(HTMLParser.ASSIGN, 0); }
		public TerminalNode LPAREN() { return getToken(HTMLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(HTMLParser.RPAREN, 0); }
		public List<TerminalNode> ARROW() { return getTokens(HTMLParser.ARROW); }
		public TerminalNode ARROW(int i) {
			return getToken(HTMLParser.ARROW, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode FUNCTION() { return getToken(HTMLParser.FUNCTION, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(HTMLParser.SEMICOLON, 0); }
		public FunctionArrowContext(FunctionDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterFunctionArrow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitFunctionArrow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitFunctionArrow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_functionDeclaration);
		int _la;
		try {
			setState(606);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				_localctx = new FunctionFullContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(563);
				match(FUNCTION);
				setState(564);
				match(IDENTIFIER);
				setState(565);
				match(LPAREN);
				setState(567);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 35)) & ~0x3f) == 0 && ((1L << (_la - 35)) & 2533274792508417L) != 0)) {
					{
					setState(566);
					parameterList();
					}
				}

				setState(569);
				match(RPAREN);
				setState(572);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(570);
					match(COLON);
					setState(571);
					type();
					}
				}

				setState(574);
				block();
				}
				break;
			case 2:
				_localctx = new FunctionArrowContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(575);
				match(IDENTIFIER);
				setState(576);
				match(ASSIGN);
				setState(578);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FUNCTION) {
					{
					setState(577);
					match(FUNCTION);
					}
				}

				setState(580);
				match(LPAREN);
				setState(582);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 35)) & ~0x3f) == 0 && ((1L << (_la - 35)) & 2533274792508417L) != 0)) {
					{
					setState(581);
					parameterList();
					}
				}

				setState(584);
				match(RPAREN);
				setState(586);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
				case 1:
					{
					setState(585);
					match(ARROW);
					}
					break;
				}
				setState(589);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 28)) & ~0x3f) == 0 && ((1L << (_la - 28)) & 288230393331581055L) != 0)) {
					{
					setState(588);
					type();
					}
				}

				setState(594);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ARROW:
					{
					setState(591);
					match(ARROW);
					setState(592);
					expression();
					}
					break;
				case LBRACE:
					{
					setState(593);
					block();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(597);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(596);
					match(SEMICOLON);
					}
				}

				}
				break;
			case 3:
				_localctx = new FunctionShorthandContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(599);
				match(IDENTIFIER);
				setState(600);
				match(LPAREN);
				setState(602);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 35)) & ~0x3f) == 0 && ((1L << (_la - 35)) & 2533274792508417L) != 0)) {
					{
					setState(601);
					parameterList();
					}
				}

				setState(604);
				match(RPAREN);
				setState(605);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterListContext extends ParserRuleContext {
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
	 
		public ParameterListContext() { }
		public void copyFrom(ParameterListContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParamVarsContext extends ParameterListContext {
		public List<VariableDeclarationContext> variableDeclaration() {
			return getRuleContexts(VariableDeclarationContext.class);
		}
		public VariableDeclarationContext variableDeclaration(int i) {
			return getRuleContext(VariableDeclarationContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(HTMLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(HTMLParser.COMMA, i);
		}
		public ParamVarsContext(ParameterListContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterParamVars(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitParamVars(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitParamVars(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParamIdentifiersContext extends ParameterListContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(HTMLParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(HTMLParser.IDENTIFIER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(HTMLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(HTMLParser.COMMA, i);
		}
		public ParamIdentifiersContext(ParameterListContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterParamIdentifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitParamIdentifiers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitParamIdentifiers(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParamValuesContext extends ParameterListContext {
		public List<TerminalNode> VALUE() { return getTokens(HTMLParser.VALUE); }
		public TerminalNode VALUE(int i) {
			return getToken(HTMLParser.VALUE, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(HTMLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(HTMLParser.COMMA, i);
		}
		public ParamValuesContext(ParameterListContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterParamValues(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitParamValues(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitParamValues(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_parameterList);
		int _la;
		try {
			setState(632);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				_localctx = new ParamVarsContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(608);
				variableDeclaration();
				}
				setState(613);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(609);
					match(COMMA);
					setState(610);
					variableDeclaration();
					}
					}
					setState(615);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				_localctx = new ParamIdentifiersContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(616);
				match(IDENTIFIER);
				setState(621);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(617);
					match(COMMA);
					setState(618);
					match(IDENTIFIER);
					}
					}
					setState(623);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				_localctx = new ParamValuesContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(624);
				match(VALUE);
				setState(629);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(625);
					match(COMMA);
					setState(626);
					match(VALUE);
					}
					}
					setState(631);
					_errHandler.sync(this);
					_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CallFunctiosContext extends ParserRuleContext {
		public CallFunctiosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callFunctios; }
	 
		public CallFunctiosContext() { }
		public void copyFrom(CallFunctiosContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CallBacktickContext extends CallFunctiosContext {
		public TerminalNode IDENTIFIER() { return getToken(HTMLParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(HTMLParser.LPAREN, 0); }
		public List<TerminalNode> BACKTICK() { return getTokens(HTMLParser.BACKTICK); }
		public TerminalNode BACKTICK(int i) {
			return getToken(HTMLParser.BACKTICK, i);
		}
		public TerminalNode RPAREN() { return getToken(HTMLParser.RPAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(HTMLParser.SEMICOLON, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(HTMLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(HTMLParser.COMMA, i);
		}
		public CallBacktickContext(CallFunctiosContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterCallBacktick(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitCallBacktick(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitCallBacktick(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CallNormalContext extends CallFunctiosContext {
		public TerminalNode IDENTIFIER() { return getToken(HTMLParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(HTMLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(HTMLParser.RPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(HTMLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(HTMLParser.COMMA, i);
		}
		public CallNormalContext(CallFunctiosContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterCallNormal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitCallNormal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitCallNormal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallFunctiosContext callFunctios() throws RecognitionException {
		CallFunctiosContext _localctx = new CallFunctiosContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_callFunctios);
		int _la;
		try {
			setState(663);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				_localctx = new CallNormalContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(634);
				match(IDENTIFIER);
				setState(635);
				match(LPAREN);
				setState(644);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 35)) & ~0x3f) == 0 && ((1L << (_la - 35)) & 2674012280863751L) != 0)) {
					{
					setState(636);
					expression();
					setState(641);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(637);
						match(COMMA);
						setState(638);
						expression();
						}
						}
						setState(643);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(646);
				match(RPAREN);
				}
				break;
			case 2:
				_localctx = new CallBacktickContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(647);
				match(IDENTIFIER);
				setState(648);
				match(LPAREN);
				setState(649);
				match(BACKTICK);
				setState(658);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 35)) & ~0x3f) == 0 && ((1L << (_la - 35)) & 2674012280863751L) != 0)) {
					{
					setState(650);
					expression();
					setState(655);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(651);
						match(COMMA);
						setState(652);
						expression();
						}
						}
						setState(657);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(660);
				match(BACKTICK);
				setState(661);
				match(RPAREN);
				setState(662);
				match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConsolDeclarationContext extends ParserRuleContext {
		public ConsolDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_consolDeclaration; }
	 
		public ConsolDeclarationContext() { }
		public void copyFrom(ConsolDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ConsoleLogContext extends ConsolDeclarationContext {
		public TerminalNode CONSOL() { return getToken(HTMLParser.CONSOL, 0); }
		public TerminalNode DOT() { return getToken(HTMLParser.DOT, 0); }
		public TerminalNode LOG() { return getToken(HTMLParser.LOG, 0); }
		public TerminalNode LPAREN() { return getToken(HTMLParser.LPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(HTMLParser.RPAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(HTMLParser.SEMICOLON, 0); }
		public List<TerminalNode> COMMA() { return getTokens(HTMLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(HTMLParser.COMMA, i);
		}
		public ConsoleLogContext(ConsolDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterConsoleLog(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitConsoleLog(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitConsoleLog(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConsolDeclarationContext consolDeclaration() throws RecognitionException {
		ConsolDeclarationContext _localctx = new ConsolDeclarationContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_consolDeclaration);
		int _la;
		try {
			_localctx = new ConsoleLogContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(665);
			match(CONSOL);
			setState(666);
			match(DOT);
			setState(667);
			match(LOG);
			setState(668);
			match(LPAREN);
			setState(669);
			expression();
			setState(674);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(670);
				match(COMMA);
				setState(671);
				expression();
				}
				}
				setState(676);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(677);
			match(RPAREN);
			setState(678);
			match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnStatementContext extends ParserRuleContext {
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
	 
		public ReturnStatementContext() { }
		public void copyFrom(ReturnStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReturnExprContext extends ReturnStatementContext {
		public TerminalNode RETURN() { return getToken(HTMLParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(HTMLParser.SEMICOLON, 0); }
		public ReturnExprContext(ReturnStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterReturnExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitReturnExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitReturnExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_returnStatement);
		try {
			_localctx = new ReturnExprContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(680);
			match(RETURN);
			setState(681);
			expression();
			setState(682);
			match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ThrowStatementContext extends ParserRuleContext {
		public ThrowStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throwStatement; }
	 
		public ThrowStatementContext() { }
		public void copyFrom(ThrowStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ThrowErrorContext extends ThrowStatementContext {
		public TerminalNode THROW() { return getToken(HTMLParser.THROW, 0); }
		public TerminalNode NEW() { return getToken(HTMLParser.NEW, 0); }
		public TerminalNode IDENTIFIER() { return getToken(HTMLParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(HTMLParser.LPAREN, 0); }
		public TerminalNode STRING_CONTENT() { return getToken(HTMLParser.STRING_CONTENT, 0); }
		public TerminalNode RPAREN() { return getToken(HTMLParser.RPAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(HTMLParser.SEMICOLON, 0); }
		public ThrowErrorContext(ThrowStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterThrowError(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitThrowError(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitThrowError(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThrowStatementContext throwStatement() throws RecognitionException {
		ThrowStatementContext _localctx = new ThrowStatementContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_throwStatement);
		try {
			_localctx = new ThrowErrorContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(684);
			match(THROW);
			setState(685);
			match(NEW);
			setState(686);
			match(IDENTIFIER);
			setState(687);
			match(LPAREN);
			setState(688);
			match(STRING_CONTENT);
			setState(689);
			match(RPAREN);
			setState(690);
			match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionStatementContext extends ParserRuleContext {
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
	 
		public ExpressionStatementContext() { }
		public void copyFrom(ExpressionStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprStmtContext extends ExpressionStatementContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(HTMLParser.SEMICOLON, 0); }
		public ExprStmtContext(ExpressionStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterExprStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitExprStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitExprStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_expressionStatement);
		try {
			_localctx = new ExprStmtContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(692);
			expression();
			setState(693);
			match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprVarDeclContext extends ExpressionContext {
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public ExprVarDeclContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterExprVarDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitExprVarDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitExprVarDecl(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprCallContext extends ExpressionContext {
		public CallFunctiosContext callFunctios() {
			return getRuleContext(CallFunctiosContext.class,0);
		}
		public ExprCallContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterExprCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitExprCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitExprCall(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprIdentifierContext extends ExpressionContext {
		public TerminalNode IDENTIFIER() { return getToken(HTMLParser.IDENTIFIER, 0); }
		public ExprIdentifierContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterExprIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitExprIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitExprIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprStringContext extends ExpressionContext {
		public TerminalNode STRING_CONTENT() { return getToken(HTMLParser.STRING_CONTENT, 0); }
		public ExprStringContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterExprString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitExprString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitExprString(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprValueContext extends ExpressionContext {
		public TerminalNode VALUE() { return getToken(HTMLParser.VALUE, 0); }
		public ExprValueContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterExprValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitExprValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitExprValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprFalseContext extends ExpressionContext {
		public TerminalNode FALSE() { return getToken(HTMLParser.FALSE, 0); }
		public ExprFalseContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterExprFalse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitExprFalse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitExprFalse(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprTrueContext extends ExpressionContext {
		public TerminalNode TRUE() { return getToken(HTMLParser.TRUE, 0); }
		public ExprTrueContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterExprTrue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitExprTrue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitExprTrue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_expression);
		try {
			setState(702);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				_localctx = new ExprIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(695);
				match(IDENTIFIER);
				}
				break;
			case 2:
				_localctx = new ExprValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(696);
				match(VALUE);
				}
				break;
			case 3:
				_localctx = new ExprStringContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(697);
				match(STRING_CONTENT);
				}
				break;
			case 4:
				_localctx = new ExprTrueContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(698);
				match(TRUE);
				}
				break;
			case 5:
				_localctx = new ExprFalseContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(699);
				match(FALSE);
				}
				break;
			case 6:
				_localctx = new ExprCallContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(700);
				callFunctios();
				}
				break;
			case 7:
				_localctx = new ExprVarDeclContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(701);
				variableDeclaration();
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

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	 
		public BlockContext() { }
		public void copyFrom(BlockContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BlockStatementsContext extends BlockContext {
		public TerminalNode LBRACE() { return getToken(HTMLParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(HTMLParser.RBRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockStatementsContext(BlockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterBlockStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitBlockStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitBlockStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_block);
		int _la;
		try {
			_localctx = new BlockStatementsContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(704);
			match(LBRACE);
			setState(708);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 92292701200318464L) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & 312465L) != 0)) {
				{
				{
				setState(705);
				statement();
				}
				}
				setState(710);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(711);
			match(RBRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ThisStatementContext extends ParserRuleContext {
		public ThisStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thisStatement; }
	 
		public ThisStatementContext() { }
		public void copyFrom(ThisStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ThisAssignmentContext extends ThisStatementContext {
		public TerminalNode THIS() { return getToken(HTMLParser.THIS, 0); }
		public TerminalNode DOT() { return getToken(HTMLParser.DOT, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(HTMLParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(HTMLParser.IDENTIFIER, i);
		}
		public TerminalNode ASSIGN() { return getToken(HTMLParser.ASSIGN, 0); }
		public TerminalNode SEMICOLON() { return getToken(HTMLParser.SEMICOLON, 0); }
		public ThisAssignmentContext(ThisStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterThisAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitThisAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitThisAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThisStatementContext thisStatement() throws RecognitionException {
		ThisStatementContext _localctx = new ThisStatementContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_thisStatement);
		try {
			_localctx = new ThisAssignmentContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(713);
			match(THIS);
			setState(714);
			match(DOT);
			setState(715);
			match(IDENTIFIER);
			setState(716);
			match(ASSIGN);
			setState(717);
			match(IDENTIFIER);
			setState(718);
			match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class EmitStatementContext extends ParserRuleContext {
		public EmitStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emitStatement; }
	 
		public EmitStatementContext() { }
		public void copyFrom(EmitStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EmitCallContext extends EmitStatementContext {
		public TerminalNode THIS() { return getToken(HTMLParser.THIS, 0); }
		public List<TerminalNode> DOT() { return getTokens(HTMLParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(HTMLParser.DOT, i);
		}
		public TerminalNode IDENTIFIER() { return getToken(HTMLParser.IDENTIFIER, 0); }
		public TerminalNode EMIT() { return getToken(HTMLParser.EMIT, 0); }
		public TerminalNode LPAREN() { return getToken(HTMLParser.LPAREN, 0); }
		public ObjectLiteralContext objectLiteral() {
			return getRuleContext(ObjectLiteralContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(HTMLParser.RPAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(HTMLParser.SEMICOLON, 0); }
		public EmitCallContext(EmitStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterEmitCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitEmitCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitEmitCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EmitStatementContext emitStatement() throws RecognitionException {
		EmitStatementContext _localctx = new EmitStatementContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_emitStatement);
		int _la;
		try {
			_localctx = new EmitCallContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(720);
			match(THIS);
			setState(721);
			match(DOT);
			setState(722);
			match(IDENTIFIER);
			setState(723);
			match(DOT);
			setState(724);
			match(EMIT);
			setState(725);
			match(LPAREN);
			setState(726);
			objectLiteral();
			setState(727);
			match(RPAREN);
			setState(729);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(728);
				match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ObjectLiteralContext extends ParserRuleContext {
		public ObjectLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectLiteral; }
	 
		public ObjectLiteralContext() { }
		public void copyFrom(ObjectLiteralContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ObjectLiteralDefContext extends ObjectLiteralContext {
		public TerminalNode LBRACE() { return getToken(HTMLParser.LBRACE, 0); }
		public List<ObjectPropertyContext> objectProperty() {
			return getRuleContexts(ObjectPropertyContext.class);
		}
		public ObjectPropertyContext objectProperty(int i) {
			return getRuleContext(ObjectPropertyContext.class,i);
		}
		public TerminalNode RBRACE() { return getToken(HTMLParser.RBRACE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(HTMLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(HTMLParser.COMMA, i);
		}
		public ObjectLiteralDefContext(ObjectLiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterObjectLiteralDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitObjectLiteralDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitObjectLiteralDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectLiteralContext objectLiteral() throws RecognitionException {
		ObjectLiteralContext _localctx = new ObjectLiteralContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_objectLiteral);
		int _la;
		try {
			_localctx = new ObjectLiteralDefContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(731);
			match(LBRACE);
			setState(732);
			objectProperty();
			setState(737);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(733);
				match(COMMA);
				setState(734);
				objectProperty();
				}
				}
				setState(739);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(740);
			match(RBRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ObjectPropertyContext extends ParserRuleContext {
		public ObjectPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectProperty; }
	 
		public ObjectPropertyContext() { }
		public void copyFrom(ObjectPropertyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ObjectPropertyPairContext extends ObjectPropertyContext {
		public TerminalNode IDENTIFIER() { return getToken(HTMLParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(HTMLParser.COLON, 0); }
		public TerminalNode STRING_CONTENT() { return getToken(HTMLParser.STRING_CONTENT, 0); }
		public TerminalNode VALUE() { return getToken(HTMLParser.VALUE, 0); }
		public ObjectPropertyPairContext(ObjectPropertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterObjectPropertyPair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitObjectPropertyPair(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitObjectPropertyPair(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectPropertyContext objectProperty() throws RecognitionException {
		ObjectPropertyContext _localctx = new ObjectPropertyContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_objectProperty);
		int _la;
		try {
			_localctx = new ObjectPropertyPairContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(742);
			match(IDENTIFIER);
			setState(743);
			match(COLON);
			setState(744);
			_la = _input.LA(1);
			if ( !(_la==STRING_CONTENT || _la==VALUE) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayLiteralContext extends ParserRuleContext {
		public ArrayLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayLiteral; }
	 
		public ArrayLiteralContext() { }
		public void copyFrom(ArrayLiteralContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayOfMapsContext extends ArrayLiteralContext {
		public TerminalNode LBRACKET() { return getToken(HTMLParser.LBRACKET, 0); }
		public List<MapLiteralContext> mapLiteral() {
			return getRuleContexts(MapLiteralContext.class);
		}
		public MapLiteralContext mapLiteral(int i) {
			return getRuleContext(MapLiteralContext.class,i);
		}
		public TerminalNode RBRACKET() { return getToken(HTMLParser.RBRACKET, 0); }
		public List<TerminalNode> COMMA() { return getTokens(HTMLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(HTMLParser.COMMA, i);
		}
		public ArrayOfMapsContext(ArrayLiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterArrayOfMaps(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitArrayOfMaps(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitArrayOfMaps(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayValuesContext extends ArrayLiteralContext {
		public TerminalNode LBRACKET() { return getToken(HTMLParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(HTMLParser.RBRACKET, 0); }
		public List<TerminalNode> VALUE() { return getTokens(HTMLParser.VALUE); }
		public TerminalNode VALUE(int i) {
			return getToken(HTMLParser.VALUE, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(HTMLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(HTMLParser.COMMA, i);
		}
		public ArrayValuesContext(ArrayLiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterArrayValues(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitArrayValues(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitArrayValues(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayStringsContext extends ArrayLiteralContext {
		public TerminalNode LBRACKET() { return getToken(HTMLParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(HTMLParser.RBRACKET, 0); }
		public List<TerminalNode> STRING_CONTENT() { return getTokens(HTMLParser.STRING_CONTENT); }
		public TerminalNode STRING_CONTENT(int i) {
			return getToken(HTMLParser.STRING_CONTENT, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(HTMLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(HTMLParser.COMMA, i);
		}
		public ArrayStringsContext(ArrayLiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterArrayStrings(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitArrayStrings(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitArrayStrings(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayLiteralContext arrayLiteral() throws RecognitionException {
		ArrayLiteralContext _localctx = new ArrayLiteralContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_arrayLiteral);
		int _la;
		try {
			setState(784);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				_localctx = new ArrayValuesContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(746);
				match(LBRACKET);
				setState(755);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VALUE) {
					{
					setState(747);
					match(VALUE);
					setState(752);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(748);
						match(COMMA);
						setState(749);
						match(VALUE);
						}
						}
						setState(754);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(757);
				match(RBRACKET);
				}
				break;
			case 2:
				_localctx = new ArrayStringsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(758);
				match(LBRACKET);
				setState(767);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STRING_CONTENT) {
					{
					setState(759);
					match(STRING_CONTENT);
					setState(764);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(760);
						match(COMMA);
						setState(761);
						match(STRING_CONTENT);
						}
						}
						setState(766);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(769);
				match(RBRACKET);
				}
				break;
			case 3:
				_localctx = new ArrayOfMapsContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(770);
				match(LBRACKET);
				setState(771);
				mapLiteral();
				setState(779);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(772);
					match(COMMA);
					setState(773);
					mapLiteral();
					setState(775);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
					case 1:
						{
						setState(774);
						match(COMMA);
						}
						break;
					}
					}
					}
					setState(781);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(782);
				match(RBRACKET);
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

	@SuppressWarnings("CheckReturnValue")
	public static class MapLiteralContext extends ParserRuleContext {
		public MapLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapLiteral; }
	 
		public MapLiteralContext() { }
		public void copyFrom(MapLiteralContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MapliteralContext extends MapLiteralContext {
		public TerminalNode LBRACE() { return getToken(HTMLParser.LBRACE, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(HTMLParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(HTMLParser.IDENTIFIER, i);
		}
		public List<TerminalNode> COLON() { return getTokens(HTMLParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(HTMLParser.COLON, i);
		}
		public TerminalNode RBRACE() { return getToken(HTMLParser.RBRACE, 0); }
		public List<TerminalNode> VALUE() { return getTokens(HTMLParser.VALUE); }
		public TerminalNode VALUE(int i) {
			return getToken(HTMLParser.VALUE, i);
		}
		public List<TerminalNode> STRING_CONTENT() { return getTokens(HTMLParser.STRING_CONTENT); }
		public TerminalNode STRING_CONTENT(int i) {
			return getToken(HTMLParser.STRING_CONTENT, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(HTMLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(HTMLParser.COMMA, i);
		}
		public MapliteralContext(MapLiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterMapliteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitMapliteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitMapliteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MapLiteralContext mapLiteral() throws RecognitionException {
		MapLiteralContext _localctx = new MapLiteralContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_mapLiteral);
		int _la;
		try {
			_localctx = new MapliteralContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(786);
			match(LBRACE);
			setState(787);
			match(IDENTIFIER);
			setState(788);
			match(COLON);
			setState(789);
			_la = _input.LA(1);
			if ( !(_la==STRING_CONTENT || _la==VALUE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(796);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(790);
				match(COMMA);
				setState(791);
				match(IDENTIFIER);
				setState(792);
				match(COLON);
				setState(793);
				_la = _input.LA(1);
				if ( !(_la==STRING_CONTENT || _la==VALUE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(798);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(799);
			match(RBRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TupleLiteralContext extends ParserRuleContext {
		public TupleLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tupleLiteral; }
	 
		public TupleLiteralContext() { }
		public void copyFrom(TupleLiteralContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TupleliteralContext extends TupleLiteralContext {
		public TerminalNode LBRACKET() { return getToken(HTMLParser.LBRACKET, 0); }
		public List<TerminalNode> VALUE() { return getTokens(HTMLParser.VALUE); }
		public TerminalNode VALUE(int i) {
			return getToken(HTMLParser.VALUE, i);
		}
		public TerminalNode RBRACKET() { return getToken(HTMLParser.RBRACKET, 0); }
		public List<TerminalNode> COMMA() { return getTokens(HTMLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(HTMLParser.COMMA, i);
		}
		public TupleliteralContext(TupleLiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterTupleliteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitTupleliteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitTupleliteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TupleLiteralContext tupleLiteral() throws RecognitionException {
		TupleLiteralContext _localctx = new TupleLiteralContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_tupleLiteral);
		int _la;
		try {
			_localctx = new TupleliteralContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(801);
			match(LBRACKET);
			setState(802);
			match(VALUE);
			setState(807);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(803);
				match(COMMA);
				setState(804);
				match(VALUE);
				}
				}
				setState(809);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(810);
			match(RBRACKET);
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

	@SuppressWarnings("CheckReturnValue")
	public static class NgDirectiveContext extends ParserRuleContext {
		public NgDirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ngDirective; }
	 
		public NgDirectiveContext() { }
		public void copyFrom(NgDirectiveContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NgForDirectiveContext extends NgDirectiveContext {
		public TerminalNode NG_FOR() { return getToken(HTMLParser.NG_FOR, 0); }
		public TerminalNode ASSIGN() { return getToken(HTMLParser.ASSIGN, 0); }
		public TerminalNode STRING_CONTENT() { return getToken(HTMLParser.STRING_CONTENT, 0); }
		public NgForDirectiveContext(NgDirectiveContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterNgForDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitNgForDirective(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitNgForDirective(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NgIfDirectiveContext extends NgDirectiveContext {
		public TerminalNode NG_IF() { return getToken(HTMLParser.NG_IF, 0); }
		public TerminalNode ASSIGN() { return getToken(HTMLParser.ASSIGN, 0); }
		public TerminalNode STRING_CONTENT() { return getToken(HTMLParser.STRING_CONTENT, 0); }
		public NgIfDirectiveContext(NgDirectiveContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterNgIfDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitNgIfDirective(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitNgIfDirective(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NgDirectiveContext ngDirective() throws RecognitionException {
		NgDirectiveContext _localctx = new NgDirectiveContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_ngDirective);
		try {
			setState(818);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NG_FOR:
				_localctx = new NgForDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(812);
				match(NG_FOR);
				setState(813);
				match(ASSIGN);
				setState(814);
				match(STRING_CONTENT);
				}
				break;
			case NG_IF:
				_localctx = new NgIfDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(815);
				match(NG_IF);
				setState(816);
				match(ASSIGN);
				setState(817);
				match(STRING_CONTENT);
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

	@SuppressWarnings("CheckReturnValue")
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
	@SuppressWarnings("CheckReturnValue")
	public static class TypeBooleanContext extends TypeContext {
		public TerminalNode BOOLEAN() { return getToken(HTMLParser.BOOLEAN, 0); }
		public TypeBooleanContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterTypeBoolean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitTypeBoolean(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitTypeBoolean(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeTupleContext extends TypeContext {
		public TerminalNode LBRACKET() { return getToken(HTMLParser.LBRACKET, 0); }
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public TerminalNode RBRACKET() { return getToken(HTMLParser.RBRACKET, 0); }
		public List<TerminalNode> COMMA() { return getTokens(HTMLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(HTMLParser.COMMA, i);
		}
		public TypeTupleContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterTypeTuple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitTypeTuple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitTypeTuple(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeVoidContext extends TypeContext {
		public TerminalNode VOID() { return getToken(HTMLParser.VOID, 0); }
		public TypeVoidContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterTypeVoid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitTypeVoid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitTypeVoid(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeEnumContext extends TypeContext {
		public TerminalNode ENUM() { return getToken(HTMLParser.ENUM, 0); }
		public TypeEnumContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterTypeEnum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitTypeEnum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitTypeEnum(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeNumberContext extends TypeContext {
		public TerminalNode NUMBER() { return getToken(HTMLParser.NUMBER, 0); }
		public TypeNumberContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterTypeNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitTypeNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitTypeNumber(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeGenericArrayContext extends TypeContext {
		public TerminalNode ARRAY() { return getToken(HTMLParser.ARRAY, 0); }
		public TerminalNode OPEN_TAG() { return getToken(HTMLParser.OPEN_TAG, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode CLOUSE_TAG() { return getToken(HTMLParser.CLOUSE_TAG, 0); }
		public TypeGenericArrayContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterTypeGenericArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitTypeGenericArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitTypeGenericArray(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeAnyContext extends TypeContext {
		public TerminalNode ANY() { return getToken(HTMLParser.ANY, 0); }
		public TerminalNode LBRACKET() { return getToken(HTMLParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(HTMLParser.RBRACKET, 0); }
		public TypeAnyContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterTypeAny(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitTypeAny(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitTypeAny(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeCustomContext extends TypeContext {
		public TerminalNode IDENTIFIER() { return getToken(HTMLParser.IDENTIFIER, 0); }
		public TypeCustomContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterTypeCustom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitTypeCustom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitTypeCustom(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeNumberArrayContext extends TypeContext {
		public TerminalNode NUMBER() { return getToken(HTMLParser.NUMBER, 0); }
		public TerminalNode LBRACKET() { return getToken(HTMLParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(HTMLParser.RBRACKET, 0); }
		public TypeNumberArrayContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterTypeNumberArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitTypeNumberArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitTypeNumberArray(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeStringContext extends TypeContext {
		public TerminalNode STRING() { return getToken(HTMLParser.STRING, 0); }
		public TypeStringContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterTypeString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitTypeString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitTypeString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_type);
		int _la;
		try {
			setState(850);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
			case 1:
				_localctx = new TypeNumberContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(820);
				match(NUMBER);
				}
				break;
			case 2:
				_localctx = new TypeNumberArrayContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(821);
				match(NUMBER);
				setState(822);
				match(LBRACKET);
				setState(823);
				match(RBRACKET);
				}
				break;
			case 3:
				_localctx = new TypeStringContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(824);
				match(STRING);
				}
				break;
			case 4:
				_localctx = new TypeBooleanContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(825);
				match(BOOLEAN);
				}
				break;
			case 5:
				_localctx = new TypeGenericArrayContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(826);
				match(ARRAY);
				setState(827);
				match(OPEN_TAG);
				setState(828);
				type();
				setState(829);
				match(CLOUSE_TAG);
				}
				break;
			case 6:
				_localctx = new TypeTupleContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(831);
				match(LBRACKET);
				setState(832);
				type();
				setState(837);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(833);
					match(COMMA);
					setState(834);
					type();
					}
					}
					setState(839);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(840);
				match(RBRACKET);
				}
				break;
			case 7:
				_localctx = new TypeEnumContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(842);
				match(ENUM);
				}
				break;
			case 8:
				_localctx = new TypeAnyContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(843);
				match(ANY);
				setState(846);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
				case 1:
					{
					setState(844);
					match(LBRACKET);
					setState(845);
					match(RBRACKET);
					}
					break;
				}
				}
				break;
			case 9:
				_localctx = new TypeVoidContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(848);
				match(VOID);
				}
				break;
			case 10:
				_localctx = new TypeCustomContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(849);
				match(IDENTIFIER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends ParserRuleContext {
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	 
		public AssignmentContext() { }
		public void copyFrom(AssignmentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignExpressionContext extends AssignmentContext {
		public TerminalNode ASSIGN() { return getToken(HTMLParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(HTMLParser.SEMICOLON, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(HTMLParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(HTMLParser.IDENTIFIER, i);
		}
		public AssignExpressionContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterAssignExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitAssignExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitAssignExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignAnyTypeContext extends AssignmentContext {
		public TerminalNode ASSIGN() { return getToken(HTMLParser.ASSIGN, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(HTMLParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(HTMLParser.IDENTIFIER, i);
		}
		public List<Any_typeContext> any_type() {
			return getRuleContexts(Any_typeContext.class);
		}
		public Any_typeContext any_type(int i) {
			return getRuleContext(Any_typeContext.class,i);
		}
		public AssignAnyTypeContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterAssignAnyType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitAssignAnyType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitAssignAnyType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_assignment);
		int _la;
		try {
			int _alt;
			setState(875);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
			case 1:
				_localctx = new AssignExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(855);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENTIFIER) {
					{
					{
					setState(852);
					match(IDENTIFIER);
					}
					}
					setState(857);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(858);
				match(ASSIGN);
				setState(859);
				expression();
				setState(860);
				match(SEMICOLON);
				}
				break;
			case 2:
				_localctx = new AssignAnyTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(865);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENTIFIER) {
					{
					{
					setState(862);
					match(IDENTIFIER);
					}
					}
					setState(867);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(868);
				match(ASSIGN);
				setState(872);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,100,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(869);
						any_type();
						}
						} 
					}
					setState(874);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,100,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Any_typeContext extends ParserRuleContext {
		public TerminalNode VALUE() { return getToken(HTMLParser.VALUE, 0); }
		public TerminalNode COLOR_CODE() { return getToken(HTMLParser.COLOR_CODE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(HTMLParser.IDENTIFIER, 0); }
		public TerminalNode NUMBER() { return getToken(HTMLParser.NUMBER, 0); }
		public TerminalNode STRING() { return getToken(HTMLParser.STRING, 0); }
		public TerminalNode ANY() { return getToken(HTMLParser.ANY, 0); }
		public TerminalNode LBRACKET() { return getToken(HTMLParser.LBRACKET, 0); }
		public List<ProductContext> product() {
			return getRuleContexts(ProductContext.class);
		}
		public ProductContext product(int i) {
			return getRuleContext(ProductContext.class,i);
		}
		public TerminalNode RBRACKET() { return getToken(HTMLParser.RBRACKET, 0); }
		public List<TerminalNode> COMMA() { return getTokens(HTMLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(HTMLParser.COMMA, i);
		}
		public Any_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_any_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterAny_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitAny_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitAny_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Any_typeContext any_type() throws RecognitionException {
		Any_typeContext _localctx = new Any_typeContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_any_type);
		int _la;
		try {
			setState(899);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VALUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(877);
				match(VALUE);
				}
				break;
			case COLOR_CODE:
				enterOuterAlt(_localctx, 2);
				{
				setState(878);
				match(COLOR_CODE);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 3);
				{
				setState(879);
				match(IDENTIFIER);
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 4);
				{
				setState(880);
				match(NUMBER);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 5);
				{
				setState(881);
				match(STRING);
				}
				break;
			case ANY:
				enterOuterAlt(_localctx, 6);
				{
				setState(882);
				match(ANY);
				}
				break;
			case LBRACKET:
				enterOuterAlt(_localctx, 7);
				{
				setState(883);
				match(LBRACKET);
				setState(884);
				product();
				setState(894);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(885);
					match(COMMA);
					setState(889);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==LBRACE) {
						{
						{
						setState(886);
						product();
						}
						}
						setState(891);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(896);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(897);
				match(RBRACKET);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ProductContext extends ParserRuleContext {
		public ProductContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_product; }
	 
		public ProductContext() { }
		public void copyFrom(ProductContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ProductTypeContext extends ProductContext {
		public TerminalNode LBRACE() { return getToken(HTMLParser.LBRACE, 0); }
		public List<TerminalNode> COLON() { return getTokens(HTMLParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(HTMLParser.COLON, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(HTMLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(HTMLParser.COMMA, i);
		}
		public List<TerminalNode> STRING() { return getTokens(HTMLParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(HTMLParser.STRING, i);
		}
		public TerminalNode RBRACE() { return getToken(HTMLParser.RBRACE, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(HTMLParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(HTMLParser.IDENTIFIER, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(HTMLParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(HTMLParser.NUMBER, i);
		}
		public ProductTypeContext(ProductContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterProductType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitProductType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitProductType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProductContext product() throws RecognitionException {
		ProductContext _localctx = new ProductContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_product);
		int _la;
		try {
			_localctx = new ProductTypeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(901);
			match(LBRACE);
			setState(905);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(902);
				match(IDENTIFIER);
				}
				}
				setState(907);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(908);
			match(COLON);
			setState(912);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NUMBER) {
				{
				{
				setState(909);
				match(NUMBER);
				}
				}
				setState(914);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(915);
			match(COMMA);
			setState(919);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(916);
				match(IDENTIFIER);
				}
				}
				setState(921);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(922);
			match(COLON);
			setState(923);
			match(STRING);
			setState(924);
			match(COMMA);
			setState(928);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(925);
				match(IDENTIFIER);
				}
				}
				setState(930);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(931);
			match(COLON);
			setState(932);
			match(STRING);
			setState(933);
			match(RBRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ObjectCreationContext extends ParserRuleContext {
		public ObjectCreationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectCreation; }
	 
		public ObjectCreationContext() { }
		public void copyFrom(ObjectCreationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ObjectNewContext extends ObjectCreationContext {
		public TerminalNode LET() { return getToken(HTMLParser.LET, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(HTMLParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(HTMLParser.IDENTIFIER, i);
		}
		public TerminalNode ASSIGN() { return getToken(HTMLParser.ASSIGN, 0); }
		public TerminalNode NEW() { return getToken(HTMLParser.NEW, 0); }
		public TerminalNode LPAREN() { return getToken(HTMLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(HTMLParser.RPAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(HTMLParser.SEMICOLON, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(HTMLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(HTMLParser.COMMA, i);
		}
		public ObjectNewContext(ObjectCreationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterObjectNew(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitObjectNew(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitObjectNew(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectCreationContext objectCreation() throws RecognitionException {
		ObjectCreationContext _localctx = new ObjectCreationContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_objectCreation);
		int _la;
		try {
			_localctx = new ObjectNewContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(935);
			match(LET);
			setState(936);
			match(IDENTIFIER);
			setState(937);
			match(ASSIGN);
			setState(938);
			match(NEW);
			setState(939);
			match(IDENTIFIER);
			setState(940);
			match(LPAREN);
			setState(949);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 35)) & ~0x3f) == 0 && ((1L << (_la - 35)) & 2674012280863751L) != 0)) {
				{
				setState(941);
				expression();
				setState(946);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(942);
					match(COMMA);
					setState(943);
					expression();
					}
					}
					setState(948);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(951);
			match(RPAREN);
			setState(952);
			match(SEMICOLON);
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
		"\u0004\u0001[\u03bb\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u0001\u0000\u0004\u0000"+
		"d\b\u0000\u000b\u0000\f\u0000e\u0003\u0000h\b\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u0081\b\u0001\u0001"+
		"\u0002\u0001\u0002\u0003\u0002\u0085\b\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0005\u0003\u008c\b\u0003\n\u0003\f\u0003"+
		"\u008f\t\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0003\u0004\u0098\b\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u00a0\b\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u00a6\b\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u00ac\b\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004"+
		"\u00b3\b\u0004\n\u0004\f\u0004\u00b6\t\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0003\u0004\u00bb\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0003\u0004\u00c2\b\u0004\u0005\u0004\u00c4\b\u0004"+
		"\n\u0004\f\u0004\u00c7\t\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u00cb"+
		"\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u00d1"+
		"\b\u0004\u0003\u0004\u00d3\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0005\u0006\u00e1\b\u0006\n\u0006"+
		"\f\u0006\u00e4\t\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00e8\b\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u00ee\b\u0007"+
		"\n\u0007\f\u0007\u00f1\t\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u00f9\b\u0007\n\u0007\f\u0007"+
		"\u00fc\t\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0005\u0007\u0103\b\u0007\n\u0007\f\u0007\u0106\t\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0005\u0007\u010b\b\u0007\n\u0007\f\u0007\u010e\t\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0113\b\u0007\u0001\b"+
		"\u0001\b\u0001\b\u0005\b\u0118\b\b\n\b\f\b\u011b\t\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0003\b\u0121\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0005\t\u012a\b\t\n\t\f\t\u012d\t\t\u0001\t\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0003\t\u013c\b\t\u0001\n\u0001\n\u0005\n\u0140\b\n\n\n\f\n"+
		"\u0143\t\n\u0001\n\u0001\n\u0004\n\u0147\b\n\u000b\n\f\n\u0148\u0003\n"+
		"\u014b\b\n\u0001\u000b\u0001\u000b\u0003\u000b\u014f\b\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u0155\b\u000b\n\u000b"+
		"\f\u000b\u0158\t\u000b\u0001\u000b\u0003\u000b\u015b\b\u000b\u0001\u000b"+
		"\u0001\u000b\u0003\u000b\u015f\b\u000b\u0003\u000b\u0161\b\u000b\u0001"+
		"\u000b\u0003\u000b\u0164\b\u000b\u0005\u000b\u0166\b\u000b\n\u000b\f\u000b"+
		"\u0169\t\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0003\u000b\u0176\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0003\u000b\u017c\b\u000b\u0001\u000b\u0005\u000b\u017f\b\u000b\n\u000b"+
		"\f\u000b\u0182\t\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u0186\b\u000b"+
		"\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u018f"+
		"\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0003\u000f\u019e\b\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0003\u000f\u01a3\b\u000f\u0001\u0010\u0003\u0010\u01a6\b\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u01ab\b\u0010\u0001\u0010"+
		"\u0003\u0010\u01ae\b\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u01b8\b\u0010"+
		"\u0003\u0010\u01ba\b\u0010\u0001\u0010\u0003\u0010\u01bd\b\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0003\u0010\u01cd\b\u0010\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u01e7\b\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0005\u0014\u01f6\b\u0014\n\u0014\f\u0014\u01f9\t\u0014\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0003\u0016\u0203\b\u0016\u0001\u0016\u0001\u0016\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0005\u0017\u0210\b\u0017\n\u0017\f\u0017\u0213"+
		"\t\u0017\u0003\u0017\u0215\b\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0005\u001a\u022f\b\u001a\n\u001a"+
		"\f\u001a\u0232\t\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0003\u001b\u0238\b\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b"+
		"\u023d\b\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b"+
		"\u0243\b\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u0247\b\u001b\u0001"+
		"\u001b\u0001\u001b\u0003\u001b\u024b\b\u001b\u0001\u001b\u0003\u001b\u024e"+
		"\b\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u0253\b\u001b"+
		"\u0001\u001b\u0003\u001b\u0256\b\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0003\u001b\u025b\b\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u025f\b"+
		"\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0005\u001c\u0264\b\u001c\n"+
		"\u001c\f\u001c\u0267\t\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0005"+
		"\u001c\u026c\b\u001c\n\u001c\f\u001c\u026f\t\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0005\u001c\u0274\b\u001c\n\u001c\f\u001c\u0277\t\u001c\u0003"+
		"\u001c\u0279\b\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0005\u001d\u0280\b\u001d\n\u001d\f\u001d\u0283\t\u001d\u0003\u001d"+
		"\u0285\b\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0005\u001d\u028e\b\u001d\n\u001d\f\u001d\u0291"+
		"\t\u001d\u0003\u001d\u0293\b\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0003\u001d\u0298\b\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0005\u001e\u02a1\b\u001e\n\u001e"+
		"\f\u001e\u02a4\t\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001!\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0003\"\u02bf\b\"\u0001#\u0001#\u0005#\u02c3"+
		"\b#\n#\f#\u02c6\t#\u0001#\u0001#\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001"+
		"%\u0003%\u02da\b%\u0001&\u0001&\u0001&\u0001&\u0005&\u02e0\b&\n&\f&\u02e3"+
		"\t&\u0001&\u0001&\u0001\'\u0001\'\u0001\'\u0001\'\u0001(\u0001(\u0001"+
		"(\u0001(\u0005(\u02ef\b(\n(\f(\u02f2\t(\u0003(\u02f4\b(\u0001(\u0001("+
		"\u0001(\u0001(\u0001(\u0005(\u02fb\b(\n(\f(\u02fe\t(\u0003(\u0300\b(\u0001"+
		"(\u0001(\u0001(\u0001(\u0001(\u0001(\u0003(\u0308\b(\u0005(\u030a\b(\n"+
		"(\f(\u030d\t(\u0001(\u0001(\u0003(\u0311\b(\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0001)\u0005)\u031b\b)\n)\f)\u031e\t)\u0001)\u0001"+
		")\u0001*\u0001*\u0001*\u0001*\u0005*\u0326\b*\n*\f*\u0329\t*\u0001*\u0001"+
		"*\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0003+\u0333\b+\u0001,\u0001"+
		",\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001"+
		",\u0001,\u0001,\u0001,\u0005,\u0344\b,\n,\f,\u0347\t,\u0001,\u0001,\u0001"+
		",\u0001,\u0001,\u0001,\u0003,\u034f\b,\u0001,\u0001,\u0003,\u0353\b,\u0001"+
		"-\u0005-\u0356\b-\n-\f-\u0359\t-\u0001-\u0001-\u0001-\u0001-\u0001-\u0005"+
		"-\u0360\b-\n-\f-\u0363\t-\u0001-\u0001-\u0005-\u0367\b-\n-\f-\u036a\t"+
		"-\u0003-\u036c\b-\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001"+
		".\u0001.\u0001.\u0005.\u0378\b.\n.\f.\u037b\t.\u0005.\u037d\b.\n.\f.\u0380"+
		"\t.\u0001.\u0001.\u0003.\u0384\b.\u0001/\u0001/\u0005/\u0388\b/\n/\f/"+
		"\u038b\t/\u0001/\u0001/\u0005/\u038f\b/\n/\f/\u0392\t/\u0001/\u0001/\u0005"+
		"/\u0396\b/\n/\f/\u0399\t/\u0001/\u0001/\u0001/\u0001/\u0005/\u039f\b/"+
		"\n/\f/\u03a2\t/\u0001/\u0001/\u0001/\u0001/\u00010\u00010\u00010\u0001"+
		"0\u00010\u00010\u00010\u00010\u00010\u00050\u03b1\b0\n0\f0\u03b4\t0\u0003"+
		"0\u03b6\b0\u00010\u00010\u00010\u00010\u0001\u012b\u00001\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`\u0000\n\u0001\u0000$%\u0002\u0000"+
		"99;;\u0002\u0000\u001a\u001aVV\u0004\u0000\u0006\u0006\u0017\u0017&&V"+
		"V\u0003\u0000\b\b\u000f\u000fVV\u0004\u0000\u0019\u001a  ((00\u0002\u0000"+
		"##-0\u0001\u0000<=\u0002\u0000$%SS\u0001\u0000RS\u0435\u0000g\u0001\u0000"+
		"\u0000\u0000\u0002\u0080\u0001\u0000\u0000\u0000\u0004\u0084\u0001\u0000"+
		"\u0000\u0000\u0006\u0086\u0001\u0000\u0000\u0000\b\u00d2\u0001\u0000\u0000"+
		"\u0000\n\u00d4\u0001\u0000\u0000\u0000\f\u00e7\u0001\u0000\u0000\u0000"+
		"\u000e\u0112\u0001\u0000\u0000\u0000\u0010\u0120\u0001\u0000\u0000\u0000"+
		"\u0012\u013b\u0001\u0000\u0000\u0000\u0014\u014a\u0001\u0000\u0000\u0000"+
		"\u0016\u0185\u0001\u0000\u0000\u0000\u0018\u0187\u0001\u0000\u0000\u0000"+
		"\u001a\u018e\u0001\u0000\u0000\u0000\u001c\u0190\u0001\u0000\u0000\u0000"+
		"\u001e\u01a2\u0001\u0000\u0000\u0000 \u01cc\u0001\u0000\u0000\u0000\""+
		"\u01ce\u0001\u0000\u0000\u0000$\u01dd\u0001\u0000\u0000\u0000&\u01ec\u0001"+
		"\u0000\u0000\u0000(\u01f2\u0001\u0000\u0000\u0000*\u01fa\u0001\u0000\u0000"+
		"\u0000,\u01fe\u0001\u0000\u0000\u0000.\u0206\u0001\u0000\u0000\u00000"+
		"\u0219\u0001\u0000\u0000\u00002\u021d\u0001\u0000\u0000\u00004\u0227\u0001"+
		"\u0000\u0000\u00006\u025e\u0001\u0000\u0000\u00008\u0278\u0001\u0000\u0000"+
		"\u0000:\u0297\u0001\u0000\u0000\u0000<\u0299\u0001\u0000\u0000\u0000>"+
		"\u02a8\u0001\u0000\u0000\u0000@\u02ac\u0001\u0000\u0000\u0000B\u02b4\u0001"+
		"\u0000\u0000\u0000D\u02be\u0001\u0000\u0000\u0000F\u02c0\u0001\u0000\u0000"+
		"\u0000H\u02c9\u0001\u0000\u0000\u0000J\u02d0\u0001\u0000\u0000\u0000L"+
		"\u02db\u0001\u0000\u0000\u0000N\u02e6\u0001\u0000\u0000\u0000P\u0310\u0001"+
		"\u0000\u0000\u0000R\u0312\u0001\u0000\u0000\u0000T\u0321\u0001\u0000\u0000"+
		"\u0000V\u0332\u0001\u0000\u0000\u0000X\u0352\u0001\u0000\u0000\u0000Z"+
		"\u036b\u0001\u0000\u0000\u0000\\\u0383\u0001\u0000\u0000\u0000^\u0385"+
		"\u0001\u0000\u0000\u0000`\u03a7\u0001\u0000\u0000\u0000bd\u0003\u0002"+
		"\u0001\u0000cb\u0001\u0000\u0000\u0000de\u0001\u0000\u0000\u0000ec\u0001"+
		"\u0000\u0000\u0000ef\u0001\u0000\u0000\u0000fh\u0001\u0000\u0000\u0000"+
		"gc\u0001\u0000\u0000\u0000gh\u0001\u0000\u0000\u0000hi\u0001\u0000\u0000"+
		"\u0000ij\u0005\u0000\u0000\u0001j\u0001\u0001\u0000\u0000\u0000k\u0081"+
		"\u0003\u0004\u0002\u0000l\u0081\u0003\f\u0006\u0000m\u0081\u0003\u0014"+
		"\n\u0000n\u0081\u0003 \u0010\u0000o\u0081\u0003\u001c\u000e\u0000p\u0081"+
		"\u0003\u001e\u000f\u0000q\u0081\u00036\u001b\u0000r\u0081\u0003,\u0016"+
		"\u0000s\u0081\u00030\u0018\u0000t\u0081\u0003`0\u0000u\u0081\u0003&\u0013"+
		"\u0000v\u0081\u0003<\u001e\u0000w\u0081\u0003B!\u0000x\u0081\u0003>\u001f"+
		"\u0000y\u0081\u0003@ \u0000z\u0081\u0003.\u0017\u0000{\u0081\u00032\u0019"+
		"\u0000|\u0081\u0003:\u001d\u0000}\u0081\u0003Z-\u0000~\u0081\u0003J%\u0000"+
		"\u007f\u0081\u0003H$\u0000\u0080k\u0001\u0000\u0000\u0000\u0080l\u0001"+
		"\u0000\u0000\u0000\u0080m\u0001\u0000\u0000\u0000\u0080n\u0001\u0000\u0000"+
		"\u0000\u0080o\u0001\u0000\u0000\u0000\u0080p\u0001\u0000\u0000\u0000\u0080"+
		"q\u0001\u0000\u0000\u0000\u0080r\u0001\u0000\u0000\u0000\u0080s\u0001"+
		"\u0000\u0000\u0000\u0080t\u0001\u0000\u0000\u0000\u0080u\u0001\u0000\u0000"+
		"\u0000\u0080v\u0001\u0000\u0000\u0000\u0080w\u0001\u0000\u0000\u0000\u0080"+
		"x\u0001\u0000\u0000\u0000\u0080y\u0001\u0000\u0000\u0000\u0080z\u0001"+
		"\u0000\u0000\u0000\u0080{\u0001\u0000\u0000\u0000\u0080|\u0001\u0000\u0000"+
		"\u0000\u0080}\u0001\u0000\u0000\u0000\u0080~\u0001\u0000\u0000\u0000\u0080"+
		"\u007f\u0001\u0000\u0000\u0000\u0081\u0003\u0001\u0000\u0000\u0000\u0082"+
		"\u0085\u0003\n\u0005\u0000\u0083\u0085\u0003\u0006\u0003\u0000\u0084\u0082"+
		"\u0001\u0000\u0000\u0000\u0084\u0083\u0001\u0000\u0000\u0000\u0085\u0005"+
		"\u0001\u0000\u0000\u0000\u0086\u0087\u00058\u0000\u0000\u0087\u0088\u0005"+
		"\b\u0000\u0000\u0088\u0089\u0005B\u0000\u0000\u0089\u008d\u0005@\u0000"+
		"\u0000\u008a\u008c\u0003\b\u0004\u0000\u008b\u008a\u0001\u0000\u0000\u0000"+
		"\u008c\u008f\u0001\u0000\u0000\u0000\u008d\u008b\u0001\u0000\u0000\u0000"+
		"\u008d\u008e\u0001\u0000\u0000\u0000\u008e\u0090\u0001\u0000\u0000\u0000"+
		"\u008f\u008d\u0001\u0000\u0000\u0000\u0090\u0091\u0005A\u0000\u0000\u0091"+
		"\u0092\u0005C\u0000\u0000\u0092\u0007\u0001\u0000\u0000\u0000\u0093\u0094"+
		"\u0005\t\u0000\u0000\u0094\u0095\u0005;\u0000\u0000\u0095\u0097\u0005"+
		"R\u0000\u0000\u0096\u0098\u0005=\u0000\u0000\u0097\u0096\u0001\u0000\u0000"+
		"\u0000\u0097\u0098\u0001\u0000\u0000\u0000\u0098\u00d3\u0001\u0000\u0000"+
		"\u0000\u0099\u009a\u0005\u000b\u0000\u0000\u009a\u009b\u0005;\u0000\u0000"+
		"\u009b\u009c\u0005F\u0000\u0000\u009c\u009d\u0003\f\u0006\u0000\u009d"+
		"\u009f\u0005F\u0000\u0000\u009e\u00a0\u0005=\u0000\u0000\u009f\u009e\u0001"+
		"\u0000\u0000\u0000\u009f\u00a0\u0001\u0000\u0000\u0000\u00a0\u00d3\u0001"+
		"\u0000\u0000\u0000\u00a1\u00a2\u0005\n\u0000\u0000\u00a2\u00a3\u0005;"+
		"\u0000\u0000\u00a3\u00a5\u0005R\u0000\u0000\u00a4\u00a6\u0005=\u0000\u0000"+
		"\u00a5\u00a4\u0001\u0000\u0000\u0000\u00a5\u00a6\u0001\u0000\u0000\u0000"+
		"\u00a6\u00d3\u0001\u0000\u0000\u0000\u00a7\u00a8\u0005\f\u0000\u0000\u00a8"+
		"\u00a9\u0005;\u0000\u0000\u00a9\u00ab\u0003P(\u0000\u00aa\u00ac\u0005"+
		"=\u0000\u0000\u00ab\u00aa\u0001\u0000\u0000\u0000\u00ab\u00ac\u0001\u0000"+
		"\u0000\u0000\u00ac\u00d3\u0001\u0000\u0000\u0000\u00ad\u00ae\u0005\r\u0000"+
		"\u0000\u00ae\u00af\u0005;\u0000\u0000\u00af\u00b0\u0005>\u0000\u0000\u00b0"+
		"\u00b4\u0005F\u0000\u0000\u00b1\u00b3\u0003\u0014\n\u0000\u00b2\u00b1"+
		"\u0001\u0000\u0000\u0000\u00b3\u00b6\u0001\u0000\u0000\u0000\u00b4\u00b2"+
		"\u0001\u0000\u0000\u0000\u00b4\u00b5\u0001\u0000\u0000\u0000\u00b5\u00b7"+
		"\u0001\u0000\u0000\u0000\u00b6\u00b4\u0001\u0000\u0000\u0000\u00b7\u00b8"+
		"\u0005F\u0000\u0000\u00b8\u00ba\u0005?\u0000\u0000\u00b9\u00bb\u0005="+
		"\u0000\u0000\u00ba\u00b9\u0001\u0000\u0000\u0000\u00ba\u00bb\u0001\u0000"+
		"\u0000\u0000\u00bb\u00d3\u0001\u0000\u0000\u0000\u00bc\u00bd\u00053\u0000"+
		"\u0000\u00bd\u00be\u0005;\u0000\u0000\u00be\u00c5\u0005>\u0000\u0000\u00bf"+
		"\u00c1\u0005V\u0000\u0000\u00c0\u00c2\u0005=\u0000\u0000\u00c1\u00c0\u0001"+
		"\u0000\u0000\u0000\u00c1\u00c2\u0001\u0000\u0000\u0000\u00c2\u00c4\u0001"+
		"\u0000\u0000\u0000\u00c3\u00bf\u0001\u0000\u0000\u0000\u00c4\u00c7\u0001"+
		"\u0000\u0000\u0000\u00c5\u00c3\u0001\u0000\u0000\u0000\u00c5\u00c6\u0001"+
		"\u0000\u0000\u0000\u00c6\u00c8\u0001\u0000\u0000\u0000\u00c7\u00c5\u0001"+
		"\u0000\u0000\u0000\u00c8\u00ca\u0005?\u0000\u0000\u00c9\u00cb\u0005=\u0000"+
		"\u0000\u00ca\u00c9\u0001\u0000\u0000\u0000\u00ca\u00cb\u0001\u0000\u0000"+
		"\u0000\u00cb\u00d3\u0001\u0000\u0000\u0000\u00cc\u00cd\u0005\u000e\u0000"+
		"\u0000\u00cd\u00ce\u0005;\u0000\u0000\u00ce\u00d0\u0007\u0000\u0000\u0000"+
		"\u00cf\u00d1\u0005=\u0000\u0000\u00d0\u00cf\u0001\u0000\u0000\u0000\u00d0"+
		"\u00d1\u0001\u0000\u0000\u0000\u00d1\u00d3\u0001\u0000\u0000\u0000\u00d2"+
		"\u0093\u0001\u0000\u0000\u0000\u00d2\u0099\u0001\u0000\u0000\u0000\u00d2"+
		"\u00a1\u0001\u0000\u0000\u0000\u00d2\u00a7\u0001\u0000\u0000\u0000\u00d2"+
		"\u00ad\u0001\u0000\u0000\u0000\u00d2\u00bc\u0001\u0000\u0000\u0000\u00d2"+
		"\u00cc\u0001\u0000\u0000\u0000\u00d3\t\u0001\u0000\u0000\u0000\u00d4\u00d5"+
		"\u00058\u0000\u0000\u00d5\u00d6\u0005\u000f\u0000\u0000\u00d6\u00d7\u0005"+
		"B\u0000\u0000\u00d7\u00d8\u0005@\u0000\u0000\u00d8\u00d9\u0005\u0012\u0000"+
		"\u0000\u00d9\u00da\u0005;\u0000\u0000\u00da\u00db\u0005R\u0000\u0000\u00db"+
		"\u00dc\u0005A\u0000\u0000\u00dc\u00dd\u0005C\u0000\u0000\u00dd\u000b\u0001"+
		"\u0000\u0000\u0000\u00de\u00e2\u0005\u0013\u0000\u0000\u00df\u00e1\u0003"+
		"\u000e\u0007\u0000\u00e0\u00df\u0001\u0000\u0000\u0000\u00e1\u00e4\u0001"+
		"\u0000\u0000\u0000\u00e2\u00e0\u0001\u0000\u0000\u0000\u00e2\u00e3\u0001"+
		"\u0000\u0000\u0000\u00e3\u00e5\u0001\u0000\u0000\u0000\u00e4\u00e2\u0001"+
		"\u0000\u0000\u0000\u00e5\u00e8\u0005\u0014\u0000\u0000\u00e6\u00e8\u0003"+
		"\u000e\u0007\u0000\u00e7\u00de\u0001\u0000\u0000\u0000\u00e7\u00e6\u0001"+
		"\u0000\u0000\u0000\u00e8\r\u0001\u0000\u0000\u0000\u00e9\u00ea\u0005H"+
		"\u0000\u0000\u00ea\u00ef\u0005\u0006\u0000\u0000\u00eb\u00ee\u0003\u0012"+
		"\t\u0000\u00ec\u00ee\u0003V+\u0000\u00ed\u00eb\u0001\u0000\u0000\u0000"+
		"\u00ed\u00ec\u0001\u0000\u0000\u0000\u00ee\u00f1\u0001\u0000\u0000\u0000"+
		"\u00ef\u00ed\u0001\u0000\u0000\u0000\u00ef\u00f0\u0001\u0000\u0000\u0000"+
		"\u00f0\u00f2\u0001\u0000\u0000\u0000\u00f1\u00ef\u0001\u0000\u0000\u0000"+
		"\u00f2\u00f3\u0005P\u0000\u0000\u00f3\u0113\u0005I\u0000\u0000\u00f4\u00f5"+
		"\u0005H\u0000\u0000\u00f5\u00fa\u0005\u0006\u0000\u0000\u00f6\u00f9\u0003"+
		"\u0012\t\u0000\u00f7\u00f9\u0003V+\u0000\u00f8\u00f6\u0001\u0000\u0000"+
		"\u0000\u00f8\u00f7\u0001\u0000\u0000\u0000\u00f9\u00fc\u0001\u0000\u0000"+
		"\u0000\u00fa\u00f8\u0001\u0000\u0000\u0000\u00fa\u00fb\u0001\u0000\u0000"+
		"\u0000\u00fb\u00fd\u0001\u0000\u0000\u0000\u00fc\u00fa\u0001\u0000\u0000"+
		"\u0000\u00fd\u0113\u0005I\u0000\u0000\u00fe\u00ff\u0005H\u0000\u0000\u00ff"+
		"\u0104\u0005\u0006\u0000\u0000\u0100\u0103\u0003\u0012\t\u0000\u0101\u0103"+
		"\u0003V+\u0000\u0102\u0100\u0001\u0000\u0000\u0000\u0102\u0101\u0001\u0000"+
		"\u0000\u0000\u0103\u0106\u0001\u0000\u0000\u0000\u0104\u0102\u0001\u0000"+
		"\u0000\u0000\u0104\u0105\u0001\u0000\u0000\u0000\u0105\u0107\u0001\u0000"+
		"\u0000\u0000\u0106\u0104\u0001\u0000\u0000\u0000\u0107\u010c\u0005I\u0000"+
		"\u0000\u0108\u010b\u0003\u000e\u0007\u0000\u0109\u010b\u0003\u0010\b\u0000"+
		"\u010a\u0108\u0001\u0000\u0000\u0000\u010a\u0109\u0001\u0000\u0000\u0000"+
		"\u010b\u010e\u0001\u0000\u0000\u0000\u010c\u010a\u0001\u0000\u0000\u0000"+
		"\u010c\u010d\u0001\u0000\u0000\u0000\u010d\u010f\u0001\u0000\u0000\u0000"+
		"\u010e\u010c\u0001\u0000\u0000\u0000\u010f\u0110\u0005M\u0000\u0000\u0110"+
		"\u0111\u0005\u0006\u0000\u0000\u0111\u0113\u0005I\u0000\u0000\u0112\u00e9"+
		"\u0001\u0000\u0000\u0000\u0112\u00f4\u0001\u0000\u0000\u0000\u0112\u00fe"+
		"\u0001\u0000\u0000\u0000\u0113\u000f\u0001\u0000\u0000\u0000\u0114\u0119"+
		"\u0005\u0003\u0000\u0000\u0115\u0116\u0007\u0001\u0000\u0000\u0116\u0118"+
		"\u0005\u0003\u0000\u0000\u0117\u0115\u0001\u0000\u0000\u0000\u0118\u011b"+
		"\u0001\u0000\u0000\u0000\u0119\u0117\u0001\u0000\u0000\u0000\u0119\u011a"+
		"\u0001\u0000\u0000\u0000\u011a\u0121\u0001\u0000\u0000\u0000\u011b\u0119"+
		"\u0001\u0000\u0000\u0000\u011c\u0121\u0005R\u0000\u0000\u011d\u0121\u0005"+
		"V\u0000\u0000\u011e\u011f\u0005V\u0000\u0000\u011f\u0121\u0005;\u0000"+
		"\u0000\u0120\u0114\u0001\u0000\u0000\u0000\u0120\u011c\u0001\u0000\u0000"+
		"\u0000\u0120\u011d\u0001\u0000\u0000\u0000\u0120\u011e\u0001\u0000\u0000"+
		"\u0000\u0121\u0011\u0001\u0000\u0000\u0000\u0122\u0123\u0007\u0002\u0000"+
		"\u0000\u0123\u0124\u0005D\u0000\u0000\u0124\u013c\u0005R\u0000\u0000\u0125"+
		"\u0126\u0005V\u0000\u0000\u0126\u0127\u0005D\u0000\u0000\u0127\u012b\u0005"+
		"E\u0000\u0000\u0128\u012a\t\u0000\u0000\u0000\u0129\u0128\u0001\u0000"+
		"\u0000\u0000\u012a\u012d\u0001\u0000\u0000\u0000\u012b\u012c\u0001\u0000"+
		"\u0000\u0000\u012b\u0129\u0001\u0000\u0000\u0000\u012c\u012e\u0001\u0000"+
		"\u0000\u0000\u012d\u012b\u0001\u0000\u0000\u0000\u012e\u013c\u0005E\u0000"+
		"\u0000\u012f\u0130\u0005>\u0000\u0000\u0130\u0131\u0005V\u0000\u0000\u0131"+
		"\u0132\u0005?\u0000\u0000\u0132\u0133\u0005D\u0000\u0000\u0133\u013c\u0005"+
		"R\u0000\u0000\u0134\u0135\u0005B\u0000\u0000\u0135\u0136\u0005V\u0000"+
		"\u0000\u0136\u0137\u0005C\u0000\u0000\u0137\u0138\u0005D\u0000\u0000\u0138"+
		"\u013c\u0005R\u0000\u0000\u0139\u013a\u0005V\u0000\u0000\u013a\u013c\u0005"+
		";\u0000\u0000\u013b\u0122\u0001\u0000\u0000\u0000\u013b\u0125\u0001\u0000"+
		"\u0000\u0000\u013b\u012f\u0001\u0000\u0000\u0000\u013b\u0134\u0001\u0000"+
		"\u0000\u0000\u013b\u0139\u0001\u0000\u0000\u0000\u013c\u0013\u0001\u0000"+
		"\u0000\u0000\u013d\u0141\u0005\u0015\u0000\u0000\u013e\u0140\u0003\u0016"+
		"\u000b\u0000\u013f\u013e\u0001\u0000\u0000\u0000\u0140\u0143\u0001\u0000"+
		"\u0000\u0000\u0141\u013f\u0001\u0000\u0000\u0000\u0141\u0142\u0001\u0000"+
		"\u0000\u0000\u0142\u0144\u0001\u0000\u0000\u0000\u0143\u0141\u0001\u0000"+
		"\u0000\u0000\u0144\u014b\u0005\u0018\u0000\u0000\u0145\u0147\u0003\u0016"+
		"\u000b\u0000\u0146\u0145\u0001\u0000\u0000\u0000\u0147\u0148\u0001\u0000"+
		"\u0000\u0000\u0148\u0146\u0001\u0000\u0000\u0000\u0148\u0149\u0001\u0000"+
		"\u0000\u0000\u0149\u014b\u0001\u0000\u0000\u0000\u014a\u013d\u0001\u0000"+
		"\u0000\u0000\u014a\u0146\u0001\u0000\u0000\u0000\u014b\u0015\u0001\u0000"+
		"\u0000\u0000\u014c\u014e\u0003\u001a\r\u0000\u014d\u014f\u0005\u0006\u0000"+
		"\u0000\u014e\u014d\u0001\u0000\u0000\u0000\u014e\u014f\u0001\u0000\u0000"+
		"\u0000\u014f\u0150\u0001\u0000\u0000\u0000\u0150\u0167\u0005@\u0000\u0000"+
		"\u0151\u0152\u0003\u0018\f\u0000\u0152\u0160\u0005;\u0000\u0000\u0153"+
		"\u0155\u0005S\u0000\u0000\u0154\u0153\u0001\u0000\u0000\u0000\u0155\u0158"+
		"\u0001\u0000\u0000\u0000\u0156\u0154\u0001\u0000\u0000\u0000\u0156\u0157"+
		"\u0001\u0000\u0000\u0000\u0157\u015a\u0001\u0000\u0000\u0000\u0158\u0156"+
		"\u0001\u0000\u0000\u0000\u0159\u015b\u0003:\u001d\u0000\u015a\u0159\u0001"+
		"\u0000\u0000\u0000\u015a\u015b\u0001\u0000\u0000\u0000\u015b\u0161\u0001"+
		"\u0000\u0000\u0000\u015c\u015e\u0003\u0018\f\u0000\u015d\u015f\u0005S"+
		"\u0000\u0000\u015e\u015d\u0001\u0000\u0000\u0000\u015e\u015f\u0001\u0000"+
		"\u0000\u0000\u015f\u0161\u0001\u0000\u0000\u0000\u0160\u0156\u0001\u0000"+
		"\u0000\u0000\u0160\u015c\u0001\u0000\u0000\u0000\u0161\u0163\u0001\u0000"+
		"\u0000\u0000\u0162\u0164\u0005<\u0000\u0000\u0163\u0162\u0001\u0000\u0000"+
		"\u0000\u0163\u0164\u0001\u0000\u0000\u0000\u0164\u0166\u0001\u0000\u0000"+
		"\u0000\u0165\u0151\u0001\u0000\u0000\u0000\u0166\u0169\u0001\u0000\u0000"+
		"\u0000\u0167\u0165\u0001\u0000\u0000\u0000\u0167\u0168\u0001\u0000\u0000"+
		"\u0000\u0168\u016a\u0001\u0000\u0000\u0000\u0169\u0167\u0001\u0000\u0000"+
		"\u0000\u016a\u016b\u0005A\u0000\u0000\u016b\u0186\u0001\u0000\u0000\u0000"+
		"\u016c\u016d\u0003\u001a\r\u0000\u016d\u016e\u0005;\u0000\u0000\u016e"+
		"\u016f\u0005V\u0000\u0000\u016f\u0180\u0005@\u0000\u0000\u0170\u0171\u0005"+
		"\u0007\u0000\u0000\u0171\u017b\u0005;\u0000\u0000\u0172\u017c\u0005S\u0000"+
		"\u0000\u0173\u0175\u0005\u0007\u0000\u0000\u0174\u0176\u0005S\u0000\u0000"+
		"\u0175\u0174\u0001\u0000\u0000\u0000\u0175\u0176\u0001\u0000\u0000\u0000"+
		"\u0176\u017c\u0001\u0000\u0000\u0000\u0177\u0178\u0005S\u0000\u0000\u0178"+
		"\u0179\u0005B\u0000\u0000\u0179\u017a\u0005S\u0000\u0000\u017a\u017c\u0005"+
		"C\u0000\u0000\u017b\u0172\u0001\u0000\u0000\u0000\u017b\u0173\u0001\u0000"+
		"\u0000\u0000\u017b\u0177\u0001\u0000\u0000\u0000\u017c\u017d\u0001\u0000"+
		"\u0000\u0000\u017d\u017f\u0005<\u0000\u0000\u017e\u0170\u0001\u0000\u0000"+
		"\u0000\u017f\u0182\u0001\u0000\u0000\u0000\u0180\u017e\u0001\u0000\u0000"+
		"\u0000\u0180\u0181\u0001\u0000\u0000\u0000\u0181\u0183\u0001\u0000\u0000"+
		"\u0000\u0182\u0180\u0001\u0000\u0000\u0000\u0183\u0184\u0005A\u0000\u0000"+
		"\u0184\u0186\u0001\u0000\u0000\u0000\u0185\u014c\u0001\u0000\u0000\u0000"+
		"\u0185\u016c\u0001\u0000\u0000\u0000\u0186\u0017\u0001\u0000\u0000\u0000"+
		"\u0187\u0188\u0005\u0007\u0000\u0000\u0188\u0019\u0001\u0000\u0000\u0000"+
		"\u0189\u018a\u0005K\u0000\u0000\u018a\u018f\u0007\u0003\u0000\u0000\u018b"+
		"\u018c\u0005N\u0000\u0000\u018c\u018f\u0005V\u0000\u0000\u018d\u018f\u0005"+
		"V\u0000\u0000\u018e\u0189\u0001\u0000\u0000\u0000\u018e\u018b\u0001\u0000"+
		"\u0000\u0000\u018e\u018d\u0001\u0000\u0000\u0000\u018f\u001b\u0001\u0000"+
		"\u0000\u0000\u0190\u0191\u00052\u0000\u0000\u0191\u0192\u0005@\u0000\u0000"+
		"\u0192\u0193\u0007\u0004\u0000\u0000\u0193\u0194\u0005A\u0000\u0000\u0194"+
		"\u0195\u00054\u0000\u0000\u0195\u0196\u0005R\u0000\u0000\u0196\u0197\u0005"+
		"<\u0000\u0000\u0197\u001d\u0001\u0000\u0000\u0000\u0198\u0199\u00051\u0000"+
		"\u0000\u0199\u019a\u0007\u0005\u0000\u0000\u019a\u019d\u0005V\u0000\u0000"+
		"\u019b\u019c\u0005D\u0000\u0000\u019c\u019e\u0003D\"\u0000\u019d\u019b"+
		"\u0001\u0000\u0000\u0000\u019d\u019e\u0001\u0000\u0000\u0000\u019e\u019f"+
		"\u0001\u0000\u0000\u0000\u019f\u01a3\u0005<\u0000\u0000\u01a0\u01a1\u0005"+
		"1\u0000\u0000\u01a1\u01a3\u0003,\u0016\u0000\u01a2\u0198\u0001\u0000\u0000"+
		"\u0000\u01a2\u01a0\u0001\u0000\u0000\u0000\u01a3\u001f\u0001\u0000\u0000"+
		"\u0000\u01a4\u01a6\u0007\u0006\u0000\u0000\u01a5\u01a4\u0001\u0000\u0000"+
		"\u0000\u01a5\u01a6\u0001\u0000\u0000\u0000\u01a6\u01a7\u0001\u0000\u0000"+
		"\u0000\u01a7\u01a8\u0005V\u0000\u0000\u01a8\u01aa\u0005;\u0000\u0000\u01a9"+
		"\u01ab\u0003X,\u0000\u01aa\u01a9\u0001\u0000\u0000\u0000\u01aa\u01ab\u0001"+
		"\u0000\u0000\u0000\u01ab\u01b9\u0001\u0000\u0000\u0000\u01ac\u01ae\u0005"+
		"D\u0000\u0000\u01ad\u01ac\u0001\u0000\u0000\u0000\u01ad\u01ae\u0001\u0000"+
		"\u0000\u0000\u01ae\u01b7\u0001\u0000\u0000\u0000\u01af\u01b8\u0005S\u0000"+
		"\u0000\u01b0\u01b8\u0005$\u0000\u0000\u01b1\u01b8\u0005%\u0000\u0000\u01b2"+
		"\u01b8\u0005R\u0000\u0000\u01b3\u01b8\u0003P(\u0000\u01b4\u01b8\u0003"+
		"T*\u0000\u01b5\u01b8\u0003*\u0015\u0000\u01b6\u01b8\u0003$\u0012\u0000"+
		"\u01b7\u01af\u0001\u0000\u0000\u0000\u01b7\u01b0\u0001\u0000\u0000\u0000"+
		"\u01b7\u01b1\u0001\u0000\u0000\u0000\u01b7\u01b2\u0001\u0000\u0000\u0000"+
		"\u01b7\u01b3\u0001\u0000\u0000\u0000\u01b7\u01b4\u0001\u0000\u0000\u0000"+
		"\u01b7\u01b5\u0001\u0000\u0000\u0000\u01b7\u01b6\u0001\u0000\u0000\u0000"+
		"\u01b8\u01ba\u0001\u0000\u0000\u0000\u01b9\u01ad\u0001\u0000\u0000\u0000"+
		"\u01b9\u01ba\u0001\u0000\u0000\u0000\u01ba\u01bc\u0001\u0000\u0000\u0000"+
		"\u01bb\u01bd\u0007\u0007\u0000\u0000\u01bc\u01bb\u0001\u0000\u0000\u0000"+
		"\u01bc\u01bd\u0001\u0000\u0000\u0000\u01bd\u01cd\u0001\u0000\u0000\u0000"+
		"\u01be\u01bf\u0005V\u0000\u0000\u01bf\u01c0\u0005D\u0000\u0000\u01c0\u01c1"+
		"\u0003P(\u0000\u01c1\u01c2\u0005<\u0000\u0000\u01c2\u01cd\u0001\u0000"+
		"\u0000\u0000\u01c3\u01c4\u0005V\u0000\u0000\u01c4\u01c5\u0005;\u0000\u0000"+
		"\u01c5\u01c6\u0005O\u0000\u0000\u01c6\u01c7\u0005@\u0000\u0000\u01c7\u01c8"+
		"\u0005)\u0000\u0000\u01c8\u01c9\u0005K\u0000\u0000\u01c9\u01ca\u0005V"+
		"\u0000\u0000\u01ca\u01cd\u0005A\u0000\u0000\u01cb\u01cd\u0003\"\u0011"+
		"\u0000\u01cc\u01a5\u0001\u0000\u0000\u0000\u01cc\u01be\u0001\u0000\u0000"+
		"\u0000\u01cc\u01c3\u0001\u0000\u0000\u0000\u01cc\u01cb\u0001\u0000\u0000"+
		"\u0000\u01cd!\u0001\u0000\u0000\u0000\u01ce\u01cf\u00058\u0000\u0000\u01cf"+
		"\u01d0\u0005V\u0000\u0000\u01d0\u01d1\u0005B\u0000\u0000\u01d1\u01d2\u0005"+
		"C\u0000\u0000\u01d2\u01d3\u0005V\u0000\u0000\u01d3\u01d4\u0005D\u0000"+
		"\u0000\u01d4\u01d5\u0005\u001b\u0000\u0000\u01d5\u01d6\u0005V\u0000\u0000"+
		"\u01d6\u01d7\u0005H\u0000\u0000\u01d7\u01d8\u0003X,\u0000\u01d8\u01d9"+
		"\u0005I\u0000\u0000\u01d9\u01da\u0005B\u0000\u0000\u01da\u01db\u0005C"+
		"\u0000\u0000\u01db\u01dc\u0005<\u0000\u0000\u01dc#\u0001\u0000\u0000\u0000"+
		"\u01dd\u01e6\u0005B\u0000\u0000\u01de\u01df\u0005V\u0000\u0000\u01df\u01e0"+
		"\u0005&\u0000\u0000\u01e0\u01e7\u0003X,\u0000\u01e1\u01e2\u0005H\u0000"+
		"\u0000\u01e2\u01e3\u0003X,\u0000\u01e3\u01e4\u0005I\u0000\u0000\u01e4"+
		"\u01e5\u0005V\u0000\u0000\u01e5\u01e7\u0001\u0000\u0000\u0000\u01e6\u01de"+
		"\u0001\u0000\u0000\u0000\u01e6\u01e1\u0001\u0000\u0000\u0000\u01e7\u01e8"+
		"\u0001\u0000\u0000\u0000\u01e8\u01e9\u0005C\u0000\u0000\u01e9\u01ea\u0005"+
		"K\u0000\u0000\u01ea\u01eb\u0005V\u0000\u0000\u01eb%\u0001\u0000\u0000"+
		"\u0000\u01ec\u01ed\u0005 \u0000\u0000\u01ed\u01ee\u0005V\u0000\u0000\u01ee"+
		"\u01ef\u0005@\u0000\u0000\u01ef\u01f0\u0003(\u0014\u0000\u01f0\u01f1\u0005"+
		"A\u0000\u0000\u01f1\'\u0001\u0000\u0000\u0000\u01f2\u01f7\u0005V\u0000"+
		"\u0000\u01f3\u01f4\u0005=\u0000\u0000\u01f4\u01f6\u0005V\u0000\u0000\u01f5"+
		"\u01f3\u0001\u0000\u0000\u0000\u01f6\u01f9\u0001\u0000\u0000\u0000\u01f7"+
		"\u01f5\u0001\u0000\u0000\u0000\u01f7\u01f8\u0001\u0000\u0000\u0000\u01f8"+
		")\u0001\u0000\u0000\u0000\u01f9\u01f7\u0001\u0000\u0000\u0000\u01fa\u01fb"+
		"\u0005V\u0000\u0000\u01fb\u01fc\u0005K\u0000\u0000\u01fc\u01fd\u0005V"+
		"\u0000\u0000\u01fd+\u0001\u0000\u0000\u0000\u01fe\u01ff\u0005\u001a\u0000"+
		"\u0000\u01ff\u0202\u0005V\u0000\u0000\u0200\u0201\u0005+\u0000\u0000\u0201"+
		"\u0203\u0005V\u0000\u0000\u0202\u0200\u0001\u0000\u0000\u0000\u0202\u0203"+
		"\u0001\u0000\u0000\u0000\u0203\u0204\u0001\u0000\u0000\u0000\u0204\u0205"+
		"\u0003F#\u0000\u0205-\u0001\u0000\u0000\u0000\u0206\u0207\u0005#\u0000"+
		"\u0000\u0207\u0208\u0005V\u0000\u0000\u0208\u0209\u0005D\u0000\u0000\u0209"+
		"\u020a\u0005\u001b\u0000\u0000\u020a\u020b\u0005V\u0000\u0000\u020b\u0214"+
		"\u0005B\u0000\u0000\u020c\u0211\u0003D\"\u0000\u020d\u020e\u0005=\u0000"+
		"\u0000\u020e\u0210\u0003D\"\u0000\u020f\u020d\u0001\u0000\u0000\u0000"+
		"\u0210\u0213\u0001\u0000\u0000\u0000\u0211\u020f\u0001\u0000\u0000\u0000"+
		"\u0211\u0212\u0001\u0000\u0000\u0000\u0212\u0215\u0001\u0000\u0000\u0000"+
		"\u0213\u0211\u0001\u0000\u0000\u0000\u0214\u020c\u0001\u0000\u0000\u0000"+
		"\u0214\u0215\u0001\u0000\u0000\u0000\u0215\u0216\u0001\u0000\u0000\u0000"+
		"\u0216\u0217\u0005C\u0000\u0000\u0217\u0218\u0005<\u0000\u0000\u0218/"+
		"\u0001\u0000\u0000\u0000\u0219\u021a\u0005(\u0000\u0000\u021a\u021b\u0005"+
		"V\u0000\u0000\u021b\u021c\u0003F#\u0000\u021c1\u0001\u0000\u0000\u0000"+
		"\u021d\u021e\u0005#\u0000\u0000\u021e\u021f\u0005V\u0000\u0000\u021f\u0220"+
		"\u0005;\u0000\u0000\u0220\u0221\u0005V\u0000\u0000\u0221\u0222\u0005D"+
		"\u0000\u0000\u0222\u0223\u0005@\u0000\u0000\u0223\u0224\u00034\u001a\u0000"+
		"\u0224\u0225\u0005A\u0000\u0000\u0225\u0226\u0005<\u0000\u0000\u02263"+
		"\u0001\u0000\u0000\u0000\u0227\u0228\u0005V\u0000\u0000\u0228\u0229\u0005"+
		";\u0000\u0000\u0229\u0230\u0007\b\u0000\u0000\u022a\u022b\u0005=\u0000"+
		"\u0000\u022b\u022c\u0005V\u0000\u0000\u022c\u022d\u0005;\u0000\u0000\u022d"+
		"\u022f\u0007\b\u0000\u0000\u022e\u022a\u0001\u0000\u0000\u0000\u022f\u0232"+
		"\u0001\u0000\u0000\u0000\u0230\u022e\u0001\u0000\u0000\u0000\u0230\u0231"+
		"\u0001\u0000\u0000\u0000\u02315\u0001\u0000\u0000\u0000\u0232\u0230\u0001"+
		"\u0000\u0000\u0000\u0233\u0234\u0005\u0019\u0000\u0000\u0234\u0235\u0005"+
		"V\u0000\u0000\u0235\u0237\u0005B\u0000\u0000\u0236\u0238\u00038\u001c"+
		"\u0000\u0237\u0236\u0001\u0000\u0000\u0000\u0237\u0238\u0001\u0000\u0000"+
		"\u0000\u0238\u0239\u0001\u0000\u0000\u0000\u0239\u023c\u0005C\u0000\u0000"+
		"\u023a\u023b\u0005;\u0000\u0000\u023b\u023d\u0003X,\u0000\u023c\u023a"+
		"\u0001\u0000\u0000\u0000\u023c\u023d\u0001\u0000\u0000\u0000\u023d\u023e"+
		"\u0001\u0000\u0000\u0000\u023e\u025f\u0003F#\u0000\u023f\u0240\u0005V"+
		"\u0000\u0000\u0240\u0242\u0005D\u0000\u0000\u0241\u0243\u0005\u0019\u0000"+
		"\u0000\u0242\u0241\u0001\u0000\u0000\u0000\u0242\u0243\u0001\u0000\u0000"+
		"\u0000\u0243\u0244\u0001\u0000\u0000\u0000\u0244\u0246\u0005B\u0000\u0000"+
		"\u0245\u0247\u00038\u001c\u0000\u0246\u0245\u0001\u0000\u0000\u0000\u0246"+
		"\u0247\u0001\u0000\u0000\u0000\u0247\u0248\u0001\u0000\u0000\u0000\u0248"+
		"\u024a\u0005C\u0000\u0000\u0249\u024b\u0005J\u0000\u0000\u024a\u0249\u0001"+
		"\u0000\u0000\u0000\u024a\u024b\u0001\u0000\u0000\u0000\u024b\u024d\u0001"+
		"\u0000\u0000\u0000\u024c\u024e\u0003X,\u0000\u024d\u024c\u0001\u0000\u0000"+
		"\u0000\u024d\u024e\u0001\u0000\u0000\u0000\u024e\u0252\u0001\u0000\u0000"+
		"\u0000\u024f\u0250\u0005J\u0000\u0000\u0250\u0253\u0003D\"\u0000\u0251"+
		"\u0253\u0003F#\u0000\u0252\u024f\u0001\u0000\u0000\u0000\u0252\u0251\u0001"+
		"\u0000\u0000\u0000\u0253\u0255\u0001\u0000\u0000\u0000\u0254\u0256\u0005"+
		"<\u0000\u0000\u0255\u0254\u0001\u0000\u0000\u0000\u0255\u0256\u0001\u0000"+
		"\u0000\u0000\u0256\u025f\u0001\u0000\u0000\u0000\u0257\u0258\u0005V\u0000"+
		"\u0000\u0258\u025a\u0005B\u0000\u0000\u0259\u025b\u00038\u001c\u0000\u025a"+
		"\u0259\u0001\u0000\u0000\u0000\u025a\u025b\u0001\u0000\u0000\u0000\u025b"+
		"\u025c\u0001\u0000\u0000\u0000\u025c\u025d\u0005C\u0000\u0000\u025d\u025f"+
		"\u0003F#\u0000\u025e\u0233\u0001\u0000\u0000\u0000\u025e\u023f\u0001\u0000"+
		"\u0000\u0000\u025e\u0257\u0001\u0000\u0000\u0000\u025f7\u0001\u0000\u0000"+
		"\u0000\u0260\u0265\u0003 \u0010\u0000\u0261\u0262\u0005=\u0000\u0000\u0262"+
		"\u0264\u0003 \u0010\u0000\u0263\u0261\u0001\u0000\u0000\u0000\u0264\u0267"+
		"\u0001\u0000\u0000\u0000\u0265\u0263\u0001\u0000\u0000\u0000\u0265\u0266"+
		"\u0001\u0000\u0000\u0000\u0266\u0279\u0001\u0000\u0000\u0000\u0267\u0265"+
		"\u0001\u0000\u0000\u0000\u0268\u026d\u0005V\u0000\u0000\u0269\u026a\u0005"+
		"=\u0000\u0000\u026a\u026c\u0005V\u0000\u0000\u026b\u0269\u0001\u0000\u0000"+
		"\u0000\u026c\u026f\u0001\u0000\u0000\u0000\u026d\u026b\u0001\u0000\u0000"+
		"\u0000\u026d\u026e\u0001\u0000\u0000\u0000\u026e\u0279\u0001\u0000\u0000"+
		"\u0000\u026f\u026d\u0001\u0000\u0000\u0000\u0270\u0275\u0005S\u0000\u0000"+
		"\u0271\u0272\u0005=\u0000\u0000\u0272\u0274\u0005S\u0000\u0000\u0273\u0271"+
		"\u0001\u0000\u0000\u0000\u0274\u0277\u0001\u0000\u0000\u0000\u0275\u0273"+
		"\u0001\u0000\u0000\u0000\u0275\u0276\u0001\u0000\u0000\u0000\u0276\u0279"+
		"\u0001\u0000\u0000\u0000\u0277\u0275\u0001\u0000\u0000\u0000\u0278\u0260"+
		"\u0001\u0000\u0000\u0000\u0278\u0268\u0001\u0000\u0000\u0000\u0278\u0270"+
		"\u0001\u0000\u0000\u0000\u02799\u0001\u0000\u0000\u0000\u027a\u027b\u0005"+
		"V\u0000\u0000\u027b\u0284\u0005B\u0000\u0000\u027c\u0281\u0003D\"\u0000"+
		"\u027d\u027e\u0005=\u0000\u0000\u027e\u0280\u0003D\"\u0000\u027f\u027d"+
		"\u0001\u0000\u0000\u0000\u0280\u0283\u0001\u0000\u0000\u0000\u0281\u027f"+
		"\u0001\u0000\u0000\u0000\u0281\u0282\u0001\u0000\u0000\u0000\u0282\u0285"+
		"\u0001\u0000\u0000\u0000\u0283\u0281\u0001\u0000\u0000\u0000\u0284\u027c"+
		"\u0001\u0000\u0000\u0000\u0284\u0285\u0001\u0000\u0000\u0000\u0285\u0286"+
		"\u0001\u0000\u0000\u0000\u0286\u0298\u0005C\u0000\u0000\u0287\u0288\u0005"+
		"V\u0000\u0000\u0288\u0289\u0005B\u0000\u0000\u0289\u0292\u0005F\u0000"+
		"\u0000\u028a\u028f\u0003D\"\u0000\u028b\u028c\u0005=\u0000\u0000\u028c"+
		"\u028e\u0003D\"\u0000\u028d\u028b\u0001\u0000\u0000\u0000\u028e\u0291"+
		"\u0001\u0000\u0000\u0000\u028f\u028d\u0001\u0000\u0000\u0000\u028f\u0290"+
		"\u0001\u0000\u0000\u0000\u0290\u0293\u0001\u0000\u0000\u0000\u0291\u028f"+
		"\u0001\u0000\u0000\u0000\u0292\u028a\u0001\u0000\u0000\u0000\u0292\u0293"+
		"\u0001\u0000\u0000\u0000\u0293\u0294\u0001\u0000\u0000\u0000\u0294\u0295"+
		"\u0005F\u0000\u0000\u0295\u0296\u0005C\u0000\u0000\u0296\u0298\u0005<"+
		"\u0000\u0000\u0297\u027a\u0001\u0000\u0000\u0000\u0297\u0287\u0001\u0000"+
		"\u0000\u0000\u0298;\u0001\u0000\u0000\u0000\u0299\u029a\u0005\u0016\u0000"+
		"\u0000\u029a\u029b\u0005K\u0000\u0000\u029b\u029c\u0005\u0017\u0000\u0000"+
		"\u029c\u029d\u0005B\u0000\u0000\u029d\u02a2\u0003D\"\u0000\u029e\u029f"+
		"\u0005=\u0000\u0000\u029f\u02a1\u0003D\"\u0000\u02a0\u029e\u0001\u0000"+
		"\u0000\u0000\u02a1\u02a4\u0001\u0000\u0000\u0000\u02a2\u02a0\u0001\u0000"+
		"\u0000\u0000\u02a2\u02a3\u0001\u0000\u0000\u0000\u02a3\u02a5\u0001\u0000"+
		"\u0000\u0000\u02a4\u02a2\u0001\u0000\u0000\u0000\u02a5\u02a6\u0005C\u0000"+
		"\u0000\u02a6\u02a7\u0005<\u0000\u0000\u02a7=\u0001\u0000\u0000\u0000\u02a8"+
		"\u02a9\u0005\'\u0000\u0000\u02a9\u02aa\u0003D\"\u0000\u02aa\u02ab\u0005"+
		"<\u0000\u0000\u02ab?\u0001\u0000\u0000\u0000\u02ac\u02ad\u00056\u0000"+
		"\u0000\u02ad\u02ae\u0005\u001b\u0000\u0000\u02ae\u02af\u0005V\u0000\u0000"+
		"\u02af\u02b0\u0005B\u0000\u0000\u02b0\u02b1\u0005R\u0000\u0000\u02b1\u02b2"+
		"\u0005C\u0000\u0000\u02b2\u02b3\u0005<\u0000\u0000\u02b3A\u0001\u0000"+
		"\u0000\u0000\u02b4\u02b5\u0003D\"\u0000\u02b5\u02b6\u0005<\u0000\u0000"+
		"\u02b6C\u0001\u0000\u0000\u0000\u02b7\u02bf\u0005V\u0000\u0000\u02b8\u02bf"+
		"\u0005S\u0000\u0000\u02b9\u02bf\u0005R\u0000\u0000\u02ba\u02bf\u0005$"+
		"\u0000\u0000\u02bb\u02bf\u0005%\u0000\u0000\u02bc\u02bf\u0003:\u001d\u0000"+
		"\u02bd\u02bf\u0003 \u0010\u0000\u02be\u02b7\u0001\u0000\u0000\u0000\u02be"+
		"\u02b8\u0001\u0000\u0000\u0000\u02be\u02b9\u0001\u0000\u0000\u0000\u02be"+
		"\u02ba\u0001\u0000\u0000\u0000\u02be\u02bb\u0001\u0000\u0000\u0000\u02be"+
		"\u02bc\u0001\u0000\u0000\u0000\u02be\u02bd\u0001\u0000\u0000\u0000\u02bf"+
		"E\u0001\u0000\u0000\u0000\u02c0\u02c4\u0005@\u0000\u0000\u02c1\u02c3\u0003"+
		"\u0002\u0001\u0000\u02c2\u02c1\u0001\u0000\u0000\u0000\u02c3\u02c6\u0001"+
		"\u0000\u0000\u0000\u02c4\u02c2\u0001\u0000\u0000\u0000\u02c4\u02c5\u0001"+
		"\u0000\u0000\u0000\u02c5\u02c7\u0001\u0000\u0000\u0000\u02c6\u02c4\u0001"+
		"\u0000\u0000\u0000\u02c7\u02c8\u0005A\u0000\u0000\u02c8G\u0001\u0000\u0000"+
		"\u0000\u02c9\u02ca\u0005)\u0000\u0000\u02ca\u02cb\u0005K\u0000\u0000\u02cb"+
		"\u02cc\u0005V\u0000\u0000\u02cc\u02cd\u0005D\u0000\u0000\u02cd\u02ce\u0005"+
		"V\u0000\u0000\u02ce\u02cf\u0005<\u0000\u0000\u02cfI\u0001\u0000\u0000"+
		"\u0000\u02d0\u02d1\u0005)\u0000\u0000\u02d1\u02d2\u0005K\u0000\u0000\u02d2"+
		"\u02d3\u0005V\u0000\u0000\u02d3\u02d4\u0005K\u0000\u0000\u02d4\u02d5\u0005"+
		"7\u0000\u0000\u02d5\u02d6\u0005B\u0000\u0000\u02d6\u02d7\u0003L&\u0000"+
		"\u02d7\u02d9\u0005C\u0000\u0000\u02d8\u02da\u0005<\u0000\u0000\u02d9\u02d8"+
		"\u0001\u0000\u0000\u0000\u02d9\u02da\u0001\u0000\u0000\u0000\u02daK\u0001"+
		"\u0000\u0000\u0000\u02db\u02dc\u0005@\u0000\u0000\u02dc\u02e1\u0003N\'"+
		"\u0000\u02dd\u02de\u0005=\u0000\u0000\u02de\u02e0\u0003N\'\u0000\u02df"+
		"\u02dd\u0001\u0000\u0000\u0000\u02e0\u02e3\u0001\u0000\u0000\u0000\u02e1"+
		"\u02df\u0001\u0000\u0000\u0000\u02e1\u02e2\u0001\u0000\u0000\u0000\u02e2"+
		"\u02e4\u0001\u0000\u0000\u0000\u02e3\u02e1\u0001\u0000\u0000\u0000\u02e4"+
		"\u02e5\u0005A\u0000\u0000\u02e5M\u0001\u0000\u0000\u0000\u02e6\u02e7\u0005"+
		"V\u0000\u0000\u02e7\u02e8\u0005;\u0000\u0000\u02e8\u02e9\u0007\t\u0000"+
		"\u0000\u02e9O\u0001\u0000\u0000\u0000\u02ea\u02f3\u0005>\u0000\u0000\u02eb"+
		"\u02f0\u0005S\u0000\u0000\u02ec\u02ed\u0005=\u0000\u0000\u02ed\u02ef\u0005"+
		"S\u0000\u0000\u02ee\u02ec\u0001\u0000\u0000\u0000\u02ef\u02f2\u0001\u0000"+
		"\u0000\u0000\u02f0\u02ee\u0001\u0000\u0000\u0000\u02f0\u02f1\u0001\u0000"+
		"\u0000\u0000\u02f1\u02f4\u0001\u0000\u0000\u0000\u02f2\u02f0\u0001\u0000"+
		"\u0000\u0000\u02f3\u02eb\u0001\u0000\u0000\u0000\u02f3\u02f4\u0001\u0000"+
		"\u0000\u0000\u02f4\u02f5\u0001\u0000\u0000\u0000\u02f5\u0311\u0005?\u0000"+
		"\u0000\u02f6\u02ff\u0005>\u0000\u0000\u02f7\u02fc\u0005R\u0000\u0000\u02f8"+
		"\u02f9\u0005=\u0000\u0000\u02f9\u02fb\u0005R\u0000\u0000\u02fa\u02f8\u0001"+
		"\u0000\u0000\u0000\u02fb\u02fe\u0001\u0000\u0000\u0000\u02fc\u02fa\u0001"+
		"\u0000\u0000\u0000\u02fc\u02fd\u0001\u0000\u0000\u0000\u02fd\u0300\u0001"+
		"\u0000\u0000\u0000\u02fe\u02fc\u0001\u0000\u0000\u0000\u02ff\u02f7\u0001"+
		"\u0000\u0000\u0000\u02ff\u0300\u0001\u0000\u0000\u0000\u0300\u0301\u0001"+
		"\u0000\u0000\u0000\u0301\u0311\u0005?\u0000\u0000\u0302\u0303\u0005>\u0000"+
		"\u0000\u0303\u030b\u0003R)\u0000\u0304\u0305\u0005=\u0000\u0000\u0305"+
		"\u0307\u0003R)\u0000\u0306\u0308\u0005=\u0000\u0000\u0307\u0306\u0001"+
		"\u0000\u0000\u0000\u0307\u0308\u0001\u0000\u0000\u0000\u0308\u030a\u0001"+
		"\u0000\u0000\u0000\u0309\u0304\u0001\u0000\u0000\u0000\u030a\u030d\u0001"+
		"\u0000\u0000\u0000\u030b\u0309\u0001\u0000\u0000\u0000\u030b\u030c\u0001"+
		"\u0000\u0000\u0000\u030c\u030e\u0001\u0000\u0000\u0000\u030d\u030b\u0001"+
		"\u0000\u0000\u0000\u030e\u030f\u0005?\u0000\u0000\u030f\u0311\u0001\u0000"+
		"\u0000\u0000\u0310\u02ea\u0001\u0000\u0000\u0000\u0310\u02f6\u0001\u0000"+
		"\u0000\u0000\u0310\u0302\u0001\u0000\u0000\u0000\u0311Q\u0001\u0000\u0000"+
		"\u0000\u0312\u0313\u0005@\u0000\u0000\u0313\u0314\u0005V\u0000\u0000\u0314"+
		"\u0315\u0005;\u0000\u0000\u0315\u031c\u0007\t\u0000\u0000\u0316\u0317"+
		"\u0005=\u0000\u0000\u0317\u0318\u0005V\u0000\u0000\u0318\u0319\u0005;"+
		"\u0000\u0000\u0319\u031b\u0007\t\u0000\u0000\u031a\u0316\u0001\u0000\u0000"+
		"\u0000\u031b\u031e\u0001\u0000\u0000\u0000\u031c\u031a\u0001\u0000\u0000"+
		"\u0000\u031c\u031d\u0001\u0000\u0000\u0000\u031d\u031f\u0001\u0000\u0000"+
		"\u0000\u031e\u031c\u0001\u0000\u0000\u0000\u031f\u0320\u0005A\u0000\u0000"+
		"\u0320S\u0001\u0000\u0000\u0000\u0321\u0322\u0005>\u0000\u0000\u0322\u0327"+
		"\u0005S\u0000\u0000\u0323\u0324\u0005=\u0000\u0000\u0324\u0326\u0005S"+
		"\u0000\u0000\u0325\u0323\u0001\u0000\u0000\u0000\u0326\u0329\u0001\u0000"+
		"\u0000\u0000\u0327\u0325\u0001\u0000\u0000\u0000\u0327\u0328\u0001\u0000"+
		"\u0000\u0000\u0328\u032a\u0001\u0000\u0000\u0000\u0329\u0327\u0001\u0000"+
		"\u0000\u0000\u032a\u032b\u0005?\u0000\u0000\u032bU\u0001\u0000\u0000\u0000"+
		"\u032c\u032d\u0005\u0001\u0000\u0000\u032d\u032e\u0005D\u0000\u0000\u032e"+
		"\u0333\u0005R\u0000\u0000\u032f\u0330\u0005\u0002\u0000\u0000\u0330\u0331"+
		"\u0005D\u0000\u0000\u0331\u0333\u0005R\u0000\u0000\u0332\u032c\u0001\u0000"+
		"\u0000\u0000\u0332\u032f\u0001\u0000\u0000\u0000\u0333W\u0001\u0000\u0000"+
		"\u0000\u0334\u0353\u0005\u001c\u0000\u0000\u0335\u0336\u0005\u001c\u0000"+
		"\u0000\u0336\u0337\u0005>\u0000\u0000\u0337\u0353\u0005?\u0000\u0000\u0338"+
		"\u0353\u0005\u001d\u0000\u0000\u0339\u0353\u0005\u001e\u0000\u0000\u033a"+
		"\u033b\u0005\u001f\u0000\u0000\u033b\u033c\u0005H\u0000\u0000\u033c\u033d"+
		"\u0003X,\u0000\u033d\u033e\u0005I\u0000\u0000\u033e\u0353\u0001\u0000"+
		"\u0000\u0000\u033f\u0340\u0005>\u0000\u0000\u0340\u0345\u0003X,\u0000"+
		"\u0341\u0342\u0005=\u0000\u0000\u0342\u0344\u0003X,\u0000\u0343\u0341"+
		"\u0001\u0000\u0000\u0000\u0344\u0347\u0001\u0000\u0000\u0000\u0345\u0343"+
		"\u0001\u0000\u0000\u0000\u0345\u0346\u0001\u0000\u0000\u0000\u0346\u0348"+
		"\u0001\u0000\u0000\u0000\u0347\u0345\u0001\u0000\u0000\u0000\u0348\u0349"+
		"\u0005?\u0000\u0000\u0349\u0353\u0001\u0000\u0000\u0000\u034a\u0353\u0005"+
		" \u0000\u0000\u034b\u034e\u0005!\u0000\u0000\u034c\u034d\u0005>\u0000"+
		"\u0000\u034d\u034f\u0005?\u0000\u0000\u034e\u034c\u0001\u0000\u0000\u0000"+
		"\u034e\u034f\u0001\u0000\u0000\u0000\u034f\u0353\u0001\u0000\u0000\u0000"+
		"\u0350\u0353\u0005\"\u0000\u0000\u0351\u0353\u0005V\u0000\u0000\u0352"+
		"\u0334\u0001\u0000\u0000\u0000\u0352\u0335\u0001\u0000\u0000\u0000\u0352"+
		"\u0338\u0001\u0000\u0000\u0000\u0352\u0339\u0001\u0000\u0000\u0000\u0352"+
		"\u033a\u0001\u0000\u0000\u0000\u0352\u033f\u0001\u0000\u0000\u0000\u0352"+
		"\u034a\u0001\u0000\u0000\u0000\u0352\u034b\u0001\u0000\u0000\u0000\u0352"+
		"\u0350\u0001\u0000\u0000\u0000\u0352\u0351\u0001\u0000\u0000\u0000\u0353"+
		"Y\u0001\u0000\u0000\u0000\u0354\u0356\u0005V\u0000\u0000\u0355\u0354\u0001"+
		"\u0000\u0000\u0000\u0356\u0359\u0001\u0000\u0000\u0000\u0357\u0355\u0001"+
		"\u0000\u0000\u0000\u0357\u0358\u0001\u0000\u0000\u0000\u0358\u035a\u0001"+
		"\u0000\u0000\u0000\u0359\u0357\u0001\u0000\u0000\u0000\u035a\u035b\u0005"+
		"D\u0000\u0000\u035b\u035c\u0003D\"\u0000\u035c\u035d\u0005<\u0000\u0000"+
		"\u035d\u036c\u0001\u0000\u0000\u0000\u035e\u0360\u0005V\u0000\u0000\u035f"+
		"\u035e\u0001\u0000\u0000\u0000\u0360\u0363\u0001\u0000\u0000\u0000\u0361"+
		"\u035f\u0001\u0000\u0000\u0000\u0361\u0362\u0001\u0000\u0000\u0000\u0362"+
		"\u0364\u0001\u0000\u0000\u0000\u0363\u0361\u0001\u0000\u0000\u0000\u0364"+
		"\u0368\u0005D\u0000\u0000\u0365\u0367\u0003\\.\u0000\u0366\u0365\u0001"+
		"\u0000\u0000\u0000\u0367\u036a\u0001\u0000\u0000\u0000\u0368\u0366\u0001"+
		"\u0000\u0000\u0000\u0368\u0369\u0001\u0000\u0000\u0000\u0369\u036c\u0001"+
		"\u0000\u0000\u0000\u036a\u0368\u0001\u0000\u0000\u0000\u036b\u0357\u0001"+
		"\u0000\u0000\u0000\u036b\u0361\u0001\u0000\u0000\u0000\u036c[\u0001\u0000"+
		"\u0000\u0000\u036d\u0384\u0005S\u0000\u0000\u036e\u0384\u0005W\u0000\u0000"+
		"\u036f\u0384\u0005V\u0000\u0000\u0370\u0384\u0005\u001c\u0000\u0000\u0371"+
		"\u0384\u0005\u001d\u0000\u0000\u0372\u0384\u0005!\u0000\u0000\u0373\u0374"+
		"\u0005>\u0000\u0000\u0374\u037e\u0003^/\u0000\u0375\u0379\u0005=\u0000"+
		"\u0000\u0376\u0378\u0003^/\u0000\u0377\u0376\u0001\u0000\u0000\u0000\u0378"+
		"\u037b\u0001\u0000\u0000\u0000\u0379\u0377\u0001\u0000\u0000\u0000\u0379"+
		"\u037a\u0001\u0000\u0000\u0000\u037a\u037d\u0001\u0000\u0000\u0000\u037b"+
		"\u0379\u0001\u0000\u0000\u0000\u037c\u0375\u0001\u0000\u0000\u0000\u037d"+
		"\u0380\u0001\u0000\u0000\u0000\u037e\u037c\u0001\u0000\u0000\u0000\u037e"+
		"\u037f\u0001\u0000\u0000\u0000\u037f\u0381\u0001\u0000\u0000\u0000\u0380"+
		"\u037e\u0001\u0000\u0000\u0000\u0381\u0382\u0005?\u0000\u0000\u0382\u0384"+
		"\u0001\u0000\u0000\u0000\u0383\u036d\u0001\u0000\u0000\u0000\u0383\u036e"+
		"\u0001\u0000\u0000\u0000\u0383\u036f\u0001\u0000\u0000\u0000\u0383\u0370"+
		"\u0001\u0000\u0000\u0000\u0383\u0371\u0001\u0000\u0000\u0000\u0383\u0372"+
		"\u0001\u0000\u0000\u0000\u0383\u0373\u0001\u0000\u0000\u0000\u0384]\u0001"+
		"\u0000\u0000\u0000\u0385\u0389\u0005@\u0000\u0000\u0386\u0388\u0005V\u0000"+
		"\u0000\u0387\u0386\u0001\u0000\u0000\u0000\u0388\u038b\u0001\u0000\u0000"+
		"\u0000\u0389\u0387\u0001\u0000\u0000\u0000\u0389\u038a\u0001\u0000\u0000"+
		"\u0000\u038a\u038c\u0001\u0000\u0000\u0000\u038b\u0389\u0001\u0000\u0000"+
		"\u0000\u038c\u0390\u0005;\u0000\u0000\u038d\u038f\u0005\u001c\u0000\u0000"+
		"\u038e\u038d\u0001\u0000\u0000\u0000\u038f\u0392\u0001\u0000\u0000\u0000"+
		"\u0390\u038e\u0001\u0000\u0000\u0000\u0390\u0391\u0001\u0000\u0000\u0000"+
		"\u0391\u0393\u0001\u0000\u0000\u0000\u0392\u0390\u0001\u0000\u0000\u0000"+
		"\u0393\u0397\u0005=\u0000\u0000\u0394\u0396\u0005V\u0000\u0000\u0395\u0394"+
		"\u0001\u0000\u0000\u0000\u0396\u0399\u0001\u0000\u0000\u0000\u0397\u0395"+
		"\u0001\u0000\u0000\u0000\u0397\u0398\u0001\u0000\u0000\u0000\u0398\u039a"+
		"\u0001\u0000\u0000\u0000\u0399\u0397\u0001\u0000\u0000\u0000\u039a\u039b"+
		"\u0005;\u0000\u0000\u039b\u039c\u0005\u001d\u0000\u0000\u039c\u03a0\u0005"+
		"=\u0000\u0000\u039d\u039f\u0005V\u0000\u0000\u039e\u039d\u0001\u0000\u0000"+
		"\u0000\u039f\u03a2\u0001\u0000\u0000\u0000\u03a0\u039e\u0001\u0000\u0000"+
		"\u0000\u03a0\u03a1\u0001\u0000\u0000\u0000\u03a1\u03a3\u0001\u0000\u0000"+
		"\u0000\u03a2\u03a0\u0001\u0000\u0000\u0000\u03a3\u03a4\u0005;\u0000\u0000"+
		"\u03a4\u03a5\u0005\u001d\u0000\u0000\u03a5\u03a6\u0005A\u0000\u0000\u03a6"+
		"_\u0001\u0000\u0000\u0000\u03a7\u03a8\u0005#\u0000\u0000\u03a8\u03a9\u0005"+
		"V\u0000\u0000\u03a9\u03aa\u0005D\u0000\u0000\u03aa\u03ab\u0005\u001b\u0000"+
		"\u0000\u03ab\u03ac\u0005V\u0000\u0000\u03ac\u03b5\u0005B\u0000\u0000\u03ad"+
		"\u03b2\u0003D\"\u0000\u03ae\u03af\u0005=\u0000\u0000\u03af\u03b1\u0003"+
		"D\"\u0000\u03b0\u03ae\u0001\u0000\u0000\u0000\u03b1\u03b4\u0001\u0000"+
		"\u0000\u0000\u03b2\u03b0\u0001\u0000\u0000\u0000\u03b2\u03b3\u0001\u0000"+
		"\u0000\u0000\u03b3\u03b6\u0001\u0000\u0000\u0000\u03b4\u03b2\u0001\u0000"+
		"\u0000\u0000\u03b5\u03ad\u0001\u0000\u0000\u0000\u03b5\u03b6\u0001\u0000"+
		"\u0000\u0000\u03b6\u03b7\u0001\u0000\u0000\u0000\u03b7\u03b8\u0005C\u0000"+
		"\u0000\u03b8\u03b9\u0005<\u0000\u0000\u03b9a\u0001\u0000\u0000\u0000o"+
		"eg\u0080\u0084\u008d\u0097\u009f\u00a5\u00ab\u00b4\u00ba\u00c1\u00c5\u00ca"+
		"\u00d0\u00d2\u00e2\u00e7\u00ed\u00ef\u00f8\u00fa\u0102\u0104\u010a\u010c"+
		"\u0112\u0119\u0120\u012b\u013b\u0141\u0148\u014a\u014e\u0156\u015a\u015e"+
		"\u0160\u0163\u0167\u0175\u017b\u0180\u0185\u018e\u019d\u01a2\u01a5\u01aa"+
		"\u01ad\u01b7\u01b9\u01bc\u01cc\u01e6\u01f7\u0202\u0211\u0214\u0230\u0237"+
		"\u023c\u0242\u0246\u024a\u024d\u0252\u0255\u025a\u025e\u0265\u026d\u0275"+
		"\u0278\u0281\u0284\u028f\u0292\u0297\u02a2\u02be\u02c4\u02d9\u02e1\u02f0"+
		"\u02f3\u02fc\u02ff\u0307\u030b\u0310\u031c\u0327\u0332\u0345\u034e\u0352"+
		"\u0357\u0361\u0368\u036b\u0379\u037e\u0383\u0389\u0390\u0397\u03a0\u03b2"+
		"\u03b5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}