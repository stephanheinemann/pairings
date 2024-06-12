package org.alpa.wjamec.pairings.jaxb;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Provides mappings for data associated with pairings.
 * 
 * @see Pairings
 * @see PreliminaryPairing
 * @see Pairing
 * 
 * @author Stephan Heinemann
 */
public final class Mappings {

    /**
     * Hides default constructor.
     */
    private Mappings() {
    }

    /** maps IATA airport bases to city base names */
    public static final Map<String, String> bases = Map.of("YEG", "Edmonton", "YVR", "Vancouver", "YWG", "Winnipeg",
            "YYC", "Calgary", "YYZ", "Toronto");

    /** maps city base names to IATA airport bases */
    public static final Map<String, String> iataBases = Map.of("Edmonton", "YEG", "Vancouver", "YVR", "Winnipeg", "YWG",
            "Calgary", "YYC", "Toronto", "YYZ");

    /** maps pairing annotation codes to pairing annotations */
    public static final Map<String, String> pairingAnnotations = Map.of("OT", "OptimizedTrip", "OL", "OptimizedLock",
            "MT", "ManualTrip", "ML", "ManualLock");

    /** maps credit annotation codes to credit annotations */
    public static final Map<String, String> creditAnnotations = Map.of("M", "MinimumValue", "L", "LegValue", "D",
            "DutyValue", "T", "TripValue", "R", "RatioValue");

    /** maps duty annotation codes to duty annotations */
    public static final Map<String, String> dutyAnnotations = Map.of("MO", "MorningDuty", "RE", "RedEyeDuty");

    /** maps IATA aircraft types to aircraft type names */
    public static final Map<String, String> aircraft = Map.of("_73W", "Boeing 737-700 Winglets", "_73H",
            "Boeing 737-800 Winglets", "_73G", "Boeing 737-700", "_7M8", "Boeing 737 MAX8", "_7S8", "Boeing 737-800",
            "_7F8", "Boeing 737-800 Freighter", "_789", "Boeing 787-9", "DH4", "Bombardier Q400");

    /** maps IATA airline codes to airline names */
    public static final Map<String, String> airlines = Map.of("AA", "American Airlines", "AC", "Air Canada", "AM",
            "Aeromexico", "DL", "Delta Airlines", "EI", "Aer Lingus", "FI", "Icelandair", "HA", "Hawaiian Airlines",
            "UA", "United Airlines", "WS", "WestJet Airlines");

    /** maps ground vehicle codes to vehicle descriptions */
    public static final Map<String, String> vehicles = Map.of("GND", "Ground Transportation", "LIM", "Limousine");

    /** maps days of the week to weekday names */
    public static final Map<Integer, String> weekdays = Map.of(1, "Monday", 2, "Tuesday", 3, "Wednesday", 4, "Thursday",
            5, "Friday", 6, "Saturday", 7, "Sunday");

    /** maps short month names to month values */
    public static final Map<String, Integer> months;
    static {
        Map<String, Integer> m = new HashMap<>();
        m.put("JAN", 1);
        m.put("FEB", 2);
        m.put("MAR", 3);
        m.put("APR", 4);
        m.put("MAY", 5);
        m.put("JUN", 6);
        m.put("JUL", 7);
        m.put("AUG", 8);
        m.put("SEP", 9);
        m.put("OCT", 10);
        m.put("NOV", 11);
        m.put("DEC", 12);
        months = Collections.unmodifiableMap(m);
    }

    /** maps IATA airports to IANA time zones (currently no public IATA time zone artifact available) */
    public static final Map<String, String> timeZones;
    static {
        Map<String, String> tz = new HashMap<>();
        tz.put("ANU", "America/Antigua");
        tz.put("ATL", "America/New_York");
        tz.put("AUA", "America/Aruba");
        tz.put("AUS", "America/Chicago");
        tz.put("AZA", "America/Phoenix");
        tz.put("AZS", "America/Santo_Domingo");
        tz.put("BDA", "Atlantic/Bermuda");
        tz.put("BFS", "Europe/Dublin");
        tz.put("BGI", "America/Barbados");
        tz.put("BNA", "America/Chicago");
        tz.put("BOS", "America/New_York");
        tz.put("BZE", "America/Belize");
        tz.put("CCC", "America/Havana");
        tz.put("CUN", "America/Cancun");
        tz.put("CUR", "America/Curacao");
        tz.put("CZM", "America/Cancun");
        tz.put("DEN", "America/Denver");
        tz.put("DTW", "America/New_York");
        tz.put("DUB", "Europe/Dublin");
        tz.put("EDI", "Europe/London");
        tz.put("EWR", "America/New_York");
        tz.put("FLL", "America/New_York");
        tz.put("GCM", "America/Cayman");
        tz.put("GDL", "America/Mexico_City");
        tz.put("HAV", "America/Havana");
        tz.put("HNL", "Pacific/Honolulu");
        tz.put("HOG", "America/Havana");
        tz.put("HUX", "America/Mexico_City");
        tz.put("IAD", "America/New_York");
        tz.put("IAH", "America/Chicago");
        tz.put("JFK", "America/New_York");
        tz.put("KEF", "Atlantic/Reykjavik");
        tz.put("KIN", "America/Jamaica");
        tz.put("KOA", "Pacific/Honolulu");
        tz.put("LAS", "America/Los_Angeles");
        tz.put("LAX", "America/Los_Angeles");
        tz.put("LGA", "America/New_York");
        tz.put("LGW", "Europe/London");
        tz.put("LIH", "Pacific/Honolulu");
        tz.put("LIR", "America/Costa_Rica");
        tz.put("LTO", "America/Mazatlan");
        tz.put("MBJ", "America/Jamaica");
        tz.put("MCO", "America/New_York");
        tz.put("MIA", "America/New_York");
        tz.put("MID", "America/Mexico_City");
        tz.put("MSP", "America/Chicago");
        tz.put("MZT", "America/Mazatlan");
        tz.put("NAS", "America/Nassau");
        tz.put("OGG", "Pacific/Honolulu");
        tz.put("ORD", "America/Chicago");
        tz.put("PDX", "America/Los_Angeles");
        tz.put("PHX", "America/Phoenix");
        tz.put("PLS", "America/Grand_Turk");
        tz.put("POP", "America/Dominica");
        tz.put("PSP", "America/Los_Angeles");
        tz.put("PUJ", "America/Dominica");
        tz.put("PVR", "America/Mexico_City");
        tz.put("RSW", "America/New_York");
        tz.put("RTB", "America/Tegucigalpa");
        tz.put("SAN", "America/Los_Angeles");
        tz.put("SEA", "America/Los_Angeles");
        tz.put("SFO", "America/Los_Angeles");
        tz.put("SJD", "America/Mazatlan");
        tz.put("SJU", "America/Puerto_Rico");
        tz.put("SNA", "America/Los_Angeles");
        tz.put("SXM", "America/Guadeloupe");
        tz.put("TPA", "America/New_York");
        tz.put("UVF", "America/St_Lucia");
        tz.put("VRA", "America/Havana");
        tz.put("YCD", "America/Vancouver");
        tz.put("YDF", "America/St_Johns");
        tz.put("YEG", "America/Edmonton");
        tz.put("YFC", "America/Halifax");
        tz.put("YFI", "America/Edmonton");
        tz.put("YHM", "America/Montreal");
        tz.put("YHU", "America/Montreal");
        tz.put("YHZ", "America/Halifax");
        tz.put("YKF", "America/Montreal");
        tz.put("YLW", "America/Vancouver");
        tz.put("YMM", "America/Edmonton");
        tz.put("YOW", "America/Montreal");
        tz.put("YQB", "America/Montreal");
        tz.put("YQG", "America/Montreal");
        tz.put("YQM", "America/Halifax");
        tz.put("YQQ", "America/Vancouver");
        tz.put("YQR", "America/Regina");
        tz.put("YQT", "America/Montreal");
        tz.put("YQU", "America/Edmonton");
        tz.put("YUL", "America/Montreal");
        tz.put("YVR", "America/Vancouver");
        tz.put("YWG", "America/Winnipeg");
        tz.put("YXE", "America/Regina");
        tz.put("YXS", "America/Vancouver");
        tz.put("YXU", "America/Montreal");
        tz.put("YXX", "America/Vancouver");
        tz.put("YXY", "America/Whitehorse");
        tz.put("YYC", "America/Edmonton");
        tz.put("YYG", "America/Halifax");
        tz.put("YYJ", "America/Vancouver");
        tz.put("YYT", "America/Moncton");
        tz.put("YYZ", "America/Toronto");
        tz.put("YZF", "America/Yellowknife");
        tz.put("ZIH", "America/Mexico_City");
        tz.put("ZLO", "America/Mexico_City");
        timeZones = Collections.unmodifiableMap(tz);
    }
}
