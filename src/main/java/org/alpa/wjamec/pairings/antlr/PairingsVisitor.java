// Generated from Pairings.g4 by ANTLR 4.13.1
package org.alpa.wjamec.pairings.antlr;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PairingsParser}.
 *
 * @param <T>
 *                The return type of the visit operation. Use {@link Void} for
 *                operations with no return type.
 */
public interface PairingsVisitor<T> extends ParseTreeVisitor<T> {

    /**
     * Visit a parse tree produced by {@link PairingsParser#pairings}.
     * 
     * @param ctx
     *                the parse tree
     * @return the visitor result
     */
    T visitPairings(PairingsParser.PairingsContext ctx);

    /**
     * Visit a parse tree produced by {@link PairingsParser#pairing}.
     * 
     * @param ctx
     *                the parse tree
     * @return the visitor result
     */
    T visitPairing(PairingsParser.PairingContext ctx);

    /**
     * Visit a parse tree produced by {@link PairingsParser#header}.
     * 
     * @param ctx
     *                the parse tree
     * @return the visitor result
     */
    T visitHeader(PairingsParser.HeaderContext ctx);

    /**
     * Visit a parse tree produced by {@link PairingsParser#headline}.
     * 
     * @param ctx
     *                the parse tree
     * @return the visitor result
     */
    T visitHeadline(PairingsParser.HeadlineContext ctx);

    /**
     * Visit a parse tree produced by {@link PairingsParser#tableHeader}.
     * 
     * @param ctx
     *                the parse tree
     * @return the visitor result
     */
    T visitTableHeader(PairingsParser.TableHeaderContext ctx);

    /**
     * Visit a parse tree produced by {@link PairingsParser#preliminaryHeadline}.
     * 
     * @param ctx
     *                the parse tree
     * @return the visitor result
     */
    T visitPreliminaryHeadline(PairingsParser.PreliminaryHeadlineContext ctx);

    /**
     * Visit a parse tree produced by {@link PairingsParser#finalHeadline}.
     * 
     * @param ctx
     *                the parse tree
     * @return the visitor result
     */
    T visitFinalHeadline(PairingsParser.FinalHeadlineContext ctx);

    /**
     * Visit a parse tree produced by {@link PairingsParser#commonHeadline}.
     * 
     * @param ctx
     *                the parse tree
     * @return the visitor result
     */
    T visitCommonHeadline(PairingsParser.CommonHeadlineContext ctx);

    /**
     * Visit a parse tree produced by {@link PairingsParser#base}.
     * 
     * @param ctx
     *                the parse tree
     * @return the visitor result
     */
    T visitBase(PairingsParser.BaseContext ctx);

    /**
     * Visit a parse tree produced by {@link PairingsParser#baseIata}.
     * 
     * @param ctx
     *                the parse tree
     * @return the visitor result
     */
    T visitBaseIata(PairingsParser.BaseIataContext ctx);

    /**
     * Visit a parse tree produced by {@link PairingsParser#tripNumber}.
     * 
     * @param ctx
     *                the parse tree
     * @return the visitor result
     */
    T visitTripNumber(PairingsParser.TripNumberContext ctx);

    /**
     * Visit a parse tree produced by {@link PairingsParser#pairingId}.
     * 
     * @param ctx
     *                the parse tree
     * @return the visitor result
     */
    T visitPairingId(PairingsParser.PairingIdContext ctx);

    /**
     * Visit a parse tree produced by {@link PairingsParser#pairingAnnotation}.
     * 
     * @param ctx
     *                the parse tree
     * @return the visitor result
     */
    T visitPairingAnnotation(PairingsParser.PairingAnnotationContext ctx);

    /**
     * Visit a parse tree produced by {@link PairingsParser#crew}.
     * 
     * @param ctx
     *                the parse tree
     * @return the visitor result
     */
    T visitCrew(PairingsParser.CrewContext ctx);

    /**
     * Visit a parse tree produced by {@link PairingsParser#captains}.
     * 
     * @param ctx
     *                the parse tree
     * @return the visitor result
     */
    T visitCaptains(PairingsParser.CaptainsContext ctx);

    /**
     * Visit a parse tree produced by {@link PairingsParser#firstOfficers}.
     * 
     * @param ctx
     *                the parse tree
     * @return the visitor result
     */
    T visitFirstOfficers(PairingsParser.FirstOfficersContext ctx);

    /**
     * Visit a parse tree produced by {@link PairingsParser#flightAttendants}.
     * 
     * @param ctx
     *                the parse tree
     * @return the visitor result
     */
    T visitFlightAttendants(PairingsParser.FlightAttendantsContext ctx);

    /**
     * Visit a parse tree produced by {@link PairingsParser#extraFlightAttendants}.
     * 
     * @param ctx
     *                the parse tree
     * @return the visitor result
     */
    T visitExtraFlightAttendants(PairingsParser.ExtraFlightAttendantsContext ctx);

    /**
     * Visit a parse tree produced by {@link PairingsParser#daysOfWeek}.
     * 
     * @param ctx
     *                the parse tree
     * @return the visitor result
     */
    T visitDaysOfWeek(PairingsParser.DaysOfWeekContext ctx);

    /**
     * Visit a parse tree produced by {@link PairingsParser#effectiveness}.
     * 
     * @param ctx
     *                the parse tree
     * @return the visitor result
     */
    T visitEffectiveness(PairingsParser.EffectivenessContext ctx);

    /**
     * Visit a parse tree produced by {@link PairingsParser#period}.
     * 
     * @param ctx
     *                the parse tree
     * @return the visitor result
     */
    T visitPeriod(PairingsParser.PeriodContext ctx);

    /**
     * Visit a parse tree produced by {@link PairingsParser#month}.
     * 
     * @param ctx
     *                the parse tree
     * @return the visitor result
     */
    T visitMonth(PairingsParser.MonthContext ctx);

    /**
     * Visit a parse tree produced by {@link PairingsParser#dayOfMonth}.
     * 
     * @param ctx
     *                the parse tree
     * @return the visitor result
     */
    T visitDayOfMonth(PairingsParser.DayOfMonthContext ctx);

    /**
     * Visit a parse tree produced by {@link PairingsParser#daysOfMonth}.
     * 
     * @param ctx
     *                the parse tree
     * @return the visitor result
     */
    T visitDaysOfMonth(PairingsParser.DaysOfMonthContext ctx);

    /**
     * Visit a parse tree produced by {@link PairingsParser#dayToMonth}.
     * 
     * @param ctx
     *                the parse tree
     * @return the visitor result
     */
    T visitDayToMonth(PairingsParser.DayToMonthContext ctx);

    /**
     * Visit a parse tree produced by {@link PairingsParser#exceptions}.
     * 
     * @param ctx
     *                the parse tree
     * @return the visitor result
     */
    T visitExceptions(PairingsParser.ExceptionsContext ctx);

    /**
     * Visit a parse tree produced by {@link PairingsParser#withExceptions}.
     * 
     * @param ctx
     *                the parse tree
     * @return the visitor result
     */
    T visitWithExceptions(PairingsParser.WithExceptionsContext ctx);

    /**
     * Visit a parse tree produced by {@link PairingsParser#withoutExceptions}.
     * 
     * @param ctx
     *                the parse tree
     * @return the visitor result
     */
    T visitWithoutExceptions(PairingsParser.WithoutExceptionsContext ctx);

    /**
     * Visit a parse tree produced by {@link PairingsParser#contents}.
     * 
     * @param ctx
     *                the parse tree
     * @return the visitor result
     */
    T visitContents(PairingsParser.ContentsContext ctx);

    /**
     * Visit a parse tree produced by {@link PairingsParser#content}.
     * 
     * @param ctx
     *                the parse tree
     * @return the visitor result
     */
    T visitContent(PairingsParser.ContentContext ctx);

    /**
     * Visit a parse tree produced by {@link PairingsParser#calendarWeek}.
     * 
     * @param ctx
     *                the parse tree
     * @return the visitor result
     */
    T visitCalendarWeek(PairingsParser.CalendarWeekContext ctx);

    /**
     * Visit a parse tree produced by {@link PairingsParser#calendarMonthLetter}.
     * 
     * @param ctx
     *                the parse tree
     * @return the visitor result
     */
    T visitCalendarMonthLetter(PairingsParser.CalendarMonthLetterContext ctx);

    /**
     * Visit a parse tree produced by {@link PairingsParser#calendarDaysOfMonth}.
     * 
     * @param ctx
     *                the parse tree
     * @return the visitor result
     */
    T visitCalendarDaysOfMonth(PairingsParser.CalendarDaysOfMonthContext ctx);

    /**
     * Visit a parse tree produced by {@link PairingsParser#calendarDayOfMonth}.
     * 
     * @param ctx
     *                the parse tree
     * @return the visitor result
     */
    T visitCalendarDayOfMonth(PairingsParser.CalendarDayOfMonthContext ctx);

    /**
     * Visit a parse tree produced by {@link PairingsParser#contentSeparator}.
     * 
     * @param ctx
     *                the parse tree
     * @return the visitor result
     */
    T visitContentSeparator(PairingsParser.ContentSeparatorContext ctx);

    /**
     * Visit a parse tree produced by {@link PairingsParser#start}.
     * 
     * @param ctx
     *                the parse tree
     * @return the visitor result
     */
    T visitStart(PairingsParser.StartContext ctx);

    /**
     * Visit a parse tree produced by {@link PairingsParser#checkin}.
     * 
     * @param ctx
     *                the parse tree
     * @return the visitor result
     */
    T visitCheckin(PairingsParser.CheckinContext ctx);

    /**
     * Visit a parse tree produced by {@link PairingsParser#report}.
     * 
     * @param ctx
     *                the parse tree
     * @return the visitor result
     */
    T visitReport(PairingsParser.ReportContext ctx);

    /**
     * Visit a parse tree produced by {@link PairingsParser#checkinDuty}.
     * 
     * @param ctx
     *                the parse tree
     * @return the visitor result
     */
    T visitCheckinDuty(PairingsParser.CheckinDutyContext ctx);

    /**
     * Visit a parse tree produced by {@link PairingsParser#checkout}.
     * 
     * @param ctx
     *                the parse tree
     * @return the visitor result
     */
    T visitCheckout(PairingsParser.CheckoutContext ctx);

    /**
     * Visit a parse tree produced by {@link PairingsParser#release}.
     * 
     * @param ctx
     *                the parse tree
     * @return the visitor result
     */
    T visitRelease(PairingsParser.ReleaseContext ctx);

    /**
     * Visit a parse tree produced by {@link PairingsParser#checkoutDuty}.
     * 
     * @param ctx
     *                the parse tree
     * @return the visitor result
     */
    T visitCheckoutDuty(PairingsParser.CheckoutDutyContext ctx);

    /**
     * Visit a parse tree produced by {@link PairingsParser#leg}.
     * 
     * @param ctx
     *                the parse tree
     * @return the visitor result
     */
    T visitLeg(PairingsParser.LegContext ctx);

    /**
     * Visit a parse tree produced by {@link PairingsParser#flightLeg}.
     * 
     * @param ctx
     *                the parse tree
     * @return the visitor result
     */
    T visitFlightLeg(PairingsParser.FlightLegContext ctx);

    /**
     * Visit a parse tree produced by {@link PairingsParser#groundLeg}.
     * 
     * @param ctx
     *                the parse tree
     * @return the visitor result
     */
    T visitGroundLeg(PairingsParser.GroundLegContext ctx);

    /**
     * Visit a parse tree produced by {@link PairingsParser#layover}.
     * 
     * @param ctx
     *                the parse tree
     * @return the visitor result
     */
    T visitLayover(PairingsParser.LayoverContext ctx);

    /**
     * Visit a parse tree produced by {@link PairingsParser#accommodation}.
     * 
     * @param ctx
     *                the parse tree
     * @return the visitor result
     */
    T visitAccommodation(PairingsParser.AccommodationContext ctx);

    /**
     * Visit a parse tree produced by {@link PairingsParser#transportation}.
     * 
     * @param ctx
     *                the parse tree
     * @return the visitor result
     */
    T visitTransportation(PairingsParser.TransportationContext ctx);

    /**
     * Visit a parse tree produced by {@link PairingsParser#layoverDurations}.
     * 
     * @param ctx
     *                the parse tree
     * @return the visitor result
     */
    T visitLayoverDurations(PairingsParser.LayoverDurationsContext ctx);

    /**
     * Visit a parse tree produced by {@link PairingsParser#phone}.
     * 
     * @param ctx
     *                the parse tree
     * @return the visitor result
     */
    T visitPhone(PairingsParser.PhoneContext ctx);

    /**
     * Visit a parse tree produced by {@link PairingsParser#flight}.
     * 
     * @param ctx
     *                the parse tree
     * @return the visitor result
     */
    T visitFlight(PairingsParser.FlightContext ctx);

    /**
     * Visit a parse tree produced by {@link PairingsParser#ground}.
     * 
     * @param ctx
     *                the parse tree
     * @return the visitor result
     */
    T visitGround(PairingsParser.GroundContext ctx);

    /**
     * Visit a parse tree produced by {@link PairingsParser#deadhead}.
     * 
     * @param ctx
     *                the parse tree
     * @return the visitor result
     */
    T visitDeadhead(PairingsParser.DeadheadContext ctx);

    /**
     * Visit a parse tree produced by {@link PairingsParser#airline}.
     * 
     * @param ctx
     *                the parse tree
     * @return the visitor result
     */
    T visitAirline(PairingsParser.AirlineContext ctx);

    /**
     * Visit a parse tree produced by {@link PairingsParser#aircraft}.
     * 
     * @param ctx
     *                the parse tree
     * @return the visitor result
     */
    T visitAircraft(PairingsParser.AircraftContext ctx);

    /**
     * Visit a parse tree produced by {@link PairingsParser#origin}.
     * 
     * @param ctx
     *                the parse tree
     * @return the visitor result
     */
    T visitOrigin(PairingsParser.OriginContext ctx);

    /**
     * Visit a parse tree produced by {@link PairingsParser#destination}.
     * 
     * @param ctx
     *                the parse tree
     * @return the visitor result
     */
    T visitDestination(PairingsParser.DestinationContext ctx);

    /**
     * Visit a parse tree produced by {@link PairingsParser#out}.
     * 
     * @param ctx
     *                the parse tree
     * @return the visitor result
     */
    T visitOut(PairingsParser.OutContext ctx);

    /**
     * Visit a parse tree produced by {@link PairingsParser#in}.
     * 
     * @param ctx
     *                the parse tree
     * @return the visitor result
     */
    T visitIn(PairingsParser.InContext ctx);

    /**
     * Visit a parse tree produced by {@link PairingsParser#block}.
     * 
     * @param ctx
     *                the parse tree
     * @return the visitor result
     */
    T visitBlock(PairingsParser.BlockContext ctx);

    /**
     * Visit a parse tree produced by {@link PairingsParser#tog}.
     * 
     * @param ctx
     *                the parse tree
     * @return the visitor result
     */
    T visitTog(PairingsParser.TogContext ctx);

    /**
     * Visit a parse tree produced by {@link PairingsParser#credit}.
     * 
     * @param ctx
     *                the parse tree
     * @return the visitor result
     */
    T visitCredit(PairingsParser.CreditContext ctx);

    /**
     * Visit a parse tree produced by {@link PairingsParser#creditAnnotation}.
     * 
     * @param ctx
     *                the parse tree
     * @return the visitor result
     */
    T visitCreditAnnotation(PairingsParser.CreditAnnotationContext ctx);

    /**
     * Visit a parse tree produced by {@link PairingsParser#layoverDuration}.
     * 
     * @param ctx
     *                the parse tree
     * @return the visitor result
     */
    T visitLayoverDuration(PairingsParser.LayoverDurationContext ctx);

    /**
     * Visit a parse tree produced by {@link PairingsParser#transportationDuration}.
     * 
     * @param ctx
     *                the parse tree
     * @return the visitor result
     */
    T visitTransportationDuration(PairingsParser.TransportationDurationContext ctx);

    /**
     * Visit a parse tree produced by {@link PairingsParser#restDuration}.
     * 
     * @param ctx
     *                the parse tree
     * @return the visitor result
     */
    T visitRestDuration(PairingsParser.RestDurationContext ctx);

    /**
     * Visit a parse tree produced by {@link PairingsParser#hours}.
     * 
     * @param ctx
     *                the parse tree
     * @return the visitor result
     */
    T visitHours(PairingsParser.HoursContext ctx);

    /**
     * Visit a parse tree produced by {@link PairingsParser#time}.
     * 
     * @param ctx
     *                the parse tree
     * @return the visitor result
     */
    T visitTime(PairingsParser.TimeContext ctx);

    /**
     * Visit a parse tree produced by {@link PairingsParser#duration}.
     * 
     * @param ctx
     *                the parse tree
     * @return the visitor result
     */
    T visitDuration(PairingsParser.DurationContext ctx);

    /**
     * Visit a parse tree produced by {@link PairingsParser#dutyDay}.
     * 
     * @param ctx
     *                the parse tree
     * @return the visitor result
     */
    T visitDutyDay(PairingsParser.DutyDayContext ctx);

    /**
     * Visit a parse tree produced by {@link PairingsParser#weekday}.
     * 
     * @param ctx
     *                the parse tree
     * @return the visitor result
     */
    T visitWeekday(PairingsParser.WeekdayContext ctx);

    /**
     * Visit a parse tree produced by {@link PairingsParser#dayOfDuty}.
     * 
     * @param ctx
     *                the parse tree
     * @return the visitor result
     */
    T visitDayOfDuty(PairingsParser.DayOfDutyContext ctx);

    /**
     * Visit a parse tree produced by {@link PairingsParser#footer}.
     * 
     * @param ctx
     *                the parse tree
     * @return the visitor result
     */
    T visitFooter(PairingsParser.FooterContext ctx);

    /**
     * Visit a parse tree produced by {@link PairingsParser#footerSeparator}.
     * 
     * @param ctx
     *                the parse tree
     * @return the visitor result
     */
    T visitFooterSeparator(PairingsParser.FooterSeparatorContext ctx);

    /**
     * Visit a parse tree produced by {@link PairingsParser#summary}.
     * 
     * @param ctx
     *                the parse tree
     * @return the visitor result
     */
    T visitSummary(PairingsParser.SummaryContext ctx);

    /**
     * Visit a parse tree produced by {@link PairingsParser#tafbSummary}.
     * 
     * @param ctx
     *                the parse tree
     * @return the visitor result
     */
    T visitTafbSummary(PairingsParser.TafbSummaryContext ctx);

    /**
     * Visit a parse tree produced by {@link PairingsParser#creditSummary}.
     * 
     * @param ctx
     *                the parse tree
     * @return the visitor result
     */
    T visitCreditSummary(PairingsParser.CreditSummaryContext ctx);

    /**
     * Visit a parse tree produced by {@link PairingsParser#perdiemSummary}.
     * 
     * @param ctx
     *                the parse tree
     * @return the visitor result
     */
    T visitPerdiemSummary(PairingsParser.PerdiemSummaryContext ctx);
}