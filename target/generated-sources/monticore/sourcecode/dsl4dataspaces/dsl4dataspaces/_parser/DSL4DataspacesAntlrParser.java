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
		CALLBACKADDRESS105567183=4, DATASPACECONNECTORCONFIGURATION2963456037=5, 
		OPCUAUSAGE3963326899=6, LANGUAGE2681377624=7, ACCESSPOLICY2086207446=8, 
		REMOTEID3782084577=9, PERMISSIONS1133704324=10, MODIFIED3679453897=11, 
		ID3355=12, AUTHENTICATIONMODE1705415739=13, XAPIKEY1063285885=14, REMOTEADDRESS3662708942=15, 
		PACKAGE3487904838=16, VOID3625364=17, IDTYPE3101035253=18, DATAADDRESS1666068714=19, 
		IDENTIFICATIONDATA2818472792=20, CREATED1028554472=21, STAR=22, SECURITYMODE808027395=23, 
		COMMA=24, MINUS=25, VERSION351608024=26, POINT=27, ROLE2552982=28, NULL3392903=29, 
		OAUTHINFO441599973=30, ROLENAME4028187681=31, PUBLISHER1447404028=32, 
		SEMI=33, GRANTTYPE3075135094=34, EQUALS=35, ACCESSCONTROL798502745=36, 
		IMPORT3110171557=37, DESCRIPTION2570421244=38, SIDICODE220322280=39, SECRET3388690096=40, 
		TITLE110371416=41, ENDPOINT1741102485=42, TRUSTEDDIDREGISTRIES2736001987=43, 
		SCOPE109264468=44, LBRACK=45, RBRACK=46, USAGE82021761=47, DATASCHEMAADDRESS258677641=48, 
		CLIENTID908408390=49, IDPENDPOINT3356463978=50, EDCPUSHENDPOINTSCONFIG3366225346=51, 
		CONTRACTOFFER3767399530=52, IDENTITYPROVIDERCONFIG3279634705=53, SECURITYPOLICY3506346130=54, 
		EDCUSAGE2215711869=55, SUPPORTEDPROTOCOLS1268839373=56, BASEURL3962341598=57, 
		LINKEDASSETID675711922=58, CLOUDPUSH3868712687=59, LCURLY=60, ASSETMETADATA1606647359=61, 
		RCURLY=62, TRUE3569038=63, FALSE97196323=64, BOOLEAN64711720=65, BYTE3039496=66, 
		SHORT109413500=67, INT104431=68, LONG3327612=69, CHAR3052374=70, FLOAT97526364=71, 
		DOUBLE2969009105=72, String=73, Num_Int=74, Name=75, Num_Double=76, Char=77, 
		Num_Float=78, WS=79, Num_Long=80, ML_COMMENT=81, SL_COMMENT=82, Digits=83;
	public static final int
		RULE_nullLiteral = 0, RULE_booleanLiteral = 1, RULE_charLiteral = 2, RULE_stringLiteral = 3, 
		RULE_natLiteral = 4, RULE_signedNatLiteral = 5, RULE_basicLongLiteral = 6, 
		RULE_signedBasicLongLiteral = 7, RULE_basicFloatLiteral = 8, RULE_signedBasicFloatLiteral = 9, 
		RULE_basicDoubleLiteral = 10, RULE_signedBasicDoubleLiteral = 11, RULE_intLiteral = 12, 
		RULE_longLiteral = 13, RULE_floatLiteral = 14, RULE_doubleLiteral = 15, 
		RULE_mCQualifiedName = 16, RULE_mCPackageDeclaration = 17, RULE_mCImportStatement = 18, 
		RULE_mCPrimitiveType = 19, RULE_mCQualifiedType = 20, RULE_mCReturnType = 21, 
		RULE_mCVoidType = 22, RULE_dataSpaceConnectorConfiguration = 23, RULE_identificationData = 24, 
		RULE_assetMetaData = 25, RULE_baseUsage = 26, RULE_oPCUAUsage = 27, RULE_eDCUsage = 28, 
		RULE_eDCPushEndpointsConfig = 29, RULE_accessPolicy = 30, RULE_role = 31, 
		RULE_identityProviderConfig = 32, RULE_oAuthInfo = 33, RULE_literal = 34, 
		RULE_signedLiteral = 35, RULE_numericLiteral = 36, RULE_signedNumericLiteral = 37, 
		RULE_mCType = 38, RULE_mCObjectType = 39, RULE_configurationElements = 40, 
		RULE_usage = 41, RULE_nokeyword_f102 = 42, RULE_nokeyword_F70 = 43, RULE_nokeyword_l108 = 44, 
		RULE_nokeyword_L76 = 45;
	private static String[] makeRuleNames() {
		return new String[] {
			"nullLiteral", "booleanLiteral", "charLiteral", "stringLiteral", "natLiteral", 
			"signedNatLiteral", "basicLongLiteral", "signedBasicLongLiteral", "basicFloatLiteral", 
			"signedBasicFloatLiteral", "basicDoubleLiteral", "signedBasicDoubleLiteral", 
			"intLiteral", "longLiteral", "floatLiteral", "doubleLiteral", "mCQualifiedName", 
			"mCPackageDeclaration", "mCImportStatement", "mCPrimitiveType", "mCQualifiedType", 
			"mCReturnType", "mCVoidType", "dataSpaceConnectorConfiguration", "identificationData", 
			"assetMetaData", "baseUsage", "oPCUAUsage", "eDCUsage", "eDCPushEndpointsConfig", 
			"accessPolicy", "role", "identityProviderConfig", "oAuthInfo", "literal", 
			"signedLiteral", "numericLiteral", "signedNumericLiteral", "mCType", 
			"mCObjectType", "configurationElements", "usage", "nokeyword_f102", "nokeyword_F70", 
			"nokeyword_l108", "nokeyword_L76"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'qosMetrics'", "'usagePolicy'", "'stsServiceAddress'", "'callBackAddress'", 
			"'DataSpaceConnectorConfiguration'", "'OPCUAUsage'", "'language'", "'AccessPolicy'", 
			"'remoteID'", "'permissions'", "'modified'", "'id'", "'authenticationMode'", 
			"'xAPIKey'", "'remoteAddress'", "'package'", "'void'", "'idType'", "'dataAddress'", 
			"'IdentificationData'", "'created'", "'*'", "'securityMode'", "','", 
			"'-'", "'version'", "'.'", "'Role'", "'null'", "'OAuthInfo'", "'roleName'", 
			"'publisher'", "';'", "'grantType'", "'='", "'accessControl'", "'import'", 
			"'description'", "'sidiCode'", "'secret'", "'title'", "'endpoint'", "'trustedDIDRegistries'", 
			"'scope'", "'['", "']'", "'Usage'", "'dataSchemaAddress'", "'clientId'", 
			"'idpEndpoint'", "'EDCPushEndpointsConfig'", "'contractOffer'", "'IdentityProviderConfig'", 
			"'securityPolicy'", "'EDCUsage'", "'supportedProtocols'", "'baseUrl'", 
			"'linkedAssetID'", "'cloudPush'", "'{'", "'AssetMetaData'", "'}'", "'true'", 
			"'false'", "'boolean'", "'byte'", "'short'", "'int'", "'long'", "'char'", 
			"'float'", "'double'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "QOSMETRICS1685033198", "USAGEPOLICY817009203", "STSSERVICEADDRESS3595907665", 
			"CALLBACKADDRESS105567183", "DATASPACECONNECTORCONFIGURATION2963456037", 
			"OPCUAUSAGE3963326899", "LANGUAGE2681377624", "ACCESSPOLICY2086207446", 
			"REMOTEID3782084577", "PERMISSIONS1133704324", "MODIFIED3679453897", 
			"ID3355", "AUTHENTICATIONMODE1705415739", "XAPIKEY1063285885", "REMOTEADDRESS3662708942", 
			"PACKAGE3487904838", "VOID3625364", "IDTYPE3101035253", "DATAADDRESS1666068714", 
			"IDENTIFICATIONDATA2818472792", "CREATED1028554472", "STAR", "SECURITYMODE808027395", 
			"COMMA", "MINUS", "VERSION351608024", "POINT", "ROLE2552982", "NULL3392903", 
			"OAUTHINFO441599973", "ROLENAME4028187681", "PUBLISHER1447404028", "SEMI", 
			"GRANTTYPE3075135094", "EQUALS", "ACCESSCONTROL798502745", "IMPORT3110171557", 
			"DESCRIPTION2570421244", "SIDICODE220322280", "SECRET3388690096", "TITLE110371416", 
			"ENDPOINT1741102485", "TRUSTEDDIDREGISTRIES2736001987", "SCOPE109264468", 
			"LBRACK", "RBRACK", "USAGE82021761", "DATASCHEMAADDRESS258677641", "CLIENTID908408390", 
			"IDPENDPOINT3356463978", "EDCPUSHENDPOINTSCONFIG3366225346", "CONTRACTOFFER3767399530", 
			"IDENTITYPROVIDERCONFIG3279634705", "SECURITYPOLICY3506346130", "EDCUSAGE2215711869", 
			"SUPPORTEDPROTOCOLS1268839373", "BASEURL3962341598", "LINKEDASSETID675711922", 
			"CLOUDPUSH3868712687", "LCURLY", "ASSETMETADATA1606647359", "RCURLY", 
			"TRUE3569038", "FALSE97196323", "BOOLEAN64711720", "BYTE3039496", "SHORT109413500", 
			"INT104431", "LONG3327612", "CHAR3052374", "FLOAT97526364", "DOUBLE2969009105", 
			"String", "Num_Int", "Name", "Num_Double", "Char", "Num_Float", "WS", 
			"Num_Long", "ML_COMMENT", "SL_COMMENT", "Digits"
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
			setState(92);
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
			setState(98);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE3569038:
				{
				setState(94);
				match(TRUE3569038);

				_builder.setSource(de.monticore.literals.mccommonliterals._ast.ASTConstantsMCCommonLiterals.TRUE);

				}
				break;
			case FALSE97196323:
				{
				setState(96);
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
			setState(100);
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
			setState(103);
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
			setState(106);
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
			setState(117);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(109);
				if (!(noSpace(2))) throw new FailedPredicateException(this, "noSpace(2)");
				{
				{
				setState(110);
				match(MINUS);

				_builder.setNegative(true);

				}
				}
				{
				setState(113);
				((SignedNatLiteralContext)_localctx).tmp0 = match(Digits);
				_builder.setDigits(convertDigits(((SignedNatLiteralContext)_localctx).tmp0));
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(115);
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
			setState(119);
			if (!(cmpToken(2,"l","L") && noSpace(2))) throw new FailedPredicateException(this, "cmpToken(2,\"l\",\"L\") && noSpace(2)");
			{
			setState(120);
			((BasicLongLiteralContext)_localctx).tmp0 = match(Digits);
			_builder.setDigits(convertDigits(((BasicLongLiteralContext)_localctx).tmp0));
			}
			{
			setState(125);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(123);
				nokeyword_l108();
				}
				break;
			case 2:
				{
				setState(124);
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
			setState(146);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(127);
				if (!(cmpToken(3,"l","L") && noSpace(2,3))) throw new FailedPredicateException(this, "cmpToken(3,\"l\",\"L\") && noSpace(2,3)");
				{
				setState(128);
				match(MINUS);

				_builder.setNegative(true);

				}
				{
				setState(131);
				((SignedBasicLongLiteralContext)_localctx).tmp0 = match(Digits);
				_builder.setDigits(convertDigits(((SignedBasicLongLiteralContext)_localctx).tmp0));
				}
				{
				setState(136);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(134);
					nokeyword_l108();
					}
					break;
				case 2:
					{
					setState(135);
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
				setState(138);
				if (!(cmpToken(2,"l","L") && noSpace(2))) throw new FailedPredicateException(this, "cmpToken(2,\"l\",\"L\") && noSpace(2)");
				{
				setState(139);
				((SignedBasicLongLiteralContext)_localctx).tmp1 = match(Digits);
				_builder.setDigits(convertDigits(((SignedBasicLongLiteralContext)_localctx).tmp1));
				}
				{
				setState(144);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(142);
					nokeyword_l108();
					}
					break;
				case 2:
					{
					setState(143);
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
			setState(148);
			if (!(cmpToken(4,"f","F") && noSpace(2,3,4))) throw new FailedPredicateException(this, "cmpToken(4,\"f\",\"F\") && noSpace(2,3,4)");
			{
			setState(149);
			((BasicFloatLiteralContext)_localctx).tmp0 = match(Digits);
			_builder.setPre(convertDigits(((BasicFloatLiteralContext)_localctx).tmp0));
			}
			setState(152);
			match(POINT);
			{
			setState(153);
			((BasicFloatLiteralContext)_localctx).tmp1 = match(Digits);
			_builder.setPost(convertDigits(((BasicFloatLiteralContext)_localctx).tmp1));
			}
			{
			setState(158);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(156);
				nokeyword_f102();
				}
				break;
			case 2:
				{
				setState(157);
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
			setState(187);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(160);
				if (!(cmpToken(5,"f","F") && noSpace(2,3,4,5))) throw new FailedPredicateException(this, "cmpToken(5,\"f\",\"F\") && noSpace(2,3,4,5)");
				{
				setState(161);
				match(MINUS);

				_builder.setNegative(true);

				}
				{
				setState(164);
				((SignedBasicFloatLiteralContext)_localctx).tmp0 = match(Digits);
				_builder.setPre(convertDigits(((SignedBasicFloatLiteralContext)_localctx).tmp0));
				}
				setState(167);
				match(POINT);
				{
				setState(168);
				((SignedBasicFloatLiteralContext)_localctx).tmp1 = match(Digits);
				_builder.setPost(convertDigits(((SignedBasicFloatLiteralContext)_localctx).tmp1));
				}
				{
				setState(173);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(171);
					nokeyword_f102();
					}
					break;
				case 2:
					{
					setState(172);
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
				setState(175);
				if (!(cmpToken(4,"f","F") && noSpace(2,3,4))) throw new FailedPredicateException(this, "cmpToken(4,\"f\",\"F\") && noSpace(2,3,4)");
				{
				setState(176);
				((SignedBasicFloatLiteralContext)_localctx).tmp2 = match(Digits);
				_builder.setPre(convertDigits(((SignedBasicFloatLiteralContext)_localctx).tmp2));
				}
				setState(179);
				match(POINT);
				{
				setState(180);
				((SignedBasicFloatLiteralContext)_localctx).tmp3 = match(Digits);
				_builder.setPost(convertDigits(((SignedBasicFloatLiteralContext)_localctx).tmp3));
				}
				{
				setState(185);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(183);
					nokeyword_f102();
					}
					break;
				case 2:
					{
					setState(184);
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
			setState(189);
			if (!(noSpace(2,3))) throw new FailedPredicateException(this, "noSpace(2,3)");
			{
			setState(190);
			((BasicDoubleLiteralContext)_localctx).tmp0 = match(Digits);
			_builder.setPre(convertDigits(((BasicDoubleLiteralContext)_localctx).tmp0));
			}
			setState(193);
			match(POINT);
			{
			setState(194);
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
			setState(214);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(197);
				if (!(noSpace(2,3,4))) throw new FailedPredicateException(this, "noSpace(2,3,4)");
				{
				setState(198);
				match(MINUS);

				_builder.setNegative(true);

				}
				{
				setState(201);
				((SignedBasicDoubleLiteralContext)_localctx).tmp0 = match(Digits);
				_builder.setPre(convertDigits(((SignedBasicDoubleLiteralContext)_localctx).tmp0));
				}
				setState(204);
				match(POINT);
				{
				setState(205);
				((SignedBasicDoubleLiteralContext)_localctx).tmp1 = match(Digits);
				_builder.setPost(convertDigits(((SignedBasicDoubleLiteralContext)_localctx).tmp1));
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(207);
				if (!(noSpace(2,3))) throw new FailedPredicateException(this, "noSpace(2,3)");
				{
				setState(208);
				((SignedBasicDoubleLiteralContext)_localctx).tmp2 = match(Digits);
				_builder.setPre(convertDigits(((SignedBasicDoubleLiteralContext)_localctx).tmp2));
				}
				setState(211);
				match(POINT);
				{
				setState(212);
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
			setState(216);
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
			setState(219);
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
			setState(222);
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
			setState(225);
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
			setState(228);
			((MCQualifiedNameContext)_localctx).tmp0 = match(Name);
			 addToIteratedAttributeIfNotNull(_builder.getPartsList(), convertName(((MCQualifiedNameContext)_localctx).tmp0));
			}
			setState(236);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(231);
					match(POINT);
					{
					setState(232);
					((MCQualifiedNameContext)_localctx).tmp1 = match(Name);
					 addToIteratedAttributeIfNotNull(_builder.getPartsList(), convertName(((MCQualifiedNameContext)_localctx).tmp1));
					}
					}
					} 
				}
				setState(238);
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
			setState(239);
			match(PACKAGE3487904838);
			setState(240);
			((MCPackageDeclarationContext)_localctx).tmp0 = mCQualifiedName();
			_builder.setMCQualifiedName(_localctx.tmp0.ret);
			setState(242);
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
			setState(244);
			match(IMPORT3110171557);
			setState(245);
			((MCImportStatementContext)_localctx).tmp0 = mCQualifiedName();
			_builder.setMCQualifiedName(_localctx.tmp0.ret);
			setState(250);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==POINT) {
				{
				setState(247);
				match(POINT);
				{
				setState(248);
				match(STAR);

				_builder.setStar(true);

				}
				}
			}

			setState(252);
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
			setState(270);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN64711720:
				{
				setState(254);
				match(BOOLEAN64711720);

				_builder.setPrimitive(de.monticore.types.mcbasictypes._ast.ASTConstantsMCBasicTypes.BOOLEAN);

				}
				break;
			case BYTE3039496:
				{
				setState(256);
				match(BYTE3039496);

				_builder.setPrimitive(de.monticore.types.mcbasictypes._ast.ASTConstantsMCBasicTypes.BYTE);

				}
				break;
			case SHORT109413500:
				{
				setState(258);
				match(SHORT109413500);

				_builder.setPrimitive(de.monticore.types.mcbasictypes._ast.ASTConstantsMCBasicTypes.SHORT);

				}
				break;
			case INT104431:
				{
				setState(260);
				match(INT104431);

				_builder.setPrimitive(de.monticore.types.mcbasictypes._ast.ASTConstantsMCBasicTypes.INT);

				}
				break;
			case LONG3327612:
				{
				setState(262);
				match(LONG3327612);

				_builder.setPrimitive(de.monticore.types.mcbasictypes._ast.ASTConstantsMCBasicTypes.LONG);

				}
				break;
			case CHAR3052374:
				{
				setState(264);
				match(CHAR3052374);

				_builder.setPrimitive(de.monticore.types.mcbasictypes._ast.ASTConstantsMCBasicTypes.CHAR);

				}
				break;
			case FLOAT97526364:
				{
				setState(266);
				match(FLOAT97526364);

				_builder.setPrimitive(de.monticore.types.mcbasictypes._ast.ASTConstantsMCBasicTypes.FLOAT);

				}
				break;
			case DOUBLE2969009105:
				{
				setState(268);
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
			setState(272);
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
			setState(281);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VOID3625364:
				enterOuterAlt(_localctx, 1);
				{
				setState(275);
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
				setState(278);
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
			setState(283);
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
		public TerminalNode DATASPACECONNECTORCONFIGURATION2963456037() { return getToken(DSL4DataspacesAntlrParser.DATASPACECONNECTORCONFIGURATION2963456037, 0); }
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
			setState(285);
			match(DATASPACECONNECTORCONFIGURATION2963456037);
			{
			setState(286);
			((DataSpaceConnectorConfigurationContext)_localctx).tmp0 = match(Name);
			_builder.setName(convertName(((DataSpaceConnectorConfigurationContext)_localctx).tmp0));
			}
			setState(289);
			match(LCURLY);
			setState(293); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(290);
				((DataSpaceConnectorConfigurationContext)_localctx).tmp1 = configurationElements();
				addToIteratedAttributeIfNotNull(_builder.getConfigurationElementsList(), _localctx.tmp1.ret);
				}
				}
				setState(295); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 2351019744050544960L) != 0) );
			setState(297);
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
	public static class IdentificationDataContext extends ParserRuleContext {
		public dsl4dataspaces.dsl4dataspaces._ast.ASTIdentificationData ret = null;
		public StringLiteralContext tmp0;
		public StringLiteralContext tmp1;
		public StringLiteralContext tmp2;
		public StringLiteralContext tmp3;
		public TerminalNode IDENTIFICATIONDATA2818472792() { return getToken(DSL4DataspacesAntlrParser.IDENTIFICATIONDATA2818472792, 0); }
		public TerminalNode LCURLY() { return getToken(DSL4DataspacesAntlrParser.LCURLY, 0); }
		public TerminalNode LINKEDASSETID675711922() { return getToken(DSL4DataspacesAntlrParser.LINKEDASSETID675711922, 0); }
		public List<TerminalNode> EQUALS() { return getTokens(DSL4DataspacesAntlrParser.EQUALS); }
		public TerminalNode EQUALS(int i) {
			return getToken(DSL4DataspacesAntlrParser.EQUALS, i);
		}
		public List<TerminalNode> SEMI() { return getTokens(DSL4DataspacesAntlrParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(DSL4DataspacesAntlrParser.SEMI, i);
		}
		public TerminalNode BASEURL3962341598() { return getToken(DSL4DataspacesAntlrParser.BASEURL3962341598, 0); }
		public TerminalNode ENDPOINT1741102485() { return getToken(DSL4DataspacesAntlrParser.ENDPOINT1741102485, 0); }
		public TerminalNode IDTYPE3101035253() { return getToken(DSL4DataspacesAntlrParser.IDTYPE3101035253, 0); }
		public TerminalNode RCURLY() { return getToken(DSL4DataspacesAntlrParser.RCURLY, 0); }
		public List<StringLiteralContext> stringLiteral() {
			return getRuleContexts(StringLiteralContext.class);
		}
		public StringLiteralContext stringLiteral(int i) {
			return getRuleContext(StringLiteralContext.class,i);
		}
		public IdentificationDataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identificationData; }
	}

	public final IdentificationDataContext identificationData() throws RecognitionException {
		IdentificationDataContext _localctx = new IdentificationDataContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_identificationData);
		// getActionForAltBeforeRuleBody
		dsl4dataspaces.dsl4dataspaces._ast.ASTIdentificationDataBuilder _builder = dsl4dataspaces.dsl4dataspaces.DSL4DataspacesMill.identificationDataBuilder();
		_builder.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveBuilder(_builder);

		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			match(IDENTIFICATIONDATA2818472792);
			setState(300);
			match(LCURLY);
			setState(301);
			match(LINKEDASSETID675711922);
			setState(302);
			match(EQUALS);
			setState(303);
			((IdentificationDataContext)_localctx).tmp0 = stringLiteral();
			addToIteratedAttributeIfNotNull(_builder.getStringLiteralList(), _localctx.tmp0.ret);
			setState(305);
			match(SEMI);
			setState(306);
			match(BASEURL3962341598);
			setState(307);
			match(EQUALS);
			setState(308);
			((IdentificationDataContext)_localctx).tmp1 = stringLiteral();
			addToIteratedAttributeIfNotNull(_builder.getStringLiteralList(), _localctx.tmp1.ret);
			setState(310);
			match(SEMI);
			setState(311);
			match(ENDPOINT1741102485);
			setState(312);
			match(EQUALS);
			setState(313);
			((IdentificationDataContext)_localctx).tmp2 = stringLiteral();
			addToIteratedAttributeIfNotNull(_builder.getStringLiteralList(), _localctx.tmp2.ret);
			setState(315);
			match(SEMI);
			setState(316);
			match(IDTYPE3101035253);
			setState(317);
			match(EQUALS);
			setState(318);
			((IdentificationDataContext)_localctx).tmp3 = stringLiteral();
			addToIteratedAttributeIfNotNull(_builder.getStringLiteralList(), _localctx.tmp3.ret);
			setState(320);
			match(SEMI);
			setState(321);
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
		public StringLiteralContext tmp0;
		public StringLiteralContext tmp1;
		public StringLiteralContext tmp2;
		public StringLiteralContext tmp3;
		public StringLiteralContext tmp4;
		public StringLiteralContext tmp5;
		public StringLiteralContext tmp6;
		public StringLiteralContext tmp7;
		public StringLiteralContext tmp8;
		public TerminalNode ASSETMETADATA1606647359() { return getToken(DSL4DataspacesAntlrParser.ASSETMETADATA1606647359, 0); }
		public TerminalNode LCURLY() { return getToken(DSL4DataspacesAntlrParser.LCURLY, 0); }
		public TerminalNode TITLE110371416() { return getToken(DSL4DataspacesAntlrParser.TITLE110371416, 0); }
		public List<TerminalNode> EQUALS() { return getTokens(DSL4DataspacesAntlrParser.EQUALS); }
		public TerminalNode EQUALS(int i) {
			return getToken(DSL4DataspacesAntlrParser.EQUALS, i);
		}
		public List<TerminalNode> SEMI() { return getTokens(DSL4DataspacesAntlrParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(DSL4DataspacesAntlrParser.SEMI, i);
		}
		public TerminalNode DESCRIPTION2570421244() { return getToken(DSL4DataspacesAntlrParser.DESCRIPTION2570421244, 0); }
		public TerminalNode PUBLISHER1447404028() { return getToken(DSL4DataspacesAntlrParser.PUBLISHER1447404028, 0); }
		public TerminalNode SIDICODE220322280() { return getToken(DSL4DataspacesAntlrParser.SIDICODE220322280, 0); }
		public TerminalNode LBRACK() { return getToken(DSL4DataspacesAntlrParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(DSL4DataspacesAntlrParser.RBRACK, 0); }
		public TerminalNode VERSION351608024() { return getToken(DSL4DataspacesAntlrParser.VERSION351608024, 0); }
		public TerminalNode CREATED1028554472() { return getToken(DSL4DataspacesAntlrParser.CREATED1028554472, 0); }
		public TerminalNode MODIFIED3679453897() { return getToken(DSL4DataspacesAntlrParser.MODIFIED3679453897, 0); }
		public TerminalNode LANGUAGE2681377624() { return getToken(DSL4DataspacesAntlrParser.LANGUAGE2681377624, 0); }
		public TerminalNode RCURLY() { return getToken(DSL4DataspacesAntlrParser.RCURLY, 0); }
		public List<StringLiteralContext> stringLiteral() {
			return getRuleContexts(StringLiteralContext.class);
		}
		public StringLiteralContext stringLiteral(int i) {
			return getRuleContext(StringLiteralContext.class,i);
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
		enterRule(_localctx, 50, RULE_assetMetaData);
		// getActionForAltBeforeRuleBody
		dsl4dataspaces.dsl4dataspaces._ast.ASTAssetMetaDataBuilder _builder = dsl4dataspaces.dsl4dataspaces.DSL4DataspacesMill.assetMetaDataBuilder();
		_builder.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveBuilder(_builder);

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			match(ASSETMETADATA1606647359);
			setState(324);
			match(LCURLY);
			setState(325);
			match(TITLE110371416);
			setState(326);
			match(EQUALS);
			setState(327);
			((AssetMetaDataContext)_localctx).tmp0 = stringLiteral();
			addToIteratedAttributeIfNotNull(_builder.getStringLiteralList(), _localctx.tmp0.ret);
			setState(329);
			match(SEMI);
			setState(330);
			match(DESCRIPTION2570421244);
			setState(331);
			match(EQUALS);
			setState(332);
			((AssetMetaDataContext)_localctx).tmp1 = stringLiteral();
			addToIteratedAttributeIfNotNull(_builder.getStringLiteralList(), _localctx.tmp1.ret);
			setState(334);
			match(SEMI);
			setState(335);
			match(PUBLISHER1447404028);
			setState(336);
			match(EQUALS);
			setState(337);
			((AssetMetaDataContext)_localctx).tmp2 = stringLiteral();
			addToIteratedAttributeIfNotNull(_builder.getStringLiteralList(), _localctx.tmp2.ret);
			setState(339);
			match(SEMI);
			setState(340);
			match(SIDICODE220322280);
			setState(341);
			match(EQUALS);
			setState(342);
			match(LBRACK);
			setState(354);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==String) {
				{
				setState(343);
				((AssetMetaDataContext)_localctx).tmp3 = stringLiteral();
				addToIteratedAttributeIfNotNull(_builder.getStringLiteralList(), _localctx.tmp3.ret);
				setState(351);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(345);
					match(COMMA);
					setState(346);
					((AssetMetaDataContext)_localctx).tmp4 = stringLiteral();
					addToIteratedAttributeIfNotNull(_builder.getStringLiteralList(), _localctx.tmp4.ret);
					}
					}
					setState(353);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(356);
			match(RBRACK);
			setState(357);
			match(SEMI);
			setState(358);
			match(VERSION351608024);
			setState(359);
			match(EQUALS);
			setState(360);
			((AssetMetaDataContext)_localctx).tmp5 = stringLiteral();
			addToIteratedAttributeIfNotNull(_builder.getStringLiteralList(), _localctx.tmp5.ret);
			setState(362);
			match(SEMI);
			setState(363);
			match(CREATED1028554472);
			setState(364);
			match(EQUALS);
			setState(365);
			((AssetMetaDataContext)_localctx).tmp6 = stringLiteral();
			addToIteratedAttributeIfNotNull(_builder.getStringLiteralList(), _localctx.tmp6.ret);
			setState(367);
			match(SEMI);
			setState(368);
			match(MODIFIED3679453897);
			setState(369);
			match(EQUALS);
			setState(370);
			((AssetMetaDataContext)_localctx).tmp7 = stringLiteral();
			addToIteratedAttributeIfNotNull(_builder.getStringLiteralList(), _localctx.tmp7.ret);
			setState(372);
			match(SEMI);
			setState(373);
			match(LANGUAGE2681377624);
			setState(374);
			match(EQUALS);
			setState(375);
			((AssetMetaDataContext)_localctx).tmp8 = stringLiteral();
			addToIteratedAttributeIfNotNull(_builder.getStringLiteralList(), _localctx.tmp8.ret);
			setState(377);
			match(SEMI);
			setState(378);
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
		public StringLiteralContext tmp2;
		public StringLiteralContext tmp3;
		public TerminalNode USAGE82021761() { return getToken(DSL4DataspacesAntlrParser.USAGE82021761, 0); }
		public TerminalNode LCURLY() { return getToken(DSL4DataspacesAntlrParser.LCURLY, 0); }
		public TerminalNode BASEURL3962341598() { return getToken(DSL4DataspacesAntlrParser.BASEURL3962341598, 0); }
		public List<TerminalNode> EQUALS() { return getTokens(DSL4DataspacesAntlrParser.EQUALS); }
		public TerminalNode EQUALS(int i) {
			return getToken(DSL4DataspacesAntlrParser.EQUALS, i);
		}
		public List<TerminalNode> SEMI() { return getTokens(DSL4DataspacesAntlrParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(DSL4DataspacesAntlrParser.SEMI, i);
		}
		public TerminalNode ENDPOINT1741102485() { return getToken(DSL4DataspacesAntlrParser.ENDPOINT1741102485, 0); }
		public TerminalNode DATAADDRESS1666068714() { return getToken(DSL4DataspacesAntlrParser.DATAADDRESS1666068714, 0); }
		public TerminalNode DATASCHEMAADDRESS258677641() { return getToken(DSL4DataspacesAntlrParser.DATASCHEMAADDRESS258677641, 0); }
		public TerminalNode RCURLY() { return getToken(DSL4DataspacesAntlrParser.RCURLY, 0); }
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
		enterRule(_localctx, 52, RULE_baseUsage);
		// getActionForAltBeforeRuleBody
		dsl4dataspaces.dsl4dataspaces._ast.ASTBaseUsageBuilder _builder = dsl4dataspaces.dsl4dataspaces.DSL4DataspacesMill.baseUsageBuilder();
		_builder.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveBuilder(_builder);

		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(380);
			match(USAGE82021761);
			setState(381);
			match(LCURLY);
			setState(382);
			match(BASEURL3962341598);
			setState(383);
			match(EQUALS);
			setState(384);
			((BaseUsageContext)_localctx).tmp0 = stringLiteral();
			addToIteratedAttributeIfNotNull(_builder.getStringLiteralList(), _localctx.tmp0.ret);
			setState(386);
			match(SEMI);
			setState(387);
			match(ENDPOINT1741102485);
			setState(388);
			match(EQUALS);
			setState(389);
			((BaseUsageContext)_localctx).tmp1 = stringLiteral();
			addToIteratedAttributeIfNotNull(_builder.getStringLiteralList(), _localctx.tmp1.ret);
			setState(391);
			match(SEMI);
			setState(392);
			match(DATAADDRESS1666068714);
			setState(393);
			match(EQUALS);
			setState(394);
			((BaseUsageContext)_localctx).tmp2 = stringLiteral();
			addToIteratedAttributeIfNotNull(_builder.getStringLiteralList(), _localctx.tmp2.ret);
			setState(396);
			match(SEMI);
			setState(397);
			match(DATASCHEMAADDRESS258677641);
			setState(398);
			match(EQUALS);
			setState(399);
			((BaseUsageContext)_localctx).tmp3 = stringLiteral();
			addToIteratedAttributeIfNotNull(_builder.getStringLiteralList(), _localctx.tmp3.ret);
			setState(401);
			match(SEMI);
			setState(402);
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
	public static class OPCUAUsageContext extends ParserRuleContext {
		public dsl4dataspaces.dsl4dataspaces._ast.ASTOPCUAUsage ret = null;
		public StringLiteralContext tmp0;
		public StringLiteralContext tmp1;
		public StringLiteralContext tmp2;
		public StringLiteralContext tmp3;
		public StringLiteralContext tmp4;
		public StringLiteralContext tmp5;
		public StringLiteralContext tmp6;
		public TerminalNode OPCUAUSAGE3963326899() { return getToken(DSL4DataspacesAntlrParser.OPCUAUSAGE3963326899, 0); }
		public TerminalNode LCURLY() { return getToken(DSL4DataspacesAntlrParser.LCURLY, 0); }
		public TerminalNode SUPPORTEDPROTOCOLS1268839373() { return getToken(DSL4DataspacesAntlrParser.SUPPORTEDPROTOCOLS1268839373, 0); }
		public List<TerminalNode> EQUALS() { return getTokens(DSL4DataspacesAntlrParser.EQUALS); }
		public TerminalNode EQUALS(int i) {
			return getToken(DSL4DataspacesAntlrParser.EQUALS, i);
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
		public TerminalNode SECURITYPOLICY3506346130() { return getToken(DSL4DataspacesAntlrParser.SECURITYPOLICY3506346130, 0); }
		public TerminalNode SECURITYMODE808027395() { return getToken(DSL4DataspacesAntlrParser.SECURITYMODE808027395, 0); }
		public TerminalNode AUTHENTICATIONMODE1705415739() { return getToken(DSL4DataspacesAntlrParser.AUTHENTICATIONMODE1705415739, 0); }
		public TerminalNode RCURLY() { return getToken(DSL4DataspacesAntlrParser.RCURLY, 0); }
		public List<StringLiteralContext> stringLiteral() {
			return getRuleContexts(StringLiteralContext.class);
		}
		public StringLiteralContext stringLiteral(int i) {
			return getRuleContext(StringLiteralContext.class,i);
		}
		public TerminalNode QOSMETRICS1685033198() { return getToken(DSL4DataspacesAntlrParser.QOSMETRICS1685033198, 0); }
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
		enterRule(_localctx, 54, RULE_oPCUAUsage);
		// getActionForAltBeforeRuleBody
		dsl4dataspaces.dsl4dataspaces._ast.ASTOPCUAUsageBuilder _builder = dsl4dataspaces.dsl4dataspaces.DSL4DataspacesMill.oPCUAUsageBuilder();
		_builder.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveBuilder(_builder);

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(404);
			match(OPCUAUSAGE3963326899);
			setState(405);
			match(LCURLY);
			setState(406);
			match(SUPPORTEDPROTOCOLS1268839373);
			setState(407);
			match(EQUALS);
			setState(408);
			match(LBRACK);
			setState(420);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==String) {
				{
				setState(409);
				((OPCUAUsageContext)_localctx).tmp0 = stringLiteral();
				addToIteratedAttributeIfNotNull(_builder.getStringLiteralList(), _localctx.tmp0.ret);
				setState(417);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(411);
					match(COMMA);
					setState(412);
					((OPCUAUsageContext)_localctx).tmp1 = stringLiteral();
					addToIteratedAttributeIfNotNull(_builder.getStringLiteralList(), _localctx.tmp1.ret);
					}
					}
					setState(419);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(422);
			match(RBRACK);
			setState(423);
			match(SEMI);
			setState(442);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==QOSMETRICS1685033198) {
				{
				setState(424);
				match(QOSMETRICS1685033198);
				setState(425);
				match(EQUALS);
				setState(426);
				match(LBRACK);
				setState(438);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==String) {
					{
					setState(427);
					((OPCUAUsageContext)_localctx).tmp2 = stringLiteral();
					addToIteratedAttributeIfNotNull(_builder.getStringLiteralList(), _localctx.tmp2.ret);
					setState(435);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(429);
						match(COMMA);
						setState(430);
						((OPCUAUsageContext)_localctx).tmp3 = stringLiteral();
						addToIteratedAttributeIfNotNull(_builder.getStringLiteralList(), _localctx.tmp3.ret);
						}
						}
						setState(437);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(440);
				match(RBRACK);
				setState(441);
				match(SEMI);
				}
			}

			setState(444);
			match(SECURITYPOLICY3506346130);
			setState(445);
			match(EQUALS);
			setState(446);
			((OPCUAUsageContext)_localctx).tmp4 = stringLiteral();
			addToIteratedAttributeIfNotNull(_builder.getStringLiteralList(), _localctx.tmp4.ret);
			setState(448);
			match(SEMI);
			setState(449);
			match(SECURITYMODE808027395);
			setState(450);
			match(EQUALS);
			setState(451);
			((OPCUAUsageContext)_localctx).tmp5 = stringLiteral();
			addToIteratedAttributeIfNotNull(_builder.getStringLiteralList(), _localctx.tmp5.ret);
			setState(453);
			match(SEMI);
			setState(454);
			match(AUTHENTICATIONMODE1705415739);
			setState(455);
			match(EQUALS);
			setState(456);
			((OPCUAUsageContext)_localctx).tmp6 = stringLiteral();
			addToIteratedAttributeIfNotNull(_builder.getStringLiteralList(), _localctx.tmp6.ret);
			setState(458);
			match(SEMI);
			setState(459);
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
		public StringLiteralContext tmp0;
		public StringLiteralContext tmp1;
		public StringLiteralContext tmp2;
		public StringLiteralContext tmp3;
		public StringLiteralContext tmp4;
		public StringLiteralContext tmp5;
		public EDCPushEndpointsConfigContext tmp6;
		public TerminalNode EDCUSAGE2215711869() { return getToken(DSL4DataspacesAntlrParser.EDCUSAGE2215711869, 0); }
		public TerminalNode LCURLY() { return getToken(DSL4DataspacesAntlrParser.LCURLY, 0); }
		public TerminalNode REMOTEADDRESS3662708942() { return getToken(DSL4DataspacesAntlrParser.REMOTEADDRESS3662708942, 0); }
		public List<TerminalNode> EQUALS() { return getTokens(DSL4DataspacesAntlrParser.EQUALS); }
		public TerminalNode EQUALS(int i) {
			return getToken(DSL4DataspacesAntlrParser.EQUALS, i);
		}
		public List<TerminalNode> SEMI() { return getTokens(DSL4DataspacesAntlrParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(DSL4DataspacesAntlrParser.SEMI, i);
		}
		public TerminalNode REMOTEID3782084577() { return getToken(DSL4DataspacesAntlrParser.REMOTEID3782084577, 0); }
		public TerminalNode XAPIKEY1063285885() { return getToken(DSL4DataspacesAntlrParser.XAPIKEY1063285885, 0); }
		public TerminalNode STSSERVICEADDRESS3595907665() { return getToken(DSL4DataspacesAntlrParser.STSSERVICEADDRESS3595907665, 0); }
		public TerminalNode TRUSTEDDIDREGISTRIES2736001987() { return getToken(DSL4DataspacesAntlrParser.TRUSTEDDIDREGISTRIES2736001987, 0); }
		public TerminalNode LBRACK() { return getToken(DSL4DataspacesAntlrParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(DSL4DataspacesAntlrParser.RBRACK, 0); }
		public TerminalNode RCURLY() { return getToken(DSL4DataspacesAntlrParser.RCURLY, 0); }
		public List<StringLiteralContext> stringLiteral() {
			return getRuleContexts(StringLiteralContext.class);
		}
		public StringLiteralContext stringLiteral(int i) {
			return getRuleContext(StringLiteralContext.class,i);
		}
		public EDCPushEndpointsConfigContext eDCPushEndpointsConfig() {
			return getRuleContext(EDCPushEndpointsConfigContext.class,0);
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
		enterRule(_localctx, 56, RULE_eDCUsage);
		// getActionForAltBeforeRuleBody
		dsl4dataspaces.dsl4dataspaces._ast.ASTEDCUsageBuilder _builder = dsl4dataspaces.dsl4dataspaces.DSL4DataspacesMill.eDCUsageBuilder();
		_builder.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveBuilder(_builder);

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(461);
			match(EDCUSAGE2215711869);
			setState(462);
			match(LCURLY);
			setState(463);
			match(REMOTEADDRESS3662708942);
			setState(464);
			match(EQUALS);
			setState(465);
			((EDCUsageContext)_localctx).tmp0 = stringLiteral();
			addToIteratedAttributeIfNotNull(_builder.getStringLiteralList(), _localctx.tmp0.ret);
			setState(467);
			match(SEMI);
			setState(468);
			match(REMOTEID3782084577);
			setState(469);
			match(EQUALS);
			setState(470);
			((EDCUsageContext)_localctx).tmp1 = stringLiteral();
			addToIteratedAttributeIfNotNull(_builder.getStringLiteralList(), _localctx.tmp1.ret);
			setState(472);
			match(SEMI);
			setState(473);
			match(XAPIKEY1063285885);
			setState(474);
			match(EQUALS);
			setState(475);
			((EDCUsageContext)_localctx).tmp2 = stringLiteral();
			addToIteratedAttributeIfNotNull(_builder.getStringLiteralList(), _localctx.tmp2.ret);
			setState(477);
			match(SEMI);
			setState(478);
			match(STSSERVICEADDRESS3595907665);
			setState(479);
			match(EQUALS);
			setState(480);
			((EDCUsageContext)_localctx).tmp3 = stringLiteral();
			addToIteratedAttributeIfNotNull(_builder.getStringLiteralList(), _localctx.tmp3.ret);
			setState(482);
			match(SEMI);
			setState(483);
			match(TRUSTEDDIDREGISTRIES2736001987);
			setState(484);
			match(EQUALS);
			setState(485);
			match(LBRACK);
			setState(497);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==String) {
				{
				setState(486);
				((EDCUsageContext)_localctx).tmp4 = stringLiteral();
				addToIteratedAttributeIfNotNull(_builder.getStringLiteralList(), _localctx.tmp4.ret);
				setState(494);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(488);
					match(COMMA);
					setState(489);
					((EDCUsageContext)_localctx).tmp5 = stringLiteral();
					addToIteratedAttributeIfNotNull(_builder.getStringLiteralList(), _localctx.tmp5.ret);
					}
					}
					setState(496);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(499);
			match(RBRACK);
			setState(500);
			match(SEMI);
			setState(501);
			((EDCUsageContext)_localctx).tmp6 = eDCPushEndpointsConfig();
			_builder.setEDCPushEndpointsConfig(_localctx.tmp6.ret);
			setState(503);
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
		public StringLiteralContext tmp0;
		public StringLiteralContext tmp1;
		public StringLiteralContext tmp2;
		public StringLiteralContext tmp3;
		public StringLiteralContext tmp4;
		public TerminalNode EDCPUSHENDPOINTSCONFIG3366225346() { return getToken(DSL4DataspacesAntlrParser.EDCPUSHENDPOINTSCONFIG3366225346, 0); }
		public List<TerminalNode> LCURLY() { return getTokens(DSL4DataspacesAntlrParser.LCURLY); }
		public TerminalNode LCURLY(int i) {
			return getToken(DSL4DataspacesAntlrParser.LCURLY, i);
		}
		public TerminalNode CLOUDPUSH3868712687() { return getToken(DSL4DataspacesAntlrParser.CLOUDPUSH3868712687, 0); }
		public List<TerminalNode> EQUALS() { return getTokens(DSL4DataspacesAntlrParser.EQUALS); }
		public TerminalNode EQUALS(int i) {
			return getToken(DSL4DataspacesAntlrParser.EQUALS, i);
		}
		public List<TerminalNode> RCURLY() { return getTokens(DSL4DataspacesAntlrParser.RCURLY); }
		public TerminalNode RCURLY(int i) {
			return getToken(DSL4DataspacesAntlrParser.RCURLY, i);
		}
		public List<TerminalNode> SEMI() { return getTokens(DSL4DataspacesAntlrParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(DSL4DataspacesAntlrParser.SEMI, i);
		}
		public TerminalNode CALLBACKADDRESS105567183() { return getToken(DSL4DataspacesAntlrParser.CALLBACKADDRESS105567183, 0); }
		public List<StringLiteralContext> stringLiteral() {
			return getRuleContexts(StringLiteralContext.class);
		}
		public StringLiteralContext stringLiteral(int i) {
			return getRuleContext(StringLiteralContext.class,i);
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
		enterRule(_localctx, 58, RULE_eDCPushEndpointsConfig);
		// getActionForAltBeforeRuleBody
		dsl4dataspaces.dsl4dataspaces._ast.ASTEDCPushEndpointsConfigBuilder _builder = dsl4dataspaces.dsl4dataspaces.DSL4DataspacesMill.eDCPushEndpointsConfigBuilder();
		_builder.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveBuilder(_builder);

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(505);
			match(EDCPUSHENDPOINTSCONFIG3366225346);
			setState(506);
			match(LCURLY);
			setState(507);
			match(CLOUDPUSH3868712687);
			setState(508);
			match(EQUALS);
			setState(509);
			match(LCURLY);
			setState(527);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==String) {
				{
				setState(510);
				((EDCPushEndpointsConfigContext)_localctx).tmp0 = stringLiteral();
				addToIteratedAttributeIfNotNull(_builder.getStringLiteralList(), _localctx.tmp0.ret);
				setState(512);
				match(EQUALS);
				setState(513);
				((EDCPushEndpointsConfigContext)_localctx).tmp1 = stringLiteral();
				addToIteratedAttributeIfNotNull(_builder.getStringLiteralList(), _localctx.tmp1.ret);
				setState(524);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(515);
					match(COMMA);
					setState(516);
					((EDCPushEndpointsConfigContext)_localctx).tmp2 = stringLiteral();
					addToIteratedAttributeIfNotNull(_builder.getStringLiteralList(), _localctx.tmp2.ret);
					setState(518);
					match(EQUALS);
					setState(519);
					((EDCPushEndpointsConfigContext)_localctx).tmp3 = stringLiteral();
					addToIteratedAttributeIfNotNull(_builder.getStringLiteralList(), _localctx.tmp3.ret);
					}
					}
					setState(526);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(529);
			match(RCURLY);
			setState(530);
			match(SEMI);
			setState(531);
			match(CALLBACKADDRESS105567183);
			setState(532);
			match(EQUALS);
			setState(533);
			((EDCPushEndpointsConfigContext)_localctx).tmp4 = stringLiteral();
			addToIteratedAttributeIfNotNull(_builder.getStringLiteralList(), _localctx.tmp4.ret);
			setState(535);
			match(SEMI);
			setState(536);
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
		public StringLiteralContext tmp1;
		public StringLiteralContext tmp2;
		public StringLiteralContext tmp3;
		public StringLiteralContext tmp4;
		public RoleContext tmp5;
		public RoleContext tmp6;
		public TerminalNode ACCESSPOLICY2086207446() { return getToken(DSL4DataspacesAntlrParser.ACCESSPOLICY2086207446, 0); }
		public List<TerminalNode> LCURLY() { return getTokens(DSL4DataspacesAntlrParser.LCURLY); }
		public TerminalNode LCURLY(int i) {
			return getToken(DSL4DataspacesAntlrParser.LCURLY, i);
		}
		public TerminalNode USAGEPOLICY817009203() { return getToken(DSL4DataspacesAntlrParser.USAGEPOLICY817009203, 0); }
		public List<TerminalNode> EQUALS() { return getTokens(DSL4DataspacesAntlrParser.EQUALS); }
		public TerminalNode EQUALS(int i) {
			return getToken(DSL4DataspacesAntlrParser.EQUALS, i);
		}
		public List<TerminalNode> SEMI() { return getTokens(DSL4DataspacesAntlrParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(DSL4DataspacesAntlrParser.SEMI, i);
		}
		public TerminalNode CONTRACTOFFER3767399530() { return getToken(DSL4DataspacesAntlrParser.CONTRACTOFFER3767399530, 0); }
		public List<TerminalNode> RCURLY() { return getTokens(DSL4DataspacesAntlrParser.RCURLY); }
		public TerminalNode RCURLY(int i) {
			return getToken(DSL4DataspacesAntlrParser.RCURLY, i);
		}
		public TerminalNode ACCESSCONTROL798502745() { return getToken(DSL4DataspacesAntlrParser.ACCESSCONTROL798502745, 0); }
		public TerminalNode LBRACK() { return getToken(DSL4DataspacesAntlrParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(DSL4DataspacesAntlrParser.RBRACK, 0); }
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
		public List<TerminalNode> COMMA() { return getTokens(DSL4DataspacesAntlrParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DSL4DataspacesAntlrParser.COMMA, i);
		}
		public AccessPolicyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accessPolicy; }
	}

	public final AccessPolicyContext accessPolicy() throws RecognitionException {
		AccessPolicyContext _localctx = new AccessPolicyContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_accessPolicy);
		// getActionForAltBeforeRuleBody
		dsl4dataspaces.dsl4dataspaces._ast.ASTAccessPolicyBuilder _builder = dsl4dataspaces.dsl4dataspaces.DSL4DataspacesMill.accessPolicyBuilder();
		_builder.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveBuilder(_builder);

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(538);
			match(ACCESSPOLICY2086207446);
			setState(539);
			match(LCURLY);
			setState(540);
			match(USAGEPOLICY817009203);
			setState(541);
			match(EQUALS);
			setState(542);
			((AccessPolicyContext)_localctx).tmp0 = stringLiteral();
			addToIteratedAttributeIfNotNull(_builder.getStringLiteralList(), _localctx.tmp0.ret);
			setState(544);
			match(SEMI);
			setState(545);
			match(CONTRACTOFFER3767399530);
			setState(546);
			match(EQUALS);
			setState(547);
			match(LCURLY);
			setState(565);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==String) {
				{
				setState(548);
				((AccessPolicyContext)_localctx).tmp1 = stringLiteral();
				addToIteratedAttributeIfNotNull(_builder.getStringLiteralList(), _localctx.tmp1.ret);
				setState(550);
				match(EQUALS);
				setState(551);
				((AccessPolicyContext)_localctx).tmp2 = stringLiteral();
				addToIteratedAttributeIfNotNull(_builder.getStringLiteralList(), _localctx.tmp2.ret);
				setState(562);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(553);
					match(COMMA);
					setState(554);
					((AccessPolicyContext)_localctx).tmp3 = stringLiteral();
					addToIteratedAttributeIfNotNull(_builder.getStringLiteralList(), _localctx.tmp3.ret);
					setState(556);
					match(EQUALS);
					setState(557);
					((AccessPolicyContext)_localctx).tmp4 = stringLiteral();
					addToIteratedAttributeIfNotNull(_builder.getStringLiteralList(), _localctx.tmp4.ret);
					}
					}
					setState(564);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(567);
			match(RCURLY);
			setState(568);
			match(SEMI);
			setState(569);
			match(ACCESSCONTROL798502745);
			setState(570);
			match(EQUALS);
			setState(571);
			match(LBRACK);
			setState(572);
			((AccessPolicyContext)_localctx).tmp5 = role();
			addToIteratedAttributeIfNotNull(_builder.getRoleList(), _localctx.tmp5.ret);
			setState(580);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(574);
				match(COMMA);
				setState(575);
				((AccessPolicyContext)_localctx).tmp6 = role();
				addToIteratedAttributeIfNotNull(_builder.getRoleList(), _localctx.tmp6.ret);
				}
				}
				setState(582);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(583);
			match(RBRACK);
			setState(584);
			match(SEMI);
			setState(585);
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
		public StringLiteralContext tmp0;
		public StringLiteralContext tmp1;
		public StringLiteralContext tmp2;
		public TerminalNode ROLE2552982() { return getToken(DSL4DataspacesAntlrParser.ROLE2552982, 0); }
		public TerminalNode LCURLY() { return getToken(DSL4DataspacesAntlrParser.LCURLY, 0); }
		public TerminalNode ROLENAME4028187681() { return getToken(DSL4DataspacesAntlrParser.ROLENAME4028187681, 0); }
		public List<TerminalNode> EQUALS() { return getTokens(DSL4DataspacesAntlrParser.EQUALS); }
		public TerminalNode EQUALS(int i) {
			return getToken(DSL4DataspacesAntlrParser.EQUALS, i);
		}
		public List<TerminalNode> SEMI() { return getTokens(DSL4DataspacesAntlrParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(DSL4DataspacesAntlrParser.SEMI, i);
		}
		public TerminalNode PERMISSIONS1133704324() { return getToken(DSL4DataspacesAntlrParser.PERMISSIONS1133704324, 0); }
		public TerminalNode LBRACK() { return getToken(DSL4DataspacesAntlrParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(DSL4DataspacesAntlrParser.RBRACK, 0); }
		public TerminalNode RCURLY() { return getToken(DSL4DataspacesAntlrParser.RCURLY, 0); }
		public List<StringLiteralContext> stringLiteral() {
			return getRuleContexts(StringLiteralContext.class);
		}
		public StringLiteralContext stringLiteral(int i) {
			return getRuleContext(StringLiteralContext.class,i);
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
		enterRule(_localctx, 62, RULE_role);
		// getActionForAltBeforeRuleBody
		dsl4dataspaces.dsl4dataspaces._ast.ASTRoleBuilder _builder = dsl4dataspaces.dsl4dataspaces.DSL4DataspacesMill.roleBuilder();
		_builder.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveBuilder(_builder);

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(587);
			match(ROLE2552982);
			setState(588);
			match(LCURLY);
			setState(589);
			match(ROLENAME4028187681);
			setState(590);
			match(EQUALS);
			setState(591);
			((RoleContext)_localctx).tmp0 = stringLiteral();
			addToIteratedAttributeIfNotNull(_builder.getStringLiteralList(), _localctx.tmp0.ret);
			setState(593);
			match(SEMI);
			setState(594);
			match(PERMISSIONS1133704324);
			setState(595);
			match(EQUALS);
			setState(596);
			match(LBRACK);
			setState(608);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==String) {
				{
				setState(597);
				((RoleContext)_localctx).tmp1 = stringLiteral();
				addToIteratedAttributeIfNotNull(_builder.getStringLiteralList(), _localctx.tmp1.ret);
				setState(605);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(599);
					match(COMMA);
					setState(600);
					((RoleContext)_localctx).tmp2 = stringLiteral();
					addToIteratedAttributeIfNotNull(_builder.getStringLiteralList(), _localctx.tmp2.ret);
					}
					}
					setState(607);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(610);
			match(RBRACK);
			setState(611);
			match(SEMI);
			setState(612);
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
		public StringLiteralContext tmp1;
		public StringLiteralContext tmp2;
		public StringLiteralContext tmp3;
		public TerminalNode IDENTITYPROVIDERCONFIG3279634705() { return getToken(DSL4DataspacesAntlrParser.IDENTITYPROVIDERCONFIG3279634705, 0); }
		public TerminalNode LCURLY() { return getToken(DSL4DataspacesAntlrParser.LCURLY, 0); }
		public TerminalNode IDPENDPOINT3356463978() { return getToken(DSL4DataspacesAntlrParser.IDPENDPOINT3356463978, 0); }
		public List<TerminalNode> EQUALS() { return getTokens(DSL4DataspacesAntlrParser.EQUALS); }
		public TerminalNode EQUALS(int i) {
			return getToken(DSL4DataspacesAntlrParser.EQUALS, i);
		}
		public List<TerminalNode> SEMI() { return getTokens(DSL4DataspacesAntlrParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(DSL4DataspacesAntlrParser.SEMI, i);
		}
		public TerminalNode CLIENTID908408390() { return getToken(DSL4DataspacesAntlrParser.CLIENTID908408390, 0); }
		public TerminalNode SECRET3388690096() { return getToken(DSL4DataspacesAntlrParser.SECRET3388690096, 0); }
		public TerminalNode GRANTTYPE3075135094() { return getToken(DSL4DataspacesAntlrParser.GRANTTYPE3075135094, 0); }
		public TerminalNode RCURLY() { return getToken(DSL4DataspacesAntlrParser.RCURLY, 0); }
		public List<StringLiteralContext> stringLiteral() {
			return getRuleContexts(StringLiteralContext.class);
		}
		public StringLiteralContext stringLiteral(int i) {
			return getRuleContext(StringLiteralContext.class,i);
		}
		public IdentityProviderConfigContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identityProviderConfig; }
	}

	public final IdentityProviderConfigContext identityProviderConfig() throws RecognitionException {
		IdentityProviderConfigContext _localctx = new IdentityProviderConfigContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_identityProviderConfig);
		// getActionForAltBeforeRuleBody
		dsl4dataspaces.dsl4dataspaces._ast.ASTIdentityProviderConfigBuilder _builder = dsl4dataspaces.dsl4dataspaces.DSL4DataspacesMill.identityProviderConfigBuilder();
		_builder.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveBuilder(_builder);

		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(614);
			match(IDENTITYPROVIDERCONFIG3279634705);
			setState(615);
			match(LCURLY);
			setState(616);
			match(IDPENDPOINT3356463978);
			setState(617);
			match(EQUALS);
			setState(618);
			((IdentityProviderConfigContext)_localctx).tmp0 = stringLiteral();
			addToIteratedAttributeIfNotNull(_builder.getStringLiteralList(), _localctx.tmp0.ret);
			setState(620);
			match(SEMI);
			setState(621);
			match(CLIENTID908408390);
			setState(622);
			match(EQUALS);
			setState(623);
			((IdentityProviderConfigContext)_localctx).tmp1 = stringLiteral();
			addToIteratedAttributeIfNotNull(_builder.getStringLiteralList(), _localctx.tmp1.ret);
			setState(625);
			match(SEMI);
			setState(626);
			match(SECRET3388690096);
			setState(627);
			match(EQUALS);
			setState(628);
			((IdentityProviderConfigContext)_localctx).tmp2 = stringLiteral();
			addToIteratedAttributeIfNotNull(_builder.getStringLiteralList(), _localctx.tmp2.ret);
			setState(630);
			match(SEMI);
			setState(631);
			match(GRANTTYPE3075135094);
			setState(632);
			match(EQUALS);
			setState(633);
			((IdentityProviderConfigContext)_localctx).tmp3 = stringLiteral();
			addToIteratedAttributeIfNotNull(_builder.getStringLiteralList(), _localctx.tmp3.ret);
			setState(635);
			match(SEMI);
			setState(636);
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
		public TerminalNode OAUTHINFO441599973() { return getToken(DSL4DataspacesAntlrParser.OAUTHINFO441599973, 0); }
		public TerminalNode LCURLY() { return getToken(DSL4DataspacesAntlrParser.LCURLY, 0); }
		public TerminalNode ID3355() { return getToken(DSL4DataspacesAntlrParser.ID3355, 0); }
		public List<TerminalNode> EQUALS() { return getTokens(DSL4DataspacesAntlrParser.EQUALS); }
		public TerminalNode EQUALS(int i) {
			return getToken(DSL4DataspacesAntlrParser.EQUALS, i);
		}
		public List<TerminalNode> SEMI() { return getTokens(DSL4DataspacesAntlrParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(DSL4DataspacesAntlrParser.SEMI, i);
		}
		public TerminalNode SECRET3388690096() { return getToken(DSL4DataspacesAntlrParser.SECRET3388690096, 0); }
		public TerminalNode GRANTTYPE3075135094() { return getToken(DSL4DataspacesAntlrParser.GRANTTYPE3075135094, 0); }
		public TerminalNode SCOPE109264468() { return getToken(DSL4DataspacesAntlrParser.SCOPE109264468, 0); }
		public TerminalNode RCURLY() { return getToken(DSL4DataspacesAntlrParser.RCURLY, 0); }
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
		enterRule(_localctx, 66, RULE_oAuthInfo);
		// getActionForAltBeforeRuleBody
		dsl4dataspaces.dsl4dataspaces._ast.ASTOAuthInfoBuilder _builder = dsl4dataspaces.dsl4dataspaces.DSL4DataspacesMill.oAuthInfoBuilder();
		_builder.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveBuilder(_builder);

		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(638);
			match(OAUTHINFO441599973);
			setState(639);
			match(LCURLY);
			setState(640);
			match(ID3355);
			setState(641);
			match(EQUALS);
			setState(642);
			((OAuthInfoContext)_localctx).tmp0 = stringLiteral();
			addToIteratedAttributeIfNotNull(_builder.getStringLiteralList(), _localctx.tmp0.ret);
			setState(644);
			match(SEMI);
			setState(645);
			match(SECRET3388690096);
			setState(646);
			match(EQUALS);
			setState(647);
			((OAuthInfoContext)_localctx).tmp1 = stringLiteral();
			addToIteratedAttributeIfNotNull(_builder.getStringLiteralList(), _localctx.tmp1.ret);
			setState(649);
			match(SEMI);
			setState(650);
			match(GRANTTYPE3075135094);
			setState(651);
			match(EQUALS);
			setState(652);
			((OAuthInfoContext)_localctx).tmp2 = stringLiteral();
			addToIteratedAttributeIfNotNull(_builder.getStringLiteralList(), _localctx.tmp2.ret);
			setState(654);
			match(SEMI);
			setState(655);
			match(SCOPE109264468);
			setState(656);
			match(EQUALS);
			setState(657);
			((OAuthInfoContext)_localctx).tmp3 = stringLiteral();
			addToIteratedAttributeIfNotNull(_builder.getStringLiteralList(), _localctx.tmp3.ret);
			setState(659);
			match(SEMI);
			setState(660);
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
		enterRule(_localctx, 68, RULE_literal);
		try {
			setState(677);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(662);
				((LiteralContext)_localctx).tmp4 = numericLiteral();
				((LiteralContext)_localctx).ret = ((LiteralContext)_localctx).tmp4.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(665);
				((LiteralContext)_localctx).tmp5 = nullLiteral();
				((LiteralContext)_localctx).ret = ((LiteralContext)_localctx).tmp5.ret;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(668);
				((LiteralContext)_localctx).tmp6 = booleanLiteral();
				((LiteralContext)_localctx).ret = ((LiteralContext)_localctx).tmp6.ret;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(671);
				((LiteralContext)_localctx).tmp7 = charLiteral();
				((LiteralContext)_localctx).ret = ((LiteralContext)_localctx).tmp7.ret;
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(674);
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
		enterRule(_localctx, 70, RULE_signedLiteral);
		try {
			setState(694);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(679);
				((SignedLiteralContext)_localctx).tmp9 = signedNumericLiteral();
				((SignedLiteralContext)_localctx).ret = ((SignedLiteralContext)_localctx).tmp9.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(682);
				((SignedLiteralContext)_localctx).tmp5 = nullLiteral();
				((SignedLiteralContext)_localctx).ret = ((SignedLiteralContext)_localctx).tmp5.ret;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(685);
				((SignedLiteralContext)_localctx).tmp6 = booleanLiteral();
				((SignedLiteralContext)_localctx).ret = ((SignedLiteralContext)_localctx).tmp6.ret;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(688);
				((SignedLiteralContext)_localctx).tmp7 = charLiteral();
				((SignedLiteralContext)_localctx).ret = ((SignedLiteralContext)_localctx).tmp7.ret;
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(691);
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
		enterRule(_localctx, 72, RULE_numericLiteral);
		try {
			setState(720);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(696);
				((NumericLiteralContext)_localctx).tmp10 = intLiteral();
				((NumericLiteralContext)_localctx).ret = ((NumericLiteralContext)_localctx).tmp10.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(699);
				((NumericLiteralContext)_localctx).tmp11 = floatLiteral();
				((NumericLiteralContext)_localctx).ret = ((NumericLiteralContext)_localctx).tmp11.ret;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(702);
				((NumericLiteralContext)_localctx).tmp12 = doubleLiteral();
				((NumericLiteralContext)_localctx).ret = ((NumericLiteralContext)_localctx).tmp12.ret;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(705);
				((NumericLiteralContext)_localctx).tmp13 = longLiteral();
				((NumericLiteralContext)_localctx).ret = ((NumericLiteralContext)_localctx).tmp13.ret;
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(708);
				((NumericLiteralContext)_localctx).tmp14 = natLiteral();
				((NumericLiteralContext)_localctx).ret = ((NumericLiteralContext)_localctx).tmp14.ret;
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(711);
				((NumericLiteralContext)_localctx).tmp15 = basicLongLiteral();
				((NumericLiteralContext)_localctx).ret = ((NumericLiteralContext)_localctx).tmp15.ret;
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(714);
				((NumericLiteralContext)_localctx).tmp16 = basicFloatLiteral();
				((NumericLiteralContext)_localctx).ret = ((NumericLiteralContext)_localctx).tmp16.ret;
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(717);
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
		enterRule(_localctx, 74, RULE_signedNumericLiteral);
		try {
			setState(734);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(722);
				((SignedNumericLiteralContext)_localctx).tmp18 = signedNatLiteral();
				((SignedNumericLiteralContext)_localctx).ret = ((SignedNumericLiteralContext)_localctx).tmp18.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(725);
				((SignedNumericLiteralContext)_localctx).tmp19 = signedBasicLongLiteral();
				((SignedNumericLiteralContext)_localctx).ret = ((SignedNumericLiteralContext)_localctx).tmp19.ret;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(728);
				((SignedNumericLiteralContext)_localctx).tmp20 = signedBasicFloatLiteral();
				((SignedNumericLiteralContext)_localctx).ret = ((SignedNumericLiteralContext)_localctx).tmp20.ret;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(731);
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
		enterRule(_localctx, 76, RULE_mCType);
		try {
			setState(742);
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
				setState(736);
				((MCTypeContext)_localctx).tmp22 = mCPrimitiveType();
				((MCTypeContext)_localctx).ret = ((MCTypeContext)_localctx).tmp22.ret;
				}
				break;
			case Name:
				enterOuterAlt(_localctx, 2);
				{
				setState(739);
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
		enterRule(_localctx, 78, RULE_mCObjectType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(744);
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
		public IdentificationDataContext tmp25;
		public AssetMetaDataContext tmp26;
		public AccessPolicyContext tmp27;
		public IdentityProviderConfigContext tmp28;
		public OAuthInfoContext tmp29;
		public UsageContext tmp30;
		public IdentificationDataContext identificationData() {
			return getRuleContext(IdentificationDataContext.class,0);
		}
		public AssetMetaDataContext assetMetaData() {
			return getRuleContext(AssetMetaDataContext.class,0);
		}
		public AccessPolicyContext accessPolicy() {
			return getRuleContext(AccessPolicyContext.class,0);
		}
		public IdentityProviderConfigContext identityProviderConfig() {
			return getRuleContext(IdentityProviderConfigContext.class,0);
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
		enterRule(_localctx, 80, RULE_configurationElements);
		try {
			setState(765);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFICATIONDATA2818472792:
				enterOuterAlt(_localctx, 1);
				{
				setState(747);
				((ConfigurationElementsContext)_localctx).tmp25 = identificationData();
				((ConfigurationElementsContext)_localctx).ret = ((ConfigurationElementsContext)_localctx).tmp25.ret;
				}
				break;
			case ASSETMETADATA1606647359:
				enterOuterAlt(_localctx, 2);
				{
				setState(750);
				((ConfigurationElementsContext)_localctx).tmp26 = assetMetaData();
				((ConfigurationElementsContext)_localctx).ret = ((ConfigurationElementsContext)_localctx).tmp26.ret;
				}
				break;
			case ACCESSPOLICY2086207446:
				enterOuterAlt(_localctx, 3);
				{
				setState(753);
				((ConfigurationElementsContext)_localctx).tmp27 = accessPolicy();
				((ConfigurationElementsContext)_localctx).ret = ((ConfigurationElementsContext)_localctx).tmp27.ret;
				}
				break;
			case IDENTITYPROVIDERCONFIG3279634705:
				enterOuterAlt(_localctx, 4);
				{
				setState(756);
				((ConfigurationElementsContext)_localctx).tmp28 = identityProviderConfig();
				((ConfigurationElementsContext)_localctx).ret = ((ConfigurationElementsContext)_localctx).tmp28.ret;
				}
				break;
			case OAUTHINFO441599973:
				enterOuterAlt(_localctx, 5);
				{
				setState(759);
				((ConfigurationElementsContext)_localctx).tmp29 = oAuthInfo();
				((ConfigurationElementsContext)_localctx).ret = ((ConfigurationElementsContext)_localctx).tmp29.ret;
				}
				break;
			case OPCUAUSAGE3963326899:
			case USAGE82021761:
			case EDCUSAGE2215711869:
				enterOuterAlt(_localctx, 6);
				{
				setState(762);
				((ConfigurationElementsContext)_localctx).tmp30 = usage();
				((ConfigurationElementsContext)_localctx).ret = ((ConfigurationElementsContext)_localctx).tmp30.ret;
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
		public BaseUsageContext tmp31;
		public OPCUAUsageContext tmp32;
		public EDCUsageContext tmp33;
		public BaseUsageContext baseUsage() {
			return getRuleContext(BaseUsageContext.class,0);
		}
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
		enterRule(_localctx, 82, RULE_usage);
		try {
			setState(776);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case USAGE82021761:
				enterOuterAlt(_localctx, 1);
				{
				setState(767);
				((UsageContext)_localctx).tmp31 = baseUsage();
				((UsageContext)_localctx).ret = ((UsageContext)_localctx).tmp31.ret;
				}
				break;
			case OPCUAUSAGE3963326899:
				enterOuterAlt(_localctx, 2);
				{
				setState(770);
				((UsageContext)_localctx).tmp32 = oPCUAUsage();
				((UsageContext)_localctx).ret = ((UsageContext)_localctx).tmp32.ret;
				}
				break;
			case EDCUSAGE2215711869:
				enterOuterAlt(_localctx, 3);
				{
				setState(773);
				((UsageContext)_localctx).tmp33 = eDCUsage();
				((UsageContext)_localctx).ret = ((UsageContext)_localctx).tmp33.ret;
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
		enterRule(_localctx, 84, RULE_nokeyword_f102);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(778);
			if (!(next("f"))) throw new FailedPredicateException(this, "next(\"f\")");
			setState(779);
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
		enterRule(_localctx, 86, RULE_nokeyword_F70);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(781);
			if (!(next("F"))) throw new FailedPredicateException(this, "next(\"F\")");
			setState(782);
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
		enterRule(_localctx, 88, RULE_nokeyword_l108);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(784);
			if (!(next("l"))) throw new FailedPredicateException(this, "next(\"l\")");
			setState(785);
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
		enterRule(_localctx, 90, RULE_nokeyword_L76);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(787);
			if (!(next("L"))) throw new FailedPredicateException(this, "next(\"L\")");
			setState(788);
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
		case 42:
			return nokeyword_f102_sempred((Nokeyword_f102Context)_localctx, predIndex);
		case 43:
			return nokeyword_F70_sempred((Nokeyword_F70Context)_localctx, predIndex);
		case 44:
			return nokeyword_l108_sempred((Nokeyword_l108Context)_localctx, predIndex);
		case 45:
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
		"\u0004\u0001S\u0317\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"-\u0007-\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0003\u0001c\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0003\u0005v\b\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006~\b\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0089\b\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0091"+
		"\b\u0007\u0003\u0007\u0093\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u009f\b\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0003\t\u00ae\b\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u00ba\b\t\u0003\t\u00bc"+
		"\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00d7"+
		"\b\u000b\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010\u00eb"+
		"\b\u0010\n\u0010\f\u0010\u00ee\t\u0010\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0003\u0012\u00fb\b\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u010f\b\u0013"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u011a\b\u0015\u0001\u0016"+
		"\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0004\u0017\u0126\b\u0017\u000b\u0017"+
		"\f\u0017\u0127\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0005\u0019"+
		"\u015e\b\u0019\n\u0019\f\u0019\u0161\t\u0019\u0003\u0019\u0163\b\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0005\u001b"+
		"\u01a0\b\u001b\n\u001b\f\u001b\u01a3\t\u001b\u0003\u001b\u01a5\b\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0005\u001b"+
		"\u01b2\b\u001b\n\u001b\f\u001b\u01b5\t\u001b\u0003\u001b\u01b7\b\u001b"+
		"\u0001\u001b\u0001\u001b\u0003\u001b\u01bb\b\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0005\u001c\u01ed\b\u001c"+
		"\n\u001c\f\u001c\u01f0\t\u001c\u0003\u001c\u01f2\b\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0005\u001d\u020b\b\u001d\n"+
		"\u001d\f\u001d\u020e\t\u001d\u0003\u001d\u0210\b\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0005"+
		"\u001e\u0231\b\u001e\n\u001e\f\u001e\u0234\t\u001e\u0003\u001e\u0236\b"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0005"+
		"\u001e\u0243\b\u001e\n\u001e\f\u001e\u0246\t\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0005\u001f\u025c\b\u001f\n\u001f\f\u001f\u025f\t\u001f\u0003\u001f\u0261"+
		"\b\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001"+
		"!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001"+
		"!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0003\"\u02a6\b\"\u0001#\u0001#\u0001#\u0001#\u0001"+
		"#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001"+
		"#\u0003#\u02b7\b#\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0003$\u02d1\b$\u0001%\u0001"+
		"%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001"+
		"%\u0003%\u02df\b%\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0003&\u02e7"+
		"\b&\u0001\'\u0001\'\u0001\'\u0001(\u0001(\u0001(\u0001(\u0001(\u0001("+
		"\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001"+
		"(\u0001(\u0001(\u0003(\u02fe\b(\u0001)\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0003)\u0309\b)\u0001*\u0001*\u0001*\u0001+\u0001"+
		"+\u0001+\u0001,\u0001,\u0001,\u0001-\u0001-\u0001-\u0001-\u0000\u0000"+
		".\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\u0000\u0000\u0328\u0000\\"+
		"\u0001\u0000\u0000\u0000\u0002b\u0001\u0000\u0000\u0000\u0004d\u0001\u0000"+
		"\u0000\u0000\u0006g\u0001\u0000\u0000\u0000\bj\u0001\u0000\u0000\u0000"+
		"\nu\u0001\u0000\u0000\u0000\fw\u0001\u0000\u0000\u0000\u000e\u0092\u0001"+
		"\u0000\u0000\u0000\u0010\u0094\u0001\u0000\u0000\u0000\u0012\u00bb\u0001"+
		"\u0000\u0000\u0000\u0014\u00bd\u0001\u0000\u0000\u0000\u0016\u00d6\u0001"+
		"\u0000\u0000\u0000\u0018\u00d8\u0001\u0000\u0000\u0000\u001a\u00db\u0001"+
		"\u0000\u0000\u0000\u001c\u00de\u0001\u0000\u0000\u0000\u001e\u00e1\u0001"+
		"\u0000\u0000\u0000 \u00e4\u0001\u0000\u0000\u0000\"\u00ef\u0001\u0000"+
		"\u0000\u0000$\u00f4\u0001\u0000\u0000\u0000&\u010e\u0001\u0000\u0000\u0000"+
		"(\u0110\u0001\u0000\u0000\u0000*\u0119\u0001\u0000\u0000\u0000,\u011b"+
		"\u0001\u0000\u0000\u0000.\u011d\u0001\u0000\u0000\u00000\u012b\u0001\u0000"+
		"\u0000\u00002\u0143\u0001\u0000\u0000\u00004\u017c\u0001\u0000\u0000\u0000"+
		"6\u0194\u0001\u0000\u0000\u00008\u01cd\u0001\u0000\u0000\u0000:\u01f9"+
		"\u0001\u0000\u0000\u0000<\u021a\u0001\u0000\u0000\u0000>\u024b\u0001\u0000"+
		"\u0000\u0000@\u0266\u0001\u0000\u0000\u0000B\u027e\u0001\u0000\u0000\u0000"+
		"D\u02a5\u0001\u0000\u0000\u0000F\u02b6\u0001\u0000\u0000\u0000H\u02d0"+
		"\u0001\u0000\u0000\u0000J\u02de\u0001\u0000\u0000\u0000L\u02e6\u0001\u0000"+
		"\u0000\u0000N\u02e8\u0001\u0000\u0000\u0000P\u02fd\u0001\u0000\u0000\u0000"+
		"R\u0308\u0001\u0000\u0000\u0000T\u030a\u0001\u0000\u0000\u0000V\u030d"+
		"\u0001\u0000\u0000\u0000X\u0310\u0001\u0000\u0000\u0000Z\u0313\u0001\u0000"+
		"\u0000\u0000\\]\u0005\u001d\u0000\u0000]\u0001\u0001\u0000\u0000\u0000"+
		"^_\u0005?\u0000\u0000_c\u0006\u0001\uffff\uffff\u0000`a\u0005@\u0000\u0000"+
		"ac\u0006\u0001\uffff\uffff\u0000b^\u0001\u0000\u0000\u0000b`\u0001\u0000"+
		"\u0000\u0000c\u0003\u0001\u0000\u0000\u0000de\u0005M\u0000\u0000ef\u0006"+
		"\u0002\uffff\uffff\u0000f\u0005\u0001\u0000\u0000\u0000gh\u0005I\u0000"+
		"\u0000hi\u0006\u0003\uffff\uffff\u0000i\u0007\u0001\u0000\u0000\u0000"+
		"jk\u0005S\u0000\u0000kl\u0006\u0004\uffff\uffff\u0000l\t\u0001\u0000\u0000"+
		"\u0000mn\u0004\u0005\u0000\u0000no\u0005\u0019\u0000\u0000op\u0006\u0005"+
		"\uffff\uffff\u0000pq\u0001\u0000\u0000\u0000qr\u0005S\u0000\u0000rv\u0006"+
		"\u0005\uffff\uffff\u0000st\u0005S\u0000\u0000tv\u0006\u0005\uffff\uffff"+
		"\u0000um\u0001\u0000\u0000\u0000us\u0001\u0000\u0000\u0000v\u000b\u0001"+
		"\u0000\u0000\u0000wx\u0004\u0006\u0001\u0000xy\u0005S\u0000\u0000yz\u0006"+
		"\u0006\uffff\uffff\u0000z}\u0001\u0000\u0000\u0000{~\u0003X,\u0000|~\u0003"+
		"Z-\u0000}{\u0001\u0000\u0000\u0000}|\u0001\u0000\u0000\u0000~\r\u0001"+
		"\u0000\u0000\u0000\u007f\u0080\u0004\u0007\u0002\u0000\u0080\u0081\u0005"+
		"\u0019\u0000\u0000\u0081\u0082\u0006\u0007\uffff\uffff\u0000\u0082\u0083"+
		"\u0001\u0000\u0000\u0000\u0083\u0084\u0005S\u0000\u0000\u0084\u0085\u0006"+
		"\u0007\uffff\uffff\u0000\u0085\u0088\u0001\u0000\u0000\u0000\u0086\u0089"+
		"\u0003X,\u0000\u0087\u0089\u0003Z-\u0000\u0088\u0086\u0001\u0000\u0000"+
		"\u0000\u0088\u0087\u0001\u0000\u0000\u0000\u0089\u0093\u0001\u0000\u0000"+
		"\u0000\u008a\u008b\u0004\u0007\u0003\u0000\u008b\u008c\u0005S\u0000\u0000"+
		"\u008c\u008d\u0006\u0007\uffff\uffff\u0000\u008d\u0090\u0001\u0000\u0000"+
		"\u0000\u008e\u0091\u0003X,\u0000\u008f\u0091\u0003Z-\u0000\u0090\u008e"+
		"\u0001\u0000\u0000\u0000\u0090\u008f\u0001\u0000\u0000\u0000\u0091\u0093"+
		"\u0001\u0000\u0000\u0000\u0092\u007f\u0001\u0000\u0000\u0000\u0092\u008a"+
		"\u0001\u0000\u0000\u0000\u0093\u000f\u0001\u0000\u0000\u0000\u0094\u0095"+
		"\u0004\b\u0004\u0000\u0095\u0096\u0005S\u0000\u0000\u0096\u0097\u0006"+
		"\b\uffff\uffff\u0000\u0097\u0098\u0001\u0000\u0000\u0000\u0098\u0099\u0005"+
		"\u001b\u0000\u0000\u0099\u009a\u0005S\u0000\u0000\u009a\u009b\u0006\b"+
		"\uffff\uffff\u0000\u009b\u009e\u0001\u0000\u0000\u0000\u009c\u009f\u0003"+
		"T*\u0000\u009d\u009f\u0003V+\u0000\u009e\u009c\u0001\u0000\u0000\u0000"+
		"\u009e\u009d\u0001\u0000\u0000\u0000\u009f\u0011\u0001\u0000\u0000\u0000"+
		"\u00a0\u00a1\u0004\t\u0005\u0000\u00a1\u00a2\u0005\u0019\u0000\u0000\u00a2"+
		"\u00a3\u0006\t\uffff\uffff\u0000\u00a3\u00a4\u0001\u0000\u0000\u0000\u00a4"+
		"\u00a5\u0005S\u0000\u0000\u00a5\u00a6\u0006\t\uffff\uffff\u0000\u00a6"+
		"\u00a7\u0001\u0000\u0000\u0000\u00a7\u00a8\u0005\u001b\u0000\u0000\u00a8"+
		"\u00a9\u0005S\u0000\u0000\u00a9\u00aa\u0006\t\uffff\uffff\u0000\u00aa"+
		"\u00ad\u0001\u0000\u0000\u0000\u00ab\u00ae\u0003T*\u0000\u00ac\u00ae\u0003"+
		"V+\u0000\u00ad\u00ab\u0001\u0000\u0000\u0000\u00ad\u00ac\u0001\u0000\u0000"+
		"\u0000\u00ae\u00bc\u0001\u0000\u0000\u0000\u00af\u00b0\u0004\t\u0006\u0000"+
		"\u00b0\u00b1\u0005S\u0000\u0000\u00b1\u00b2\u0006\t\uffff\uffff\u0000"+
		"\u00b2\u00b3\u0001\u0000\u0000\u0000\u00b3\u00b4\u0005\u001b\u0000\u0000"+
		"\u00b4\u00b5\u0005S\u0000\u0000\u00b5\u00b6\u0006\t\uffff\uffff\u0000"+
		"\u00b6\u00b9\u0001\u0000\u0000\u0000\u00b7\u00ba\u0003T*\u0000\u00b8\u00ba"+
		"\u0003V+\u0000\u00b9\u00b7\u0001\u0000\u0000\u0000\u00b9\u00b8\u0001\u0000"+
		"\u0000\u0000\u00ba\u00bc\u0001\u0000\u0000\u0000\u00bb\u00a0\u0001\u0000"+
		"\u0000\u0000\u00bb\u00af\u0001\u0000\u0000\u0000\u00bc\u0013\u0001\u0000"+
		"\u0000\u0000\u00bd\u00be\u0004\n\u0007\u0000\u00be\u00bf\u0005S\u0000"+
		"\u0000\u00bf\u00c0\u0006\n\uffff\uffff\u0000\u00c0\u00c1\u0001\u0000\u0000"+
		"\u0000\u00c1\u00c2\u0005\u001b\u0000\u0000\u00c2\u00c3\u0005S\u0000\u0000"+
		"\u00c3\u00c4\u0006\n\uffff\uffff\u0000\u00c4\u0015\u0001\u0000\u0000\u0000"+
		"\u00c5\u00c6\u0004\u000b\b\u0000\u00c6\u00c7\u0005\u0019\u0000\u0000\u00c7"+
		"\u00c8\u0006\u000b\uffff\uffff\u0000\u00c8\u00c9\u0001\u0000\u0000\u0000"+
		"\u00c9\u00ca\u0005S\u0000\u0000\u00ca\u00cb\u0006\u000b\uffff\uffff\u0000"+
		"\u00cb\u00cc\u0001\u0000\u0000\u0000\u00cc\u00cd\u0005\u001b\u0000\u0000"+
		"\u00cd\u00ce\u0005S\u0000\u0000\u00ce\u00d7\u0006\u000b\uffff\uffff\u0000"+
		"\u00cf\u00d0\u0004\u000b\t\u0000\u00d0\u00d1\u0005S\u0000\u0000\u00d1"+
		"\u00d2\u0006\u000b\uffff\uffff\u0000\u00d2\u00d3\u0001\u0000\u0000\u0000"+
		"\u00d3\u00d4\u0005\u001b\u0000\u0000\u00d4\u00d5\u0005S\u0000\u0000\u00d5"+
		"\u00d7\u0006\u000b\uffff\uffff\u0000\u00d6\u00c5\u0001\u0000\u0000\u0000"+
		"\u00d6\u00cf\u0001\u0000\u0000\u0000\u00d7\u0017\u0001\u0000\u0000\u0000"+
		"\u00d8\u00d9\u0005J\u0000\u0000\u00d9\u00da\u0006\f\uffff\uffff\u0000"+
		"\u00da\u0019\u0001\u0000\u0000\u0000\u00db\u00dc\u0005P\u0000\u0000\u00dc"+
		"\u00dd\u0006\r\uffff\uffff\u0000\u00dd\u001b\u0001\u0000\u0000\u0000\u00de"+
		"\u00df\u0005N\u0000\u0000\u00df\u00e0\u0006\u000e\uffff\uffff\u0000\u00e0"+
		"\u001d\u0001\u0000\u0000\u0000\u00e1\u00e2\u0005L\u0000\u0000\u00e2\u00e3"+
		"\u0006\u000f\uffff\uffff\u0000\u00e3\u001f\u0001\u0000\u0000\u0000\u00e4"+
		"\u00e5\u0005K\u0000\u0000\u00e5\u00e6\u0006\u0010\uffff\uffff\u0000\u00e6"+
		"\u00ec\u0001\u0000\u0000\u0000\u00e7\u00e8\u0005\u001b\u0000\u0000\u00e8"+
		"\u00e9\u0005K\u0000\u0000\u00e9\u00eb\u0006\u0010\uffff\uffff\u0000\u00ea"+
		"\u00e7\u0001\u0000\u0000\u0000\u00eb\u00ee\u0001\u0000\u0000\u0000\u00ec"+
		"\u00ea\u0001\u0000\u0000\u0000\u00ec\u00ed\u0001\u0000\u0000\u0000\u00ed"+
		"!\u0001\u0000\u0000\u0000\u00ee\u00ec\u0001\u0000\u0000\u0000\u00ef\u00f0"+
		"\u0005\u0010\u0000\u0000\u00f0\u00f1\u0003 \u0010\u0000\u00f1\u00f2\u0006"+
		"\u0011\uffff\uffff\u0000\u00f2\u00f3\u0005!\u0000\u0000\u00f3#\u0001\u0000"+
		"\u0000\u0000\u00f4\u00f5\u0005%\u0000\u0000\u00f5\u00f6\u0003 \u0010\u0000"+
		"\u00f6\u00fa\u0006\u0012\uffff\uffff\u0000\u00f7\u00f8\u0005\u001b\u0000"+
		"\u0000\u00f8\u00f9\u0005\u0016\u0000\u0000\u00f9\u00fb\u0006\u0012\uffff"+
		"\uffff\u0000\u00fa\u00f7\u0001\u0000\u0000\u0000\u00fa\u00fb\u0001\u0000"+
		"\u0000\u0000\u00fb\u00fc\u0001\u0000\u0000\u0000\u00fc\u00fd\u0005!\u0000"+
		"\u0000\u00fd%\u0001\u0000\u0000\u0000\u00fe\u00ff\u0005A\u0000\u0000\u00ff"+
		"\u010f\u0006\u0013\uffff\uffff\u0000\u0100\u0101\u0005B\u0000\u0000\u0101"+
		"\u010f\u0006\u0013\uffff\uffff\u0000\u0102\u0103\u0005C\u0000\u0000\u0103"+
		"\u010f\u0006\u0013\uffff\uffff\u0000\u0104\u0105\u0005D\u0000\u0000\u0105"+
		"\u010f\u0006\u0013\uffff\uffff\u0000\u0106\u0107\u0005E\u0000\u0000\u0107"+
		"\u010f\u0006\u0013\uffff\uffff\u0000\u0108\u0109\u0005F\u0000\u0000\u0109"+
		"\u010f\u0006\u0013\uffff\uffff\u0000\u010a\u010b\u0005G\u0000\u0000\u010b"+
		"\u010f\u0006\u0013\uffff\uffff\u0000\u010c\u010d\u0005H\u0000\u0000\u010d"+
		"\u010f\u0006\u0013\uffff\uffff\u0000\u010e\u00fe\u0001\u0000\u0000\u0000"+
		"\u010e\u0100\u0001\u0000\u0000\u0000\u010e\u0102\u0001\u0000\u0000\u0000"+
		"\u010e\u0104\u0001\u0000\u0000\u0000\u010e\u0106\u0001\u0000\u0000\u0000"+
		"\u010e\u0108\u0001\u0000\u0000\u0000\u010e\u010a\u0001\u0000\u0000\u0000"+
		"\u010e\u010c\u0001\u0000\u0000\u0000\u010f\'\u0001\u0000\u0000\u0000\u0110"+
		"\u0111\u0003 \u0010\u0000\u0111\u0112\u0006\u0014\uffff\uffff\u0000\u0112"+
		")\u0001\u0000\u0000\u0000\u0113\u0114\u0003,\u0016\u0000\u0114\u0115\u0006"+
		"\u0015\uffff\uffff\u0000\u0115\u011a\u0001\u0000\u0000\u0000\u0116\u0117"+
		"\u0003L&\u0000\u0117\u0118\u0006\u0015\uffff\uffff\u0000\u0118\u011a\u0001"+
		"\u0000\u0000\u0000\u0119\u0113\u0001\u0000\u0000\u0000\u0119\u0116\u0001"+
		"\u0000\u0000\u0000\u011a+\u0001\u0000\u0000\u0000\u011b\u011c\u0005\u0011"+
		"\u0000\u0000\u011c-\u0001\u0000\u0000\u0000\u011d\u011e\u0005\u0005\u0000"+
		"\u0000\u011e\u011f\u0005K\u0000\u0000\u011f\u0120\u0006\u0017\uffff\uffff"+
		"\u0000\u0120\u0121\u0001\u0000\u0000\u0000\u0121\u0125\u0005<\u0000\u0000"+
		"\u0122\u0123\u0003P(\u0000\u0123\u0124\u0006\u0017\uffff\uffff\u0000\u0124"+
		"\u0126\u0001\u0000\u0000\u0000\u0125\u0122\u0001\u0000\u0000\u0000\u0126"+
		"\u0127\u0001\u0000\u0000\u0000\u0127\u0125\u0001\u0000\u0000\u0000\u0127"+
		"\u0128\u0001\u0000\u0000\u0000\u0128\u0129\u0001\u0000\u0000\u0000\u0129"+
		"\u012a\u0005>\u0000\u0000\u012a/\u0001\u0000\u0000\u0000\u012b\u012c\u0005"+
		"\u0014\u0000\u0000\u012c\u012d\u0005<\u0000\u0000\u012d\u012e\u0005:\u0000"+
		"\u0000\u012e\u012f\u0005#\u0000\u0000\u012f\u0130\u0003\u0006\u0003\u0000"+
		"\u0130\u0131\u0006\u0018\uffff\uffff\u0000\u0131\u0132\u0005!\u0000\u0000"+
		"\u0132\u0133\u00059\u0000\u0000\u0133\u0134\u0005#\u0000\u0000\u0134\u0135"+
		"\u0003\u0006\u0003\u0000\u0135\u0136\u0006\u0018\uffff\uffff\u0000\u0136"+
		"\u0137\u0005!\u0000\u0000\u0137\u0138\u0005*\u0000\u0000\u0138\u0139\u0005"+
		"#\u0000\u0000\u0139\u013a\u0003\u0006\u0003\u0000\u013a\u013b\u0006\u0018"+
		"\uffff\uffff\u0000\u013b\u013c\u0005!\u0000\u0000\u013c\u013d\u0005\u0012"+
		"\u0000\u0000\u013d\u013e\u0005#\u0000\u0000\u013e\u013f\u0003\u0006\u0003"+
		"\u0000\u013f\u0140\u0006\u0018\uffff\uffff\u0000\u0140\u0141\u0005!\u0000"+
		"\u0000\u0141\u0142\u0005>\u0000\u0000\u01421\u0001\u0000\u0000\u0000\u0143"+
		"\u0144\u0005=\u0000\u0000\u0144\u0145\u0005<\u0000\u0000\u0145\u0146\u0005"+
		")\u0000\u0000\u0146\u0147\u0005#\u0000\u0000\u0147\u0148\u0003\u0006\u0003"+
		"\u0000\u0148\u0149\u0006\u0019\uffff\uffff\u0000\u0149\u014a\u0005!\u0000"+
		"\u0000\u014a\u014b\u0005&\u0000\u0000\u014b\u014c\u0005#\u0000\u0000\u014c"+
		"\u014d\u0003\u0006\u0003\u0000\u014d\u014e\u0006\u0019\uffff\uffff\u0000"+
		"\u014e\u014f\u0005!\u0000\u0000\u014f\u0150\u0005 \u0000\u0000\u0150\u0151"+
		"\u0005#\u0000\u0000\u0151\u0152\u0003\u0006\u0003\u0000\u0152\u0153\u0006"+
		"\u0019\uffff\uffff\u0000\u0153\u0154\u0005!\u0000\u0000\u0154\u0155\u0005"+
		"\'\u0000\u0000\u0155\u0156\u0005#\u0000\u0000\u0156\u0162\u0005-\u0000"+
		"\u0000\u0157\u0158\u0003\u0006\u0003\u0000\u0158\u015f\u0006\u0019\uffff"+
		"\uffff\u0000\u0159\u015a\u0005\u0018\u0000\u0000\u015a\u015b\u0003\u0006"+
		"\u0003\u0000\u015b\u015c\u0006\u0019\uffff\uffff\u0000\u015c\u015e\u0001"+
		"\u0000\u0000\u0000\u015d\u0159\u0001\u0000\u0000\u0000\u015e\u0161\u0001"+
		"\u0000\u0000\u0000\u015f\u015d\u0001\u0000\u0000\u0000\u015f\u0160\u0001"+
		"\u0000\u0000\u0000\u0160\u0163\u0001\u0000\u0000\u0000\u0161\u015f\u0001"+
		"\u0000\u0000\u0000\u0162\u0157\u0001\u0000\u0000\u0000\u0162\u0163\u0001"+
		"\u0000\u0000\u0000\u0163\u0164\u0001\u0000\u0000\u0000\u0164\u0165\u0005"+
		".\u0000\u0000\u0165\u0166\u0005!\u0000\u0000\u0166\u0167\u0005\u001a\u0000"+
		"\u0000\u0167\u0168\u0005#\u0000\u0000\u0168\u0169\u0003\u0006\u0003\u0000"+
		"\u0169\u016a\u0006\u0019\uffff\uffff\u0000\u016a\u016b\u0005!\u0000\u0000"+
		"\u016b\u016c\u0005\u0015\u0000\u0000\u016c\u016d\u0005#\u0000\u0000\u016d"+
		"\u016e\u0003\u0006\u0003\u0000\u016e\u016f\u0006\u0019\uffff\uffff\u0000"+
		"\u016f\u0170\u0005!\u0000\u0000\u0170\u0171\u0005\u000b\u0000\u0000\u0171"+
		"\u0172\u0005#\u0000\u0000\u0172\u0173\u0003\u0006\u0003\u0000\u0173\u0174"+
		"\u0006\u0019\uffff\uffff\u0000\u0174\u0175\u0005!\u0000\u0000\u0175\u0176"+
		"\u0005\u0007\u0000\u0000\u0176\u0177\u0005#\u0000\u0000\u0177\u0178\u0003"+
		"\u0006\u0003\u0000\u0178\u0179\u0006\u0019\uffff\uffff\u0000\u0179\u017a"+
		"\u0005!\u0000\u0000\u017a\u017b\u0005>\u0000\u0000\u017b3\u0001\u0000"+
		"\u0000\u0000\u017c\u017d\u0005/\u0000\u0000\u017d\u017e\u0005<\u0000\u0000"+
		"\u017e\u017f\u00059\u0000\u0000\u017f\u0180\u0005#\u0000\u0000\u0180\u0181"+
		"\u0003\u0006\u0003\u0000\u0181\u0182\u0006\u001a\uffff\uffff\u0000\u0182"+
		"\u0183\u0005!\u0000\u0000\u0183\u0184\u0005*\u0000\u0000\u0184\u0185\u0005"+
		"#\u0000\u0000\u0185\u0186\u0003\u0006\u0003\u0000\u0186\u0187\u0006\u001a"+
		"\uffff\uffff\u0000\u0187\u0188\u0005!\u0000\u0000\u0188\u0189\u0005\u0013"+
		"\u0000\u0000\u0189\u018a\u0005#\u0000\u0000\u018a\u018b\u0003\u0006\u0003"+
		"\u0000\u018b\u018c\u0006\u001a\uffff\uffff\u0000\u018c\u018d\u0005!\u0000"+
		"\u0000\u018d\u018e\u00050\u0000\u0000\u018e\u018f\u0005#\u0000\u0000\u018f"+
		"\u0190\u0003\u0006\u0003\u0000\u0190\u0191\u0006\u001a\uffff\uffff\u0000"+
		"\u0191\u0192\u0005!\u0000\u0000\u0192\u0193\u0005>\u0000\u0000\u01935"+
		"\u0001\u0000\u0000\u0000\u0194\u0195\u0005\u0006\u0000\u0000\u0195\u0196"+
		"\u0005<\u0000\u0000\u0196\u0197\u00058\u0000\u0000\u0197\u0198\u0005#"+
		"\u0000\u0000\u0198\u01a4\u0005-\u0000\u0000\u0199\u019a\u0003\u0006\u0003"+
		"\u0000\u019a\u01a1\u0006\u001b\uffff\uffff\u0000\u019b\u019c\u0005\u0018"+
		"\u0000\u0000\u019c\u019d\u0003\u0006\u0003\u0000\u019d\u019e\u0006\u001b"+
		"\uffff\uffff\u0000\u019e\u01a0\u0001\u0000\u0000\u0000\u019f\u019b\u0001"+
		"\u0000\u0000\u0000\u01a0\u01a3\u0001\u0000\u0000\u0000\u01a1\u019f\u0001"+
		"\u0000\u0000\u0000\u01a1\u01a2\u0001\u0000\u0000\u0000\u01a2\u01a5\u0001"+
		"\u0000\u0000\u0000\u01a3\u01a1\u0001\u0000\u0000\u0000\u01a4\u0199\u0001"+
		"\u0000\u0000\u0000\u01a4\u01a5\u0001\u0000\u0000\u0000\u01a5\u01a6\u0001"+
		"\u0000\u0000\u0000\u01a6\u01a7\u0005.\u0000\u0000\u01a7\u01ba\u0005!\u0000"+
		"\u0000\u01a8\u01a9\u0005\u0001\u0000\u0000\u01a9\u01aa\u0005#\u0000\u0000"+
		"\u01aa\u01b6\u0005-\u0000\u0000\u01ab\u01ac\u0003\u0006\u0003\u0000\u01ac"+
		"\u01b3\u0006\u001b\uffff\uffff\u0000\u01ad\u01ae\u0005\u0018\u0000\u0000"+
		"\u01ae\u01af\u0003\u0006\u0003\u0000\u01af\u01b0\u0006\u001b\uffff\uffff"+
		"\u0000\u01b0\u01b2\u0001\u0000\u0000\u0000\u01b1\u01ad\u0001\u0000\u0000"+
		"\u0000\u01b2\u01b5\u0001\u0000\u0000\u0000\u01b3\u01b1\u0001\u0000\u0000"+
		"\u0000\u01b3\u01b4\u0001\u0000\u0000\u0000\u01b4\u01b7\u0001\u0000\u0000"+
		"\u0000\u01b5\u01b3\u0001\u0000\u0000\u0000\u01b6\u01ab\u0001\u0000\u0000"+
		"\u0000\u01b6\u01b7\u0001\u0000\u0000\u0000\u01b7\u01b8\u0001\u0000\u0000"+
		"\u0000\u01b8\u01b9\u0005.\u0000\u0000\u01b9\u01bb\u0005!\u0000\u0000\u01ba"+
		"\u01a8\u0001\u0000\u0000\u0000\u01ba\u01bb\u0001\u0000\u0000\u0000\u01bb"+
		"\u01bc\u0001\u0000\u0000\u0000\u01bc\u01bd\u00056\u0000\u0000\u01bd\u01be"+
		"\u0005#\u0000\u0000\u01be\u01bf\u0003\u0006\u0003\u0000\u01bf\u01c0\u0006"+
		"\u001b\uffff\uffff\u0000\u01c0\u01c1\u0005!\u0000\u0000\u01c1\u01c2\u0005"+
		"\u0017\u0000\u0000\u01c2\u01c3\u0005#\u0000\u0000\u01c3\u01c4\u0003\u0006"+
		"\u0003\u0000\u01c4\u01c5\u0006\u001b\uffff\uffff\u0000\u01c5\u01c6\u0005"+
		"!\u0000\u0000\u01c6\u01c7\u0005\r\u0000\u0000\u01c7\u01c8\u0005#\u0000"+
		"\u0000\u01c8\u01c9\u0003\u0006\u0003\u0000\u01c9\u01ca\u0006\u001b\uffff"+
		"\uffff\u0000\u01ca\u01cb\u0005!\u0000\u0000\u01cb\u01cc\u0005>\u0000\u0000"+
		"\u01cc7\u0001\u0000\u0000\u0000\u01cd\u01ce\u00057\u0000\u0000\u01ce\u01cf"+
		"\u0005<\u0000\u0000\u01cf\u01d0\u0005\u000f\u0000\u0000\u01d0\u01d1\u0005"+
		"#\u0000\u0000\u01d1\u01d2\u0003\u0006\u0003\u0000\u01d2\u01d3\u0006\u001c"+
		"\uffff\uffff\u0000\u01d3\u01d4\u0005!\u0000\u0000\u01d4\u01d5\u0005\t"+
		"\u0000\u0000\u01d5\u01d6\u0005#\u0000\u0000\u01d6\u01d7\u0003\u0006\u0003"+
		"\u0000\u01d7\u01d8\u0006\u001c\uffff\uffff\u0000\u01d8\u01d9\u0005!\u0000"+
		"\u0000\u01d9\u01da\u0005\u000e\u0000\u0000\u01da\u01db\u0005#\u0000\u0000"+
		"\u01db\u01dc\u0003\u0006\u0003\u0000\u01dc\u01dd\u0006\u001c\uffff\uffff"+
		"\u0000\u01dd\u01de\u0005!\u0000\u0000\u01de\u01df\u0005\u0003\u0000\u0000"+
		"\u01df\u01e0\u0005#\u0000\u0000\u01e0\u01e1\u0003\u0006\u0003\u0000\u01e1"+
		"\u01e2\u0006\u001c\uffff\uffff\u0000\u01e2\u01e3\u0005!\u0000\u0000\u01e3"+
		"\u01e4\u0005+\u0000\u0000\u01e4\u01e5\u0005#\u0000\u0000\u01e5\u01f1\u0005"+
		"-\u0000\u0000\u01e6\u01e7\u0003\u0006\u0003\u0000\u01e7\u01ee\u0006\u001c"+
		"\uffff\uffff\u0000\u01e8\u01e9\u0005\u0018\u0000\u0000\u01e9\u01ea\u0003"+
		"\u0006\u0003\u0000\u01ea\u01eb\u0006\u001c\uffff\uffff\u0000\u01eb\u01ed"+
		"\u0001\u0000\u0000\u0000\u01ec\u01e8\u0001\u0000\u0000\u0000\u01ed\u01f0"+
		"\u0001\u0000\u0000\u0000\u01ee\u01ec\u0001\u0000\u0000\u0000\u01ee\u01ef"+
		"\u0001\u0000\u0000\u0000\u01ef\u01f2\u0001\u0000\u0000\u0000\u01f0\u01ee"+
		"\u0001\u0000\u0000\u0000\u01f1\u01e6\u0001\u0000\u0000\u0000\u01f1\u01f2"+
		"\u0001\u0000\u0000\u0000\u01f2\u01f3\u0001\u0000\u0000\u0000\u01f3\u01f4"+
		"\u0005.\u0000\u0000\u01f4\u01f5\u0005!\u0000\u0000\u01f5\u01f6\u0003:"+
		"\u001d\u0000\u01f6\u01f7\u0006\u001c\uffff\uffff\u0000\u01f7\u01f8\u0005"+
		">\u0000\u0000\u01f89\u0001\u0000\u0000\u0000\u01f9\u01fa\u00053\u0000"+
		"\u0000\u01fa\u01fb\u0005<\u0000\u0000\u01fb\u01fc\u0005;\u0000\u0000\u01fc"+
		"\u01fd\u0005#\u0000\u0000\u01fd\u020f\u0005<\u0000\u0000\u01fe\u01ff\u0003"+
		"\u0006\u0003\u0000\u01ff\u0200\u0006\u001d\uffff\uffff\u0000\u0200\u0201"+
		"\u0005#\u0000\u0000\u0201\u0202\u0003\u0006\u0003\u0000\u0202\u020c\u0006"+
		"\u001d\uffff\uffff\u0000\u0203\u0204\u0005\u0018\u0000\u0000\u0204\u0205"+
		"\u0003\u0006\u0003\u0000\u0205\u0206\u0006\u001d\uffff\uffff\u0000\u0206"+
		"\u0207\u0005#\u0000\u0000\u0207\u0208\u0003\u0006\u0003\u0000\u0208\u0209"+
		"\u0006\u001d\uffff\uffff\u0000\u0209\u020b\u0001\u0000\u0000\u0000\u020a"+
		"\u0203\u0001\u0000\u0000\u0000\u020b\u020e\u0001\u0000\u0000\u0000\u020c"+
		"\u020a\u0001\u0000\u0000\u0000\u020c\u020d\u0001\u0000\u0000\u0000\u020d"+
		"\u0210\u0001\u0000\u0000\u0000\u020e\u020c\u0001\u0000\u0000\u0000\u020f"+
		"\u01fe\u0001\u0000\u0000\u0000\u020f\u0210\u0001\u0000\u0000\u0000\u0210"+
		"\u0211\u0001\u0000\u0000\u0000\u0211\u0212\u0005>\u0000\u0000\u0212\u0213"+
		"\u0005!\u0000\u0000\u0213\u0214\u0005\u0004\u0000\u0000\u0214\u0215\u0005"+
		"#\u0000\u0000\u0215\u0216\u0003\u0006\u0003\u0000\u0216\u0217\u0006\u001d"+
		"\uffff\uffff\u0000\u0217\u0218\u0005!\u0000\u0000\u0218\u0219\u0005>\u0000"+
		"\u0000\u0219;\u0001\u0000\u0000\u0000\u021a\u021b\u0005\b\u0000\u0000"+
		"\u021b\u021c\u0005<\u0000\u0000\u021c\u021d\u0005\u0002\u0000\u0000\u021d"+
		"\u021e\u0005#\u0000\u0000\u021e\u021f\u0003\u0006\u0003\u0000\u021f\u0220"+
		"\u0006\u001e\uffff\uffff\u0000\u0220\u0221\u0005!\u0000\u0000\u0221\u0222"+
		"\u00054\u0000\u0000\u0222\u0223\u0005#\u0000\u0000\u0223\u0235\u0005<"+
		"\u0000\u0000\u0224\u0225\u0003\u0006\u0003\u0000\u0225\u0226\u0006\u001e"+
		"\uffff\uffff\u0000\u0226\u0227\u0005#\u0000\u0000\u0227\u0228\u0003\u0006"+
		"\u0003\u0000\u0228\u0232\u0006\u001e\uffff\uffff\u0000\u0229\u022a\u0005"+
		"\u0018\u0000\u0000\u022a\u022b\u0003\u0006\u0003\u0000\u022b\u022c\u0006"+
		"\u001e\uffff\uffff\u0000\u022c\u022d\u0005#\u0000\u0000\u022d\u022e\u0003"+
		"\u0006\u0003\u0000\u022e\u022f\u0006\u001e\uffff\uffff\u0000\u022f\u0231"+
		"\u0001\u0000\u0000\u0000\u0230\u0229\u0001\u0000\u0000\u0000\u0231\u0234"+
		"\u0001\u0000\u0000\u0000\u0232\u0230\u0001\u0000\u0000\u0000\u0232\u0233"+
		"\u0001\u0000\u0000\u0000\u0233\u0236\u0001\u0000\u0000\u0000\u0234\u0232"+
		"\u0001\u0000\u0000\u0000\u0235\u0224\u0001\u0000\u0000\u0000\u0235\u0236"+
		"\u0001\u0000\u0000\u0000\u0236\u0237\u0001\u0000\u0000\u0000\u0237\u0238"+
		"\u0005>\u0000\u0000\u0238\u0239\u0005!\u0000\u0000\u0239\u023a\u0005$"+
		"\u0000\u0000\u023a\u023b\u0005#\u0000\u0000\u023b\u023c\u0005-\u0000\u0000"+
		"\u023c\u023d\u0003>\u001f\u0000\u023d\u0244\u0006\u001e\uffff\uffff\u0000"+
		"\u023e\u023f\u0005\u0018\u0000\u0000\u023f\u0240\u0003>\u001f\u0000\u0240"+
		"\u0241\u0006\u001e\uffff\uffff\u0000\u0241\u0243\u0001\u0000\u0000\u0000"+
		"\u0242\u023e\u0001\u0000\u0000\u0000\u0243\u0246\u0001\u0000\u0000\u0000"+
		"\u0244\u0242\u0001\u0000\u0000\u0000\u0244\u0245\u0001\u0000\u0000\u0000"+
		"\u0245\u0247\u0001\u0000\u0000\u0000\u0246\u0244\u0001\u0000\u0000\u0000"+
		"\u0247\u0248\u0005.\u0000\u0000\u0248\u0249\u0005!\u0000\u0000\u0249\u024a"+
		"\u0005>\u0000\u0000\u024a=\u0001\u0000\u0000\u0000\u024b\u024c\u0005\u001c"+
		"\u0000\u0000\u024c\u024d\u0005<\u0000\u0000\u024d\u024e\u0005\u001f\u0000"+
		"\u0000\u024e\u024f\u0005#\u0000\u0000\u024f\u0250\u0003\u0006\u0003\u0000"+
		"\u0250\u0251\u0006\u001f\uffff\uffff\u0000\u0251\u0252\u0005!\u0000\u0000"+
		"\u0252\u0253\u0005\n\u0000\u0000\u0253\u0254\u0005#\u0000\u0000\u0254"+
		"\u0260\u0005-\u0000\u0000\u0255\u0256\u0003\u0006\u0003\u0000\u0256\u025d"+
		"\u0006\u001f\uffff\uffff\u0000\u0257\u0258\u0005\u0018\u0000\u0000\u0258"+
		"\u0259\u0003\u0006\u0003\u0000\u0259\u025a\u0006\u001f\uffff\uffff\u0000"+
		"\u025a\u025c\u0001\u0000\u0000\u0000\u025b\u0257\u0001\u0000\u0000\u0000"+
		"\u025c\u025f\u0001\u0000\u0000\u0000\u025d\u025b\u0001\u0000\u0000\u0000"+
		"\u025d\u025e\u0001\u0000\u0000\u0000\u025e\u0261\u0001\u0000\u0000\u0000"+
		"\u025f\u025d\u0001\u0000\u0000\u0000\u0260\u0255\u0001\u0000\u0000\u0000"+
		"\u0260\u0261\u0001\u0000\u0000\u0000\u0261\u0262\u0001\u0000\u0000\u0000"+
		"\u0262\u0263\u0005.\u0000\u0000\u0263\u0264\u0005!\u0000\u0000\u0264\u0265"+
		"\u0005>\u0000\u0000\u0265?\u0001\u0000\u0000\u0000\u0266\u0267\u00055"+
		"\u0000\u0000\u0267\u0268\u0005<\u0000\u0000\u0268\u0269\u00052\u0000\u0000"+
		"\u0269\u026a\u0005#\u0000\u0000\u026a\u026b\u0003\u0006\u0003\u0000\u026b"+
		"\u026c\u0006 \uffff\uffff\u0000\u026c\u026d\u0005!\u0000\u0000\u026d\u026e"+
		"\u00051\u0000\u0000\u026e\u026f\u0005#\u0000\u0000\u026f\u0270\u0003\u0006"+
		"\u0003\u0000\u0270\u0271\u0006 \uffff\uffff\u0000\u0271\u0272\u0005!\u0000"+
		"\u0000\u0272\u0273\u0005(\u0000\u0000\u0273\u0274\u0005#\u0000\u0000\u0274"+
		"\u0275\u0003\u0006\u0003\u0000\u0275\u0276\u0006 \uffff\uffff\u0000\u0276"+
		"\u0277\u0005!\u0000\u0000\u0277\u0278\u0005\"\u0000\u0000\u0278\u0279"+
		"\u0005#\u0000\u0000\u0279\u027a\u0003\u0006\u0003\u0000\u027a\u027b\u0006"+
		" \uffff\uffff\u0000\u027b\u027c\u0005!\u0000\u0000\u027c\u027d\u0005>"+
		"\u0000\u0000\u027dA\u0001\u0000\u0000\u0000\u027e\u027f\u0005\u001e\u0000"+
		"\u0000\u027f\u0280\u0005<\u0000\u0000\u0280\u0281\u0005\f\u0000\u0000"+
		"\u0281\u0282\u0005#\u0000\u0000\u0282\u0283\u0003\u0006\u0003\u0000\u0283"+
		"\u0284\u0006!\uffff\uffff\u0000\u0284\u0285\u0005!\u0000\u0000\u0285\u0286"+
		"\u0005(\u0000\u0000\u0286\u0287\u0005#\u0000\u0000\u0287\u0288\u0003\u0006"+
		"\u0003\u0000\u0288\u0289\u0006!\uffff\uffff\u0000\u0289\u028a\u0005!\u0000"+
		"\u0000\u028a\u028b\u0005\"\u0000\u0000\u028b\u028c\u0005#\u0000\u0000"+
		"\u028c\u028d\u0003\u0006\u0003\u0000\u028d\u028e\u0006!\uffff\uffff\u0000"+
		"\u028e\u028f\u0005!\u0000\u0000\u028f\u0290\u0005,\u0000\u0000\u0290\u0291"+
		"\u0005#\u0000\u0000\u0291\u0292\u0003\u0006\u0003\u0000\u0292\u0293\u0006"+
		"!\uffff\uffff\u0000\u0293\u0294\u0005!\u0000\u0000\u0294\u0295\u0005>"+
		"\u0000\u0000\u0295C\u0001\u0000\u0000\u0000\u0296\u0297\u0003H$\u0000"+
		"\u0297\u0298\u0006\"\uffff\uffff\u0000\u0298\u02a6\u0001\u0000\u0000\u0000"+
		"\u0299\u029a\u0003\u0000\u0000\u0000\u029a\u029b\u0006\"\uffff\uffff\u0000"+
		"\u029b\u02a6\u0001\u0000\u0000\u0000\u029c\u029d\u0003\u0002\u0001\u0000"+
		"\u029d\u029e\u0006\"\uffff\uffff\u0000\u029e\u02a6\u0001\u0000\u0000\u0000"+
		"\u029f\u02a0\u0003\u0004\u0002\u0000\u02a0\u02a1\u0006\"\uffff\uffff\u0000"+
		"\u02a1\u02a6\u0001\u0000\u0000\u0000\u02a2\u02a3\u0003\u0006\u0003\u0000"+
		"\u02a3\u02a4\u0006\"\uffff\uffff\u0000\u02a4\u02a6\u0001\u0000\u0000\u0000"+
		"\u02a5\u0296\u0001\u0000\u0000\u0000\u02a5\u0299\u0001\u0000\u0000\u0000"+
		"\u02a5\u029c\u0001\u0000\u0000\u0000\u02a5\u029f\u0001\u0000\u0000\u0000"+
		"\u02a5\u02a2\u0001\u0000\u0000\u0000\u02a6E\u0001\u0000\u0000\u0000\u02a7"+
		"\u02a8\u0003J%\u0000\u02a8\u02a9\u0006#\uffff\uffff\u0000\u02a9\u02b7"+
		"\u0001\u0000\u0000\u0000\u02aa\u02ab\u0003\u0000\u0000\u0000\u02ab\u02ac"+
		"\u0006#\uffff\uffff\u0000\u02ac\u02b7\u0001\u0000\u0000\u0000\u02ad\u02ae"+
		"\u0003\u0002\u0001\u0000\u02ae\u02af\u0006#\uffff\uffff\u0000\u02af\u02b7"+
		"\u0001\u0000\u0000\u0000\u02b0\u02b1\u0003\u0004\u0002\u0000\u02b1\u02b2"+
		"\u0006#\uffff\uffff\u0000\u02b2\u02b7\u0001\u0000\u0000\u0000\u02b3\u02b4"+
		"\u0003\u0006\u0003\u0000\u02b4\u02b5\u0006#\uffff\uffff\u0000\u02b5\u02b7"+
		"\u0001\u0000\u0000\u0000\u02b6\u02a7\u0001\u0000\u0000\u0000\u02b6\u02aa"+
		"\u0001\u0000\u0000\u0000\u02b6\u02ad\u0001\u0000\u0000\u0000\u02b6\u02b0"+
		"\u0001\u0000\u0000\u0000\u02b6\u02b3\u0001\u0000\u0000\u0000\u02b7G\u0001"+
		"\u0000\u0000\u0000\u02b8\u02b9\u0003\u0018\f\u0000\u02b9\u02ba\u0006$"+
		"\uffff\uffff\u0000\u02ba\u02d1\u0001\u0000\u0000\u0000\u02bb\u02bc\u0003"+
		"\u001c\u000e\u0000\u02bc\u02bd\u0006$\uffff\uffff\u0000\u02bd\u02d1\u0001"+
		"\u0000\u0000\u0000\u02be\u02bf\u0003\u001e\u000f\u0000\u02bf\u02c0\u0006"+
		"$\uffff\uffff\u0000\u02c0\u02d1\u0001\u0000\u0000\u0000\u02c1\u02c2\u0003"+
		"\u001a\r\u0000\u02c2\u02c3\u0006$\uffff\uffff\u0000\u02c3\u02d1\u0001"+
		"\u0000\u0000\u0000\u02c4\u02c5\u0003\b\u0004\u0000\u02c5\u02c6\u0006$"+
		"\uffff\uffff\u0000\u02c6\u02d1\u0001\u0000\u0000\u0000\u02c7\u02c8\u0003"+
		"\f\u0006\u0000\u02c8\u02c9\u0006$\uffff\uffff\u0000\u02c9\u02d1\u0001"+
		"\u0000\u0000\u0000\u02ca\u02cb\u0003\u0010\b\u0000\u02cb\u02cc\u0006$"+
		"\uffff\uffff\u0000\u02cc\u02d1\u0001\u0000\u0000\u0000\u02cd\u02ce\u0003"+
		"\u0014\n\u0000\u02ce\u02cf\u0006$\uffff\uffff\u0000\u02cf\u02d1\u0001"+
		"\u0000\u0000\u0000\u02d0\u02b8\u0001\u0000\u0000\u0000\u02d0\u02bb\u0001"+
		"\u0000\u0000\u0000\u02d0\u02be\u0001\u0000\u0000\u0000\u02d0\u02c1\u0001"+
		"\u0000\u0000\u0000\u02d0\u02c4\u0001\u0000\u0000\u0000\u02d0\u02c7\u0001"+
		"\u0000\u0000\u0000\u02d0\u02ca\u0001\u0000\u0000\u0000\u02d0\u02cd\u0001"+
		"\u0000\u0000\u0000\u02d1I\u0001\u0000\u0000\u0000\u02d2\u02d3\u0003\n"+
		"\u0005\u0000\u02d3\u02d4\u0006%\uffff\uffff\u0000\u02d4\u02df\u0001\u0000"+
		"\u0000\u0000\u02d5\u02d6\u0003\u000e\u0007\u0000\u02d6\u02d7\u0006%\uffff"+
		"\uffff\u0000\u02d7\u02df\u0001\u0000\u0000\u0000\u02d8\u02d9\u0003\u0012"+
		"\t\u0000\u02d9\u02da\u0006%\uffff\uffff\u0000\u02da\u02df\u0001\u0000"+
		"\u0000\u0000\u02db\u02dc\u0003\u0016\u000b\u0000\u02dc\u02dd\u0006%\uffff"+
		"\uffff\u0000\u02dd\u02df\u0001\u0000\u0000\u0000\u02de\u02d2\u0001\u0000"+
		"\u0000\u0000\u02de\u02d5\u0001\u0000\u0000\u0000\u02de\u02d8\u0001\u0000"+
		"\u0000\u0000\u02de\u02db\u0001\u0000\u0000\u0000\u02dfK\u0001\u0000\u0000"+
		"\u0000\u02e0\u02e1\u0003&\u0013\u0000\u02e1\u02e2\u0006&\uffff\uffff\u0000"+
		"\u02e2\u02e7\u0001\u0000\u0000\u0000\u02e3\u02e4\u0003N\'\u0000\u02e4"+
		"\u02e5\u0006&\uffff\uffff\u0000\u02e5\u02e7\u0001\u0000\u0000\u0000\u02e6"+
		"\u02e0\u0001\u0000\u0000\u0000\u02e6\u02e3\u0001\u0000\u0000\u0000\u02e7"+
		"M\u0001\u0000\u0000\u0000\u02e8\u02e9\u0003(\u0014\u0000\u02e9\u02ea\u0006"+
		"\'\uffff\uffff\u0000\u02eaO\u0001\u0000\u0000\u0000\u02eb\u02ec\u0003"+
		"0\u0018\u0000\u02ec\u02ed\u0006(\uffff\uffff\u0000\u02ed\u02fe\u0001\u0000"+
		"\u0000\u0000\u02ee\u02ef\u00032\u0019\u0000\u02ef\u02f0\u0006(\uffff\uffff"+
		"\u0000\u02f0\u02fe\u0001\u0000\u0000\u0000\u02f1\u02f2\u0003<\u001e\u0000"+
		"\u02f2\u02f3\u0006(\uffff\uffff\u0000\u02f3\u02fe\u0001\u0000\u0000\u0000"+
		"\u02f4\u02f5\u0003@ \u0000\u02f5\u02f6\u0006(\uffff\uffff\u0000\u02f6"+
		"\u02fe\u0001\u0000\u0000\u0000\u02f7\u02f8\u0003B!\u0000\u02f8\u02f9\u0006"+
		"(\uffff\uffff\u0000\u02f9\u02fe\u0001\u0000\u0000\u0000\u02fa\u02fb\u0003"+
		"R)\u0000\u02fb\u02fc\u0006(\uffff\uffff\u0000\u02fc\u02fe\u0001\u0000"+
		"\u0000\u0000\u02fd\u02eb\u0001\u0000\u0000\u0000\u02fd\u02ee\u0001\u0000"+
		"\u0000\u0000\u02fd\u02f1\u0001\u0000\u0000\u0000\u02fd\u02f4\u0001\u0000"+
		"\u0000\u0000\u02fd\u02f7\u0001\u0000\u0000\u0000\u02fd\u02fa\u0001\u0000"+
		"\u0000\u0000\u02feQ\u0001\u0000\u0000\u0000\u02ff\u0300\u00034\u001a\u0000"+
		"\u0300\u0301\u0006)\uffff\uffff\u0000\u0301\u0309\u0001\u0000\u0000\u0000"+
		"\u0302\u0303\u00036\u001b\u0000\u0303\u0304\u0006)\uffff\uffff\u0000\u0304"+
		"\u0309\u0001\u0000\u0000\u0000\u0305\u0306\u00038\u001c\u0000\u0306\u0307"+
		"\u0006)\uffff\uffff\u0000\u0307\u0309\u0001\u0000\u0000\u0000\u0308\u02ff"+
		"\u0001\u0000\u0000\u0000\u0308\u0302\u0001\u0000\u0000\u0000\u0308\u0305"+
		"\u0001\u0000\u0000\u0000\u0309S\u0001\u0000\u0000\u0000\u030a\u030b\u0004"+
		"*\n\u0000\u030b\u030c\u0005K\u0000\u0000\u030cU\u0001\u0000\u0000\u0000"+
		"\u030d\u030e\u0004+\u000b\u0000\u030e\u030f\u0005K\u0000\u0000\u030fW"+
		"\u0001\u0000\u0000\u0000\u0310\u0311\u0004,\f\u0000\u0311\u0312\u0005"+
		"K\u0000\u0000\u0312Y\u0001\u0000\u0000\u0000\u0313\u0314\u0004-\r\u0000"+
		"\u0314\u0315\u0005K\u0000\u0000\u0315[\u0001\u0000\u0000\u0000\'bu}\u0088"+
		"\u0090\u0092\u009e\u00ad\u00b9\u00bb\u00d6\u00ec\u00fa\u010e\u0119\u0127"+
		"\u015f\u0162\u01a1\u01a4\u01b3\u01b6\u01ba\u01ee\u01f1\u020c\u020f\u0232"+
		"\u0235\u0244\u025d\u0260\u02a5\u02b6\u02d0\u02de\u02e6\u02fd\u0308";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
