// Generated with ANTLR

package dsl4dataspaces.dsl4dataspaces._parser;
import de.monticore.antlr4.*;
import de.monticore.parser.*;
import dsl4dataspaces.dsl4dataspaces.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class DSL4DataspacesAntlrParser extends MCParser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		QOSMETRICS1685033198=1, USAGEPOLICY817009203=2, STSSERVICEADDRESS3595907665=3, 
		CALLBACKADDRESS105567183=4, USAGE111574433=5, LANGUAGE2681377624=6, REGISTRIES2425415067=7, 
		REMOTEID3782084577=8, SIDICODES2535023499=9, PERMISSIONS1133704324=10, 
		LEXNAME0=11, MODIFIED3679453897=12, ID3355=13, AUTHENTICATIONMODE1705415739=14, 
		XAPIKEY1063285885=15, REMOTEADDRESS3662708942=16, PACKAGE3487904838=17, 
		VOID3625364=18, IDTYPE3101035253=19, DATAADDRESS1666068714=20, EDC100260=21, 
		CREATED1028554472=22, STAR=23, SECURITYMODE808027395=24, COMMA=25, MINUS=26, 
		VERSION351608024=27, POINT=28, PUSH3452698=29, ROLE2552982=30, NULL3392903=31, 
		NAME3373707=32, PUBLISHER1447404028=33, COLON=34, SEMI=35, GRANTTYPE3075135094=36, 
		EQUALS=37, ACCESSCONTROL798502745=38, ACCESS2871506276=39, IMPORT3110171557=40, 
		DESCRIPTION2570421244=41, SECRET3388690096=42, TITLE110371416=43, URI84300=44, 
		ENDPOINT1741102485=45, PROVIDER3307472369=46, IDENTITY4159205566=47, SCOPE109264468=48, 
		LBRACK=49, RBRACK=50, OAUTH105516695=51, POLICY3312297266=52, DATASCHEMAADDRESS258677641=53, 
		ENDPOINTS2434569598=54, CLIENTID908408390=55, IDPENDPOINT3356463978=56, 
		CONTRACTOFFER3767399530=57, SECURITYPOLICY3506346130=58, SUPPORTEDPROTOCOLS1268839373=59, 
		BASEURL3962341598=60, LINKEDASSETID675711922=61, DISCOVERY4173759920=62, 
		CLOUDPUSH3868712687=63, LCURLY=64, ASSET93121264=65, RCURLY=66, CONFIG2940175170=67, 
		OPCUA105946286=68, TRUE3569038=69, FALSE97196323=70, BOOLEAN64711720=71, 
		BYTE3039496=72, SHORT109413500=73, INT104431=74, LONG3327612=75, CHAR3052374=76, 
		FLOAT97526364=77, DOUBLE2969009105=78, DE3201=79, EN3241=80, NL3518=81, 
		String=82, Num_Int=83, Name=84, Num_Double=85, Char=86, Num_Float=87, 
		WS=88, Num_Long=89, ML_COMMENT=90, SL_COMMENT=91, Digits=92;
	public static final int
		RULE_nullLiteral = 0, RULE_booleanLiteral = 1, RULE_charLiteral = 2, RULE_stringLiteral = 3, 
		RULE_natLiteral = 4, RULE_signedNatLiteral = 5, RULE_basicLongLiteral = 6, 
		RULE_signedBasicLongLiteral = 7, RULE_basicFloatLiteral = 8, RULE_signedBasicFloatLiteral = 9, 
		RULE_basicDoubleLiteral = 10, RULE_signedBasicDoubleLiteral = 11, RULE_intLiteral = 12, 
		RULE_longLiteral = 13, RULE_floatLiteral = 14, RULE_doubleLiteral = 15, 
		RULE_mCQualifiedName = 16, RULE_mCPackageDeclaration = 17, RULE_mCImportStatement = 18, 
		RULE_mCPrimitiveType = 19, RULE_mCQualifiedType = 20, RULE_mCReturnType = 21, 
		RULE_mCVoidType = 22, RULE_dataSpaceConnectorConfiguration = 23, RULE_complexName = 24, 
		RULE_discoveryData = 25, RULE_assetMetaData = 26, RULE_baseUsage = 27, 
		RULE_oPCUAUsage = 28, RULE_eDCUsage = 29, RULE_eDCPushEndpointsConfig = 30, 
		RULE_accessPolicy = 31, RULE_role = 32, RULE_identityProviderConfig = 33, 
		RULE_oAuthInfo = 34, RULE_literal = 35, RULE_signedLiteral = 36, RULE_numericLiteral = 37, 
		RULE_signedNumericLiteral = 38, RULE_mCType = 39, RULE_mCObjectType = 40, 
		RULE_configurationElements = 41, RULE_usage = 42, RULE_nokeyword_f102 = 43, 
		RULE_nokeyword_F70 = 44, RULE_nokeyword_l108 = 45, RULE_nokeyword_L76 = 46;
	private static String[] makeRuleNames() {
		return new String[] {
			"nullLiteral", "booleanLiteral", "charLiteral", "stringLiteral", "natLiteral", 
			"signedNatLiteral", "basicLongLiteral", "signedBasicLongLiteral", "basicFloatLiteral", 
			"signedBasicFloatLiteral", "basicDoubleLiteral", "signedBasicDoubleLiteral", 
			"intLiteral", "longLiteral", "floatLiteral", "doubleLiteral", "mCQualifiedName", 
			"mCPackageDeclaration", "mCImportStatement", "mCPrimitiveType", "mCQualifiedType", 
			"mCReturnType", "mCVoidType", "dataSpaceConnectorConfiguration", "complexName", 
			"discoveryData", "assetMetaData", "baseUsage", "oPCUAUsage", "eDCUsage", 
			"eDCPushEndpointsConfig", "accessPolicy", "role", "identityProviderConfig", 
			"oAuthInfo", "literal", "signedLiteral", "numericLiteral", "signedNumericLiteral", 
			"mCType", "mCObjectType", "configurationElements", "usage", "nokeyword_f102", 
			"nokeyword_F70", "nokeyword_l108", "nokeyword_L76"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'qosMetrics'", "'usagePolicy'", "'stsServiceAddress'", "'callBackAddress'", 
			"'usage'", "'language'", "'registries'", "'remoteID'", "'sidiCodes'", 
			"'permissions'", "'connector config'", "'modified'", "'id'", "'authenticationMode'", 
			"'xAPIKey'", "'remoteAddress'", "'package'", "'void'", "'idType'", "'dataAddress'", 
			"'edc'", "'created'", "'*'", "'securityMode'", "','", "'-'", "'version'", 
			"'.'", "'push'", "'Role'", "'null'", "'name'", "'publisher'", "':'", 
			"';'", "'grantType'", "'='", "'accessControl'", "'access'", "'import'", 
			"'description'", "'secret'", "'title'", "'URI'", "'endpoint'", "'provider'", 
			"'identity'", "'scope'", "'['", "']'", "'oauth'", "'policy'", "'dataSchemaAddress'", 
			"'endpoints'", "'clientId'", "'idpEndpoint'", "'contractOffer'", "'securityPolicy'", 
			"'supportedProtocols'", "'baseUrl'", "'linkedAssetID'", "'discovery'", 
			"'cloudPush'", "'{'", "'asset'", "'}'", "'config'", "'opcua'", "'true'", 
			"'false'", "'boolean'", "'byte'", "'short'", "'int'", "'long'", "'char'", 
			"'float'", "'double'", "'de'", "'en'", "'nl'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "QOSMETRICS1685033198", "USAGEPOLICY817009203", "STSSERVICEADDRESS3595907665", 
			"CALLBACKADDRESS105567183", "USAGE111574433", "LANGUAGE2681377624", "REGISTRIES2425415067", 
			"REMOTEID3782084577", "SIDICODES2535023499", "PERMISSIONS1133704324", 
			"LEXNAME0", "MODIFIED3679453897", "ID3355", "AUTHENTICATIONMODE1705415739", 
			"XAPIKEY1063285885", "REMOTEADDRESS3662708942", "PACKAGE3487904838", 
			"VOID3625364", "IDTYPE3101035253", "DATAADDRESS1666068714", "EDC100260", 
			"CREATED1028554472", "STAR", "SECURITYMODE808027395", "COMMA", "MINUS", 
			"VERSION351608024", "POINT", "PUSH3452698", "ROLE2552982", "NULL3392903", 
			"NAME3373707", "PUBLISHER1447404028", "COLON", "SEMI", "GRANTTYPE3075135094", 
			"EQUALS", "ACCESSCONTROL798502745", "ACCESS2871506276", "IMPORT3110171557", 
			"DESCRIPTION2570421244", "SECRET3388690096", "TITLE110371416", "URI84300", 
			"ENDPOINT1741102485", "PROVIDER3307472369", "IDENTITY4159205566", "SCOPE109264468", 
			"LBRACK", "RBRACK", "OAUTH105516695", "POLICY3312297266", "DATASCHEMAADDRESS258677641", 
			"ENDPOINTS2434569598", "CLIENTID908408390", "IDPENDPOINT3356463978", 
			"CONTRACTOFFER3767399530", "SECURITYPOLICY3506346130", "SUPPORTEDPROTOCOLS1268839373", 
			"BASEURL3962341598", "LINKEDASSETID675711922", "DISCOVERY4173759920", 
			"CLOUDPUSH3868712687", "LCURLY", "ASSET93121264", "RCURLY", "CONFIG2940175170", 
			"OPCUA105946286", "TRUE3569038", "FALSE97196323", "BOOLEAN64711720", 
			"BYTE3039496", "SHORT109413500", "INT104431", "LONG3327612", "CHAR3052374", 
			"FLOAT97526364", "DOUBLE2969009105", "DE3201", "EN3241", "NL3518", "String", 
			"Num_Int", "Name", "Num_Double", "Char", "Num_Float", "WS", "Num_Long", 
			"ML_COMMENT", "SL_COMMENT", "Digits"
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
	public String getGrammarFileName() { return "DSL4DataspacesAntlrParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }



	  // convert function for Name
	private String convertName(Token t)  {
	    return t.getText();
	}

	  // convert function for NEWLINE
	private String convertNEWLINE(Token t)  {
	    return t.getText();
	}

	  // convert function for WS
	private String convertWS(Token t)  {
	    return t.getText();
	}

	  // convert function for SL_COMMENT
	private String convertSL_COMMENT(Token t)  {
	    return t.getText();
	}

	  // convert function for ML_COMMENT
	private String convertML_COMMENT(Token t)  {
	    return t.getText();
	}

	  // convert function for Digits
	private String convertDigits(Token t)  {
	    return t.getText();
	}

	  // convert function for Digit
	private String convertDigit(Token t)  {
	    return t.getText();
	}

	  // convert function for Char
	private String convertChar(Token t)  {
	    return t.getText();
	}

	  // convert function for SingleCharacter
	private String convertSingleCharacter(Token t)  {
	    return t.getText();
	}

	  // convert function for String
	private String convertString(Token t)  {
	    return t.getText();
	}

	  // convert function for StringCharacters
	private String convertStringCharacters(Token t)  {
	    return t.getText();
	}

	  // convert function for StringCharacter
	private String convertStringCharacter(Token t)  {
	    return t.getText();
	}

	  // convert function for EscapeSequence
	private String convertEscapeSequence(Token t)  {
	    return t.getText();
	}

	  // convert function for OctalEscape
	private String convertOctalEscape(Token t)  {
	    return t.getText();
	}

	  // convert function for UnicodeEscape
	private String convertUnicodeEscape(Token t)  {
	    return t.getText();
	}

	  // convert function for ZeroToThree
	private String convertZeroToThree(Token t)  {
	    return t.getText();
	}

	  // convert function for HexDigit
	private String convertHexDigit(Token t)  {
	    return t.getText();
	}

	  // convert function for OctalDigit
	private String convertOctalDigit(Token t)  {
	    return t.getText();
	}

	  // convert function for Num_Int
	private String convertNum_Int(Token t)  {
	    return t.getText();
	}

	  // convert function for Num_Long
	private String convertNum_Long(Token t)  {
	    return t.getText();
	}

	  // convert function for DecimalIntegerLiteral
	private String convertDecimalIntegerLiteral(Token t)  {
	    return t.getText();
	}

	  // convert function for HexIntegerLiteral
	private String convertHexIntegerLiteral(Token t)  {
	    return t.getText();
	}

	  // convert function for OctalIntegerLiteral
	private String convertOctalIntegerLiteral(Token t)  {
	    return t.getText();
	}

	  // convert function for BinaryIntegerLiteral
	private String convertBinaryIntegerLiteral(Token t)  {
	    return t.getText();
	}

	  // convert function for IntegerTypeSuffix
	private String convertIntegerTypeSuffix(Token t)  {
	    return t.getText();
	}

	  // convert function for DecimalNumeral
	private String convertDecimalNumeral(Token t)  {
	    return t.getText();
	}

	  // convert function for NonZeroDigit
	private String convertNonZeroDigit(Token t)  {
	    return t.getText();
	}

	  // convert function for DigitOrUnderscore
	private String convertDigitOrUnderscore(Token t)  {
	    return t.getText();
	}

	  // convert function for Underscores
	private String convertUnderscores(Token t)  {
	    return t.getText();
	}

	  // convert function for HexNumeral
	private String convertHexNumeral(Token t)  {
	    return t.getText();
	}

	  // convert function for HexDigits
	private String convertHexDigits(Token t)  {
	    return t.getText();
	}

	  // convert function for HexDigitOrUnderscore
	private String convertHexDigitOrUnderscore(Token t)  {
	    return t.getText();
	}

	  // convert function for OctalNumeral
	private String convertOctalNumeral(Token t)  {
	    return t.getText();
	}

	  // convert function for OctalDigits
	private String convertOctalDigits(Token t)  {
	    return t.getText();
	}

	  // convert function for OctalDigitOrUnderscore
	private String convertOctalDigitOrUnderscore(Token t)  {
	    return t.getText();
	}

	  // convert function for BinaryNumeral
	private String convertBinaryNumeral(Token t)  {
	    return t.getText();
	}

	  // convert function for BinaryDigits
	private String convertBinaryDigits(Token t)  {
	    return t.getText();
	}

	  // convert function for BinaryDigit
	private String convertBinaryDigit(Token t)  {
	    return t.getText();
	}

	  // convert function for BinaryDigitOrUnderscore
	private String convertBinaryDigitOrUnderscore(Token t)  {
	    return t.getText();
	}

	  // convert function for Num_Float
	private String convertNum_Float(Token t)  {
	    return t.getText();
	}

	  // convert function for Num_Double
	private String convertNum_Double(Token t)  {
	    return t.getText();
	}

	  // convert function for DecimalDoublePointLiteral
	private String convertDecimalDoublePointLiteral(Token t)  {
	    return t.getText();
	}

	  // convert function for DecimalFloatingPointLiteral
	private String convertDecimalFloatingPointLiteral(Token t)  {
	    return t.getText();
	}

	  // convert function for ExponentPart
	private String convertExponentPart(Token t)  {
	    return t.getText();
	}

	  // convert function for ExponentIndicator
	private String convertExponentIndicator(Token t)  {
	    return t.getText();
	}

	  // convert function for SignedInteger
	private String convertSignedInteger(Token t)  {
	    return t.getText();
	}

	  // convert function for Sign
	private String convertSign(Token t)  {
	    return t.getText();
	}

	  // convert function for FloatTypeSuffix
	private String convertFloatTypeSuffix(Token t)  {
	    return t.getText();
	}

	  // convert function for DoubleTypeSuffix
	private String convertDoubleTypeSuffix(Token t)  {
	    return t.getText();
	}

	  // convert function for HexadecimalDoublePointLiteral
	private String convertHexadecimalDoublePointLiteral(Token t)  {
	    return t.getText();
	}

	  // convert function for HexadecimalFloatingPointLiteral
	private String convertHexadecimalFloatingPointLiteral(Token t)  {
	    return t.getText();
	}

	  // convert function for HexSignificand
	private String convertHexSignificand(Token t)  {
	    return t.getText();
	}

	  // convert function for BinaryExponent
	private String convertBinaryExponent(Token t)  {
	    return t.getText();
	}

	  // convert function for BinaryExponentIndicator
	private String convertBinaryExponentIndicator(Token t)  {
	    return t.getText();
	}


	public DSL4DataspacesAntlrParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NullLiteralContext extends ParserRuleContext {
		public de.monticore.literals.mccommonliterals._ast.ASTNullLiteral ret = null;
		public TerminalNode NULL3392903() { return getToken(DSL4DataspacesAntlrParser.NULL3392903, 0); }
		public NullLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nullLiteral; }
	}

	public final NullLiteralContext nullLiteral() throws RecognitionException {
		NullLiteralContext _localctx = new NullLiteralContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_nullLiteral);
		// getActionForAltBeforeRuleBody
		de.monticore.literals.mccommonliterals._ast.ASTNullLiteralBuilder _builder = dsl4dataspaces.dsl4dataspaces.DSL4DataspacesMill.nullLiteralBuilder();
		_builder.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveBuilder(_builder);

		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(NULL3392903);
			}
			_ctx.stop = _input.LT(-1);
			_builder.set_SourcePositionEnd(computeEndPosition(_input.LT(-1)));
			_localctx.ret = _builder.uncheckedBuild();
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
	public static class BooleanLiteralContext extends ParserRuleContext {
		public de.monticore.literals.mccommonliterals._ast.ASTBooleanLiteral ret = null;
		public TerminalNode TRUE3569038() { return getToken(DSL4DataspacesAntlrParser.TRUE3569038, 0); }
		public TerminalNode FALSE97196323() { return getToken(DSL4DataspacesAntlrParser.FALSE97196323, 0); }
		public BooleanLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanLiteral; }
	}

	public final BooleanLiteralContext booleanLiteral() throws RecognitionException {
		BooleanLiteralContext _localctx = new BooleanLiteralContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_booleanLiteral);
		// getActionForAltBeforeRuleBody
		de.monticore.literals.mccommonliterals._ast.ASTBooleanLiteralBuilder _builder = dsl4dataspaces.dsl4dataspaces.DSL4DataspacesMill.booleanLiteralBuilder();
		_builder.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveBuilder(_builder);

		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE3569038:
				{
				setState(96);
				match(TRUE3569038);

				_builder.setSource(de.monticore.literals.mccommonliterals._ast.ASTConstantsMCCommonLiterals.TRUE);

				}
				break;
			case FALSE97196323:
				{
				setState(98);
				match(FALSE97196323);

				_builder.setSource(de.monticore.literals.mccommonliterals._ast.ASTConstantsMCCommonLiterals.FALSE);

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
			_ctx.stop = _input.LT(-1);
			_builder.set_SourcePositionEnd(computeEndPosition(_input.LT(-1)));
			_localctx.ret = _builder.uncheckedBuild();
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
	public static class CharLiteralContext extends ParserRuleContext {
		public de.monticore.literals.mccommonliterals._ast.ASTCharLiteral ret = null;
		public Token tmp0;
		public TerminalNode Char() { return getToken(DSL4DataspacesAntlrParser.Char, 0); }
		public CharLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_charLiteral; }
	}

	public final CharLiteralContext charLiteral() throws RecognitionException {
		CharLiteralContext _localctx = new CharLiteralContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_charLiteral);
		// getActionForAltBeforeRuleBody
		de.monticore.literals.mccommonliterals._ast.ASTCharLiteralBuilder _builder = dsl4dataspaces.dsl4dataspaces.DSL4DataspacesMill.charLiteralBuilder();
		_builder.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveBuilder(_builder);

		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(102);
			((CharLiteralContext)_localctx).tmp0 = match(Char);
			_builder.setSource(convertChar(((CharLiteralContext)_localctx).tmp0));
			}
			}
			_ctx.stop = _input.LT(-1);
			_builder.set_SourcePositionEnd(computeEndPosition(_input.LT(-1)));
			_localctx.ret = _builder.uncheckedBuild();
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
	public static class StringLiteralContext extends ParserRuleContext {
		public de.monticore.literals.mccommonliterals._ast.ASTStringLiteral ret = null;
		public Token tmp0;
		public TerminalNode String() { return getToken(DSL4DataspacesAntlrParser.String, 0); }
		public StringLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringLiteral; }
	}

	public final StringLiteralContext stringLiteral() throws RecognitionException {
		StringLiteralContext _localctx = new StringLiteralContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_stringLiteral);
		// getActionForAltBeforeRuleBody
		de.monticore.literals.mccommonliterals._ast.ASTStringLiteralBuilder _builder = dsl4dataspaces.dsl4dataspaces.DSL4DataspacesMill.stringLiteralBuilder();
		_builder.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveBuilder(_builder);

		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(105);
			((StringLiteralContext)_localctx).tmp0 = match(String);
			_builder.setSource(convertString(((StringLiteralContext)_localctx).tmp0));
			}
			}
			_ctx.stop = _input.LT(-1);
			_builder.set_SourcePositionEnd(computeEndPosition(_input.LT(-1)));
			_localctx.ret = _builder.uncheckedBuild();
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
	public static class NatLiteralContext extends ParserRuleContext {
		public de.monticore.literals.mccommonliterals._ast.ASTNatLiteral ret = null;
		public Token tmp0;
		public TerminalNode Digits() { return getToken(DSL4DataspacesAntlrParser.Digits, 0); }
		public NatLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_natLiteral; }
	}

	public final NatLiteralContext natLiteral() throws RecognitionException {
		NatLiteralContext _localctx = new NatLiteralContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_natLiteral);
		// getActionForAltBeforeRuleBody
		de.monticore.literals.mccommonliterals._ast.ASTNatLiteralBuilder _builder = dsl4dataspaces.dsl4dataspaces.DSL4DataspacesMill.natLiteralBuilder();
		_builder.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveBuilder(_builder);

		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(108);
			((NatLiteralContext)_localctx).tmp0 = match(Digits);
			_builder.setDigits(convertDigits(((NatLiteralContext)_localctx).tmp0));
			}
			}
			_ctx.stop = _input.LT(-1);
			_builder.set_SourcePositionEnd(computeEndPosition(_input.LT(-1)));
			_localctx.ret = _builder.uncheckedBuild();
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
	public static class SignedNatLiteralContext extends ParserRuleContext {
		public de.monticore.literals.mccommonliterals._ast.ASTSignedNatLiteral ret = null;
		public Token tmp0;
		public Token tmp1;
		public TerminalNode Digits() { return getToken(DSL4DataspacesAntlrParser.Digits, 0); }
		public TerminalNode MINUS() { return getToken(DSL4DataspacesAntlrParser.MINUS, 0); }
		public SignedNatLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signedNatLiteral; }
	}

	public final SignedNatLiteralContext signedNatLiteral() throws RecognitionException {
		SignedNatLiteralContext _localctx = new SignedNatLiteralContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_signedNatLiteral);
		// getActionForAltBeforeRuleBody
		de.monticore.literals.mccommonliterals._ast.ASTSignedNatLiteralBuilder _builder = dsl4dataspaces.dsl4dataspaces.DSL4DataspacesMill.signedNatLiteralBuilder();
		_builder.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveBuilder(_builder);

		try {
			setState(119);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(111);
				if (!(noSpace(2))) throw new FailedPredicateException(this, "noSpace(2)");
				{
				{
				setState(112);
				match(MINUS);

				_builder.setNegative(true);

				}
				}
				{
				setState(115);
				((SignedNatLiteralContext)_localctx).tmp0 = match(Digits);
				_builder.setDigits(convertDigits(((SignedNatLiteralContext)_localctx).tmp0));
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(117);
				((SignedNatLiteralContext)_localctx).tmp1 = match(Digits);
				_builder.setDigits(convertDigits(((SignedNatLiteralContext)_localctx).tmp1));
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			_builder.set_SourcePositionEnd(computeEndPosition(_input.LT(-1)));
			_localctx.ret = _builder.uncheckedBuild();
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
	public static class BasicLongLiteralContext extends ParserRuleContext {
		public de.monticore.literals.mccommonliterals._ast.ASTBasicLongLiteral ret = null;
		public Token tmp0;
		public TerminalNode Digits() { return getToken(DSL4DataspacesAntlrParser.Digits, 0); }
		public Nokeyword_l108Context nokeyword_l108() {
			return getRuleContext(Nokeyword_l108Context.class,0);
		}
		public Nokeyword_L76Context nokeyword_L76() {
			return getRuleContext(Nokeyword_L76Context.class,0);
		}
		public BasicLongLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicLongLiteral; }
	}

	public final BasicLongLiteralContext basicLongLiteral() throws RecognitionException {
		BasicLongLiteralContext _localctx = new BasicLongLiteralContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_basicLongLiteral);
		// getActionForAltBeforeRuleBody
		de.monticore.literals.mccommonliterals._ast.ASTBasicLongLiteralBuilder _builder = dsl4dataspaces.dsl4dataspaces.DSL4DataspacesMill.basicLongLiteralBuilder();
		_builder.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveBuilder(_builder);

		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			if (!(cmpToken(2,"l","L") && noSpace(2))) throw new FailedPredicateException(this, "cmpToken(2,\"l\",\"L\") && noSpace(2)");
			{
			setState(122);
			((BasicLongLiteralContext)_localctx).tmp0 = match(Digits);
			_builder.setDigits(convertDigits(((BasicLongLiteralContext)_localctx).tmp0));
			}
			{
			setState(127);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(125);
				nokeyword_l108();
				}
				break;
			case 2:
				{
				setState(126);
				nokeyword_L76();
				}
				break;
			}
			}
			}
			_ctx.stop = _input.LT(-1);
			_builder.set_SourcePositionEnd(computeEndPosition(_input.LT(-1)));
			_localctx.ret = _builder.uncheckedBuild();
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
	public static class SignedBasicLongLiteralContext extends ParserRuleContext {
		public de.monticore.literals.mccommonliterals._ast.ASTSignedBasicLongLiteral ret = null;
		public Token tmp0;
		public Token tmp1;
		public TerminalNode MINUS() { return getToken(DSL4DataspacesAntlrParser.MINUS, 0); }
		public TerminalNode Digits() { return getToken(DSL4DataspacesAntlrParser.Digits, 0); }
		public Nokeyword_l108Context nokeyword_l108() {
			return getRuleContext(Nokeyword_l108Context.class,0);
		}
		public Nokeyword_L76Context nokeyword_L76() {
			return getRuleContext(Nokeyword_L76Context.class,0);
		}
		public SignedBasicLongLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signedBasicLongLiteral; }
	}

	public final SignedBasicLongLiteralContext signedBasicLongLiteral() throws RecognitionException {
		SignedBasicLongLiteralContext _localctx = new SignedBasicLongLiteralContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_signedBasicLongLiteral);
		// getActionForAltBeforeRuleBody
		de.monticore.literals.mccommonliterals._ast.ASTSignedBasicLongLiteralBuilder _builder = dsl4dataspaces.dsl4dataspaces.DSL4DataspacesMill.signedBasicLongLiteralBuilder();
		_builder.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveBuilder(_builder);

		try {
			setState(148);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(129);
				if (!(cmpToken(3,"l","L") && noSpace(2,3))) throw new FailedPredicateException(this, "cmpToken(3,\"l\",\"L\") && noSpace(2,3)");
				{
				setState(130);
				match(MINUS);

				_builder.setNegative(true);

				}
				{
				setState(133);
				((SignedBasicLongLiteralContext)_localctx).tmp0 = match(Digits);
				_builder.setDigits(convertDigits(((SignedBasicLongLiteralContext)_localctx).tmp0));
				}
				{
				setState(138);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(136);
					nokeyword_l108();
					}
					break;
				case 2:
					{
					setState(137);
					nokeyword_L76();
					}
					break;
				}
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(140);
				if (!(cmpToken(2,"l","L") && noSpace(2))) throw new FailedPredicateException(this, "cmpToken(2,\"l\",\"L\") && noSpace(2)");
				{
				setState(141);
				((SignedBasicLongLiteralContext)_localctx).tmp1 = match(Digits);
				_builder.setDigits(convertDigits(((SignedBasicLongLiteralContext)_localctx).tmp1));
				}
				{
				setState(146);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(144);
					nokeyword_l108();
					}
					break;
				case 2:
					{
					setState(145);
					nokeyword_L76();
					}
					break;
				}
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			_builder.set_SourcePositionEnd(computeEndPosition(_input.LT(-1)));
			_localctx.ret = _builder.uncheckedBuild();
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
	public static class BasicFloatLiteralContext extends ParserRuleContext {
		public de.monticore.literals.mccommonliterals._ast.ASTBasicFloatLiteral ret = null;
		public Token tmp0;
		public Token tmp1;
		public TerminalNode POINT() { return getToken(DSL4DataspacesAntlrParser.POINT, 0); }
		public List<TerminalNode> Digits() { return getTokens(DSL4DataspacesAntlrParser.Digits); }
		public TerminalNode Digits(int i) {
			return getToken(DSL4DataspacesAntlrParser.Digits, i);
		}
		public Nokeyword_f102Context nokeyword_f102() {
			return getRuleContext(Nokeyword_f102Context.class,0);
		}
		public Nokeyword_F70Context nokeyword_F70() {
			return getRuleContext(Nokeyword_F70Context.class,0);
		}
		public BasicFloatLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicFloatLiteral; }
	}

	public final BasicFloatLiteralContext basicFloatLiteral() throws RecognitionException {
		BasicFloatLiteralContext _localctx = new BasicFloatLiteralContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_basicFloatLiteral);
		// getActionForAltBeforeRuleBody
		de.monticore.literals.mccommonliterals._ast.ASTBasicFloatLiteralBuilder _builder = dsl4dataspaces.dsl4dataspaces.DSL4DataspacesMill.basicFloatLiteralBuilder();
		_builder.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveBuilder(_builder);

		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			if (!(cmpToken(4,"f","F") && noSpace(2,3,4))) throw new FailedPredicateException(this, "cmpToken(4,\"f\",\"F\") && noSpace(2,3,4)");
			{
			setState(151);
			((BasicFloatLiteralContext)_localctx).tmp0 = match(Digits);
			_builder.setPre(convertDigits(((BasicFloatLiteralContext)_localctx).tmp0));
			}
			setState(154);
			match(POINT);
			{
			setState(155);
			((BasicFloatLiteralContext)_localctx).tmp1 = match(Digits);
			_builder.setPost(convertDigits(((BasicFloatLiteralContext)_localctx).tmp1));
			}
			{
			setState(160);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(158);
				nokeyword_f102();
				}
				break;
			case 2:
				{
				setState(159);
				nokeyword_F70();
				}
				break;
			}
			}
			}
			_ctx.stop = _input.LT(-1);
			_builder.set_SourcePositionEnd(computeEndPosition(_input.LT(-1)));
			_localctx.ret = _builder.uncheckedBuild();
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
	public static class SignedBasicFloatLiteralContext extends ParserRuleContext {
		public de.monticore.literals.mccommonliterals._ast.ASTSignedBasicFloatLiteral ret = null;
		public Token tmp0;
		public Token tmp1;
		public Token tmp2;
		public Token tmp3;
		public TerminalNode POINT() { return getToken(DSL4DataspacesAntlrParser.POINT, 0); }
		public TerminalNode MINUS() { return getToken(DSL4DataspacesAntlrParser.MINUS, 0); }
		public List<TerminalNode> Digits() { return getTokens(DSL4DataspacesAntlrParser.Digits); }
		public TerminalNode Digits(int i) {
			return getToken(DSL4DataspacesAntlrParser.Digits, i);
		}
		public Nokeyword_f102Context nokeyword_f102() {
			return getRuleContext(Nokeyword_f102Context.class,0);
		}
		public Nokeyword_F70Context nokeyword_F70() {
			return getRuleContext(Nokeyword_F70Context.class,0);
		}
		public SignedBasicFloatLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signedBasicFloatLiteral; }
	}

	public final SignedBasicFloatLiteralContext signedBasicFloatLiteral() throws RecognitionException {
		SignedBasicFloatLiteralContext _localctx = new SignedBasicFloatLiteralContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_signedBasicFloatLiteral);
		// getActionForAltBeforeRuleBody
		de.monticore.literals.mccommonliterals._ast.ASTSignedBasicFloatLiteralBuilder _builder = dsl4dataspaces.dsl4dataspaces.DSL4DataspacesMill.signedBasicFloatLiteralBuilder();
		_builder.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveBuilder(_builder);

		try {
			setState(189);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(162);
				if (!(cmpToken(5,"f","F") && noSpace(2,3,4,5))) throw new FailedPredicateException(this, "cmpToken(5,\"f\",\"F\") && noSpace(2,3,4,5)");
				{
				setState(163);
				match(MINUS);

				_builder.setNegative(true);

				}
				{
				setState(166);
				((SignedBasicFloatLiteralContext)_localctx).tmp0 = match(Digits);
				_builder.setPre(convertDigits(((SignedBasicFloatLiteralContext)_localctx).tmp0));
				}
				setState(169);
				match(POINT);
				{
				setState(170);
				((SignedBasicFloatLiteralContext)_localctx).tmp1 = match(Digits);
				_builder.setPost(convertDigits(((SignedBasicFloatLiteralContext)_localctx).tmp1));
				}
				{
				setState(175);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(173);
					nokeyword_f102();
					}
					break;
				case 2:
					{
					setState(174);
					nokeyword_F70();
					}
					break;
				}
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(177);
				if (!(cmpToken(4,"f","F") && noSpace(2,3,4))) throw new FailedPredicateException(this, "cmpToken(4,\"f\",\"F\") && noSpace(2,3,4)");
				{
				setState(178);
				((SignedBasicFloatLiteralContext)_localctx).tmp2 = match(Digits);
				_builder.setPre(convertDigits(((SignedBasicFloatLiteralContext)_localctx).tmp2));
				}
				setState(181);
				match(POINT);
				{
				setState(182);
				((SignedBasicFloatLiteralContext)_localctx).tmp3 = match(Digits);
				_builder.setPost(convertDigits(((SignedBasicFloatLiteralContext)_localctx).tmp3));
				}
				{
				setState(187);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(185);
					nokeyword_f102();
					}
					break;
				case 2:
					{
					setState(186);
					nokeyword_F70();
					}
					break;
				}
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			_builder.set_SourcePositionEnd(computeEndPosition(_input.LT(-1)));
			_localctx.ret = _builder.uncheckedBuild();
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
	public static class BasicDoubleLiteralContext extends ParserRuleContext {
		public de.monticore.literals.mccommonliterals._ast.ASTBasicDoubleLiteral ret = null;
		public Token tmp0;
		public Token tmp1;
		public TerminalNode POINT() { return getToken(DSL4DataspacesAntlrParser.POINT, 0); }
		public List<TerminalNode> Digits() { return getTokens(DSL4DataspacesAntlrParser.Digits); }
		public TerminalNode Digits(int i) {
			return getToken(DSL4DataspacesAntlrParser.Digits, i);
		}
		public BasicDoubleLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicDoubleLiteral; }
	}

	public final BasicDoubleLiteralContext basicDoubleLiteral() throws RecognitionException {
		BasicDoubleLiteralContext _localctx = new BasicDoubleLiteralContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_basicDoubleLiteral);
		// getActionForAltBeforeRuleBody
		de.monticore.literals.mccommonliterals._ast.ASTBasicDoubleLiteralBuilder _builder = dsl4dataspaces.dsl4dataspaces.DSL4DataspacesMill.basicDoubleLiteralBuilder();
		_builder.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveBuilder(_builder);

		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			if (!(noSpace(2,3))) throw new FailedPredicateException(this, "noSpace(2,3)");
			{
			setState(192);
			((BasicDoubleLiteralContext)_localctx).tmp0 = match(Digits);
			_builder.setPre(convertDigits(((BasicDoubleLiteralContext)_localctx).tmp0));
			}
			setState(195);
			match(POINT);
			{
			setState(196);
			((BasicDoubleLiteralContext)_localctx).tmp1 = match(Digits);
			_builder.setPost(convertDigits(((BasicDoubleLiteralContext)_localctx).tmp1));
			}
			}
			_ctx.stop = _input.LT(-1);
			_builder.set_SourcePositionEnd(computeEndPosition(_input.LT(-1)));
			_localctx.ret = _builder.uncheckedBuild();
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
	public static class SignedBasicDoubleLiteralContext extends ParserRuleContext {
		public de.monticore.literals.mccommonliterals._ast.ASTSignedBasicDoubleLiteral ret = null;
		public Token tmp0;
		public Token tmp1;
		public Token tmp2;
		public Token tmp3;
		public TerminalNode POINT() { return getToken(DSL4DataspacesAntlrParser.POINT, 0); }
		public TerminalNode MINUS() { return getToken(DSL4DataspacesAntlrParser.MINUS, 0); }
		public List<TerminalNode> Digits() { return getTokens(DSL4DataspacesAntlrParser.Digits); }
		public TerminalNode Digits(int i) {
			return getToken(DSL4DataspacesAntlrParser.Digits, i);
		}
		public SignedBasicDoubleLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signedBasicDoubleLiteral; }
	}

	public final SignedBasicDoubleLiteralContext signedBasicDoubleLiteral() throws RecognitionException {
		SignedBasicDoubleLiteralContext _localctx = new SignedBasicDoubleLiteralContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_signedBasicDoubleLiteral);
		// getActionForAltBeforeRuleBody
		de.monticore.literals.mccommonliterals._ast.ASTSignedBasicDoubleLiteralBuilder _builder = dsl4dataspaces.dsl4dataspaces.DSL4DataspacesMill.signedBasicDoubleLiteralBuilder();
		_builder.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveBuilder(_builder);

		try {
			setState(216);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(199);
				if (!(noSpace(2,3,4))) throw new FailedPredicateException(this, "noSpace(2,3,4)");
				{
				setState(200);
				match(MINUS);

				_builder.setNegative(true);

				}
				{
				setState(203);
				((SignedBasicDoubleLiteralContext)_localctx).tmp0 = match(Digits);
				_builder.setPre(convertDigits(((SignedBasicDoubleLiteralContext)_localctx).tmp0));
				}
				setState(206);
				match(POINT);
				{
				setState(207);
				((SignedBasicDoubleLiteralContext)_localctx).tmp1 = match(Digits);
				_builder.setPost(convertDigits(((SignedBasicDoubleLiteralContext)_localctx).tmp1));
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(209);
				if (!(noSpace(2,3))) throw new FailedPredicateException(this, "noSpace(2,3)");
				{
				setState(210);
				((SignedBasicDoubleLiteralContext)_localctx).tmp2 = match(Digits);
				_builder.setPre(convertDigits(((SignedBasicDoubleLiteralContext)_localctx).tmp2));
				}
				setState(213);
				match(POINT);
				{
				setState(214);
				((SignedBasicDoubleLiteralContext)_localctx).tmp3 = match(Digits);
				_builder.setPost(convertDigits(((SignedBasicDoubleLiteralContext)_localctx).tmp3));
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			_builder.set_SourcePositionEnd(computeEndPosition(_input.LT(-1)));
			_localctx.ret = _builder.uncheckedBuild();
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
	public static class IntLiteralContext extends ParserRuleContext {
		public de.monticore.literals.mcjavaliterals._ast.ASTIntLiteral ret = null;
		public Token tmp0;
		public TerminalNode Num_Int() { return getToken(DSL4DataspacesAntlrParser.Num_Int, 0); }
		public IntLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intLiteral; }
	}

	public final IntLiteralContext intLiteral() throws RecognitionException {
		IntLiteralContext _localctx = new IntLiteralContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_intLiteral);
		// getActionForAltBeforeRuleBody
		de.monticore.literals.mcjavaliterals._ast.ASTIntLiteralBuilder _builder = dsl4dataspaces.dsl4dataspaces.DSL4DataspacesMill.intLiteralBuilder();
		_builder.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveBuilder(_builder);

		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(218);
			((IntLiteralContext)_localctx).tmp0 = match(Num_Int);
			_builder.setSource(convertNum_Int(((IntLiteralContext)_localctx).tmp0));
			}
			}
			_ctx.stop = _input.LT(-1);
			_builder.set_SourcePositionEnd(computeEndPosition(_input.LT(-1)));
			_localctx.ret = _builder.uncheckedBuild();
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
	public static class LongLiteralContext extends ParserRuleContext {
		public de.monticore.literals.mcjavaliterals._ast.ASTLongLiteral ret = null;
		public Token tmp0;
		public TerminalNode Num_Long() { return getToken(DSL4DataspacesAntlrParser.Num_Long, 0); }
		public LongLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_longLiteral; }
	}

	public final LongLiteralContext longLiteral() throws RecognitionException {
		LongLiteralContext _localctx = new LongLiteralContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_longLiteral);
		// getActionForAltBeforeRuleBody
		de.monticore.literals.mcjavaliterals._ast.ASTLongLiteralBuilder _builder = dsl4dataspaces.dsl4dataspaces.DSL4DataspacesMill.longLiteralBuilder();
		_builder.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveBuilder(_builder);

		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(221);
			((LongLiteralContext)_localctx).tmp0 = match(Num_Long);
			_builder.setSource(convertNum_Long(((LongLiteralContext)_localctx).tmp0));
			}
			}
			_ctx.stop = _input.LT(-1);
			_builder.set_SourcePositionEnd(computeEndPosition(_input.LT(-1)));
			_localctx.ret = _builder.uncheckedBuild();
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
	public static class FloatLiteralContext extends ParserRuleContext {
		public de.monticore.literals.mcjavaliterals._ast.ASTFloatLiteral ret = null;
		public Token tmp0;
		public TerminalNode Num_Float() { return getToken(DSL4DataspacesAntlrParser.Num_Float, 0); }
		public FloatLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatLiteral; }
	}

	public final FloatLiteralContext floatLiteral() throws RecognitionException {
		FloatLiteralContext _localctx = new FloatLiteralContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_floatLiteral);
		// getActionForAltBeforeRuleBody
		de.monticore.literals.mcjavaliterals._ast.ASTFloatLiteralBuilder _builder = dsl4dataspaces.dsl4dataspaces.DSL4DataspacesMill.floatLiteralBuilder();
		_builder.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveBuilder(_builder);

		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(224);
			((FloatLiteralContext)_localctx).tmp0 = match(Num_Float);
			_builder.setSource(convertNum_Float(((FloatLiteralContext)_localctx).tmp0));
			}
			}
			_ctx.stop = _input.LT(-1);
			_builder.set_SourcePositionEnd(computeEndPosition(_input.LT(-1)));
			_localctx.ret = _builder.uncheckedBuild();
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
	public static class DoubleLiteralContext extends ParserRuleContext {
		public de.monticore.literals.mcjavaliterals._ast.ASTDoubleLiteral ret = null;
		public Token tmp0;
		public TerminalNode Num_Double() { return getToken(DSL4DataspacesAntlrParser.Num_Double, 0); }
		public DoubleLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doubleLiteral; }
	}

	public final DoubleLiteralContext doubleLiteral() throws RecognitionException {
		DoubleLiteralContext _localctx = new DoubleLiteralContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_doubleLiteral);
		// getActionForAltBeforeRuleBody
		de.monticore.literals.mcjavaliterals._ast.ASTDoubleLiteralBuilder _builder = dsl4dataspaces.dsl4dataspaces.DSL4DataspacesMill.doubleLiteralBuilder();
		_builder.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveBuilder(_builder);

		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(227);
			((DoubleLiteralContext)_localctx).tmp0 = match(Num_Double);
			_builder.setSource(convertNum_Double(((DoubleLiteralContext)_localctx).tmp0));
			}
			}
			_ctx.stop = _input.LT(-1);
			_builder.set_SourcePositionEnd(computeEndPosition(_input.LT(-1)));
			_localctx.ret = _builder.uncheckedBuild();
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
	public static class MCQualifiedNameContext extends ParserRuleContext {
		public de.monticore.types.mcbasictypes._ast.ASTMCQualifiedName ret = null;
		public Token tmp0;
		public Token tmp1;
		public List<TerminalNode> Name() { return getTokens(DSL4DataspacesAntlrParser.Name); }
		public TerminalNode Name(int i) {
			return getToken(DSL4DataspacesAntlrParser.Name, i);
		}
		public List<TerminalNode> POINT() { return getTokens(DSL4DataspacesAntlrParser.POINT); }
		public TerminalNode POINT(int i) {
			return getToken(DSL4DataspacesAntlrParser.POINT, i);
		}
		public MCQualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mCQualifiedName; }
	}

	public final MCQualifiedNameContext mCQualifiedName() throws RecognitionException {
		MCQualifiedNameContext _localctx = new MCQualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_mCQualifiedName);
		// getActionForAltBeforeRuleBody
		de.monticore.types.mcbasictypes._ast.ASTMCQualifiedNameBuilder _builder = dsl4dataspaces.dsl4dataspaces.DSL4DataspacesMill.mCQualifiedNameBuilder();
		_builder.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveBuilder(_builder);

		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			{
			setState(230);
			((MCQualifiedNameContext)_localctx).tmp0 = match(Name);
			 addToIteratedAttributeIfNotNull(_builder.getPartsList(), convertName(((MCQualifiedNameContext)_localctx).tmp0));
			}
			setState(238);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(233);
					match(POINT);
					{
					setState(234);
					((MCQualifiedNameContext)_localctx).tmp1 = match(Name);
					 addToIteratedAttributeIfNotNull(_builder.getPartsList(), convertName(((MCQualifiedNameContext)_localctx).tmp1));
					}
					}
					} 
				}
				setState(240);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			}
			}
			_ctx.stop = _input.LT(-1);
			_builder.set_SourcePositionEnd(computeEndPosition(_input.LT(-1)));
			_localctx.ret = _builder.uncheckedBuild();
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
	public static class MCPackageDeclarationContext extends ParserRuleContext {
		public de.monticore.types.mcbasictypes._ast.ASTMCPackageDeclaration ret = null;
		public MCQualifiedNameContext tmp0;
		public TerminalNode PACKAGE3487904838() { return getToken(DSL4DataspacesAntlrParser.PACKAGE3487904838, 0); }
		public TerminalNode SEMI() { return getToken(DSL4DataspacesAntlrParser.SEMI, 0); }
		public MCQualifiedNameContext mCQualifiedName() {
			return getRuleContext(MCQualifiedNameContext.class,0);
		}
		public MCPackageDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mCPackageDeclaration; }
	}

	public final MCPackageDeclarationContext mCPackageDeclaration() throws RecognitionException {
		MCPackageDeclarationContext _localctx = new MCPackageDeclarationContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_mCPackageDeclaration);
		// getActionForAltBeforeRuleBody
		de.monticore.types.mcbasictypes._ast.ASTMCPackageDeclarationBuilder _builder = dsl4dataspaces.dsl4dataspaces.DSL4DataspacesMill.mCPackageDeclarationBuilder();
		_builder.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveBuilder(_builder);

		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			match(PACKAGE3487904838);
			setState(242);
			((MCPackageDeclarationContext)_localctx).tmp0 = mCQualifiedName();
			_builder.setMCQualifiedName(_localctx.tmp0.ret);
			setState(244);
			match(SEMI);
			}
			_ctx.stop = _input.LT(-1);
			_builder.set_SourcePositionEnd(computeEndPosition(_input.LT(-1)));
			_localctx.ret = _builder.uncheckedBuild();
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
	public static class MCImportStatementContext extends ParserRuleContext {
		public de.monticore.types.mcbasictypes._ast.ASTMCImportStatement ret = null;
		public MCQualifiedNameContext tmp0;
		public TerminalNode IMPORT3110171557() { return getToken(DSL4DataspacesAntlrParser.IMPORT3110171557, 0); }
		public TerminalNode SEMI() { return getToken(DSL4DataspacesAntlrParser.SEMI, 0); }
		public MCQualifiedNameContext mCQualifiedName() {
			return getRuleContext(MCQualifiedNameContext.class,0);
		}
		public TerminalNode POINT() { return getToken(DSL4DataspacesAntlrParser.POINT, 0); }
		public TerminalNode STAR() { return getToken(DSL4DataspacesAntlrParser.STAR, 0); }
		public MCImportStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mCImportStatement; }
	}

	public final MCImportStatementContext mCImportStatement() throws RecognitionException {
		MCImportStatementContext _localctx = new MCImportStatementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_mCImportStatement);
		// getActionForAltBeforeRuleBody
		de.monticore.types.mcbasictypes._ast.ASTMCImportStatementBuilder _builder = dsl4dataspaces.dsl4dataspaces.DSL4DataspacesMill.mCImportStatementBuilder();
		_builder.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveBuilder(_builder);

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			match(IMPORT3110171557);
			setState(247);
			((MCImportStatementContext)_localctx).tmp0 = mCQualifiedName();
			_builder.setMCQualifiedName(_localctx.tmp0.ret);
			setState(252);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==POINT) {
				{
				setState(249);
				match(POINT);
				{
				setState(250);
				match(STAR);

				_builder.setStar(true);

				}
				}
			}

			setState(254);
			match(SEMI);
			}
			_ctx.stop = _input.LT(-1);
			_builder.set_SourcePositionEnd(computeEndPosition(_input.LT(-1)));
			_localctx.ret = _builder.uncheckedBuild();
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
	public static class MCPrimitiveTypeContext extends ParserRuleContext {
		public de.monticore.types.mcbasictypes._ast.ASTMCPrimitiveType ret = null;
		public TerminalNode BOOLEAN64711720() { return getToken(DSL4DataspacesAntlrParser.BOOLEAN64711720, 0); }
		public TerminalNode BYTE3039496() { return getToken(DSL4DataspacesAntlrParser.BYTE3039496, 0); }
		public TerminalNode SHORT109413500() { return getToken(DSL4DataspacesAntlrParser.SHORT109413500, 0); }
		public TerminalNode INT104431() { return getToken(DSL4DataspacesAntlrParser.INT104431, 0); }
		public TerminalNode LONG3327612() { return getToken(DSL4DataspacesAntlrParser.LONG3327612, 0); }
		public TerminalNode CHAR3052374() { return getToken(DSL4DataspacesAntlrParser.CHAR3052374, 0); }
		public TerminalNode FLOAT97526364() { return getToken(DSL4DataspacesAntlrParser.FLOAT97526364, 0); }
		public TerminalNode DOUBLE2969009105() { return getToken(DSL4DataspacesAntlrParser.DOUBLE2969009105, 0); }
		public MCPrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mCPrimitiveType; }
	}

	public final MCPrimitiveTypeContext mCPrimitiveType() throws RecognitionException {
		MCPrimitiveTypeContext _localctx = new MCPrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_mCPrimitiveType);
		// getActionForAltBeforeRuleBody
		de.monticore.types.mcbasictypes._ast.ASTMCPrimitiveTypeBuilder _builder = dsl4dataspaces.dsl4dataspaces.DSL4DataspacesMill.mCPrimitiveTypeBuilder();
		_builder.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveBuilder(_builder);

		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN64711720:
				{
				setState(256);
				match(BOOLEAN64711720);

				_builder.setPrimitive(de.monticore.types.mcbasictypes._ast.ASTConstantsMCBasicTypes.BOOLEAN);

				}
				break;
			case BYTE3039496:
				{
				setState(258);
				match(BYTE3039496);

				_builder.setPrimitive(de.monticore.types.mcbasictypes._ast.ASTConstantsMCBasicTypes.BYTE);

				}
				break;
			case SHORT109413500:
				{
				setState(260);
				match(SHORT109413500);

				_builder.setPrimitive(de.monticore.types.mcbasictypes._ast.ASTConstantsMCBasicTypes.SHORT);

				}
				break;
			case INT104431:
				{
				setState(262);
				match(INT104431);

				_builder.setPrimitive(de.monticore.types.mcbasictypes._ast.ASTConstantsMCBasicTypes.INT);

				}
				break;
			case LONG3327612:
				{
				setState(264);
				match(LONG3327612);

				_builder.setPrimitive(de.monticore.types.mcbasictypes._ast.ASTConstantsMCBasicTypes.LONG);

				}
				break;
			case CHAR3052374:
				{
				setState(266);
				match(CHAR3052374);

				_builder.setPrimitive(de.monticore.types.mcbasictypes._ast.ASTConstantsMCBasicTypes.CHAR);

				}
				break;
			case FLOAT97526364:
				{
				setState(268);
				match(FLOAT97526364);

				_builder.setPrimitive(de.monticore.types.mcbasictypes._ast.ASTConstantsMCBasicTypes.FLOAT);

				}
				break;
			case DOUBLE2969009105:
				{
				setState(270);
				match(DOUBLE2969009105);

				_builder.setPrimitive(de.monticore.types.mcbasictypes._ast.ASTConstantsMCBasicTypes.DOUBLE);

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
			_ctx.stop = _input.LT(-1);
			_builder.set_SourcePositionEnd(computeEndPosition(_input.LT(-1)));
			_localctx.ret = _builder.uncheckedBuild();
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
	public static class MCQualifiedTypeContext extends ParserRuleContext {
		public de.monticore.types.mcbasictypes._ast.ASTMCQualifiedType ret = null;
		public MCQualifiedNameContext tmp0;
		public MCQualifiedNameContext mCQualifiedName() {
			return getRuleContext(MCQualifiedNameContext.class,0);
		}
		public MCQualifiedTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mCQualifiedType; }
	}

	public final MCQualifiedTypeContext mCQualifiedType() throws RecognitionException {
		MCQualifiedTypeContext _localctx = new MCQualifiedTypeContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_mCQualifiedType);
		// getActionForAltBeforeRuleBody
		de.monticore.types.mcbasictypes._ast.ASTMCQualifiedTypeBuilder _builder = dsl4dataspaces.dsl4dataspaces.DSL4DataspacesMill.mCQualifiedTypeBuilder();
		_builder.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveBuilder(_builder);

		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			((MCQualifiedTypeContext)_localctx).tmp0 = mCQualifiedName();
			_builder.setMCQualifiedName(_localctx.tmp0.ret);
			}
			_ctx.stop = _input.LT(-1);
			_builder.set_SourcePositionEnd(computeEndPosition(_input.LT(-1)));
			_localctx.ret = _builder.uncheckedBuild();
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
	public static class MCReturnTypeContext extends ParserRuleContext {
		public de.monticore.types.mcbasictypes._ast.ASTMCReturnType ret = null;
		public MCVoidTypeContext tmp0;
		public MCTypeContext tmp1;
		public MCVoidTypeContext mCVoidType() {
			return getRuleContext(MCVoidTypeContext.class,0);
		}
		public MCTypeContext mCType() {
			return getRuleContext(MCTypeContext.class,0);
		}
		public MCReturnTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mCReturnType; }
	}

	public final MCReturnTypeContext mCReturnType() throws RecognitionException {
		MCReturnTypeContext _localctx = new MCReturnTypeContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_mCReturnType);
		// getActionForAltBeforeRuleBody
		de.monticore.types.mcbasictypes._ast.ASTMCReturnTypeBuilder _builder = dsl4dataspaces.dsl4dataspaces.DSL4DataspacesMill.mCReturnTypeBuilder();
		_builder.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveBuilder(_builder);

		try {
			setState(283);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VOID3625364:
				enterOuterAlt(_localctx, 1);
				{
				setState(277);
				((MCReturnTypeContext)_localctx).tmp0 = mCVoidType();
				_builder.setMCVoidType(_localctx.tmp0.ret);
				}
				break;
			case BOOLEAN64711720:
			case BYTE3039496:
			case SHORT109413500:
			case INT104431:
			case LONG3327612:
			case CHAR3052374:
			case FLOAT97526364:
			case DOUBLE2969009105:
			case Name:
				enterOuterAlt(_localctx, 2);
				{
				setState(280);
				((MCReturnTypeContext)_localctx).tmp1 = mCType();
				_builder.setMCType(_localctx.tmp1.ret);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			_builder.set_SourcePositionEnd(computeEndPosition(_input.LT(-1)));
			_localctx.ret = _builder.uncheckedBuild();
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
	public static class MCVoidTypeContext extends ParserRuleContext {
		public de.monticore.types.mcbasictypes._ast.ASTMCVoidType ret = null;
		public TerminalNode VOID3625364() { return getToken(DSL4DataspacesAntlrParser.VOID3625364, 0); }
		public MCVoidTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mCVoidType; }
	}

	public final MCVoidTypeContext mCVoidType() throws RecognitionException {
		MCVoidTypeContext _localctx = new MCVoidTypeContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_mCVoidType);
		// getActionForAltBeforeRuleBody
		de.monticore.types.mcbasictypes._ast.ASTMCVoidTypeBuilder _builder = dsl4dataspaces.dsl4dataspaces.DSL4DataspacesMill.mCVoidTypeBuilder();
		_builder.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveBuilder(_builder);

		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			match(VOID3625364);
			}
			_ctx.stop = _input.LT(-1);
			_builder.set_SourcePositionEnd(computeEndPosition(_input.LT(-1)));
			_localctx.ret = _builder.uncheckedBuild();
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
	public static class DataSpaceConnectorConfigurationContext extends ParserRuleContext {
		public dsl4dataspaces.dsl4dataspaces._ast.ASTDataSpaceConnectorConfiguration ret = null;
		public Token tmp0;
		public ConfigurationElementsContext tmp1;
		public TerminalNode LEXNAME0() { return getToken(DSL4DataspacesAntlrParser.LEXNAME0, 0); }
		public TerminalNode LCURLY() { return getToken(DSL4DataspacesAntlrParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(DSL4DataspacesAntlrParser.RCURLY, 0); }
		public TerminalNode Name() { return getToken(DSL4DataspacesAntlrParser.Name, 0); }
		public List<ConfigurationElementsContext> configurationElements() {
			return getRuleContexts(ConfigurationElementsContext.class);
		}
		public ConfigurationElementsContext configurationElements(int i) {
			return getRuleContext(ConfigurationElementsContext.class,i);
		}
		public DataSpaceConnectorConfigurationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataSpaceConnectorConfiguration; }
	}

	public final DataSpaceConnectorConfigurationContext dataSpaceConnectorConfiguration() throws RecognitionException {
		DataSpaceConnectorConfigurationContext _localctx = new DataSpaceConnectorConfigurationContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_dataSpaceConnectorConfiguration);
		// getActionForAltBeforeRuleBody
		dsl4dataspaces.dsl4dataspaces._ast.ASTDataSpaceConnectorConfigurationBuilder _builder = dsl4dataspaces.dsl4dataspaces.DSL4DataspacesMill.dataSpaceConnectorConfigurationBuilder();
		_builder.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveBuilder(_builder);

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			match(LEXNAME0);
			{
			setState(288);
			((DataSpaceConnectorConfigurationContext)_localctx).tmp0 = match(Name);
			_builder.setName(convertName(((DataSpaceConnectorConfigurationContext)_localctx).tmp0));
			}
			setState(291);
			match(LCURLY);
			setState(295); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(292);
				((DataSpaceConnectorConfigurationContext)_localctx).tmp1 = configurationElements();
				addToIteratedAttributeIfNotNull(_builder.getConfigurationElementsList(), _localctx.tmp1.ret);
				}
				}
				setState(297); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 21)) & ~0x3f) == 0 && ((1L << (_la - 21)) & 142937585352705L) != 0) );
			setState(299);
			match(RCURLY);
			}
			_ctx.stop = _input.LT(-1);
			_builder.set_SourcePositionEnd(computeEndPosition(_input.LT(-1)));
			_localctx.ret = _builder.uncheckedBuild();
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
	public static class ComplexNameContext extends ParserRuleContext {
		public dsl4dataspaces.dsl4dataspaces._ast.ASTComplexName ret = null;
		public Token tmp0;
		public Token tmp1;
		public List<TerminalNode> Name() { return getTokens(DSL4DataspacesAntlrParser.Name); }
		public TerminalNode Name(int i) {
			return getToken(DSL4DataspacesAntlrParser.Name, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(DSL4DataspacesAntlrParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(DSL4DataspacesAntlrParser.MINUS, i);
		}
		public ComplexNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complexName; }
	}

	public final ComplexNameContext complexName() throws RecognitionException {
		ComplexNameContext _localctx = new ComplexNameContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_complexName);
		// getActionForAltBeforeRuleBody
		dsl4dataspaces.dsl4dataspaces._ast.ASTComplexNameBuilder _builder = dsl4dataspaces.dsl4dataspaces.DSL4DataspacesMill.complexNameBuilder();
		_builder.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveBuilder(_builder);

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(301);
			((ComplexNameContext)_localctx).tmp0 = match(Name);
			 addToIteratedAttributeIfNotNull(_builder.getNameList(), convertName(((ComplexNameContext)_localctx).tmp0));
			}
			setState(309);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MINUS) {
				{
				{
				setState(304);
				match(MINUS);
				{
				setState(305);
				((ComplexNameContext)_localctx).tmp1 = match(Name);
				 addToIteratedAttributeIfNotNull(_builder.getNameList(), convertName(((ComplexNameContext)_localctx).tmp1));
				}
				}
				}
				setState(311);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			_ctx.stop = _input.LT(-1);
			_builder.set_SourcePositionEnd(computeEndPosition(_input.LT(-1)));
			_localctx.ret = _builder.uncheckedBuild();
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
	public static class DiscoveryDataContext extends ParserRuleContext {
		public dsl4dataspaces.dsl4dataspaces._ast.ASTDiscoveryData ret = null;
		public ComplexNameContext tmp0;
		public StringLiteralContext tmp1;
		public StringLiteralContext tmp2;
		public AssetMetaDataContext tmp3;
		public TerminalNode DISCOVERY4173759920() { return getToken(DSL4DataspacesAntlrParser.DISCOVERY4173759920, 0); }
		public TerminalNode LCURLY() { return getToken(DSL4DataspacesAntlrParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(DSL4DataspacesAntlrParser.RCURLY, 0); }
		public List<TerminalNode> LINKEDASSETID675711922() { return getTokens(DSL4DataspacesAntlrParser.LINKEDASSETID675711922); }
		public TerminalNode LINKEDASSETID675711922(int i) {
			return getToken(DSL4DataspacesAntlrParser.LINKEDASSETID675711922, i);
		}
		public List<TerminalNode> SEMI() { return getTokens(DSL4DataspacesAntlrParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(DSL4DataspacesAntlrParser.SEMI, i);
		}
		public List<TerminalNode> BASEURL3962341598() { return getTokens(DSL4DataspacesAntlrParser.BASEURL3962341598); }
		public TerminalNode BASEURL3962341598(int i) {
			return getToken(DSL4DataspacesAntlrParser.BASEURL3962341598, i);
		}
		public List<TerminalNode> ENDPOINT1741102485() { return getTokens(DSL4DataspacesAntlrParser.ENDPOINT1741102485); }
		public TerminalNode ENDPOINT1741102485(int i) {
			return getToken(DSL4DataspacesAntlrParser.ENDPOINT1741102485, i);
		}
		public List<TerminalNode> IDTYPE3101035253() { return getTokens(DSL4DataspacesAntlrParser.IDTYPE3101035253); }
		public TerminalNode IDTYPE3101035253(int i) {
			return getToken(DSL4DataspacesAntlrParser.IDTYPE3101035253, i);
		}
		public List<ComplexNameContext> complexName() {
			return getRuleContexts(ComplexNameContext.class);
		}
		public ComplexNameContext complexName(int i) {
			return getRuleContext(ComplexNameContext.class,i);
		}
		public List<StringLiteralContext> stringLiteral() {
			return getRuleContexts(StringLiteralContext.class);
		}
		public StringLiteralContext stringLiteral(int i) {
			return getRuleContext(StringLiteralContext.class,i);
		}
		public List<AssetMetaDataContext> assetMetaData() {
			return getRuleContexts(AssetMetaDataContext.class);
		}
		public AssetMetaDataContext assetMetaData(int i) {
			return getRuleContext(AssetMetaDataContext.class,i);
		}
		public List<TerminalNode> URI84300() { return getTokens(DSL4DataspacesAntlrParser.URI84300); }
		public TerminalNode URI84300(int i) {
			return getToken(DSL4DataspacesAntlrParser.URI84300, i);
		}
		public DiscoveryDataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_discoveryData; }
	}

	public final DiscoveryDataContext discoveryData() throws RecognitionException {
		DiscoveryDataContext _localctx = new DiscoveryDataContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_discoveryData);
		// getActionForAltBeforeRuleBody
		dsl4dataspaces.dsl4dataspaces._ast.ASTDiscoveryDataBuilder _builder = dsl4dataspaces.dsl4dataspaces.DSL4DataspacesMill.discoveryDataBuilder();
		_builder.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveBuilder(_builder);

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			match(DISCOVERY4173759920);
			setState(313);
			match(LCURLY);
			setState(339);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 19)) & ~0x3f) == 0 && ((1L << (_la - 19)) & 76965881053185L) != 0)) {
				{
				setState(337);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LINKEDASSETID675711922:
					{
					setState(314);
					match(LINKEDASSETID675711922);
					setState(315);
					((DiscoveryDataContext)_localctx).tmp0 = complexName();
					addToIteratedAttributeIfNotNull(_builder.getAssetIDList(), _localctx.tmp0.ret);
					setState(317);
					match(SEMI);
					}
					break;
				case BASEURL3962341598:
					{
					setState(319);
					match(BASEURL3962341598);
					setState(320);
					((DiscoveryDataContext)_localctx).tmp1 = stringLiteral();
					addToIteratedAttributeIfNotNull(_builder.getBaseUrlList(), _localctx.tmp1.ret);
					setState(322);
					match(SEMI);
					}
					break;
				case ENDPOINT1741102485:
					{
					setState(324);
					match(ENDPOINT1741102485);
					setState(325);
					((DiscoveryDataContext)_localctx).tmp2 = stringLiteral();
					addToIteratedAttributeIfNotNull(_builder.getEndpointList(), _localctx.tmp2.ret);
					setState(327);
					match(SEMI);
					}
					break;
				case IDTYPE3101035253:
					{
					setState(329);
					match(IDTYPE3101035253);
					{
					setState(330);
					match(URI84300);

					_builder.setIdType(true);

					}
					setState(333);
					match(SEMI);
					}
					break;
				case ASSET93121264:
					{
					setState(334);
					((DiscoveryDataContext)_localctx).tmp3 = assetMetaData();
					addToIteratedAttributeIfNotNull(_builder.getAssetMetaDataList(), _localctx.tmp3.ret);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(341);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(342);
			match(RCURLY);
			}
			_ctx.stop = _input.LT(-1);
			_builder.set_SourcePositionEnd(computeEndPosition(_input.LT(-1)));
			_localctx.ret = _builder.uncheckedBuild();
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
	public static class AssetMetaDataContext extends ParserRuleContext {
		public dsl4dataspaces.dsl4dataspaces._ast.ASTAssetMetaData ret = null;
		public ComplexNameContext tmp0;
		public StringLiteralContext tmp1;
		public Token tmp2;
		public StringLiteralContext tmp3;
		public StringLiteralContext tmp4;
		public StringLiteralContext tmp5;
		public StringLiteralContext tmp6;
		public StringLiteralContext tmp7;
		public TerminalNode ASSET93121264() { return getToken(DSL4DataspacesAntlrParser.ASSET93121264, 0); }
		public TerminalNode LCURLY() { return getToken(DSL4DataspacesAntlrParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(DSL4DataspacesAntlrParser.RCURLY, 0); }
		public List<TerminalNode> TITLE110371416() { return getTokens(DSL4DataspacesAntlrParser.TITLE110371416); }
		public TerminalNode TITLE110371416(int i) {
			return getToken(DSL4DataspacesAntlrParser.TITLE110371416, i);
		}
		public List<TerminalNode> SEMI() { return getTokens(DSL4DataspacesAntlrParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(DSL4DataspacesAntlrParser.SEMI, i);
		}
		public List<TerminalNode> DESCRIPTION2570421244() { return getTokens(DSL4DataspacesAntlrParser.DESCRIPTION2570421244); }
		public TerminalNode DESCRIPTION2570421244(int i) {
			return getToken(DSL4DataspacesAntlrParser.DESCRIPTION2570421244, i);
		}
		public List<TerminalNode> PUBLISHER1447404028() { return getTokens(DSL4DataspacesAntlrParser.PUBLISHER1447404028); }
		public TerminalNode PUBLISHER1447404028(int i) {
			return getToken(DSL4DataspacesAntlrParser.PUBLISHER1447404028, i);
		}
		public List<TerminalNode> SIDICODES2535023499() { return getTokens(DSL4DataspacesAntlrParser.SIDICODES2535023499); }
		public TerminalNode SIDICODES2535023499(int i) {
			return getToken(DSL4DataspacesAntlrParser.SIDICODES2535023499, i);
		}
		public List<TerminalNode> LBRACK() { return getTokens(DSL4DataspacesAntlrParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(DSL4DataspacesAntlrParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(DSL4DataspacesAntlrParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(DSL4DataspacesAntlrParser.RBRACK, i);
		}
		public List<TerminalNode> VERSION351608024() { return getTokens(DSL4DataspacesAntlrParser.VERSION351608024); }
		public TerminalNode VERSION351608024(int i) {
			return getToken(DSL4DataspacesAntlrParser.VERSION351608024, i);
		}
		public List<TerminalNode> CREATED1028554472() { return getTokens(DSL4DataspacesAntlrParser.CREATED1028554472); }
		public TerminalNode CREATED1028554472(int i) {
			return getToken(DSL4DataspacesAntlrParser.CREATED1028554472, i);
		}
		public List<TerminalNode> MODIFIED3679453897() { return getTokens(DSL4DataspacesAntlrParser.MODIFIED3679453897); }
		public TerminalNode MODIFIED3679453897(int i) {
			return getToken(DSL4DataspacesAntlrParser.MODIFIED3679453897, i);
		}
		public List<TerminalNode> LANGUAGE2681377624() { return getTokens(DSL4DataspacesAntlrParser.LANGUAGE2681377624); }
		public TerminalNode LANGUAGE2681377624(int i) {
			return getToken(DSL4DataspacesAntlrParser.LANGUAGE2681377624, i);
		}
		public List<StringLiteralContext> stringLiteral() {
			return getRuleContexts(StringLiteralContext.class);
		}
		public StringLiteralContext stringLiteral(int i) {
			return getRuleContext(StringLiteralContext.class,i);
		}
		public List<TerminalNode> DE3201() { return getTokens(DSL4DataspacesAntlrParser.DE3201); }
		public TerminalNode DE3201(int i) {
			return getToken(DSL4DataspacesAntlrParser.DE3201, i);
		}
		public List<TerminalNode> EN3241() { return getTokens(DSL4DataspacesAntlrParser.EN3241); }
		public TerminalNode EN3241(int i) {
			return getToken(DSL4DataspacesAntlrParser.EN3241, i);
		}
		public List<TerminalNode> NL3518() { return getTokens(DSL4DataspacesAntlrParser.NL3518); }
		public TerminalNode NL3518(int i) {
			return getToken(DSL4DataspacesAntlrParser.NL3518, i);
		}
		public List<ComplexNameContext> complexName() {
			return getRuleContexts(ComplexNameContext.class);
		}
		public ComplexNameContext complexName(int i) {
			return getRuleContext(ComplexNameContext.class,i);
		}
		public List<TerminalNode> Name() { return getTokens(DSL4DataspacesAntlrParser.Name); }
		public TerminalNode Name(int i) {
			return getToken(DSL4DataspacesAntlrParser.Name, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DSL4DataspacesAntlrParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DSL4DataspacesAntlrParser.COMMA, i);
		}
		public AssetMetaDataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assetMetaData; }
	}

	public final AssetMetaDataContext assetMetaData() throws RecognitionException {
		AssetMetaDataContext _localctx = new AssetMetaDataContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_assetMetaData);
		// getActionForAltBeforeRuleBody
		dsl4dataspaces.dsl4dataspaces._ast.ASTAssetMetaDataBuilder _builder = dsl4dataspaces.dsl4dataspaces.DSL4DataspacesMill.assetMetaDataBuilder();
		_builder.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveBuilder(_builder);

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(344);
			match(ASSET93121264);
			setState(345);
			match(LCURLY);
			setState(413);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 11003844629056L) != 0)) {
				{
				setState(411);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TITLE110371416:
					{
					setState(346);
					match(TITLE110371416);
					setState(350); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(347);
						((AssetMetaDataContext)_localctx).tmp0 = complexName();
						addToIteratedAttributeIfNotNull(_builder.getTitleList(), _localctx.tmp0.ret);
						}
						}
						setState(352); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==Name );
					setState(354);
					match(SEMI);
					}
					break;
				case DESCRIPTION2570421244:
					{
					setState(356);
					match(DESCRIPTION2570421244);
					setState(357);
					((AssetMetaDataContext)_localctx).tmp1 = stringLiteral();
					addToIteratedAttributeIfNotNull(_builder.getDescriptionList(), _localctx.tmp1.ret);
					setState(359);
					match(SEMI);
					}
					break;
				case PUBLISHER1447404028:
					{
					setState(361);
					match(PUBLISHER1447404028);
					setState(364); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(362);
						((AssetMetaDataContext)_localctx).tmp2 = match(Name);
						 addToIteratedAttributeIfNotNull(_builder.getPublisherList(), convertName(((AssetMetaDataContext)_localctx).tmp2));
						}
						}
						setState(366); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==Name );
					setState(368);
					match(SEMI);
					}
					break;
				case SIDICODES2535023499:
					{
					setState(369);
					match(SIDICODES2535023499);
					setState(370);
					match(LBRACK);
					setState(382);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==String) {
						{
						setState(371);
						((AssetMetaDataContext)_localctx).tmp3 = stringLiteral();
						addToIteratedAttributeIfNotNull(_builder.getStringLiteralList(), _localctx.tmp3.ret);
						setState(379);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(373);
							match(COMMA);
							setState(374);
							((AssetMetaDataContext)_localctx).tmp4 = stringLiteral();
							addToIteratedAttributeIfNotNull(_builder.getStringLiteralList(), _localctx.tmp4.ret);
							}
							}
							setState(381);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					setState(384);
					match(RBRACK);
					setState(385);
					match(SEMI);
					}
					break;
				case VERSION351608024:
					{
					setState(386);
					match(VERSION351608024);
					setState(387);
					((AssetMetaDataContext)_localctx).tmp5 = stringLiteral();
					addToIteratedAttributeIfNotNull(_builder.getVersionList(), _localctx.tmp5.ret);
					setState(389);
					match(SEMI);
					}
					break;
				case CREATED1028554472:
					{
					setState(391);
					match(CREATED1028554472);
					setState(392);
					((AssetMetaDataContext)_localctx).tmp6 = stringLiteral();
					addToIteratedAttributeIfNotNull(_builder.getCreatedList(), _localctx.tmp6.ret);
					setState(394);
					match(SEMI);
					}
					break;
				case MODIFIED3679453897:
					{
					setState(396);
					match(MODIFIED3679453897);
					setState(397);
					((AssetMetaDataContext)_localctx).tmp7 = stringLiteral();
					addToIteratedAttributeIfNotNull(_builder.getModifiedList(), _localctx.tmp7.ret);
					setState(399);
					match(SEMI);
					}
					break;
				case LANGUAGE2681377624:
					{
					setState(401);
					match(LANGUAGE2681377624);
					setState(408);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case DE3201:
						{
						setState(402);
						match(DE3201);

						_builder.setLanguage(dsl4dataspaces.dsl4dataspaces._ast.ASTConstantsDSL4Dataspaces.DE);

						}
						break;
					case EN3241:
						{
						setState(404);
						match(EN3241);

						_builder.setLanguage(dsl4dataspaces.dsl4dataspaces._ast.ASTConstantsDSL4Dataspaces.EN);

						}
						break;
					case NL3518:
						{
						setState(406);
						match(NL3518);

						_builder.setLanguage(dsl4dataspaces.dsl4dataspaces._ast.ASTConstantsDSL4Dataspaces.NL);

						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(410);
					match(SEMI);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(415);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(416);
			match(RCURLY);
			}
			_ctx.stop = _input.LT(-1);
			_builder.set_SourcePositionEnd(computeEndPosition(_input.LT(-1)));
			_localctx.ret = _builder.uncheckedBuild();
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
	public static class BaseUsageContext extends ParserRuleContext {
		public dsl4dataspaces.dsl4dataspaces._ast.ASTBaseUsage ret = null;
		public StringLiteralContext tmp0;
		public StringLiteralContext tmp1;
		public TerminalNode DATAADDRESS1666068714() { return getToken(DSL4DataspacesAntlrParser.DATAADDRESS1666068714, 0); }
		public List<TerminalNode> SEMI() { return getTokens(DSL4DataspacesAntlrParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(DSL4DataspacesAntlrParser.SEMI, i);
		}
		public TerminalNode DATASCHEMAADDRESS258677641() { return getToken(DSL4DataspacesAntlrParser.DATASCHEMAADDRESS258677641, 0); }
		public List<StringLiteralContext> stringLiteral() {
			return getRuleContexts(StringLiteralContext.class);
		}
		public StringLiteralContext stringLiteral(int i) {
			return getRuleContext(StringLiteralContext.class,i);
		}
		public BaseUsageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_baseUsage; }
	}

	public final BaseUsageContext baseUsage() throws RecognitionException {
		BaseUsageContext _localctx = new BaseUsageContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_baseUsage);
		// getActionForAltBeforeRuleBody
		dsl4dataspaces.dsl4dataspaces._ast.ASTBaseUsageBuilder _builder = dsl4dataspaces.dsl4dataspaces.DSL4DataspacesMill.baseUsageBuilder();
		_builder.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveBuilder(_builder);

		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(418);
			match(DATAADDRESS1666068714);
			setState(419);
			((BaseUsageContext)_localctx).tmp0 = stringLiteral();
			_builder.setDataAddress(_localctx.tmp0.ret);
			setState(421);
			match(SEMI);
			setState(422);
			match(DATASCHEMAADDRESS258677641);
			setState(423);
			((BaseUsageContext)_localctx).tmp1 = stringLiteral();
			_builder.setSchemaAddress(_localctx.tmp1.ret);
			setState(425);
			match(SEMI);
			}
			_ctx.stop = _input.LT(-1);
			_builder.set_SourcePositionEnd(computeEndPosition(_input.LT(-1)));
			_localctx.ret = _builder.uncheckedBuild();
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
	public static class OPCUAUsageContext extends ParserRuleContext {
		public dsl4dataspaces.dsl4dataspaces._ast.ASTOPCUAUsage ret = null;
		public BaseUsageContext tmp0;
		public StringLiteralContext tmp1;
		public StringLiteralContext tmp2;
		public StringLiteralContext tmp3;
		public StringLiteralContext tmp4;
		public StringLiteralContext tmp5;
		public StringLiteralContext tmp6;
		public StringLiteralContext tmp7;
		public AccessPolicyContext tmp8;
		public TerminalNode OPCUA105946286() { return getToken(DSL4DataspacesAntlrParser.OPCUA105946286, 0); }
		public TerminalNode USAGE111574433() { return getToken(DSL4DataspacesAntlrParser.USAGE111574433, 0); }
		public TerminalNode LCURLY() { return getToken(DSL4DataspacesAntlrParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(DSL4DataspacesAntlrParser.RCURLY, 0); }
		public List<TerminalNode> SUPPORTEDPROTOCOLS1268839373() { return getTokens(DSL4DataspacesAntlrParser.SUPPORTEDPROTOCOLS1268839373); }
		public TerminalNode SUPPORTEDPROTOCOLS1268839373(int i) {
			return getToken(DSL4DataspacesAntlrParser.SUPPORTEDPROTOCOLS1268839373, i);
		}
		public List<TerminalNode> LBRACK() { return getTokens(DSL4DataspacesAntlrParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(DSL4DataspacesAntlrParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(DSL4DataspacesAntlrParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(DSL4DataspacesAntlrParser.RBRACK, i);
		}
		public List<TerminalNode> SEMI() { return getTokens(DSL4DataspacesAntlrParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(DSL4DataspacesAntlrParser.SEMI, i);
		}
		public List<TerminalNode> SECURITYPOLICY3506346130() { return getTokens(DSL4DataspacesAntlrParser.SECURITYPOLICY3506346130); }
		public TerminalNode SECURITYPOLICY3506346130(int i) {
			return getToken(DSL4DataspacesAntlrParser.SECURITYPOLICY3506346130, i);
		}
		public List<TerminalNode> SECURITYMODE808027395() { return getTokens(DSL4DataspacesAntlrParser.SECURITYMODE808027395); }
		public TerminalNode SECURITYMODE808027395(int i) {
			return getToken(DSL4DataspacesAntlrParser.SECURITYMODE808027395, i);
		}
		public List<TerminalNode> AUTHENTICATIONMODE1705415739() { return getTokens(DSL4DataspacesAntlrParser.AUTHENTICATIONMODE1705415739); }
		public TerminalNode AUTHENTICATIONMODE1705415739(int i) {
			return getToken(DSL4DataspacesAntlrParser.AUTHENTICATIONMODE1705415739, i);
		}
		public List<BaseUsageContext> baseUsage() {
			return getRuleContexts(BaseUsageContext.class);
		}
		public BaseUsageContext baseUsage(int i) {
			return getRuleContext(BaseUsageContext.class,i);
		}
		public List<StringLiteralContext> stringLiteral() {
			return getRuleContexts(StringLiteralContext.class);
		}
		public StringLiteralContext stringLiteral(int i) {
			return getRuleContext(StringLiteralContext.class,i);
		}
		public List<AccessPolicyContext> accessPolicy() {
			return getRuleContexts(AccessPolicyContext.class);
		}
		public AccessPolicyContext accessPolicy(int i) {
			return getRuleContext(AccessPolicyContext.class,i);
		}
		public List<TerminalNode> QOSMETRICS1685033198() { return getTokens(DSL4DataspacesAntlrParser.QOSMETRICS1685033198); }
		public TerminalNode QOSMETRICS1685033198(int i) {
			return getToken(DSL4DataspacesAntlrParser.QOSMETRICS1685033198, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DSL4DataspacesAntlrParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DSL4DataspacesAntlrParser.COMMA, i);
		}
		public OPCUAUsageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oPCUAUsage; }
	}

	public final OPCUAUsageContext oPCUAUsage() throws RecognitionException {
		OPCUAUsageContext _localctx = new OPCUAUsageContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_oPCUAUsage);
		// getActionForAltBeforeRuleBody
		dsl4dataspaces.dsl4dataspaces._ast.ASTOPCUAUsageBuilder _builder = dsl4dataspaces.dsl4dataspaces.DSL4DataspacesMill.oPCUAUsageBuilder();
		_builder.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveBuilder(_builder);

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(427);
			match(OPCUA105946286);
			setState(428);
			match(USAGE111574433);
			setState(429);
			match(LCURLY);
			setState(487);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 865817578135633922L) != 0)) {
				{
				setState(485);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DATAADDRESS1666068714:
					{
					setState(430);
					((OPCUAUsageContext)_localctx).tmp0 = baseUsage();
					addToIteratedAttributeIfNotNull(_builder.getBaseUsageList(), _localctx.tmp0.ret);
					}
					break;
				case SUPPORTEDPROTOCOLS1268839373:
					{
					setState(433);
					match(SUPPORTEDPROTOCOLS1268839373);
					setState(434);
					match(LBRACK);
					setState(446);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==String) {
						{
						setState(435);
						((OPCUAUsageContext)_localctx).tmp1 = stringLiteral();
						addToIteratedAttributeIfNotNull(_builder.getStringLiteralList(), _localctx.tmp1.ret);
						setState(443);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(437);
							match(COMMA);
							setState(438);
							((OPCUAUsageContext)_localctx).tmp2 = stringLiteral();
							addToIteratedAttributeIfNotNull(_builder.getStringLiteralList(), _localctx.tmp2.ret);
							}
							}
							setState(445);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					setState(448);
					match(RBRACK);
					setState(449);
					match(SEMI);
					}
					break;
				case QOSMETRICS1685033198:
				case RBRACK:
					{
					setState(463);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==QOSMETRICS1685033198) {
						{
						setState(450);
						match(QOSMETRICS1685033198);
						setState(451);
						match(LBRACK);
						setState(452);
						((OPCUAUsageContext)_localctx).tmp3 = stringLiteral();
						addToIteratedAttributeIfNotNull(_builder.getStringLiteralList(), _localctx.tmp3.ret);
						setState(460);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(454);
							match(COMMA);
							setState(455);
							((OPCUAUsageContext)_localctx).tmp4 = stringLiteral();
							addToIteratedAttributeIfNotNull(_builder.getStringLiteralList(), _localctx.tmp4.ret);
							}
							}
							setState(462);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					setState(465);
					match(RBRACK);
					setState(466);
					match(SEMI);
					}
					break;
				case SECURITYPOLICY3506346130:
					{
					setState(467);
					match(SECURITYPOLICY3506346130);
					setState(468);
					((OPCUAUsageContext)_localctx).tmp5 = stringLiteral();
					addToIteratedAttributeIfNotNull(_builder.getStringLiteralList(), _localctx.tmp5.ret);
					setState(470);
					match(SEMI);
					}
					break;
				case SECURITYMODE808027395:
					{
					setState(472);
					match(SECURITYMODE808027395);
					setState(473);
					((OPCUAUsageContext)_localctx).tmp6 = stringLiteral();
					addToIteratedAttributeIfNotNull(_builder.getStringLiteralList(), _localctx.tmp6.ret);
					setState(475);
					match(SEMI);
					}
					break;
				case AUTHENTICATIONMODE1705415739:
					{
					setState(477);
					match(AUTHENTICATIONMODE1705415739);
					setState(478);
					((OPCUAUsageContext)_localctx).tmp7 = stringLiteral();
					addToIteratedAttributeIfNotNull(_builder.getStringLiteralList(), _localctx.tmp7.ret);
					setState(480);
					match(SEMI);
					}
					break;
				case ACCESS2871506276:
					{
					setState(482);
					((OPCUAUsageContext)_localctx).tmp8 = accessPolicy();
					addToIteratedAttributeIfNotNull(_builder.getAccessPolicyList(), _localctx.tmp8.ret);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(489);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(490);
			match(RCURLY);
			}
			_ctx.stop = _input.LT(-1);
			_builder.set_SourcePositionEnd(computeEndPosition(_input.LT(-1)));
			_localctx.ret = _builder.uncheckedBuild();
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
	public static class EDCUsageContext extends ParserRuleContext {
		public dsl4dataspaces.dsl4dataspaces._ast.ASTEDCUsage ret = null;
		public BaseUsageContext tmp0;
		public StringLiteralContext tmp1;
		public Token tmp2;
		public Token tmp3;
		public StringLiteralContext tmp4;
		public StringLiteralContext tmp5;
		public StringLiteralContext tmp6;
		public StringLiteralContext tmp7;
		public EDCPushEndpointsConfigContext tmp8;
		public AccessPolicyContext tmp9;
		public TerminalNode EDC100260() { return getToken(DSL4DataspacesAntlrParser.EDC100260, 0); }
		public TerminalNode USAGE111574433() { return getToken(DSL4DataspacesAntlrParser.USAGE111574433, 0); }
		public List<TerminalNode> LCURLY() { return getTokens(DSL4DataspacesAntlrParser.LCURLY); }
		public TerminalNode LCURLY(int i) {
			return getToken(DSL4DataspacesAntlrParser.LCURLY, i);
		}
		public List<TerminalNode> RCURLY() { return getTokens(DSL4DataspacesAntlrParser.RCURLY); }
		public TerminalNode RCURLY(int i) {
			return getToken(DSL4DataspacesAntlrParser.RCURLY, i);
		}
		public List<TerminalNode> REMOTEADDRESS3662708942() { return getTokens(DSL4DataspacesAntlrParser.REMOTEADDRESS3662708942); }
		public TerminalNode REMOTEADDRESS3662708942(int i) {
			return getToken(DSL4DataspacesAntlrParser.REMOTEADDRESS3662708942, i);
		}
		public List<TerminalNode> SEMI() { return getTokens(DSL4DataspacesAntlrParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(DSL4DataspacesAntlrParser.SEMI, i);
		}
		public List<TerminalNode> REMOTEID3782084577() { return getTokens(DSL4DataspacesAntlrParser.REMOTEID3782084577); }
		public TerminalNode REMOTEID3782084577(int i) {
			return getToken(DSL4DataspacesAntlrParser.REMOTEID3782084577, i);
		}
		public List<TerminalNode> XAPIKEY1063285885() { return getTokens(DSL4DataspacesAntlrParser.XAPIKEY1063285885); }
		public TerminalNode XAPIKEY1063285885(int i) {
			return getToken(DSL4DataspacesAntlrParser.XAPIKEY1063285885, i);
		}
		public List<TerminalNode> STSSERVICEADDRESS3595907665() { return getTokens(DSL4DataspacesAntlrParser.STSSERVICEADDRESS3595907665); }
		public TerminalNode STSSERVICEADDRESS3595907665(int i) {
			return getToken(DSL4DataspacesAntlrParser.STSSERVICEADDRESS3595907665, i);
		}
		public List<TerminalNode> REGISTRIES2425415067() { return getTokens(DSL4DataspacesAntlrParser.REGISTRIES2425415067); }
		public TerminalNode REGISTRIES2425415067(int i) {
			return getToken(DSL4DataspacesAntlrParser.REGISTRIES2425415067, i);
		}
		public List<BaseUsageContext> baseUsage() {
			return getRuleContexts(BaseUsageContext.class);
		}
		public BaseUsageContext baseUsage(int i) {
			return getRuleContext(BaseUsageContext.class,i);
		}
		public List<StringLiteralContext> stringLiteral() {
			return getRuleContexts(StringLiteralContext.class);
		}
		public StringLiteralContext stringLiteral(int i) {
			return getRuleContext(StringLiteralContext.class,i);
		}
		public List<EDCPushEndpointsConfigContext> eDCPushEndpointsConfig() {
			return getRuleContexts(EDCPushEndpointsConfigContext.class);
		}
		public EDCPushEndpointsConfigContext eDCPushEndpointsConfig(int i) {
			return getRuleContext(EDCPushEndpointsConfigContext.class,i);
		}
		public List<AccessPolicyContext> accessPolicy() {
			return getRuleContexts(AccessPolicyContext.class);
		}
		public AccessPolicyContext accessPolicy(int i) {
			return getRuleContext(AccessPolicyContext.class,i);
		}
		public List<TerminalNode> Name() { return getTokens(DSL4DataspacesAntlrParser.Name); }
		public TerminalNode Name(int i) {
			return getToken(DSL4DataspacesAntlrParser.Name, i);
		}
		public List<TerminalNode> COLON() { return getTokens(DSL4DataspacesAntlrParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(DSL4DataspacesAntlrParser.COLON, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DSL4DataspacesAntlrParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DSL4DataspacesAntlrParser.COMMA, i);
		}
		public EDCUsageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eDCUsage; }
	}

	public final EDCUsageContext eDCUsage() throws RecognitionException {
		EDCUsageContext _localctx = new EDCUsageContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_eDCUsage);
		// getActionForAltBeforeRuleBody
		dsl4dataspaces.dsl4dataspaces._ast.ASTEDCUsageBuilder _builder = dsl4dataspaces.dsl4dataspaces.DSL4DataspacesMill.eDCUsageBuilder();
		_builder.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveBuilder(_builder);

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(492);
			match(EDC100260);
			setState(493);
			match(USAGE111574433);
			setState(494);
			match(LCURLY);
			setState(551);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 550293832072L) != 0)) {
				{
				setState(549);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DATAADDRESS1666068714:
					{
					setState(495);
					((EDCUsageContext)_localctx).tmp0 = baseUsage();
					addToIteratedAttributeIfNotNull(_builder.getBaseUsageList(), _localctx.tmp0.ret);
					}
					break;
				case REMOTEADDRESS3662708942:
					{
					setState(498);
					match(REMOTEADDRESS3662708942);
					setState(499);
					((EDCUsageContext)_localctx).tmp1 = stringLiteral();
					addToIteratedAttributeIfNotNull(_builder.getStringLiteralList(), _localctx.tmp1.ret);
					setState(501);
					match(SEMI);
					}
					break;
				case REMOTEID3782084577:
					{
					setState(503);
					match(REMOTEID3782084577);
					{
					{
					setState(504);
					((EDCUsageContext)_localctx).tmp2 = match(Name);
					 addToIteratedAttributeIfNotNull(_builder.getNameList(), convertName(((EDCUsageContext)_localctx).tmp2));
					}
					setState(512);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COLON) {
						{
						{
						setState(507);
						match(COLON);
						{
						setState(508);
						((EDCUsageContext)_localctx).tmp3 = match(Name);
						 addToIteratedAttributeIfNotNull(_builder.getNameList(), convertName(((EDCUsageContext)_localctx).tmp3));
						}
						}
						}
						setState(514);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					setState(515);
					match(SEMI);
					}
					break;
				case XAPIKEY1063285885:
					{
					setState(516);
					match(XAPIKEY1063285885);
					setState(517);
					((EDCUsageContext)_localctx).tmp4 = stringLiteral();
					addToIteratedAttributeIfNotNull(_builder.getStringLiteralList(), _localctx.tmp4.ret);
					setState(519);
					match(SEMI);
					}
					break;
				case STSSERVICEADDRESS3595907665:
					{
					setState(521);
					match(STSSERVICEADDRESS3595907665);
					setState(522);
					((EDCUsageContext)_localctx).tmp5 = stringLiteral();
					addToIteratedAttributeIfNotNull(_builder.getStringLiteralList(), _localctx.tmp5.ret);
					setState(524);
					match(SEMI);
					}
					break;
				case REGISTRIES2425415067:
					{
					setState(526);
					match(REGISTRIES2425415067);
					setState(527);
					match(LCURLY);
					setState(539);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==String) {
						{
						setState(528);
						((EDCUsageContext)_localctx).tmp6 = stringLiteral();
						addToIteratedAttributeIfNotNull(_builder.getStringLiteralList(), _localctx.tmp6.ret);
						setState(536);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(530);
							match(COMMA);
							setState(531);
							((EDCUsageContext)_localctx).tmp7 = stringLiteral();
							addToIteratedAttributeIfNotNull(_builder.getStringLiteralList(), _localctx.tmp7.ret);
							}
							}
							setState(538);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					setState(541);
					match(RCURLY);
					setState(542);
					match(SEMI);
					}
					break;
				case PUSH3452698:
					{
					setState(543);
					((EDCUsageContext)_localctx).tmp8 = eDCPushEndpointsConfig();
					addToIteratedAttributeIfNotNull(_builder.getEDCPushEndpointsConfigList(), _localctx.tmp8.ret);
					}
					break;
				case ACCESS2871506276:
					{
					setState(546);
					((EDCUsageContext)_localctx).tmp9 = accessPolicy();
					addToIteratedAttributeIfNotNull(_builder.getAccessPolicyList(), _localctx.tmp9.ret);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(553);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(554);
			match(RCURLY);
			}
			_ctx.stop = _input.LT(-1);
			_builder.set_SourcePositionEnd(computeEndPosition(_input.LT(-1)));
			_localctx.ret = _builder.uncheckedBuild();
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
	public static class EDCPushEndpointsConfigContext extends ParserRuleContext {
		public dsl4dataspaces.dsl4dataspaces._ast.ASTEDCPushEndpointsConfig ret = null;
		public ComplexNameContext tmp0;
		public StringLiteralContext tmp1;
		public ComplexNameContext tmp2;
		public StringLiteralContext tmp3;
		public StringLiteralContext tmp4;
		public TerminalNode PUSH3452698() { return getToken(DSL4DataspacesAntlrParser.PUSH3452698, 0); }
		public TerminalNode ENDPOINTS2434569598() { return getToken(DSL4DataspacesAntlrParser.ENDPOINTS2434569598, 0); }
		public List<TerminalNode> LCURLY() { return getTokens(DSL4DataspacesAntlrParser.LCURLY); }
		public TerminalNode LCURLY(int i) {
			return getToken(DSL4DataspacesAntlrParser.LCURLY, i);
		}
		public List<TerminalNode> RCURLY() { return getTokens(DSL4DataspacesAntlrParser.RCURLY); }
		public TerminalNode RCURLY(int i) {
			return getToken(DSL4DataspacesAntlrParser.RCURLY, i);
		}
		public List<TerminalNode> CLOUDPUSH3868712687() { return getTokens(DSL4DataspacesAntlrParser.CLOUDPUSH3868712687); }
		public TerminalNode CLOUDPUSH3868712687(int i) {
			return getToken(DSL4DataspacesAntlrParser.CLOUDPUSH3868712687, i);
		}
		public List<TerminalNode> SEMI() { return getTokens(DSL4DataspacesAntlrParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(DSL4DataspacesAntlrParser.SEMI, i);
		}
		public List<TerminalNode> CALLBACKADDRESS105567183() { return getTokens(DSL4DataspacesAntlrParser.CALLBACKADDRESS105567183); }
		public TerminalNode CALLBACKADDRESS105567183(int i) {
			return getToken(DSL4DataspacesAntlrParser.CALLBACKADDRESS105567183, i);
		}
		public List<StringLiteralContext> stringLiteral() {
			return getRuleContexts(StringLiteralContext.class);
		}
		public StringLiteralContext stringLiteral(int i) {
			return getRuleContext(StringLiteralContext.class,i);
		}
		public List<TerminalNode> EQUALS() { return getTokens(DSL4DataspacesAntlrParser.EQUALS); }
		public TerminalNode EQUALS(int i) {
			return getToken(DSL4DataspacesAntlrParser.EQUALS, i);
		}
		public List<ComplexNameContext> complexName() {
			return getRuleContexts(ComplexNameContext.class);
		}
		public ComplexNameContext complexName(int i) {
			return getRuleContext(ComplexNameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DSL4DataspacesAntlrParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DSL4DataspacesAntlrParser.COMMA, i);
		}
		public EDCPushEndpointsConfigContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eDCPushEndpointsConfig; }
	}

	public final EDCPushEndpointsConfigContext eDCPushEndpointsConfig() throws RecognitionException {
		EDCPushEndpointsConfigContext _localctx = new EDCPushEndpointsConfigContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_eDCPushEndpointsConfig);
		// getActionForAltBeforeRuleBody
		dsl4dataspaces.dsl4dataspaces._ast.ASTEDCPushEndpointsConfigBuilder _builder = dsl4dataspaces.dsl4dataspaces.DSL4DataspacesMill.eDCPushEndpointsConfigBuilder();
		_builder.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveBuilder(_builder);

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(556);
			match(PUSH3452698);
			setState(557);
			match(ENDPOINTS2434569598);
			setState(558);
			match(LCURLY);
			setState(589);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CALLBACKADDRESS105567183 || _la==CLOUDPUSH3868712687) {
				{
				setState(587);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CLOUDPUSH3868712687:
					{
					setState(559);
					match(CLOUDPUSH3868712687);
					setState(560);
					match(LCURLY);
					setState(578);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Name) {
						{
						setState(561);
						((EDCPushEndpointsConfigContext)_localctx).tmp0 = complexName();
						addToIteratedAttributeIfNotNull(_builder.getComplexNameList(), _localctx.tmp0.ret);
						setState(563);
						match(EQUALS);
						setState(564);
						((EDCPushEndpointsConfigContext)_localctx).tmp1 = stringLiteral();
						addToIteratedAttributeIfNotNull(_builder.getStringLiteralList(), _localctx.tmp1.ret);
						setState(575);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(566);
							match(COMMA);
							setState(567);
							((EDCPushEndpointsConfigContext)_localctx).tmp2 = complexName();
							addToIteratedAttributeIfNotNull(_builder.getComplexNameList(), _localctx.tmp2.ret);
							setState(569);
							match(EQUALS);
							setState(570);
							((EDCPushEndpointsConfigContext)_localctx).tmp3 = stringLiteral();
							addToIteratedAttributeIfNotNull(_builder.getStringLiteralList(), _localctx.tmp3.ret);
							}
							}
							setState(577);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					setState(580);
					match(RCURLY);
					setState(581);
					match(SEMI);
					}
					break;
				case CALLBACKADDRESS105567183:
					{
					setState(582);
					match(CALLBACKADDRESS105567183);
					setState(583);
					((EDCPushEndpointsConfigContext)_localctx).tmp4 = stringLiteral();
					addToIteratedAttributeIfNotNull(_builder.getStringLiteralList(), _localctx.tmp4.ret);
					setState(585);
					match(SEMI);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(591);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(592);
			match(RCURLY);
			}
			_ctx.stop = _input.LT(-1);
			_builder.set_SourcePositionEnd(computeEndPosition(_input.LT(-1)));
			_localctx.ret = _builder.uncheckedBuild();
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
	public static class AccessPolicyContext extends ParserRuleContext {
		public dsl4dataspaces.dsl4dataspaces._ast.ASTAccessPolicy ret = null;
		public StringLiteralContext tmp0;
		public Token tmp1;
		public StringLiteralContext tmp2;
		public RoleContext tmp3;
		public RoleContext tmp4;
		public IdentityProviderConfigContext tmp5;
		public OAuthInfoContext tmp6;
		public TerminalNode ACCESS2871506276() { return getToken(DSL4DataspacesAntlrParser.ACCESS2871506276, 0); }
		public TerminalNode POLICY3312297266() { return getToken(DSL4DataspacesAntlrParser.POLICY3312297266, 0); }
		public List<TerminalNode> LCURLY() { return getTokens(DSL4DataspacesAntlrParser.LCURLY); }
		public TerminalNode LCURLY(int i) {
			return getToken(DSL4DataspacesAntlrParser.LCURLY, i);
		}
		public List<TerminalNode> RCURLY() { return getTokens(DSL4DataspacesAntlrParser.RCURLY); }
		public TerminalNode RCURLY(int i) {
			return getToken(DSL4DataspacesAntlrParser.RCURLY, i);
		}
		public List<TerminalNode> USAGEPOLICY817009203() { return getTokens(DSL4DataspacesAntlrParser.USAGEPOLICY817009203); }
		public TerminalNode USAGEPOLICY817009203(int i) {
			return getToken(DSL4DataspacesAntlrParser.USAGEPOLICY817009203, i);
		}
		public List<TerminalNode> SEMI() { return getTokens(DSL4DataspacesAntlrParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(DSL4DataspacesAntlrParser.SEMI, i);
		}
		public List<TerminalNode> CONTRACTOFFER3767399530() { return getTokens(DSL4DataspacesAntlrParser.CONTRACTOFFER3767399530); }
		public TerminalNode CONTRACTOFFER3767399530(int i) {
			return getToken(DSL4DataspacesAntlrParser.CONTRACTOFFER3767399530, i);
		}
		public List<TerminalNode> ACCESSCONTROL798502745() { return getTokens(DSL4DataspacesAntlrParser.ACCESSCONTROL798502745); }
		public TerminalNode ACCESSCONTROL798502745(int i) {
			return getToken(DSL4DataspacesAntlrParser.ACCESSCONTROL798502745, i);
		}
		public List<TerminalNode> LBRACK() { return getTokens(DSL4DataspacesAntlrParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(DSL4DataspacesAntlrParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(DSL4DataspacesAntlrParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(DSL4DataspacesAntlrParser.RBRACK, i);
		}
		public List<StringLiteralContext> stringLiteral() {
			return getRuleContexts(StringLiteralContext.class);
		}
		public StringLiteralContext stringLiteral(int i) {
			return getRuleContext(StringLiteralContext.class,i);
		}
		public List<RoleContext> role() {
			return getRuleContexts(RoleContext.class);
		}
		public RoleContext role(int i) {
			return getRuleContext(RoleContext.class,i);
		}
		public List<IdentityProviderConfigContext> identityProviderConfig() {
			return getRuleContexts(IdentityProviderConfigContext.class);
		}
		public IdentityProviderConfigContext identityProviderConfig(int i) {
			return getRuleContext(IdentityProviderConfigContext.class,i);
		}
		public List<OAuthInfoContext> oAuthInfo() {
			return getRuleContexts(OAuthInfoContext.class);
		}
		public OAuthInfoContext oAuthInfo(int i) {
			return getRuleContext(OAuthInfoContext.class,i);
		}
		public List<TerminalNode> EQUALS() { return getTokens(DSL4DataspacesAntlrParser.EQUALS); }
		public TerminalNode EQUALS(int i) {
			return getToken(DSL4DataspacesAntlrParser.EQUALS, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DSL4DataspacesAntlrParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DSL4DataspacesAntlrParser.COMMA, i);
		}
		public List<TerminalNode> Name() { return getTokens(DSL4DataspacesAntlrParser.Name); }
		public TerminalNode Name(int i) {
			return getToken(DSL4DataspacesAntlrParser.Name, i);
		}
		public AccessPolicyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accessPolicy; }
	}

	public final AccessPolicyContext accessPolicy() throws RecognitionException {
		AccessPolicyContext _localctx = new AccessPolicyContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_accessPolicy);
		// getActionForAltBeforeRuleBody
		dsl4dataspaces.dsl4dataspaces._ast.ASTAccessPolicyBuilder _builder = dsl4dataspaces.dsl4dataspaces.DSL4DataspacesMill.accessPolicyBuilder();
		_builder.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveBuilder(_builder);

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(594);
			match(ACCESS2871506276);
			setState(595);
			match(POLICY3312297266);
			setState(596);
			match(LCURLY);
			setState(642);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 146508000255803396L) != 0)) {
				{
				setState(640);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case USAGEPOLICY817009203:
					{
					setState(597);
					match(USAGEPOLICY817009203);
					setState(598);
					((AccessPolicyContext)_localctx).tmp0 = stringLiteral();
					addToIteratedAttributeIfNotNull(_builder.getStringLiteralList(), _localctx.tmp0.ret);
					setState(600);
					match(SEMI);
					}
					break;
				case CONTRACTOFFER3767399530:
					{
					setState(602);
					match(CONTRACTOFFER3767399530);
					setState(603);
					match(LCURLY);
					setState(612); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						setState(612);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case Name:
							{
							{
							setState(604);
							((AccessPolicyContext)_localctx).tmp1 = match(Name);
							 addToIteratedAttributeIfNotNull(_builder.getNameList(), convertName(((AccessPolicyContext)_localctx).tmp1));
							}
							setState(607);
							match(EQUALS);
							setState(608);
							((AccessPolicyContext)_localctx).tmp2 = stringLiteral();
							addToIteratedAttributeIfNotNull(_builder.getStringLiteralList(), _localctx.tmp2.ret);
							}
							break;
						case COMMA:
							{
							setState(611);
							match(COMMA);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						setState(614); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==COMMA || _la==Name );
					setState(616);
					match(RCURLY);
					setState(617);
					match(SEMI);
					}
					break;
				case ACCESSCONTROL798502745:
					{
					setState(618);
					match(ACCESSCONTROL798502745);
					setState(619);
					match(LBRACK);
					setState(620);
					((AccessPolicyContext)_localctx).tmp3 = role();
					addToIteratedAttributeIfNotNull(_builder.getRoleList(), _localctx.tmp3.ret);
					setState(628);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(622);
						match(COMMA);
						setState(623);
						((AccessPolicyContext)_localctx).tmp4 = role();
						addToIteratedAttributeIfNotNull(_builder.getRoleList(), _localctx.tmp4.ret);
						}
						}
						setState(630);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(631);
					match(RBRACK);
					setState(632);
					match(SEMI);
					}
					break;
				case IDENTITY4159205566:
					{
					setState(634);
					((AccessPolicyContext)_localctx).tmp5 = identityProviderConfig();
					addToIteratedAttributeIfNotNull(_builder.getIdentityProviderConfigList(), _localctx.tmp5.ret);
					}
					break;
				case OAUTH105516695:
					{
					setState(637);
					((AccessPolicyContext)_localctx).tmp6 = oAuthInfo();
					addToIteratedAttributeIfNotNull(_builder.getOAuthInfoList(), _localctx.tmp6.ret);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(644);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(645);
			match(RCURLY);
			}
			_ctx.stop = _input.LT(-1);
			_builder.set_SourcePositionEnd(computeEndPosition(_input.LT(-1)));
			_localctx.ret = _builder.uncheckedBuild();
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
	public static class RoleContext extends ParserRuleContext {
		public dsl4dataspaces.dsl4dataspaces._ast.ASTRole ret = null;
		public ComplexNameContext tmp0;
		public ComplexNameContext tmp1;
		public ComplexNameContext tmp2;
		public TerminalNode ROLE2552982() { return getToken(DSL4DataspacesAntlrParser.ROLE2552982, 0); }
		public TerminalNode LCURLY() { return getToken(DSL4DataspacesAntlrParser.LCURLY, 0); }
		public TerminalNode NAME3373707() { return getToken(DSL4DataspacesAntlrParser.NAME3373707, 0); }
		public List<TerminalNode> SEMI() { return getTokens(DSL4DataspacesAntlrParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(DSL4DataspacesAntlrParser.SEMI, i);
		}
		public TerminalNode PERMISSIONS1133704324() { return getToken(DSL4DataspacesAntlrParser.PERMISSIONS1133704324, 0); }
		public TerminalNode LBRACK() { return getToken(DSL4DataspacesAntlrParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(DSL4DataspacesAntlrParser.RBRACK, 0); }
		public TerminalNode RCURLY() { return getToken(DSL4DataspacesAntlrParser.RCURLY, 0); }
		public List<ComplexNameContext> complexName() {
			return getRuleContexts(ComplexNameContext.class);
		}
		public ComplexNameContext complexName(int i) {
			return getRuleContext(ComplexNameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DSL4DataspacesAntlrParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DSL4DataspacesAntlrParser.COMMA, i);
		}
		public RoleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_role; }
	}

	public final RoleContext role() throws RecognitionException {
		RoleContext _localctx = new RoleContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_role);
		// getActionForAltBeforeRuleBody
		dsl4dataspaces.dsl4dataspaces._ast.ASTRoleBuilder _builder = dsl4dataspaces.dsl4dataspaces.DSL4DataspacesMill.roleBuilder();
		_builder.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveBuilder(_builder);

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(647);
			match(ROLE2552982);
			setState(648);
			match(LCURLY);
			setState(649);
			match(NAME3373707);
			setState(650);
			((RoleContext)_localctx).tmp0 = complexName();
			addToIteratedAttributeIfNotNull(_builder.getComplexNameList(), _localctx.tmp0.ret);
			setState(652);
			match(SEMI);
			setState(653);
			match(PERMISSIONS1133704324);
			setState(654);
			match(LBRACK);
			setState(666);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Name) {
				{
				setState(655);
				((RoleContext)_localctx).tmp1 = complexName();
				addToIteratedAttributeIfNotNull(_builder.getComplexNameList(), _localctx.tmp1.ret);
				setState(663);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(657);
					match(COMMA);
					setState(658);
					((RoleContext)_localctx).tmp2 = complexName();
					addToIteratedAttributeIfNotNull(_builder.getComplexNameList(), _localctx.tmp2.ret);
					}
					}
					setState(665);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(668);
			match(RBRACK);
			setState(669);
			match(SEMI);
			setState(670);
			match(RCURLY);
			}
			_ctx.stop = _input.LT(-1);
			_builder.set_SourcePositionEnd(computeEndPosition(_input.LT(-1)));
			_localctx.ret = _builder.uncheckedBuild();
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
	public static class IdentityProviderConfigContext extends ParserRuleContext {
		public dsl4dataspaces.dsl4dataspaces._ast.ASTIdentityProviderConfig ret = null;
		public StringLiteralContext tmp0;
		public ComplexNameContext tmp1;
		public StringLiteralContext tmp2;
		public ComplexNameContext tmp3;
		public TerminalNode IDENTITY4159205566() { return getToken(DSL4DataspacesAntlrParser.IDENTITY4159205566, 0); }
		public TerminalNode PROVIDER3307472369() { return getToken(DSL4DataspacesAntlrParser.PROVIDER3307472369, 0); }
		public TerminalNode CONFIG2940175170() { return getToken(DSL4DataspacesAntlrParser.CONFIG2940175170, 0); }
		public TerminalNode LCURLY() { return getToken(DSL4DataspacesAntlrParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(DSL4DataspacesAntlrParser.RCURLY, 0); }
		public List<TerminalNode> IDPENDPOINT3356463978() { return getTokens(DSL4DataspacesAntlrParser.IDPENDPOINT3356463978); }
		public TerminalNode IDPENDPOINT3356463978(int i) {
			return getToken(DSL4DataspacesAntlrParser.IDPENDPOINT3356463978, i);
		}
		public List<TerminalNode> SEMI() { return getTokens(DSL4DataspacesAntlrParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(DSL4DataspacesAntlrParser.SEMI, i);
		}
		public List<TerminalNode> CLIENTID908408390() { return getTokens(DSL4DataspacesAntlrParser.CLIENTID908408390); }
		public TerminalNode CLIENTID908408390(int i) {
			return getToken(DSL4DataspacesAntlrParser.CLIENTID908408390, i);
		}
		public List<TerminalNode> SECRET3388690096() { return getTokens(DSL4DataspacesAntlrParser.SECRET3388690096); }
		public TerminalNode SECRET3388690096(int i) {
			return getToken(DSL4DataspacesAntlrParser.SECRET3388690096, i);
		}
		public List<TerminalNode> GRANTTYPE3075135094() { return getTokens(DSL4DataspacesAntlrParser.GRANTTYPE3075135094); }
		public TerminalNode GRANTTYPE3075135094(int i) {
			return getToken(DSL4DataspacesAntlrParser.GRANTTYPE3075135094, i);
		}
		public List<StringLiteralContext> stringLiteral() {
			return getRuleContexts(StringLiteralContext.class);
		}
		public StringLiteralContext stringLiteral(int i) {
			return getRuleContext(StringLiteralContext.class,i);
		}
		public List<ComplexNameContext> complexName() {
			return getRuleContexts(ComplexNameContext.class);
		}
		public ComplexNameContext complexName(int i) {
			return getRuleContext(ComplexNameContext.class,i);
		}
		public IdentityProviderConfigContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identityProviderConfig; }
	}

	public final IdentityProviderConfigContext identityProviderConfig() throws RecognitionException {
		IdentityProviderConfigContext _localctx = new IdentityProviderConfigContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_identityProviderConfig);
		// getActionForAltBeforeRuleBody
		dsl4dataspaces.dsl4dataspaces._ast.ASTIdentityProviderConfigBuilder _builder = dsl4dataspaces.dsl4dataspaces.DSL4DataspacesMill.identityProviderConfigBuilder();
		_builder.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveBuilder(_builder);

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(672);
			match(IDENTITY4159205566);
			setState(673);
			match(PROVIDER3307472369);
			setState(674);
			match(CONFIG2940175170);
			setState(675);
			match(LCURLY);
			setState(698);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 108090857822879744L) != 0)) {
				{
				setState(696);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IDPENDPOINT3356463978:
					{
					setState(676);
					match(IDPENDPOINT3356463978);
					setState(677);
					((IdentityProviderConfigContext)_localctx).tmp0 = stringLiteral();
					addToIteratedAttributeIfNotNull(_builder.getStringLiteralList(), _localctx.tmp0.ret);
					setState(679);
					match(SEMI);
					}
					break;
				case CLIENTID908408390:
					{
					setState(681);
					match(CLIENTID908408390);
					setState(682);
					((IdentityProviderConfigContext)_localctx).tmp1 = complexName();
					addToIteratedAttributeIfNotNull(_builder.getComplexNameList(), _localctx.tmp1.ret);
					setState(684);
					match(SEMI);
					}
					break;
				case SECRET3388690096:
					{
					setState(686);
					match(SECRET3388690096);
					setState(687);
					((IdentityProviderConfigContext)_localctx).tmp2 = stringLiteral();
					addToIteratedAttributeIfNotNull(_builder.getStringLiteralList(), _localctx.tmp2.ret);
					setState(689);
					match(SEMI);
					}
					break;
				case GRANTTYPE3075135094:
					{
					setState(691);
					match(GRANTTYPE3075135094);
					setState(692);
					((IdentityProviderConfigContext)_localctx).tmp3 = complexName();
					addToIteratedAttributeIfNotNull(_builder.getComplexNameList(), _localctx.tmp3.ret);
					setState(694);
					match(SEMI);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(700);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(701);
			match(RCURLY);
			}
			_ctx.stop = _input.LT(-1);
			_builder.set_SourcePositionEnd(computeEndPosition(_input.LT(-1)));
			_localctx.ret = _builder.uncheckedBuild();
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
	public static class OAuthInfoContext extends ParserRuleContext {
		public dsl4dataspaces.dsl4dataspaces._ast.ASTOAuthInfo ret = null;
		public StringLiteralContext tmp0;
		public StringLiteralContext tmp1;
		public StringLiteralContext tmp2;
		public StringLiteralContext tmp3;
		public TerminalNode OAUTH105516695() { return getToken(DSL4DataspacesAntlrParser.OAUTH105516695, 0); }
		public TerminalNode LCURLY() { return getToken(DSL4DataspacesAntlrParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(DSL4DataspacesAntlrParser.RCURLY, 0); }
		public List<TerminalNode> ID3355() { return getTokens(DSL4DataspacesAntlrParser.ID3355); }
		public TerminalNode ID3355(int i) {
			return getToken(DSL4DataspacesAntlrParser.ID3355, i);
		}
		public List<TerminalNode> SEMI() { return getTokens(DSL4DataspacesAntlrParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(DSL4DataspacesAntlrParser.SEMI, i);
		}
		public List<TerminalNode> SECRET3388690096() { return getTokens(DSL4DataspacesAntlrParser.SECRET3388690096); }
		public TerminalNode SECRET3388690096(int i) {
			return getToken(DSL4DataspacesAntlrParser.SECRET3388690096, i);
		}
		public List<TerminalNode> GRANTTYPE3075135094() { return getTokens(DSL4DataspacesAntlrParser.GRANTTYPE3075135094); }
		public TerminalNode GRANTTYPE3075135094(int i) {
			return getToken(DSL4DataspacesAntlrParser.GRANTTYPE3075135094, i);
		}
		public List<TerminalNode> SCOPE109264468() { return getTokens(DSL4DataspacesAntlrParser.SCOPE109264468); }
		public TerminalNode SCOPE109264468(int i) {
			return getToken(DSL4DataspacesAntlrParser.SCOPE109264468, i);
		}
		public List<StringLiteralContext> stringLiteral() {
			return getRuleContexts(StringLiteralContext.class);
		}
		public StringLiteralContext stringLiteral(int i) {
			return getRuleContext(StringLiteralContext.class,i);
		}
		public OAuthInfoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oAuthInfo; }
	}

	public final OAuthInfoContext oAuthInfo() throws RecognitionException {
		OAuthInfoContext _localctx = new OAuthInfoContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_oAuthInfo);
		// getActionForAltBeforeRuleBody
		dsl4dataspaces.dsl4dataspaces._ast.ASTOAuthInfoBuilder _builder = dsl4dataspaces.dsl4dataspaces.DSL4DataspacesMill.oAuthInfoBuilder();
		_builder.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveBuilder(_builder);

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(703);
			match(OAUTH105516695);
			setState(704);
			match(LCURLY);
			setState(727);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 285941742706688L) != 0)) {
				{
				setState(725);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID3355:
					{
					setState(705);
					match(ID3355);
					setState(706);
					((OAuthInfoContext)_localctx).tmp0 = stringLiteral();
					addToIteratedAttributeIfNotNull(_builder.getStringLiteralList(), _localctx.tmp0.ret);
					setState(708);
					match(SEMI);
					}
					break;
				case SECRET3388690096:
					{
					setState(710);
					match(SECRET3388690096);
					setState(711);
					((OAuthInfoContext)_localctx).tmp1 = stringLiteral();
					addToIteratedAttributeIfNotNull(_builder.getStringLiteralList(), _localctx.tmp1.ret);
					setState(713);
					match(SEMI);
					}
					break;
				case GRANTTYPE3075135094:
					{
					setState(715);
					match(GRANTTYPE3075135094);
					setState(716);
					((OAuthInfoContext)_localctx).tmp2 = stringLiteral();
					addToIteratedAttributeIfNotNull(_builder.getStringLiteralList(), _localctx.tmp2.ret);
					setState(718);
					match(SEMI);
					}
					break;
				case SCOPE109264468:
					{
					setState(720);
					match(SCOPE109264468);
					setState(721);
					((OAuthInfoContext)_localctx).tmp3 = stringLiteral();
					addToIteratedAttributeIfNotNull(_builder.getStringLiteralList(), _localctx.tmp3.ret);
					setState(723);
					match(SEMI);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(729);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(730);
			match(RCURLY);
			}
			_ctx.stop = _input.LT(-1);
			_builder.set_SourcePositionEnd(computeEndPosition(_input.LT(-1)));
			_localctx.ret = _builder.uncheckedBuild();
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
	public static class LiteralContext extends ParserRuleContext {
		public de.monticore.literals.mcliteralsbasis._ast.ASTLiteral ret;
		public NumericLiteralContext tmp4;
		public NullLiteralContext tmp5;
		public BooleanLiteralContext tmp6;
		public CharLiteralContext tmp7;
		public StringLiteralContext tmp8;
		public NumericLiteralContext numericLiteral() {
			return getRuleContext(NumericLiteralContext.class,0);
		}
		public NullLiteralContext nullLiteral() {
			return getRuleContext(NullLiteralContext.class,0);
		}
		public BooleanLiteralContext booleanLiteral() {
			return getRuleContext(BooleanLiteralContext.class,0);
		}
		public CharLiteralContext charLiteral() {
			return getRuleContext(CharLiteralContext.class,0);
		}
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_literal);
		try {
			setState(747);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(732);
				((LiteralContext)_localctx).tmp4 = numericLiteral();
				((LiteralContext)_localctx).ret = ((LiteralContext)_localctx).tmp4.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(735);
				((LiteralContext)_localctx).tmp5 = nullLiteral();
				((LiteralContext)_localctx).ret = ((LiteralContext)_localctx).tmp5.ret;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(738);
				((LiteralContext)_localctx).tmp6 = booleanLiteral();
				((LiteralContext)_localctx).ret = ((LiteralContext)_localctx).tmp6.ret;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(741);
				((LiteralContext)_localctx).tmp7 = charLiteral();
				((LiteralContext)_localctx).ret = ((LiteralContext)_localctx).tmp7.ret;
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(744);
				((LiteralContext)_localctx).tmp8 = stringLiteral();
				((LiteralContext)_localctx).ret = ((LiteralContext)_localctx).tmp8.ret;
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
	public static class SignedLiteralContext extends ParserRuleContext {
		public de.monticore.literals.mccommonliterals._ast.ASTSignedLiteral ret;
		public SignedNumericLiteralContext tmp9;
		public NullLiteralContext tmp5;
		public BooleanLiteralContext tmp6;
		public CharLiteralContext tmp7;
		public StringLiteralContext tmp8;
		public SignedNumericLiteralContext signedNumericLiteral() {
			return getRuleContext(SignedNumericLiteralContext.class,0);
		}
		public NullLiteralContext nullLiteral() {
			return getRuleContext(NullLiteralContext.class,0);
		}
		public BooleanLiteralContext booleanLiteral() {
			return getRuleContext(BooleanLiteralContext.class,0);
		}
		public CharLiteralContext charLiteral() {
			return getRuleContext(CharLiteralContext.class,0);
		}
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public SignedLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signedLiteral; }
	}

	public final SignedLiteralContext signedLiteral() throws RecognitionException {
		SignedLiteralContext _localctx = new SignedLiteralContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_signedLiteral);
		try {
			setState(764);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(749);
				((SignedLiteralContext)_localctx).tmp9 = signedNumericLiteral();
				((SignedLiteralContext)_localctx).ret = ((SignedLiteralContext)_localctx).tmp9.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(752);
				((SignedLiteralContext)_localctx).tmp5 = nullLiteral();
				((SignedLiteralContext)_localctx).ret = ((SignedLiteralContext)_localctx).tmp5.ret;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(755);
				((SignedLiteralContext)_localctx).tmp6 = booleanLiteral();
				((SignedLiteralContext)_localctx).ret = ((SignedLiteralContext)_localctx).tmp6.ret;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(758);
				((SignedLiteralContext)_localctx).tmp7 = charLiteral();
				((SignedLiteralContext)_localctx).ret = ((SignedLiteralContext)_localctx).tmp7.ret;
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(761);
				((SignedLiteralContext)_localctx).tmp8 = stringLiteral();
				((SignedLiteralContext)_localctx).ret = ((SignedLiteralContext)_localctx).tmp8.ret;
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
	public static class NumericLiteralContext extends ParserRuleContext {
		public de.monticore.literals.mccommonliterals._ast.ASTNumericLiteral ret;
		public IntLiteralContext tmp10;
		public FloatLiteralContext tmp11;
		public DoubleLiteralContext tmp12;
		public LongLiteralContext tmp13;
		public NatLiteralContext tmp14;
		public BasicLongLiteralContext tmp15;
		public BasicFloatLiteralContext tmp16;
		public BasicDoubleLiteralContext tmp17;
		public IntLiteralContext intLiteral() {
			return getRuleContext(IntLiteralContext.class,0);
		}
		public FloatLiteralContext floatLiteral() {
			return getRuleContext(FloatLiteralContext.class,0);
		}
		public DoubleLiteralContext doubleLiteral() {
			return getRuleContext(DoubleLiteralContext.class,0);
		}
		public LongLiteralContext longLiteral() {
			return getRuleContext(LongLiteralContext.class,0);
		}
		public NatLiteralContext natLiteral() {
			return getRuleContext(NatLiteralContext.class,0);
		}
		public BasicLongLiteralContext basicLongLiteral() {
			return getRuleContext(BasicLongLiteralContext.class,0);
		}
		public BasicFloatLiteralContext basicFloatLiteral() {
			return getRuleContext(BasicFloatLiteralContext.class,0);
		}
		public BasicDoubleLiteralContext basicDoubleLiteral() {
			return getRuleContext(BasicDoubleLiteralContext.class,0);
		}
		public NumericLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericLiteral; }
	}

	public final NumericLiteralContext numericLiteral() throws RecognitionException {
		NumericLiteralContext _localctx = new NumericLiteralContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_numericLiteral);
		try {
			setState(790);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(766);
				((NumericLiteralContext)_localctx).tmp10 = intLiteral();
				((NumericLiteralContext)_localctx).ret = ((NumericLiteralContext)_localctx).tmp10.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(769);
				((NumericLiteralContext)_localctx).tmp11 = floatLiteral();
				((NumericLiteralContext)_localctx).ret = ((NumericLiteralContext)_localctx).tmp11.ret;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(772);
				((NumericLiteralContext)_localctx).tmp12 = doubleLiteral();
				((NumericLiteralContext)_localctx).ret = ((NumericLiteralContext)_localctx).tmp12.ret;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(775);
				((NumericLiteralContext)_localctx).tmp13 = longLiteral();
				((NumericLiteralContext)_localctx).ret = ((NumericLiteralContext)_localctx).tmp13.ret;
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(778);
				((NumericLiteralContext)_localctx).tmp14 = natLiteral();
				((NumericLiteralContext)_localctx).ret = ((NumericLiteralContext)_localctx).tmp14.ret;
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(781);
				((NumericLiteralContext)_localctx).tmp15 = basicLongLiteral();
				((NumericLiteralContext)_localctx).ret = ((NumericLiteralContext)_localctx).tmp15.ret;
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(784);
				((NumericLiteralContext)_localctx).tmp16 = basicFloatLiteral();
				((NumericLiteralContext)_localctx).ret = ((NumericLiteralContext)_localctx).tmp16.ret;
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(787);
				((NumericLiteralContext)_localctx).tmp17 = basicDoubleLiteral();
				((NumericLiteralContext)_localctx).ret = ((NumericLiteralContext)_localctx).tmp17.ret;
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
	public static class SignedNumericLiteralContext extends ParserRuleContext {
		public de.monticore.literals.mccommonliterals._ast.ASTSignedNumericLiteral ret;
		public SignedNatLiteralContext tmp18;
		public SignedBasicLongLiteralContext tmp19;
		public SignedBasicFloatLiteralContext tmp20;
		public SignedBasicDoubleLiteralContext tmp21;
		public SignedNatLiteralContext signedNatLiteral() {
			return getRuleContext(SignedNatLiteralContext.class,0);
		}
		public SignedBasicLongLiteralContext signedBasicLongLiteral() {
			return getRuleContext(SignedBasicLongLiteralContext.class,0);
		}
		public SignedBasicFloatLiteralContext signedBasicFloatLiteral() {
			return getRuleContext(SignedBasicFloatLiteralContext.class,0);
		}
		public SignedBasicDoubleLiteralContext signedBasicDoubleLiteral() {
			return getRuleContext(SignedBasicDoubleLiteralContext.class,0);
		}
		public SignedNumericLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signedNumericLiteral; }
	}

	public final SignedNumericLiteralContext signedNumericLiteral() throws RecognitionException {
		SignedNumericLiteralContext _localctx = new SignedNumericLiteralContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_signedNumericLiteral);
		try {
			setState(804);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(792);
				((SignedNumericLiteralContext)_localctx).tmp18 = signedNatLiteral();
				((SignedNumericLiteralContext)_localctx).ret = ((SignedNumericLiteralContext)_localctx).tmp18.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(795);
				((SignedNumericLiteralContext)_localctx).tmp19 = signedBasicLongLiteral();
				((SignedNumericLiteralContext)_localctx).ret = ((SignedNumericLiteralContext)_localctx).tmp19.ret;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(798);
				((SignedNumericLiteralContext)_localctx).tmp20 = signedBasicFloatLiteral();
				((SignedNumericLiteralContext)_localctx).ret = ((SignedNumericLiteralContext)_localctx).tmp20.ret;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(801);
				((SignedNumericLiteralContext)_localctx).tmp21 = signedBasicDoubleLiteral();
				((SignedNumericLiteralContext)_localctx).ret = ((SignedNumericLiteralContext)_localctx).tmp21.ret;
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
	public static class MCTypeContext extends ParserRuleContext {
		public de.monticore.types.mcbasictypes._ast.ASTMCType ret;
		public MCPrimitiveTypeContext tmp22;
		public MCObjectTypeContext tmp23;
		public MCPrimitiveTypeContext mCPrimitiveType() {
			return getRuleContext(MCPrimitiveTypeContext.class,0);
		}
		public MCObjectTypeContext mCObjectType() {
			return getRuleContext(MCObjectTypeContext.class,0);
		}
		public MCTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mCType; }
	}

	public final MCTypeContext mCType() throws RecognitionException {
		MCTypeContext _localctx = new MCTypeContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_mCType);
		try {
			setState(812);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN64711720:
			case BYTE3039496:
			case SHORT109413500:
			case INT104431:
			case LONG3327612:
			case CHAR3052374:
			case FLOAT97526364:
			case DOUBLE2969009105:
				enterOuterAlt(_localctx, 1);
				{
				setState(806);
				((MCTypeContext)_localctx).tmp22 = mCPrimitiveType();
				((MCTypeContext)_localctx).ret = ((MCTypeContext)_localctx).tmp22.ret;
				}
				break;
			case Name:
				enterOuterAlt(_localctx, 2);
				{
				setState(809);
				((MCTypeContext)_localctx).tmp23 = mCObjectType();
				((MCTypeContext)_localctx).ret = ((MCTypeContext)_localctx).tmp23.ret;
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
	public static class MCObjectTypeContext extends ParserRuleContext {
		public de.monticore.types.mcbasictypes._ast.ASTMCObjectType ret;
		public MCQualifiedTypeContext tmp24;
		public MCQualifiedTypeContext mCQualifiedType() {
			return getRuleContext(MCQualifiedTypeContext.class,0);
		}
		public MCObjectTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mCObjectType; }
	}

	public final MCObjectTypeContext mCObjectType() throws RecognitionException {
		MCObjectTypeContext _localctx = new MCObjectTypeContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_mCObjectType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(814);
			((MCObjectTypeContext)_localctx).tmp24 = mCQualifiedType();
			((MCObjectTypeContext)_localctx).ret = ((MCObjectTypeContext)_localctx).tmp24.ret;
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
	public static class ConfigurationElementsContext extends ParserRuleContext {
		public dsl4dataspaces.dsl4dataspaces._ast.ASTConfigurationElements ret;
		public DiscoveryDataContext tmp25;
		public OAuthInfoContext tmp26;
		public UsageContext tmp27;
		public DiscoveryDataContext discoveryData() {
			return getRuleContext(DiscoveryDataContext.class,0);
		}
		public OAuthInfoContext oAuthInfo() {
			return getRuleContext(OAuthInfoContext.class,0);
		}
		public UsageContext usage() {
			return getRuleContext(UsageContext.class,0);
		}
		public ConfigurationElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_configurationElements; }
	}

	public final ConfigurationElementsContext configurationElements() throws RecognitionException {
		ConfigurationElementsContext _localctx = new ConfigurationElementsContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_configurationElements);
		try {
			setState(826);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DISCOVERY4173759920:
				enterOuterAlt(_localctx, 1);
				{
				setState(817);
				((ConfigurationElementsContext)_localctx).tmp25 = discoveryData();
				((ConfigurationElementsContext)_localctx).ret = ((ConfigurationElementsContext)_localctx).tmp25.ret;
				}
				break;
			case OAUTH105516695:
				enterOuterAlt(_localctx, 2);
				{
				setState(820);
				((ConfigurationElementsContext)_localctx).tmp26 = oAuthInfo();
				((ConfigurationElementsContext)_localctx).ret = ((ConfigurationElementsContext)_localctx).tmp26.ret;
				}
				break;
			case EDC100260:
			case OPCUA105946286:
				enterOuterAlt(_localctx, 3);
				{
				setState(823);
				((ConfigurationElementsContext)_localctx).tmp27 = usage();
				((ConfigurationElementsContext)_localctx).ret = ((ConfigurationElementsContext)_localctx).tmp27.ret;
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
	public static class UsageContext extends ParserRuleContext {
		public dsl4dataspaces.dsl4dataspaces._ast.ASTUsage ret;
		public OPCUAUsageContext tmp28;
		public EDCUsageContext tmp29;
		public OPCUAUsageContext oPCUAUsage() {
			return getRuleContext(OPCUAUsageContext.class,0);
		}
		public EDCUsageContext eDCUsage() {
			return getRuleContext(EDCUsageContext.class,0);
		}
		public UsageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_usage; }
	}

	public final UsageContext usage() throws RecognitionException {
		UsageContext _localctx = new UsageContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_usage);
		try {
			setState(834);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPCUA105946286:
				enterOuterAlt(_localctx, 1);
				{
				setState(828);
				((UsageContext)_localctx).tmp28 = oPCUAUsage();
				((UsageContext)_localctx).ret = ((UsageContext)_localctx).tmp28.ret;
				}
				break;
			case EDC100260:
				enterOuterAlt(_localctx, 2);
				{
				setState(831);
				((UsageContext)_localctx).tmp29 = eDCUsage();
				((UsageContext)_localctx).ret = ((UsageContext)_localctx).tmp29.ret;
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
	public static class Nokeyword_f102Context extends ParserRuleContext {
		public TerminalNode Name() { return getToken(DSL4DataspacesAntlrParser.Name, 0); }
		public Nokeyword_f102Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nokeyword_f102; }
	}

	public final Nokeyword_f102Context nokeyword_f102() throws RecognitionException {
		Nokeyword_f102Context _localctx = new Nokeyword_f102Context(_ctx, getState());
		enterRule(_localctx, 86, RULE_nokeyword_f102);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(836);
			if (!(next("f"))) throw new FailedPredicateException(this, "next(\"f\")");
			setState(837);
			match(Name);
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
	public static class Nokeyword_F70Context extends ParserRuleContext {
		public TerminalNode Name() { return getToken(DSL4DataspacesAntlrParser.Name, 0); }
		public Nokeyword_F70Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nokeyword_F70; }
	}

	public final Nokeyword_F70Context nokeyword_F70() throws RecognitionException {
		Nokeyword_F70Context _localctx = new Nokeyword_F70Context(_ctx, getState());
		enterRule(_localctx, 88, RULE_nokeyword_F70);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(839);
			if (!(next("F"))) throw new FailedPredicateException(this, "next(\"F\")");
			setState(840);
			match(Name);
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
	public static class Nokeyword_l108Context extends ParserRuleContext {
		public TerminalNode Name() { return getToken(DSL4DataspacesAntlrParser.Name, 0); }
		public Nokeyword_l108Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nokeyword_l108; }
	}

	public final Nokeyword_l108Context nokeyword_l108() throws RecognitionException {
		Nokeyword_l108Context _localctx = new Nokeyword_l108Context(_ctx, getState());
		enterRule(_localctx, 90, RULE_nokeyword_l108);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(842);
			if (!(next("l"))) throw new FailedPredicateException(this, "next(\"l\")");
			setState(843);
			match(Name);
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
	public static class Nokeyword_L76Context extends ParserRuleContext {
		public TerminalNode Name() { return getToken(DSL4DataspacesAntlrParser.Name, 0); }
		public Nokeyword_L76Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nokeyword_L76; }
	}

	public final Nokeyword_L76Context nokeyword_L76() throws RecognitionException {
		Nokeyword_L76Context _localctx = new Nokeyword_L76Context(_ctx, getState());
		enterRule(_localctx, 92, RULE_nokeyword_L76);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(845);
			if (!(next("L"))) throw new FailedPredicateException(this, "next(\"L\")");
			setState(846);
			match(Name);
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
		case 5:
			return signedNatLiteral_sempred((SignedNatLiteralContext)_localctx, predIndex);
		case 6:
			return basicLongLiteral_sempred((BasicLongLiteralContext)_localctx, predIndex);
		case 7:
			return signedBasicLongLiteral_sempred((SignedBasicLongLiteralContext)_localctx, predIndex);
		case 8:
			return basicFloatLiteral_sempred((BasicFloatLiteralContext)_localctx, predIndex);
		case 9:
			return signedBasicFloatLiteral_sempred((SignedBasicFloatLiteralContext)_localctx, predIndex);
		case 10:
			return basicDoubleLiteral_sempred((BasicDoubleLiteralContext)_localctx, predIndex);
		case 11:
			return signedBasicDoubleLiteral_sempred((SignedBasicDoubleLiteralContext)_localctx, predIndex);
		case 43:
			return nokeyword_f102_sempred((Nokeyword_f102Context)_localctx, predIndex);
		case 44:
			return nokeyword_F70_sempred((Nokeyword_F70Context)_localctx, predIndex);
		case 45:
			return nokeyword_l108_sempred((Nokeyword_l108Context)_localctx, predIndex);
		case 46:
			return nokeyword_L76_sempred((Nokeyword_L76Context)_localctx, predIndex);
		}
		return true;
	}
	private boolean signedNatLiteral_sempred(SignedNatLiteralContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return noSpace(2);
		}
		return true;
	}
	private boolean basicLongLiteral_sempred(BasicLongLiteralContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return cmpToken(2,"l","L") && noSpace(2);
		}
		return true;
	}
	private boolean signedBasicLongLiteral_sempred(SignedBasicLongLiteralContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return cmpToken(3,"l","L") && noSpace(2,3);
		case 3:
			return cmpToken(2,"l","L") && noSpace(2);
		}
		return true;
	}
	private boolean basicFloatLiteral_sempred(BasicFloatLiteralContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return cmpToken(4,"f","F") && noSpace(2,3,4);
		}
		return true;
	}
	private boolean signedBasicFloatLiteral_sempred(SignedBasicFloatLiteralContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return cmpToken(5,"f","F") && noSpace(2,3,4,5);
		case 6:
			return cmpToken(4,"f","F") && noSpace(2,3,4);
		}
		return true;
	}
	private boolean basicDoubleLiteral_sempred(BasicDoubleLiteralContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return noSpace(2,3);
		}
		return true;
	}
	private boolean signedBasicDoubleLiteral_sempred(SignedBasicDoubleLiteralContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return noSpace(2,3,4);
		case 9:
			return noSpace(2,3);
		}
		return true;
	}
	private boolean nokeyword_f102_sempred(Nokeyword_f102Context _localctx, int predIndex) {
		switch (predIndex) {
		case 10:
			return next("f");
		}
		return true;
	}
	private boolean nokeyword_F70_sempred(Nokeyword_F70Context _localctx, int predIndex) {
		switch (predIndex) {
		case 11:
			return next("F");
		}
		return true;
	}
	private boolean nokeyword_l108_sempred(Nokeyword_l108Context _localctx, int predIndex) {
		switch (predIndex) {
		case 12:
			return next("l");
		}
		return true;
	}
	private boolean nokeyword_L76_sempred(Nokeyword_L76Context _localctx, int predIndex) {
		switch (predIndex) {
		case 13:
			return next("L");
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\\\u0351\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"-\u0007-\u0002.\u0007.\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u0001e\b\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005x\b\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006"+
		"\u0080\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u008b\b\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0003\u0007\u0093\b\u0007\u0003\u0007\u0095\b\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u00a1"+
		"\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u00b0\b\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u00bc"+
		"\b\t\u0003\t\u00be\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n"+
		"\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0003\u000b\u00d9\b\u000b\u0001\f\u0001\f\u0001\f\u0001\r\u0001"+
		"\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0005\u0010\u00ed\b\u0010\n\u0010\f\u0010\u00f0\t\u0010\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u00fd"+
		"\b\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0003\u0013\u0111\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003"+
		"\u0015\u011c\b\u0015\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0004"+
		"\u0017\u0128\b\u0017\u000b\u0017\f\u0017\u0129\u0001\u0017\u0001\u0017"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0005\u0018\u0134\b\u0018\n\u0018\f\u0018\u0137\t\u0018\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0005"+
		"\u0019\u0152\b\u0019\n\u0019\f\u0019\u0155\t\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0004\u001a\u015f\b\u001a\u000b\u001a\f\u001a\u0160\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0004\u001a\u016d\b\u001a\u000b\u001a\f"+
		"\u001a\u016e\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0005\u001a\u017a\b\u001a"+
		"\n\u001a\f\u001a\u017d\t\u001a\u0003\u001a\u017f\b\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u0199"+
		"\b\u001a\u0001\u001a\u0005\u001a\u019c\b\u001a\n\u001a\f\u001a\u019f\t"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0005\u001c\u01ba\b\u001c\n\u001c\f\u001c\u01bd\t\u001c"+
		"\u0003\u001c\u01bf\b\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0005\u001c\u01cb\b\u001c\n\u001c\f\u001c\u01ce\t\u001c\u0003\u001c\u01d0"+
		"\b\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0005\u001c\u01e6\b\u001c\n\u001c\f\u001c"+
		"\u01e9\t\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0005\u001d\u01ff\b\u001d\n\u001d"+
		"\f\u001d\u0202\t\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0005\u001d\u0217\b\u001d\n\u001d"+
		"\f\u001d\u021a\t\u001d\u0003\u001d\u021c\b\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0005\u001d\u0226\b\u001d\n\u001d\f\u001d\u0229\t\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0005"+
		"\u001e\u023e\b\u001e\n\u001e\f\u001e\u0241\t\u001e\u0003\u001e\u0243\b"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0005\u001e\u024c\b\u001e\n\u001e\f\u001e\u024f\t\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0004\u001f\u0265\b\u001f\u000b\u001f\f\u001f"+
		"\u0266\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0005\u001f\u0273"+
		"\b\u001f\n\u001f\f\u001f\u0276\t\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0005\u001f\u0281\b\u001f\n\u001f\f\u001f\u0284\t\u001f\u0001\u001f\u0001"+
		"\u001f\u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 "+
		"\u0001 \u0001 \u0001 \u0001 \u0001 \u0005 \u0296\b \n \f \u0299\t \u0003"+
		" \u029b\b \u0001 \u0001 \u0001 \u0001 \u0001!\u0001!\u0001!\u0001!\u0001"+
		"!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001"+
		"!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0005"+
		"!\u02b9\b!\n!\f!\u02bc\t!\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0005\"\u02d6\b\"\n\"\f\"\u02d9\t\"\u0001\"\u0001\"\u0001#\u0001#\u0001"+
		"#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001"+
		"#\u0001#\u0001#\u0003#\u02ec\b#\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0003"+
		"$\u02fd\b$\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001"+
		"%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001"+
		"%\u0001%\u0001%\u0001%\u0001%\u0001%\u0003%\u0317\b%\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0003"+
		"&\u0325\b&\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0003\'\u032d"+
		"\b\'\u0001(\u0001(\u0001(\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0001)\u0003)\u033b\b)\u0001*\u0001*\u0001*\u0001*\u0001*\u0001"+
		"*\u0003*\u0343\b*\u0001+\u0001+\u0001+\u0001,\u0001,\u0001,\u0001-\u0001"+
		"-\u0001-\u0001.\u0001.\u0001.\u0001.\u0000\u0000/\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,."+
		"02468:<>@BDFHJLNPRTVXZ\\\u0000\u0000\u038d\u0000^\u0001\u0000\u0000\u0000"+
		"\u0002d\u0001\u0000\u0000\u0000\u0004f\u0001\u0000\u0000\u0000\u0006i"+
		"\u0001\u0000\u0000\u0000\bl\u0001\u0000\u0000\u0000\nw\u0001\u0000\u0000"+
		"\u0000\fy\u0001\u0000\u0000\u0000\u000e\u0094\u0001\u0000\u0000\u0000"+
		"\u0010\u0096\u0001\u0000\u0000\u0000\u0012\u00bd\u0001\u0000\u0000\u0000"+
		"\u0014\u00bf\u0001\u0000\u0000\u0000\u0016\u00d8\u0001\u0000\u0000\u0000"+
		"\u0018\u00da\u0001\u0000\u0000\u0000\u001a\u00dd\u0001\u0000\u0000\u0000"+
		"\u001c\u00e0\u0001\u0000\u0000\u0000\u001e\u00e3\u0001\u0000\u0000\u0000"+
		" \u00e6\u0001\u0000\u0000\u0000\"\u00f1\u0001\u0000\u0000\u0000$\u00f6"+
		"\u0001\u0000\u0000\u0000&\u0110\u0001\u0000\u0000\u0000(\u0112\u0001\u0000"+
		"\u0000\u0000*\u011b\u0001\u0000\u0000\u0000,\u011d\u0001\u0000\u0000\u0000"+
		".\u011f\u0001\u0000\u0000\u00000\u012d\u0001\u0000\u0000\u00002\u0138"+
		"\u0001\u0000\u0000\u00004\u0158\u0001\u0000\u0000\u00006\u01a2\u0001\u0000"+
		"\u0000\u00008\u01ab\u0001\u0000\u0000\u0000:\u01ec\u0001\u0000\u0000\u0000"+
		"<\u022c\u0001\u0000\u0000\u0000>\u0252\u0001\u0000\u0000\u0000@\u0287"+
		"\u0001\u0000\u0000\u0000B\u02a0\u0001\u0000\u0000\u0000D\u02bf\u0001\u0000"+
		"\u0000\u0000F\u02eb\u0001\u0000\u0000\u0000H\u02fc\u0001\u0000\u0000\u0000"+
		"J\u0316\u0001\u0000\u0000\u0000L\u0324\u0001\u0000\u0000\u0000N\u032c"+
		"\u0001\u0000\u0000\u0000P\u032e\u0001\u0000\u0000\u0000R\u033a\u0001\u0000"+
		"\u0000\u0000T\u0342\u0001\u0000\u0000\u0000V\u0344\u0001\u0000\u0000\u0000"+
		"X\u0347\u0001\u0000\u0000\u0000Z\u034a\u0001\u0000\u0000\u0000\\\u034d"+
		"\u0001\u0000\u0000\u0000^_\u0005\u001f\u0000\u0000_\u0001\u0001\u0000"+
		"\u0000\u0000`a\u0005E\u0000\u0000ae\u0006\u0001\uffff\uffff\u0000bc\u0005"+
		"F\u0000\u0000ce\u0006\u0001\uffff\uffff\u0000d`\u0001\u0000\u0000\u0000"+
		"db\u0001\u0000\u0000\u0000e\u0003\u0001\u0000\u0000\u0000fg\u0005V\u0000"+
		"\u0000gh\u0006\u0002\uffff\uffff\u0000h\u0005\u0001\u0000\u0000\u0000"+
		"ij\u0005R\u0000\u0000jk\u0006\u0003\uffff\uffff\u0000k\u0007\u0001\u0000"+
		"\u0000\u0000lm\u0005\\\u0000\u0000mn\u0006\u0004\uffff\uffff\u0000n\t"+
		"\u0001\u0000\u0000\u0000op\u0004\u0005\u0000\u0000pq\u0005\u001a\u0000"+
		"\u0000qr\u0006\u0005\uffff\uffff\u0000rs\u0001\u0000\u0000\u0000st\u0005"+
		"\\\u0000\u0000tx\u0006\u0005\uffff\uffff\u0000uv\u0005\\\u0000\u0000v"+
		"x\u0006\u0005\uffff\uffff\u0000wo\u0001\u0000\u0000\u0000wu\u0001\u0000"+
		"\u0000\u0000x\u000b\u0001\u0000\u0000\u0000yz\u0004\u0006\u0001\u0000"+
		"z{\u0005\\\u0000\u0000{|\u0006\u0006\uffff\uffff\u0000|\u007f\u0001\u0000"+
		"\u0000\u0000}\u0080\u0003Z-\u0000~\u0080\u0003\\.\u0000\u007f}\u0001\u0000"+
		"\u0000\u0000\u007f~\u0001\u0000\u0000\u0000\u0080\r\u0001\u0000\u0000"+
		"\u0000\u0081\u0082\u0004\u0007\u0002\u0000\u0082\u0083\u0005\u001a\u0000"+
		"\u0000\u0083\u0084\u0006\u0007\uffff\uffff\u0000\u0084\u0085\u0001\u0000"+
		"\u0000\u0000\u0085\u0086\u0005\\\u0000\u0000\u0086\u0087\u0006\u0007\uffff"+
		"\uffff\u0000\u0087\u008a\u0001\u0000\u0000\u0000\u0088\u008b\u0003Z-\u0000"+
		"\u0089\u008b\u0003\\.\u0000\u008a\u0088\u0001\u0000\u0000\u0000\u008a"+
		"\u0089\u0001\u0000\u0000\u0000\u008b\u0095\u0001\u0000\u0000\u0000\u008c"+
		"\u008d\u0004\u0007\u0003\u0000\u008d\u008e\u0005\\\u0000\u0000\u008e\u008f"+
		"\u0006\u0007\uffff\uffff\u0000\u008f\u0092\u0001\u0000\u0000\u0000\u0090"+
		"\u0093\u0003Z-\u0000\u0091\u0093\u0003\\.\u0000\u0092\u0090\u0001\u0000"+
		"\u0000\u0000\u0092\u0091\u0001\u0000\u0000\u0000\u0093\u0095\u0001\u0000"+
		"\u0000\u0000\u0094\u0081\u0001\u0000\u0000\u0000\u0094\u008c\u0001\u0000"+
		"\u0000\u0000\u0095\u000f\u0001\u0000\u0000\u0000\u0096\u0097\u0004\b\u0004"+
		"\u0000\u0097\u0098\u0005\\\u0000\u0000\u0098\u0099\u0006\b\uffff\uffff"+
		"\u0000\u0099\u009a\u0001\u0000\u0000\u0000\u009a\u009b\u0005\u001c\u0000"+
		"\u0000\u009b\u009c\u0005\\\u0000\u0000\u009c\u009d\u0006\b\uffff\uffff"+
		"\u0000\u009d\u00a0\u0001\u0000\u0000\u0000\u009e\u00a1\u0003V+\u0000\u009f"+
		"\u00a1\u0003X,\u0000\u00a0\u009e\u0001\u0000\u0000\u0000\u00a0\u009f\u0001"+
		"\u0000\u0000\u0000\u00a1\u0011\u0001\u0000\u0000\u0000\u00a2\u00a3\u0004"+
		"\t\u0005\u0000\u00a3\u00a4\u0005\u001a\u0000\u0000\u00a4\u00a5\u0006\t"+
		"\uffff\uffff\u0000\u00a5\u00a6\u0001\u0000\u0000\u0000\u00a6\u00a7\u0005"+
		"\\\u0000\u0000\u00a7\u00a8\u0006\t\uffff\uffff\u0000\u00a8\u00a9\u0001"+
		"\u0000\u0000\u0000\u00a9\u00aa\u0005\u001c\u0000\u0000\u00aa\u00ab\u0005"+
		"\\\u0000\u0000\u00ab\u00ac\u0006\t\uffff\uffff\u0000\u00ac\u00af\u0001"+
		"\u0000\u0000\u0000\u00ad\u00b0\u0003V+\u0000\u00ae\u00b0\u0003X,\u0000"+
		"\u00af\u00ad\u0001\u0000\u0000\u0000\u00af\u00ae\u0001\u0000\u0000\u0000"+
		"\u00b0\u00be\u0001\u0000\u0000\u0000\u00b1\u00b2\u0004\t\u0006\u0000\u00b2"+
		"\u00b3\u0005\\\u0000\u0000\u00b3\u00b4\u0006\t\uffff\uffff\u0000\u00b4"+
		"\u00b5\u0001\u0000\u0000\u0000\u00b5\u00b6\u0005\u001c\u0000\u0000\u00b6"+
		"\u00b7\u0005\\\u0000\u0000\u00b7\u00b8\u0006\t\uffff\uffff\u0000\u00b8"+
		"\u00bb\u0001\u0000\u0000\u0000\u00b9\u00bc\u0003V+\u0000\u00ba\u00bc\u0003"+
		"X,\u0000\u00bb\u00b9\u0001\u0000\u0000\u0000\u00bb\u00ba\u0001\u0000\u0000"+
		"\u0000\u00bc\u00be\u0001\u0000\u0000\u0000\u00bd\u00a2\u0001\u0000\u0000"+
		"\u0000\u00bd\u00b1\u0001\u0000\u0000\u0000\u00be\u0013\u0001\u0000\u0000"+
		"\u0000\u00bf\u00c0\u0004\n\u0007\u0000\u00c0\u00c1\u0005\\\u0000\u0000"+
		"\u00c1\u00c2\u0006\n\uffff\uffff\u0000\u00c2\u00c3\u0001\u0000\u0000\u0000"+
		"\u00c3\u00c4\u0005\u001c\u0000\u0000\u00c4\u00c5\u0005\\\u0000\u0000\u00c5"+
		"\u00c6\u0006\n\uffff\uffff\u0000\u00c6\u0015\u0001\u0000\u0000\u0000\u00c7"+
		"\u00c8\u0004\u000b\b\u0000\u00c8\u00c9\u0005\u001a\u0000\u0000\u00c9\u00ca"+
		"\u0006\u000b\uffff\uffff\u0000\u00ca\u00cb\u0001\u0000\u0000\u0000\u00cb"+
		"\u00cc\u0005\\\u0000\u0000\u00cc\u00cd\u0006\u000b\uffff\uffff\u0000\u00cd"+
		"\u00ce\u0001\u0000\u0000\u0000\u00ce\u00cf\u0005\u001c\u0000\u0000\u00cf"+
		"\u00d0\u0005\\\u0000\u0000\u00d0\u00d9\u0006\u000b\uffff\uffff\u0000\u00d1"+
		"\u00d2\u0004\u000b\t\u0000\u00d2\u00d3\u0005\\\u0000\u0000\u00d3\u00d4"+
		"\u0006\u000b\uffff\uffff\u0000\u00d4\u00d5\u0001\u0000\u0000\u0000\u00d5"+
		"\u00d6\u0005\u001c\u0000\u0000\u00d6\u00d7\u0005\\\u0000\u0000\u00d7\u00d9"+
		"\u0006\u000b\uffff\uffff\u0000\u00d8\u00c7\u0001\u0000\u0000\u0000\u00d8"+
		"\u00d1\u0001\u0000\u0000\u0000\u00d9\u0017\u0001\u0000\u0000\u0000\u00da"+
		"\u00db\u0005S\u0000\u0000\u00db\u00dc\u0006\f\uffff\uffff\u0000\u00dc"+
		"\u0019\u0001\u0000\u0000\u0000\u00dd\u00de\u0005Y\u0000\u0000\u00de\u00df"+
		"\u0006\r\uffff\uffff\u0000\u00df\u001b\u0001\u0000\u0000\u0000\u00e0\u00e1"+
		"\u0005W\u0000\u0000\u00e1\u00e2\u0006\u000e\uffff\uffff\u0000\u00e2\u001d"+
		"\u0001\u0000\u0000\u0000\u00e3\u00e4\u0005U\u0000\u0000\u00e4\u00e5\u0006"+
		"\u000f\uffff\uffff\u0000\u00e5\u001f\u0001\u0000\u0000\u0000\u00e6\u00e7"+
		"\u0005T\u0000\u0000\u00e7\u00e8\u0006\u0010\uffff\uffff\u0000\u00e8\u00ee"+
		"\u0001\u0000\u0000\u0000\u00e9\u00ea\u0005\u001c\u0000\u0000\u00ea\u00eb"+
		"\u0005T\u0000\u0000\u00eb\u00ed\u0006\u0010\uffff\uffff\u0000\u00ec\u00e9"+
		"\u0001\u0000\u0000\u0000\u00ed\u00f0\u0001\u0000\u0000\u0000\u00ee\u00ec"+
		"\u0001\u0000\u0000\u0000\u00ee\u00ef\u0001\u0000\u0000\u0000\u00ef!\u0001"+
		"\u0000\u0000\u0000\u00f0\u00ee\u0001\u0000\u0000\u0000\u00f1\u00f2\u0005"+
		"\u0011\u0000\u0000\u00f2\u00f3\u0003 \u0010\u0000\u00f3\u00f4\u0006\u0011"+
		"\uffff\uffff\u0000\u00f4\u00f5\u0005#\u0000\u0000\u00f5#\u0001\u0000\u0000"+
		"\u0000\u00f6\u00f7\u0005(\u0000\u0000\u00f7\u00f8\u0003 \u0010\u0000\u00f8"+
		"\u00fc\u0006\u0012\uffff\uffff\u0000\u00f9\u00fa\u0005\u001c\u0000\u0000"+
		"\u00fa\u00fb\u0005\u0017\u0000\u0000\u00fb\u00fd\u0006\u0012\uffff\uffff"+
		"\u0000\u00fc\u00f9\u0001\u0000\u0000\u0000\u00fc\u00fd\u0001\u0000\u0000"+
		"\u0000\u00fd\u00fe\u0001\u0000\u0000\u0000\u00fe\u00ff\u0005#\u0000\u0000"+
		"\u00ff%\u0001\u0000\u0000\u0000\u0100\u0101\u0005G\u0000\u0000\u0101\u0111"+
		"\u0006\u0013\uffff\uffff\u0000\u0102\u0103\u0005H\u0000\u0000\u0103\u0111"+
		"\u0006\u0013\uffff\uffff\u0000\u0104\u0105\u0005I\u0000\u0000\u0105\u0111"+
		"\u0006\u0013\uffff\uffff\u0000\u0106\u0107\u0005J\u0000\u0000\u0107\u0111"+
		"\u0006\u0013\uffff\uffff\u0000\u0108\u0109\u0005K\u0000\u0000\u0109\u0111"+
		"\u0006\u0013\uffff\uffff\u0000\u010a\u010b\u0005L\u0000\u0000\u010b\u0111"+
		"\u0006\u0013\uffff\uffff\u0000\u010c\u010d\u0005M\u0000\u0000\u010d\u0111"+
		"\u0006\u0013\uffff\uffff\u0000\u010e\u010f\u0005N\u0000\u0000\u010f\u0111"+
		"\u0006\u0013\uffff\uffff\u0000\u0110\u0100\u0001\u0000\u0000\u0000\u0110"+
		"\u0102\u0001\u0000\u0000\u0000\u0110\u0104\u0001\u0000\u0000\u0000\u0110"+
		"\u0106\u0001\u0000\u0000\u0000\u0110\u0108\u0001\u0000\u0000\u0000\u0110"+
		"\u010a\u0001\u0000\u0000\u0000\u0110\u010c\u0001\u0000\u0000\u0000\u0110"+
		"\u010e\u0001\u0000\u0000\u0000\u0111\'\u0001\u0000\u0000\u0000\u0112\u0113"+
		"\u0003 \u0010\u0000\u0113\u0114\u0006\u0014\uffff\uffff\u0000\u0114)\u0001"+
		"\u0000\u0000\u0000\u0115\u0116\u0003,\u0016\u0000\u0116\u0117\u0006\u0015"+
		"\uffff\uffff\u0000\u0117\u011c\u0001\u0000\u0000\u0000\u0118\u0119\u0003"+
		"N\'\u0000\u0119\u011a\u0006\u0015\uffff\uffff\u0000\u011a\u011c\u0001"+
		"\u0000\u0000\u0000\u011b\u0115\u0001\u0000\u0000\u0000\u011b\u0118\u0001"+
		"\u0000\u0000\u0000\u011c+\u0001\u0000\u0000\u0000\u011d\u011e\u0005\u0012"+
		"\u0000\u0000\u011e-\u0001\u0000\u0000\u0000\u011f\u0120\u0005\u000b\u0000"+
		"\u0000\u0120\u0121\u0005T\u0000\u0000\u0121\u0122\u0006\u0017\uffff\uffff"+
		"\u0000\u0122\u0123\u0001\u0000\u0000\u0000\u0123\u0127\u0005@\u0000\u0000"+
		"\u0124\u0125\u0003R)\u0000\u0125\u0126\u0006\u0017\uffff\uffff\u0000\u0126"+
		"\u0128\u0001\u0000\u0000\u0000\u0127\u0124\u0001\u0000\u0000\u0000\u0128"+
		"\u0129\u0001\u0000\u0000\u0000\u0129\u0127\u0001\u0000\u0000\u0000\u0129"+
		"\u012a\u0001\u0000\u0000\u0000\u012a\u012b\u0001\u0000\u0000\u0000\u012b"+
		"\u012c\u0005B\u0000\u0000\u012c/\u0001\u0000\u0000\u0000\u012d\u012e\u0005"+
		"T\u0000\u0000\u012e\u012f\u0006\u0018\uffff\uffff\u0000\u012f\u0135\u0001"+
		"\u0000\u0000\u0000\u0130\u0131\u0005\u001a\u0000\u0000\u0131\u0132\u0005"+
		"T\u0000\u0000\u0132\u0134\u0006\u0018\uffff\uffff\u0000\u0133\u0130\u0001"+
		"\u0000\u0000\u0000\u0134\u0137\u0001\u0000\u0000\u0000\u0135\u0133\u0001"+
		"\u0000\u0000\u0000\u0135\u0136\u0001\u0000\u0000\u0000\u01361\u0001\u0000"+
		"\u0000\u0000\u0137\u0135\u0001\u0000\u0000\u0000\u0138\u0139\u0005>\u0000"+
		"\u0000\u0139\u0153\u0005@\u0000\u0000\u013a\u013b\u0005=\u0000\u0000\u013b"+
		"\u013c\u00030\u0018\u0000\u013c\u013d\u0006\u0019\uffff\uffff\u0000\u013d"+
		"\u013e\u0005#\u0000\u0000\u013e\u0152\u0001\u0000\u0000\u0000\u013f\u0140"+
		"\u0005<\u0000\u0000\u0140\u0141\u0003\u0006\u0003\u0000\u0141\u0142\u0006"+
		"\u0019\uffff\uffff\u0000\u0142\u0143\u0005#\u0000\u0000\u0143\u0152\u0001"+
		"\u0000\u0000\u0000\u0144\u0145\u0005-\u0000\u0000\u0145\u0146\u0003\u0006"+
		"\u0003\u0000\u0146\u0147\u0006\u0019\uffff\uffff\u0000\u0147\u0148\u0005"+
		"#\u0000\u0000\u0148\u0152\u0001\u0000\u0000\u0000\u0149\u014a\u0005\u0013"+
		"\u0000\u0000\u014a\u014b\u0005,\u0000\u0000\u014b\u014c\u0006\u0019\uffff"+
		"\uffff\u0000\u014c\u014d\u0001\u0000\u0000\u0000\u014d\u0152\u0005#\u0000"+
		"\u0000\u014e\u014f\u00034\u001a\u0000\u014f\u0150\u0006\u0019\uffff\uffff"+
		"\u0000\u0150\u0152\u0001\u0000\u0000\u0000\u0151\u013a\u0001\u0000\u0000"+
		"\u0000\u0151\u013f\u0001\u0000\u0000\u0000\u0151\u0144\u0001\u0000\u0000"+
		"\u0000\u0151\u0149\u0001\u0000\u0000\u0000\u0151\u014e\u0001\u0000\u0000"+
		"\u0000\u0152\u0155\u0001\u0000\u0000\u0000\u0153\u0151\u0001\u0000\u0000"+
		"\u0000\u0153\u0154\u0001\u0000\u0000\u0000\u0154\u0156\u0001\u0000\u0000"+
		"\u0000\u0155\u0153\u0001\u0000\u0000\u0000\u0156\u0157\u0005B\u0000\u0000"+
		"\u01573\u0001\u0000\u0000\u0000\u0158\u0159\u0005A\u0000\u0000\u0159\u019d"+
		"\u0005@\u0000\u0000\u015a\u015e\u0005+\u0000\u0000\u015b\u015c\u00030"+
		"\u0018\u0000\u015c\u015d\u0006\u001a\uffff\uffff\u0000\u015d\u015f\u0001"+
		"\u0000\u0000\u0000\u015e\u015b\u0001\u0000\u0000\u0000\u015f\u0160\u0001"+
		"\u0000\u0000\u0000\u0160\u015e\u0001\u0000\u0000\u0000\u0160\u0161\u0001"+
		"\u0000\u0000\u0000\u0161\u0162\u0001\u0000\u0000\u0000\u0162\u0163\u0005"+
		"#\u0000\u0000\u0163\u019c\u0001\u0000\u0000\u0000\u0164\u0165\u0005)\u0000"+
		"\u0000\u0165\u0166\u0003\u0006\u0003\u0000\u0166\u0167\u0006\u001a\uffff"+
		"\uffff\u0000\u0167\u0168\u0005#\u0000\u0000\u0168\u019c\u0001\u0000\u0000"+
		"\u0000\u0169\u016c\u0005!\u0000\u0000\u016a\u016b\u0005T\u0000\u0000\u016b"+
		"\u016d\u0006\u001a\uffff\uffff\u0000\u016c\u016a\u0001\u0000\u0000\u0000"+
		"\u016d\u016e\u0001\u0000\u0000\u0000\u016e\u016c\u0001\u0000\u0000\u0000"+
		"\u016e\u016f\u0001\u0000\u0000\u0000\u016f\u0170\u0001\u0000\u0000\u0000"+
		"\u0170\u019c\u0005#\u0000\u0000\u0171\u0172\u0005\t\u0000\u0000\u0172"+
		"\u017e\u00051\u0000\u0000\u0173\u0174\u0003\u0006\u0003\u0000\u0174\u017b"+
		"\u0006\u001a\uffff\uffff\u0000\u0175\u0176\u0005\u0019\u0000\u0000\u0176"+
		"\u0177\u0003\u0006\u0003\u0000\u0177\u0178\u0006\u001a\uffff\uffff\u0000"+
		"\u0178\u017a\u0001\u0000\u0000\u0000\u0179\u0175\u0001\u0000\u0000\u0000"+
		"\u017a\u017d\u0001\u0000\u0000\u0000\u017b\u0179\u0001\u0000\u0000\u0000"+
		"\u017b\u017c\u0001\u0000\u0000\u0000\u017c\u017f\u0001\u0000\u0000\u0000"+
		"\u017d\u017b\u0001\u0000\u0000\u0000\u017e\u0173\u0001\u0000\u0000\u0000"+
		"\u017e\u017f\u0001\u0000\u0000\u0000\u017f\u0180\u0001\u0000\u0000\u0000"+
		"\u0180\u0181\u00052\u0000\u0000\u0181\u019c\u0005#\u0000\u0000\u0182\u0183"+
		"\u0005\u001b\u0000\u0000\u0183\u0184\u0003\u0006\u0003\u0000\u0184\u0185"+
		"\u0006\u001a\uffff\uffff\u0000\u0185\u0186\u0005#\u0000\u0000\u0186\u019c"+
		"\u0001\u0000\u0000\u0000\u0187\u0188\u0005\u0016\u0000\u0000\u0188\u0189"+
		"\u0003\u0006\u0003\u0000\u0189\u018a\u0006\u001a\uffff\uffff\u0000\u018a"+
		"\u018b\u0005#\u0000\u0000\u018b\u019c\u0001\u0000\u0000\u0000\u018c\u018d"+
		"\u0005\f\u0000\u0000\u018d\u018e\u0003\u0006\u0003\u0000\u018e\u018f\u0006"+
		"\u001a\uffff\uffff\u0000\u018f\u0190\u0005#\u0000\u0000\u0190\u019c\u0001"+
		"\u0000\u0000\u0000\u0191\u0198\u0005\u0006\u0000\u0000\u0192\u0193\u0005"+
		"O\u0000\u0000\u0193\u0199\u0006\u001a\uffff\uffff\u0000\u0194\u0195\u0005"+
		"P\u0000\u0000\u0195\u0199\u0006\u001a\uffff\uffff\u0000\u0196\u0197\u0005"+
		"Q\u0000\u0000\u0197\u0199\u0006\u001a\uffff\uffff\u0000\u0198\u0192\u0001"+
		"\u0000\u0000\u0000\u0198\u0194\u0001\u0000\u0000\u0000\u0198\u0196\u0001"+
		"\u0000\u0000\u0000\u0199\u019a\u0001\u0000\u0000\u0000\u019a\u019c\u0005"+
		"#\u0000\u0000\u019b\u015a\u0001\u0000\u0000\u0000\u019b\u0164\u0001\u0000"+
		"\u0000\u0000\u019b\u0169\u0001\u0000\u0000\u0000\u019b\u0171\u0001\u0000"+
		"\u0000\u0000\u019b\u0182\u0001\u0000\u0000\u0000\u019b\u0187\u0001\u0000"+
		"\u0000\u0000\u019b\u018c\u0001\u0000\u0000\u0000\u019b\u0191\u0001\u0000"+
		"\u0000\u0000\u019c\u019f\u0001\u0000\u0000\u0000\u019d\u019b\u0001\u0000"+
		"\u0000\u0000\u019d\u019e\u0001\u0000\u0000\u0000\u019e\u01a0\u0001\u0000"+
		"\u0000\u0000\u019f\u019d\u0001\u0000\u0000\u0000\u01a0\u01a1\u0005B\u0000"+
		"\u0000\u01a15\u0001\u0000\u0000\u0000\u01a2\u01a3\u0005\u0014\u0000\u0000"+
		"\u01a3\u01a4\u0003\u0006\u0003\u0000\u01a4\u01a5\u0006\u001b\uffff\uffff"+
		"\u0000\u01a5\u01a6\u0005#\u0000\u0000\u01a6\u01a7\u00055\u0000\u0000\u01a7"+
		"\u01a8\u0003\u0006\u0003\u0000\u01a8\u01a9\u0006\u001b\uffff\uffff\u0000"+
		"\u01a9\u01aa\u0005#\u0000\u0000\u01aa7\u0001\u0000\u0000\u0000\u01ab\u01ac"+
		"\u0005D\u0000\u0000\u01ac\u01ad\u0005\u0005\u0000\u0000\u01ad\u01e7\u0005"+
		"@\u0000\u0000\u01ae\u01af\u00036\u001b\u0000\u01af\u01b0\u0006\u001c\uffff"+
		"\uffff\u0000\u01b0\u01e6\u0001\u0000\u0000\u0000\u01b1\u01b2\u0005;\u0000"+
		"\u0000\u01b2\u01be\u00051\u0000\u0000\u01b3\u01b4\u0003\u0006\u0003\u0000"+
		"\u01b4\u01bb\u0006\u001c\uffff\uffff\u0000\u01b5\u01b6\u0005\u0019\u0000"+
		"\u0000\u01b6\u01b7\u0003\u0006\u0003\u0000\u01b7\u01b8\u0006\u001c\uffff"+
		"\uffff\u0000\u01b8\u01ba\u0001\u0000\u0000\u0000\u01b9\u01b5\u0001\u0000"+
		"\u0000\u0000\u01ba\u01bd\u0001\u0000\u0000\u0000\u01bb\u01b9\u0001\u0000"+
		"\u0000\u0000\u01bb\u01bc\u0001\u0000\u0000\u0000\u01bc\u01bf\u0001\u0000"+
		"\u0000\u0000\u01bd\u01bb\u0001\u0000\u0000\u0000\u01be\u01b3\u0001\u0000"+
		"\u0000\u0000\u01be\u01bf\u0001\u0000\u0000\u0000\u01bf\u01c0\u0001\u0000"+
		"\u0000\u0000\u01c0\u01c1\u00052\u0000\u0000\u01c1\u01e6\u0005#\u0000\u0000"+
		"\u01c2\u01c3\u0005\u0001\u0000\u0000\u01c3\u01c4\u00051\u0000\u0000\u01c4"+
		"\u01c5\u0003\u0006\u0003\u0000\u01c5\u01cc\u0006\u001c\uffff\uffff\u0000"+
		"\u01c6\u01c7\u0005\u0019\u0000\u0000\u01c7\u01c8\u0003\u0006\u0003\u0000"+
		"\u01c8\u01c9\u0006\u001c\uffff\uffff\u0000\u01c9\u01cb\u0001\u0000\u0000"+
		"\u0000\u01ca\u01c6\u0001\u0000\u0000\u0000\u01cb\u01ce\u0001\u0000\u0000"+
		"\u0000\u01cc\u01ca\u0001\u0000\u0000\u0000\u01cc\u01cd\u0001\u0000\u0000"+
		"\u0000\u01cd\u01d0\u0001\u0000\u0000\u0000\u01ce\u01cc\u0001\u0000\u0000"+
		"\u0000\u01cf\u01c2\u0001\u0000\u0000\u0000\u01cf\u01d0\u0001\u0000\u0000"+
		"\u0000\u01d0\u01d1\u0001\u0000\u0000\u0000\u01d1\u01d2\u00052\u0000\u0000"+
		"\u01d2\u01e6\u0005#\u0000\u0000\u01d3\u01d4\u0005:\u0000\u0000\u01d4\u01d5"+
		"\u0003\u0006\u0003\u0000\u01d5\u01d6\u0006\u001c\uffff\uffff\u0000\u01d6"+
		"\u01d7\u0005#\u0000\u0000\u01d7\u01e6\u0001\u0000\u0000\u0000\u01d8\u01d9"+
		"\u0005\u0018\u0000\u0000\u01d9\u01da\u0003\u0006\u0003\u0000\u01da\u01db"+
		"\u0006\u001c\uffff\uffff\u0000\u01db\u01dc\u0005#\u0000\u0000\u01dc\u01e6"+
		"\u0001\u0000\u0000\u0000\u01dd\u01de\u0005\u000e\u0000\u0000\u01de\u01df"+
		"\u0003\u0006\u0003\u0000\u01df\u01e0\u0006\u001c\uffff\uffff\u0000\u01e0"+
		"\u01e1\u0005#\u0000\u0000\u01e1\u01e6\u0001\u0000\u0000\u0000\u01e2\u01e3"+
		"\u0003>\u001f\u0000\u01e3\u01e4\u0006\u001c\uffff\uffff\u0000\u01e4\u01e6"+
		"\u0001\u0000\u0000\u0000\u01e5\u01ae\u0001\u0000\u0000\u0000\u01e5\u01b1"+
		"\u0001\u0000\u0000\u0000\u01e5\u01cf\u0001\u0000\u0000\u0000\u01e5\u01d3"+
		"\u0001\u0000\u0000\u0000\u01e5\u01d8\u0001\u0000\u0000\u0000\u01e5\u01dd"+
		"\u0001\u0000\u0000\u0000\u01e5\u01e2\u0001\u0000\u0000\u0000\u01e6\u01e9"+
		"\u0001\u0000\u0000\u0000\u01e7\u01e5\u0001\u0000\u0000\u0000\u01e7\u01e8"+
		"\u0001\u0000\u0000\u0000\u01e8\u01ea\u0001\u0000\u0000\u0000\u01e9\u01e7"+
		"\u0001\u0000\u0000\u0000\u01ea\u01eb\u0005B\u0000\u0000\u01eb9\u0001\u0000"+
		"\u0000\u0000\u01ec\u01ed\u0005\u0015\u0000\u0000\u01ed\u01ee\u0005\u0005"+
		"\u0000\u0000\u01ee\u0227\u0005@\u0000\u0000\u01ef\u01f0\u00036\u001b\u0000"+
		"\u01f0\u01f1\u0006\u001d\uffff\uffff\u0000\u01f1\u0226\u0001\u0000\u0000"+
		"\u0000\u01f2\u01f3\u0005\u0010\u0000\u0000\u01f3\u01f4\u0003\u0006\u0003"+
		"\u0000\u01f4\u01f5\u0006\u001d\uffff\uffff\u0000\u01f5\u01f6\u0005#\u0000"+
		"\u0000\u01f6\u0226\u0001\u0000\u0000\u0000\u01f7\u01f8\u0005\b\u0000\u0000"+
		"\u01f8\u01f9\u0005T\u0000\u0000\u01f9\u01fa\u0006\u001d\uffff\uffff\u0000"+
		"\u01fa\u0200\u0001\u0000\u0000\u0000\u01fb\u01fc\u0005\"\u0000\u0000\u01fc"+
		"\u01fd\u0005T\u0000\u0000\u01fd\u01ff\u0006\u001d\uffff\uffff\u0000\u01fe"+
		"\u01fb\u0001\u0000\u0000\u0000\u01ff\u0202\u0001\u0000\u0000\u0000\u0200"+
		"\u01fe\u0001\u0000\u0000\u0000\u0200\u0201\u0001\u0000\u0000\u0000\u0201"+
		"\u0203\u0001\u0000\u0000\u0000\u0202\u0200\u0001\u0000\u0000\u0000\u0203"+
		"\u0226\u0005#\u0000\u0000\u0204\u0205\u0005\u000f\u0000\u0000\u0205\u0206"+
		"\u0003\u0006\u0003\u0000\u0206\u0207\u0006\u001d\uffff\uffff\u0000\u0207"+
		"\u0208\u0005#\u0000\u0000\u0208\u0226\u0001\u0000\u0000\u0000\u0209\u020a"+
		"\u0005\u0003\u0000\u0000\u020a\u020b\u0003\u0006\u0003\u0000\u020b\u020c"+
		"\u0006\u001d\uffff\uffff\u0000\u020c\u020d\u0005#\u0000\u0000\u020d\u0226"+
		"\u0001\u0000\u0000\u0000\u020e\u020f\u0005\u0007\u0000\u0000\u020f\u021b"+
		"\u0005@\u0000\u0000\u0210\u0211\u0003\u0006\u0003\u0000\u0211\u0218\u0006"+
		"\u001d\uffff\uffff\u0000\u0212\u0213\u0005\u0019\u0000\u0000\u0213\u0214"+
		"\u0003\u0006\u0003\u0000\u0214\u0215\u0006\u001d\uffff\uffff\u0000\u0215"+
		"\u0217\u0001\u0000\u0000\u0000\u0216\u0212\u0001\u0000\u0000\u0000\u0217"+
		"\u021a\u0001\u0000\u0000\u0000\u0218\u0216\u0001\u0000\u0000\u0000\u0218"+
		"\u0219\u0001\u0000\u0000\u0000\u0219\u021c\u0001\u0000\u0000\u0000\u021a"+
		"\u0218\u0001\u0000\u0000\u0000\u021b\u0210\u0001\u0000\u0000\u0000\u021b"+
		"\u021c\u0001\u0000\u0000\u0000\u021c\u021d\u0001\u0000\u0000\u0000\u021d"+
		"\u021e\u0005B\u0000\u0000\u021e\u0226\u0005#\u0000\u0000\u021f\u0220\u0003"+
		"<\u001e\u0000\u0220\u0221\u0006\u001d\uffff\uffff\u0000\u0221\u0226\u0001"+
		"\u0000\u0000\u0000\u0222\u0223\u0003>\u001f\u0000\u0223\u0224\u0006\u001d"+
		"\uffff\uffff\u0000\u0224\u0226\u0001\u0000\u0000\u0000\u0225\u01ef\u0001"+
		"\u0000\u0000\u0000\u0225\u01f2\u0001\u0000\u0000\u0000\u0225\u01f7\u0001"+
		"\u0000\u0000\u0000\u0225\u0204\u0001\u0000\u0000\u0000\u0225\u0209\u0001"+
		"\u0000\u0000\u0000\u0225\u020e\u0001\u0000\u0000\u0000\u0225\u021f\u0001"+
		"\u0000\u0000\u0000\u0225\u0222\u0001\u0000\u0000\u0000\u0226\u0229\u0001"+
		"\u0000\u0000\u0000\u0227\u0225\u0001\u0000\u0000\u0000\u0227\u0228\u0001"+
		"\u0000\u0000\u0000\u0228\u022a\u0001\u0000\u0000\u0000\u0229\u0227\u0001"+
		"\u0000\u0000\u0000\u022a\u022b\u0005B\u0000\u0000\u022b;\u0001\u0000\u0000"+
		"\u0000\u022c\u022d\u0005\u001d\u0000\u0000\u022d\u022e\u00056\u0000\u0000"+
		"\u022e\u024d\u0005@\u0000\u0000\u022f\u0230\u0005?\u0000\u0000\u0230\u0242"+
		"\u0005@\u0000\u0000\u0231\u0232\u00030\u0018\u0000\u0232\u0233\u0006\u001e"+
		"\uffff\uffff\u0000\u0233\u0234\u0005%\u0000\u0000\u0234\u0235\u0003\u0006"+
		"\u0003\u0000\u0235\u023f\u0006\u001e\uffff\uffff\u0000\u0236\u0237\u0005"+
		"\u0019\u0000\u0000\u0237\u0238\u00030\u0018\u0000\u0238\u0239\u0006\u001e"+
		"\uffff\uffff\u0000\u0239\u023a\u0005%\u0000\u0000\u023a\u023b\u0003\u0006"+
		"\u0003\u0000\u023b\u023c\u0006\u001e\uffff\uffff\u0000\u023c\u023e\u0001"+
		"\u0000\u0000\u0000\u023d\u0236\u0001\u0000\u0000\u0000\u023e\u0241\u0001"+
		"\u0000\u0000\u0000\u023f\u023d\u0001\u0000\u0000\u0000\u023f\u0240\u0001"+
		"\u0000\u0000\u0000\u0240\u0243\u0001\u0000\u0000\u0000\u0241\u023f\u0001"+
		"\u0000\u0000\u0000\u0242\u0231\u0001\u0000\u0000\u0000\u0242\u0243\u0001"+
		"\u0000\u0000\u0000\u0243\u0244\u0001\u0000\u0000\u0000\u0244\u0245\u0005"+
		"B\u0000\u0000\u0245\u024c\u0005#\u0000\u0000\u0246\u0247\u0005\u0004\u0000"+
		"\u0000\u0247\u0248\u0003\u0006\u0003\u0000\u0248\u0249\u0006\u001e\uffff"+
		"\uffff\u0000\u0249\u024a\u0005#\u0000\u0000\u024a\u024c\u0001\u0000\u0000"+
		"\u0000\u024b\u022f\u0001\u0000\u0000\u0000\u024b\u0246\u0001\u0000\u0000"+
		"\u0000\u024c\u024f\u0001\u0000\u0000\u0000\u024d\u024b\u0001\u0000\u0000"+
		"\u0000\u024d\u024e\u0001\u0000\u0000\u0000\u024e\u0250\u0001\u0000\u0000"+
		"\u0000\u024f\u024d\u0001\u0000\u0000\u0000\u0250\u0251\u0005B\u0000\u0000"+
		"\u0251=\u0001\u0000\u0000\u0000\u0252\u0253\u0005\'\u0000\u0000\u0253"+
		"\u0254\u00054\u0000\u0000\u0254\u0282\u0005@\u0000\u0000\u0255\u0256\u0005"+
		"\u0002\u0000\u0000\u0256\u0257\u0003\u0006\u0003\u0000\u0257\u0258\u0006"+
		"\u001f\uffff\uffff\u0000\u0258\u0259\u0005#\u0000\u0000\u0259\u0281\u0001"+
		"\u0000\u0000\u0000\u025a\u025b\u00059\u0000\u0000\u025b\u0264\u0005@\u0000"+
		"\u0000\u025c\u025d\u0005T\u0000\u0000\u025d\u025e\u0006\u001f\uffff\uffff"+
		"\u0000\u025e\u025f\u0001\u0000\u0000\u0000\u025f\u0260\u0005%\u0000\u0000"+
		"\u0260\u0261\u0003\u0006\u0003\u0000\u0261\u0262\u0006\u001f\uffff\uffff"+
		"\u0000\u0262\u0265\u0001\u0000\u0000\u0000\u0263\u0265\u0005\u0019\u0000"+
		"\u0000\u0264\u025c\u0001\u0000\u0000\u0000\u0264\u0263\u0001\u0000\u0000"+
		"\u0000\u0265\u0266\u0001\u0000\u0000\u0000\u0266\u0264\u0001\u0000\u0000"+
		"\u0000\u0266\u0267\u0001\u0000\u0000\u0000\u0267\u0268\u0001\u0000\u0000"+
		"\u0000\u0268\u0269\u0005B\u0000\u0000\u0269\u0281\u0005#\u0000\u0000\u026a"+
		"\u026b\u0005&\u0000\u0000\u026b\u026c\u00051\u0000\u0000\u026c\u026d\u0003"+
		"@ \u0000\u026d\u0274\u0006\u001f\uffff\uffff\u0000\u026e\u026f\u0005\u0019"+
		"\u0000\u0000\u026f\u0270\u0003@ \u0000\u0270\u0271\u0006\u001f\uffff\uffff"+
		"\u0000\u0271\u0273\u0001\u0000\u0000\u0000\u0272\u026e\u0001\u0000\u0000"+
		"\u0000\u0273\u0276\u0001\u0000\u0000\u0000\u0274\u0272\u0001\u0000\u0000"+
		"\u0000\u0274\u0275\u0001\u0000\u0000\u0000\u0275\u0277\u0001\u0000\u0000"+
		"\u0000\u0276\u0274\u0001\u0000\u0000\u0000\u0277\u0278\u00052\u0000\u0000"+
		"\u0278\u0279\u0005#\u0000\u0000\u0279\u0281\u0001\u0000\u0000\u0000\u027a"+
		"\u027b\u0003B!\u0000\u027b\u027c\u0006\u001f\uffff\uffff\u0000\u027c\u0281"+
		"\u0001\u0000\u0000\u0000\u027d\u027e\u0003D\"\u0000\u027e\u027f\u0006"+
		"\u001f\uffff\uffff\u0000\u027f\u0281\u0001\u0000\u0000\u0000\u0280\u0255"+
		"\u0001\u0000\u0000\u0000\u0280\u025a\u0001\u0000\u0000\u0000\u0280\u026a"+
		"\u0001\u0000\u0000\u0000\u0280\u027a\u0001\u0000\u0000\u0000\u0280\u027d"+
		"\u0001\u0000\u0000\u0000\u0281\u0284\u0001\u0000\u0000\u0000\u0282\u0280"+
		"\u0001\u0000\u0000\u0000\u0282\u0283\u0001\u0000\u0000\u0000\u0283\u0285"+
		"\u0001\u0000\u0000\u0000\u0284\u0282\u0001\u0000\u0000\u0000\u0285\u0286"+
		"\u0005B\u0000\u0000\u0286?\u0001\u0000\u0000\u0000\u0287\u0288\u0005\u001e"+
		"\u0000\u0000\u0288\u0289\u0005@\u0000\u0000\u0289\u028a\u0005 \u0000\u0000"+
		"\u028a\u028b\u00030\u0018\u0000\u028b\u028c\u0006 \uffff\uffff\u0000\u028c"+
		"\u028d\u0005#\u0000\u0000\u028d\u028e\u0005\n\u0000\u0000\u028e\u029a"+
		"\u00051\u0000\u0000\u028f\u0290\u00030\u0018\u0000\u0290\u0297\u0006 "+
		"\uffff\uffff\u0000\u0291\u0292\u0005\u0019\u0000\u0000\u0292\u0293\u0003"+
		"0\u0018\u0000\u0293\u0294\u0006 \uffff\uffff\u0000\u0294\u0296\u0001\u0000"+
		"\u0000\u0000\u0295\u0291\u0001\u0000\u0000\u0000\u0296\u0299\u0001\u0000"+
		"\u0000\u0000\u0297\u0295\u0001\u0000\u0000\u0000\u0297\u0298\u0001\u0000"+
		"\u0000\u0000\u0298\u029b\u0001\u0000\u0000\u0000\u0299\u0297\u0001\u0000"+
		"\u0000\u0000\u029a\u028f\u0001\u0000\u0000\u0000\u029a\u029b\u0001\u0000"+
		"\u0000\u0000\u029b\u029c\u0001\u0000\u0000\u0000\u029c\u029d\u00052\u0000"+
		"\u0000\u029d\u029e\u0005#\u0000\u0000\u029e\u029f\u0005B\u0000\u0000\u029f"+
		"A\u0001\u0000\u0000\u0000\u02a0\u02a1\u0005/\u0000\u0000\u02a1\u02a2\u0005"+
		".\u0000\u0000\u02a2\u02a3\u0005C\u0000\u0000\u02a3\u02ba\u0005@\u0000"+
		"\u0000\u02a4\u02a5\u00058\u0000\u0000\u02a5\u02a6\u0003\u0006\u0003\u0000"+
		"\u02a6\u02a7\u0006!\uffff\uffff\u0000\u02a7\u02a8\u0005#\u0000\u0000\u02a8"+
		"\u02b9\u0001\u0000\u0000\u0000\u02a9\u02aa\u00057\u0000\u0000\u02aa\u02ab"+
		"\u00030\u0018\u0000\u02ab\u02ac\u0006!\uffff\uffff\u0000\u02ac\u02ad\u0005"+
		"#\u0000\u0000\u02ad\u02b9\u0001\u0000\u0000\u0000\u02ae\u02af\u0005*\u0000"+
		"\u0000\u02af\u02b0\u0003\u0006\u0003\u0000\u02b0\u02b1\u0006!\uffff\uffff"+
		"\u0000\u02b1\u02b2\u0005#\u0000\u0000\u02b2\u02b9\u0001\u0000\u0000\u0000"+
		"\u02b3\u02b4\u0005$\u0000\u0000\u02b4\u02b5\u00030\u0018\u0000\u02b5\u02b6"+
		"\u0006!\uffff\uffff\u0000\u02b6\u02b7\u0005#\u0000\u0000\u02b7\u02b9\u0001"+
		"\u0000\u0000\u0000\u02b8\u02a4\u0001\u0000\u0000\u0000\u02b8\u02a9\u0001"+
		"\u0000\u0000\u0000\u02b8\u02ae\u0001\u0000\u0000\u0000\u02b8\u02b3\u0001"+
		"\u0000\u0000\u0000\u02b9\u02bc\u0001\u0000\u0000\u0000\u02ba\u02b8\u0001"+
		"\u0000\u0000\u0000\u02ba\u02bb\u0001\u0000\u0000\u0000\u02bb\u02bd\u0001"+
		"\u0000\u0000\u0000\u02bc\u02ba\u0001\u0000\u0000\u0000\u02bd\u02be\u0005"+
		"B\u0000\u0000\u02beC\u0001\u0000\u0000\u0000\u02bf\u02c0\u00053\u0000"+
		"\u0000\u02c0\u02d7\u0005@\u0000\u0000\u02c1\u02c2\u0005\r\u0000\u0000"+
		"\u02c2\u02c3\u0003\u0006\u0003\u0000\u02c3\u02c4\u0006\"\uffff\uffff\u0000"+
		"\u02c4\u02c5\u0005#\u0000\u0000\u02c5\u02d6\u0001\u0000\u0000\u0000\u02c6"+
		"\u02c7\u0005*\u0000\u0000\u02c7\u02c8\u0003\u0006\u0003\u0000\u02c8\u02c9"+
		"\u0006\"\uffff\uffff\u0000\u02c9\u02ca\u0005#\u0000\u0000\u02ca\u02d6"+
		"\u0001\u0000\u0000\u0000\u02cb\u02cc\u0005$\u0000\u0000\u02cc\u02cd\u0003"+
		"\u0006\u0003\u0000\u02cd\u02ce\u0006\"\uffff\uffff\u0000\u02ce\u02cf\u0005"+
		"#\u0000\u0000\u02cf\u02d6\u0001\u0000\u0000\u0000\u02d0\u02d1\u00050\u0000"+
		"\u0000\u02d1\u02d2\u0003\u0006\u0003\u0000\u02d2\u02d3\u0006\"\uffff\uffff"+
		"\u0000\u02d3\u02d4\u0005#\u0000\u0000\u02d4\u02d6\u0001\u0000\u0000\u0000"+
		"\u02d5\u02c1\u0001\u0000\u0000\u0000\u02d5\u02c6\u0001\u0000\u0000\u0000"+
		"\u02d5\u02cb\u0001\u0000\u0000\u0000\u02d5\u02d0\u0001\u0000\u0000\u0000"+
		"\u02d6\u02d9\u0001\u0000\u0000\u0000\u02d7\u02d5\u0001\u0000\u0000\u0000"+
		"\u02d7\u02d8\u0001\u0000\u0000\u0000\u02d8\u02da\u0001\u0000\u0000\u0000"+
		"\u02d9\u02d7\u0001\u0000\u0000\u0000\u02da\u02db\u0005B\u0000\u0000\u02db"+
		"E\u0001\u0000\u0000\u0000\u02dc\u02dd\u0003J%\u0000\u02dd\u02de\u0006"+
		"#\uffff\uffff\u0000\u02de\u02ec\u0001\u0000\u0000\u0000\u02df\u02e0\u0003"+
		"\u0000\u0000\u0000\u02e0\u02e1\u0006#\uffff\uffff\u0000\u02e1\u02ec\u0001"+
		"\u0000\u0000\u0000\u02e2\u02e3\u0003\u0002\u0001\u0000\u02e3\u02e4\u0006"+
		"#\uffff\uffff\u0000\u02e4\u02ec\u0001\u0000\u0000\u0000\u02e5\u02e6\u0003"+
		"\u0004\u0002\u0000\u02e6\u02e7\u0006#\uffff\uffff\u0000\u02e7\u02ec\u0001"+
		"\u0000\u0000\u0000\u02e8\u02e9\u0003\u0006\u0003\u0000\u02e9\u02ea\u0006"+
		"#\uffff\uffff\u0000\u02ea\u02ec\u0001\u0000\u0000\u0000\u02eb\u02dc\u0001"+
		"\u0000\u0000\u0000\u02eb\u02df\u0001\u0000\u0000\u0000\u02eb\u02e2\u0001"+
		"\u0000\u0000\u0000\u02eb\u02e5\u0001\u0000\u0000\u0000\u02eb\u02e8\u0001"+
		"\u0000\u0000\u0000\u02ecG\u0001\u0000\u0000\u0000\u02ed\u02ee\u0003L&"+
		"\u0000\u02ee\u02ef\u0006$\uffff\uffff\u0000\u02ef\u02fd\u0001\u0000\u0000"+
		"\u0000\u02f0\u02f1\u0003\u0000\u0000\u0000\u02f1\u02f2\u0006$\uffff\uffff"+
		"\u0000\u02f2\u02fd\u0001\u0000\u0000\u0000\u02f3\u02f4\u0003\u0002\u0001"+
		"\u0000\u02f4\u02f5\u0006$\uffff\uffff\u0000\u02f5\u02fd\u0001\u0000\u0000"+
		"\u0000\u02f6\u02f7\u0003\u0004\u0002\u0000\u02f7\u02f8\u0006$\uffff\uffff"+
		"\u0000\u02f8\u02fd\u0001\u0000\u0000\u0000\u02f9\u02fa\u0003\u0006\u0003"+
		"\u0000\u02fa\u02fb\u0006$\uffff\uffff\u0000\u02fb\u02fd\u0001\u0000\u0000"+
		"\u0000\u02fc\u02ed\u0001\u0000\u0000\u0000\u02fc\u02f0\u0001\u0000\u0000"+
		"\u0000\u02fc\u02f3\u0001\u0000\u0000\u0000\u02fc\u02f6\u0001\u0000\u0000"+
		"\u0000\u02fc\u02f9\u0001\u0000\u0000\u0000\u02fdI\u0001\u0000\u0000\u0000"+
		"\u02fe\u02ff\u0003\u0018\f\u0000\u02ff\u0300\u0006%\uffff\uffff\u0000"+
		"\u0300\u0317\u0001\u0000\u0000\u0000\u0301\u0302\u0003\u001c\u000e\u0000"+
		"\u0302\u0303\u0006%\uffff\uffff\u0000\u0303\u0317\u0001\u0000\u0000\u0000"+
		"\u0304\u0305\u0003\u001e\u000f\u0000\u0305\u0306\u0006%\uffff\uffff\u0000"+
		"\u0306\u0317\u0001\u0000\u0000\u0000\u0307\u0308\u0003\u001a\r\u0000\u0308"+
		"\u0309\u0006%\uffff\uffff\u0000\u0309\u0317\u0001\u0000\u0000\u0000\u030a"+
		"\u030b\u0003\b\u0004\u0000\u030b\u030c\u0006%\uffff\uffff\u0000\u030c"+
		"\u0317\u0001\u0000\u0000\u0000\u030d\u030e\u0003\f\u0006\u0000\u030e\u030f"+
		"\u0006%\uffff\uffff\u0000\u030f\u0317\u0001\u0000\u0000\u0000\u0310\u0311"+
		"\u0003\u0010\b\u0000\u0311\u0312\u0006%\uffff\uffff\u0000\u0312\u0317"+
		"\u0001\u0000\u0000\u0000\u0313\u0314\u0003\u0014\n\u0000\u0314\u0315\u0006"+
		"%\uffff\uffff\u0000\u0315\u0317\u0001\u0000\u0000\u0000\u0316\u02fe\u0001"+
		"\u0000\u0000\u0000\u0316\u0301\u0001\u0000\u0000\u0000\u0316\u0304\u0001"+
		"\u0000\u0000\u0000\u0316\u0307\u0001\u0000\u0000\u0000\u0316\u030a\u0001"+
		"\u0000\u0000\u0000\u0316\u030d\u0001\u0000\u0000\u0000\u0316\u0310\u0001"+
		"\u0000\u0000\u0000\u0316\u0313\u0001\u0000\u0000\u0000\u0317K\u0001\u0000"+
		"\u0000\u0000\u0318\u0319\u0003\n\u0005\u0000\u0319\u031a\u0006&\uffff"+
		"\uffff\u0000\u031a\u0325\u0001\u0000\u0000\u0000\u031b\u031c\u0003\u000e"+
		"\u0007\u0000\u031c\u031d\u0006&\uffff\uffff\u0000\u031d\u0325\u0001\u0000"+
		"\u0000\u0000\u031e\u031f\u0003\u0012\t\u0000\u031f\u0320\u0006&\uffff"+
		"\uffff\u0000\u0320\u0325\u0001\u0000\u0000\u0000\u0321\u0322\u0003\u0016"+
		"\u000b\u0000\u0322\u0323\u0006&\uffff\uffff\u0000\u0323\u0325\u0001\u0000"+
		"\u0000\u0000\u0324\u0318\u0001\u0000\u0000\u0000\u0324\u031b\u0001\u0000"+
		"\u0000\u0000\u0324\u031e\u0001\u0000\u0000\u0000\u0324\u0321\u0001\u0000"+
		"\u0000\u0000\u0325M\u0001\u0000\u0000\u0000\u0326\u0327\u0003&\u0013\u0000"+
		"\u0327\u0328\u0006\'\uffff\uffff\u0000\u0328\u032d\u0001\u0000\u0000\u0000"+
		"\u0329\u032a\u0003P(\u0000\u032a\u032b\u0006\'\uffff\uffff\u0000\u032b"+
		"\u032d\u0001\u0000\u0000\u0000\u032c\u0326\u0001\u0000\u0000\u0000\u032c"+
		"\u0329\u0001\u0000\u0000\u0000\u032dO\u0001\u0000\u0000\u0000\u032e\u032f"+
		"\u0003(\u0014\u0000\u032f\u0330\u0006(\uffff\uffff\u0000\u0330Q\u0001"+
		"\u0000\u0000\u0000\u0331\u0332\u00032\u0019\u0000\u0332\u0333\u0006)\uffff"+
		"\uffff\u0000\u0333\u033b\u0001\u0000\u0000\u0000\u0334\u0335\u0003D\""+
		"\u0000\u0335\u0336\u0006)\uffff\uffff\u0000\u0336\u033b\u0001\u0000\u0000"+
		"\u0000\u0337\u0338\u0003T*\u0000\u0338\u0339\u0006)\uffff\uffff\u0000"+
		"\u0339\u033b\u0001\u0000\u0000\u0000\u033a\u0331\u0001\u0000\u0000\u0000"+
		"\u033a\u0334\u0001\u0000\u0000\u0000\u033a\u0337\u0001\u0000\u0000\u0000"+
		"\u033bS\u0001\u0000\u0000\u0000\u033c\u033d\u00038\u001c\u0000\u033d\u033e"+
		"\u0006*\uffff\uffff\u0000\u033e\u0343\u0001\u0000\u0000\u0000\u033f\u0340"+
		"\u0003:\u001d\u0000\u0340\u0341\u0006*\uffff\uffff\u0000\u0341\u0343\u0001"+
		"\u0000\u0000\u0000\u0342\u033c\u0001\u0000\u0000\u0000\u0342\u033f\u0001"+
		"\u0000\u0000\u0000\u0343U\u0001\u0000\u0000\u0000\u0344\u0345\u0004+\n"+
		"\u0000\u0345\u0346\u0005T\u0000\u0000\u0346W\u0001\u0000\u0000\u0000\u0347"+
		"\u0348\u0004,\u000b\u0000\u0348\u0349\u0005T\u0000\u0000\u0349Y\u0001"+
		"\u0000\u0000\u0000\u034a\u034b\u0004-\f\u0000\u034b\u034c\u0005T\u0000"+
		"\u0000\u034c[\u0001\u0000\u0000\u0000\u034d\u034e\u0004.\r\u0000\u034e"+
		"\u034f\u0005T\u0000\u0000\u034f]\u0001\u0000\u0000\u0000;dw\u007f\u008a"+
		"\u0092\u0094\u00a0\u00af\u00bb\u00bd\u00d8\u00ee\u00fc\u0110\u011b\u0129"+
		"\u0135\u0151\u0153\u0160\u016e\u017b\u017e\u0198\u019b\u019d\u01bb\u01be"+
		"\u01cc\u01cf\u01e5\u01e7\u0200\u0218\u021b\u0225\u0227\u023f\u0242\u024b"+
		"\u024d\u0264\u0266\u0274\u0280\u0282\u0297\u029a\u02b8\u02ba\u02d5\u02d7"+
		"\u02eb\u02fc\u0316\u0324\u032c\u033a\u0342";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
