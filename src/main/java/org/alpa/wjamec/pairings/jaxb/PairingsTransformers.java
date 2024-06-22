/*
 * Copyright © 2024, Stephan Heinemann
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package org.alpa.wjamec.pairings.jaxb;

import org.alpa.wjamec.pairings.util.PairingsQueries;

/**
 * Provides transformers for pairings.
 * 
 * @author Stephan Heinemann
 */
public class PairingsTransformers {

    /** the pairings object factory */
    private static final ObjectFactory pairingsFactory = new ObjectFactory();

    /**
     * Hides the default constructor.
     */
    private PairingsTransformers() {
    }

    /**
     * Transforms pairings to their abbreviated form.
     * 
     * @param pairings
     *                     the pairings to be abbreviated
     * @return the abbreviated form the of the pairings
     */
    public static Pairings toAbbreviated(Pairings pairings) {
        Pairings abbreviated = pairingsFactory.createPairings();

        for (PreliminaryPairing preliminary : pairings.getPreliminaryPairing()) {
            abbreviated.getAbbreviatedPairing().add(toAbbreviated(preliminary));
        }

        for (Pairing pairing : pairings.getPairing()) {
            abbreviated.getAbbreviatedPairing().add(toAbbreviated(pairing));
        }

        abbreviated.getAbbreviatedPairing().addAll(pairings.getAbbreviatedPairing());

        return abbreviated;
    }

    /**
     * Transforms a preliminary pairing to its abbreviated form.
     * 
     * @param preliminary
     *                        the preliminary pairing to be abbreviated
     * @return the abbreviated form of the preliminary pairing
     */
    public static AbbreviatedPairing toAbbreviated(PreliminaryPairing preliminary) {
        AbbreviatedPairing abbreviated = pairingsFactory.createAbbreviatedPairing();

        abbreviated.setDays(toAbbreviatedDays(preliminary.getInitialDutyDays()));
        abbreviated.setLength(preliminary.getLength());
        abbreviated.setLegs(toAbbreviatedLegs(preliminary.getDutyDays()));
        abbreviated.setCredit(preliminary.getCredit());
        abbreviated.setCreditRatio(PairingsQueries.getCreditRatioAttribute(preliminary));
        abbreviated.setPerDiem(preliminary.getPerDiem());

        return abbreviated;
    }

    /**
     * Transforms a pairing to its abbreviated form.
     * 
     * @param pairing
     *                    the pairing to be abbreviated
     * @return the abbreviated form of the pairing
     */
    public static AbbreviatedPairing toAbbreviated(Pairing pairing) {
        AbbreviatedPairing abbreviated = toAbbreviated((PreliminaryPairing) pairing);

        abbreviated.setPairing(pairing.getPairing());

        return abbreviated;
    }

    /**
     * Transforms initial duty days to its abbreviated form.
     * 
     * @param initialDutyDays
     *                            the initial duty days to be abbreviated
     * @return the abbreviated form of the initial duty days
     */
    private static String toAbbreviatedDays(InitialDutyDays initialDutyDays) {
        String days = "";

        for (InitialDutyDay initialDutyDay : initialDutyDays.getInitialDutyDay()) {
            days = days.concat(String.format("%d, ", initialDutyDay.getDate().getDay()));
        }

        if (!days.isEmpty()) {
            days = days.substring(0, days.length() - 2);
        }

        return days;
    }

    /**
     * Transforms the legs of duty days to their abbreviated form.
     * 
     * @param dutyDays
     *                     the duty days containing the legs to be abbreviated
     * @return the abbreviated form of the legs contained in the duty days
     */
    private static String toAbbreviatedLegs(DutyDays dutyDays) {
        String legs = "";

        for (DutyDay dutyDay : dutyDays.getDutyDay()) {
            legs = legs.concat(String.format("%s, ", toAbbreviatedLegs(dutyDay)));
        }

        if (!legs.isEmpty()) {
            legs = legs.substring(0, legs.length() - 2);
        }

        return legs;
    }

    /**
     * Transforms the legs of a duty day to their abbreviated form.
     * 
     * @param dutyDay
     *                    the duty day containing the legs to be abbreviated
     * @return the abbreviated form of the legs contained in the duty day
     */
    private static String toAbbreviatedLegs(DutyDay dutyDay) {
        String legs = dutyDay.getLeg().get(0).getOrigin() + "-";

        for (Leg leg : dutyDay.getLeg()) {
            legs = legs.concat(String.format("%s-", leg.getDestination()));
        }

        if (!legs.isEmpty()) {
            legs = legs.substring(0, legs.length() - 1);
        }

        return legs;
    }

}
