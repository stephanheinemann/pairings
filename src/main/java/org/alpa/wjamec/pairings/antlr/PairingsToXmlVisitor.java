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
 * Visits the ANTLR pairings AST and transforms it into a XML pairings representation.
 * 
 * @see Pairings
 * 
 * @author Stephan Heinemann
 */
public class PairingsToXmlVisitor extends PairingsBaseVisitor<Object> {

    /** the pairings object factory */
    private final ObjectFactory pairingsFactory = new ObjectFactory();

    /** the year of the current pairing */
    private int year = -1;

    /** the effective local date of the first initial duty day of the current pairing */
    private LocalDate effectiveDate = null;

    /** the airport time zone of the current airport */
    private ZoneId airportTimeZone = null;

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
    private XMLGregorianCalendar toXmlGregorianCalendar(LocalDateTime localDateTime, ZoneId timeZone) {
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
            LocalDateTime outDateTime = LocalDateTime.of(this.effectiveDate, outTime);
            checkin.setOut(this.toXmlGregorianCalendar(outDateTime, this.airportTimeZone));

            // time on ground
            checkin.setTimeOnGround(this.visitDuration(checkinContext.tog().duration()));

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
            LocalDateTime inDateTime = LocalDateTime.of(this.effectiveDate, inTime);
            checkout.setIn(this.toXmlGregorianCalendar(inDateTime, this.airportTimeZone));

            // block time
            checkout.setBlock(this.visitDuration(checkoutContext.block().duration()));

            // time on ground
            checkout.setTimeOnGround(this.visitDuration(checkoutContext.tog().duration()));

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

    @Override
    public InitialDutyDay visitDayOfMonth(DayOfMonthContext dayOfMonthContext) {
        InitialDutyDay initialDutyDay = pairingsFactory.createInitialDutyDay();

        Integer dayOfMonth = Integer.parseInt(dayOfMonthContext.NAT().getText());
        LocalDate localDate = LocalDate.of(this.effectiveDate.getYear(), this.effectiveDate.getMonth(), dayOfMonth);
        LocalTime localTime = LocalTime.MIDNIGHT;
        LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);
        initialDutyDay.setDate(this.toXmlGregorianCalendar(localDateTime, this.airportTimeZone));

        return initialDutyDay;
    }

    @Override
    public Duration visitDuration(DurationContext durationContext) {
        Duration duration = null;

        try {
            String lexicalDuration = "PT".concat(durationContext.DURATION().getText().toUpperCase().concat("M"));
            duration = DatatypeFactory.newInstance().newDuration(lexicalDuration);
        } catch (DatatypeConfigurationException dce) {
            dce.printStackTrace();
        }

        return duration;
    }

    @Override
    public LocalDate visitEffectiveness(EffectivenessContext effectivenessContext) {
        int month = Mappings.months.get(effectivenessContext.period().month().MONTH().getText());
        int dayOfMonth = Integer.parseInt(effectivenessContext.period().dayToMonth().dayOfMonth().NAT().getText());

        return LocalDate.of(this.year, month, dayOfMonth);
    }

    @Override
    public FlightLeg visitFlightLeg(FlightLegContext flightLegContext) {
        FlightLeg flightLeg = pairingsFactory.createFlightLeg();

        // origin
        flightLeg.setOrigin(flightLegContext.origin().getText());

        // destination
        flightLeg.setDestination(flightLegContext.destination().getText());

        // out time
        LocalTime outTime = this.visitTime(flightLegContext.out().time());

        // first departure date of the month
        LocalDate outDate = this.effectiveDate;
        LocalDateTime outDateTime = LocalDateTime.of(outDate, outTime);
        ZoneId originZoneId = ZoneId.of(Mappings.timeZones.get(flightLeg.getOrigin()));
        flightLeg.setOut(this.toXmlGregorianCalendar(outDateTime, originZoneId));

        // in time
        LocalTime inTime = this.visitTime(flightLegContext.in().time());

        // first arrival date of the month
        LocalDate inDate = this.effectiveDate;
        // TODO: think about date change again
        if (inTime.isBefore(outTime)) {
            inDate = inDate.plusDays(1);
        }

        LocalDateTime inDateTime = LocalDateTime.of(inDate, inTime);
        ZoneId destinationZoneId = ZoneId.of(Mappings.timeZones.get(flightLeg.getDestination()));
        flightLeg.setIn(this.toXmlGregorianCalendar(inDateTime, destinationZoneId));

        // block time
        flightLeg.setBlock(this.visitDuration(flightLegContext.block().duration()));

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
            }

            if (null != flightLegContext.tog().ASTERISK()) {
                flightLeg.setTailSwap(true);
            }
        }

        // crew
        if (null != flightLegContext.crew()) {
            flightLeg.setCrew(this.visitCrew(flightLegContext.crew()));
        }

        return flightLeg;
    }

    @Override
    public GroundLeg visitGroundLeg(GroundLegContext groundLegContext) {
        GroundLeg groundLeg = pairingsFactory.createGroundLeg();

        // origin
        groundLeg.setOrigin(groundLegContext.origin().getText());

        // destination
        groundLeg.setDestination(groundLegContext.destination().getText());

        // out time
        LocalTime outTime = this.visitTime(groundLegContext.out().time());

        // first departure date of the month
        LocalDate outDate = this.effectiveDate;
        LocalDateTime outDateTime = LocalDateTime.of(outDate, outTime);
        ZoneId originZoneId = ZoneId.of(Mappings.timeZones.get(groundLeg.getOrigin()));
        groundLeg.setOut(this.toXmlGregorianCalendar(outDateTime, originZoneId));

        // in time
        LocalTime inTime = this.visitTime(groundLegContext.in().time());

        // first arrival date of the month
        LocalDate inDate = this.effectiveDate;
        // TODO: think about date change again
        if (inTime.isBefore(outTime)) {
            inDate = inDate.plusDays(1);
        }

        LocalDateTime inDateTime = LocalDateTime.of(inDate, inTime);
        ZoneId destinationZoneId = ZoneId.of(Mappings.timeZones.get(groundLeg.getDestination()));
        groundLeg.setIn(this.toXmlGregorianCalendar(inDateTime, destinationZoneId));

        // block time
        groundLeg.setBlock(this.visitDuration(groundLegContext.block().duration()));

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
        groundLeg.setVehicle(Vehicle.fromValue(Mappings.vehicles.get(groundLegContext.ground().GROUND().getText())));

        return groundLeg;
    }

    @Override
    public Float visitHours(HoursContext hoursContext) {
        return Float.parseFloat(hoursContext.NATREAL().getText());
    }

    @Override
    public Layover visitLayover(LayoverContext layoverContext) {
        Layover layover = pairingsFactory.createLayover();

        // lay-over duration
        layover.setLayover(this.visitDuration(layoverContext.layoverDurations().layoverDuration().duration()));

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
            transportation.setTransportation(this
                    .visitDuration(layoverContext.layoverDurations().transportationDuration().duration()).multiply(2));
        }
        layover.setTransportation(transportation);

        return layover;
    }

    @Override
    public Leg visitLeg(LegContext legContext) {
        Leg leg = null;

        if (null != legContext.flightLeg()) {
            leg = this.visitFlightLeg(legContext.flightLeg());
        } else if (null != legContext.groundLeg()) {
            leg = this.visitGroundLeg(legContext.groundLeg());
        }

        return leg;
    }

    @Override
    public PreliminaryPairing visitPairing(PairingContext pairingContext) {
        PreliminaryPairing pairing = null;

        HeaderContext headerContext = pairingContext.header();
        HeadlineContext headlineContext = headerContext.headline();
        ContentsContext contentsContext = pairingContext.contents();
        FooterContext footerContext = pairingContext.footer();

        if (null != headlineContext.preliminaryHeadline()) {
            PreliminaryHeadlineContext prelimHeadlineContext = headlineContext.preliminaryHeadline();
            pairing = pairingsFactory.createPreliminaryPairing();

            // pairing annotation
            pairing.setPairingAnnotation(
                    this.visitPairingAnnotation(prelimHeadlineContext.commonHeadline().pairingAnnotation()));

            // crew
            pairing.setCrew(this.visitCrew(prelimHeadlineContext.commonHeadline().crew()));

            // base
            pairing.setBase(this.visitBaseIata(prelimHeadlineContext.commonHeadline().baseIata()));

            // effective date
            this.effectiveDate = this.visitEffectiveness(prelimHeadlineContext.commonHeadline().effectiveness());

        } else if (null != headlineContext.finalHeadline()) {
            FinalHeadlineContext finalHeadlineContext = headlineContext.finalHeadline();
            pairing = pairingsFactory.createPairing();

            // trip number
            ((Pairing) pairing).setTrip(this.visitTripNumber(finalHeadlineContext.tripNumber()));

            // pairing id
            ((Pairing) pairing).setPairing(this.visitPairingId(finalHeadlineContext.pairingId()));

            // pairing annotation
            pairing.setPairingAnnotation(
                    this.visitPairingAnnotation(finalHeadlineContext.commonHeadline().pairingAnnotation()));

            // crew
            pairing.setCrew(this.visitCrew(finalHeadlineContext.commonHeadline().crew()));

            // base
            pairing.setBase(this.visitBaseIata(finalHeadlineContext.commonHeadline().baseIata()));

            // effectivef date
            this.effectiveDate = this.visitEffectiveness(finalHeadlineContext.commonHeadline().effectiveness());
        }

        // initial duty days
        pairing.setInitialDutyDays(pairingsFactory.createInitialDutyDays());

        // duty days
        int dutyDayIndex = 0;
        pairing.setDutyDays(pairingsFactory.createDutyDays());

        for (ContentContext contentContext : contentsContext.content()) {
            if (null != contentContext.calendarWeek()) {
                int dayOfWeek = 1;
                CalendarDaysOfMonthContext cdsomc = contentContext.calendarWeek().calendarDaysOfMonth();
                for (CalendarDayOfMonthContext cdomc : cdsomc.calendarDayOfMonth()) {
                    if (null != cdomc.dayOfMonth()) {
                        String airportIata = Mappings.iataBases.get(pairing.getBase().value());
                        this.airportTimeZone = ZoneId.of(Mappings.timeZones.get(airportIata));
                        InitialDutyDay initialDutyDay = this.visitDayOfMonth(cdomc.dayOfMonth());
                        initialDutyDay.setWeekday(Weekday.fromValue(Mappings.weekdays.get(dayOfWeek)));
                        pairing.getInitialDutyDays().getInitialDutyDay().add(initialDutyDay);
                    }
                    dayOfWeek++;
                }
            }

            if ((null != contentContext.contentSeparator()) && (null != contentContext.contentSeparator().layover())) {
                // layover
                Layover layover = this.visitLayover(contentContext.contentSeparator().layover());
                pairing.getDutyDays().getDutyDay().get(dutyDayIndex - 1).setLayover(layover);
            } else if (null != contentContext.checkin()) {
                // checkin
                pairing.getDutyDays().getDutyDay().add(pairingsFactory.createDutyDay());
                dutyDayIndex = pairing.getDutyDays().getDutyDay().size();

                if (1 == dutyDayIndex) {
                    String airportIata = Mappings.iataBases.get(pairing.getBase().value());
                    this.airportTimeZone = ZoneId.of(Mappings.timeZones.get(airportIata));
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
                this.airportTimeZone = ZoneId.of(Mappings.timeZones.get(leg.getDestination()));

                // duty
                int dutySequence = 0;

                if (null != contentContext.leg().flightLeg()) {
                    dutySequence = Integer
                            .parseInt(contentContext.leg().flightLeg().dutyDay().dayOfDuty().NAT().getText());
                } else if (null != contentContext.leg().groundLeg()) {
                    dutySequence = Integer
                            .parseInt(contentContext.leg().groundLeg().dutyDay().dayOfDuty().NAT().getText());
                }
                pairing.getDutyDays().getDutyDay().get(dutyDayIndex - 1).setSequence(BigInteger.valueOf(dutySequence));
                pairing.setLength(BigInteger.valueOf(dutySequence));
            }
        }

        // time away from home base
        pairing.setTimeAwayFromBase(this.visitDuration(footerContext.summary().tafbSummary().duration()));

        // credit
        pairing.setCredit(this.visitDuration(footerContext.summary().creditSummary().credit().duration()));

        // credit annotation
        if (null != footerContext.summary().creditSummary().credit().creditAnnotation()) {
            pairing.setCreditAnnotation(
                    this.visitCreditAnnotation(footerContext.summary().creditSummary().credit().creditAnnotation()));
        }

        // per diem
        pairing.setPerDiem(this.visitHours(footerContext.summary().perdiemSummary().hours()));

        return pairing;
    }

    @Override
    public PairingAnnotation visitPairingAnnotation(PairingAnnotationContext pairingAnnotationContext) {
        return PairingAnnotation.fromValue(Mappings.pairingAnnotations
                .get(pairingAnnotationContext.PAIRING_ANNOTATION().getText().substring(1, 3)));
    }

    @Override
    public String visitPairingId(PairingIdContext pairingIdContext) {
        return pairingIdContext.PAIRING_ID().getText();
    }

    @Override
    public Pairings visitPairings(PairingsContext pairingsContext) {
        Pairings pairings = pairingsFactory.createPairings();
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

        return pairings;
    }

    @Override
    public Pairings visitPairingsDocument(PairingsDocumentContext pairingsDocumentContext) {
        this.year = Integer.parseInt(pairingsDocumentContext.titlePage().title().year().NAT().getText());

        return this.visitPairings(pairingsDocumentContext.pairings());
    }

    @Override
    public LocalTime visitTime(TimeContext timeContext) {
        String time = timeContext.TIME().getText();
        int timeHours = Integer.parseInt(time.substring(0, time.indexOf(':')));
        int timeMinutes = Integer.parseInt(time.substring(time.indexOf(':') + 1));

        return LocalTime.of(timeHours, timeMinutes);
    }

    @Override
    public Transportation visitTransportation(TransportationContext transportationContext) {
        Transportation transportation = pairingsFactory.createTransportation();

        // transportation.setDetails(transportationContext.getText());
        String details = "";
        for (int childIndex = 0; childIndex < transportationContext.getChildCount(); childIndex++) {
            details = details.concat(transportationContext.getChild(childIndex).getText() + " ");
        }
        details = details.trim();
        transportation.setDetails(details);

        return transportation;
    }

    @Override
    public BigInteger visitTripNumber(TripNumberContext tripNumberContext) {
        return BigInteger.valueOf(Long.parseLong(tripNumberContext.NAT().getText()));
    }

}
