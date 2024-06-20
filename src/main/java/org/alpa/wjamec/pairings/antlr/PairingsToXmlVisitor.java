package org.alpa.wjamec.pairings.antlr;

import java.math.BigInteger;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeConstants;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;

import org.alpa.wjamec.pairings.antlr.PairingsParser.AccommodationContext;
import org.alpa.wjamec.pairings.antlr.PairingsParser.AircraftContext;
import org.alpa.wjamec.pairings.antlr.PairingsParser.AirlineContext;
import org.alpa.wjamec.pairings.antlr.PairingsParser.BaseIataContext;
import org.alpa.wjamec.pairings.antlr.PairingsParser.CalendarDayOfMonthContext;
import org.alpa.wjamec.pairings.antlr.PairingsParser.CalendarDaysOfMonthContext;
import org.alpa.wjamec.pairings.antlr.PairingsParser.CheckinContext;
import org.alpa.wjamec.pairings.antlr.PairingsParser.CheckinDutyContext;
import org.alpa.wjamec.pairings.antlr.PairingsParser.CheckoutContext;
import org.alpa.wjamec.pairings.antlr.PairingsParser.ContentContext;
import org.alpa.wjamec.pairings.antlr.PairingsParser.ContentsContext;
import org.alpa.wjamec.pairings.antlr.PairingsParser.CreditAnnotationContext;
import org.alpa.wjamec.pairings.antlr.PairingsParser.CrewContext;
import org.alpa.wjamec.pairings.antlr.PairingsParser.DayOfMonthContext;
import org.alpa.wjamec.pairings.antlr.PairingsParser.DurationContext;
import org.alpa.wjamec.pairings.antlr.PairingsParser.EffectivenessContext;
import org.alpa.wjamec.pairings.antlr.PairingsParser.FinalHeadlineContext;
import org.alpa.wjamec.pairings.antlr.PairingsParser.FlightLegContext;
import org.alpa.wjamec.pairings.antlr.PairingsParser.FooterContext;
import org.alpa.wjamec.pairings.antlr.PairingsParser.GroundLegContext;
import org.alpa.wjamec.pairings.antlr.PairingsParser.HeaderContext;
import org.alpa.wjamec.pairings.antlr.PairingsParser.HeadlineContext;
import org.alpa.wjamec.pairings.antlr.PairingsParser.HoursContext;
import org.alpa.wjamec.pairings.antlr.PairingsParser.LayoverContext;
import org.alpa.wjamec.pairings.antlr.PairingsParser.LegContext;
import org.alpa.wjamec.pairings.antlr.PairingsParser.PairingAnnotationContext;
import org.alpa.wjamec.pairings.antlr.PairingsParser.PairingContext;
import org.alpa.wjamec.pairings.antlr.PairingsParser.PairingIdContext;
import org.alpa.wjamec.pairings.antlr.PairingsParser.PairingsContext;
import org.alpa.wjamec.pairings.antlr.PairingsParser.PairingsDocumentContext;
import org.alpa.wjamec.pairings.antlr.PairingsParser.PreliminaryHeadlineContext;
import org.alpa.wjamec.pairings.antlr.PairingsParser.TimeContext;
import org.alpa.wjamec.pairings.antlr.PairingsParser.TransportationContext;
import org.alpa.wjamec.pairings.antlr.PairingsParser.TripNumberContext;
import org.alpa.wjamec.pairings.jaxb.Accommodation;
import org.alpa.wjamec.pairings.jaxb.Aircraft;
import org.alpa.wjamec.pairings.jaxb.Airline;
import org.alpa.wjamec.pairings.jaxb.Base;
import org.alpa.wjamec.pairings.jaxb.Checkin;
import org.alpa.wjamec.pairings.jaxb.Checkout;
import org.alpa.wjamec.pairings.jaxb.CreditAnnotation;
import org.alpa.wjamec.pairings.jaxb.Crew;
import org.alpa.wjamec.pairings.jaxb.DutyAnnotation;
import org.alpa.wjamec.pairings.jaxb.FlightLeg;
import org.alpa.wjamec.pairings.jaxb.GroundLeg;
import org.alpa.wjamec.pairings.jaxb.InitialDutyDay;
import org.alpa.wjamec.pairings.jaxb.Layover;
import org.alpa.wjamec.pairings.jaxb.Leg;
import org.alpa.wjamec.pairings.jaxb.Mappings;
import org.alpa.wjamec.pairings.jaxb.ObjectFactory;
import org.alpa.wjamec.pairings.jaxb.Pairing;
import org.alpa.wjamec.pairings.jaxb.PairingAnnotation;
import org.alpa.wjamec.pairings.jaxb.Pairings;
import org.alpa.wjamec.pairings.jaxb.PreliminaryPairing;
import org.alpa.wjamec.pairings.jaxb.Transportation;
import org.alpa.wjamec.pairings.jaxb.Vehicle;
import org.alpa.wjamec.pairings.jaxb.Weekday;

/**
 * Visits the ANTLR pairings AST and transforms it into an XML pairings representation.
 * 
 * @see Pairings
 * 
 * @author Stephan Heinemann
 */
public class PairingsToXmlVisitor extends PairingsBaseVisitor<Object> {

    /** the pairings object factory */
    private final ObjectFactory pairingsFactory = new ObjectFactory();

    /** the effective local date of the first initial duty day of the current pairing */
    private LocalDate effectiveDate = null;

    /** the base time zone of the current pairing */
    private ZoneId baseTimeZone = null;

    /** the current time during the current pairing */
    private ZonedDateTime currentTime = null;

    /**
     * Sets the validity period of the pairings.
     * 
     * @param pairings
     *                      the XML parings representation
     * @param validFrom
     *                      the start of the validity period of the pairings
     * @param validTo
     *                      the end of the validity period of the pairings
     */
    private static void setValidity(Pairings pairings, XMLGregorianCalendar validFrom, XMLGregorianCalendar validTo) {
        pairings.setValidFrom(validFrom);
        pairings.setValidTo(validTo);
    }

    /**
     * Updates and if required expands the validity period of the pairings.
     * 
     * @param pairings
     *                     the XML pairings representation
     * @param date
     *                     the valid date of a contained pairing
     */
    private static void updateValidity(Pairings pairings, XMLGregorianCalendar date) {
        if (DatatypeConstants.GREATER == pairings.getValidFrom().compare(date)) {
            pairings.setValidFrom(date);
        }

        if (DatatypeConstants.LESSER == pairings.getValidTo().compare(date)) {
            pairings.setValidTo(date);
        }
    }

    /**
     * Transforms a local date time and time zone to an XML Gregorian calendar.
     * 
     * @param localDateTime
     *                          the local date and time
     * @param timeZone
     *                          the time zone of the local date and time
     * 
     * @return the XML Gregorian calendar representation of the local date time and time zone
     */
    private static XMLGregorianCalendar toXmlGregorianCalendar(LocalDateTime localDateTime, ZoneId timeZone) {
        XMLGregorianCalendar xmlCalendar = null;

        ZonedDateTime zonedDateTime = ZonedDateTime.of(localDateTime, timeZone);
        GregorianCalendar calendar = GregorianCalendar.from(zonedDateTime);

        try {
            xmlCalendar = DatatypeFactory.newInstance().newXMLGregorianCalendar(calendar);
        } catch (DatatypeConfigurationException dce) {
            dce.printStackTrace();
        }

        return xmlCalendar;
    }

    /**
     * Calculates a time at a destination based on a local date and time at an origin using a block duration
     * between origin and destination and the respective time zones.
     * 
     * @param originDateTime
     *                              the local date and time at the origin
     * @param originZoneId
     *                              the time zone at the origin
     * @param block
     *                              the block duration between the origin and destination
     * @param destinationZoneId
     *                              the time zone at the destination
     * 
     * @return the time at the destination based on the local date and time at the origin using the block duration
     *         between origin and destination and the respective time zones
     */
    private static ZonedDateTime toDestinationTime(LocalDateTime originDateTime, ZoneId originZoneId, Duration block,
            ZoneId destinationZoneId) {
        java.time.Duration dblock = java.time.Duration.parse(block.toString());
        ZonedDateTime zonedOutDateTime = ZonedDateTime.of(originDateTime, originZoneId);
        ZonedDateTime zonedInDateTime = zonedOutDateTime.plus(dblock);
        zonedInDateTime = zonedInDateTime.withZoneSameInstant(destinationZoneId);

        return zonedInDateTime;
    }

    /**
     * Visits and transforms an ANTLR AST accommodation context to an XML accommodation representation.
     * 
     * @param accommodationContext
     *                                 the ANTLR AST accommodation context
     * @return the XML accommodation representation of the ANTLR AST accommodation context
     * 
     * @throws IllegalArgumentException
     *                                      if accomodationContext is null
     * 
     * @see PairingsBaseVisitor#visitAccommodation(AccommodationContext)
     */
    @Override
    public Accommodation visitAccommodation(AccommodationContext accommodationContext) {
        Accommodation accommodation = pairingsFactory.createAccommodation();

        if (null != accommodationContext) {
            // create a space separated details string
            String details = "";
            for (int childIndex = 0; childIndex < accommodationContext.getChildCount(); childIndex++) {
                details = details.concat(accommodationContext.getChild(childIndex).getText() + " ");
            }
            details = details.trim();
            accommodation.setDetails(details);
        } else {
            throw new IllegalArgumentException();
        }

        return accommodation;
    }

    /**
     * Visits and transforms an ANTLR AST aircraft context to an XML aircraft representation.
     * 
     * @param aircraftContext
     *                            the ANTLR AST aircraft context
     * @return the XML aircraft representation of the ANTLR AST aircraft context
     * 
     * @throws IllegalArgumentException
     *                                      if aircraftContext is null
     * 
     * @see PairingsBaseVisitor#visitAircraft(AircraftContext)
     */
    @Override
    public Aircraft visitAircraft(AircraftContext aircraftContext) {
        Aircraft aircraft = null;

        if (null != aircraftContext) {
            aircraft = Aircraft.fromValue(Mappings.aircraft.get(aircraftContext.AIRCRAFT().getText()));
        } else {
            throw new IllegalArgumentException();
        }

        return aircraft;
    }

    /**
     * Visits and transforms an ANTLR AST airline context to an XML airline representation.
     * 
     * @param airlineContext
     *                           the ANTLR AST airline context
     * 
     * @return the XML airline representation of the ANTLR AST airline context
     * 
     * @see PairingsBaseVisitor#visitAirline(AirlineContext)
     */
    @Override
    public Airline visitAirline(AirlineContext airlineContext) {
        Airline airline = Airline.fromValue(Mappings.airlines.get("WS"));

        if (null != airlineContext) {
            String airlineIata = airlineContext.AIRLINE().getText();
            airlineIata = airlineIata.substring(0, airlineIata.indexOf('_'));
            airline = Airline.fromValue(Mappings.airlines.get(airlineIata));
        }

        return airline;
    }

    /**
     * Visits and transforms an ANTLR AST base IATA context to an XML base representation.
     * 
     * @param baseIataContext
     *                            the ANTLR AST base IATA context
     * 
     * @return the XML base representation of the ANTLR AST base IATA context
     * 
     * @throws IllegalArgumentException
     *                                      if baseIataContext is null
     * 
     * @see PairingsBaseVisitor#visitBaseIata(BaseIataContext)
     */
    @Override
    public Base visitBaseIata(BaseIataContext baseIataContext) {
        Base base = null;

        if (null != baseIataContext) {
            base = Base.fromValue(Mappings.bases.get(baseIataContext.BASE_IATA().getText()));
        } else {
            throw new IllegalArgumentException();
        }

        return base;
    }

    /**
     * Visits and transforms an ANTLR AST checkin context to an XML checkin representation.
     * 
     * @param checkinContext
     *                           the ANTLR AST checkin context
     * 
     * @return the XML checkin representation of the ANTLR AST checkin context
     * 
     * @throws IllegalArgumentException
     *                                      if checkinContext is null
     * 
     * @see PairingsBaseVisitor#visitCheckin(CheckinContext)
     */
    @Override
    public Checkin visitCheckin(CheckinContext checkinContext) {
        Checkin checkin = pairingsFactory.createCheckin();

        if (null != checkinContext) {
            // report
            checkin.setReport(null != checkinContext.report());

            // out time
            LocalTime outTime = this.visitTime(checkinContext.out().time());
            LocalDateTime outDateTime = LocalDateTime.of(this.currentTime.toLocalDate(), outTime);
            checkin.setOut(toXmlGregorianCalendar(outDateTime, this.currentTime.getZone()));
            this.currentTime = ZonedDateTime.of(outDateTime, currentTime.getZone());

            // time on ground
            checkin.setTimeOnGround(this.visitDuration(checkinContext.tog().duration()));
            this.currentTime = this.currentTime.plus(java.time.Duration.parse(checkin.getTimeOnGround().toString()));

            // check-in duty
            if (null != checkinContext.checkinDuty()) {
                checkin.setDutyAnnotation(this.visitCheckinDuty(checkinContext.checkinDuty()));
            }
        } else {
            throw new IllegalArgumentException();
        }

        return checkin;
    }

    /**
     * Visits and transforms an ANTLR AST checkin duty context to an XML duty annotation representation.
     * 
     * @param checkinDutyContext
     *                               the ANTLR AST checkin duty context
     * 
     * @return the XML duty annotation representation of the ANTLR AST checkin duty context
     * 
     * @throws IllegalArgumentException
     *                                      if checkinDutyContext is null
     * 
     * @see PairingsBaseVisitor#visitCheckinDuty(CheckinDutyContext)
     */
    @Override
    public DutyAnnotation visitCheckinDuty(CheckinDutyContext checkinDutyContext) {
        if (null == checkinDutyContext) {
            throw new IllegalArgumentException();
        }

        return DutyAnnotation.fromValue(Mappings.dutyAnnotations.get(checkinDutyContext.CHECKIN_DUTY().getText()));
    }

    /**
     * Visits and transforms an ANTLR AST checkout context to an XML checkout representation.
     * 
     * @param checkoutContext
     *                            the ANTLR AST checkout context
     * 
     * @return the XML checkout representation of the ANTLR AST checkout context
     * 
     * @throws IllegalArgumentException
     *                                      if checkoutContext is null
     * 
     * @see PairingsBaseVisitor#visitCheckout(CheckoutContext)
     */
    @Override
    public Checkout visitCheckout(CheckoutContext checkoutContext) {
        Checkout checkout = pairingsFactory.createCheckout();

        if (null != checkoutContext) {
            // release
            checkout.setRelease(null != checkoutContext.release());

            // in time
            LocalTime inTime = this.visitTime(checkoutContext.in().time());
            LocalDateTime inDateTime = LocalDateTime.of(this.currentTime.toLocalDate(), inTime);
            checkout.setIn(toXmlGregorianCalendar(inDateTime, this.currentTime.getZone()));
            this.currentTime = ZonedDateTime.of(inDateTime, currentTime.getZone());

            // block time
            checkout.setBlock(this.visitDuration(checkoutContext.block().duration()));

            // time on ground
            checkout.setTimeOnGround(this.visitDuration(checkoutContext.tog().duration()));
            this.currentTime = this.currentTime.plus(java.time.Duration.parse(checkout.getTimeOnGround().toString()));

            // check-out duty time
            checkout.setDuty(this.visitDuration(checkoutContext.checkoutDuty().duration()));

            // credit
            checkout.setCredit(this.visitDuration(checkoutContext.credit().duration()));

            // credit annotation
            if (null != checkoutContext.credit().creditAnnotation()) {
                checkout.setCreditAnnotation(this.visitCreditAnnotation(checkoutContext.credit().creditAnnotation()));
            }
        } else {
            throw new IllegalArgumentException();
        }

        return checkout;
    }

    /**
     * Visits and transforms an ANTLR AST credit annotation context to an XML credit annotation representation.
     * 
     * @param creditAnnotationContext
     *                                    the ANTLR AST credit annotation context
     * 
     * @return the XML credit annotation representation of the ANTLR AST credit annotation context
     * 
     * @throws IllegalArgumentException
     *                                      if creditAnnotationContext is null
     * 
     * @see PairingsBaseVisitor#visitCreditAnnotation(CreditAnnotationContext)
     */
    @Override
    public CreditAnnotation visitCreditAnnotation(CreditAnnotationContext creditAnnotationContext) {
        if (null == creditAnnotationContext) {
            throw new IllegalArgumentException();
        }

        return CreditAnnotation.fromValue(
                Mappings.creditAnnotations.get(creditAnnotationContext.CREDIT_ANNOTATION().getText().substring(1, 2)));
    }

    /**
     * Visits and transforms an ANTLR AST crew context to an XML crew representation.
     * 
     * @param crewContext
     *                        the ANTLR AST crew context
     * 
     * @return the XML crew representation of the ANTLR AST crew context
     * 
     * @throws IllegalArgumentException
     *                                      if crewContext is null
     * 
     * @see PairingsBaseVisitor#visitCrew(CrewContext)
     */
    @Override
    public Crew visitCrew(CrewContext crewContext) {
        Crew crew = pairingsFactory.createCrew();

        if (null != crewContext) {
            String captains = crewContext.captains().NAT().getText();
            String firstOfficers = crewContext.firstOfficers().NAT().getText();
            String flightAttendants = crewContext.flightAttendants().NAT().getText();
            String extraFlightAttendants = crewContext.extraFlightAttendants().NAT().getText();

            crew.setCaptains(BigInteger.valueOf(Long.parseLong(captains)));
            crew.setFirstOfficers(BigInteger.valueOf(Long.parseLong(firstOfficers)));
            crew.setFlightAttendants(BigInteger.valueOf(Long.parseLong(flightAttendants)));
            crew.setExtraFlightAttendants(BigInteger.valueOf(Long.parseLong(extraFlightAttendants)));
        } else {
            throw new IllegalArgumentException();
        }

        return crew;
    }

    /**
     * Visits and transforms an ANTLR AST day of month context to an XML initial duty day representation.
     * 
     * @param dayOfMonthContext
     *                              the ANTLR AST day of month context
     * 
     * @return the XML initial duty day representation of the ANTLR AST day of month context
     * 
     * @throws IllegalArgumentException
     *                                      if dayOfMonthContext is null
     * 
     * @see PairingsBaseVisitor#visitDayOfMonth(DayOfMonthContext)
     */
    @Override
    public InitialDutyDay visitDayOfMonth(DayOfMonthContext dayOfMonthContext) {
        InitialDutyDay initialDutyDay = pairingsFactory.createInitialDutyDay();

        if (null != dayOfMonthContext) {
            Integer dayOfMonth = Integer.parseInt(dayOfMonthContext.NAT().getText());
            LocalDate localDate = LocalDate.of(this.effectiveDate.getYear(), this.effectiveDate.getMonth(), dayOfMonth);
            LocalTime localTime = LocalTime.MIDNIGHT;
            LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);
            initialDutyDay.setDate(toXmlGregorianCalendar(localDateTime, this.baseTimeZone));
        } else {
            throw new IllegalArgumentException();
        }

        return initialDutyDay;
    }

    /**
     * Visits and transforms an ANTLR AST duration context to an XML duration representation.
     * 
     * @param durationContext
     *                            the ANTLR AST duration context
     * 
     * @return the XML duration representation of the ANTLR AST duration context
     * 
     * @throws IllegalArgumentException
     *                                      if durationContext is null
     * 
     * @see PairingsBaseVisitor#visitDuration(DurationContext)
     */
    @Override
    public Duration visitDuration(DurationContext durationContext) {
        Duration duration = null;

        if (null != durationContext) {
            try {
                String lexicalDuration = "PT".concat(durationContext.DURATION().getText().toUpperCase().concat("M"));
                duration = DatatypeFactory.newInstance().newDuration(lexicalDuration);
            } catch (DatatypeConfigurationException dce) {
                dce.printStackTrace();
            }
        } else {
            throw new IllegalArgumentException();
        }

        return duration;
    }

    /**
     * Visits and transforms an ANTLR AST effectiveness context to a local date representing the first initial duty
     * date.
     * 
     * @param effectivenessContext
     *                                 the ANTLR AST effectiveness context
     * 
     * @return the local date representing the first initial duty date of the ANTLR AST effectiveness context
     * 
     * @throws IllegalArgumentException
     *                                      if effectiveContext is null
     * 
     * @see PairingsBaseVisitor#visitEffectiveness(EffectivenessContext)
     */
    @Override
    public LocalDate visitEffectiveness(EffectivenessContext effectivenessContext) {
        LocalDate localDate = null;

        if (null != effectivenessContext) {
            int month = Mappings.months.get(effectivenessContext.period().month().MONTH().getText());
            int dayOfMonth = Integer.parseInt(effectivenessContext.period().dayToMonth().dayOfMonth().NAT().getText());
            localDate = LocalDate.of(this.effectiveDate.getYear(), month, dayOfMonth);
        }

        return localDate;
    }

    /**
     * Visits and transforms an ANTLR AST final headline context to an XML final pairing representation.
     * 
     * @param finalHeadlineContext
     *                                 the ANTLR AST final headline context
     * 
     * @return the XML final pairing representation of the ANTLR AST final headline context
     * 
     * @throws IllegalArgumentException
     *                                      if finalHeadlineContext is null
     * 
     * @see PairingsBaseVisitor#visitFinalHeadline(FinalHeadlineContext)
     */
    @Override
    public Pairing visitFinalHeadline(FinalHeadlineContext finalHeadlineContext) {
        Pairing pairing = pairingsFactory.createPairing();

        if (null != finalHeadlineContext) {
            // trip number
            pairing.setTrip(this.visitTripNumber(finalHeadlineContext.tripNumber()));

            // pairing id
            pairing.setPairing(this.visitPairingId(finalHeadlineContext.pairingId()));

            // pairing annotation
            pairing.setPairingAnnotation(
                    this.visitPairingAnnotation(finalHeadlineContext.commonHeadline().pairingAnnotation()));

            // crew
            pairing.setCrew(this.visitCrew(finalHeadlineContext.commonHeadline().crew()));

            // base
            pairing.setBase(this.visitBaseIata(finalHeadlineContext.commonHeadline().baseIata()));

            // effectivef date
            this.effectiveDate = this.visitEffectiveness(finalHeadlineContext.commonHeadline().effectiveness());
        } else {
            throw new IllegalArgumentException();
        }

        return pairing;
    }

    /**
     * Visits and transforms an ANTLR AST flight leg context to an XML flight leg representation.
     * 
     * @param flightLegContext
     *                             the ANTLR AST flight leg context
     * 
     * @return the XML flight leg representation of the ANTLR AST flight leg context
     * 
     * @throws IllegalArgumentException
     *                                      if flightLegContext is null
     * 
     * @see PairingsBaseVisitor#visitFlightLeg(FlightLegContext)
     */
    @Override
    public FlightLeg visitFlightLeg(FlightLegContext flightLegContext) {
        FlightLeg flightLeg = pairingsFactory.createFlightLeg();

        if (null != flightLegContext) {
            // origin
            flightLeg.setOrigin(flightLegContext.origin().getText());

            // destination
            flightLeg.setDestination(flightLegContext.destination().getText());

            // out time
            LocalTime outTime = this.visitTime(flightLegContext.out().time());

            // first departure date of the month (assuming no local time changes between initial duty days)
            LocalDate outDate = this.currentTime.toLocalDate();
            LocalDateTime outDateTime = LocalDateTime.of(outDate, outTime);
            ZoneId originZoneId = ZoneId.of(Mappings.timeZones.get(flightLeg.getOrigin()));
            flightLeg.setOut(toXmlGregorianCalendar(outDateTime, originZoneId));

            // block time
            flightLeg.setBlock(this.visitDuration(flightLegContext.block().duration()));

            // in time
            LocalTime inTime = this.visitTime(flightLegContext.in().time());

            // first arrival date of the month (assuming no local time changes between initial duty days)
            ZoneId destinationZoneId = ZoneId.of(Mappings.timeZones.get(flightLeg.getDestination()));
            this.currentTime = toDestinationTime(outDateTime, originZoneId, flightLeg.getBlock(), destinationZoneId);
            LocalDate inDate = this.currentTime.toLocalDate();
            LocalDateTime inDateTime = LocalDateTime.of(inDate, inTime);
            flightLeg.setIn(toXmlGregorianCalendar(inDateTime, destinationZoneId));

            // credit
            flightLeg.setCredit(this.visitDuration(flightLegContext.credit().duration()));

            // credit annotation
            if (null != flightLegContext.credit().creditAnnotation()) {
                flightLeg.setCreditAnnotation(this.visitCreditAnnotation(flightLegContext.credit().creditAnnotation()));
            }

            // flight number
            flightLeg.setNumber(BigInteger.valueOf(Long.parseLong(flightLegContext.flight().NAT().getText())));

            // aircraft
            if (null != flightLegContext.aircraft()) {
                flightLeg.setAircraft(this.visitAircraft(flightLegContext.aircraft()));
            }

            // airline
            flightLeg.setAirline(this.visitAirline(flightLegContext.flight().airline()));

            // operating
            flightLeg.setOperating(
                    (null == flightLegContext.flight().deadhead()) && (null == flightLegContext.flight().airline()));

            // time on the ground and tail swap
            if ((null != flightLegContext.tog())) {

                if (null != flightLegContext.tog().duration()) {
                    flightLeg.setTimeOnGround(this.visitDuration(flightLegContext.tog().duration()));
                    this.currentTime = this.currentTime
                            .plus(java.time.Duration.parse(flightLeg.getTimeOnGround().toString()));
                }

                if (null != flightLegContext.tog().ASTERISK()) {
                    flightLeg.setTailSwap(true);
                }
            }

            // crew
            if (null != flightLegContext.crew()) {
                flightLeg.setCrew(this.visitCrew(flightLegContext.crew()));
            }
        } else {
            throw new IllegalArgumentException();
        }

        return flightLeg;
    }

    /**
     * Visits and transforms an ANTLR AST ground leg context to an XML ground leg representation.
     * 
     * @param groundLegContext
     *                             the ANTLR AST ground leg context
     * 
     * @return the XML ground leg representation of the ANTLR AST ground leg context
     * 
     * @throws IllegalArgumentException
     *                                      if groundLegContext is null
     * 
     * @see PairingsBaseVisitor#visitGroundLeg(GroundLegContext)
     */
    @Override
    public GroundLeg visitGroundLeg(GroundLegContext groundLegContext) {
        GroundLeg groundLeg = pairingsFactory.createGroundLeg();

        if (null != groundLegContext) {
            // origin
            groundLeg.setOrigin(groundLegContext.origin().getText());

            // destination
            groundLeg.setDestination(groundLegContext.destination().getText());

            // out time
            LocalTime outTime = this.visitTime(groundLegContext.out().time());

            // block time
            groundLeg.setBlock(this.visitDuration(groundLegContext.block().duration()));

            // first departure date of the month (assuming no local time changes between initial duty days)
            LocalDate outDate = this.currentTime.toLocalDate();
            LocalDateTime outDateTime = LocalDateTime.of(outDate, outTime);
            ZoneId originZoneId = ZoneId.of(Mappings.timeZones.get(groundLeg.getOrigin()));
            groundLeg.setOut(toXmlGregorianCalendar(outDateTime, originZoneId));

            // in time
            LocalTime inTime = this.visitTime(groundLegContext.in().time());

            // first arrival date of the month (assuming no local time changes between initial duty days)
            ZoneId destinationZoneId = ZoneId.of(Mappings.timeZones.get(groundLeg.getDestination()));
            this.currentTime = toDestinationTime(outDateTime, originZoneId, groundLeg.getBlock(), destinationZoneId);
            LocalDate inDate = this.currentTime.toLocalDate();
            LocalDateTime inDateTime = LocalDateTime.of(inDate, inTime);
            groundLeg.setIn(toXmlGregorianCalendar(inDateTime, destinationZoneId));

            // credit
            groundLeg.setCredit(this.visitDuration(groundLegContext.credit().duration()));

            // credit annotation
            if (null != groundLegContext.credit().creditAnnotation()) {
                groundLeg.setCreditAnnotation(this.visitCreditAnnotation(groundLegContext.credit().creditAnnotation()));
            }

            // ground number
            if (null != groundLegContext.ground().NAT()) {
                groundLeg.setNumber(BigInteger.valueOf(Long.parseLong(groundLegContext.ground().NAT().getText())));
            }

            // vehicle
            groundLeg
                    .setVehicle(Vehicle.fromValue(Mappings.vehicles.get(groundLegContext.ground().GROUND().getText())));
        } else {
            throw new IllegalArgumentException();
        }

        return groundLeg;
    }

    /**
     * Visits and transforms an ANTLR AST hours context to a number representing the hours amount.
     * 
     * @param hoursContext
     *                         the ANTLR AST hours context
     * 
     * @return the number representing the hours amount of the ANTLR AST hours context
     * 
     * @throws IllegalArgumentException
     *                                      if hoursContextt is null
     * 
     * @see PairingsBaseVisitor#visitHours(HoursContext)
     */
    @Override
    public Float visitHours(HoursContext hoursContext) {
        Float hours;

        if (null != hoursContext) {
            hours = Float.parseFloat(hoursContext.NATREAL().getText());
        } else {
            throw new IllegalArgumentException();
        }

        return hours;
    }

    /**
     * Visits and transforms an ANTLR AST layover context to an XML layover representation.
     * 
     * @param layoverContext
     *                           the ANTLR AST layover context
     * 
     * @return the XML layover representation of the ANTLR AST layover context
     * 
     * @throws IllegalArgumentException
     *                                      if layoverContext is null
     * 
     * @see PairingsBaseVisitor#visitLayover(LayoverContext)
     */
    @Override
    public Layover visitLayover(LayoverContext layoverContext) {
        Layover layover = pairingsFactory.createLayover();

        if (null != layoverContext) {
            // lay-over duration
            layover.setLayover(this.visitDuration(layoverContext.layoverDurations().layoverDuration().duration()));
            this.currentTime = this.currentTime.plus(java.time.Duration.parse(layover.getLayover().toString()));

            // accommodation details and duration
            Accommodation accommodation = this.visitAccommodation(layoverContext.accommodation());
            if (null != layoverContext.layoverDurations().accommodationDuration()) {
                accommodation.setAccomodation(
                        this.visitDuration(layoverContext.layoverDurations().accommodationDuration().duration()));
            }
            layover.setAccomodation(accommodation);

            // transportation details and duration
            Transportation transportation = this.visitTransportation(layoverContext.transportation());
            if (null != layoverContext.layoverDurations().transportationDuration()) {
                transportation.setTransportation(
                        this.visitDuration(layoverContext.layoverDurations().transportationDuration().duration())
                                .multiply(2));
            }
            layover.setTransportation(transportation);
        } else {
            throw new IllegalArgumentException();
        }

        return layover;
    }

    /**
     * Visits and transforms an ANTLR AST leg context to an XML leg representation.
     * 
     * @param legContext
     *                       the ANTLR AST leg context
     * 
     * @return the XML leg representation of the ANTLR AST leg context
     * 
     * @throws IllegalArgumentException
     *                                      if legContext is null
     * 
     * @see PairingsBaseVisitor#visitLeg(LegContext)
     */
    @Override
    public Leg visitLeg(LegContext legContext) {
        Leg leg = null;

        if (null != legContext) {
            if (null != legContext.flightLeg()) {
                leg = this.visitFlightLeg(legContext.flightLeg());
            } else if (null != legContext.groundLeg()) {
                leg = this.visitGroundLeg(legContext.groundLeg());
            }
        } else {
            throw new IllegalArgumentException();
        }

        return leg;
    }

    /**
     * Visits and transforms an ANTLR AST pairing context to an XML pairing representation.
     * 
     * @param pairingContext
     *                           the ANTLR AST pairing context
     * 
     * @return the XML pairing representation of the ANTLR AST pairing context
     * 
     * @throws IllegalArgumentException
     *                                      if pairingContext is null
     * 
     * @see PairingsBaseVisitor#visitPairing(PairingContext)
     */
    @Override
    public PreliminaryPairing visitPairing(PairingContext pairingContext) {
        PreliminaryPairing pairing = null;

        if (null != pairingContext) {
            HeaderContext headerContext = pairingContext.header();
            HeadlineContext headlineContext = headerContext.headline();
            ContentsContext contentsContext = pairingContext.contents();
            FooterContext footerContext = pairingContext.footer();

            if (null != headlineContext.preliminaryHeadline()) {
                PreliminaryHeadlineContext prelimHeadlineContext = headlineContext.preliminaryHeadline();
                pairing = this.visitPreliminaryHeadline(prelimHeadlineContext);
            } else if (null != headlineContext.finalHeadline()) {
                FinalHeadlineContext finalHeadlineContext = headlineContext.finalHeadline();
                pairing = this.visitFinalHeadline(finalHeadlineContext);
            }

            // initial duty days
            pairing.setInitialDutyDays(pairingsFactory.createInitialDutyDays());

            // duty days
            int dutyDayIndex = 0;
            pairing.setDutyDays(pairingsFactory.createDutyDays());

            // base time zone
            String baseIata = Mappings.bases.get(pairing.getBase().value());
            this.baseTimeZone = ZoneId.of(Mappings.timeZones.get(baseIata));

            for (ContentContext contentContext : contentsContext.content()) {
                // initial duty days
                if (null != contentContext.calendarWeek()) {
                    int dayOfWeek = 1;
                    CalendarDaysOfMonthContext cdsomc = contentContext.calendarWeek().calendarDaysOfMonth();
                    for (CalendarDayOfMonthContext cdomc : cdsomc.calendarDayOfMonth()) {
                        if (null != cdomc.dayOfMonth()) {
                            InitialDutyDay initialDutyDay = this.visitDayOfMonth(cdomc.dayOfMonth());
                            initialDutyDay.setWeekday(Weekday.fromValue(Mappings.weekdays.get(dayOfWeek)));
                            pairing.getInitialDutyDays().getInitialDutyDay().add(initialDutyDay);
                        }
                        dayOfWeek++;
                    }
                }

                if ((null != contentContext.contentSeparator())
                        && (null != contentContext.contentSeparator().layover())) {
                    // layover
                    Layover layover = this.visitLayover(contentContext.contentSeparator().layover());
                    pairing.getDutyDays().getDutyDay().get(dutyDayIndex - 1).setLayover(layover);
                } else if (null != contentContext.checkin()) {
                    // checkin
                    pairing.getDutyDays().getDutyDay().add(pairingsFactory.createDutyDay());
                    dutyDayIndex = pairing.getDutyDays().getDutyDay().size();

                    if (1 == dutyDayIndex) {
                        this.currentTime = ZonedDateTime.of(this.effectiveDate, LocalTime.MIDNIGHT, this.baseTimeZone);
                    }

                    Checkin checkin = this.visitCheckin(contentContext.checkin());
                    pairing.getDutyDays().getDutyDay().get(dutyDayIndex - 1).setCheckin(checkin);
                } else if (null != contentContext.checkout()) {
                    // checkout
                    Checkout checkout = this.visitCheckout(contentContext.checkout());
                    pairing.getDutyDays().getDutyDay().get(dutyDayIndex - 1).setCheckout(checkout);
                } else if (null != contentContext.leg()) {
                    // legs
                    Leg leg = this.visitLeg(contentContext.leg());
                    pairing.getDutyDays().getDutyDay().get(dutyDayIndex - 1).getLeg().add(leg);

                    // duty
                    int dutySequence = 0;

                    if (null != contentContext.leg().flightLeg()) {
                        dutySequence = Integer
                                .parseInt(contentContext.leg().flightLeg().dutyDay().dayOfDuty().NAT().getText());
                    } else if (null != contentContext.leg().groundLeg()) {
                        dutySequence = Integer
                                .parseInt(contentContext.leg().groundLeg().dutyDay().dayOfDuty().NAT().getText());
                    }
                    pairing.getDutyDays().getDutyDay().get(dutyDayIndex - 1)
                            .setSequence(BigInteger.valueOf(dutySequence));
                    pairing.setLength(BigInteger.valueOf(dutySequence));
                }
            }

            // time away from home base
            pairing.setTimeAwayFromBase(this.visitDuration(footerContext.summary().tafbSummary().duration()));

            // credit
            pairing.setCredit(this.visitDuration(footerContext.summary().creditSummary().credit().duration()));

            // credit annotation
            if (null != footerContext.summary().creditSummary().credit().creditAnnotation()) {
                pairing.setCreditAnnotation(this
                        .visitCreditAnnotation(footerContext.summary().creditSummary().credit().creditAnnotation()));
            }

            // per diem
            pairing.setPerDiem(this.visitHours(footerContext.summary().perdiemSummary().hours()));
        } else {
            throw new IllegalArgumentException();
        }

        return pairing;
    }

    /**
     * Visits and transforms an ANTLR AST pairing annotation context to an XML pairing annotation representation.
     * 
     * @param pairingAnnotationContext
     *                                     the ANTLR AST pairing annotation context
     * 
     * @return the XML pairing annotation representation of the ANTLR AST pairing annotation context
     * 
     * @throws IllegalArgumentException
     *                                      if pairingAnnotationContext is null
     * 
     * @see PairingsBaseVisitor#visitPairingAnnotation(PairingAnnotationContext)
     */
    @Override
    public PairingAnnotation visitPairingAnnotation(PairingAnnotationContext pairingAnnotationContext) {
        PairingAnnotation pairingAnnotation = null;

        if (null != pairingAnnotationContext) {
            pairingAnnotation = PairingAnnotation.fromValue(Mappings.pairingAnnotations
                    .get(pairingAnnotationContext.PAIRING_ANNOTATION().getText().substring(1, 3)));
        } else {
            throw new IllegalArgumentException();
        }

        return pairingAnnotation;
    }

    /**
     * Visits and transforms an ANTLR AST pairing identifier context to a pairing identifier.
     * 
     * @param pairingIdContext
     *                             the ANTLR AST pairing identifier context
     * 
     * @return the pairing identifier of the ANTLR AST pairing identifier context
     * 
     * @throws IllegalArgumentException
     *                                      if pairingIdContext is null
     * 
     * @see PairingsBaseVisitor#visitPairingId(PairingIdContext)
     */
    @Override
    public String visitPairingId(PairingIdContext pairingIdContext) {
        String pairingId = null;

        if (null != pairingIdContext) {
            pairingId = pairingIdContext.PAIRING_ID().getText();
        } else {
            throw new IllegalArgumentException();
        }

        return pairingId;
    }

    /**
     * Visits and transforms an ANTLR AST pairings context to an XML pairings representation.
     * 
     * @param pairingsContext
     *                            the ANTLR AST pairings context
     * 
     * @return the XML pairings representation of the ANTLR AST pairings context
     * 
     * @throws IllegalArgumentException
     *                                      if pairingsContext is null
     * 
     * @see PairingsBaseVisitor#visitPairings(PairingsContext)
     */
    @Override
    public Pairings visitPairings(PairingsContext pairingsContext) {
        Pairings pairings = pairingsFactory.createPairings();

        if (null != pairingsContext) {
            boolean validitySet = false;

            for (PairingContext pairingContext : pairingsContext.pairing()) {
                final PreliminaryPairing prelimPairing = this.visitPairing(pairingContext);
                if (prelimPairing instanceof Pairing pairing) {
                    pairings.getPairing().add(pairing);

                    for (InitialDutyDay idd : pairing.getInitialDutyDays().getInitialDutyDay()) {
                        if (validitySet) {
                            updateValidity(pairings, idd.getDate());
                        } else {
                            setValidity(pairings, idd.getDate(), idd.getDate());
                            validitySet = true;
                        }
                    }
                } else {
                    pairings.getPreliminaryPairing().add(prelimPairing);

                    for (InitialDutyDay idd : prelimPairing.getInitialDutyDays().getInitialDutyDay()) {
                        if (validitySet) {
                            updateValidity(pairings, idd.getDate());
                        } else {
                            setValidity(pairings, idd.getDate(), idd.getDate());
                            validitySet = true;
                        }
                    }
                }
            }
        } else {
            throw new IllegalArgumentException();
        }

        return pairings;
    }

    /**
     * Visits and transforms an ANTLR AST pairings document context to an XML pairings representation.
     * 
     * @param pairingsDocumentContext
     *                                    the ANTLR AST pairings document context
     * 
     * @return the XML pairings representation of the ANTLR AST pairings document context
     * 
     * @throws IllegalArgumentException
     *                                      if pairingsDocumentContext is null
     * 
     * @see PairingsBaseVisitor#visitPairingsDocument(PairingsDocumentContext)
     */
    @Override
    public Pairings visitPairingsDocument(PairingsDocumentContext pairingsDocumentContext) {
        if (null != pairingsDocumentContext) {
            int year = Integer.parseInt(pairingsDocumentContext.titlePage().title().year().NAT().getText());
            int month = -1;

            if (null != pairingsDocumentContext.titlePage().title().month()) {
                month = Mappings.months.get(pairingsDocumentContext.titlePage().title().month().MONTH().getText());
            } else if (null != pairingsDocumentContext.titlePage().title().longMonth()) {
                month = Mappings.months
                        .get(pairingsDocumentContext.titlePage().title().longMonth().LONG_MONTH().getText());
            }

            this.effectiveDate = LocalDate.of(year, month, 1);
        } else {
            throw new IllegalArgumentException();
        }

        return this.visitPairings(pairingsDocumentContext.pairings());
    }

    /**
     * Visits and transforms an ANTLR AST preliminary headline context to an XML preliminary pairing representation.
     * 
     * @param preliminaryHeadlineContext
     *                                       the ANTLR AST preliminary headline context
     * 
     * @return the XML preliminary pairings representation of the ANTLR AST preliminary headline context
     * 
     * @throws IllegalArgumentException
     *                                      if preliminaryHeadlineContext is null
     * 
     * @see PairingsBaseVisitor#visitPreliminaryHeadline(PreliminaryHeadlineContext)
     */
    @Override
    public PreliminaryPairing visitPreliminaryHeadline(PreliminaryHeadlineContext preliminaryHeadlineContext) {
        PreliminaryPairing preliminaryPairing = pairingsFactory.createPreliminaryPairing();

        if (null != preliminaryHeadlineContext) {
            // pairing annotation
            preliminaryPairing.setPairingAnnotation(
                    this.visitPairingAnnotation(preliminaryHeadlineContext.commonHeadline().pairingAnnotation()));

            // crew
            preliminaryPairing.setCrew(this.visitCrew(preliminaryHeadlineContext.commonHeadline().crew()));

            // base
            preliminaryPairing.setBase(this.visitBaseIata(preliminaryHeadlineContext.commonHeadline().baseIata()));

            // effective date
            this.effectiveDate = this.visitEffectiveness(preliminaryHeadlineContext.commonHeadline().effectiveness());
        } else {
            throw new IllegalArgumentException();
        }

        return preliminaryPairing;
    }

    /**
     * Visits and transforms an ANTLR AST time context to a corresponding local time.
     * 
     * @param timeContext
     *                        the ANTLR AST time context
     * 
     * @return the local time corresponding to the ANTLR AST time context
     * 
     * @throws IllegalArgumentException
     *                                      if timeContext is null
     * 
     * @see PairingsBaseVisitor#visitTime(TimeContext)
     */
    @Override
    public LocalTime visitTime(TimeContext timeContext) {
        LocalTime localTime = null;

        if (null != timeContext) {
            String time = timeContext.TIME().getText();
            int timeHours = Integer.parseInt(time.substring(0, time.indexOf(':')));
            int timeMinutes = Integer.parseInt(time.substring(time.indexOf(':') + 1));
            localTime = LocalTime.of(timeHours, timeMinutes);
        } else {
            throw new IllegalArgumentException();
        }

        return localTime;
    }

    /**
     * Visits and transforms an ANTLR AST transportation context to an XML transportation representation.
     * 
     * @param transportationContext
     *                                  the ANTLR AST transportation context
     * 
     * @return the XML transportation representation of the ANTLR AST transportation context
     * 
     * @throws IllegalArgumentException
     *                                      if transportationContext is null
     * 
     * @see PairingsBaseVisitor#visitTransportation(TransportationContext)
     */
    @Override
    public Transportation visitTransportation(TransportationContext transportationContext) {
        Transportation transportation = pairingsFactory.createTransportation();

        if (null != transportationContext) {
            // create a space separated details string
            String details = "";
            for (int childIndex = 0; childIndex < transportationContext.getChildCount(); childIndex++) {
                details = details.concat(transportationContext.getChild(childIndex).getText() + " ");
            }
            details = details.trim();
            transportation.setDetails(details);
        } else {
            throw new IllegalArgumentException();
        }

        return transportation;
    }

    /**
     * Visits and transforms an ANTLR AST trip number context to a corresponding trip number.
     * 
     * @param tripNumberContext
     *                              the ANTLR AST trip number context
     * 
     * @return the trip number corresponding to the ANTLR AST trip number context
     * 
     * @throws IllegalArgumentException
     *                                      if tripNumberContext is null
     * 
     * @see PairingsBaseVisitor#visitTripNumber(TripNumberContext)
     */
    @Override
    public BigInteger visitTripNumber(TripNumberContext tripNumberContext) {
        BigInteger tripNumber;

        if (null != tripNumberContext) {
            tripNumber = BigInteger.valueOf(Long.parseLong(tripNumberContext.NAT().getText()));
        } else {
            throw new IllegalArgumentException();
        }

        return tripNumber;
    }

}
