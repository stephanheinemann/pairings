package org.alpa.wjamec.pairings.util;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.time.Duration;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.Comparator;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.stream.Collectors;
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

    private PairingsQueries() {
    }

    Stream<? extends PreliminaryPairing> filter(Stream<? extends PreliminaryPairing> stream,
            Predicate<PreliminaryPairing> predicate) {
        return stream.filter(predicate);
    }

    public static List<? extends PreliminaryPairing> filterPreliminaries(
            List<? extends PreliminaryPairing> preliminaries, Predicate<PreliminaryPairing> predicate) {
        return preliminaries.stream().filter(predicate).collect(Collectors.toList());
    }

    public static <R> R reducePreliminaries(List<? extends PreliminaryPairing> preliminaries, R identity,
            BiFunction<R, PreliminaryPairing, R> biFunction, BinaryOperator<R> combiner) {
        return preliminaries.stream().reduce(identity, biFunction, combiner);
    }

    public static SortedSet<String> collectAirports(Pairings pairings) {
        SortedSet<String> airports = new TreeSet<>();

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
     * @return a credit-comparing comparator on preliminary pairings
     */
    public static Comparator<PreliminaryPairing> creditComparing() {
        return Comparator.comparing(PreliminaryPairing::getCredit, javax.xml.datatype.Duration::compare);
    }

    /**
     * Defines a credit-ratio-comparing comparator on preliminary pairings.
     * 
     * @return a credit-ratio-comparing comparator on preliminary pairings
     */
    public static Comparator<PreliminaryPairing> creditRatioComparing() {
        return (first, second) -> {
            Duration firstCreditRatio = Duration.parse(first.getCredit()
                    .multiply(BigDecimal.valueOf(1).divide(new BigDecimal(first.getLength()), 2, RoundingMode.HALF_UP))
                    .toString());
            Duration secondCreditRatio = Duration.parse(second.getCredit()
                    .multiply(BigDecimal.valueOf(1).divide(new BigDecimal(second.getLength()), 2, RoundingMode.HALF_UP))
                    .toString());
            return firstCreditRatio.compareTo(secondCreditRatio);
        };
    }

    /**
     * Defines a duty-days-comparing comparator on preliminary pairings.
     * 
     * @return a duty-days-comparing comparator on preliminary pairings
     */
    public static Comparator<PreliminaryPairing> dutyDaysComparing() {
        return Comparator.comparing(PreliminaryPairing::getLength, Comparable::compareTo);
    }

    /**
     * Defines a per-diem-comparing comparator on preliminary pairings.
     * 
     * @return a per-diem-comparing comparator on preliminary pairings
     */
    public static Comparator<PreliminaryPairing> perDiemComparing() {
        return Comparator.comparing(PreliminaryPairing::getPerDiem, Float::compareTo);
    }

    /**
     * Defines a credit-ratio- then per-diem-comparing comparator on preliminary pairings.
     * 
     * @return a credit ratio- then per-diem-comparing comparator on preliminary pairings
     */
    public static Comparator<PreliminaryPairing> creditRatioThenPerDiemComparing() {
        return creditRatioComparing().thenComparing(perDiemComparing());
    }

    /**
     * Defines a start base predicate on preliminary pairings.
     * 
     * @param base
     *                 the start base of a preliminary pairing
     * @return a start base predicate on preliminary pairings that returns true if the the preliminary pairing starts at
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
     * @return a destination-including predicate on preliminary pairings that returns true if the preliminary pairing
     *         includes the destination, false otherwise
     */
    public static Predicate<PreliminaryPairing> includesDestination(String destination) {
        return (pairing -> pairing.getDutyDays().getDutyDay().stream().anyMatch(
                dutyDay -> dutyDay.getLeg().stream().anyMatch(leg -> leg.getDestination().equals(destination))));
    }

    /**
     * Defines a red-eye-excluding predicate on preliminary pairings.
     * 
     * @return a red-eye-excluding predicate on preliminary pairings that returns true if the preliminary pairing does
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
     * @return an idle-duty-excluding predicate on preliminary pairings that returns true if the preliminary pairing
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
     * @return a start-on-or-before-date predicate on preliminary pairings that returns true if any of the preliminary
     *         pairing initial duty days is on or before the date, false otherwise
     */
    public static Predicate<PreliminaryPairing> startsOnOrBeforeDate(LocalDate date) {
        return (pairing -> pairing.getInitialDutyDays().getInitialDutyDay().stream().anyMatch(initialDutyDay -> {
            ZonedDateTime dutyDateTime = ZonedDateTime.parse(initialDutyDay.getDate().toString());
            return 0 >= dutyDateTime.toLocalDate().compareTo(date);
        }));
    }

    /**
     * Defines a starts-after-date predicate on preliminary pairings.
     * 
     * @param date
     *                 the initial duty day date of a preliminary pairing
     * @return a starts-after-date predicate on preliminary pairings that returns true if any of the preliminary
     *         pairing initial duty days is after the date, false otherwise
     */
    public static Predicate<PreliminaryPairing> startsAfterDate(LocalDate date) {
        return (pairing -> pairing.getInitialDutyDays().getInitialDutyDay().stream().anyMatch(initialDutyDay -> {
            ZonedDateTime dutyDateTime = ZonedDateTime.parse(initialDutyDay.getDate().toString());
            return 0 < dutyDateTime.toLocalDate().compareTo(date);
        }));
    }

    /**
     * Defines an ends-before-date predicate on preliminary pairings.
     * 
     * @param date
     *                 the final duty day date a preliminary pairing
     * @return an ends-before-date predicate on preliminary pairings that returns true if any of the preliminary
     *         pairing final duty days is before the date, false otherwise
     */
    public static Predicate<PreliminaryPairing> endsBeforeDate(LocalDate date) {
        return (pairing -> pairing.getInitialDutyDays().getInitialDutyDay().stream().anyMatch(initialDutyDay -> {
            ZonedDateTime dutyDateTime = ZonedDateTime.parse(initialDutyDay.getDate().toString());
            dutyDateTime = dutyDateTime.plusDays(pairing.getLength().longValue() - 1);
            return 0 > dutyDateTime.toLocalDate().compareTo(date);
        }));
    }

    /**
     * Defines an ends-on-or-after-date predicate on preliminary pairings.
     * 
     * @param date
     *                 the final duty day date of a preliminary pairing
     * @return an ends-on-or-after date predicate on preliminary pairings that returns true if any of the preliminary
     *         pairing final duty days is on or after the date, false otherwise
     */
    public static Predicate<PreliminaryPairing> endsOnOrAfterDate(LocalDate date) {
        return (pairing -> pairing.getInitialDutyDays().getInitialDutyDay().stream().anyMatch(initialDutyDay -> {
            ZonedDateTime dutyDateTime = ZonedDateTime.parse(initialDutyDay.getDate().toString());
            dutyDateTime = dutyDateTime.plusDays(pairing.getLength().longValue() - 1);
            return 0 <= dutyDateTime.toLocalDate().compareTo(date);
        }));
    }

    /**
     * Defines a within-dates predicate on preliminary pairings.
     * 
     * @param start
     *                  the initial duty day date of a preliminary pairing
     * @param end
     *                  the final duty day date of a preliminary pairing
     * @return a within-dates predicate on preliminary pairings that returns true if any of the preliminary
     *         pairing initial and final duty day pairs are within the start and end date, false otherwise
     */
    public static Predicate<PreliminaryPairing> isWithinDates(LocalDate start, LocalDate end) {
        return (pairing -> pairing.getInitialDutyDays().getInitialDutyDay().stream().filter(initialDutyDay -> {
            ZonedDateTime dutyDateTime = ZonedDateTime.parse(initialDutyDay.getDate().toString());
            return 0 <= dutyDateTime.toLocalDate().compareTo(start);
        }).anyMatch(initialDutyDay -> {
            ZonedDateTime dutyDateTime = ZonedDateTime.parse(initialDutyDay.getDate().toString());
            dutyDateTime = dutyDateTime.plusDays(pairing.getLength().longValue() - 1);
            return 0 >= dutyDateTime.toLocalDate().compareTo(end);
        }));
    }

    /**
     * Defines an outside-dates predicate on preliminary pairings.
     * 
     * @param start
     *                  the start of the no-duty-day period
     * @param end
     *                  the end of the no-duty-day period
     * @return an outside-dates predicate on preliminary pairings that returns true if any of the preliminary pairing
     *         final duty days is before the start date or any of the preliminary pairing initial duty days is after the
     *         end date, false otherwise
     */
    public static Predicate<PreliminaryPairing> isOutsideDates(LocalDate start, LocalDate end) {
        return (pairing -> endsBeforeDate(start).test(pairing) || startsAfterDate(end).test(pairing));
    }

    /**
     * Defines an is-above-credit-ratio predicate on preliminary pairings.
     * 
     * @param creditRatio
     *                        the credit ratio threshold of a preliminary pairing
     * @return an is-above-credit-ratio predicate on preliminary pairings that returns true if the average duty day
     *         credit of the preliminary pairing is above the credit ratio threshold, false otherwise
     */
    public static Predicate<PreliminaryPairing> isAboveCreditRatio(Duration creditRatio) {
        return (pairing -> (0 < Duration.parse(pairing.getCredit()
                .multiply(BigDecimal.valueOf(1).divide(new BigDecimal(pairing.getLength()), 2, RoundingMode.HALF_UP))
                .toString()).compareTo(creditRatio)));
    }

    public static BiFunction<PreliminaryPairing, PreliminaryPairing, Duration> addCredit() {
        return (first, second) -> Duration.parse(first.getCredit().add(second.getCredit()).toString());
    }

    public static BiFunction<PreliminaryPairing, PreliminaryPairing, Float> addPerDiem() {
        return (first, second) -> first.getPerDiem() + second.getPerDiem();
    }

}
