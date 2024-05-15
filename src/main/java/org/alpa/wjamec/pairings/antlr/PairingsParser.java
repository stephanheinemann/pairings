// Generated from Pairings.g4 by ANTLR 4.13.1
package org.alpa.wjamec.pairings.antlr;

import java.util.List;

import org.antlr.v4.runtime.NoViableAltException;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.RuntimeMetaData;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.Vocabulary;
import org.antlr.v4.runtime.VocabularyImpl;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

@SuppressWarnings({ "all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue" })
public class PairingsParser extends Parser {

    static {
        RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION);
    }

    protected static final DFA[] _decisionToDFA;
    protected static final PredictionContextCache _sharedContextCache = new PredictionContextCache();
    public static final int OPAR = 1, CPAR = 2, OBRK = 3, CBRK = 4, SLASH = 5, DASH = 6, TWO_DASHES = 7,
            FOUR_DASHES = 8, DASHES = 9, UNDERLINE = 10, COMMA = 11, COLON = 12, ASTERISK = 13, TWICE = 14,
            CAPITAL_LETTER = 15, LETTER = 16, DAYS_OF_WEEK = 17, WEEKDAY = 18, MONTH = 19, NAT = 20, NATREAL = 21,
            HOURS = 22, MINUTES = 23, TIME = 24, DURATION = 25, REPORT = 26, RELEASE = 27, TBD = 28, GROUND = 29,
            BASE = 30, BASE_IATA = 31, IATA = 32, PAIRING_ID = 33, PAIRING_TYPE = 34, CREDIT_ANNOTATION = 35, TRIP = 36,
            TABLE_HEADER = 37, START = 38, EFFECTIVE = 39, EXCEPTIONS = 40, NO_EXCEPTIONS = 41, CHECKIN_DUTY = 42,
            DEADHEAD = 43, AIRLINE = 44, AIRCRAFT = 45, HOTEL = 46, TAFB = 47, CREDIT = 48, PERDIEM = 49, WORD = 50,
            WS = 51;
    public static final int RULE_pairings = 0, RULE_pairing = 1, RULE_header = 2, RULE_headline = 3,
            RULE_tableHeader = 4, RULE_preliminaryHeadline = 5, RULE_finalHeadline = 6, RULE_commonHeadline = 7,
            RULE_base = 8, RULE_baseIata = 9, RULE_tripNumber = 10, RULE_pairingId = 11, RULE_pairingType = 12,
            RULE_crew = 13, RULE_captains = 14, RULE_firstOfficers = 15, RULE_flightAttendants = 16,
            RULE_extraFlightAttendants = 17, RULE_daysOfWeek = 18, RULE_effectiveness = 19, RULE_period = 20,
            RULE_month = 21, RULE_dayOfMonth = 22, RULE_daysOfMonth = 23, RULE_dayToMonth = 24, RULE_exceptions = 25,
            RULE_withExceptions = 26, RULE_withoutExceptions = 27, RULE_contents = 28, RULE_content = 29,
            RULE_calendarWeek = 30, RULE_calendarMonthLetter = 31, RULE_calendarDaysOfMonth = 32,
            RULE_calendarDayOfMonth = 33, RULE_contentSeparator = 34, RULE_start = 35, RULE_checkin = 36,
            RULE_report = 37, RULE_checkinDuty = 38, RULE_checkout = 39, RULE_release = 40, RULE_checkoutDuty = 41,
            RULE_leg = 42, RULE_flightLeg = 43, RULE_groundLeg = 44, RULE_layover = 45, RULE_accommodation = 46,
            RULE_transportation = 47, RULE_layoverDurations = 48, RULE_phone = 49, RULE_flight = 50, RULE_ground = 51,
            RULE_deadhead = 52, RULE_airline = 53, RULE_aircraft = 54, RULE_origin = 55, RULE_destination = 56,
            RULE_out = 57, RULE_in = 58, RULE_block = 59, RULE_tog = 60, RULE_credit = 61, RULE_creditAnnotation = 62,
            RULE_layoverDuration = 63, RULE_transportationDuration = 64, RULE_restDuration = 65, RULE_hours = 66,
            RULE_time = 67, RULE_duration = 68, RULE_dutyDay = 69, RULE_weekday = 70, RULE_dayOfDuty = 71,
            RULE_footer = 72, RULE_footerSeparator = 73, RULE_summary = 74, RULE_tafbSummary = 75,
            RULE_creditSummary = 76, RULE_perdiemSummary = 77;

    private static String[] makeRuleNames() {
        return new String[] { "pairings", "pairing", "header", "headline", "tableHeader", "preliminaryHeadline",
                "finalHeadline", "commonHeadline", "base", "baseIata", "tripNumber", "pairingId", "pairingType", "crew",
                "captains", "firstOfficers", "flightAttendants", "extraFlightAttendants", "daysOfWeek", "effectiveness",
                "period", "month", "dayOfMonth", "daysOfMonth", "dayToMonth", "exceptions", "withExceptions",
                "withoutExceptions", "contents", "content", "calendarWeek", "calendarMonthLetter",
                "calendarDaysOfMonth", "calendarDayOfMonth", "contentSeparator", "start", "checkin", "report",
                "checkinDuty", "checkout", "release", "checkoutDuty", "leg", "flightLeg", "groundLeg", "layover",
                "accommodation", "transportation", "layoverDurations", "phone", "flight", "ground", "deadhead",
                "airline", "aircraft", "origin", "destination", "out", "in", "block", "tog", "credit",
                "creditAnnotation", "layoverDuration", "transportationDuration", "restDuration", "hours", "time",
                "duration", "dutyDay", "weekday", "dayOfDuty", "footer", "footerSeparator", "summary", "tafbSummary",
                "creditSummary", "perdiemSummary" };
    }

    public static final String[] ruleNames = makeRuleNames();

    private static String[] makeLiteralNames() {
        return new String[] { null, "'('", "')'", "'['", "']'", "'/'", "'-'", "'--'", "'----'", null,
                "'____________________________________________________________________________________________________'",
                "','", "':'", "'*'", "'*2'", null, null, null, null, null, null, null, null, null, null, null, "'RPT'",
                "'RLS'", "'TBD'", null, null, null, null, null, null, null, "'TRIP #'",
                "'MO TU WE TH FR SA SU DAY FLT# DEP ARR DEP ARR BLK TOG DUTY CREDIT LO A/C CREW COMP'",
                "'----------- --- --- ----- ----- ----- ----- ----- --------- ----- --- ---------'", "'effective'",
                "'except'", "'no exceptions.'", null, null, null, null, null, "'TAFB'", "'Credit Time'", "'PERDIEM'" };
    }

    private static final String[] _LITERAL_NAMES = makeLiteralNames();

    private static String[] makeSymbolicNames() {
        return new String[] { null, "OPAR", "CPAR", "OBRK", "CBRK", "SLASH", "DASH", "TWO_DASHES", "FOUR_DASHES",
                "DASHES", "UNDERLINE", "COMMA", "COLON", "ASTERISK", "TWICE", "CAPITAL_LETTER", "LETTER",
                "DAYS_OF_WEEK", "WEEKDAY", "MONTH", "NAT", "NATREAL", "HOURS", "MINUTES", "TIME", "DURATION", "REPORT",
                "RELEASE", "TBD", "GROUND", "BASE", "BASE_IATA", "IATA", "PAIRING_ID", "PAIRING_TYPE",
                "CREDIT_ANNOTATION", "TRIP", "TABLE_HEADER", "START", "EFFECTIVE", "EXCEPTIONS", "NO_EXCEPTIONS",
                "CHECKIN_DUTY", "DEADHEAD", "AIRLINE", "AIRCRAFT", "HOTEL", "TAFB", "CREDIT", "PERDIEM", "WORD", "WS" };
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
    public String getGrammarFileName() {
        return "Pairings.g4";
    }

    @Override
    public String[] getRuleNames() {
        return ruleNames;
    }

    @Override
    public String getSerializedATN() {
        return _serializedATN;
    }

    @Override
    public ATN getATN() {
        return _ATN;
    }

    public PairingsParser(TokenStream input) {
        super(input);
        _interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
    }

    @SuppressWarnings("CheckReturnValue")
    public static class PairingsContext extends ParserRuleContext {

        public List<PairingContext> pairing() {
            return getRuleContexts(PairingContext.class);
        }

        public PairingContext pairing(int i) {
            return getRuleContext(PairingContext.class, i);
        }

        public PairingsContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_pairings;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof PairingsListener)
                ((PairingsListener) listener).enterPairings(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof PairingsListener)
                ((PairingsListener) listener).exitPairings(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof PairingsVisitor)
                return ((PairingsVisitor<? extends T>) visitor).visitPairings(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final PairingsContext pairings() throws RecognitionException {
        PairingsContext _localctx = new PairingsContext(_ctx, getState());
        enterRule(_localctx, 0, RULE_pairings);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(159);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == BASE || _la == TRIP) {
                    {
                        {
                            setState(156);
                            pairing();
                        }
                    }
                    setState(161);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class PairingContext extends ParserRuleContext {

        public HeaderContext header() {
            return getRuleContext(HeaderContext.class, 0);
        }

        public ContentsContext contents() {
            return getRuleContext(ContentsContext.class, 0);
        }

        public FooterContext footer() {
            return getRuleContext(FooterContext.class, 0);
        }

        public PairingContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_pairing;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof PairingsListener)
                ((PairingsListener) listener).enterPairing(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof PairingsListener)
                ((PairingsListener) listener).exitPairing(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof PairingsVisitor)
                return ((PairingsVisitor<? extends T>) visitor).visitPairing(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final PairingContext pairing() throws RecognitionException {
        PairingContext _localctx = new PairingContext(_ctx, getState());
        enterRule(_localctx, 2, RULE_pairing);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(162);
                header();
                setState(163);
                contents();
                setState(164);
                footer();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class HeaderContext extends ParserRuleContext {

        public HeadlineContext headline() {
            return getRuleContext(HeadlineContext.class, 0);
        }

        public TableHeaderContext tableHeader() {
            return getRuleContext(TableHeaderContext.class, 0);
        }

        public HeaderContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_header;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof PairingsListener)
                ((PairingsListener) listener).enterHeader(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof PairingsListener)
                ((PairingsListener) listener).exitHeader(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof PairingsVisitor)
                return ((PairingsVisitor<? extends T>) visitor).visitHeader(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final HeaderContext header() throws RecognitionException {
        HeaderContext _localctx = new HeaderContext(_ctx, getState());
        enterRule(_localctx, 4, RULE_header);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(166);
                headline();
                setState(167);
                tableHeader();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class HeadlineContext extends ParserRuleContext {

        public PreliminaryHeadlineContext preliminaryHeadline() {
            return getRuleContext(PreliminaryHeadlineContext.class, 0);
        }

        public FinalHeadlineContext finalHeadline() {
            return getRuleContext(FinalHeadlineContext.class, 0);
        }

        public HeadlineContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_headline;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof PairingsListener)
                ((PairingsListener) listener).enterHeadline(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof PairingsListener)
                ((PairingsListener) listener).exitHeadline(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof PairingsVisitor)
                return ((PairingsVisitor<? extends T>) visitor).visitHeadline(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final HeadlineContext headline() throws RecognitionException {
        HeadlineContext _localctx = new HeadlineContext(_ctx, getState());
        enterRule(_localctx, 6, RULE_headline);
        try {
            setState(171);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
            case BASE:
                enterOuterAlt(_localctx, 1); {
                setState(169);
                preliminaryHeadline();
            }
                break;
            case TRIP:
                enterOuterAlt(_localctx, 2); {
                setState(170);
                finalHeadline();
            }
                break;
            default:
                throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class TableHeaderContext extends ParserRuleContext {

        public TerminalNode TABLE_HEADER() {
            return getToken(PairingsParser.TABLE_HEADER, 0);
        }

        public TableHeaderContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_tableHeader;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof PairingsListener)
                ((PairingsListener) listener).enterTableHeader(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof PairingsListener)
                ((PairingsListener) listener).exitTableHeader(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof PairingsVisitor)
                return ((PairingsVisitor<? extends T>) visitor).visitTableHeader(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final TableHeaderContext tableHeader() throws RecognitionException {
        TableHeaderContext _localctx = new TableHeaderContext(_ctx, getState());
        enterRule(_localctx, 8, RULE_tableHeader);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(173);
                match(TABLE_HEADER);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class PreliminaryHeadlineContext extends ParserRuleContext {

        public BaseContext base() {
            return getRuleContext(BaseContext.class, 0);
        }

        public CommonHeadlineContext commonHeadline() {
            return getRuleContext(CommonHeadlineContext.class, 0);
        }

        public PreliminaryHeadlineContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_preliminaryHeadline;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof PairingsListener)
                ((PairingsListener) listener).enterPreliminaryHeadline(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof PairingsListener)
                ((PairingsListener) listener).exitPreliminaryHeadline(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof PairingsVisitor)
                return ((PairingsVisitor<? extends T>) visitor).visitPreliminaryHeadline(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final PreliminaryHeadlineContext preliminaryHeadline() throws RecognitionException {
        PreliminaryHeadlineContext _localctx = new PreliminaryHeadlineContext(_ctx, getState());
        enterRule(_localctx, 10, RULE_preliminaryHeadline);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(175);
                base();
                setState(176);
                commonHeadline();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class FinalHeadlineContext extends ParserRuleContext {

        public TripNumberContext tripNumber() {
            return getRuleContext(TripNumberContext.class, 0);
        }

        public PairingIdContext pairingId() {
            return getRuleContext(PairingIdContext.class, 0);
        }

        public CommonHeadlineContext commonHeadline() {
            return getRuleContext(CommonHeadlineContext.class, 0);
        }

        public FinalHeadlineContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_finalHeadline;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof PairingsListener)
                ((PairingsListener) listener).enterFinalHeadline(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof PairingsListener)
                ((PairingsListener) listener).exitFinalHeadline(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof PairingsVisitor)
                return ((PairingsVisitor<? extends T>) visitor).visitFinalHeadline(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final FinalHeadlineContext finalHeadline() throws RecognitionException {
        FinalHeadlineContext _localctx = new FinalHeadlineContext(_ctx, getState());
        enterRule(_localctx, 12, RULE_finalHeadline);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(178);
                tripNumber();
                setState(179);
                pairingId();
                setState(180);
                commonHeadline();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class CommonHeadlineContext extends ParserRuleContext {

        public PairingTypeContext pairingType() {
            return getRuleContext(PairingTypeContext.class, 0);
        }

        public CrewContext crew() {
            return getRuleContext(CrewContext.class, 0);
        }

        public BaseIataContext baseIata() {
            return getRuleContext(BaseIataContext.class, 0);
        }

        public DaysOfWeekContext daysOfWeek() {
            return getRuleContext(DaysOfWeekContext.class, 0);
        }

        public EffectivenessContext effectiveness() {
            return getRuleContext(EffectivenessContext.class, 0);
        }

        public CommonHeadlineContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_commonHeadline;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof PairingsListener)
                ((PairingsListener) listener).enterCommonHeadline(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof PairingsListener)
                ((PairingsListener) listener).exitCommonHeadline(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof PairingsVisitor)
                return ((PairingsVisitor<? extends T>) visitor).visitCommonHeadline(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final CommonHeadlineContext commonHeadline() throws RecognitionException {
        CommonHeadlineContext _localctx = new CommonHeadlineContext(_ctx, getState());
        enterRule(_localctx, 14, RULE_commonHeadline);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(182);
                pairingType();
                setState(183);
                crew();
                setState(184);
                baseIata();
                setState(185);
                daysOfWeek();
                setState(186);
                effectiveness();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class BaseContext extends ParserRuleContext {

        public TerminalNode BASE() {
            return getToken(PairingsParser.BASE, 0);
        }

        public BaseContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_base;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof PairingsListener)
                ((PairingsListener) listener).enterBase(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof PairingsListener)
                ((PairingsListener) listener).exitBase(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof PairingsVisitor)
                return ((PairingsVisitor<? extends T>) visitor).visitBase(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final BaseContext base() throws RecognitionException {
        BaseContext _localctx = new BaseContext(_ctx, getState());
        enterRule(_localctx, 16, RULE_base);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(188);
                match(BASE);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class BaseIataContext extends ParserRuleContext {

        public TerminalNode BASE_IATA() {
            return getToken(PairingsParser.BASE_IATA, 0);
        }

        public TerminalNode COLON() {
            return getToken(PairingsParser.COLON, 0);
        }

        public BaseIataContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_baseIata;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof PairingsListener)
                ((PairingsListener) listener).enterBaseIata(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof PairingsListener)
                ((PairingsListener) listener).exitBaseIata(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof PairingsVisitor)
                return ((PairingsVisitor<? extends T>) visitor).visitBaseIata(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final BaseIataContext baseIata() throws RecognitionException {
        BaseIataContext _localctx = new BaseIataContext(_ctx, getState());
        enterRule(_localctx, 18, RULE_baseIata);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(190);
                match(BASE_IATA);
                setState(191);
                match(COLON);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class TripNumberContext extends ParserRuleContext {

        public TerminalNode TRIP() {
            return getToken(PairingsParser.TRIP, 0);
        }

        public TerminalNode NAT() {
            return getToken(PairingsParser.NAT, 0);
        }

        public TripNumberContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_tripNumber;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof PairingsListener)
                ((PairingsListener) listener).enterTripNumber(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof PairingsListener)
                ((PairingsListener) listener).exitTripNumber(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof PairingsVisitor)
                return ((PairingsVisitor<? extends T>) visitor).visitTripNumber(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final TripNumberContext tripNumber() throws RecognitionException {
        TripNumberContext _localctx = new TripNumberContext(_ctx, getState());
        enterRule(_localctx, 20, RULE_tripNumber);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(193);
                match(TRIP);
                setState(194);
                match(NAT);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class PairingIdContext extends ParserRuleContext {

        public TerminalNode PAIRING_ID() {
            return getToken(PairingsParser.PAIRING_ID, 0);
        }

        public PairingIdContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_pairingId;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof PairingsListener)
                ((PairingsListener) listener).enterPairingId(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof PairingsListener)
                ((PairingsListener) listener).exitPairingId(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof PairingsVisitor)
                return ((PairingsVisitor<? extends T>) visitor).visitPairingId(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final PairingIdContext pairingId() throws RecognitionException {
        PairingIdContext _localctx = new PairingIdContext(_ctx, getState());
        enterRule(_localctx, 22, RULE_pairingId);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(196);
                match(PAIRING_ID);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class PairingTypeContext extends ParserRuleContext {

        public TerminalNode PAIRING_TYPE() {
            return getToken(PairingsParser.PAIRING_TYPE, 0);
        }

        public PairingTypeContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_pairingType;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof PairingsListener)
                ((PairingsListener) listener).enterPairingType(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof PairingsListener)
                ((PairingsListener) listener).exitPairingType(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof PairingsVisitor)
                return ((PairingsVisitor<? extends T>) visitor).visitPairingType(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final PairingTypeContext pairingType() throws RecognitionException {
        PairingTypeContext _localctx = new PairingTypeContext(_ctx, getState());
        enterRule(_localctx, 24, RULE_pairingType);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(198);
                match(PAIRING_TYPE);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class CrewContext extends ParserRuleContext {

        public TerminalNode OBRK() {
            return getToken(PairingsParser.OBRK, 0);
        }

        public CaptainsContext captains() {
            return getRuleContext(CaptainsContext.class, 0);
        }

        public List<TerminalNode> COMMA() {
            return getTokens(PairingsParser.COMMA);
        }

        public TerminalNode COMMA(int i) {
            return getToken(PairingsParser.COMMA, i);
        }

        public FirstOfficersContext firstOfficers() {
            return getRuleContext(FirstOfficersContext.class, 0);
        }

        public FlightAttendantsContext flightAttendants() {
            return getRuleContext(FlightAttendantsContext.class, 0);
        }

        public ExtraFlightAttendantsContext extraFlightAttendants() {
            return getRuleContext(ExtraFlightAttendantsContext.class, 0);
        }

        public TerminalNode CBRK() {
            return getToken(PairingsParser.CBRK, 0);
        }

        public CrewContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_crew;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof PairingsListener)
                ((PairingsListener) listener).enterCrew(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof PairingsListener)
                ((PairingsListener) listener).exitCrew(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof PairingsVisitor)
                return ((PairingsVisitor<? extends T>) visitor).visitCrew(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final CrewContext crew() throws RecognitionException {
        CrewContext _localctx = new CrewContext(_ctx, getState());
        enterRule(_localctx, 26, RULE_crew);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(200);
                match(OBRK);
                setState(201);
                captains();
                setState(202);
                match(COMMA);
                setState(203);
                firstOfficers();
                setState(204);
                match(COMMA);
                setState(205);
                flightAttendants();
                setState(206);
                match(COMMA);
                setState(207);
                extraFlightAttendants();
                setState(208);
                match(CBRK);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class CaptainsContext extends ParserRuleContext {

        public TerminalNode NAT() {
            return getToken(PairingsParser.NAT, 0);
        }

        public CaptainsContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_captains;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof PairingsListener)
                ((PairingsListener) listener).enterCaptains(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof PairingsListener)
                ((PairingsListener) listener).exitCaptains(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof PairingsVisitor)
                return ((PairingsVisitor<? extends T>) visitor).visitCaptains(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final CaptainsContext captains() throws RecognitionException {
        CaptainsContext _localctx = new CaptainsContext(_ctx, getState());
        enterRule(_localctx, 28, RULE_captains);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(210);
                match(NAT);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class FirstOfficersContext extends ParserRuleContext {

        public TerminalNode NAT() {
            return getToken(PairingsParser.NAT, 0);
        }

        public FirstOfficersContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_firstOfficers;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof PairingsListener)
                ((PairingsListener) listener).enterFirstOfficers(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof PairingsListener)
                ((PairingsListener) listener).exitFirstOfficers(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof PairingsVisitor)
                return ((PairingsVisitor<? extends T>) visitor).visitFirstOfficers(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final FirstOfficersContext firstOfficers() throws RecognitionException {
        FirstOfficersContext _localctx = new FirstOfficersContext(_ctx, getState());
        enterRule(_localctx, 30, RULE_firstOfficers);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(212);
                match(NAT);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class FlightAttendantsContext extends ParserRuleContext {

        public TerminalNode NAT() {
            return getToken(PairingsParser.NAT, 0);
        }

        public FlightAttendantsContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_flightAttendants;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof PairingsListener)
                ((PairingsListener) listener).enterFlightAttendants(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof PairingsListener)
                ((PairingsListener) listener).exitFlightAttendants(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof PairingsVisitor)
                return ((PairingsVisitor<? extends T>) visitor).visitFlightAttendants(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final FlightAttendantsContext flightAttendants() throws RecognitionException {
        FlightAttendantsContext _localctx = new FlightAttendantsContext(_ctx, getState());
        enterRule(_localctx, 32, RULE_flightAttendants);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(214);
                match(NAT);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class ExtraFlightAttendantsContext extends ParserRuleContext {

        public TerminalNode NAT() {
            return getToken(PairingsParser.NAT, 0);
        }

        public ExtraFlightAttendantsContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_extraFlightAttendants;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof PairingsListener)
                ((PairingsListener) listener).enterExtraFlightAttendants(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof PairingsListener)
                ((PairingsListener) listener).exitExtraFlightAttendants(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof PairingsVisitor)
                return ((PairingsVisitor<? extends T>) visitor).visitExtraFlightAttendants(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final ExtraFlightAttendantsContext extraFlightAttendants() throws RecognitionException {
        ExtraFlightAttendantsContext _localctx = new ExtraFlightAttendantsContext(_ctx, getState());
        enterRule(_localctx, 34, RULE_extraFlightAttendants);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(216);
                match(NAT);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class DaysOfWeekContext extends ParserRuleContext {

        public TerminalNode DAYS_OF_WEEK() {
            return getToken(PairingsParser.DAYS_OF_WEEK, 0);
        }

        public DaysOfWeekContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_daysOfWeek;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof PairingsListener)
                ((PairingsListener) listener).enterDaysOfWeek(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof PairingsListener)
                ((PairingsListener) listener).exitDaysOfWeek(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof PairingsVisitor)
                return ((PairingsVisitor<? extends T>) visitor).visitDaysOfWeek(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final DaysOfWeekContext daysOfWeek() throws RecognitionException {
        DaysOfWeekContext _localctx = new DaysOfWeekContext(_ctx, getState());
        enterRule(_localctx, 36, RULE_daysOfWeek);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(218);
                match(DAYS_OF_WEEK);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class EffectivenessContext extends ParserRuleContext {

        public TerminalNode EFFECTIVE() {
            return getToken(PairingsParser.EFFECTIVE, 0);
        }

        public PeriodContext period() {
            return getRuleContext(PeriodContext.class, 0);
        }

        public ExceptionsContext exceptions() {
            return getRuleContext(ExceptionsContext.class, 0);
        }

        public EffectivenessContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_effectiveness;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof PairingsListener)
                ((PairingsListener) listener).enterEffectiveness(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof PairingsListener)
                ((PairingsListener) listener).exitEffectiveness(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof PairingsVisitor)
                return ((PairingsVisitor<? extends T>) visitor).visitEffectiveness(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final EffectivenessContext effectiveness() throws RecognitionException {
        EffectivenessContext _localctx = new EffectivenessContext(_ctx, getState());
        enterRule(_localctx, 38, RULE_effectiveness);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(220);
                match(EFFECTIVE);
                setState(221);
                period();
                setState(222);
                exceptions();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class PeriodContext extends ParserRuleContext {

        public MonthContext month() {
            return getRuleContext(MonthContext.class, 0);
        }

        public DayToMonthContext dayToMonth() {
            return getRuleContext(DayToMonthContext.class, 0);
        }

        public DayOfMonthContext dayOfMonth() {
            return getRuleContext(DayOfMonthContext.class, 0);
        }

        public PeriodContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_period;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof PairingsListener)
                ((PairingsListener) listener).enterPeriod(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof PairingsListener)
                ((PairingsListener) listener).exitPeriod(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof PairingsVisitor)
                return ((PairingsVisitor<? extends T>) visitor).visitPeriod(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final PeriodContext period() throws RecognitionException {
        PeriodContext _localctx = new PeriodContext(_ctx, getState());
        enterRule(_localctx, 40, RULE_period);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(224);
                month();
                setState(225);
                dayToMonth();
                setState(226);
                dayOfMonth();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class MonthContext extends ParserRuleContext {

        public TerminalNode MONTH() {
            return getToken(PairingsParser.MONTH, 0);
        }

        public MonthContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_month;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof PairingsListener)
                ((PairingsListener) listener).enterMonth(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof PairingsListener)
                ((PairingsListener) listener).exitMonth(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof PairingsVisitor)
                return ((PairingsVisitor<? extends T>) visitor).visitMonth(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final MonthContext month() throws RecognitionException {
        MonthContext _localctx = new MonthContext(_ctx, getState());
        enterRule(_localctx, 42, RULE_month);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(228);
                match(MONTH);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class DayOfMonthContext extends ParserRuleContext {

        public TerminalNode NAT() {
            return getToken(PairingsParser.NAT, 0);
        }

        public DayOfMonthContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_dayOfMonth;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof PairingsListener)
                ((PairingsListener) listener).enterDayOfMonth(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof PairingsListener)
                ((PairingsListener) listener).exitDayOfMonth(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof PairingsVisitor)
                return ((PairingsVisitor<? extends T>) visitor).visitDayOfMonth(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final DayOfMonthContext dayOfMonth() throws RecognitionException {
        DayOfMonthContext _localctx = new DayOfMonthContext(_ctx, getState());
        enterRule(_localctx, 44, RULE_dayOfMonth);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(230);
                match(NAT);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
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
            return getRuleContext(MonthContext.class, i);
        }

        public List<DayOfMonthContext> dayOfMonth() {
            return getRuleContexts(DayOfMonthContext.class);
        }

        public DayOfMonthContext dayOfMonth(int i) {
            return getRuleContext(DayOfMonthContext.class, i);
        }

        public DaysOfMonthContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_daysOfMonth;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof PairingsListener)
                ((PairingsListener) listener).enterDaysOfMonth(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof PairingsListener)
                ((PairingsListener) listener).exitDaysOfMonth(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof PairingsVisitor)
                return ((PairingsVisitor<? extends T>) visitor).visitDaysOfMonth(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final DaysOfMonthContext daysOfMonth() throws RecognitionException {
        DaysOfMonthContext _localctx = new DaysOfMonthContext(_ctx, getState());
        enterRule(_localctx, 46, RULE_daysOfMonth);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(235);
                _errHandler.sync(this);
                _la = _input.LA(1);
                do {
                    {
                        {
                            setState(232);
                            month();
                            setState(233);
                            dayOfMonth();
                        }
                    }
                    setState(237);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                } while (_la == MONTH);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class DayToMonthContext extends ParserRuleContext {

        public DayOfMonthContext dayOfMonth() {
            return getRuleContext(DayOfMonthContext.class, 0);
        }

        public TerminalNode DASH() {
            return getToken(PairingsParser.DASH, 0);
        }

        public MonthContext month() {
            return getRuleContext(MonthContext.class, 0);
        }

        public DayToMonthContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_dayToMonth;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof PairingsListener)
                ((PairingsListener) listener).enterDayToMonth(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof PairingsListener)
                ((PairingsListener) listener).exitDayToMonth(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof PairingsVisitor)
                return ((PairingsVisitor<? extends T>) visitor).visitDayToMonth(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final DayToMonthContext dayToMonth() throws RecognitionException {
        DayToMonthContext _localctx = new DayToMonthContext(_ctx, getState());
        enterRule(_localctx, 48, RULE_dayToMonth);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(239);
                dayOfMonth();
                setState(240);
                match(DASH);
                setState(241);
                month();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class ExceptionsContext extends ParserRuleContext {

        public WithExceptionsContext withExceptions() {
            return getRuleContext(WithExceptionsContext.class, 0);
        }

        public WithoutExceptionsContext withoutExceptions() {
            return getRuleContext(WithoutExceptionsContext.class, 0);
        }

        public ExceptionsContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_exceptions;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof PairingsListener)
                ((PairingsListener) listener).enterExceptions(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof PairingsListener)
                ((PairingsListener) listener).exitExceptions(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof PairingsVisitor)
                return ((PairingsVisitor<? extends T>) visitor).visitExceptions(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final ExceptionsContext exceptions() throws RecognitionException {
        ExceptionsContext _localctx = new ExceptionsContext(_ctx, getState());
        enterRule(_localctx, 50, RULE_exceptions);
        try {
            setState(245);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
            case EXCEPTIONS:
                enterOuterAlt(_localctx, 1); {
                setState(243);
                withExceptions();
            }
                break;
            case NO_EXCEPTIONS:
                enterOuterAlt(_localctx, 2); {
                setState(244);
                withoutExceptions();
            }
                break;
            default:
                throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class WithExceptionsContext extends ParserRuleContext {

        public TerminalNode EXCEPTIONS() {
            return getToken(PairingsParser.EXCEPTIONS, 0);
        }

        public DaysOfMonthContext daysOfMonth() {
            return getRuleContext(DaysOfMonthContext.class, 0);
        }

        public WithExceptionsContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_withExceptions;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof PairingsListener)
                ((PairingsListener) listener).enterWithExceptions(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof PairingsListener)
                ((PairingsListener) listener).exitWithExceptions(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof PairingsVisitor)
                return ((PairingsVisitor<? extends T>) visitor).visitWithExceptions(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final WithExceptionsContext withExceptions() throws RecognitionException {
        WithExceptionsContext _localctx = new WithExceptionsContext(_ctx, getState());
        enterRule(_localctx, 52, RULE_withExceptions);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(247);
                match(EXCEPTIONS);
                setState(248);
                daysOfMonth();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class WithoutExceptionsContext extends ParserRuleContext {

        public TerminalNode NO_EXCEPTIONS() {
            return getToken(PairingsParser.NO_EXCEPTIONS, 0);
        }

        public WithoutExceptionsContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_withoutExceptions;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof PairingsListener)
                ((PairingsListener) listener).enterWithoutExceptions(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof PairingsListener)
                ((PairingsListener) listener).exitWithoutExceptions(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof PairingsVisitor)
                return ((PairingsVisitor<? extends T>) visitor).visitWithoutExceptions(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final WithoutExceptionsContext withoutExceptions() throws RecognitionException {
        WithoutExceptionsContext _localctx = new WithoutExceptionsContext(_ctx, getState());
        enterRule(_localctx, 54, RULE_withoutExceptions);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(250);
                match(NO_EXCEPTIONS);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
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
            return getRuleContext(ContentContext.class, i);
        }

        public ContentsContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_contents;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof PairingsListener)
                ((PairingsListener) listener).enterContents(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof PairingsListener)
                ((PairingsListener) listener).exitContents(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof PairingsVisitor)
                return ((PairingsVisitor<? extends T>) visitor).visitContents(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final ContentsContext contents() throws RecognitionException {
        ContentsContext _localctx = new ContentsContext(_ctx, getState());
        enterRule(_localctx, 56, RULE_contents);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(255);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 219447680L) != 0)) {
                    {
                        {
                            setState(252);
                            content();
                        }
                    }
                    setState(257);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class ContentContext extends ParserRuleContext {

        public ContentSeparatorContext contentSeparator() {
            return getRuleContext(ContentSeparatorContext.class, 0);
        }

        public CheckinContext checkin() {
            return getRuleContext(CheckinContext.class, 0);
        }

        public CheckoutContext checkout() {
            return getRuleContext(CheckoutContext.class, 0);
        }

        public LegContext leg() {
            return getRuleContext(LegContext.class, 0);
        }

        public CalendarWeekContext calendarWeek() {
            return getRuleContext(CalendarWeekContext.class, 0);
        }

        public ContentContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_content;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof PairingsListener)
                ((PairingsListener) listener).enterContent(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof PairingsListener)
                ((PairingsListener) listener).exitContent(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof PairingsVisitor)
                return ((PairingsVisitor<? extends T>) visitor).visitContent(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final ContentContext content() throws RecognitionException {
        ContentContext _localctx = new ContentContext(_ctx, getState());
        enterRule(_localctx, 58, RULE_content);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(259);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 5, _ctx)) {
                case 1: {
                    setState(258);
                    calendarWeek();
                }
                    break;
                }
                setState(265);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 6, _ctx)) {
                case 1: {
                    setState(261);
                    contentSeparator();
                }
                    break;
                case 2: {
                    setState(262);
                    checkin();
                }
                    break;
                case 3: {
                    setState(263);
                    checkout();
                }
                    break;
                case 4: {
                    setState(264);
                    leg();
                }
                    break;
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class CalendarWeekContext extends ParserRuleContext {

        public CalendarDaysOfMonthContext calendarDaysOfMonth() {
            return getRuleContext(CalendarDaysOfMonthContext.class, 0);
        }

        public CalendarMonthLetterContext calendarMonthLetter() {
            return getRuleContext(CalendarMonthLetterContext.class, 0);
        }

        public CalendarWeekContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_calendarWeek;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof PairingsListener)
                ((PairingsListener) listener).enterCalendarWeek(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof PairingsListener)
                ((PairingsListener) listener).exitCalendarWeek(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof PairingsVisitor)
                return ((PairingsVisitor<? extends T>) visitor).visitCalendarWeek(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final CalendarWeekContext calendarWeek() throws RecognitionException {
        CalendarWeekContext _localctx = new CalendarWeekContext(_ctx, getState());
        enterRule(_localctx, 60, RULE_calendarWeek);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(268);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == CAPITAL_LETTER) {
                    {
                        setState(267);
                        calendarMonthLetter();
                    }
                }

                setState(270);
                calendarDaysOfMonth();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class CalendarMonthLetterContext extends ParserRuleContext {

        public TerminalNode CAPITAL_LETTER() {
            return getToken(PairingsParser.CAPITAL_LETTER, 0);
        }

        public CalendarMonthLetterContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_calendarMonthLetter;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof PairingsListener)
                ((PairingsListener) listener).enterCalendarMonthLetter(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof PairingsListener)
                ((PairingsListener) listener).exitCalendarMonthLetter(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof PairingsVisitor)
                return ((PairingsVisitor<? extends T>) visitor).visitCalendarMonthLetter(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final CalendarMonthLetterContext calendarMonthLetter() throws RecognitionException {
        CalendarMonthLetterContext _localctx = new CalendarMonthLetterContext(_ctx, getState());
        enterRule(_localctx, 62, RULE_calendarMonthLetter);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(272);
                match(CAPITAL_LETTER);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
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
            return getRuleContext(CalendarDayOfMonthContext.class, i);
        }

        public CalendarDaysOfMonthContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_calendarDaysOfMonth;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof PairingsListener)
                ((PairingsListener) listener).enterCalendarDaysOfMonth(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof PairingsListener)
                ((PairingsListener) listener).exitCalendarDaysOfMonth(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof PairingsVisitor)
                return ((PairingsVisitor<? extends T>) visitor).visitCalendarDaysOfMonth(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final CalendarDaysOfMonthContext calendarDaysOfMonth() throws RecognitionException {
        CalendarDaysOfMonthContext _localctx = new CalendarDaysOfMonthContext(_ctx, getState());
        enterRule(_localctx, 64, RULE_calendarDaysOfMonth);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(275);
                _errHandler.sync(this);
                _alt = 1;
                do {
                    switch (_alt) {
                    case 1: {
                        {
                            setState(274);
                            calendarDayOfMonth();
                        }
                    }
                        break;
                    default:
                        throw new NoViableAltException(this);
                    }
                    setState(277);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 8, _ctx);
                } while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class CalendarDayOfMonthContext extends ParserRuleContext {

        public TerminalNode TWO_DASHES() {
            return getToken(PairingsParser.TWO_DASHES, 0);
        }

        public DayOfMonthContext dayOfMonth() {
            return getRuleContext(DayOfMonthContext.class, 0);
        }

        public CalendarDayOfMonthContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_calendarDayOfMonth;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof PairingsListener)
                ((PairingsListener) listener).enterCalendarDayOfMonth(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof PairingsListener)
                ((PairingsListener) listener).exitCalendarDayOfMonth(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof PairingsVisitor)
                return ((PairingsVisitor<? extends T>) visitor).visitCalendarDayOfMonth(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final CalendarDayOfMonthContext calendarDayOfMonth() throws RecognitionException {
        CalendarDayOfMonthContext _localctx = new CalendarDayOfMonthContext(_ctx, getState());
        enterRule(_localctx, 66, RULE_calendarDayOfMonth);
        try {
            setState(281);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
            case TWO_DASHES:
                enterOuterAlt(_localctx, 1); {
                setState(279);
                match(TWO_DASHES);
            }
                break;
            case NAT:
                enterOuterAlt(_localctx, 2); {
                setState(280);
                dayOfMonth();
            }
                break;
            default:
                throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class ContentSeparatorContext extends ParserRuleContext {

        public TerminalNode FOUR_DASHES() {
            return getToken(PairingsParser.FOUR_DASHES, 0);
        }

        public StartContext start() {
            return getRuleContext(StartContext.class, 0);
        }

        public LayoverContext layover() {
            return getRuleContext(LayoverContext.class, 0);
        }

        public ContentSeparatorContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_contentSeparator;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof PairingsListener)
                ((PairingsListener) listener).enterContentSeparator(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof PairingsListener)
                ((PairingsListener) listener).exitContentSeparator(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof PairingsVisitor)
                return ((PairingsVisitor<? extends T>) visitor).visitContentSeparator(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final ContentSeparatorContext contentSeparator() throws RecognitionException {
        ContentSeparatorContext _localctx = new ContentSeparatorContext(_ctx, getState());
        enterRule(_localctx, 68, RULE_contentSeparator);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(283);
                match(FOUR_DASHES);
                setState(286);
                _errHandler.sync(this);
                switch (_input.LA(1)) {
                case START: {
                    setState(284);
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
                case IATA:
                case HOTEL:
                case WORD: {
                    setState(285);
                    layover();
                }
                    break;
                default:
                    throw new NoViableAltException(this);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class StartContext extends ParserRuleContext {

        public TerminalNode START() {
            return getToken(PairingsParser.START, 0);
        }

        public StartContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_start;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof PairingsListener)
                ((PairingsListener) listener).enterStart(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof PairingsListener)
                ((PairingsListener) listener).exitStart(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof PairingsVisitor)
                return ((PairingsVisitor<? extends T>) visitor).visitStart(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final StartContext start() throws RecognitionException {
        StartContext _localctx = new StartContext(_ctx, getState());
        enterRule(_localctx, 70, RULE_start);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(288);
                match(START);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class CheckinContext extends ParserRuleContext {

        public OutContext out() {
            return getRuleContext(OutContext.class, 0);
        }

        public TogContext tog() {
            return getRuleContext(TogContext.class, 0);
        }

        public ReportContext report() {
            return getRuleContext(ReportContext.class, 0);
        }

        public CheckinDutyContext checkinDuty() {
            return getRuleContext(CheckinDutyContext.class, 0);
        }

        public CheckinContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_checkin;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof PairingsListener)
                ((PairingsListener) listener).enterCheckin(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof PairingsListener)
                ((PairingsListener) listener).exitCheckin(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof PairingsVisitor)
                return ((PairingsVisitor<? extends T>) visitor).visitCheckin(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final CheckinContext checkin() throws RecognitionException {
        CheckinContext _localctx = new CheckinContext(_ctx, getState());
        enterRule(_localctx, 72, RULE_checkin);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(291);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == REPORT) {
                    {
                        setState(290);
                        report();
                    }
                }

                setState(293);
                out();
                setState(294);
                tog();
                setState(296);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == CHECKIN_DUTY) {
                    {
                        setState(295);
                        checkinDuty();
                    }
                }

            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class ReportContext extends ParserRuleContext {

        public TerminalNode REPORT() {
            return getToken(PairingsParser.REPORT, 0);
        }

        public ReportContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_report;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof PairingsListener)
                ((PairingsListener) listener).enterReport(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof PairingsListener)
                ((PairingsListener) listener).exitReport(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof PairingsVisitor)
                return ((PairingsVisitor<? extends T>) visitor).visitReport(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final ReportContext report() throws RecognitionException {
        ReportContext _localctx = new ReportContext(_ctx, getState());
        enterRule(_localctx, 74, RULE_report);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(298);
                match(REPORT);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class CheckinDutyContext extends ParserRuleContext {

        public TerminalNode CHECKIN_DUTY() {
            return getToken(PairingsParser.CHECKIN_DUTY, 0);
        }

        public CheckinDutyContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_checkinDuty;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof PairingsListener)
                ((PairingsListener) listener).enterCheckinDuty(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof PairingsListener)
                ((PairingsListener) listener).exitCheckinDuty(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof PairingsVisitor)
                return ((PairingsVisitor<? extends T>) visitor).visitCheckinDuty(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final CheckinDutyContext checkinDuty() throws RecognitionException {
        CheckinDutyContext _localctx = new CheckinDutyContext(_ctx, getState());
        enterRule(_localctx, 76, RULE_checkinDuty);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(300);
                match(CHECKIN_DUTY);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class CheckoutContext extends ParserRuleContext {

        public InContext in() {
            return getRuleContext(InContext.class, 0);
        }

        public BlockContext block() {
            return getRuleContext(BlockContext.class, 0);
        }

        public TogContext tog() {
            return getRuleContext(TogContext.class, 0);
        }

        public CheckoutDutyContext checkoutDuty() {
            return getRuleContext(CheckoutDutyContext.class, 0);
        }

        public CreditContext credit() {
            return getRuleContext(CreditContext.class, 0);
        }

        public ReleaseContext release() {
            return getRuleContext(ReleaseContext.class, 0);
        }

        public CheckoutContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_checkout;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof PairingsListener)
                ((PairingsListener) listener).enterCheckout(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof PairingsListener)
                ((PairingsListener) listener).exitCheckout(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof PairingsVisitor)
                return ((PairingsVisitor<? extends T>) visitor).visitCheckout(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final CheckoutContext checkout() throws RecognitionException {
        CheckoutContext _localctx = new CheckoutContext(_ctx, getState());
        enterRule(_localctx, 78, RULE_checkout);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(303);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == RELEASE) {
                    {
                        setState(302);
                        release();
                    }
                }

                setState(305);
                in();
                setState(306);
                block();
                setState(307);
                tog();
                setState(308);
                checkoutDuty();
                setState(309);
                credit();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class ReleaseContext extends ParserRuleContext {

        public TerminalNode RELEASE() {
            return getToken(PairingsParser.RELEASE, 0);
        }

        public ReleaseContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_release;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof PairingsListener)
                ((PairingsListener) listener).enterRelease(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof PairingsListener)
                ((PairingsListener) listener).exitRelease(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof PairingsVisitor)
                return ((PairingsVisitor<? extends T>) visitor).visitRelease(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final ReleaseContext release() throws RecognitionException {
        ReleaseContext _localctx = new ReleaseContext(_ctx, getState());
        enterRule(_localctx, 80, RULE_release);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(311);
                match(RELEASE);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class CheckoutDutyContext extends ParserRuleContext {

        public DurationContext duration() {
            return getRuleContext(DurationContext.class, 0);
        }

        public CheckoutDutyContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_checkoutDuty;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof PairingsListener)
                ((PairingsListener) listener).enterCheckoutDuty(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof PairingsListener)
                ((PairingsListener) listener).exitCheckoutDuty(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof PairingsVisitor)
                return ((PairingsVisitor<? extends T>) visitor).visitCheckoutDuty(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final CheckoutDutyContext checkoutDuty() throws RecognitionException {
        CheckoutDutyContext _localctx = new CheckoutDutyContext(_ctx, getState());
        enterRule(_localctx, 82, RULE_checkoutDuty);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(313);
                duration();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class LegContext extends ParserRuleContext {

        public FlightLegContext flightLeg() {
            return getRuleContext(FlightLegContext.class, 0);
        }

        public GroundLegContext groundLeg() {
            return getRuleContext(GroundLegContext.class, 0);
        }

        public LegContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_leg;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof PairingsListener)
                ((PairingsListener) listener).enterLeg(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof PairingsListener)
                ((PairingsListener) listener).exitLeg(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof PairingsVisitor)
                return ((PairingsVisitor<? extends T>) visitor).visitLeg(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final LegContext leg() throws RecognitionException {
        LegContext _localctx = new LegContext(_ctx, getState());
        enterRule(_localctx, 84, RULE_leg);
        try {
            setState(317);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 14, _ctx)) {
            case 1:
                enterOuterAlt(_localctx, 1); {
                setState(315);
                flightLeg();
            }
                break;
            case 2:
                enterOuterAlt(_localctx, 2); {
                setState(316);
                groundLeg();
            }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class FlightLegContext extends ParserRuleContext {

        public DutyDayContext dutyDay() {
            return getRuleContext(DutyDayContext.class, 0);
        }

        public FlightContext flight() {
            return getRuleContext(FlightContext.class, 0);
        }

        public OriginContext origin() {
            return getRuleContext(OriginContext.class, 0);
        }

        public DestinationContext destination() {
            return getRuleContext(DestinationContext.class, 0);
        }

        public OutContext out() {
            return getRuleContext(OutContext.class, 0);
        }

        public InContext in() {
            return getRuleContext(InContext.class, 0);
        }

        public BlockContext block() {
            return getRuleContext(BlockContext.class, 0);
        }

        public CreditContext credit() {
            return getRuleContext(CreditContext.class, 0);
        }

        public TogContext tog() {
            return getRuleContext(TogContext.class, 0);
        }

        public AircraftContext aircraft() {
            return getRuleContext(AircraftContext.class, 0);
        }

        public CrewContext crew() {
            return getRuleContext(CrewContext.class, 0);
        }

        public FlightLegContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_flightLeg;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof PairingsListener)
                ((PairingsListener) listener).enterFlightLeg(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof PairingsListener)
                ((PairingsListener) listener).exitFlightLeg(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof PairingsVisitor)
                return ((PairingsVisitor<? extends T>) visitor).visitFlightLeg(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final FlightLegContext flightLeg() throws RecognitionException {
        FlightLegContext _localctx = new FlightLegContext(_ctx, getState());
        enterRule(_localctx, 86, RULE_flightLeg);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(319);
                dutyDay();
                setState(320);
                flight();
                setState(321);
                origin();
                setState(322);
                destination();
                setState(323);
                out();
                setState(324);
                in();
                setState(325);
                block();
                setState(327);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 15, _ctx)) {
                case 1: {
                    setState(326);
                    tog();
                }
                    break;
                }
                setState(329);
                credit();
                setState(331);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == AIRCRAFT) {
                    {
                        setState(330);
                        aircraft();
                    }
                }

                setState(334);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == OBRK) {
                    {
                        setState(333);
                        crew();
                    }
                }

            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class GroundLegContext extends ParserRuleContext {

        public DutyDayContext dutyDay() {
            return getRuleContext(DutyDayContext.class, 0);
        }

        public GroundContext ground() {
            return getRuleContext(GroundContext.class, 0);
        }

        public OriginContext origin() {
            return getRuleContext(OriginContext.class, 0);
        }

        public DestinationContext destination() {
            return getRuleContext(DestinationContext.class, 0);
        }

        public OutContext out() {
            return getRuleContext(OutContext.class, 0);
        }

        public InContext in() {
            return getRuleContext(InContext.class, 0);
        }

        public BlockContext block() {
            return getRuleContext(BlockContext.class, 0);
        }

        public CreditContext credit() {
            return getRuleContext(CreditContext.class, 0);
        }

        public GroundLegContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_groundLeg;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof PairingsListener)
                ((PairingsListener) listener).enterGroundLeg(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof PairingsListener)
                ((PairingsListener) listener).exitGroundLeg(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof PairingsVisitor)
                return ((PairingsVisitor<? extends T>) visitor).visitGroundLeg(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final GroundLegContext groundLeg() throws RecognitionException {
        GroundLegContext _localctx = new GroundLegContext(_ctx, getState());
        enterRule(_localctx, 88, RULE_groundLeg);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(336);
                dutyDay();
                setState(337);
                ground();
                setState(338);
                origin();
                setState(339);
                destination();
                setState(340);
                out();
                setState(341);
                in();
                setState(342);
                block();
                setState(343);
                credit();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class LayoverContext extends ParserRuleContext {

        public AccommodationContext accommodation() {
            return getRuleContext(AccommodationContext.class, 0);
        }

        public TransportationContext transportation() {
            return getRuleContext(TransportationContext.class, 0);
        }

        public LayoverDurationsContext layoverDurations() {
            return getRuleContext(LayoverDurationsContext.class, 0);
        }

        public TerminalNode SLASH() {
            return getToken(PairingsParser.SLASH, 0);
        }

        public TerminalNode DASH() {
            return getToken(PairingsParser.DASH, 0);
        }

        public TerminalNode TWO_DASHES() {
            return getToken(PairingsParser.TWO_DASHES, 0);
        }

        public TerminalNode FOUR_DASHES() {
            return getToken(PairingsParser.FOUR_DASHES, 0);
        }

        public TerminalNode DASHES() {
            return getToken(PairingsParser.DASHES, 0);
        }

        public LayoverContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_layover;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof PairingsListener)
                ((PairingsListener) listener).enterLayover(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof PairingsListener)
                ((PairingsListener) listener).exitLayover(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof PairingsVisitor)
                return ((PairingsVisitor<? extends T>) visitor).visitLayover(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final LayoverContext layover() throws RecognitionException {
        LayoverContext _localctx = new LayoverContext(_ctx, getState());
        enterRule(_localctx, 90, RULE_layover);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(345);
                accommodation();
                setState(347);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == SLASH) {
                    {
                        setState(346);
                        match(SLASH);
                    }
                }

                setState(349);
                transportation();
                setState(351);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 960L) != 0)) {
                    {
                        setState(350);
                        _la = _input.LA(1);
                        if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & 960L) != 0))) {
                            _errHandler.recoverInline(this);
                        } else {
                            if (_input.LA(1) == Token.EOF)
                                matchedEOF = true;
                            _errHandler.reportMatch(this);
                            consume();
                        }
                    }
                }

                setState(353);
                layoverDurations();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class AccommodationContext extends ParserRuleContext {

        public TerminalNode HOTEL() {
            return getToken(PairingsParser.HOTEL, 0);
        }

        public PhoneContext phone() {
            return getRuleContext(PhoneContext.class, 0);
        }

        public TerminalNode BASE_IATA() {
            return getToken(PairingsParser.BASE_IATA, 0);
        }

        public TerminalNode IATA() {
            return getToken(PairingsParser.IATA, 0);
        }

        public List<TerminalNode> TBD() {
            return getTokens(PairingsParser.TBD);
        }

        public TerminalNode TBD(int i) {
            return getToken(PairingsParser.TBD, i);
        }

        public List<TerminalNode> CAPITAL_LETTER() {
            return getTokens(PairingsParser.CAPITAL_LETTER);
        }

        public TerminalNode CAPITAL_LETTER(int i) {
            return getToken(PairingsParser.CAPITAL_LETTER, i);
        }

        public List<TerminalNode> WORD() {
            return getTokens(PairingsParser.WORD);
        }

        public TerminalNode WORD(int i) {
            return getToken(PairingsParser.WORD, i);
        }

        public List<TerminalNode> NAT() {
            return getTokens(PairingsParser.NAT);
        }

        public TerminalNode NAT(int i) {
            return getToken(PairingsParser.NAT, i);
        }

        public TerminalNode DASH() {
            return getToken(PairingsParser.DASH, 0);
        }

        public AccommodationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_accommodation;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof PairingsListener)
                ((PairingsListener) listener).enterAccommodation(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof PairingsListener)
                ((PairingsListener) listener).exitAccommodation(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof PairingsVisitor)
                return ((PairingsVisitor<? extends T>) visitor).visitAccommodation(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final AccommodationContext accommodation() throws RecognitionException {
        AccommodationContext _localctx = new AccommodationContext(_ctx, getState());
        enterRule(_localctx, 92, RULE_accommodation);
        int _la;
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(363);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 22, _ctx)) {
                case 1: {
                    setState(355);
                    _la = _input.LA(1);
                    if (!(_la == BASE_IATA || _la == IATA)) {
                        _errHandler.recoverInline(this);
                    } else {
                        if (_input.LA(1) == Token.EOF)
                            matchedEOF = true;
                        _errHandler.reportMatch(this);
                        consume();
                    }
                    setState(360);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == DASH) {
                        {
                            setState(356);
                            match(DASH);
                            setState(358);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                            if (_la == CAPITAL_LETTER) {
                                {
                                    setState(357);
                                    match(CAPITAL_LETTER);
                                }
                            }

                        }
                    }

                    setState(362);
                    match(HOTEL);
                }
                    break;
                }
                setState(368);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 23, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        {
                            {
                                setState(365);
                                _la = _input.LA(1);
                                if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & 1125900176359424L) != 0))) {
                                    _errHandler.recoverInline(this);
                                } else {
                                    if (_input.LA(1) == Token.EOF)
                                        matchedEOF = true;
                                    _errHandler.reportMatch(this);
                                    consume();
                                }
                            }
                        }
                    }
                    setState(370);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 23, _ctx);
                }
                setState(372);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 24, _ctx)) {
                case 1: {
                    setState(371);
                    phone();
                }
                    break;
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class TransportationContext extends ParserRuleContext {

        public PhoneContext phone() {
            return getRuleContext(PhoneContext.class, 0);
        }

        public List<TerminalNode> BASE_IATA() {
            return getTokens(PairingsParser.BASE_IATA);
        }

        public TerminalNode BASE_IATA(int i) {
            return getToken(PairingsParser.BASE_IATA, i);
        }

        public List<TerminalNode> IATA() {
            return getTokens(PairingsParser.IATA);
        }

        public TerminalNode IATA(int i) {
            return getToken(PairingsParser.IATA, i);
        }

        public List<TerminalNode> HOTEL() {
            return getTokens(PairingsParser.HOTEL);
        }

        public TerminalNode HOTEL(int i) {
            return getToken(PairingsParser.HOTEL, i);
        }

        public List<TerminalNode> CAPITAL_LETTER() {
            return getTokens(PairingsParser.CAPITAL_LETTER);
        }

        public TerminalNode CAPITAL_LETTER(int i) {
            return getToken(PairingsParser.CAPITAL_LETTER, i);
        }

        public List<TerminalNode> WORD() {
            return getTokens(PairingsParser.WORD);
        }

        public TerminalNode WORD(int i) {
            return getToken(PairingsParser.WORD, i);
        }

        public List<TerminalNode> NAT() {
            return getTokens(PairingsParser.NAT);
        }

        public TerminalNode NAT(int i) {
            return getToken(PairingsParser.NAT, i);
        }

        public TransportationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_transportation;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof PairingsListener)
                ((PairingsListener) listener).enterTransportation(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof PairingsListener)
                ((PairingsListener) listener).exitTransportation(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof PairingsVisitor)
                return ((PairingsVisitor<? extends T>) visitor).visitTransportation(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final TransportationContext transportation() throws RecognitionException {
        TransportationContext _localctx = new TransportationContext(_ctx, getState());
        enterRule(_localctx, 94, RULE_transportation);
        int _la;
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(377);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 25, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        {
                            {
                                setState(374);
                                _la = _input.LA(1);
                                if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & 1196275094552576L) != 0))) {
                                    _errHandler.recoverInline(this);
                                } else {
                                    if (_input.LA(1) == Token.EOF)
                                        matchedEOF = true;
                                    _errHandler.reportMatch(this);
                                    consume();
                                }
                            }
                        }
                    }
                    setState(379);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 25, _ctx);
                }
                setState(381);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == OPAR || _la == NAT) {
                    {
                        setState(380);
                        phone();
                    }
                }

            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class LayoverDurationsContext extends ParserRuleContext {

        public LayoverDurationContext layoverDuration() {
            return getRuleContext(LayoverDurationContext.class, 0);
        }

        public TerminalNode OPAR() {
            return getToken(PairingsParser.OPAR, 0);
        }

        public TransportationDurationContext transportationDuration() {
            return getRuleContext(TransportationDurationContext.class, 0);
        }

        public TerminalNode CPAR() {
            return getToken(PairingsParser.CPAR, 0);
        }

        public RestDurationContext restDuration() {
            return getRuleContext(RestDurationContext.class, 0);
        }

        public LayoverDurationsContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_layoverDurations;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof PairingsListener)
                ((PairingsListener) listener).enterLayoverDurations(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof PairingsListener)
                ((PairingsListener) listener).exitLayoverDurations(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof PairingsVisitor)
                return ((PairingsVisitor<? extends T>) visitor).visitLayoverDurations(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final LayoverDurationsContext layoverDurations() throws RecognitionException {
        LayoverDurationsContext _localctx = new LayoverDurationsContext(_ctx, getState());
        enterRule(_localctx, 96, RULE_layoverDurations);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(383);
                layoverDuration();
                setState(384);
                match(OPAR);
                setState(385);
                transportationDuration();
                setState(386);
                match(CPAR);
                setState(387);
                restDuration();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class PhoneContext extends ParserRuleContext {

        public List<TerminalNode> NAT() {
            return getTokens(PairingsParser.NAT);
        }

        public TerminalNode NAT(int i) {
            return getToken(PairingsParser.NAT, i);
        }

        public TerminalNode OPAR() {
            return getToken(PairingsParser.OPAR, 0);
        }

        public TerminalNode CPAR() {
            return getToken(PairingsParser.CPAR, 0);
        }

        public List<TerminalNode> DASH() {
            return getTokens(PairingsParser.DASH);
        }

        public TerminalNode DASH(int i) {
            return getToken(PairingsParser.DASH, i);
        }

        public PhoneContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_phone;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof PairingsListener)
                ((PairingsListener) listener).enterPhone(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof PairingsListener)
                ((PairingsListener) listener).exitPhone(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof PairingsVisitor)
                return ((PairingsVisitor<? extends T>) visitor).visitPhone(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final PhoneContext phone() throws RecognitionException {
        PhoneContext _localctx = new PhoneContext(_ctx, getState());
        enterRule(_localctx, 98, RULE_phone);
        int _la;
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(390);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == OPAR) {
                    {
                        setState(389);
                        match(OPAR);
                    }
                }

                setState(392);
                match(NAT);
                setState(394);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == CPAR) {
                    {
                        setState(393);
                        match(CPAR);
                    }
                }

                setState(399);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 29, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        {
                            {
                                setState(396);
                                _la = _input.LA(1);
                                if (!(_la == DASH || _la == NAT)) {
                                    _errHandler.recoverInline(this);
                                } else {
                                    if (_input.LA(1) == Token.EOF)
                                        matchedEOF = true;
                                    _errHandler.reportMatch(this);
                                    consume();
                                }
                            }
                        }
                    }
                    setState(401);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 29, _ctx);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class FlightContext extends ParserRuleContext {

        public TerminalNode NAT() {
            return getToken(PairingsParser.NAT, 0);
        }

        public DeadheadContext deadhead() {
            return getRuleContext(DeadheadContext.class, 0);
        }

        public AirlineContext airline() {
            return getRuleContext(AirlineContext.class, 0);
        }

        public FlightContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_flight;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof PairingsListener)
                ((PairingsListener) listener).enterFlight(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof PairingsListener)
                ((PairingsListener) listener).exitFlight(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof PairingsVisitor)
                return ((PairingsVisitor<? extends T>) visitor).visitFlight(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final FlightContext flight() throws RecognitionException {
        FlightContext _localctx = new FlightContext(_ctx, getState());
        enterRule(_localctx, 100, RULE_flight);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(404);
                _errHandler.sync(this);
                switch (_input.LA(1)) {
                case DEADHEAD: {
                    setState(402);
                    deadhead();
                }
                    break;
                case AIRLINE: {
                    setState(403);
                    airline();
                }
                    break;
                case NAT:
                    break;
                default:
                    break;
                }
                setState(406);
                match(NAT);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class GroundContext extends ParserRuleContext {

        public TerminalNode GROUND() {
            return getToken(PairingsParser.GROUND, 0);
        }

        public TerminalNode NAT() {
            return getToken(PairingsParser.NAT, 0);
        }

        public GroundContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_ground;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof PairingsListener)
                ((PairingsListener) listener).enterGround(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof PairingsListener)
                ((PairingsListener) listener).exitGround(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof PairingsVisitor)
                return ((PairingsVisitor<? extends T>) visitor).visitGround(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final GroundContext ground() throws RecognitionException {
        GroundContext _localctx = new GroundContext(_ctx, getState());
        enterRule(_localctx, 102, RULE_ground);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(408);
                match(GROUND);
                setState(410);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == NAT) {
                    {
                        setState(409);
                        match(NAT);
                    }
                }

            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class DeadheadContext extends ParserRuleContext {

        public TerminalNode DEADHEAD() {
            return getToken(PairingsParser.DEADHEAD, 0);
        }

        public DeadheadContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_deadhead;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof PairingsListener)
                ((PairingsListener) listener).enterDeadhead(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof PairingsListener)
                ((PairingsListener) listener).exitDeadhead(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof PairingsVisitor)
                return ((PairingsVisitor<? extends T>) visitor).visitDeadhead(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final DeadheadContext deadhead() throws RecognitionException {
        DeadheadContext _localctx = new DeadheadContext(_ctx, getState());
        enterRule(_localctx, 104, RULE_deadhead);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(412);
                match(DEADHEAD);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class AirlineContext extends ParserRuleContext {

        public TerminalNode AIRLINE() {
            return getToken(PairingsParser.AIRLINE, 0);
        }

        public AirlineContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_airline;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof PairingsListener)
                ((PairingsListener) listener).enterAirline(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof PairingsListener)
                ((PairingsListener) listener).exitAirline(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof PairingsVisitor)
                return ((PairingsVisitor<? extends T>) visitor).visitAirline(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final AirlineContext airline() throws RecognitionException {
        AirlineContext _localctx = new AirlineContext(_ctx, getState());
        enterRule(_localctx, 106, RULE_airline);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(414);
                match(AIRLINE);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class AircraftContext extends ParserRuleContext {

        public TerminalNode AIRCRAFT() {
            return getToken(PairingsParser.AIRCRAFT, 0);
        }

        public AircraftContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_aircraft;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof PairingsListener)
                ((PairingsListener) listener).enterAircraft(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof PairingsListener)
                ((PairingsListener) listener).exitAircraft(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof PairingsVisitor)
                return ((PairingsVisitor<? extends T>) visitor).visitAircraft(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final AircraftContext aircraft() throws RecognitionException {
        AircraftContext _localctx = new AircraftContext(_ctx, getState());
        enterRule(_localctx, 108, RULE_aircraft);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(416);
                match(AIRCRAFT);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class OriginContext extends ParserRuleContext {

        public TerminalNode BASE_IATA() {
            return getToken(PairingsParser.BASE_IATA, 0);
        }

        public TerminalNode IATA() {
            return getToken(PairingsParser.IATA, 0);
        }

        public OriginContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_origin;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof PairingsListener)
                ((PairingsListener) listener).enterOrigin(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof PairingsListener)
                ((PairingsListener) listener).exitOrigin(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof PairingsVisitor)
                return ((PairingsVisitor<? extends T>) visitor).visitOrigin(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final OriginContext origin() throws RecognitionException {
        OriginContext _localctx = new OriginContext(_ctx, getState());
        enterRule(_localctx, 110, RULE_origin);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(418);
                _la = _input.LA(1);
                if (!(_la == BASE_IATA || _la == IATA)) {
                    _errHandler.recoverInline(this);
                } else {
                    if (_input.LA(1) == Token.EOF)
                        matchedEOF = true;
                    _errHandler.reportMatch(this);
                    consume();
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class DestinationContext extends ParserRuleContext {

        public TerminalNode BASE_IATA() {
            return getToken(PairingsParser.BASE_IATA, 0);
        }

        public TerminalNode IATA() {
            return getToken(PairingsParser.IATA, 0);
        }

        public DestinationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_destination;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof PairingsListener)
                ((PairingsListener) listener).enterDestination(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof PairingsListener)
                ((PairingsListener) listener).exitDestination(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof PairingsVisitor)
                return ((PairingsVisitor<? extends T>) visitor).visitDestination(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final DestinationContext destination() throws RecognitionException {
        DestinationContext _localctx = new DestinationContext(_ctx, getState());
        enterRule(_localctx, 112, RULE_destination);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(420);
                _la = _input.LA(1);
                if (!(_la == BASE_IATA || _la == IATA)) {
                    _errHandler.recoverInline(this);
                } else {
                    if (_input.LA(1) == Token.EOF)
                        matchedEOF = true;
                    _errHandler.reportMatch(this);
                    consume();
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class OutContext extends ParserRuleContext {

        public TimeContext time() {
            return getRuleContext(TimeContext.class, 0);
        }

        public OutContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_out;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof PairingsListener)
                ((PairingsListener) listener).enterOut(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof PairingsListener)
                ((PairingsListener) listener).exitOut(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof PairingsVisitor)
                return ((PairingsVisitor<? extends T>) visitor).visitOut(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final OutContext out() throws RecognitionException {
        OutContext _localctx = new OutContext(_ctx, getState());
        enterRule(_localctx, 114, RULE_out);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(422);
                time();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class InContext extends ParserRuleContext {

        public TimeContext time() {
            return getRuleContext(TimeContext.class, 0);
        }

        public InContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_in;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof PairingsListener)
                ((PairingsListener) listener).enterIn(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof PairingsListener)
                ((PairingsListener) listener).exitIn(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof PairingsVisitor)
                return ((PairingsVisitor<? extends T>) visitor).visitIn(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final InContext in() throws RecognitionException {
        InContext _localctx = new InContext(_ctx, getState());
        enterRule(_localctx, 116, RULE_in);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(424);
                time();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class BlockContext extends ParserRuleContext {

        public DurationContext duration() {
            return getRuleContext(DurationContext.class, 0);
        }

        public BlockContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_block;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof PairingsListener)
                ((PairingsListener) listener).enterBlock(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof PairingsListener)
                ((PairingsListener) listener).exitBlock(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof PairingsVisitor)
                return ((PairingsVisitor<? extends T>) visitor).visitBlock(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final BlockContext block() throws RecognitionException {
        BlockContext _localctx = new BlockContext(_ctx, getState());
        enterRule(_localctx, 118, RULE_block);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(426);
                duration();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class TogContext extends ParserRuleContext {

        public DurationContext duration() {
            return getRuleContext(DurationContext.class, 0);
        }

        public TerminalNode ASTERISK() {
            return getToken(PairingsParser.ASTERISK, 0);
        }

        public TogContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_tog;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof PairingsListener)
                ((PairingsListener) listener).enterTog(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof PairingsListener)
                ((PairingsListener) listener).exitTog(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof PairingsVisitor)
                return ((PairingsVisitor<? extends T>) visitor).visitTog(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final TogContext tog() throws RecognitionException {
        TogContext _localctx = new TogContext(_ctx, getState());
        enterRule(_localctx, 120, RULE_tog);
        try {
            setState(433);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 32, _ctx)) {
            case 1:
                enterOuterAlt(_localctx, 1); {
                setState(428);
                duration();
            }
                break;
            case 2:
                enterOuterAlt(_localctx, 2); {
                setState(429);
                duration();
                setState(430);
                match(ASTERISK);
            }
                break;
            case 3:
                enterOuterAlt(_localctx, 3); {
                setState(432);
                match(ASTERISK);
            }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class CreditContext extends ParserRuleContext {

        public DurationContext duration() {
            return getRuleContext(DurationContext.class, 0);
        }

        public CreditAnnotationContext creditAnnotation() {
            return getRuleContext(CreditAnnotationContext.class, 0);
        }

        public CreditContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_credit;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof PairingsListener)
                ((PairingsListener) listener).enterCredit(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof PairingsListener)
                ((PairingsListener) listener).exitCredit(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof PairingsVisitor)
                return ((PairingsVisitor<? extends T>) visitor).visitCredit(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final CreditContext credit() throws RecognitionException {
        CreditContext _localctx = new CreditContext(_ctx, getState());
        enterRule(_localctx, 122, RULE_credit);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(435);
                duration();
                setState(437);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == CREDIT_ANNOTATION) {
                    {
                        setState(436);
                        creditAnnotation();
                    }
                }

            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class CreditAnnotationContext extends ParserRuleContext {

        public TerminalNode CREDIT_ANNOTATION() {
            return getToken(PairingsParser.CREDIT_ANNOTATION, 0);
        }

        public CreditAnnotationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_creditAnnotation;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof PairingsListener)
                ((PairingsListener) listener).enterCreditAnnotation(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof PairingsListener)
                ((PairingsListener) listener).exitCreditAnnotation(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof PairingsVisitor)
                return ((PairingsVisitor<? extends T>) visitor).visitCreditAnnotation(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final CreditAnnotationContext creditAnnotation() throws RecognitionException {
        CreditAnnotationContext _localctx = new CreditAnnotationContext(_ctx, getState());
        enterRule(_localctx, 124, RULE_creditAnnotation);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(439);
                match(CREDIT_ANNOTATION);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class LayoverDurationContext extends ParserRuleContext {

        public DurationContext duration() {
            return getRuleContext(DurationContext.class, 0);
        }

        public LayoverDurationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_layoverDuration;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof PairingsListener)
                ((PairingsListener) listener).enterLayoverDuration(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof PairingsListener)
                ((PairingsListener) listener).exitLayoverDuration(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof PairingsVisitor)
                return ((PairingsVisitor<? extends T>) visitor).visitLayoverDuration(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final LayoverDurationContext layoverDuration() throws RecognitionException {
        LayoverDurationContext _localctx = new LayoverDurationContext(_ctx, getState());
        enterRule(_localctx, 126, RULE_layoverDuration);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(441);
                duration();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class TransportationDurationContext extends ParserRuleContext {

        public DurationContext duration() {
            return getRuleContext(DurationContext.class, 0);
        }

        public TerminalNode TWICE() {
            return getToken(PairingsParser.TWICE, 0);
        }

        public TransportationDurationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_transportationDuration;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof PairingsListener)
                ((PairingsListener) listener).enterTransportationDuration(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof PairingsListener)
                ((PairingsListener) listener).exitTransportationDuration(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof PairingsVisitor)
                return ((PairingsVisitor<? extends T>) visitor).visitTransportationDuration(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final TransportationDurationContext transportationDuration() throws RecognitionException {
        TransportationDurationContext _localctx = new TransportationDurationContext(_ctx, getState());
        enterRule(_localctx, 128, RULE_transportationDuration);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(443);
                duration();
                setState(444);
                match(TWICE);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class RestDurationContext extends ParserRuleContext {

        public DurationContext duration() {
            return getRuleContext(DurationContext.class, 0);
        }

        public RestDurationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_restDuration;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof PairingsListener)
                ((PairingsListener) listener).enterRestDuration(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof PairingsListener)
                ((PairingsListener) listener).exitRestDuration(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof PairingsVisitor)
                return ((PairingsVisitor<? extends T>) visitor).visitRestDuration(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final RestDurationContext restDuration() throws RecognitionException {
        RestDurationContext _localctx = new RestDurationContext(_ctx, getState());
        enterRule(_localctx, 130, RULE_restDuration);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(446);
                duration();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class HoursContext extends ParserRuleContext {

        public TerminalNode NATREAL() {
            return getToken(PairingsParser.NATREAL, 0);
        }

        public HoursContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_hours;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof PairingsListener)
                ((PairingsListener) listener).enterHours(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof PairingsListener)
                ((PairingsListener) listener).exitHours(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof PairingsVisitor)
                return ((PairingsVisitor<? extends T>) visitor).visitHours(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final HoursContext hours() throws RecognitionException {
        HoursContext _localctx = new HoursContext(_ctx, getState());
        enterRule(_localctx, 132, RULE_hours);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(448);
                match(NATREAL);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class TimeContext extends ParserRuleContext {

        public TerminalNode TIME() {
            return getToken(PairingsParser.TIME, 0);
        }

        public TimeContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_time;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof PairingsListener)
                ((PairingsListener) listener).enterTime(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof PairingsListener)
                ((PairingsListener) listener).exitTime(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof PairingsVisitor)
                return ((PairingsVisitor<? extends T>) visitor).visitTime(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final TimeContext time() throws RecognitionException {
        TimeContext _localctx = new TimeContext(_ctx, getState());
        enterRule(_localctx, 134, RULE_time);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(450);
                match(TIME);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class DurationContext extends ParserRuleContext {

        public TerminalNode DURATION() {
            return getToken(PairingsParser.DURATION, 0);
        }

        public DurationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_duration;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof PairingsListener)
                ((PairingsListener) listener).enterDuration(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof PairingsListener)
                ((PairingsListener) listener).exitDuration(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof PairingsVisitor)
                return ((PairingsVisitor<? extends T>) visitor).visitDuration(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final DurationContext duration() throws RecognitionException {
        DurationContext _localctx = new DurationContext(_ctx, getState());
        enterRule(_localctx, 136, RULE_duration);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(452);
                match(DURATION);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class DutyDayContext extends ParserRuleContext {

        public DayOfDutyContext dayOfDuty() {
            return getRuleContext(DayOfDutyContext.class, 0);
        }

        public WeekdayContext weekday() {
            return getRuleContext(WeekdayContext.class, 0);
        }

        public DutyDayContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_dutyDay;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof PairingsListener)
                ((PairingsListener) listener).enterDutyDay(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof PairingsListener)
                ((PairingsListener) listener).exitDutyDay(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof PairingsVisitor)
                return ((PairingsVisitor<? extends T>) visitor).visitDutyDay(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final DutyDayContext dutyDay() throws RecognitionException {
        DutyDayContext _localctx = new DutyDayContext(_ctx, getState());
        enterRule(_localctx, 138, RULE_dutyDay);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(455);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == WEEKDAY) {
                    {
                        setState(454);
                        weekday();
                    }
                }

                setState(457);
                dayOfDuty();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class WeekdayContext extends ParserRuleContext {

        public TerminalNode WEEKDAY() {
            return getToken(PairingsParser.WEEKDAY, 0);
        }

        public WeekdayContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_weekday;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof PairingsListener)
                ((PairingsListener) listener).enterWeekday(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof PairingsListener)
                ((PairingsListener) listener).exitWeekday(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof PairingsVisitor)
                return ((PairingsVisitor<? extends T>) visitor).visitWeekday(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final WeekdayContext weekday() throws RecognitionException {
        WeekdayContext _localctx = new WeekdayContext(_ctx, getState());
        enterRule(_localctx, 140, RULE_weekday);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(459);
                match(WEEKDAY);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class DayOfDutyContext extends ParserRuleContext {

        public TerminalNode NAT() {
            return getToken(PairingsParser.NAT, 0);
        }

        public DayOfDutyContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_dayOfDuty;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof PairingsListener)
                ((PairingsListener) listener).enterDayOfDuty(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof PairingsListener)
                ((PairingsListener) listener).exitDayOfDuty(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof PairingsVisitor)
                return ((PairingsVisitor<? extends T>) visitor).visitDayOfDuty(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final DayOfDutyContext dayOfDuty() throws RecognitionException {
        DayOfDutyContext _localctx = new DayOfDutyContext(_ctx, getState());
        enterRule(_localctx, 142, RULE_dayOfDuty);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(461);
                match(NAT);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
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
            return getRuleContext(FooterSeparatorContext.class, i);
        }

        public SummaryContext summary() {
            return getRuleContext(SummaryContext.class, 0);
        }

        public FooterContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_footer;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof PairingsListener)
                ((PairingsListener) listener).enterFooter(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof PairingsListener)
                ((PairingsListener) listener).exitFooter(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof PairingsVisitor)
                return ((PairingsVisitor<? extends T>) visitor).visitFooter(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final FooterContext footer() throws RecognitionException {
        FooterContext _localctx = new FooterContext(_ctx, getState());
        enterRule(_localctx, 144, RULE_footer);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(463);
                footerSeparator();
                setState(464);
                summary();
                setState(465);
                footerSeparator();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class FooterSeparatorContext extends ParserRuleContext {

        public TerminalNode UNDERLINE() {
            return getToken(PairingsParser.UNDERLINE, 0);
        }

        public FooterSeparatorContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_footerSeparator;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof PairingsListener)
                ((PairingsListener) listener).enterFooterSeparator(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof PairingsListener)
                ((PairingsListener) listener).exitFooterSeparator(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof PairingsVisitor)
                return ((PairingsVisitor<? extends T>) visitor).visitFooterSeparator(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final FooterSeparatorContext footerSeparator() throws RecognitionException {
        FooterSeparatorContext _localctx = new FooterSeparatorContext(_ctx, getState());
        enterRule(_localctx, 146, RULE_footerSeparator);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(467);
                match(UNDERLINE);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class SummaryContext extends ParserRuleContext {

        public TafbSummaryContext tafbSummary() {
            return getRuleContext(TafbSummaryContext.class, 0);
        }

        public CreditSummaryContext creditSummary() {
            return getRuleContext(CreditSummaryContext.class, 0);
        }

        public PerdiemSummaryContext perdiemSummary() {
            return getRuleContext(PerdiemSummaryContext.class, 0);
        }

        public SummaryContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_summary;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof PairingsListener)
                ((PairingsListener) listener).enterSummary(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof PairingsListener)
                ((PairingsListener) listener).exitSummary(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof PairingsVisitor)
                return ((PairingsVisitor<? extends T>) visitor).visitSummary(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final SummaryContext summary() throws RecognitionException {
        SummaryContext _localctx = new SummaryContext(_ctx, getState());
        enterRule(_localctx, 148, RULE_summary);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(469);
                tafbSummary();
                setState(470);
                creditSummary();
                setState(471);
                perdiemSummary();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class TafbSummaryContext extends ParserRuleContext {

        public TerminalNode TAFB() {
            return getToken(PairingsParser.TAFB, 0);
        }

        public TerminalNode COLON() {
            return getToken(PairingsParser.COLON, 0);
        }

        public DurationContext duration() {
            return getRuleContext(DurationContext.class, 0);
        }

        public TafbSummaryContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_tafbSummary;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof PairingsListener)
                ((PairingsListener) listener).enterTafbSummary(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof PairingsListener)
                ((PairingsListener) listener).exitTafbSummary(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof PairingsVisitor)
                return ((PairingsVisitor<? extends T>) visitor).visitTafbSummary(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final TafbSummaryContext tafbSummary() throws RecognitionException {
        TafbSummaryContext _localctx = new TafbSummaryContext(_ctx, getState());
        enterRule(_localctx, 150, RULE_tafbSummary);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(473);
                match(TAFB);
                setState(474);
                match(COLON);
                setState(475);
                duration();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class CreditSummaryContext extends ParserRuleContext {

        public TerminalNode CREDIT() {
            return getToken(PairingsParser.CREDIT, 0);
        }

        public TerminalNode COLON() {
            return getToken(PairingsParser.COLON, 0);
        }

        public CreditContext credit() {
            return getRuleContext(CreditContext.class, 0);
        }

        public CreditSummaryContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_creditSummary;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof PairingsListener)
                ((PairingsListener) listener).enterCreditSummary(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof PairingsListener)
                ((PairingsListener) listener).exitCreditSummary(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof PairingsVisitor)
                return ((PairingsVisitor<? extends T>) visitor).visitCreditSummary(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final CreditSummaryContext creditSummary() throws RecognitionException {
        CreditSummaryContext _localctx = new CreditSummaryContext(_ctx, getState());
        enterRule(_localctx, 152, RULE_creditSummary);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(477);
                match(CREDIT);
                setState(478);
                match(COLON);
                setState(479);
                credit();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class PerdiemSummaryContext extends ParserRuleContext {

        public TerminalNode PERDIEM() {
            return getToken(PairingsParser.PERDIEM, 0);
        }

        public TerminalNode COLON() {
            return getToken(PairingsParser.COLON, 0);
        }

        public HoursContext hours() {
            return getRuleContext(HoursContext.class, 0);
        }

        public PerdiemSummaryContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_perdiemSummary;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof PairingsListener)
                ((PairingsListener) listener).enterPerdiemSummary(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof PairingsListener)
                ((PairingsListener) listener).exitPerdiemSummary(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof PairingsVisitor)
                return ((PairingsVisitor<? extends T>) visitor).visitPerdiemSummary(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final PerdiemSummaryContext perdiemSummary() throws RecognitionException {
        PerdiemSummaryContext _localctx = new PerdiemSummaryContext(_ctx, getState());
        enterRule(_localctx, 154, RULE_perdiemSummary);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(481);
                match(PERDIEM);
                setState(482);
                match(COLON);
                setState(483);
                hours();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static final String _serializedATN = "\u0004\u00013\u01e6\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"
            + "\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"
            + "\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"
            + "\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"
            + "\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"
            + "\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"
            + "\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"
            + "\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"
            + "\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"
            + "\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"
            + "\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"
            + "#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"
            + "(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"
            + "-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"
            + "2\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u00076\u0002"
            + "7\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007;\u0002"
            + "<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007@\u0002"
            + "A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007E\u0002"
            + "F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007I\u0002J\u0007J\u0002"
            + "K\u0007K\u0002L\u0007L\u0002M\u0007M\u0001\u0000\u0005\u0000\u009e\b\u0000"
            + "\n\u0000\f\u0000\u00a1\t\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"
            + "\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0003"
            + "\u0003\u00ac\b\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"
            + "\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001"
            + "\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b"
            + "\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b"
            + "\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"
            + "\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f"
            + "\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012"
            + "\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014"
            + "\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016"
            + "\u0001\u0017\u0001\u0017\u0001\u0017\u0004\u0017\u00ec\b\u0017\u000b\u0017"
            + "\f\u0017\u00ed\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019"
            + "\u0001\u0019\u0003\u0019\u00f6\b\u0019\u0001\u001a\u0001\u001a\u0001\u001a"
            + "\u0001\u001b\u0001\u001b\u0001\u001c\u0005\u001c\u00fe\b\u001c\n\u001c"
            + "\f\u001c\u0101\t\u001c\u0001\u001d\u0003\u001d\u0104\b\u001d\u0001\u001d"
            + "\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u010a\b\u001d\u0001\u001e"
            + "\u0003\u001e\u010d\b\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f"
            + "\u0001 \u0004 \u0114\b \u000b \f \u0115\u0001!\u0001!\u0003!\u011a\b!"
            + "\u0001\"\u0001\"\u0001\"\u0003\"\u011f\b\"\u0001#\u0001#\u0001$\u0003"
            + "$\u0124\b$\u0001$\u0001$\u0001$\u0003$\u0129\b$\u0001%\u0001%\u0001&\u0001"
            + "&\u0001\'\u0003\'\u0130\b\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001"
            + "\'\u0001(\u0001(\u0001)\u0001)\u0001*\u0001*\u0003*\u013e\b*\u0001+\u0001"
            + "+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0003+\u0148\b+\u0001+\u0001"
            + "+\u0003+\u014c\b+\u0001+\u0003+\u014f\b+\u0001,\u0001,\u0001,\u0001,\u0001"
            + ",\u0001,\u0001,\u0001,\u0001,\u0001-\u0001-\u0003-\u015c\b-\u0001-\u0001"
            + "-\u0003-\u0160\b-\u0001-\u0001-\u0001.\u0001.\u0001.\u0003.\u0167\b.\u0003"
            + ".\u0169\b.\u0001.\u0003.\u016c\b.\u0001.\u0005.\u016f\b.\n.\f.\u0172\t"
            + ".\u0001.\u0003.\u0175\b.\u0001/\u0005/\u0178\b/\n/\f/\u017b\t/\u0001/"
            + "\u0003/\u017e\b/\u00010\u00010\u00010\u00010\u00010\u00010\u00011\u0003"
            + "1\u0187\b1\u00011\u00011\u00031\u018b\b1\u00011\u00051\u018e\b1\n1\f1"
            + "\u0191\t1\u00012\u00012\u00032\u0195\b2\u00012\u00012\u00013\u00013\u0003"
            + "3\u019b\b3\u00014\u00014\u00015\u00015\u00016\u00016\u00017\u00017\u0001"
            + "8\u00018\u00019\u00019\u0001:\u0001:\u0001;\u0001;\u0001<\u0001<\u0001"
            + "<\u0001<\u0001<\u0003<\u01b2\b<\u0001=\u0001=\u0003=\u01b6\b=\u0001>\u0001"
            + ">\u0001?\u0001?\u0001@\u0001@\u0001@\u0001A\u0001A\u0001B\u0001B\u0001"
            + "C\u0001C\u0001D\u0001D\u0001E\u0003E\u01c8\bE\u0001E\u0001E\u0001F\u0001"
            + "F\u0001G\u0001G\u0001H\u0001H\u0001H\u0001H\u0001I\u0001I\u0001J\u0001"
            + "J\u0001J\u0001J\u0001K\u0001K\u0001K\u0001K\u0001L\u0001L\u0001L\u0001"
            + "L\u0001M\u0001M\u0001M\u0001M\u0001M\u0000\u0000N\u0000\u0002\u0004\u0006"
            + "\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,."
            + "02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088"
            + "\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u0000\u0005\u0001"
            + "\u0000\u0006\t\u0001\u0000\u001f \u0004\u0000\u000f\u000f\u0014\u0014"
            + "\u001c\u001c22\u0005\u0000\u000f\u000f\u0014\u0014\u001f ..22\u0002\u0000"
            + "\u0006\u0006\u0014\u0014\u01be\u0000\u009f\u0001\u0000\u0000\u0000\u0002"
            + "\u00a2\u0001\u0000\u0000\u0000\u0004\u00a6\u0001\u0000\u0000\u0000\u0006"
            + "\u00ab\u0001\u0000\u0000\u0000\b\u00ad\u0001\u0000\u0000\u0000\n\u00af"
            + "\u0001\u0000\u0000\u0000\f\u00b2\u0001\u0000\u0000\u0000\u000e\u00b6\u0001"
            + "\u0000\u0000\u0000\u0010\u00bc\u0001\u0000\u0000\u0000\u0012\u00be\u0001"
            + "\u0000\u0000\u0000\u0014\u00c1\u0001\u0000\u0000\u0000\u0016\u00c4\u0001"
            + "\u0000\u0000\u0000\u0018\u00c6\u0001\u0000\u0000\u0000\u001a\u00c8\u0001"
            + "\u0000\u0000\u0000\u001c\u00d2\u0001\u0000\u0000\u0000\u001e\u00d4\u0001"
            + "\u0000\u0000\u0000 \u00d6\u0001\u0000\u0000\u0000\"\u00d8\u0001\u0000"
            + "\u0000\u0000$\u00da\u0001\u0000\u0000\u0000&\u00dc\u0001\u0000\u0000\u0000"
            + "(\u00e0\u0001\u0000\u0000\u0000*\u00e4\u0001\u0000\u0000\u0000,\u00e6"
            + "\u0001\u0000\u0000\u0000.\u00eb\u0001\u0000\u0000\u00000\u00ef\u0001\u0000"
            + "\u0000\u00002\u00f5\u0001\u0000\u0000\u00004\u00f7\u0001\u0000\u0000\u0000"
            + "6\u00fa\u0001\u0000\u0000\u00008\u00ff\u0001\u0000\u0000\u0000:\u0103"
            + "\u0001\u0000\u0000\u0000<\u010c\u0001\u0000\u0000\u0000>\u0110\u0001\u0000"
            + "\u0000\u0000@\u0113\u0001\u0000\u0000\u0000B\u0119\u0001\u0000\u0000\u0000"
            + "D\u011b\u0001\u0000\u0000\u0000F\u0120\u0001\u0000\u0000\u0000H\u0123"
            + "\u0001\u0000\u0000\u0000J\u012a\u0001\u0000\u0000\u0000L\u012c\u0001\u0000"
            + "\u0000\u0000N\u012f\u0001\u0000\u0000\u0000P\u0137\u0001\u0000\u0000\u0000"
            + "R\u0139\u0001\u0000\u0000\u0000T\u013d\u0001\u0000\u0000\u0000V\u013f"
            + "\u0001\u0000\u0000\u0000X\u0150\u0001\u0000\u0000\u0000Z\u0159\u0001\u0000"
            + "\u0000\u0000\\\u016b\u0001\u0000\u0000\u0000^\u0179\u0001\u0000\u0000"
            + "\u0000`\u017f\u0001\u0000\u0000\u0000b\u0186\u0001\u0000\u0000\u0000d"
            + "\u0194\u0001\u0000\u0000\u0000f\u0198\u0001\u0000\u0000\u0000h\u019c\u0001"
            + "\u0000\u0000\u0000j\u019e\u0001\u0000\u0000\u0000l\u01a0\u0001\u0000\u0000"
            + "\u0000n\u01a2\u0001\u0000\u0000\u0000p\u01a4\u0001\u0000\u0000\u0000r"
            + "\u01a6\u0001\u0000\u0000\u0000t\u01a8\u0001\u0000\u0000\u0000v\u01aa\u0001"
            + "\u0000\u0000\u0000x\u01b1\u0001\u0000\u0000\u0000z\u01b3\u0001\u0000\u0000"
            + "\u0000|\u01b7\u0001\u0000\u0000\u0000~\u01b9\u0001\u0000\u0000\u0000\u0080"
            + "\u01bb\u0001\u0000\u0000\u0000\u0082\u01be\u0001\u0000\u0000\u0000\u0084"
            + "\u01c0\u0001\u0000\u0000\u0000\u0086\u01c2\u0001\u0000\u0000\u0000\u0088"
            + "\u01c4\u0001\u0000\u0000\u0000\u008a\u01c7\u0001\u0000\u0000\u0000\u008c"
            + "\u01cb\u0001\u0000\u0000\u0000\u008e\u01cd\u0001\u0000\u0000\u0000\u0090"
            + "\u01cf\u0001\u0000\u0000\u0000\u0092\u01d3\u0001\u0000\u0000\u0000\u0094"
            + "\u01d5\u0001\u0000\u0000\u0000\u0096\u01d9\u0001\u0000\u0000\u0000\u0098"
            + "\u01dd\u0001\u0000\u0000\u0000\u009a\u01e1\u0001\u0000\u0000\u0000\u009c"
            + "\u009e\u0003\u0002\u0001\u0000\u009d\u009c\u0001\u0000\u0000\u0000\u009e"
            + "\u00a1\u0001\u0000\u0000\u0000\u009f\u009d\u0001\u0000\u0000\u0000\u009f"
            + "\u00a0\u0001\u0000\u0000\u0000\u00a0\u0001\u0001\u0000\u0000\u0000\u00a1"
            + "\u009f\u0001\u0000\u0000\u0000\u00a2\u00a3\u0003\u0004\u0002\u0000\u00a3"
            + "\u00a4\u00038\u001c\u0000\u00a4\u00a5\u0003\u0090H\u0000\u00a5\u0003\u0001"
            + "\u0000\u0000\u0000\u00a6\u00a7\u0003\u0006\u0003\u0000\u00a7\u00a8\u0003"
            + "\b\u0004\u0000\u00a8\u0005\u0001\u0000\u0000\u0000\u00a9\u00ac\u0003\n"
            + "\u0005\u0000\u00aa\u00ac\u0003\f\u0006\u0000\u00ab\u00a9\u0001\u0000\u0000"
            + "\u0000\u00ab\u00aa\u0001\u0000\u0000\u0000\u00ac\u0007\u0001\u0000\u0000"
            + "\u0000\u00ad\u00ae\u0005%\u0000\u0000\u00ae\t\u0001\u0000\u0000\u0000"
            + "\u00af\u00b0\u0003\u0010\b\u0000\u00b0\u00b1\u0003\u000e\u0007\u0000\u00b1"
            + "\u000b\u0001\u0000\u0000\u0000\u00b2\u00b3\u0003\u0014\n\u0000\u00b3\u00b4"
            + "\u0003\u0016\u000b\u0000\u00b4\u00b5\u0003\u000e\u0007\u0000\u00b5\r\u0001"
            + "\u0000\u0000\u0000\u00b6\u00b7\u0003\u0018\f\u0000\u00b7\u00b8\u0003\u001a"
            + "\r\u0000\u00b8\u00b9\u0003\u0012\t\u0000\u00b9\u00ba\u0003$\u0012\u0000"
            + "\u00ba\u00bb\u0003&\u0013\u0000\u00bb\u000f\u0001\u0000\u0000\u0000\u00bc"
            + "\u00bd\u0005\u001e\u0000\u0000\u00bd\u0011\u0001\u0000\u0000\u0000\u00be"
            + "\u00bf\u0005\u001f\u0000\u0000\u00bf\u00c0\u0005\f\u0000\u0000\u00c0\u0013"
            + "\u0001\u0000\u0000\u0000\u00c1\u00c2\u0005$\u0000\u0000\u00c2\u00c3\u0005"
            + "\u0014\u0000\u0000\u00c3\u0015\u0001\u0000\u0000\u0000\u00c4\u00c5\u0005"
            + "!\u0000\u0000\u00c5\u0017\u0001\u0000\u0000\u0000\u00c6\u00c7\u0005\""
            + "\u0000\u0000\u00c7\u0019\u0001\u0000\u0000\u0000\u00c8\u00c9\u0005\u0003"
            + "\u0000\u0000\u00c9\u00ca\u0003\u001c\u000e\u0000\u00ca\u00cb\u0005\u000b"
            + "\u0000\u0000\u00cb\u00cc\u0003\u001e\u000f\u0000\u00cc\u00cd\u0005\u000b"
            + "\u0000\u0000\u00cd\u00ce\u0003 \u0010\u0000\u00ce\u00cf\u0005\u000b\u0000"
            + "\u0000\u00cf\u00d0\u0003\"\u0011\u0000\u00d0\u00d1\u0005\u0004\u0000\u0000"
            + "\u00d1\u001b\u0001\u0000\u0000\u0000\u00d2\u00d3\u0005\u0014\u0000\u0000"
            + "\u00d3\u001d\u0001\u0000\u0000\u0000\u00d4\u00d5\u0005\u0014\u0000\u0000"
            + "\u00d5\u001f\u0001\u0000\u0000\u0000\u00d6\u00d7\u0005\u0014\u0000\u0000"
            + "\u00d7!\u0001\u0000\u0000\u0000\u00d8\u00d9\u0005\u0014\u0000\u0000\u00d9"
            + "#\u0001\u0000\u0000\u0000\u00da\u00db\u0005\u0011\u0000\u0000\u00db%\u0001"
            + "\u0000\u0000\u0000\u00dc\u00dd\u0005\'\u0000\u0000\u00dd\u00de\u0003("
            + "\u0014\u0000\u00de\u00df\u00032\u0019\u0000\u00df\'\u0001\u0000\u0000"
            + "\u0000\u00e0\u00e1\u0003*\u0015\u0000\u00e1\u00e2\u00030\u0018\u0000\u00e2"
            + "\u00e3\u0003,\u0016\u0000\u00e3)\u0001\u0000\u0000\u0000\u00e4\u00e5\u0005"
            + "\u0013\u0000\u0000\u00e5+\u0001\u0000\u0000\u0000\u00e6\u00e7\u0005\u0014"
            + "\u0000\u0000\u00e7-\u0001\u0000\u0000\u0000\u00e8\u00e9\u0003*\u0015\u0000"
            + "\u00e9\u00ea\u0003,\u0016\u0000\u00ea\u00ec\u0001\u0000\u0000\u0000\u00eb"
            + "\u00e8\u0001\u0000\u0000\u0000\u00ec\u00ed\u0001\u0000\u0000\u0000\u00ed"
            + "\u00eb\u0001\u0000\u0000\u0000\u00ed\u00ee\u0001\u0000\u0000\u0000\u00ee"
            + "/\u0001\u0000\u0000\u0000\u00ef\u00f0\u0003,\u0016\u0000\u00f0\u00f1\u0005"
            + "\u0006\u0000\u0000\u00f1\u00f2\u0003*\u0015\u0000\u00f21\u0001\u0000\u0000"
            + "\u0000\u00f3\u00f6\u00034\u001a\u0000\u00f4\u00f6\u00036\u001b\u0000\u00f5"
            + "\u00f3\u0001\u0000\u0000\u0000\u00f5\u00f4\u0001\u0000\u0000\u0000\u00f6"
            + "3\u0001\u0000\u0000\u0000\u00f7\u00f8\u0005(\u0000\u0000\u00f8\u00f9\u0003"
            + ".\u0017\u0000\u00f95\u0001\u0000\u0000\u0000\u00fa\u00fb\u0005)\u0000"
            + "\u0000\u00fb7\u0001\u0000\u0000\u0000\u00fc\u00fe\u0003:\u001d\u0000\u00fd"
            + "\u00fc\u0001\u0000\u0000\u0000\u00fe\u0101\u0001\u0000\u0000\u0000\u00ff"
            + "\u00fd\u0001\u0000\u0000\u0000\u00ff\u0100\u0001\u0000\u0000\u0000\u0100"
            + "9\u0001\u0000\u0000\u0000\u0101\u00ff\u0001\u0000\u0000\u0000\u0102\u0104"
            + "\u0003<\u001e\u0000\u0103\u0102\u0001\u0000\u0000\u0000\u0103\u0104\u0001"
            + "\u0000\u0000\u0000\u0104\u0109\u0001\u0000\u0000\u0000\u0105\u010a\u0003"
            + "D\"\u0000\u0106\u010a\u0003H$\u0000\u0107\u010a\u0003N\'\u0000\u0108\u010a"
            + "\u0003T*\u0000\u0109\u0105\u0001\u0000\u0000\u0000\u0109\u0106\u0001\u0000"
            + "\u0000\u0000\u0109\u0107\u0001\u0000\u0000\u0000\u0109\u0108\u0001\u0000"
            + "\u0000\u0000\u010a;\u0001\u0000\u0000\u0000\u010b\u010d\u0003>\u001f\u0000"
            + "\u010c\u010b\u0001\u0000\u0000\u0000\u010c\u010d\u0001\u0000\u0000\u0000"
            + "\u010d\u010e\u0001\u0000\u0000\u0000\u010e\u010f\u0003@ \u0000\u010f="
            + "\u0001\u0000\u0000\u0000\u0110\u0111\u0005\u000f\u0000\u0000\u0111?\u0001"
            + "\u0000\u0000\u0000\u0112\u0114\u0003B!\u0000\u0113\u0112\u0001\u0000\u0000"
            + "\u0000\u0114\u0115\u0001\u0000\u0000\u0000\u0115\u0113\u0001\u0000\u0000"
            + "\u0000\u0115\u0116\u0001\u0000\u0000\u0000\u0116A\u0001\u0000\u0000\u0000"
            + "\u0117\u011a\u0005\u0007\u0000\u0000\u0118\u011a\u0003,\u0016\u0000\u0119"
            + "\u0117\u0001\u0000\u0000\u0000\u0119\u0118\u0001\u0000\u0000\u0000\u011a"
            + "C\u0001\u0000\u0000\u0000\u011b\u011e\u0005\b\u0000\u0000\u011c\u011f"
            + "\u0003F#\u0000\u011d\u011f\u0003Z-\u0000\u011e\u011c\u0001\u0000\u0000"
            + "\u0000\u011e\u011d\u0001\u0000\u0000\u0000\u011fE\u0001\u0000\u0000\u0000"
            + "\u0120\u0121\u0005&\u0000\u0000\u0121G\u0001\u0000\u0000\u0000\u0122\u0124"
            + "\u0003J%\u0000\u0123\u0122\u0001\u0000\u0000\u0000\u0123\u0124\u0001\u0000"
            + "\u0000\u0000\u0124\u0125\u0001\u0000\u0000\u0000\u0125\u0126\u0003r9\u0000"
            + "\u0126\u0128\u0003x<\u0000\u0127\u0129\u0003L&\u0000\u0128\u0127\u0001"
            + "\u0000\u0000\u0000\u0128\u0129\u0001\u0000\u0000\u0000\u0129I\u0001\u0000"
            + "\u0000\u0000\u012a\u012b\u0005\u001a\u0000\u0000\u012bK\u0001\u0000\u0000"
            + "\u0000\u012c\u012d\u0005*\u0000\u0000\u012dM\u0001\u0000\u0000\u0000\u012e"
            + "\u0130\u0003P(\u0000\u012f\u012e\u0001\u0000\u0000\u0000\u012f\u0130\u0001"
            + "\u0000\u0000\u0000\u0130\u0131\u0001\u0000\u0000\u0000\u0131\u0132\u0003"
            + "t:\u0000\u0132\u0133\u0003v;\u0000\u0133\u0134\u0003x<\u0000\u0134\u0135"
            + "\u0003R)\u0000\u0135\u0136\u0003z=\u0000\u0136O\u0001\u0000\u0000\u0000"
            + "\u0137\u0138\u0005\u001b\u0000\u0000\u0138Q\u0001\u0000\u0000\u0000\u0139"
            + "\u013a\u0003\u0088D\u0000\u013aS\u0001\u0000\u0000\u0000\u013b\u013e\u0003"
            + "V+\u0000\u013c\u013e\u0003X,\u0000\u013d\u013b\u0001\u0000\u0000\u0000"
            + "\u013d\u013c\u0001\u0000\u0000\u0000\u013eU\u0001\u0000\u0000\u0000\u013f"
            + "\u0140\u0003\u008aE\u0000\u0140\u0141\u0003d2\u0000\u0141\u0142\u0003"
            + "n7\u0000\u0142\u0143\u0003p8\u0000\u0143\u0144\u0003r9\u0000\u0144\u0145"
            + "\u0003t:\u0000\u0145\u0147\u0003v;\u0000\u0146\u0148\u0003x<\u0000\u0147"
            + "\u0146\u0001\u0000\u0000\u0000\u0147\u0148\u0001\u0000\u0000\u0000\u0148"
            + "\u0149\u0001\u0000\u0000\u0000\u0149\u014b\u0003z=\u0000\u014a\u014c\u0003"
            + "l6\u0000\u014b\u014a\u0001\u0000\u0000\u0000\u014b\u014c\u0001\u0000\u0000"
            + "\u0000\u014c\u014e\u0001\u0000\u0000\u0000\u014d\u014f\u0003\u001a\r\u0000"
            + "\u014e\u014d\u0001\u0000\u0000\u0000\u014e\u014f\u0001\u0000\u0000\u0000"
            + "\u014fW\u0001\u0000\u0000\u0000\u0150\u0151\u0003\u008aE\u0000\u0151\u0152"
            + "\u0003f3\u0000\u0152\u0153\u0003n7\u0000\u0153\u0154\u0003p8\u0000\u0154"
            + "\u0155\u0003r9\u0000\u0155\u0156\u0003t:\u0000\u0156\u0157\u0003v;\u0000"
            + "\u0157\u0158\u0003z=\u0000\u0158Y\u0001\u0000\u0000\u0000\u0159\u015b"
            + "\u0003\\.\u0000\u015a\u015c\u0005\u0005\u0000\u0000\u015b\u015a\u0001"
            + "\u0000\u0000\u0000\u015b\u015c\u0001\u0000\u0000\u0000\u015c\u015d\u0001"
            + "\u0000\u0000\u0000\u015d\u015f\u0003^/\u0000\u015e\u0160\u0007\u0000\u0000"
            + "\u0000\u015f\u015e\u0001\u0000\u0000\u0000\u015f\u0160\u0001\u0000\u0000"
            + "\u0000\u0160\u0161\u0001\u0000\u0000\u0000\u0161\u0162\u0003`0\u0000\u0162"
            + "[\u0001\u0000\u0000\u0000\u0163\u0168\u0007\u0001\u0000\u0000\u0164\u0166"
            + "\u0005\u0006\u0000\u0000\u0165\u0167\u0005\u000f\u0000\u0000\u0166\u0165"
            + "\u0001\u0000\u0000\u0000\u0166\u0167\u0001\u0000\u0000\u0000\u0167\u0169"
            + "\u0001\u0000\u0000\u0000\u0168\u0164\u0001\u0000\u0000\u0000\u0168\u0169"
            + "\u0001\u0000\u0000\u0000\u0169\u016a\u0001\u0000\u0000\u0000\u016a\u016c"
            + "\u0005.\u0000\u0000\u016b\u0163\u0001\u0000\u0000\u0000\u016b\u016c\u0001"
            + "\u0000\u0000\u0000\u016c\u0170\u0001\u0000\u0000\u0000\u016d\u016f\u0007"
            + "\u0002\u0000\u0000\u016e\u016d\u0001\u0000\u0000\u0000\u016f\u0172\u0001"
            + "\u0000\u0000\u0000\u0170\u016e\u0001\u0000\u0000\u0000\u0170\u0171\u0001"
            + "\u0000\u0000\u0000\u0171\u0174\u0001\u0000\u0000\u0000\u0172\u0170\u0001"
            + "\u0000\u0000\u0000\u0173\u0175\u0003b1\u0000\u0174\u0173\u0001\u0000\u0000"
            + "\u0000\u0174\u0175\u0001\u0000\u0000\u0000\u0175]\u0001\u0000\u0000\u0000"
            + "\u0176\u0178\u0007\u0003\u0000\u0000\u0177\u0176\u0001\u0000\u0000\u0000"
            + "\u0178\u017b\u0001\u0000\u0000\u0000\u0179\u0177\u0001\u0000\u0000\u0000"
            + "\u0179\u017a\u0001\u0000\u0000\u0000\u017a\u017d\u0001\u0000\u0000\u0000"
            + "\u017b\u0179\u0001\u0000\u0000\u0000\u017c\u017e\u0003b1\u0000\u017d\u017c"
            + "\u0001\u0000\u0000\u0000\u017d\u017e\u0001\u0000\u0000\u0000\u017e_\u0001"
            + "\u0000\u0000\u0000\u017f\u0180\u0003~?\u0000\u0180\u0181\u0005\u0001\u0000"
            + "\u0000\u0181\u0182\u0003\u0080@\u0000\u0182\u0183\u0005\u0002\u0000\u0000"
            + "\u0183\u0184\u0003\u0082A\u0000\u0184a\u0001\u0000\u0000\u0000\u0185\u0187"
            + "\u0005\u0001\u0000\u0000\u0186\u0185\u0001\u0000\u0000\u0000\u0186\u0187"
            + "\u0001\u0000\u0000\u0000\u0187\u0188\u0001\u0000\u0000\u0000\u0188\u018a"
            + "\u0005\u0014\u0000\u0000\u0189\u018b\u0005\u0002\u0000\u0000\u018a\u0189"
            + "\u0001\u0000\u0000\u0000\u018a\u018b\u0001\u0000\u0000\u0000\u018b\u018f"
            + "\u0001\u0000\u0000\u0000\u018c\u018e\u0007\u0004\u0000\u0000\u018d\u018c"
            + "\u0001\u0000\u0000\u0000\u018e\u0191\u0001\u0000\u0000\u0000\u018f\u018d"
            + "\u0001\u0000\u0000\u0000\u018f\u0190\u0001\u0000\u0000\u0000\u0190c\u0001"
            + "\u0000\u0000\u0000\u0191\u018f\u0001\u0000\u0000\u0000\u0192\u0195\u0003"
            + "h4\u0000\u0193\u0195\u0003j5\u0000\u0194\u0192\u0001\u0000\u0000\u0000"
            + "\u0194\u0193\u0001\u0000\u0000\u0000\u0194\u0195\u0001\u0000\u0000\u0000"
            + "\u0195\u0196\u0001\u0000\u0000\u0000\u0196\u0197\u0005\u0014\u0000\u0000"
            + "\u0197e\u0001\u0000\u0000\u0000\u0198\u019a\u0005\u001d\u0000\u0000\u0199"
            + "\u019b\u0005\u0014\u0000\u0000\u019a\u0199\u0001\u0000\u0000\u0000\u019a"
            + "\u019b\u0001\u0000\u0000\u0000\u019bg\u0001\u0000\u0000\u0000\u019c\u019d"
            + "\u0005+\u0000\u0000\u019di\u0001\u0000\u0000\u0000\u019e\u019f\u0005,"
            + "\u0000\u0000\u019fk\u0001\u0000\u0000\u0000\u01a0\u01a1\u0005-\u0000\u0000"
            + "\u01a1m\u0001\u0000\u0000\u0000\u01a2\u01a3\u0007\u0001\u0000\u0000\u01a3"
            + "o\u0001\u0000\u0000\u0000\u01a4\u01a5\u0007\u0001\u0000\u0000\u01a5q\u0001"
            + "\u0000\u0000\u0000\u01a6\u01a7\u0003\u0086C\u0000\u01a7s\u0001\u0000\u0000"
            + "\u0000\u01a8\u01a9\u0003\u0086C\u0000\u01a9u\u0001\u0000\u0000\u0000\u01aa"
            + "\u01ab\u0003\u0088D\u0000\u01abw\u0001\u0000\u0000\u0000\u01ac\u01b2\u0003"
            + "\u0088D\u0000\u01ad\u01ae\u0003\u0088D\u0000\u01ae\u01af\u0005\r\u0000"
            + "\u0000\u01af\u01b2\u0001\u0000\u0000\u0000\u01b0\u01b2\u0005\r\u0000\u0000"
            + "\u01b1\u01ac\u0001\u0000\u0000\u0000\u01b1\u01ad\u0001\u0000\u0000\u0000"
            + "\u01b1\u01b0\u0001\u0000\u0000\u0000\u01b2y\u0001\u0000\u0000\u0000\u01b3"
            + "\u01b5\u0003\u0088D\u0000\u01b4\u01b6\u0003|>\u0000\u01b5\u01b4\u0001"
            + "\u0000\u0000\u0000\u01b5\u01b6\u0001\u0000\u0000\u0000\u01b6{\u0001\u0000"
            + "\u0000\u0000\u01b7\u01b8\u0005#\u0000\u0000\u01b8}\u0001\u0000\u0000\u0000"
            + "\u01b9\u01ba\u0003\u0088D\u0000\u01ba\u007f\u0001\u0000\u0000\u0000\u01bb"
            + "\u01bc\u0003\u0088D\u0000\u01bc\u01bd\u0005\u000e\u0000\u0000\u01bd\u0081"
            + "\u0001\u0000\u0000\u0000\u01be\u01bf\u0003\u0088D\u0000\u01bf\u0083\u0001"
            + "\u0000\u0000\u0000\u01c0\u01c1\u0005\u0015\u0000\u0000\u01c1\u0085\u0001"
            + "\u0000\u0000\u0000\u01c2\u01c3\u0005\u0018\u0000\u0000\u01c3\u0087\u0001"
            + "\u0000\u0000\u0000\u01c4\u01c5\u0005\u0019\u0000\u0000\u01c5\u0089\u0001"
            + "\u0000\u0000\u0000\u01c6\u01c8\u0003\u008cF\u0000\u01c7\u01c6\u0001\u0000"
            + "\u0000\u0000\u01c7\u01c8\u0001\u0000\u0000\u0000\u01c8\u01c9\u0001\u0000"
            + "\u0000\u0000\u01c9\u01ca\u0003\u008eG\u0000\u01ca\u008b\u0001\u0000\u0000"
            + "\u0000\u01cb\u01cc\u0005\u0012\u0000\u0000\u01cc\u008d\u0001\u0000\u0000"
            + "\u0000\u01cd\u01ce\u0005\u0014\u0000\u0000\u01ce\u008f\u0001\u0000\u0000"
            + "\u0000\u01cf\u01d0\u0003\u0092I\u0000\u01d0\u01d1\u0003\u0094J\u0000\u01d1"
            + "\u01d2\u0003\u0092I\u0000\u01d2\u0091\u0001\u0000\u0000\u0000\u01d3\u01d4"
            + "\u0005\n\u0000\u0000\u01d4\u0093\u0001\u0000\u0000\u0000\u01d5\u01d6\u0003"
            + "\u0096K\u0000\u01d6\u01d7\u0003\u0098L\u0000\u01d7\u01d8\u0003\u009aM"
            + "\u0000\u01d8\u0095\u0001\u0000\u0000\u0000\u01d9\u01da\u0005/\u0000\u0000"
            + "\u01da\u01db\u0005\f\u0000\u0000\u01db\u01dc\u0003\u0088D\u0000\u01dc"
            + "\u0097\u0001\u0000\u0000\u0000\u01dd\u01de\u00050\u0000\u0000\u01de\u01df"
            + "\u0005\f\u0000\u0000\u01df\u01e0\u0003z=\u0000\u01e0\u0099\u0001\u0000"
            + "\u0000\u0000\u01e1\u01e2\u00051\u0000\u0000\u01e2\u01e3\u0005\f\u0000"
            + "\u0000\u01e3\u01e4\u0003\u0084B\u0000\u01e4\u009b\u0001\u0000\u0000\u0000"
            + "#\u009f\u00ab\u00ed\u00f5\u00ff\u0103\u0109\u010c\u0115\u0119\u011e\u0123"
            + "\u0128\u012f\u013d\u0147\u014b\u014e\u015b\u015f\u0166\u0168\u016b\u0170"
            + "\u0174\u0179\u017d\u0186\u018a\u018f\u0194\u019a\u01b1\u01b5\u01c7";
    public static final ATN _ATN = new ATNDeserializer().deserialize(_serializedATN.toCharArray());
    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }
}