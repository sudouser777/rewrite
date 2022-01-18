/*
 * Copyright 2021 the original author or authors.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * https://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.openrewrite.json.internal.grammar;
// Generated from /Users/pat/dev/openrewrite/rewrite/rewrite-json/src/main/antlr/JsonPathLexer.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JsonPathLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
			new PredictionContextCache();
	public static final int
			StringLiteral=1, NumericLiteral=2, AT=3, DOT_DOT=4, DOT=5, ROOT=6, WILDCARD=7,
			AND=8, EQ=9, NE=10, MATCHES=11, TRUE=12, FALSE=13, NULL=14, LBRACE=15,
			RBRACE=16, LBRACK=17, RBRACK=18, COLON=19, COMMA=20, LPAREN=21, RPAREN=22,
			QUESTION=23, Identifier=24, WS=25, UTF_8_BOM=26;
	public static String[] channelNames = {
			"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
			"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
				"StringLiteral", "EscapeSequence", "UNICODE", "HexDigit", "SAFECODEPOINT",
				"NumericLiteral", "ExponentPart", "AT", "DOT_DOT", "DOT", "ROOT", "WILDCARD",
				"AND", "EQ", "NE", "MATCHES", "TRUE", "FALSE", "NULL", "LBRACE", "RBRACE",
				"LBRACK", "RBRACK", "COLON", "COMMA", "LPAREN", "RPAREN", "QUESTION",
				"Identifier", "WS", "UTF_8_BOM"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
				null, null, null, "'@'", "'..'", "'.'", "'$'", "'*'", "'&&'", "'=='",
				"'!='", "'=~'", "'true'", "'false'", "'null'", "'{'", "'}'", "'['", "']'",
				"':'", "','", "'('", "')'", "'?'", null, null, "'\uFEFF'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
				null, "StringLiteral", "NumericLiteral", "AT", "DOT_DOT", "DOT", "ROOT",
				"WILDCARD", "AND", "EQ", "NE", "MATCHES", "TRUE", "FALSE", "NULL", "LBRACE",
				"RBRACE", "LBRACK", "RBRACK", "COLON", "COMMA", "LPAREN", "RPAREN", "QUESTION",
				"Identifier", "WS", "UTF_8_BOM"
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


	public JsonPathLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "JsonPathLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
			"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\34\u00d2\b\1\4\2"+
					"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
					"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
					"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
					"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
					" \3\2\3\2\3\2\7\2E\n\2\f\2\16\2H\13\2\3\2\3\2\3\2\3\2\7\2N\n\2\f\2\16"+
					"\2Q\13\2\3\2\5\2T\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
					"\3\3\3\3\3\3\3\3\3\3\3\3\5\3h\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6"+
					"\3\6\3\7\5\7u\n\7\3\7\6\7x\n\7\r\7\16\7y\3\7\5\7}\n\7\3\b\3\b\5\b\u0081"+
					"\n\b\3\b\6\b\u0084\n\b\r\b\16\b\u0085\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3"+
					"\f\3\f\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21"+
					"\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24"+
					"\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32"+
					"\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\7\36\u00c3\n\36\f\36\16"+
					"\36\u00c6\13\36\3\37\6\37\u00c9\n\37\r\37\16\37\u00ca\3\37\3\37\3 \3 "+
					"\3 \3 \4FO\2!\3\3\5\2\7\2\t\2\13\2\r\4\17\2\21\5\23\6\25\7\27\b\31\t\33"+
					"\n\35\13\37\f!\r#\16%\17\'\20)\21+\22-\23/\24\61\25\63\26\65\27\67\30"+
					"9\31;\32=\33?\34\3\2\13\7\2$$^^ppttvv\5\2\62;CHch\5\2\2!$$^^\3\2\62;\4"+
					"\2GGgg\4\2--//\5\2C\\aac|\7\2//\62;C\\aac|\5\2\13\f\16\17\"\"\2\u00da"+
					"\2\3\3\2\2\2\2\r\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
					"\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2"+
					"\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2"+
					"/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2"+
					"\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\3S\3\2\2\2\5g\3\2\2\2\7i\3\2\2\2\t"+
					"o\3\2\2\2\13q\3\2\2\2\rt\3\2\2\2\17~\3\2\2\2\21\u0087\3\2\2\2\23\u0089"+
					"\3\2\2\2\25\u008c\3\2\2\2\27\u008e\3\2\2\2\31\u0090\3\2\2\2\33\u0092\3"+
					"\2\2\2\35\u0095\3\2\2\2\37\u0098\3\2\2\2!\u009b\3\2\2\2#\u009e\3\2\2\2"+
					"%\u00a3\3\2\2\2\'\u00a9\3\2\2\2)\u00ae\3\2\2\2+\u00b0\3\2\2\2-\u00b2\3"+
					"\2\2\2/\u00b4\3\2\2\2\61\u00b6\3\2\2\2\63\u00b8\3\2\2\2\65\u00ba\3\2\2"+
					"\2\67\u00bc\3\2\2\29\u00be\3\2\2\2;\u00c0\3\2\2\2=\u00c8\3\2\2\2?\u00ce"+
					"\3\2\2\2AF\7$\2\2BE\5\5\3\2CE\5\13\6\2DB\3\2\2\2DC\3\2\2\2EH\3\2\2\2F"+
					"G\3\2\2\2FD\3\2\2\2GI\3\2\2\2HF\3\2\2\2IT\7$\2\2JO\7)\2\2KN\5\5\3\2LN"+
					"\5\13\6\2MK\3\2\2\2ML\3\2\2\2NQ\3\2\2\2OP\3\2\2\2OM\3\2\2\2PR\3\2\2\2"+
					"QO\3\2\2\2RT\7)\2\2SA\3\2\2\2SJ\3\2\2\2T\4\3\2\2\2UV\7^\2\2Vh\t\2\2\2"+
					"WX\7^\2\2XY\5\t\5\2YZ\5\t\5\2Z[\5\t\5\2[\\\5\t\5\2\\h\3\2\2\2]^\7^\2\2"+
					"^_\5\t\5\2_`\5\t\5\2`a\5\t\5\2ab\5\t\5\2bc\5\t\5\2cd\5\t\5\2de\5\t\5\2"+
					"ef\5\t\5\2fh\3\2\2\2gU\3\2\2\2gW\3\2\2\2g]\3\2\2\2h\6\3\2\2\2ij\7w\2\2"+
					"jk\5\t\5\2kl\5\t\5\2lm\5\t\5\2mn\5\t\5\2n\b\3\2\2\2op\t\3\2\2p\n\3\2\2"+
					"\2qr\n\4\2\2r\f\3\2\2\2su\7/\2\2ts\3\2\2\2tu\3\2\2\2uw\3\2\2\2vx\t\5\2"+
					"\2wv\3\2\2\2xy\3\2\2\2yw\3\2\2\2yz\3\2\2\2z|\3\2\2\2{}\5\17\b\2|{\3\2"+
					"\2\2|}\3\2\2\2}\16\3\2\2\2~\u0080\t\6\2\2\177\u0081\t\7\2\2\u0080\177"+
					"\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0083\3\2\2\2\u0082\u0084\t\5\2\2\u0083"+
					"\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2"+
					"\2\2\u0086\20\3\2\2\2\u0087\u0088\7B\2\2\u0088\22\3\2\2\2\u0089\u008a"+
					"\7\60\2\2\u008a\u008b\7\60\2\2\u008b\24\3\2\2\2\u008c\u008d\7\60\2\2\u008d"+
					"\26\3\2\2\2\u008e\u008f\7&\2\2\u008f\30\3\2\2\2\u0090\u0091\7,\2\2\u0091"+
					"\32\3\2\2\2\u0092\u0093\7(\2\2\u0093\u0094\7(\2\2\u0094\34\3\2\2\2\u0095"+
					"\u0096\7?\2\2\u0096\u0097\7?\2\2\u0097\36\3\2\2\2\u0098\u0099\7#\2\2\u0099"+
					"\u009a\7?\2\2\u009a \3\2\2\2\u009b\u009c\7?\2\2\u009c\u009d\7\u0080\2"+
					"\2\u009d\"\3\2\2\2\u009e\u009f\7v\2\2\u009f\u00a0\7t\2\2\u00a0\u00a1\7"+
					"w\2\2\u00a1\u00a2\7g\2\2\u00a2$\3\2\2\2\u00a3\u00a4\7h\2\2\u00a4\u00a5"+
					"\7c\2\2\u00a5\u00a6\7n\2\2\u00a6\u00a7\7u\2\2\u00a7\u00a8\7g\2\2\u00a8"+
					"&\3\2\2\2\u00a9\u00aa\7p\2\2\u00aa\u00ab\7w\2\2\u00ab\u00ac\7n\2\2\u00ac"+
					"\u00ad\7n\2\2\u00ad(\3\2\2\2\u00ae\u00af\7}\2\2\u00af*\3\2\2\2\u00b0\u00b1"+
					"\7\177\2\2\u00b1,\3\2\2\2\u00b2\u00b3\7]\2\2\u00b3.\3\2\2\2\u00b4\u00b5"+
					"\7_\2\2\u00b5\60\3\2\2\2\u00b6\u00b7\7<\2\2\u00b7\62\3\2\2\2\u00b8\u00b9"+
					"\7.\2\2\u00b9\64\3\2\2\2\u00ba\u00bb\7*\2\2\u00bb\66\3\2\2\2\u00bc\u00bd"+
					"\7+\2\2\u00bd8\3\2\2\2\u00be\u00bf\7A\2\2\u00bf:\3\2\2\2\u00c0\u00c4\t"+
					"\b\2\2\u00c1\u00c3\t\t\2\2\u00c2\u00c1\3\2\2\2\u00c3\u00c6\3\2\2\2\u00c4"+
					"\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5<\3\2\2\2\u00c6\u00c4\3\2\2\2"+
					"\u00c7\u00c9\t\n\2\2\u00c8\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00c8"+
					"\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00cd\b\37\2\2"+
					"\u00cd>\3\2\2\2\u00ce\u00cf\7\uff01\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d1"+
					"\b \2\2\u00d1@\3\2\2\2\20\2DFMOSgty|\u0080\u0085\u00c4\u00ca\3\b\2\2";
	public static final ATN _ATN =
			new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}