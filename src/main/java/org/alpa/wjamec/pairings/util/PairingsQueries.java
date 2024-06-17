package org.alpa.wjamec.pairings.util;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.time.Duration;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.function.BiFunction;
import java.util.function.Predicate;
import java.util.stream.Stream;

import org.alpa.wjamec.pairings.jaxb.Base;
import org.alpa.wjamec.pairings.jaxb.DutyAnnotation;
import org.alpa.wjamec.pairings.jaxb.DutyDay;
import org.alpa.wjamec.pairings.jaxb.Leg;
import org.alpa.wjamec.pairings.jaxb.Pairing;
import org.alpa.wjamec.pairings.jaxb.Pairings;
import org.alpa.wjamec.pairings.jaxb.PreliminaryPairing;

/**
 * Provides queries for pairings.
 * 
 * @see Pairings
 * @see PreliminaryPairing
 * @see Pairing
 * 
 * @author Stephan Heinemann
 */
public class PairingsQueries {

    /**
     * Hides the default constructor.
     */
    private PairingsQueries() {
    }

    /**
     * Collects the airports of pairings, that is, the network covered by pairings.
     * 
     * @param pairings
     *                     the pairings containing the origin and destination airports
     * @return the airports of the pairings
     */
    public static SortedSet<String> collectAirports(Pairings pairings) {
        SortedSet<String> airports = new TreeSet<>();

        for (PreliminaryPairing preliminary : pairings.getPairing()) {
            for (DutyDay dutyDay : preliminary.getDutyDays().getDutyDay()) {
                for (Leg leg : dutyDay.getLeg()) {
                    airports.add(leg.getOrigin());
                    airports.add(leg.getDestination());
                }
            }
        }

        for (Pairing pairing : pairings.getPairing()) {
            for (DutyDay dutyDay : pairing.getDutyDays().getDutyDay()) {
                for (Leg leg : dutyDay.getLeg()) {
                    airports.add(leg.getOrigin());
                    airports.add(leg.getDestination());
                }
            }
        }

        return airports;
    }

    /**
     * Gets the credit ratio for a preliminary pairing, that is, its average daily credit.
     * 
     * @param preliminary
     *                        the preliminary pairing
     * @return the credit ratio for the preliminary pairing
     */
    public static Duration getCreditRatio(PreliminaryPairing preliminary) {
        return Duration.parse(getCreditRatioAttribute(preliminary).toString());
    }

    /**
     * Gets the credit ratio attribute for a preliminary pairing, that is, its average daily credit.
     * 
     * @param preliminary
     *                        the preliminary pairing
     * @return the credit ratio attribute for the preliminary pairing
     */
    public static javax.xml.datatype.Duration getCreditRatioAttribute(PreliminaryPairing preliminary) {
        return preliminary.getCredit().multiply(
                BigDecimal.valueOf(1).divide(new BigDecimal(preliminary.getLength()), 2, RoundingMode.HALF_UP));
    }

    /**
     * Adds the credits of preliminary pairings.
     * 
     * @param preliminaries
     *                          the preliminary pairings
     * @return the added credits of the preliminary pairings
     */
    public static Duration addCredits(Collection<? extends PreliminaryPairing> preliminaries) {
        return addCredits(preliminaries.stream());
    }

    /**
     * Adds the credits of preliminary pairings.
     * 
     * @param preliminaries
     *                          the preliminary pairings
     * @return the added credits of the preliminary pairings
     */
    public static Duration addCredits(Stream<? extends PreliminaryPairing> preliminaries) {
        return preliminaries.reduce(Duration.ZERO, addCredit(), Duration::plus);
    }

    /**
     * Adds the per diems of preliminary pairings.
     * 
     * @param preliminaries
     *                          the preliminary pairings
     * @return the added per diems of the preliminary pairings
     */
    public static Float addPerDiems(Collection<? extends PreliminaryPairing> preliminaries) {
        return addPerDiems(preliminaries.stream());
    }

    /**
     * Adds the per diems of preliminary pairings.
     * 
     * @param preliminaries
     *                          the preliminary pairings
     * @return the added per diems of the preliminary pairings
     */
    public static Float addPerDiems(Stream<? extends PreliminaryPairing> preliminaries) {
        return preliminaries.reduce(0f, addPerDiem(), (a, b) -> a + b);
    }

    /**
     * Sorts preliminary pairings applying a provided comparator.
     * 
     * @param preliminaries
     *                          the preliminary pairings to be sorted
     * @param comparator
     *                          the comparator on preliminary pairings
     */
    public static void sortBy(List<? extends PreliminaryPairing> preliminaries,
            Comparator<? super PreliminaryPairing> comparator) {
        preliminaries.sort(comparator);
    }

    /**
     * Defines a credit-comparing comparator on preliminary pairings.
     * 
     * @return the credit-comparing comparator on preliminary pairings
     */
    public static Comparator<PreliminaryPairing> creditComparing() {
        return Comparator.comparing(PreliminaryPairing::getCredit, javax.xml.datatype.Duration::compare);
    }

    /**
     * Defines a credit-ratio-comparing comparator on preliminary pairings.
     * 
     * @return the credit-ratio-comparing comparator on preliminary pairings
     */
    public static Comparator<PreliminaryPairing> creditRatioComparing() {
        return (first, second) -> getCreditRatio(first).compareTo(getCreditRatio(second));
    }

    /**
     * Defines a duty-days-comparing comparator on preliminary pairings.
     * 
     * @return the duty-days-comparing comparator on preliminary pairings
     */
    public static Comparator<PreliminaryPairing> dutyDaysComparing() {
        return Comparator.comparing(PreliminaryPairing::getLength, Comparable::compareTo);
    }

    /**
     * Defines a per-diem-comparing comparator on preliminary pairings.
     * 
     * @return the per-diem-comparing comparator on preliminary pairings
     */
    public static Comparator<PreliminaryPairing> perDiemComparing() {
        return Comparator.comparing(PreliminaryPairing::getPerDiem, Float::compareTo);
    }

    /**
     * Defines a credit-ratio- then per-diem-comparing comparator on preliminary pairings.
     * 
     * @return the credit ratio- then per-diem-comparing comparator on preliminary pairings
     */
    public static Comparator<PreliminaryPairing> creditRatioThenPerDiemComparing() {
        return creditRatioComparing().thenComparing(perDiemComparing());
    }

    /**
     * Defines a start base predicate on preliminary pairings.
     * 
     * @param base
     *                 the start base of a preliminary pairing
     * @return the start base predicate on preliminary pairings that returns true if the the preliminary pairing starts
     *         at
     *         the base, false otherwise
     */
    public static Predicate<PreliminaryPairing> startsAtBase(Base base) {
        return (pairing -> pairing.getBase().equals(base));
    }

    /**
     * Defines a destination-including predicate on preliminary pairings.
     * 
     * @param destination
     *                        the destination of a preliminary pairing
     * @return the destination-including predicate on preliminary pairings that returns true if the preliminary pairing
     *         includes the destination, false otherwise
     */
    public static Predicate<PreliminaryPairing> includesDestination(String destination) {
        return (pairing -> pairing.getDutyDays().getDutyDay().stream().anyMatch(
                dutyDay -> dutyDay.getLeg().stream().anyMatch(leg -> leg.getDestination().equals(destination))));
    }

    /**
     * Defines a red-eye-excluding predicate on preliminary pairings.
     * 
     * @return the red-eye-excluding predicate on preliminary pairings that returns true if the preliminary pairing does
     *         not include red-eye duty days, false otherwise
     */
    public static Predicate<PreliminaryPairing> excludesRedEyes() {
        return (pairing -> pairing.getDutyDays().getDutyDay().stream()
                .noneMatch(dutyDay -> (null != dutyDay.getCheckin().getDutyAnnotation())
                        && (dutyDay.getCheckin().getDutyAnnotation().equals(DutyAnnotation.RED_EYE_DUTY))));
    }

    /**
     * Defines an idle-duty-excluding predicate on preliminary pairings.
     * 
     * @return the idle-duty-excluding predicate on preliminary pairings that returns true if the preliminary pairing
     *         does not include any idle duty days, false otherwise
     */
    public static Predicate<PreliminaryPairing> excludesIdleDutyDays() {
        return (pairing -> pairing.getLength().equals(BigInteger.valueOf(pairing.getDutyDays().getDutyDay().size())));
    }

    /**
     * Defines a start-on-or-before-date predicate on preliminary pairings.
     * 
     * @param date
     *                 the initial duty day date of a preliminary pairing
     * @return the start-on-or-before-date predicate on preliminary pairings that returns true if any of the preliminary
     *         pairing initial duty days is on or before the date, false otherwise
     */
    public static Predicate<PreliminaryPairing> startsOnOrBeforeDate(LocalDate date) {
        return (pairing -> pairing.getInitialDutyDays().getInitialDutyDay().stream().anyMatch(initialDutyDay -> {
            ZonedDateTime dutyDateTime = ZonedDateTime.parse(initialDutyDay.getDate().toString());
            return (0 >= dutyDateTime.toLocalDate().compareTo(date));
        }));
    }

    /**
     * Defines a starts-after-date predicate on preliminary pairings.
     * 
     * @param date
     *                 the initial duty day date of a preliminary pairing
     * @return the starts-after-date predicate on preliminary pairings that returns true if any of the preliminary
     *         pairing initial duty days is after the date, false otherwise
     */
    public static Predicate<PreliminaryPairing> startsAfterDate(LocalDate date) {
        return (pairing -> pairing.getInitialDutyDays().getInitialDutyDay().stream().anyMatch(initialDutyDay -> {
            ZonedDateTime dutyDateTime = ZonedDateTime.parse(initialDutyDay.getDate().toString());
            return (0 < dutyDateTime.toLocalDate().compareTo(date));
        }));
    }

    /**
     * Defines an ends-before-date predicate on preliminary pairings.
     * 
     * @param date
     *                 the final duty day date a preliminary pairing
     * @return the ends-before-date predicate on preliminary pairings that returns true if any of the preliminary
     *         pairing final duty days is before the date, false otherwise
     */
    public static Predicate<PreliminaryPairing> endsBeforeDate(LocalDate date) {
        return (pairing -> pairing.getInitialDutyDays().getInitialDutyDay().stream().anyMatch(initialDutyDay -> {
            ZonedDateTime dutyDateTime = ZonedDateTime.parse(initialDutyDay.getDate().toString());
            dutyDateTime = dutyDateTime.plusDays(pairing.getLength().longValue() - 1);
            return (0 > dutyDateTime.toLocalDate().compareTo(date));
        }));
    }

    /**
     * Defines an ends-on-or-after-date predicate on preliminary pairings.
     * 
     * @param date
     *                 the final duty day date of a preliminary pairing
     * @return the ends-on-or-after date predicate on preliminary pairings that returns true if any of the preliminary
     *         pairing final duty days is on or after the date, false otherwise
     */
    public static Predicate<PreliminaryPairing> endsOnOrAfterDate(LocalDate date) {
        return (pairing -> pairing.getInitialDutyDays().getInitialDutyDay().stream().anyMatch(initialDutyDay -> {
            ZonedDateTime dutyDateTime = ZonedDateTime.parse(initialDutyDay.getDate().toString());
            dutyDateTime = dutyDateTime.plusDays(pairing.getLength().longValue() - 1);
            return (0 <= dutyDateTime.toLocalDate().compareTo(date));
        }));
    }

    /**
     * Defines a within-dates predicate on preliminary pairings.
     * 
     * @param start
     *                  the initial duty day date of a preliminary pairing
     * @param end
     *                  the final duty day date of a preliminary pairing
     * @return the within-dates predicate on preliminary pairings that returns true if any of the preliminary
     *         pairing initial and final duty day pairs are within the start and end date, false otherwise
     */
    public static Predicate<PreliminaryPairing> isWithinDates(LocalDate start, LocalDate end) {
        return (pairing -> pairing.getInitialDutyDays().getInitialDutyDay().stream().filter(initialDutyDay -> {
            ZonedDateTime dutyDateTime = ZonedDateTime.parse(initialDutyDay.getDate().toString());
            return 0 <= dutyDateTime.toLocalDate().compareTo(start);
        }).anyMatch(initialDutyDay -> {
            ZonedDateTime dutyDateTime = ZonedDateTime.parse(initialDutyDay.getDate().toString());
            dutyDateTime = dutyDateTime.plusDays(pairing.getLength().longValue() - 1);
            return (0 >= dutyDateTime.toLocalDate().compareTo(end));
        }));
    }

    /**
     * Defines an outside-dates predicate on preliminary pairings.
     * 
     * @param start
     *                  the start of the no-duty-day period
     * @param end
     *                  the end of the no-duty-day period
     * @return the outside-dates predicate on preliminary pairings that returns true if any of the preliminary pairing
     *         final duty days is before the start date or any of the preliminary pairing initial duty days is after the
     *         end date, false otherwise
     */
    public static Predicate<PreliminaryPairing> isOutsideDates(LocalDate start, LocalDate end) {
        return (pairing -> (endsBeforeDate(start).test(pairing) || startsAfterDate(end).test(pairing)));
    }

    /**
     * Defines an is-above-credit-ratio predicate on preliminary pairings.
     * 
     * @param creditRatio
     *                        the credit ratio threshold of a preliminary pairing
     * @return the is-above-credit-ratio predicate on preliminary pairings that returns true if the average duty day
     *         credit of the preliminary pairing is above the credit ratio threshold, false otherwise
     */
    public static Predicate<PreliminaryPairing> isAboveCreditRatio(Duration creditRatio) {
        return (pairing -> (0 < getCreditRatio(pairing).compareTo(creditRatio)));
    }

    /**
     * Defines a trip number predicate on pairings.
     * 
     * @param tripNumber
     *                       the trip number to match pairings
     * @return the trip number predicate on pairings that returns true if the pairing matches the trip number, false
     *         otherwise
     */
    public static Predicate<Pairing> matchesTripNumber(int tripNumber) {
        return (pairing -> (tripNumber == pairing.getTrip().intValue()));
    }

    /**
     * Defines a trip numbers predicate on pairings.
     * 
     * @param tripNumbers
     *                        the trip numbers to match pairings
     * @return the trip numbers predicate on pairings that returns true if the pairing matches any of the trip numbers,
     *         false otherwise
     */
    public static Predicate<Pairing> matchesAnyTripNumber(Collection<Integer> tripNumbers) {
        return (pairing -> tripNumbers.contains(pairing.getTrip().intValue()));
    }

    /**
     * Defines a pairing name predicate on pairings.
     * 
     * @param pairingName
     *                        the pairing name to match pairings
     * @return the pairing name predicate on pairings that returns true if the pairing matches the pairing name, false
     *         otherwise
     */
    public static Predicate<Pairing> matchesPairingName(String pairingName) {
        return (pairing -> pairingName.equals(pairing.getPairing()));
    }

    /**
     * Defines a pairing names predicate on pairings.
     * 
     * @param pairingNames
     *                         the pairing names to match pairings
     * @return the pairing names predicate on pairings that returns true if the pairing matches any of the pairing
     *         names, false otherwise
     */
    public static Predicate<Pairing> matchesAnyPairingName(Collection<String> pairingNames) {
        return (pairing -> pairingNames.contains(pairing.getPairing()));
    }

    /**
     * Defines a function to add the credits of preliminary pairings.
     * 
     * @return the function to add the credits of preliminary pairings
     */
    public static BiFunction<Duration, PreliminaryPairing, Duration> addCredit() {
        return (credit, pairing) -> credit.plus(Duration.parse(pairing.getCredit().toString()));
    }

    /**
     * Defines a function to add the per diems of preliminary pairings.
     * 
     * @return the function to add the per diems of preliminary pairings
     */
    public static BiFunction<Float, PreliminaryPairing, Float> addPerDiem() {
        return (perDiem, pairing) -> (perDiem + pairing.getPerDiem());
    }

}
