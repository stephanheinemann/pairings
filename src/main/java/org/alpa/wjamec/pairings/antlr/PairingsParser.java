/*
 * Copyright © 2024, Stephan Heinemann
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *     * Redistributions of source code must retain the above copyright
 *       notice, this list of conditions and the following disclaimer.
 *     * Redistributions in binary form must reproduce the above copyright
 *       notice, this list of conditions and the following disclaimer in the
 *       documentation and/or other materials provided with the distribution.
 *     * Neither the name of the <organization> nor the
 *       names of its contributors may be used to endorse or promote products
 *       derived from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL <COPYRIGHT HOLDER> BE LIABLE FOR ANY
 * DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
// Generated from Pairings.g4 by ANTLR 4.13.1
package org.alpa.wjamec.pairings.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class PairingsParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		OPAR=1, CPAR=2, OBRK=3, CBRK=4, ODQT=5, CDQT=6, SLASH=7, DASH=8, TWO_DASHES=9, 
		FOUR_DASHES=10, DASHES=11, TITLE_SEPARATOR=12, UNDERLINE=13, DOT=14, COMMA=15, 
		COLON=16, ADD=17, ASTERISK=18, TWICE=19, DOLLAR=20, CAPITAL_LETTER=21, 
		LETTER=22, DAYS_OF_WEEK=23, WEEKDAY=24, MONTH=25, LONG_MONTH=26, NAT=27, 
		NATREAL=28, HOURS=29, MINUTES=30, TIME=31, DURATION=32, REPORT=33, RELEASE=34, 
		TBD=35, GROUND=36, BASE=37, BASE_IATA=38, AIRPORT_IATA=39, PAIRING_ID=40, 
		PAIRING_ANNOTATION=41, CREDIT_ANNOTATION=42, TRIP=43, TABLE_HEADER=44, 
		START=45, EFFECTIVE=46, EXCEPTIONS=47, NO_EXCEPTIONS=48, CHECKIN_DUTY=49, 
		DEADHEAD=50, AIRLINE=51, AIRLINE_IATA=52, AIRCRAFT=53, HOTEL=54, TAFB=55, 
		CREDIT=56, PERDIEM=57, WORD=58, WS=59;
	public static final int
		RULE_pairingsDocument = 0, RULE_titlePage = 1, RULE_title = 2, RULE_longMonth = 3, 
		RULE_year = 4, RULE_pairings = 5, RULE_pairing = 6, RULE_header = 7, RULE_headline = 8, 
		RULE_tableHeader = 9, RULE_preliminaryHeadline = 10, RULE_finalHeadline = 11, 
		RULE_commonHeadline = 12, RULE_base = 13, RULE_baseIata = 14, RULE_tripNumber = 15, 
		RULE_pairingId = 16, RULE_pairingAnnotation = 17, RULE_crew = 18, RULE_captains = 19, 
		RULE_firstOfficers = 20, RULE_flightAttendants = 21, RULE_extraFlightAttendants = 22, 
		RULE_daysOfWeek = 23, RULE_effectiveness = 24, RULE_period = 25, RULE_month = 26, 
		RULE_dayOfMonth = 27, RULE_daysOfMonth = 28, RULE_dayToMonth = 29, RULE_exceptions = 30, 
		RULE_withExceptions = 31, RULE_withoutExceptions = 32, RULE_contents = 33, 
		RULE_content = 34, RULE_calendarWeek = 35, RULE_calendarMonthLetter = 36, 
		RULE_calendarDaysOfMonth = 37, RULE_calendarDayOfMonth = 38, RULE_contentSeparator = 39, 
		RULE_start = 40, RULE_checkin = 41, RULE_report = 42, RULE_checkinDuty = 43, 
		RULE_checkout = 44, RULE_release = 45, RULE_checkoutDuty = 46, RULE_leg = 47, 
		RULE_flightLeg = 48, RULE_groundLeg = 49, RULE_layover = 50, RULE_accommodation = 51, 
		RULE_transportation = 52, RULE_layoverDurations = 53, RULE_phone = 54, 
		RULE_flight = 55, RULE_ground = 56, RULE_deadhead = 57, RULE_airline = 58, 
		RULE_aircraft = 59, RULE_origin = 60, RULE_destination = 61, RULE_out = 62, 
		RULE_in = 63, RULE_block = 64, RULE_tog = 65, RULE_credit = 66, RULE_creditAnnotation = 67, 
		RULE_layoverDuration = 68, RULE_transportationDuration = 69, RULE_accommodationDuration = 70, 
		RULE_hours = 71, RULE_time = 72, RULE_duration = 73, RULE_dutyDay = 74, 
		RULE_weekday = 75, RULE_dayOfDuty = 76, RULE_footer = 77, RULE_footerSeparator = 78, 
		RULE_summary = 79, RULE_tafbSummary = 80, RULE_creditSummary = 81, RULE_perdiemSummary = 82;
	private static String[] makeRuleNames() {
		return new String[] {
			"pairingsDocument", "titlePage", "title", "longMonth", "year", "pairings", 
			"pairing", "header", "headline", "tableHeader", "preliminaryHeadline", 
			"finalHeadline", "commonHeadline", "base", "baseIata", "tripNumber", 
			"pairingId", "pairingAnnotation", "crew", "captains", "firstOfficers", 
			"flightAttendants", "extraFlightAttendants", "daysOfWeek", "effectiveness", 
			"period", "month", "dayOfMonth", "daysOfMonth", "dayToMonth", "exceptions", 
			"withExceptions", "withoutExceptions", "contents", "content", "calendarWeek", 
			"calendarMonthLetter", "calendarDaysOfMonth", "calendarDayOfMonth", "contentSeparator", 
			"start", "checkin", "report", "checkinDuty", "checkout", "release", "checkoutDuty", 
			"leg", "flightLeg", "groundLeg", "layover", "accommodation", "transportation", 
			"layoverDurations", "phone", "flight", "ground", "deadhead", "airline", 
			"aircraft", "origin", "destination", "out", "in", "block", "tog", "credit", 
			"creditAnnotation", "layoverDuration", "transportationDuration", "accommodationDuration", 
			"hours", "time", "duration", "dutyDay", "weekday", "dayOfDuty", "footer", 
			"footerSeparator", "summary", "tafbSummary", "creditSummary", "perdiemSummary"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'['", "']'", null, null, "'/'", "'-'", "'--'", "'----'", 
			null, "'_______________________________________________________________________________________________________________________'", 
			"'____________________________________________________________________________________________________'", 
			"'.'", "','", "':'", "'+'", "'*'", "'*2'", "'$'", null, null, null, null, 
			null, null, null, null, null, null, null, null, "'RPT'", "'RLS'", "'TBD'", 
			null, null, null, null, null, null, null, "'TRIP #'", "'MO TU WE TH FR SA SU DAY FLT# DEP ARR DEP ARR BLK TOG DUTY CREDIT LO A/C CREW COMP'", 
			"'----------- --- --- ----- ----- ----- ----- ----- --------- ----- --- ---------'", 
			"'effective'", "'except'", "'no exceptions.'", null, null, null, null, 
			null, null, "'TAFB'", "'Credit Time'", "'PERDIEM'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "OPAR", "CPAR", "OBRK", "CBRK", "ODQT", "CDQT", "SLASH", "DASH", 
			"TWO_DASHES", "FOUR_DASHES", "DASHES", "TITLE_SEPARATOR", "UNDERLINE", 
			"DOT", "COMMA", "COLON", "ADD", "ASTERISK", "TWICE", "DOLLAR", "CAPITAL_LETTER", 
			"LETTER", "DAYS_OF_WEEK", "WEEKDAY", "MONTH", "LONG_MONTH", "NAT", "NATREAL", 
			"HOURS", "MINUTES", "TIME", "DURATION", "REPORT", "RELEASE", "TBD", "GROUND", 
			"BASE", "BASE_IATA", "AIRPORT_IATA", "PAIRING_ID", "PAIRING_ANNOTATION", 
			"CREDIT_ANNOTATION", "TRIP", "TABLE_HEADER", "START", "EFFECTIVE", "EXCEPTIONS", 
			"NO_EXCEPTIONS", "CHECKIN_DUTY", "DEADHEAD", "AIRLINE", "AIRLINE_IATA", 
			"AIRCRAFT", "HOTEL", "TAFB", "CREDIT", "PERDIEM", "WORD", "WS"
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
	public String getGrammarFileName() { return "Pairings.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PairingsParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PairingsDocumentContext extends ParserRuleContext {
		public TitlePageContext titlePage() {
			return getRuleContext(TitlePageContext.class,0);
		}
		public PairingsContext pairings() {
			return getRuleContext(PairingsContext.class,0);
		}
		public PairingsDocumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pairingsDocument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PairingsListener ) ((PairingsListener)listener).enterPairingsDocument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PairingsListener ) ((PairingsListener)listener).exitPairingsDocument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PairingsVisitor ) return ((PairingsVisitor<? extends T>)visitor).visitPairingsDocument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PairingsDocumentContext pairingsDocument() throws RecognitionException {
		PairingsDocumentContext _localctx = new PairingsDocumentContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_pairingsDocument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			titlePage();
			setState(167);
			pairings();
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
	public static class TitlePageContext extends ParserRuleContext {
		public TitleContext title() {
			return getRuleContext(TitleContext.class,0);
		}
		public TerminalNode TITLE_SEPARATOR() { return getToken(PairingsParser.TITLE_SEPARATOR, 0); }
		public TitlePageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_titlePage; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PairingsListener ) ((PairingsListener)listener).enterTitlePage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PairingsListener ) ((PairingsListener)listener).exitTitlePage(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PairingsVisitor ) return ((PairingsVisitor<? extends T>)visitor).visitTitlePage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TitlePageContext titlePage() throws RecognitionException {
		TitlePageContext _localctx = new TitlePageContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_titlePage);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			title();
			setState(170);
			match(TITLE_SEPARATOR);
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
	public static class TitleContext extends ParserRuleContext {
		public YearContext year() {
			return getRuleContext(YearContext.class,0);
		}
		public MonthContext month() {
			return getRuleContext(MonthContext.class,0);
		}
		public LongMonthContext longMonth() {
			return getRuleContext(LongMonthContext.class,0);
		}
		public TitleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_title; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PairingsListener ) ((PairingsListener)listener).enterTitle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PairingsListener ) ((PairingsListener)listener).exitTitle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PairingsVisitor ) return ((PairingsVisitor<? extends T>)visitor).visitTitle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TitleContext title() throws RecognitionException {
		TitleContext _localctx = new TitleContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_title);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(172);
					matchWildcard();
					}
					} 
				}
				setState(177);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(180);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MONTH:
				{
				setState(178);
				month();
				}
				break;
			case LONG_MONTH:
				{
				setState(179);
				longMonth();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(182);
			year();
			setState(186);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(183);
					matchWildcard();
					}
					} 
				}
				setState(188);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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
	public static class LongMonthContext extends ParserRuleContext {
		public TerminalNode LONG_MONTH() { return getToken(PairingsParser.LONG_MONTH, 0); }
		public LongMonthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_longMonth; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PairingsListener ) ((PairingsListener)listener).enterLongMonth(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PairingsListener ) ((PairingsListener)listener).exitLongMonth(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PairingsVisitor ) return ((PairingsVisitor<? extends T>)visitor).visitLongMonth(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LongMonthContext longMonth() throws RecognitionException {
		LongMonthContext _localctx = new LongMonthContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_longMonth);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			match(LONG_MONTH);
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
	public static class YearContext extends ParserRuleContext {
		public TerminalNode NAT() { return getToken(PairingsParser.NAT, 0); }
		public YearContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_year; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PairingsListener ) ((PairingsListener)listener).enterYear(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PairingsListener ) ((PairingsListener)listener).exitYear(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PairingsVisitor ) return ((PairingsVisitor<? extends T>)visitor).visitYear(this);
			else return visitor.visitChildren(this);
		}
	}

	public final YearContext year() throws RecognitionException {
		YearContext _localctx = new YearContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_year);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(NAT);
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
	public static class PairingsContext extends ParserRuleContext {
		public List<PairingContext> pairing() {
			return getRuleContexts(PairingContext.class);
		}
		public PairingContext pairing(int i) {
			return getRuleContext(PairingContext.class,i);
		}
		public PairingsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pairings; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PairingsListener ) ((PairingsListener)listener).enterPairings(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PairingsListener ) ((PairingsListener)listener).exitPairings(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PairingsVisitor ) return ((PairingsVisitor<? extends T>)visitor).visitPairings(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PairingsContext pairings() throws RecognitionException {
		PairingsContext _localctx = new PairingsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_pairings);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BASE || _la==TRIP) {
				{
				{
				setState(193);
				pairing();
				}
				}
				setState(198);
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
	public static class PairingContext extends ParserRuleContext {
		public HeaderContext header() {
			return getRuleContext(HeaderContext.class,0);
		}
		public ContentsContext contents() {
			return getRuleContext(ContentsContext.class,0);
		}
		public FooterContext footer() {
			return getRuleContext(FooterContext.class,0);
		}
		public PairingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pairing; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PairingsListener ) ((PairingsListener)listener).enterPairing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PairingsListener ) ((PairingsListener)listener).exitPairing(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PairingsVisitor ) return ((PairingsVisitor<? extends T>)visitor).visitPairing(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PairingContext pairing() throws RecognitionException {
		PairingContext _localctx = new PairingContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_pairing);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			header();
			setState(200);
			contents();
			setState(201);
			footer();
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
	public static class HeaderContext extends ParserRuleContext {
		public HeadlineContext headline() {
			return getRuleContext(HeadlineContext.class,0);
		}
		public TableHeaderContext tableHeader() {
			return getRuleContext(TableHeaderContext.class,0);
		}
		public HeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PairingsListener ) ((PairingsListener)listener).enterHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PairingsListener ) ((PairingsListener)listener).exitHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PairingsVisitor ) return ((PairingsVisitor<? extends T>)visitor).visitHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeaderContext header() throws RecognitionException {
		HeaderContext _localctx = new HeaderContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_header);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			headline();
			setState(204);
			tableHeader();
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
	public static class HeadlineContext extends ParserRuleContext {
		public PreliminaryHeadlineContext preliminaryHeadline() {
			return getRuleContext(PreliminaryHeadlineContext.class,0);
		}
		public FinalHeadlineContext finalHeadline() {
			return getRuleContext(FinalHeadlineContext.class,0);
		}
		public HeadlineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_headline; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PairingsListener ) ((PairingsListener)listener).enterHeadline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PairingsListener ) ((PairingsListener)listener).exitHeadline(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PairingsVisitor ) return ((PairingsVisitor<? extends T>)visitor).visitHeadline(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeadlineContext headline() throws RecognitionException {
		HeadlineContext _localctx = new HeadlineContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_headline);
		try {
			setState(208);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(206);
				preliminaryHeadline();
				}
				break;
			case TRIP:
				enterOuterAlt(_localctx, 2);
				{
				setState(207);
				finalHeadline();
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
	public static class TableHeaderContext extends ParserRuleContext {
		public TerminalNode TABLE_HEADER() { return getToken(PairingsParser.TABLE_HEADER, 0); }
		public TableHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableHeader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PairingsListener ) ((PairingsListener)listener).enterTableHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PairingsListener ) ((PairingsListener)listener).exitTableHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PairingsVisitor ) return ((PairingsVisitor<? extends T>)visitor).visitTableHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableHeaderContext tableHeader() throws RecognitionException {
		TableHeaderContext _localctx = new TableHeaderContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_tableHeader);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(TABLE_HEADER);
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
	public static class PreliminaryHeadlineContext extends ParserRuleContext {
		public BaseContext base() {
			return getRuleContext(BaseContext.class,0);
		}
		public CommonHeadlineContext commonHeadline() {
			return getRuleContext(CommonHeadlineContext.class,0);
		}
		public PreliminaryHeadlineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preliminaryHeadline; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PairingsListener ) ((PairingsListener)listener).enterPreliminaryHeadline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PairingsListener ) ((PairingsListener)listener).exitPreliminaryHeadline(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PairingsVisitor ) return ((PairingsVisitor<? extends T>)visitor).visitPreliminaryHeadline(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PreliminaryHeadlineContext preliminaryHeadline() throws RecognitionException {
		PreliminaryHeadlineContext _localctx = new PreliminaryHeadlineContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_preliminaryHeadline);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			base();
			setState(213);
			commonHeadline();
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
	public static class FinalHeadlineContext extends ParserRuleContext {
		public TripNumberContext tripNumber() {
			return getRuleContext(TripNumberContext.class,0);
		}
		public PairingIdContext pairingId() {
			return getRuleContext(PairingIdContext.class,0);
		}
		public CommonHeadlineContext commonHeadline() {
			return getRuleContext(CommonHeadlineContext.class,0);
		}
		public FinalHeadlineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finalHeadline; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PairingsListener ) ((PairingsListener)listener).enterFinalHeadline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PairingsListener ) ((PairingsListener)listener).exitFinalHeadline(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PairingsVisitor ) return ((PairingsVisitor<? extends T>)visitor).visitFinalHeadline(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FinalHeadlineContext finalHeadline() throws RecognitionException {
		FinalHeadlineContext _localctx = new FinalHeadlineContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_finalHeadline);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			tripNumber();
			setState(216);
			pairingId();
			setState(217);
			commonHeadline();
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
	public static class CommonHeadlineContext extends ParserRuleContext {
		public PairingAnnotationContext pairingAnnotation() {
			return getRuleContext(PairingAnnotationContext.class,0);
		}
		public CrewContext crew() {
			return getRuleContext(CrewContext.class,0);
		}
		public BaseIataContext baseIata() {
			return getRuleContext(BaseIataContext.class,0);
		}
		public DaysOfWeekContext daysOfWeek() {
			return getRuleContext(DaysOfWeekContext.class,0);
		}
		public EffectivenessContext effectiveness() {
			return getRuleContext(EffectivenessContext.class,0);
		}
		public CommonHeadlineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commonHeadline; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PairingsListener ) ((PairingsListener)listener).enterCommonHeadline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PairingsListener ) ((PairingsListener)listener).exitCommonHeadline(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PairingsVisitor ) return ((PairingsVisitor<? extends T>)visitor).visitCommonHeadline(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommonHeadlineContext commonHeadline() throws RecognitionException {
		CommonHeadlineContext _localctx = new CommonHeadlineContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_commonHeadline);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			pairingAnnotation();
			setState(220);
			crew();
			setState(221);
			baseIata();
			setState(222);
			daysOfWeek();
			setState(223);
			effectiveness();
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
	public static class BaseContext extends ParserRuleContext {
		public TerminalNode BASE() { return getToken(PairingsParser.BASE, 0); }
		public BaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_base; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PairingsListener ) ((PairingsListener)listener).enterBase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PairingsListener ) ((PairingsListener)listener).exitBase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PairingsVisitor ) return ((PairingsVisitor<? extends T>)visitor).visitBase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BaseContext base() throws RecognitionException {
		BaseContext _localctx = new BaseContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_base);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			match(BASE);
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
	public static class BaseIataContext extends ParserRuleContext {
		public TerminalNode BASE_IATA() { return getToken(PairingsParser.BASE_IATA, 0); }
		public TerminalNode COLON() { return getToken(PairingsParser.COLON, 0); }
		public BaseIataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_baseIata; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PairingsListener ) ((PairingsListener)listener).enterBaseIata(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PairingsListener ) ((PairingsListener)listener).exitBaseIata(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PairingsVisitor ) return ((PairingsVisitor<? extends T>)visitor).visitBaseIata(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BaseIataContext baseIata() throws RecognitionException {
		BaseIataContext _localctx = new BaseIataContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_baseIata);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			match(BASE_IATA);
			setState(228);
			match(COLON);
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
	public static class TripNumberContext extends ParserRuleContext {
		public TerminalNode TRIP() { return getToken(PairingsParser.TRIP, 0); }
		public TerminalNode NAT() { return getToken(PairingsParser.NAT, 0); }
		public TripNumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tripNumber; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PairingsListener ) ((PairingsListener)listener).enterTripNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PairingsListener ) ((PairingsListener)listener).exitTripNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PairingsVisitor ) return ((PairingsVisitor<? extends T>)visitor).visitTripNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TripNumberContext tripNumber() throws RecognitionException {
		TripNumberContext _localctx = new TripNumberContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_tripNumber);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			match(TRIP);
			setState(231);
			match(NAT);
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
	public static class PairingIdContext extends ParserRuleContext {
		public TerminalNode PAIRING_ID() { return getToken(PairingsParser.PAIRING_ID, 0); }
		public PairingIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pairingId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PairingsListener ) ((PairingsListener)listener).enterPairingId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PairingsListener ) ((PairingsListener)listener).exitPairingId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PairingsVisitor ) return ((PairingsVisitor<? extends T>)visitor).visitPairingId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PairingIdContext pairingId() throws RecognitionException {
		PairingIdContext _localctx = new PairingIdContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_pairingId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			match(PAIRING_ID);
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
	public static class PairingAnnotationContext extends ParserRuleContext {
		public TerminalNode PAIRING_ANNOTATION() { return getToken(PairingsParser.PAIRING_ANNOTATION, 0); }
		public PairingAnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pairingAnnotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PairingsListener ) ((PairingsListener)listener).enterPairingAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PairingsListener ) ((PairingsListener)listener).exitPairingAnnotation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PairingsVisitor ) return ((PairingsVisitor<? extends T>)visitor).visitPairingAnnotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PairingAnnotationContext pairingAnnotation() throws RecognitionException {
		PairingAnnotationContext _localctx = new PairingAnnotationContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_pairingAnnotation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			match(PAIRING_ANNOTATION);
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
	public static class CrewContext extends ParserRuleContext {
		public TerminalNode OBRK() { return getToken(PairingsParser.OBRK, 0); }
		public CaptainsContext captains() {
			return getRuleContext(CaptainsContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(PairingsParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PairingsParser.COMMA, i);
		}
		public FirstOfficersContext firstOfficers() {
			return getRuleContext(FirstOfficersContext.class,0);
		}
		public FlightAttendantsContext flightAttendants() {
			return getRuleContext(FlightAttendantsContext.class,0);
		}
		public ExtraFlightAttendantsContext extraFlightAttendants() {
			return getRuleContext(ExtraFlightAttendantsContext.class,0);
		}
		public TerminalNode CBRK() { return getToken(PairingsParser.CBRK, 0); }
		public CrewContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_crew; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PairingsListener ) ((PairingsListener)listener).enterCrew(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PairingsListener ) ((PairingsListener)listener).exitCrew(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PairingsVisitor ) return ((PairingsVisitor<? extends T>)visitor).visitCrew(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CrewContext crew() throws RecognitionException {
		CrewContext _localctx = new CrewContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_crew);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			match(OBRK);
			setState(238);
			captains();
			setState(239);
			match(COMMA);
			setState(240);
			firstOfficers();
			setState(241);
			match(COMMA);
			setState(242);
			flightAttendants();
			setState(243);
			match(COMMA);
			setState(244);
			extraFlightAttendants();
			setState(245);
			match(CBRK);
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
	public static class CaptainsContext extends ParserRuleContext {
		public TerminalNode NAT() { return getToken(PairingsParser.NAT, 0); }
		public CaptainsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_captains; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PairingsListener ) ((PairingsListener)listener).enterCaptains(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PairingsListener ) ((PairingsListener)listener).exitCaptains(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PairingsVisitor ) return ((PairingsVisitor<? extends T>)visitor).visitCaptains(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaptainsContext captains() throws RecognitionException {
		CaptainsContext _localctx = new CaptainsContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_captains);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			match(NAT);
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
	public static class FirstOfficersContext extends ParserRuleContext {
		public TerminalNode NAT() { return getToken(PairingsParser.NAT, 0); }
		public FirstOfficersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_firstOfficers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PairingsListener ) ((PairingsListener)listener).enterFirstOfficers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PairingsListener ) ((PairingsListener)listener).exitFirstOfficers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PairingsVisitor ) return ((PairingsVisitor<? extends T>)visitor).visitFirstOfficers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FirstOfficersContext firstOfficers() throws RecognitionException {
		FirstOfficersContext _localctx = new FirstOfficersContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_firstOfficers);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			match(NAT);
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
	public static class FlightAttendantsContext extends ParserRuleContext {
		public TerminalNode NAT() { return getToken(PairingsParser.NAT, 0); }
		public FlightAttendantsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flightAttendants; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PairingsListener ) ((PairingsListener)listener).enterFlightAttendants(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PairingsListener ) ((PairingsListener)listener).exitFlightAttendants(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PairingsVisitor ) return ((PairingsVisitor<? extends T>)visitor).visitFlightAttendants(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FlightAttendantsContext flightAttendants() throws RecognitionException {
		FlightAttendantsContext _localctx = new FlightAttendantsContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_flightAttendants);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			match(NAT);
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
	public static class ExtraFlightAttendantsContext extends ParserRuleContext {
		public TerminalNode NAT() { return getToken(PairingsParser.NAT, 0); }
		public ExtraFlightAttendantsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extraFlightAttendants; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PairingsListener ) ((PairingsListener)listener).enterExtraFlightAttendants(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PairingsListener ) ((PairingsListener)listener).exitExtraFlightAttendants(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PairingsVisitor ) return ((PairingsVisitor<? extends T>)visitor).visitExtraFlightAttendants(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExtraFlightAttendantsContext extraFlightAttendants() throws RecognitionException {
		ExtraFlightAttendantsContext _localctx = new ExtraFlightAttendantsContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_extraFlightAttendants);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			match(NAT);
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
	public static class DaysOfWeekContext extends ParserRuleContext {
		public TerminalNode DAYS_OF_WEEK() { return getToken(PairingsParser.DAYS_OF_WEEK, 0); }
		public DaysOfWeekContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_daysOfWeek; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PairingsListener ) ((PairingsListener)listener).enterDaysOfWeek(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PairingsListener ) ((PairingsListener)listener).exitDaysOfWeek(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PairingsVisitor ) return ((PairingsVisitor<? extends T>)visitor).visitDaysOfWeek(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DaysOfWeekContext daysOfWeek() throws RecognitionException {
		DaysOfWeekContext _localctx = new DaysOfWeekContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_daysOfWeek);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			match(DAYS_OF_WEEK);
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
	public static class EffectivenessContext extends ParserRuleContext {
		public TerminalNode EFFECTIVE() { return getToken(PairingsParser.EFFECTIVE, 0); }
		public PeriodContext period() {
			return getRuleContext(PeriodContext.class,0);
		}
		public ExceptionsContext exceptions() {
			return getRuleContext(ExceptionsContext.class,0);
		}
		public EffectivenessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_effectiveness; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PairingsListener ) ((PairingsListener)listener).enterEffectiveness(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PairingsListener ) ((PairingsListener)listener).exitEffectiveness(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PairingsVisitor ) return ((PairingsVisitor<? extends T>)visitor).visitEffectiveness(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EffectivenessContext effectiveness() throws RecognitionException {
		EffectivenessContext _localctx = new EffectivenessContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_effectiveness);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			match(EFFECTIVE);
			setState(258);
			period();
			setState(259);
			exceptions();
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
	public static class PeriodContext extends ParserRuleContext {
		public MonthContext month() {
			return getRuleContext(MonthContext.class,0);
		}
		public DayToMonthContext dayToMonth() {
			return getRuleContext(DayToMonthContext.class,0);
		}
		public DayOfMonthContext dayOfMonth() {
			return getRuleContext(DayOfMonthContext.class,0);
		}
		public PeriodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_period; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PairingsListener ) ((PairingsListener)listener).enterPeriod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PairingsListener ) ((PairingsListener)listener).exitPeriod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PairingsVisitor ) return ((PairingsVisitor<? extends T>)visitor).visitPeriod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PeriodContext period() throws RecognitionException {
		PeriodContext _localctx = new PeriodContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_period);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			month();
			setState(262);
			dayToMonth();
			setState(263);
			dayOfMonth();
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
	public static class MonthContext extends ParserRuleContext {
		public TerminalNode MONTH() { return getToken(PairingsParser.MONTH, 0); }
		public MonthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_month; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PairingsListener ) ((PairingsListener)listener).enterMonth(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PairingsListener ) ((PairingsListener)listener).exitMonth(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PairingsVisitor ) return ((PairingsVisitor<? extends T>)visitor).visitMonth(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MonthContext month() throws RecognitionException {
		MonthContext _localctx = new MonthContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_month);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			match(MONTH);
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
	public static class DayOfMonthContext extends ParserRuleContext {
		public TerminalNode NAT() { return getToken(PairingsParser.NAT, 0); }
		public DayOfMonthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dayOfMonth; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PairingsListener ) ((PairingsListener)listener).enterDayOfMonth(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PairingsListener ) ((PairingsListener)listener).exitDayOfMonth(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PairingsVisitor ) return ((PairingsVisitor<? extends T>)visitor).visitDayOfMonth(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DayOfMonthContext dayOfMonth() throws RecognitionException {
		DayOfMonthContext _localctx = new DayOfMonthContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_dayOfMonth);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			match(NAT);
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
	public static class DaysOfMonthContext extends ParserRuleContext {
		public List<MonthContext> month() {
			return getRuleContexts(MonthContext.class);
		}
		public MonthContext month(int i) {
			return getRuleContext(MonthContext.class,i);
		}
		public List<DayOfMonthContext> dayOfMonth() {
			return getRuleContexts(DayOfMonthContext.class);
		}
		public DayOfMonthContext dayOfMonth(int i) {
			return getRuleContext(DayOfMonthContext.class,i);
		}
		public DaysOfMonthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_daysOfMonth; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PairingsListener ) ((PairingsListener)listener).enterDaysOfMonth(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PairingsListener ) ((PairingsListener)listener).exitDaysOfMonth(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PairingsVisitor ) return ((PairingsVisitor<? extends T>)visitor).visitDaysOfMonth(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DaysOfMonthContext daysOfMonth() throws RecognitionException {
		DaysOfMonthContext _localctx = new DaysOfMonthContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_daysOfMonth);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(269);
				month();
				setState(270);
				dayOfMonth();
				}
				}
				setState(274); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==MONTH );
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
	public static class DayToMonthContext extends ParserRuleContext {
		public DayOfMonthContext dayOfMonth() {
			return getRuleContext(DayOfMonthContext.class,0);
		}
		public TerminalNode DASH() { return getToken(PairingsParser.DASH, 0); }
		public MonthContext month() {
			return getRuleContext(MonthContext.class,0);
		}
		public DayToMonthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dayToMonth; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PairingsListener ) ((PairingsListener)listener).enterDayToMonth(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PairingsListener ) ((PairingsListener)listener).exitDayToMonth(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PairingsVisitor ) return ((PairingsVisitor<? extends T>)visitor).visitDayToMonth(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DayToMonthContext dayToMonth() throws RecognitionException {
		DayToMonthContext _localctx = new DayToMonthContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_dayToMonth);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			dayOfMonth();
			setState(277);
			match(DASH);
			setState(278);
			month();
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
	public static class ExceptionsContext extends ParserRuleContext {
		public WithExceptionsContext withExceptions() {
			return getRuleContext(WithExceptionsContext.class,0);
		}
		public WithoutExceptionsContext withoutExceptions() {
			return getRuleContext(WithoutExceptionsContext.class,0);
		}
		public ExceptionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exceptions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PairingsListener ) ((PairingsListener)listener).enterExceptions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PairingsListener ) ((PairingsListener)listener).exitExceptions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PairingsVisitor ) return ((PairingsVisitor<? extends T>)visitor).visitExceptions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExceptionsContext exceptions() throws RecognitionException {
		ExceptionsContext _localctx = new ExceptionsContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_exceptions);
		try {
			setState(282);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EXCEPTIONS:
				enterOuterAlt(_localctx, 1);
				{
				setState(280);
				withExceptions();
				}
				break;
			case NO_EXCEPTIONS:
				enterOuterAlt(_localctx, 2);
				{
				setState(281);
				withoutExceptions();
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
	public static class WithExceptionsContext extends ParserRuleContext {
		public TerminalNode EXCEPTIONS() { return getToken(PairingsParser.EXCEPTIONS, 0); }
		public DaysOfMonthContext daysOfMonth() {
			return getRuleContext(DaysOfMonthContext.class,0);
		}
		public WithExceptionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_withExceptions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PairingsListener ) ((PairingsListener)listener).enterWithExceptions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PairingsListener ) ((PairingsListener)listener).exitWithExceptions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PairingsVisitor ) return ((PairingsVisitor<? extends T>)visitor).visitWithExceptions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WithExceptionsContext withExceptions() throws RecognitionException {
		WithExceptionsContext _localctx = new WithExceptionsContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_withExceptions);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			match(EXCEPTIONS);
			setState(285);
			daysOfMonth();
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
	public static class WithoutExceptionsContext extends ParserRuleContext {
		public TerminalNode NO_EXCEPTIONS() { return getToken(PairingsParser.NO_EXCEPTIONS, 0); }
		public WithoutExceptionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_withoutExceptions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PairingsListener ) ((PairingsListener)listener).enterWithoutExceptions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PairingsListener ) ((PairingsListener)listener).exitWithoutExceptions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PairingsVisitor ) return ((PairingsVisitor<? extends T>)visitor).visitWithoutExceptions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WithoutExceptionsContext withoutExceptions() throws RecognitionException {
		WithoutExceptionsContext _localctx = new WithoutExceptionsContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_withoutExceptions);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			match(NO_EXCEPTIONS);
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
	public static class ContentsContext extends ParserRuleContext {
		public List<ContentContext> content() {
			return getRuleContexts(ContentContext.class);
		}
		public ContentContext content(int i) {
			return getRuleContext(ContentContext.class,i);
		}
		public ContentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contents; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PairingsListener ) ((PairingsListener)listener).enterContents(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PairingsListener ) ((PairingsListener)listener).exitContents(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PairingsVisitor ) return ((PairingsVisitor<? extends T>)visitor).visitContents(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContentsContext contents() throws RecognitionException {
		ContentsContext _localctx = new ContentsContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_contents);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 28070381056L) != 0)) {
				{
				{
				setState(289);
				content();
				}
				}
				setState(294);
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
	public static class ContentContext extends ParserRuleContext {
		public ContentSeparatorContext contentSeparator() {
			return getRuleContext(ContentSeparatorContext.class,0);
		}
		public CheckinContext checkin() {
			return getRuleContext(CheckinContext.class,0);
		}
		public CheckoutContext checkout() {
			return getRuleContext(CheckoutContext.class,0);
		}
		public LegContext leg() {
			return getRuleContext(LegContext.class,0);
		}
		public CalendarWeekContext calendarWeek() {
			return getRuleContext(CalendarWeekContext.class,0);
		}
		public ContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_content; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PairingsListener ) ((PairingsListener)listener).enterContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PairingsListener ) ((PairingsListener)listener).exitContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PairingsVisitor ) return ((PairingsVisitor<? extends T>)visitor).visitContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContentContext content() throws RecognitionException {
		ContentContext _localctx = new ContentContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_content);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(295);
				calendarWeek();
				}
				break;
			}
			setState(302);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(298);
				contentSeparator();
				}
				break;
			case 2:
				{
				setState(299);
				checkin();
				}
				break;
			case 3:
				{
				setState(300);
				checkout();
				}
				break;
			case 4:
				{
				setState(301);
				leg();
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

	@SuppressWarnings("CheckReturnValue")
	public static class CalendarWeekContext extends ParserRuleContext {
		public CalendarDaysOfMonthContext calendarDaysOfMonth() {
			return getRuleContext(CalendarDaysOfMonthContext.class,0);
		}
		public CalendarMonthLetterContext calendarMonthLetter() {
			return getRuleContext(CalendarMonthLetterContext.class,0);
		}
		public CalendarWeekContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_calendarWeek; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PairingsListener ) ((PairingsListener)listener).enterCalendarWeek(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PairingsListener ) ((PairingsListener)listener).exitCalendarWeek(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PairingsVisitor ) return ((PairingsVisitor<? extends T>)visitor).visitCalendarWeek(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CalendarWeekContext calendarWeek() throws RecognitionException {
		CalendarWeekContext _localctx = new CalendarWeekContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_calendarWeek);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CAPITAL_LETTER) {
				{
				setState(304);
				calendarMonthLetter();
				}
			}

			setState(307);
			calendarDaysOfMonth();
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
	public static class CalendarMonthLetterContext extends ParserRuleContext {
		public TerminalNode CAPITAL_LETTER() { return getToken(PairingsParser.CAPITAL_LETTER, 0); }
		public CalendarMonthLetterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_calendarMonthLetter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PairingsListener ) ((PairingsListener)listener).enterCalendarMonthLetter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PairingsListener ) ((PairingsListener)listener).exitCalendarMonthLetter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PairingsVisitor ) return ((PairingsVisitor<? extends T>)visitor).visitCalendarMonthLetter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CalendarMonthLetterContext calendarMonthLetter() throws RecognitionException {
		CalendarMonthLetterContext _localctx = new CalendarMonthLetterContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_calendarMonthLetter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			match(CAPITAL_LETTER);
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
	public static class CalendarDaysOfMonthContext extends ParserRuleContext {
		public List<CalendarDayOfMonthContext> calendarDayOfMonth() {
			return getRuleContexts(CalendarDayOfMonthContext.class);
		}
		public CalendarDayOfMonthContext calendarDayOfMonth(int i) {
			return getRuleContext(CalendarDayOfMonthContext.class,i);
		}
		public CalendarDaysOfMonthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_calendarDaysOfMonth; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PairingsListener ) ((PairingsListener)listener).enterCalendarDaysOfMonth(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PairingsListener ) ((PairingsListener)listener).exitCalendarDaysOfMonth(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PairingsVisitor ) return ((PairingsVisitor<? extends T>)visitor).visitCalendarDaysOfMonth(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CalendarDaysOfMonthContext calendarDaysOfMonth() throws RecognitionException {
		CalendarDaysOfMonthContext _localctx = new CalendarDaysOfMonthContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_calendarDaysOfMonth);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(312); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(311);
					calendarDayOfMonth();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(314); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
	public static class CalendarDayOfMonthContext extends ParserRuleContext {
		public TerminalNode TWO_DASHES() { return getToken(PairingsParser.TWO_DASHES, 0); }
		public DayOfMonthContext dayOfMonth() {
			return getRuleContext(DayOfMonthContext.class,0);
		}
		public CalendarDayOfMonthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_calendarDayOfMonth; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PairingsListener ) ((PairingsListener)listener).enterCalendarDayOfMonth(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PairingsListener ) ((PairingsListener)listener).exitCalendarDayOfMonth(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PairingsVisitor ) return ((PairingsVisitor<? extends T>)visitor).visitCalendarDayOfMonth(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CalendarDayOfMonthContext calendarDayOfMonth() throws RecognitionException {
		CalendarDayOfMonthContext _localctx = new CalendarDayOfMonthContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_calendarDayOfMonth);
		try {
			setState(318);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TWO_DASHES:
				enterOuterAlt(_localctx, 1);
				{
				setState(316);
				match(TWO_DASHES);
				}
				break;
			case NAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(317);
				dayOfMonth();
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
	public static class ContentSeparatorContext extends ParserRuleContext {
		public TerminalNode FOUR_DASHES() { return getToken(PairingsParser.FOUR_DASHES, 0); }
		public StartContext start() {
			return getRuleContext(StartContext.class,0);
		}
		public LayoverContext layover() {
			return getRuleContext(LayoverContext.class,0);
		}
		public ContentSeparatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contentSeparator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PairingsListener ) ((PairingsListener)listener).enterContentSeparator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PairingsListener ) ((PairingsListener)listener).exitContentSeparator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PairingsVisitor ) return ((PairingsVisitor<? extends T>)visitor).visitContentSeparator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContentSeparatorContext contentSeparator() throws RecognitionException {
		ContentSeparatorContext _localctx = new ContentSeparatorContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_contentSeparator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			match(FOUR_DASHES);
			setState(323);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case START:
				{
				setState(321);
				start();
				}
				break;
			case OPAR:
			case SLASH:
			case DASH:
			case TWO_DASHES:
			case FOUR_DASHES:
			case DASHES:
			case CAPITAL_LETTER:
			case NAT:
			case DURATION:
			case TBD:
			case BASE_IATA:
			case AIRPORT_IATA:
			case HOTEL:
			case WORD:
				{
				setState(322);
				layover();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class StartContext extends ParserRuleContext {
		public TerminalNode START() { return getToken(PairingsParser.START, 0); }
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PairingsListener ) ((PairingsListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PairingsListener ) ((PairingsListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PairingsVisitor ) return ((PairingsVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			match(START);
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
	public static class CheckinContext extends ParserRuleContext {
		public OutContext out() {
			return getRuleContext(OutContext.class,0);
		}
		public TogContext tog() {
			return getRuleContext(TogContext.class,0);
		}
		public ReportContext report() {
			return getRuleContext(ReportContext.class,0);
		}
		public CheckinDutyContext checkinDuty() {
			return getRuleContext(CheckinDutyContext.class,0);
		}
		public CheckinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_checkin; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PairingsListener ) ((PairingsListener)listener).enterCheckin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PairingsListener ) ((PairingsListener)listener).exitCheckin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PairingsVisitor ) return ((PairingsVisitor<? extends T>)visitor).visitCheckin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CheckinContext checkin() throws RecognitionException {
		CheckinContext _localctx = new CheckinContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_checkin);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==REPORT) {
				{
				setState(327);
				report();
				}
			}

			setState(330);
			out();
			setState(331);
			tog();
			setState(333);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CHECKIN_DUTY) {
				{
				setState(332);
				checkinDuty();
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
	public static class ReportContext extends ParserRuleContext {
		public TerminalNode REPORT() { return getToken(PairingsParser.REPORT, 0); }
		public ReportContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_report; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PairingsListener ) ((PairingsListener)listener).enterReport(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PairingsListener ) ((PairingsListener)listener).exitReport(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PairingsVisitor ) return ((PairingsVisitor<? extends T>)visitor).visitReport(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReportContext report() throws RecognitionException {
		ReportContext _localctx = new ReportContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_report);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			match(REPORT);
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
	public static class CheckinDutyContext extends ParserRuleContext {
		public TerminalNode CHECKIN_DUTY() { return getToken(PairingsParser.CHECKIN_DUTY, 0); }
		public CheckinDutyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_checkinDuty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PairingsListener ) ((PairingsListener)listener).enterCheckinDuty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PairingsListener ) ((PairingsListener)listener).exitCheckinDuty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PairingsVisitor ) return ((PairingsVisitor<? extends T>)visitor).visitCheckinDuty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CheckinDutyContext checkinDuty() throws RecognitionException {
		CheckinDutyContext _localctx = new CheckinDutyContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_checkinDuty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			match(CHECKIN_DUTY);
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
	public static class CheckoutContext extends ParserRuleContext {
		public InContext in() {
			return getRuleContext(InContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TogContext tog() {
			return getRuleContext(TogContext.class,0);
		}
		public CheckoutDutyContext checkoutDuty() {
			return getRuleContext(CheckoutDutyContext.class,0);
		}
		public CreditContext credit() {
			return getRuleContext(CreditContext.class,0);
		}
		public ReleaseContext release() {
			return getRuleContext(ReleaseContext.class,0);
		}
		public CheckoutContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_checkout; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PairingsListener ) ((PairingsListener)listener).enterCheckout(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PairingsListener ) ((PairingsListener)listener).exitCheckout(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PairingsVisitor ) return ((PairingsVisitor<? extends T>)visitor).visitCheckout(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CheckoutContext checkout() throws RecognitionException {
		CheckoutContext _localctx = new CheckoutContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_checkout);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RELEASE) {
				{
				setState(339);
				release();
				}
			}

			setState(342);
			in();
			setState(343);
			block();
			setState(344);
			tog();
			setState(345);
			checkoutDuty();
			setState(346);
			credit();
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
	public static class ReleaseContext extends ParserRuleContext {
		public TerminalNode RELEASE() { return getToken(PairingsParser.RELEASE, 0); }
		public ReleaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_release; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PairingsListener ) ((PairingsListener)listener).enterRelease(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PairingsListener ) ((PairingsListener)listener).exitRelease(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PairingsVisitor ) return ((PairingsVisitor<? extends T>)visitor).visitRelease(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReleaseContext release() throws RecognitionException {
		ReleaseContext _localctx = new ReleaseContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_release);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
			match(RELEASE);
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
	public static class CheckoutDutyContext extends ParserRuleContext {
		public DurationContext duration() {
			return getRuleContext(DurationContext.class,0);
		}
		public CheckoutDutyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_checkoutDuty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PairingsListener ) ((PairingsListener)listener).enterCheckoutDuty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PairingsListener ) ((PairingsListener)listener).exitCheckoutDuty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PairingsVisitor ) return ((PairingsVisitor<? extends T>)visitor).visitCheckoutDuty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CheckoutDutyContext checkoutDuty() throws RecognitionException {
		CheckoutDutyContext _localctx = new CheckoutDutyContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_checkoutDuty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			duration();
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
	public static class LegContext extends ParserRuleContext {
		public FlightLegContext flightLeg() {
			return getRuleContext(FlightLegContext.class,0);
		}
		public GroundLegContext groundLeg() {
			return getRuleContext(GroundLegContext.class,0);
		}
		public LegContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PairingsListener ) ((PairingsListener)listener).enterLeg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PairingsListener ) ((PairingsListener)listener).exitLeg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PairingsVisitor ) return ((PairingsVisitor<? extends T>)visitor).visitLeg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LegContext leg() throws RecognitionException {
		LegContext _localctx = new LegContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_leg);
		try {
			setState(354);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(352);
				flightLeg();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(353);
				groundLeg();
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
	public static class FlightLegContext extends ParserRuleContext {
		public DutyDayContext dutyDay() {
			return getRuleContext(DutyDayContext.class,0);
		}
		public FlightContext flight() {
			return getRuleContext(FlightContext.class,0);
		}
		public OriginContext origin() {
			return getRuleContext(OriginContext.class,0);
		}
		public DestinationContext destination() {
			return getRuleContext(DestinationContext.class,0);
		}
		public OutContext out() {
			return getRuleContext(OutContext.class,0);
		}
		public InContext in() {
			return getRuleContext(InContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public CreditContext credit() {
			return getRuleContext(CreditContext.class,0);
		}
		public TogContext tog() {
			return getRuleContext(TogContext.class,0);
		}
		public AircraftContext aircraft() {
			return getRuleContext(AircraftContext.class,0);
		}
		public CrewContext crew() {
			return getRuleContext(CrewContext.class,0);
		}
		public FlightLegContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flightLeg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PairingsListener ) ((PairingsListener)listener).enterFlightLeg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PairingsListener ) ((PairingsListener)listener).exitFlightLeg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PairingsVisitor ) return ((PairingsVisitor<? extends T>)visitor).visitFlightLeg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FlightLegContext flightLeg() throws RecognitionException {
		FlightLegContext _localctx = new FlightLegContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_flightLeg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			dutyDay();
			setState(357);
			flight();
			setState(358);
			origin();
			setState(359);
			destination();
			setState(360);
			out();
			setState(361);
			in();
			setState(362);
			block();
			setState(364);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(363);
				tog();
				}
				break;
			}
			setState(366);
			credit();
			setState(368);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AIRCRAFT) {
				{
				setState(367);
				aircraft();
				}
			}

			setState(371);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OBRK) {
				{
				setState(370);
				crew();
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
	public static class GroundLegContext extends ParserRuleContext {
		public DutyDayContext dutyDay() {
			return getRuleContext(DutyDayContext.class,0);
		}
		public GroundContext ground() {
			return getRuleContext(GroundContext.class,0);
		}
		public OriginContext origin() {
			return getRuleContext(OriginContext.class,0);
		}
		public DestinationContext destination() {
			return getRuleContext(DestinationContext.class,0);
		}
		public OutContext out() {
			return getRuleContext(OutContext.class,0);
		}
		public InContext in() {
			return getRuleContext(InContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public CreditContext credit() {
			return getRuleContext(CreditContext.class,0);
		}
		public GroundLegContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groundLeg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PairingsListener ) ((PairingsListener)listener).enterGroundLeg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PairingsListener ) ((PairingsListener)listener).exitGroundLeg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PairingsVisitor ) return ((PairingsVisitor<? extends T>)visitor).visitGroundLeg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroundLegContext groundLeg() throws RecognitionException {
		GroundLegContext _localctx = new GroundLegContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_groundLeg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
			dutyDay();
			setState(374);
			ground();
			setState(375);
			origin();
			setState(376);
			destination();
			setState(377);
			out();
			setState(378);
			in();
			setState(379);
			block();
			setState(380);
			credit();
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
	public static class LayoverContext extends ParserRuleContext {
		public AccommodationContext accommodation() {
			return getRuleContext(AccommodationContext.class,0);
		}
		public TransportationContext transportation() {
			return getRuleContext(TransportationContext.class,0);
		}
		public LayoverDurationsContext layoverDurations() {
			return getRuleContext(LayoverDurationsContext.class,0);
		}
		public TerminalNode SLASH() { return getToken(PairingsParser.SLASH, 0); }
		public TerminalNode DASH() { return getToken(PairingsParser.DASH, 0); }
		public TerminalNode TWO_DASHES() { return getToken(PairingsParser.TWO_DASHES, 0); }
		public TerminalNode FOUR_DASHES() { return getToken(PairingsParser.FOUR_DASHES, 0); }
		public TerminalNode DASHES() { return getToken(PairingsParser.DASHES, 0); }
		public LayoverContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_layover; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PairingsListener ) ((PairingsListener)listener).enterLayover(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PairingsListener ) ((PairingsListener)listener).exitLayover(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PairingsVisitor ) return ((PairingsVisitor<? extends T>)visitor).visitLayover(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LayoverContext layover() throws RecognitionException {
		LayoverContext _localctx = new LayoverContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_layover);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
			accommodation();
			setState(384);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SLASH) {
				{
				setState(383);
				match(SLASH);
				}
			}

			setState(386);
			transportation();
			setState(388);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3840L) != 0)) {
				{
				setState(387);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3840L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(390);
			layoverDurations();
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
	public static class AccommodationContext extends ParserRuleContext {
		public TerminalNode HOTEL() { return getToken(PairingsParser.HOTEL, 0); }
		public PhoneContext phone() {
			return getRuleContext(PhoneContext.class,0);
		}
		public TerminalNode BASE_IATA() { return getToken(PairingsParser.BASE_IATA, 0); }
		public TerminalNode AIRPORT_IATA() { return getToken(PairingsParser.AIRPORT_IATA, 0); }
		public List<TerminalNode> TBD() { return getTokens(PairingsParser.TBD); }
		public TerminalNode TBD(int i) {
			return getToken(PairingsParser.TBD, i);
		}
		public List<TerminalNode> CAPITAL_LETTER() { return getTokens(PairingsParser.CAPITAL_LETTER); }
		public TerminalNode CAPITAL_LETTER(int i) {
			return getToken(PairingsParser.CAPITAL_LETTER, i);
		}
		public List<TerminalNode> WORD() { return getTokens(PairingsParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(PairingsParser.WORD, i);
		}
		public List<TerminalNode> NAT() { return getTokens(PairingsParser.NAT); }
		public TerminalNode NAT(int i) {
			return getToken(PairingsParser.NAT, i);
		}
		public List<TerminalNode> DASH() { return getTokens(PairingsParser.DASH); }
		public TerminalNode DASH(int i) {
			return getToken(PairingsParser.DASH, i);
		}
		public AccommodationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accommodation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PairingsListener ) ((PairingsListener)listener).enterAccommodation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PairingsListener ) ((PairingsListener)listener).exitAccommodation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PairingsVisitor ) return ((PairingsVisitor<? extends T>)visitor).visitAccommodation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AccommodationContext accommodation() throws RecognitionException {
		AccommodationContext _localctx = new AccommodationContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_accommodation);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(403);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(392);
				_la = _input.LA(1);
				if ( !(_la==BASE_IATA || _la==AIRPORT_IATA) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(394);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(393);
					match(DASH);
					}
					break;
				}
				setState(397);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CAPITAL_LETTER) {
					{
					setState(396);
					match(CAPITAL_LETTER);
					}
				}

				setState(400);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DASH) {
					{
					setState(399);
					match(DASH);
					}
				}

				setState(402);
				match(HOTEL);
				}
				break;
			}
			setState(408);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(405);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 288230410647764992L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					} 
				}
				setState(410);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			}
			setState(412);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(411);
				phone();
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

	@SuppressWarnings("CheckReturnValue")
	public static class TransportationContext extends ParserRuleContext {
		public PhoneContext phone() {
			return getRuleContext(PhoneContext.class,0);
		}
		public List<TerminalNode> BASE_IATA() { return getTokens(PairingsParser.BASE_IATA); }
		public TerminalNode BASE_IATA(int i) {
			return getToken(PairingsParser.BASE_IATA, i);
		}
		public List<TerminalNode> AIRPORT_IATA() { return getTokens(PairingsParser.AIRPORT_IATA); }
		public TerminalNode AIRPORT_IATA(int i) {
			return getToken(PairingsParser.AIRPORT_IATA, i);
		}
		public List<TerminalNode> HOTEL() { return getTokens(PairingsParser.HOTEL); }
		public TerminalNode HOTEL(int i) {
			return getToken(PairingsParser.HOTEL, i);
		}
		public List<TerminalNode> CAPITAL_LETTER() { return getTokens(PairingsParser.CAPITAL_LETTER); }
		public TerminalNode CAPITAL_LETTER(int i) {
			return getToken(PairingsParser.CAPITAL_LETTER, i);
		}
		public List<TerminalNode> WORD() { return getTokens(PairingsParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(PairingsParser.WORD, i);
		}
		public List<TerminalNode> NAT() { return getTokens(PairingsParser.NAT); }
		public TerminalNode NAT(int i) {
			return getToken(PairingsParser.NAT, i);
		}
		public TransportationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transportation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PairingsListener ) ((PairingsListener)listener).enterTransportation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PairingsListener ) ((PairingsListener)listener).exitTransportation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PairingsVisitor ) return ((PairingsVisitor<? extends T>)visitor).visitTransportation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TransportationContext transportation() throws RecognitionException {
		TransportationContext _localctx = new TransportationContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_transportation);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(417);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(414);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 306245599431229440L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					} 
				}
				setState(419);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			}
			setState(421);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPAR || _la==NAT) {
				{
				setState(420);
				phone();
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
	public static class LayoverDurationsContext extends ParserRuleContext {
		public LayoverDurationContext layoverDuration() {
			return getRuleContext(LayoverDurationContext.class,0);
		}
		public TerminalNode OPAR() { return getToken(PairingsParser.OPAR, 0); }
		public TransportationDurationContext transportationDuration() {
			return getRuleContext(TransportationDurationContext.class,0);
		}
		public TerminalNode CPAR() { return getToken(PairingsParser.CPAR, 0); }
		public AccommodationDurationContext accommodationDuration() {
			return getRuleContext(AccommodationDurationContext.class,0);
		}
		public LayoverDurationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_layoverDurations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PairingsListener ) ((PairingsListener)listener).enterLayoverDurations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PairingsListener ) ((PairingsListener)listener).exitLayoverDurations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PairingsVisitor ) return ((PairingsVisitor<? extends T>)visitor).visitLayoverDurations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LayoverDurationsContext layoverDurations() throws RecognitionException {
		LayoverDurationsContext _localctx = new LayoverDurationsContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_layoverDurations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(423);
			layoverDuration();
			setState(428);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPAR) {
				{
				setState(424);
				match(OPAR);
				setState(425);
				transportationDuration();
				setState(426);
				match(CPAR);
				}
			}

			setState(431);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DURATION) {
				{
				setState(430);
				accommodationDuration();
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
	public static class PhoneContext extends ParserRuleContext {
		public List<TerminalNode> NAT() { return getTokens(PairingsParser.NAT); }
		public TerminalNode NAT(int i) {
			return getToken(PairingsParser.NAT, i);
		}
		public TerminalNode OPAR() { return getToken(PairingsParser.OPAR, 0); }
		public TerminalNode CPAR() { return getToken(PairingsParser.CPAR, 0); }
		public List<TerminalNode> DASH() { return getTokens(PairingsParser.DASH); }
		public TerminalNode DASH(int i) {
			return getToken(PairingsParser.DASH, i);
		}
		public PhoneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_phone; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PairingsListener ) ((PairingsListener)listener).enterPhone(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PairingsListener ) ((PairingsListener)listener).exitPhone(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PairingsVisitor ) return ((PairingsVisitor<? extends T>)visitor).visitPhone(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PhoneContext phone() throws RecognitionException {
		PhoneContext _localctx = new PhoneContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_phone);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(434);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPAR) {
				{
				setState(433);
				match(OPAR);
				}
			}

			setState(436);
			match(NAT);
			setState(438);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CPAR) {
				{
				setState(437);
				match(CPAR);
				}
			}

			setState(443);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(440);
					_la = _input.LA(1);
					if ( !(_la==DASH || _la==NAT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					} 
				}
				setState(445);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
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
	public static class FlightContext extends ParserRuleContext {
		public TerminalNode NAT() { return getToken(PairingsParser.NAT, 0); }
		public DeadheadContext deadhead() {
			return getRuleContext(DeadheadContext.class,0);
		}
		public AirlineContext airline() {
			return getRuleContext(AirlineContext.class,0);
		}
		public FlightContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flight; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PairingsListener ) ((PairingsListener)listener).enterFlight(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PairingsListener ) ((PairingsListener)listener).exitFlight(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PairingsVisitor ) return ((PairingsVisitor<? extends T>)visitor).visitFlight(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FlightContext flight() throws RecognitionException {
		FlightContext _localctx = new FlightContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_flight);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(448);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DEADHEAD:
				{
				setState(446);
				deadhead();
				}
				break;
			case AIRLINE:
				{
				setState(447);
				airline();
				}
				break;
			case NAT:
				break;
			default:
				break;
			}
			setState(450);
			match(NAT);
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
	public static class GroundContext extends ParserRuleContext {
		public TerminalNode GROUND() { return getToken(PairingsParser.GROUND, 0); }
		public TerminalNode NAT() { return getToken(PairingsParser.NAT, 0); }
		public GroundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ground; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PairingsListener ) ((PairingsListener)listener).enterGround(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PairingsListener ) ((PairingsListener)listener).exitGround(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PairingsVisitor ) return ((PairingsVisitor<? extends T>)visitor).visitGround(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroundContext ground() throws RecognitionException {
		GroundContext _localctx = new GroundContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_ground);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(452);
			match(GROUND);
			setState(454);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAT) {
				{
				setState(453);
				match(NAT);
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
	public static class DeadheadContext extends ParserRuleContext {
		public TerminalNode DEADHEAD() { return getToken(PairingsParser.DEADHEAD, 0); }
		public DeadheadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deadhead; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PairingsListener ) ((PairingsListener)listener).enterDeadhead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PairingsListener ) ((PairingsListener)listener).exitDeadhead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PairingsVisitor ) return ((PairingsVisitor<? extends T>)visitor).visitDeadhead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeadheadContext deadhead() throws RecognitionException {
		DeadheadContext _localctx = new DeadheadContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_deadhead);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(456);
			match(DEADHEAD);
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
	public static class AirlineContext extends ParserRuleContext {
		public TerminalNode AIRLINE() { return getToken(PairingsParser.AIRLINE, 0); }
		public AirlineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_airline; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PairingsListener ) ((PairingsListener)listener).enterAirline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PairingsListener ) ((PairingsListener)listener).exitAirline(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PairingsVisitor ) return ((PairingsVisitor<? extends T>)visitor).visitAirline(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AirlineContext airline() throws RecognitionException {
		AirlineContext _localctx = new AirlineContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_airline);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(458);
			match(AIRLINE);
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
	public static class AircraftContext extends ParserRuleContext {
		public TerminalNode AIRCRAFT() { return getToken(PairingsParser.AIRCRAFT, 0); }
		public AircraftContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aircraft; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PairingsListener ) ((PairingsListener)listener).enterAircraft(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PairingsListener ) ((PairingsListener)listener).exitAircraft(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PairingsVisitor ) return ((PairingsVisitor<? extends T>)visitor).visitAircraft(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AircraftContext aircraft() throws RecognitionException {
		AircraftContext _localctx = new AircraftContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_aircraft);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(460);
			match(AIRCRAFT);
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
	public static class OriginContext extends ParserRuleContext {
		public TerminalNode BASE_IATA() { return getToken(PairingsParser.BASE_IATA, 0); }
		public TerminalNode AIRPORT_IATA() { return getToken(PairingsParser.AIRPORT_IATA, 0); }
		public OriginContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_origin; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PairingsListener ) ((PairingsListener)listener).enterOrigin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PairingsListener ) ((PairingsListener)listener).exitOrigin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PairingsVisitor ) return ((PairingsVisitor<? extends T>)visitor).visitOrigin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OriginContext origin() throws RecognitionException {
		OriginContext _localctx = new OriginContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_origin);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(462);
			_la = _input.LA(1);
			if ( !(_la==BASE_IATA || _la==AIRPORT_IATA) ) {
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
	public static class DestinationContext extends ParserRuleContext {
		public TerminalNode BASE_IATA() { return getToken(PairingsParser.BASE_IATA, 0); }
		public TerminalNode AIRPORT_IATA() { return getToken(PairingsParser.AIRPORT_IATA, 0); }
		public DestinationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_destination; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PairingsListener ) ((PairingsListener)listener).enterDestination(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PairingsListener ) ((PairingsListener)listener).exitDestination(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PairingsVisitor ) return ((PairingsVisitor<? extends T>)visitor).visitDestination(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DestinationContext destination() throws RecognitionException {
		DestinationContext _localctx = new DestinationContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_destination);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(464);
			_la = _input.LA(1);
			if ( !(_la==BASE_IATA || _la==AIRPORT_IATA) ) {
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
	public static class OutContext extends ParserRuleContext {
		public TimeContext time() {
			return getRuleContext(TimeContext.class,0);
		}
		public OutContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_out; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PairingsListener ) ((PairingsListener)listener).enterOut(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PairingsListener ) ((PairingsListener)listener).exitOut(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PairingsVisitor ) return ((PairingsVisitor<? extends T>)visitor).visitOut(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OutContext out() throws RecognitionException {
		OutContext _localctx = new OutContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_out);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(466);
			time();
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
	public static class InContext extends ParserRuleContext {
		public TimeContext time() {
			return getRuleContext(TimeContext.class,0);
		}
		public InContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_in; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PairingsListener ) ((PairingsListener)listener).enterIn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PairingsListener ) ((PairingsListener)listener).exitIn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PairingsVisitor ) return ((PairingsVisitor<? extends T>)visitor).visitIn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InContext in() throws RecognitionException {
		InContext _localctx = new InContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_in);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(468);
			time();
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
		public DurationContext duration() {
			return getRuleContext(DurationContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PairingsListener ) ((PairingsListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PairingsListener ) ((PairingsListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PairingsVisitor ) return ((PairingsVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(470);
			duration();
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
	public static class TogContext extends ParserRuleContext {
		public DurationContext duration() {
			return getRuleContext(DurationContext.class,0);
		}
		public TerminalNode ASTERISK() { return getToken(PairingsParser.ASTERISK, 0); }
		public TogContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PairingsListener ) ((PairingsListener)listener).enterTog(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PairingsListener ) ((PairingsListener)listener).exitTog(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PairingsVisitor ) return ((PairingsVisitor<? extends T>)visitor).visitTog(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TogContext tog() throws RecognitionException {
		TogContext _localctx = new TogContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_tog);
		try {
			setState(477);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(472);
				duration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(473);
				duration();
				setState(474);
				match(ASTERISK);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(476);
				match(ASTERISK);
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
	public static class CreditContext extends ParserRuleContext {
		public DurationContext duration() {
			return getRuleContext(DurationContext.class,0);
		}
		public CreditAnnotationContext creditAnnotation() {
			return getRuleContext(CreditAnnotationContext.class,0);
		}
		public CreditContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_credit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PairingsListener ) ((PairingsListener)listener).enterCredit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PairingsListener ) ((PairingsListener)listener).exitCredit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PairingsVisitor ) return ((PairingsVisitor<? extends T>)visitor).visitCredit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreditContext credit() throws RecognitionException {
		CreditContext _localctx = new CreditContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_credit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(479);
			duration();
			setState(481);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CREDIT_ANNOTATION) {
				{
				setState(480);
				creditAnnotation();
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
	public static class CreditAnnotationContext extends ParserRuleContext {
		public TerminalNode CREDIT_ANNOTATION() { return getToken(PairingsParser.CREDIT_ANNOTATION, 0); }
		public CreditAnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_creditAnnotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PairingsListener ) ((PairingsListener)listener).enterCreditAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PairingsListener ) ((PairingsListener)listener).exitCreditAnnotation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PairingsVisitor ) return ((PairingsVisitor<? extends T>)visitor).visitCreditAnnotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreditAnnotationContext creditAnnotation() throws RecognitionException {
		CreditAnnotationContext _localctx = new CreditAnnotationContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_creditAnnotation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(483);
			match(CREDIT_ANNOTATION);
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
	public static class LayoverDurationContext extends ParserRuleContext {
		public DurationContext duration() {
			return getRuleContext(DurationContext.class,0);
		}
		public LayoverDurationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_layoverDuration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PairingsListener ) ((PairingsListener)listener).enterLayoverDuration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PairingsListener ) ((PairingsListener)listener).exitLayoverDuration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PairingsVisitor ) return ((PairingsVisitor<? extends T>)visitor).visitLayoverDuration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LayoverDurationContext layoverDuration() throws RecognitionException {
		LayoverDurationContext _localctx = new LayoverDurationContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_layoverDuration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(485);
			duration();
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
	public static class TransportationDurationContext extends ParserRuleContext {
		public DurationContext duration() {
			return getRuleContext(DurationContext.class,0);
		}
		public TerminalNode TWICE() { return getToken(PairingsParser.TWICE, 0); }
		public TransportationDurationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transportationDuration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PairingsListener ) ((PairingsListener)listener).enterTransportationDuration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PairingsListener ) ((PairingsListener)listener).exitTransportationDuration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PairingsVisitor ) return ((PairingsVisitor<? extends T>)visitor).visitTransportationDuration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TransportationDurationContext transportationDuration() throws RecognitionException {
		TransportationDurationContext _localctx = new TransportationDurationContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_transportationDuration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(487);
			duration();
			setState(488);
			match(TWICE);
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
	public static class AccommodationDurationContext extends ParserRuleContext {
		public DurationContext duration() {
			return getRuleContext(DurationContext.class,0);
		}
		public AccommodationDurationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accommodationDuration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PairingsListener ) ((PairingsListener)listener).enterAccommodationDuration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PairingsListener ) ((PairingsListener)listener).exitAccommodationDuration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PairingsVisitor ) return ((PairingsVisitor<? extends T>)visitor).visitAccommodationDuration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AccommodationDurationContext accommodationDuration() throws RecognitionException {
		AccommodationDurationContext _localctx = new AccommodationDurationContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_accommodationDuration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(490);
			duration();
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
	public static class HoursContext extends ParserRuleContext {
		public TerminalNode NATREAL() { return getToken(PairingsParser.NATREAL, 0); }
		public HoursContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hours; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PairingsListener ) ((PairingsListener)listener).enterHours(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PairingsListener ) ((PairingsListener)listener).exitHours(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PairingsVisitor ) return ((PairingsVisitor<? extends T>)visitor).visitHours(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HoursContext hours() throws RecognitionException {
		HoursContext _localctx = new HoursContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_hours);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(492);
			match(NATREAL);
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
	public static class TimeContext extends ParserRuleContext {
		public TerminalNode TIME() { return getToken(PairingsParser.TIME, 0); }
		public TimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_time; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PairingsListener ) ((PairingsListener)listener).enterTime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PairingsListener ) ((PairingsListener)listener).exitTime(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PairingsVisitor ) return ((PairingsVisitor<? extends T>)visitor).visitTime(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TimeContext time() throws RecognitionException {
		TimeContext _localctx = new TimeContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_time);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(494);
			match(TIME);
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
	public static class DurationContext extends ParserRuleContext {
		public TerminalNode DURATION() { return getToken(PairingsParser.DURATION, 0); }
		public DurationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_duration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PairingsListener ) ((PairingsListener)listener).enterDuration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PairingsListener ) ((PairingsListener)listener).exitDuration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PairingsVisitor ) return ((PairingsVisitor<? extends T>)visitor).visitDuration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DurationContext duration() throws RecognitionException {
		DurationContext _localctx = new DurationContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_duration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(496);
			match(DURATION);
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
	public static class DutyDayContext extends ParserRuleContext {
		public DayOfDutyContext dayOfDuty() {
			return getRuleContext(DayOfDutyContext.class,0);
		}
		public WeekdayContext weekday() {
			return getRuleContext(WeekdayContext.class,0);
		}
		public DutyDayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dutyDay; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PairingsListener ) ((PairingsListener)listener).enterDutyDay(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PairingsListener ) ((PairingsListener)listener).exitDutyDay(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PairingsVisitor ) return ((PairingsVisitor<? extends T>)visitor).visitDutyDay(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DutyDayContext dutyDay() throws RecognitionException {
		DutyDayContext _localctx = new DutyDayContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_dutyDay);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(499);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WEEKDAY) {
				{
				setState(498);
				weekday();
				}
			}

			setState(501);
			dayOfDuty();
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
	public static class WeekdayContext extends ParserRuleContext {
		public TerminalNode WEEKDAY() { return getToken(PairingsParser.WEEKDAY, 0); }
		public WeekdayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_weekday; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PairingsListener ) ((PairingsListener)listener).enterWeekday(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PairingsListener ) ((PairingsListener)listener).exitWeekday(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PairingsVisitor ) return ((PairingsVisitor<? extends T>)visitor).visitWeekday(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WeekdayContext weekday() throws RecognitionException {
		WeekdayContext _localctx = new WeekdayContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_weekday);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(503);
			match(WEEKDAY);
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
	public static class DayOfDutyContext extends ParserRuleContext {
		public TerminalNode NAT() { return getToken(PairingsParser.NAT, 0); }
		public DayOfDutyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dayOfDuty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PairingsListener ) ((PairingsListener)listener).enterDayOfDuty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PairingsListener ) ((PairingsListener)listener).exitDayOfDuty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PairingsVisitor ) return ((PairingsVisitor<? extends T>)visitor).visitDayOfDuty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DayOfDutyContext dayOfDuty() throws RecognitionException {
		DayOfDutyContext _localctx = new DayOfDutyContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_dayOfDuty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(505);
			match(NAT);
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
	public static class FooterContext extends ParserRuleContext {
		public List<FooterSeparatorContext> footerSeparator() {
			return getRuleContexts(FooterSeparatorContext.class);
		}
		public FooterSeparatorContext footerSeparator(int i) {
			return getRuleContext(FooterSeparatorContext.class,i);
		}
		public SummaryContext summary() {
			return getRuleContext(SummaryContext.class,0);
		}
		public FooterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_footer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PairingsListener ) ((PairingsListener)listener).enterFooter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PairingsListener ) ((PairingsListener)listener).exitFooter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PairingsVisitor ) return ((PairingsVisitor<? extends T>)visitor).visitFooter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FooterContext footer() throws RecognitionException {
		FooterContext _localctx = new FooterContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_footer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(507);
			footerSeparator();
			setState(508);
			summary();
			setState(509);
			footerSeparator();
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
	public static class FooterSeparatorContext extends ParserRuleContext {
		public TerminalNode UNDERLINE() { return getToken(PairingsParser.UNDERLINE, 0); }
		public FooterSeparatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_footerSeparator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PairingsListener ) ((PairingsListener)listener).enterFooterSeparator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PairingsListener ) ((PairingsListener)listener).exitFooterSeparator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PairingsVisitor ) return ((PairingsVisitor<? extends T>)visitor).visitFooterSeparator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FooterSeparatorContext footerSeparator() throws RecognitionException {
		FooterSeparatorContext _localctx = new FooterSeparatorContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_footerSeparator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(511);
			match(UNDERLINE);
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
	public static class SummaryContext extends ParserRuleContext {
		public TafbSummaryContext tafbSummary() {
			return getRuleContext(TafbSummaryContext.class,0);
		}
		public CreditSummaryContext creditSummary() {
			return getRuleContext(CreditSummaryContext.class,0);
		}
		public PerdiemSummaryContext perdiemSummary() {
			return getRuleContext(PerdiemSummaryContext.class,0);
		}
		public SummaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_summary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PairingsListener ) ((PairingsListener)listener).enterSummary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PairingsListener ) ((PairingsListener)listener).exitSummary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PairingsVisitor ) return ((PairingsVisitor<? extends T>)visitor).visitSummary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SummaryContext summary() throws RecognitionException {
		SummaryContext _localctx = new SummaryContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_summary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(513);
			tafbSummary();
			setState(514);
			creditSummary();
			setState(515);
			perdiemSummary();
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
	public static class TafbSummaryContext extends ParserRuleContext {
		public TerminalNode TAFB() { return getToken(PairingsParser.TAFB, 0); }
		public TerminalNode COLON() { return getToken(PairingsParser.COLON, 0); }
		public DurationContext duration() {
			return getRuleContext(DurationContext.class,0);
		}
		public TafbSummaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tafbSummary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PairingsListener ) ((PairingsListener)listener).enterTafbSummary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PairingsListener ) ((PairingsListener)listener).exitTafbSummary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PairingsVisitor ) return ((PairingsVisitor<? extends T>)visitor).visitTafbSummary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TafbSummaryContext tafbSummary() throws RecognitionException {
		TafbSummaryContext _localctx = new TafbSummaryContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_tafbSummary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(517);
			match(TAFB);
			setState(518);
			match(COLON);
			setState(519);
			duration();
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
	public static class CreditSummaryContext extends ParserRuleContext {
		public TerminalNode CREDIT() { return getToken(PairingsParser.CREDIT, 0); }
		public TerminalNode COLON() { return getToken(PairingsParser.COLON, 0); }
		public CreditContext credit() {
			return getRuleContext(CreditContext.class,0);
		}
		public CreditSummaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_creditSummary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PairingsListener ) ((PairingsListener)listener).enterCreditSummary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PairingsListener ) ((PairingsListener)listener).exitCreditSummary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PairingsVisitor ) return ((PairingsVisitor<? extends T>)visitor).visitCreditSummary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreditSummaryContext creditSummary() throws RecognitionException {
		CreditSummaryContext _localctx = new CreditSummaryContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_creditSummary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(521);
			match(CREDIT);
			setState(522);
			match(COLON);
			setState(523);
			credit();
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
	public static class PerdiemSummaryContext extends ParserRuleContext {
		public TerminalNode PERDIEM() { return getToken(PairingsParser.PERDIEM, 0); }
		public TerminalNode COLON() { return getToken(PairingsParser.COLON, 0); }
		public HoursContext hours() {
			return getRuleContext(HoursContext.class,0);
		}
		public PerdiemSummaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_perdiemSummary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PairingsListener ) ((PairingsListener)listener).enterPerdiemSummary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PairingsListener ) ((PairingsListener)listener).exitPerdiemSummary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PairingsVisitor ) return ((PairingsVisitor<? extends T>)visitor).visitPerdiemSummary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PerdiemSummaryContext perdiemSummary() throws RecognitionException {
		PerdiemSummaryContext _localctx = new PerdiemSummaryContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_perdiemSummary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(525);
			match(PERDIEM);
			setState(526);
			match(COLON);
			setState(527);
			hours();
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
		"\u0004\u0001;\u0212\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u00076\u0002"+
		"7\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007;\u0002"+
		"<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007@\u0002"+
		"A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007E\u0002"+
		"F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007I\u0002J\u0007J\u0002"+
		"K\u0007K\u0002L\u0007L\u0002M\u0007M\u0002N\u0007N\u0002O\u0007O\u0002"+
		"P\u0007P\u0002Q\u0007Q\u0002R\u0007R\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0005\u0002\u00ae\b\u0002"+
		"\n\u0002\f\u0002\u00b1\t\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u00b5"+
		"\b\u0002\u0001\u0002\u0001\u0002\u0005\u0002\u00b9\b\u0002\n\u0002\f\u0002"+
		"\u00bc\t\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0005\u0005\u00c3\b\u0005\n\u0005\f\u0005\u00c6\t\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0003\b\u00d1\b\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0016"+
		"\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a"+
		"\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0004\u001c\u0111\b\u001c\u000b\u001c\f\u001c\u0112\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0003\u001e\u011b"+
		"\b\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001!\u0005"+
		"!\u0123\b!\n!\f!\u0126\t!\u0001\"\u0003\"\u0129\b\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0003\"\u012f\b\"\u0001#\u0003#\u0132\b#\u0001#\u0001#\u0001"+
		"$\u0001$\u0001%\u0004%\u0139\b%\u000b%\f%\u013a\u0001&\u0001&\u0003&\u013f"+
		"\b&\u0001\'\u0001\'\u0001\'\u0003\'\u0144\b\'\u0001(\u0001(\u0001)\u0003"+
		")\u0149\b)\u0001)\u0001)\u0001)\u0003)\u014e\b)\u0001*\u0001*\u0001+\u0001"+
		"+\u0001,\u0003,\u0155\b,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001"+
		"-\u0001-\u0001.\u0001.\u0001/\u0001/\u0003/\u0163\b/\u00010\u00010\u0001"+
		"0\u00010\u00010\u00010\u00010\u00010\u00030\u016d\b0\u00010\u00010\u0003"+
		"0\u0171\b0\u00010\u00030\u0174\b0\u00011\u00011\u00011\u00011\u00011\u0001"+
		"1\u00011\u00011\u00011\u00012\u00012\u00032\u0181\b2\u00012\u00012\u0003"+
		"2\u0185\b2\u00012\u00012\u00013\u00013\u00033\u018b\b3\u00013\u00033\u018e"+
		"\b3\u00013\u00033\u0191\b3\u00013\u00033\u0194\b3\u00013\u00053\u0197"+
		"\b3\n3\f3\u019a\t3\u00013\u00033\u019d\b3\u00014\u00054\u01a0\b4\n4\f"+
		"4\u01a3\t4\u00014\u00034\u01a6\b4\u00015\u00015\u00015\u00015\u00015\u0003"+
		"5\u01ad\b5\u00015\u00035\u01b0\b5\u00016\u00036\u01b3\b6\u00016\u0001"+
		"6\u00036\u01b7\b6\u00016\u00056\u01ba\b6\n6\f6\u01bd\t6\u00017\u00017"+
		"\u00037\u01c1\b7\u00017\u00017\u00018\u00018\u00038\u01c7\b8\u00019\u0001"+
		"9\u0001:\u0001:\u0001;\u0001;\u0001<\u0001<\u0001=\u0001=\u0001>\u0001"+
		">\u0001?\u0001?\u0001@\u0001@\u0001A\u0001A\u0001A\u0001A\u0001A\u0003"+
		"A\u01de\bA\u0001B\u0001B\u0003B\u01e2\bB\u0001C\u0001C\u0001D\u0001D\u0001"+
		"E\u0001E\u0001E\u0001F\u0001F\u0001G\u0001G\u0001H\u0001H\u0001I\u0001"+
		"I\u0001J\u0003J\u01f4\bJ\u0001J\u0001J\u0001K\u0001K\u0001L\u0001L\u0001"+
		"M\u0001M\u0001M\u0001M\u0001N\u0001N\u0001O\u0001O\u0001O\u0001O\u0001"+
		"P\u0001P\u0001P\u0001P\u0001Q\u0001Q\u0001Q\u0001Q\u0001R\u0001R\u0001"+
		"R\u0001R\u0001R\u0002\u00af\u00ba\u0000S\u0000\u0002\u0004\u0006\b\n\f"+
		"\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:"+
		"<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a"+
		"\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2"+
		"\u00a4\u0000\u0005\u0001\u0000\b\u000b\u0001\u0000&\'\u0004\u0000\u0015"+
		"\u0015\u001b\u001b##::\u0005\u0000\u0015\u0015\u001b\u001b&\'66::\u0002"+
		"\u0000\b\b\u001b\u001b\u01eb\u0000\u00a6\u0001\u0000\u0000\u0000\u0002"+
		"\u00a9\u0001\u0000\u0000\u0000\u0004\u00af\u0001\u0000\u0000\u0000\u0006"+
		"\u00bd\u0001\u0000\u0000\u0000\b\u00bf\u0001\u0000\u0000\u0000\n\u00c4"+
		"\u0001\u0000\u0000\u0000\f\u00c7\u0001\u0000\u0000\u0000\u000e\u00cb\u0001"+
		"\u0000\u0000\u0000\u0010\u00d0\u0001\u0000\u0000\u0000\u0012\u00d2\u0001"+
		"\u0000\u0000\u0000\u0014\u00d4\u0001\u0000\u0000\u0000\u0016\u00d7\u0001"+
		"\u0000\u0000\u0000\u0018\u00db\u0001\u0000\u0000\u0000\u001a\u00e1\u0001"+
		"\u0000\u0000\u0000\u001c\u00e3\u0001\u0000\u0000\u0000\u001e\u00e6\u0001"+
		"\u0000\u0000\u0000 \u00e9\u0001\u0000\u0000\u0000\"\u00eb\u0001\u0000"+
		"\u0000\u0000$\u00ed\u0001\u0000\u0000\u0000&\u00f7\u0001\u0000\u0000\u0000"+
		"(\u00f9\u0001\u0000\u0000\u0000*\u00fb\u0001\u0000\u0000\u0000,\u00fd"+
		"\u0001\u0000\u0000\u0000.\u00ff\u0001\u0000\u0000\u00000\u0101\u0001\u0000"+
		"\u0000\u00002\u0105\u0001\u0000\u0000\u00004\u0109\u0001\u0000\u0000\u0000"+
		"6\u010b\u0001\u0000\u0000\u00008\u0110\u0001\u0000\u0000\u0000:\u0114"+
		"\u0001\u0000\u0000\u0000<\u011a\u0001\u0000\u0000\u0000>\u011c\u0001\u0000"+
		"\u0000\u0000@\u011f\u0001\u0000\u0000\u0000B\u0124\u0001\u0000\u0000\u0000"+
		"D\u0128\u0001\u0000\u0000\u0000F\u0131\u0001\u0000\u0000\u0000H\u0135"+
		"\u0001\u0000\u0000\u0000J\u0138\u0001\u0000\u0000\u0000L\u013e\u0001\u0000"+
		"\u0000\u0000N\u0140\u0001\u0000\u0000\u0000P\u0145\u0001\u0000\u0000\u0000"+
		"R\u0148\u0001\u0000\u0000\u0000T\u014f\u0001\u0000\u0000\u0000V\u0151"+
		"\u0001\u0000\u0000\u0000X\u0154\u0001\u0000\u0000\u0000Z\u015c\u0001\u0000"+
		"\u0000\u0000\\\u015e\u0001\u0000\u0000\u0000^\u0162\u0001\u0000\u0000"+
		"\u0000`\u0164\u0001\u0000\u0000\u0000b\u0175\u0001\u0000\u0000\u0000d"+
		"\u017e\u0001\u0000\u0000\u0000f\u0193\u0001\u0000\u0000\u0000h\u01a1\u0001"+
		"\u0000\u0000\u0000j\u01a7\u0001\u0000\u0000\u0000l\u01b2\u0001\u0000\u0000"+
		"\u0000n\u01c0\u0001\u0000\u0000\u0000p\u01c4\u0001\u0000\u0000\u0000r"+
		"\u01c8\u0001\u0000\u0000\u0000t\u01ca\u0001\u0000\u0000\u0000v\u01cc\u0001"+
		"\u0000\u0000\u0000x\u01ce\u0001\u0000\u0000\u0000z\u01d0\u0001\u0000\u0000"+
		"\u0000|\u01d2\u0001\u0000\u0000\u0000~\u01d4\u0001\u0000\u0000\u0000\u0080"+
		"\u01d6\u0001\u0000\u0000\u0000\u0082\u01dd\u0001\u0000\u0000\u0000\u0084"+
		"\u01df\u0001\u0000\u0000\u0000\u0086\u01e3\u0001\u0000\u0000\u0000\u0088"+
		"\u01e5\u0001\u0000\u0000\u0000\u008a\u01e7\u0001\u0000\u0000\u0000\u008c"+
		"\u01ea\u0001\u0000\u0000\u0000\u008e\u01ec\u0001\u0000\u0000\u0000\u0090"+
		"\u01ee\u0001\u0000\u0000\u0000\u0092\u01f0\u0001\u0000\u0000\u0000\u0094"+
		"\u01f3\u0001\u0000\u0000\u0000\u0096\u01f7\u0001\u0000\u0000\u0000\u0098"+
		"\u01f9\u0001\u0000\u0000\u0000\u009a\u01fb\u0001\u0000\u0000\u0000\u009c"+
		"\u01ff\u0001\u0000\u0000\u0000\u009e\u0201\u0001\u0000\u0000\u0000\u00a0"+
		"\u0205\u0001\u0000\u0000\u0000\u00a2\u0209\u0001\u0000\u0000\u0000\u00a4"+
		"\u020d\u0001\u0000\u0000\u0000\u00a6\u00a7\u0003\u0002\u0001\u0000\u00a7"+
		"\u00a8\u0003\n\u0005\u0000\u00a8\u0001\u0001\u0000\u0000\u0000\u00a9\u00aa"+
		"\u0003\u0004\u0002\u0000\u00aa\u00ab\u0005\f\u0000\u0000\u00ab\u0003\u0001"+
		"\u0000\u0000\u0000\u00ac\u00ae\t\u0000\u0000\u0000\u00ad\u00ac\u0001\u0000"+
		"\u0000\u0000\u00ae\u00b1\u0001\u0000\u0000\u0000\u00af\u00b0\u0001\u0000"+
		"\u0000\u0000\u00af\u00ad\u0001\u0000\u0000\u0000\u00b0\u00b4\u0001\u0000"+
		"\u0000\u0000\u00b1\u00af\u0001\u0000\u0000\u0000\u00b2\u00b5\u00034\u001a"+
		"\u0000\u00b3\u00b5\u0003\u0006\u0003\u0000\u00b4\u00b2\u0001\u0000\u0000"+
		"\u0000\u00b4\u00b3\u0001\u0000\u0000\u0000\u00b5\u00b6\u0001\u0000\u0000"+
		"\u0000\u00b6\u00ba\u0003\b\u0004\u0000\u00b7\u00b9\t\u0000\u0000\u0000"+
		"\u00b8\u00b7\u0001\u0000\u0000\u0000\u00b9\u00bc\u0001\u0000\u0000\u0000"+
		"\u00ba\u00bb\u0001\u0000\u0000\u0000\u00ba\u00b8\u0001\u0000\u0000\u0000"+
		"\u00bb\u0005\u0001\u0000\u0000\u0000\u00bc\u00ba\u0001\u0000\u0000\u0000"+
		"\u00bd\u00be\u0005\u001a\u0000\u0000\u00be\u0007\u0001\u0000\u0000\u0000"+
		"\u00bf\u00c0\u0005\u001b\u0000\u0000\u00c0\t\u0001\u0000\u0000\u0000\u00c1"+
		"\u00c3\u0003\f\u0006\u0000\u00c2\u00c1\u0001\u0000\u0000\u0000\u00c3\u00c6"+
		"\u0001\u0000\u0000\u0000\u00c4\u00c2\u0001\u0000\u0000\u0000\u00c4\u00c5"+
		"\u0001\u0000\u0000\u0000\u00c5\u000b\u0001\u0000\u0000\u0000\u00c6\u00c4"+
		"\u0001\u0000\u0000\u0000\u00c7\u00c8\u0003\u000e\u0007\u0000\u00c8\u00c9"+
		"\u0003B!\u0000\u00c9\u00ca\u0003\u009aM\u0000\u00ca\r\u0001\u0000\u0000"+
		"\u0000\u00cb\u00cc\u0003\u0010\b\u0000\u00cc\u00cd\u0003\u0012\t\u0000"+
		"\u00cd\u000f\u0001\u0000\u0000\u0000\u00ce\u00d1\u0003\u0014\n\u0000\u00cf"+
		"\u00d1\u0003\u0016\u000b\u0000\u00d0\u00ce\u0001\u0000\u0000\u0000\u00d0"+
		"\u00cf\u0001\u0000\u0000\u0000\u00d1\u0011\u0001\u0000\u0000\u0000\u00d2"+
		"\u00d3\u0005,\u0000\u0000\u00d3\u0013\u0001\u0000\u0000\u0000\u00d4\u00d5"+
		"\u0003\u001a\r\u0000\u00d5\u00d6\u0003\u0018\f\u0000\u00d6\u0015\u0001"+
		"\u0000\u0000\u0000\u00d7\u00d8\u0003\u001e\u000f\u0000\u00d8\u00d9\u0003"+
		" \u0010\u0000\u00d9\u00da\u0003\u0018\f\u0000\u00da\u0017\u0001\u0000"+
		"\u0000\u0000\u00db\u00dc\u0003\"\u0011\u0000\u00dc\u00dd\u0003$\u0012"+
		"\u0000\u00dd\u00de\u0003\u001c\u000e\u0000\u00de\u00df\u0003.\u0017\u0000"+
		"\u00df\u00e0\u00030\u0018\u0000\u00e0\u0019\u0001\u0000\u0000\u0000\u00e1"+
		"\u00e2\u0005%\u0000\u0000\u00e2\u001b\u0001\u0000\u0000\u0000\u00e3\u00e4"+
		"\u0005&\u0000\u0000\u00e4\u00e5\u0005\u0010\u0000\u0000\u00e5\u001d\u0001"+
		"\u0000\u0000\u0000\u00e6\u00e7\u0005+\u0000\u0000\u00e7\u00e8\u0005\u001b"+
		"\u0000\u0000\u00e8\u001f\u0001\u0000\u0000\u0000\u00e9\u00ea\u0005(\u0000"+
		"\u0000\u00ea!\u0001\u0000\u0000\u0000\u00eb\u00ec\u0005)\u0000\u0000\u00ec"+
		"#\u0001\u0000\u0000\u0000\u00ed\u00ee\u0005\u0003\u0000\u0000\u00ee\u00ef"+
		"\u0003&\u0013\u0000\u00ef\u00f0\u0005\u000f\u0000\u0000\u00f0\u00f1\u0003"+
		"(\u0014\u0000\u00f1\u00f2\u0005\u000f\u0000\u0000\u00f2\u00f3\u0003*\u0015"+
		"\u0000\u00f3\u00f4\u0005\u000f\u0000\u0000\u00f4\u00f5\u0003,\u0016\u0000"+
		"\u00f5\u00f6\u0005\u0004\u0000\u0000\u00f6%\u0001\u0000\u0000\u0000\u00f7"+
		"\u00f8\u0005\u001b\u0000\u0000\u00f8\'\u0001\u0000\u0000\u0000\u00f9\u00fa"+
		"\u0005\u001b\u0000\u0000\u00fa)\u0001\u0000\u0000\u0000\u00fb\u00fc\u0005"+
		"\u001b\u0000\u0000\u00fc+\u0001\u0000\u0000\u0000\u00fd\u00fe\u0005\u001b"+
		"\u0000\u0000\u00fe-\u0001\u0000\u0000\u0000\u00ff\u0100\u0005\u0017\u0000"+
		"\u0000\u0100/\u0001\u0000\u0000\u0000\u0101\u0102\u0005.\u0000\u0000\u0102"+
		"\u0103\u00032\u0019\u0000\u0103\u0104\u0003<\u001e\u0000\u01041\u0001"+
		"\u0000\u0000\u0000\u0105\u0106\u00034\u001a\u0000\u0106\u0107\u0003:\u001d"+
		"\u0000\u0107\u0108\u00036\u001b\u0000\u01083\u0001\u0000\u0000\u0000\u0109"+
		"\u010a\u0005\u0019\u0000\u0000\u010a5\u0001\u0000\u0000\u0000\u010b\u010c"+
		"\u0005\u001b\u0000\u0000\u010c7\u0001\u0000\u0000\u0000\u010d\u010e\u0003"+
		"4\u001a\u0000\u010e\u010f\u00036\u001b\u0000\u010f\u0111\u0001\u0000\u0000"+
		"\u0000\u0110\u010d\u0001\u0000\u0000\u0000\u0111\u0112\u0001\u0000\u0000"+
		"\u0000\u0112\u0110\u0001\u0000\u0000\u0000\u0112\u0113\u0001\u0000\u0000"+
		"\u0000\u01139\u0001\u0000\u0000\u0000\u0114\u0115\u00036\u001b\u0000\u0115"+
		"\u0116\u0005\b\u0000\u0000\u0116\u0117\u00034\u001a\u0000\u0117;\u0001"+
		"\u0000\u0000\u0000\u0118\u011b\u0003>\u001f\u0000\u0119\u011b\u0003@ "+
		"\u0000\u011a\u0118\u0001\u0000\u0000\u0000\u011a\u0119\u0001\u0000\u0000"+
		"\u0000\u011b=\u0001\u0000\u0000\u0000\u011c\u011d\u0005/\u0000\u0000\u011d"+
		"\u011e\u00038\u001c\u0000\u011e?\u0001\u0000\u0000\u0000\u011f\u0120\u0005"+
		"0\u0000\u0000\u0120A\u0001\u0000\u0000\u0000\u0121\u0123\u0003D\"\u0000"+
		"\u0122\u0121\u0001\u0000\u0000\u0000\u0123\u0126\u0001\u0000\u0000\u0000"+
		"\u0124\u0122\u0001\u0000\u0000\u0000\u0124\u0125\u0001\u0000\u0000\u0000"+
		"\u0125C\u0001\u0000\u0000\u0000\u0126\u0124\u0001\u0000\u0000\u0000\u0127"+
		"\u0129\u0003F#\u0000\u0128\u0127\u0001\u0000\u0000\u0000\u0128\u0129\u0001"+
		"\u0000\u0000\u0000\u0129\u012e\u0001\u0000\u0000\u0000\u012a\u012f\u0003"+
		"N\'\u0000\u012b\u012f\u0003R)\u0000\u012c\u012f\u0003X,\u0000\u012d\u012f"+
		"\u0003^/\u0000\u012e\u012a\u0001\u0000\u0000\u0000\u012e\u012b\u0001\u0000"+
		"\u0000\u0000\u012e\u012c\u0001\u0000\u0000\u0000\u012e\u012d\u0001\u0000"+
		"\u0000\u0000\u012fE\u0001\u0000\u0000\u0000\u0130\u0132\u0003H$\u0000"+
		"\u0131\u0130\u0001\u0000\u0000\u0000\u0131\u0132\u0001\u0000\u0000\u0000"+
		"\u0132\u0133\u0001\u0000\u0000\u0000\u0133\u0134\u0003J%\u0000\u0134G"+
		"\u0001\u0000\u0000\u0000\u0135\u0136\u0005\u0015\u0000\u0000\u0136I\u0001"+
		"\u0000\u0000\u0000\u0137\u0139\u0003L&\u0000\u0138\u0137\u0001\u0000\u0000"+
		"\u0000\u0139\u013a\u0001\u0000\u0000\u0000\u013a\u0138\u0001\u0000\u0000"+
		"\u0000\u013a\u013b\u0001\u0000\u0000\u0000\u013bK\u0001\u0000\u0000\u0000"+
		"\u013c\u013f\u0005\t\u0000\u0000\u013d\u013f\u00036\u001b\u0000\u013e"+
		"\u013c\u0001\u0000\u0000\u0000\u013e\u013d\u0001\u0000\u0000\u0000\u013f"+
		"M\u0001\u0000\u0000\u0000\u0140\u0143\u0005\n\u0000\u0000\u0141\u0144"+
		"\u0003P(\u0000\u0142\u0144\u0003d2\u0000\u0143\u0141\u0001\u0000\u0000"+
		"\u0000\u0143\u0142\u0001\u0000\u0000\u0000\u0144O\u0001\u0000\u0000\u0000"+
		"\u0145\u0146\u0005-\u0000\u0000\u0146Q\u0001\u0000\u0000\u0000\u0147\u0149"+
		"\u0003T*\u0000\u0148\u0147\u0001\u0000\u0000\u0000\u0148\u0149\u0001\u0000"+
		"\u0000\u0000\u0149\u014a\u0001\u0000\u0000\u0000\u014a\u014b\u0003|>\u0000"+
		"\u014b\u014d\u0003\u0082A\u0000\u014c\u014e\u0003V+\u0000\u014d\u014c"+
		"\u0001\u0000\u0000\u0000\u014d\u014e\u0001\u0000\u0000\u0000\u014eS\u0001"+
		"\u0000\u0000\u0000\u014f\u0150\u0005!\u0000\u0000\u0150U\u0001\u0000\u0000"+
		"\u0000\u0151\u0152\u00051\u0000\u0000\u0152W\u0001\u0000\u0000\u0000\u0153"+
		"\u0155\u0003Z-\u0000\u0154\u0153\u0001\u0000\u0000\u0000\u0154\u0155\u0001"+
		"\u0000\u0000\u0000\u0155\u0156\u0001\u0000\u0000\u0000\u0156\u0157\u0003"+
		"~?\u0000\u0157\u0158\u0003\u0080@\u0000\u0158\u0159\u0003\u0082A\u0000"+
		"\u0159\u015a\u0003\\.\u0000\u015a\u015b\u0003\u0084B\u0000\u015bY\u0001"+
		"\u0000\u0000\u0000\u015c\u015d\u0005\"\u0000\u0000\u015d[\u0001\u0000"+
		"\u0000\u0000\u015e\u015f\u0003\u0092I\u0000\u015f]\u0001\u0000\u0000\u0000"+
		"\u0160\u0163\u0003`0\u0000\u0161\u0163\u0003b1\u0000\u0162\u0160\u0001"+
		"\u0000\u0000\u0000\u0162\u0161\u0001\u0000\u0000\u0000\u0163_\u0001\u0000"+
		"\u0000\u0000\u0164\u0165\u0003\u0094J\u0000\u0165\u0166\u0003n7\u0000"+
		"\u0166\u0167\u0003x<\u0000\u0167\u0168\u0003z=\u0000\u0168\u0169\u0003"+
		"|>\u0000\u0169\u016a\u0003~?\u0000\u016a\u016c\u0003\u0080@\u0000\u016b"+
		"\u016d\u0003\u0082A\u0000\u016c\u016b\u0001\u0000\u0000\u0000\u016c\u016d"+
		"\u0001\u0000\u0000\u0000\u016d\u016e\u0001\u0000\u0000\u0000\u016e\u0170"+
		"\u0003\u0084B\u0000\u016f\u0171\u0003v;\u0000\u0170\u016f\u0001\u0000"+
		"\u0000\u0000\u0170\u0171\u0001\u0000\u0000\u0000\u0171\u0173\u0001\u0000"+
		"\u0000\u0000\u0172\u0174\u0003$\u0012\u0000\u0173\u0172\u0001\u0000\u0000"+
		"\u0000\u0173\u0174\u0001\u0000\u0000\u0000\u0174a\u0001\u0000\u0000\u0000"+
		"\u0175\u0176\u0003\u0094J\u0000\u0176\u0177\u0003p8\u0000\u0177\u0178"+
		"\u0003x<\u0000\u0178\u0179\u0003z=\u0000\u0179\u017a\u0003|>\u0000\u017a"+
		"\u017b\u0003~?\u0000\u017b\u017c\u0003\u0080@\u0000\u017c\u017d\u0003"+
		"\u0084B\u0000\u017dc\u0001\u0000\u0000\u0000\u017e\u0180\u0003f3\u0000"+
		"\u017f\u0181\u0005\u0007\u0000\u0000\u0180\u017f\u0001\u0000\u0000\u0000"+
		"\u0180\u0181\u0001\u0000\u0000\u0000\u0181\u0182\u0001\u0000\u0000\u0000"+
		"\u0182\u0184\u0003h4\u0000\u0183\u0185\u0007\u0000\u0000\u0000\u0184\u0183"+
		"\u0001\u0000\u0000\u0000\u0184\u0185\u0001\u0000\u0000\u0000\u0185\u0186"+
		"\u0001\u0000\u0000\u0000\u0186\u0187\u0003j5\u0000\u0187e\u0001\u0000"+
		"\u0000\u0000\u0188\u018a\u0007\u0001\u0000\u0000\u0189\u018b\u0005\b\u0000"+
		"\u0000\u018a\u0189\u0001\u0000\u0000\u0000\u018a\u018b\u0001\u0000\u0000"+
		"\u0000\u018b\u018d\u0001\u0000\u0000\u0000\u018c\u018e\u0005\u0015\u0000"+
		"\u0000\u018d\u018c\u0001\u0000\u0000\u0000\u018d\u018e\u0001\u0000\u0000"+
		"\u0000\u018e\u0190\u0001\u0000\u0000\u0000\u018f\u0191\u0005\b\u0000\u0000"+
		"\u0190\u018f\u0001\u0000\u0000\u0000\u0190\u0191\u0001\u0000\u0000\u0000"+
		"\u0191\u0192\u0001\u0000\u0000\u0000\u0192\u0194\u00056\u0000\u0000\u0193"+
		"\u0188\u0001\u0000\u0000\u0000\u0193\u0194\u0001\u0000\u0000\u0000\u0194"+
		"\u0198\u0001\u0000\u0000\u0000\u0195\u0197\u0007\u0002\u0000\u0000\u0196"+
		"\u0195\u0001\u0000\u0000\u0000\u0197\u019a\u0001\u0000\u0000\u0000\u0198"+
		"\u0196\u0001\u0000\u0000\u0000\u0198\u0199\u0001\u0000\u0000\u0000\u0199"+
		"\u019c\u0001\u0000\u0000\u0000\u019a\u0198\u0001\u0000\u0000\u0000\u019b"+
		"\u019d\u0003l6\u0000\u019c\u019b\u0001\u0000\u0000\u0000\u019c\u019d\u0001"+
		"\u0000\u0000\u0000\u019dg\u0001\u0000\u0000\u0000\u019e\u01a0\u0007\u0003"+
		"\u0000\u0000\u019f\u019e\u0001\u0000\u0000\u0000\u01a0\u01a3\u0001\u0000"+
		"\u0000\u0000\u01a1\u019f\u0001\u0000\u0000\u0000\u01a1\u01a2\u0001\u0000"+
		"\u0000\u0000\u01a2\u01a5\u0001\u0000\u0000\u0000\u01a3\u01a1\u0001\u0000"+
		"\u0000\u0000\u01a4\u01a6\u0003l6\u0000\u01a5\u01a4\u0001\u0000\u0000\u0000"+
		"\u01a5\u01a6\u0001\u0000\u0000\u0000\u01a6i\u0001\u0000\u0000\u0000\u01a7"+
		"\u01ac\u0003\u0088D\u0000\u01a8\u01a9\u0005\u0001\u0000\u0000\u01a9\u01aa"+
		"\u0003\u008aE\u0000\u01aa\u01ab\u0005\u0002\u0000\u0000\u01ab\u01ad\u0001"+
		"\u0000\u0000\u0000\u01ac\u01a8\u0001\u0000\u0000\u0000\u01ac\u01ad\u0001"+
		"\u0000\u0000\u0000\u01ad\u01af\u0001\u0000\u0000\u0000\u01ae\u01b0\u0003"+
		"\u008cF\u0000\u01af\u01ae\u0001\u0000\u0000\u0000\u01af\u01b0\u0001\u0000"+
		"\u0000\u0000\u01b0k\u0001\u0000\u0000\u0000\u01b1\u01b3\u0005\u0001\u0000"+
		"\u0000\u01b2\u01b1\u0001\u0000\u0000\u0000\u01b2\u01b3\u0001\u0000\u0000"+
		"\u0000\u01b3\u01b4\u0001\u0000\u0000\u0000\u01b4\u01b6\u0005\u001b\u0000"+
		"\u0000\u01b5\u01b7\u0005\u0002\u0000\u0000\u01b6\u01b5\u0001\u0000\u0000"+
		"\u0000\u01b6\u01b7\u0001\u0000\u0000\u0000\u01b7\u01bb\u0001\u0000\u0000"+
		"\u0000\u01b8\u01ba\u0007\u0004\u0000\u0000\u01b9\u01b8\u0001\u0000\u0000"+
		"\u0000\u01ba\u01bd\u0001\u0000\u0000\u0000\u01bb\u01b9\u0001\u0000\u0000"+
		"\u0000\u01bb\u01bc\u0001\u0000\u0000\u0000\u01bcm\u0001\u0000\u0000\u0000"+
		"\u01bd\u01bb\u0001\u0000\u0000\u0000\u01be\u01c1\u0003r9\u0000\u01bf\u01c1"+
		"\u0003t:\u0000\u01c0\u01be\u0001\u0000\u0000\u0000\u01c0\u01bf\u0001\u0000"+
		"\u0000\u0000\u01c0\u01c1\u0001\u0000\u0000\u0000\u01c1\u01c2\u0001\u0000"+
		"\u0000\u0000\u01c2\u01c3\u0005\u001b\u0000\u0000\u01c3o\u0001\u0000\u0000"+
		"\u0000\u01c4\u01c6\u0005$\u0000\u0000\u01c5\u01c7\u0005\u001b\u0000\u0000"+
		"\u01c6\u01c5\u0001\u0000\u0000\u0000\u01c6\u01c7\u0001\u0000\u0000\u0000"+
		"\u01c7q\u0001\u0000\u0000\u0000\u01c8\u01c9\u00052\u0000\u0000\u01c9s"+
		"\u0001\u0000\u0000\u0000\u01ca\u01cb\u00053\u0000\u0000\u01cbu\u0001\u0000"+
		"\u0000\u0000\u01cc\u01cd\u00055\u0000\u0000\u01cdw\u0001\u0000\u0000\u0000"+
		"\u01ce\u01cf\u0007\u0001\u0000\u0000\u01cfy\u0001\u0000\u0000\u0000\u01d0"+
		"\u01d1\u0007\u0001\u0000\u0000\u01d1{\u0001\u0000\u0000\u0000\u01d2\u01d3"+
		"\u0003\u0090H\u0000\u01d3}\u0001\u0000\u0000\u0000\u01d4\u01d5\u0003\u0090"+
		"H\u0000\u01d5\u007f\u0001\u0000\u0000\u0000\u01d6\u01d7\u0003\u0092I\u0000"+
		"\u01d7\u0081\u0001\u0000\u0000\u0000\u01d8\u01de\u0003\u0092I\u0000\u01d9"+
		"\u01da\u0003\u0092I\u0000\u01da\u01db\u0005\u0012\u0000\u0000\u01db\u01de"+
		"\u0001\u0000\u0000\u0000\u01dc\u01de\u0005\u0012\u0000\u0000\u01dd\u01d8"+
		"\u0001\u0000\u0000\u0000\u01dd\u01d9\u0001\u0000\u0000\u0000\u01dd\u01dc"+
		"\u0001\u0000\u0000\u0000\u01de\u0083\u0001\u0000\u0000\u0000\u01df\u01e1"+
		"\u0003\u0092I\u0000\u01e0\u01e2\u0003\u0086C\u0000\u01e1\u01e0\u0001\u0000"+
		"\u0000\u0000\u01e1\u01e2\u0001\u0000\u0000\u0000\u01e2\u0085\u0001\u0000"+
		"\u0000\u0000\u01e3\u01e4\u0005*\u0000\u0000\u01e4\u0087\u0001\u0000\u0000"+
		"\u0000\u01e5\u01e6\u0003\u0092I\u0000\u01e6\u0089\u0001\u0000\u0000\u0000"+
		"\u01e7\u01e8\u0003\u0092I\u0000\u01e8\u01e9\u0005\u0013\u0000\u0000\u01e9"+
		"\u008b\u0001\u0000\u0000\u0000\u01ea\u01eb\u0003\u0092I\u0000\u01eb\u008d"+
		"\u0001\u0000\u0000\u0000\u01ec\u01ed\u0005\u001c\u0000\u0000\u01ed\u008f"+
		"\u0001\u0000\u0000\u0000\u01ee\u01ef\u0005\u001f\u0000\u0000\u01ef\u0091"+
		"\u0001\u0000\u0000\u0000\u01f0\u01f1\u0005 \u0000\u0000\u01f1\u0093\u0001"+
		"\u0000\u0000\u0000\u01f2\u01f4\u0003\u0096K\u0000\u01f3\u01f2\u0001\u0000"+
		"\u0000\u0000\u01f3\u01f4\u0001\u0000\u0000\u0000\u01f4\u01f5\u0001\u0000"+
		"\u0000\u0000\u01f5\u01f6\u0003\u0098L\u0000\u01f6\u0095\u0001\u0000\u0000"+
		"\u0000\u01f7\u01f8\u0005\u0018\u0000\u0000\u01f8\u0097\u0001\u0000\u0000"+
		"\u0000\u01f9\u01fa\u0005\u001b\u0000\u0000\u01fa\u0099\u0001\u0000\u0000"+
		"\u0000\u01fb\u01fc\u0003\u009cN\u0000\u01fc\u01fd\u0003\u009eO\u0000\u01fd"+
		"\u01fe\u0003\u009cN\u0000\u01fe\u009b\u0001\u0000\u0000\u0000\u01ff\u0200"+
		"\u0005\r\u0000\u0000\u0200\u009d\u0001\u0000\u0000\u0000\u0201\u0202\u0003"+
		"\u00a0P\u0000\u0202\u0203\u0003\u00a2Q\u0000\u0203\u0204\u0003\u00a4R"+
		"\u0000\u0204\u009f\u0001\u0000\u0000\u0000\u0205\u0206\u00057\u0000\u0000"+
		"\u0206\u0207\u0005\u0010\u0000\u0000\u0207\u0208\u0003\u0092I\u0000\u0208"+
		"\u00a1\u0001\u0000\u0000\u0000\u0209\u020a\u00058\u0000\u0000\u020a\u020b"+
		"\u0005\u0010\u0000\u0000\u020b\u020c\u0003\u0084B\u0000\u020c\u00a3\u0001"+
		"\u0000\u0000\u0000\u020d\u020e\u00059\u0000\u0000\u020e\u020f\u0005\u0010"+
		"\u0000\u0000\u020f\u0210\u0003\u008eG\u0000\u0210\u00a5\u0001\u0000\u0000"+
		"\u0000)\u00af\u00b4\u00ba\u00c4\u00d0\u0112\u011a\u0124\u0128\u012e\u0131"+
		"\u013a\u013e\u0143\u0148\u014d\u0154\u0162\u016c\u0170\u0173\u0180\u0184"+
		"\u018a\u018d\u0190\u0193\u0198\u019c\u01a1\u01a5\u01ac\u01af\u01b2\u01b6"+
		"\u01bb\u01c0\u01c6\u01dd\u01e1\u01f3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}