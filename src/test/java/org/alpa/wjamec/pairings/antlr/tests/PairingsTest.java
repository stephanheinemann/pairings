package org.alpa.wjamec.pairings.antlr.tests;

import java.io.IOException;

import org.alpa.wjamec.pairings.antlr.PairingsLexer;
import org.alpa.wjamec.pairings.antlr.PairingsParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.junit.Test;

public class PairingsTest {

    public static final String PAIRINGS_FINAL_APRIL_2024 = "737 PILOT FINAL PAIRINGS APRIL 2024.txt";
    public static final String PAIRINGS_PRELIMINARY_MAY_2024 = "737 PILOT PRELIM PAIRINGS MAY 2024.txt";
    public static final String PAIRINGS_FINAL_JUNE_2024 = "737 PILOT FINAL PAIRINGS JUNE 2024.txt";

    public static final String SEPARATOR = "_______________________________________________________________________________________________________________________";

    public static final String PAIRING1 = "TRIP #8 E3007 (OL) [1,1,0,0] YEG: 1______ effective APR 29-APR 29 no exceptions.\n"
            + "\n" + " MO TU WE TH FR SA SU DAY FLT# DEP ARR DEP ARR BLK TOG DUTY CREDIT LO A/C CREW COMP\n"
            + " -- -- -- -- -- -- -- ---- ----------- --- --- ----- ----- ----- ----- ----- --------- ----- --- ---------\n"
            + "A-- -- -- -- -- -- -- RPT 06:55 1h00 MO\n"
            + "P-- -- -- -- -- -- -- Mo 1 00413 YEG YYJ 07:55 08:42 1h47 0h48 1h47 _73H [1,1,3,1]\n"
            + "R-- -- -- -- -- -- -- Mo 1 00416 YYJ YEG 09:30 12:08 1h38 1h38 _73H [1,1,3,1]\n"
            + " 29 -- RLS 12:23 3h25 0h15 5h28 4h00(M)\n" + "\n"
            + "____________________________________________________________________________________________________\n"
            + "\n" + "TAFB: 5h28 Credit Time: 4h00(D) PERDIEM: 41.87\n" + "\n"
            + "____________________________________________________________________________________________________";

    public static final String PAIRING2 = "TRIP #143 E901J (OL) [1,1,0,0] YEG: ____5__ effective JUN 14-JUN 14 no exceptions.\n"
            + "\n" + " MO TU WE TH FR SA SU DAY FLT# DEP ARR DEP ARR BLK TOG DUTY CREDIT LO A/C CREW COMP\n"
            + " -- -- ---- ----------- --- --- ----- ----- ----- ----- ----- --------- ----- --- ---------\n"
            + "J-- -- -- -- -- -- -- RPT 07:15 1h00 MO\n"
            + "U-- -- -- -- 14 -- -- Fr 1 00266 YEG YYC 08:15 09:15 1h00 2h15 1h00 _73G [1,1,3,1]\n"
            + "N-- -- -- -- -- -- -- Fr 1 00660 YYC YYZ 11:30 17:25 3h55 1h05* 3h55 _7M8 [1,1,3,1]\n"
            + " -- -- -- -- -- -- -- Fr 1 00252 YYZ YHZ 18:30 21:38 2h08 2h08 _7M8 [1,1,3,1]\n" + "\n"
            + " 21:53 7h03 0h15 11h38 7h03(L)\n"
            + " ---- YHZ-A hotel TBD / ----------------------------- 14h02 (0h15*2) 13h32\n" + " 11:55 1h00 MO\n"
            + " Sa 2 00249 YHZ YYZ 12:55 14:21 2h26 1h39 2h26 _7S8 [1,1,3,1]\n"
            + " Sa 2 00717 YYZ YVR 16:00 18:14 5h14 * 5h14 _73H [1,1,3,1]\n" + " 18:29 7h40 0h15 10h34 7h40(L)\n"
            + " ---- YVR-B hotel TBD / ACE CHARTER YVR -------------- 21h01 (0h50*2) 19h21\n" + " 15:30 1h00\n"
            + " Su 3 00348 YVR YLW 16:30 17:36 1h06 0h49 1h06 _73H [1,1,3,1]\n"
            + " Su 3 00349 YLW YVR 18:25 19:29 1h04 1h46 1h04 _73H [1,1,3,1]\n"
            + " Su 3 00178 YVR YEG 21:15 23:50 1h35 * 1h35 _73H [1,1,3,1]\n" + " RLS 00:05 3h45 0h15 7h35 4h00(M)\n"
            + "\n"
            + "____________________________________________________________________________________________________\n"
            + "\n" + "TAFB: 64h50 Credit Time: 18h43(D) PERDIEM: 496.62\n" + "\n"
            + "____________________________________________________________________________________________________";

    public static final String PAIRING3 = "TRIP #4 E3004 (OL) [1,1,0,0] YEG: 1_34__7 effective JUN 17-JUN 30 except JUN 19 JUN 20\n"
            + "\n" + " MO TU WE TH FR SA SU DAY FLT# DEP ARR DEP ARR BLK TOG DUTY CREDIT LO A/C CREW COMP\n"
            + " -- -- ---- ----------- --- --- ----- ----- ----- ----- ----- --------- ----- --- ---------\n"
            + "J-- -- -- -- -- -- -- RPT 06:55 1h00 MO\n"
            + "U-- -- -- -- -- -- -- 1 00413 YEG YYJ 07:55 08:42 1h47 0h48 1h47 _73G [1,1,3,1]\n"
            + "N17 -- -- -- -- -- 23 1 00416 YYJ YEG 09:30 12:06 1h36 1h36 _73G [1,1,3,1]\n"
            + " 24 -- 26 27 -- -- 30 RLS 12:21 3h23 0h15 5h26 4h00(M)\n" + "\n"
            + "____________________________________________________________________________________________________\n"
            + "\n" + "TAFB: 5h26 Credit Time: 4h00(D) PERDIEM: 41.62\n" + "\n"
            + "____________________________________________________________________________________________________";
    public static final String PAIRING4 = "TRIP #72 E900D (OL) [1,1,0,0] YEG: 1______ effective JUN 24-JUN 24 no exceptions.\n"
            + "\n" + " MO TU WE TH FR SA SU DAY FLT# DEP ARR DEP ARR BLK TOG DUTY CREDIT LO A/C CREW COMP\n"
            + " -- -- ---- ----------- --- --- ----- ----- ----- ----- ----- --------- ----- --- ---------\n"
            + "J-- -- -- -- -- -- -- RPT 16:31 0h45\n"
            + "U-- -- -- -- -- -- -- Mo 1 DH_03140 YEG YYC 17:16 18:13 0h57 3h27 0h28 DH4\n"
            + "N-- -- -- -- -- -- -- Mo 1 00463 YYC YYJ 21:40 22:15 1h35 * 1h35 _7M8 [1,1,3,1]\n"
            + " 24 -- -- -- -- -- -- 22:30 1h35 0h15 6h59 4h00(M)\n"
            + " ---- YYJ-A hotel TBD / LA Limo and Transp Services 250 14h40 (0h20*2) 14h00\n" + " 13:10 1h00\n"
            + " Tu 2 00196 YYJ YYC 14:10 16:38 1h28 0h52 1h28 _73H [1,1,3,1]\n"
            + " Tu 2 00123 YYC YVR 17:30 18:04 1h34 0h56 1h34 _73H [1,1,3,1]\n"
            + " Tu 2 00126 YVR YYC 19:00 21:28 1h28 2h02 1h28 _73H [1,1,3,1]\n"
            + " Tu 2 00237 YYC YEG 23:30 00:26 0h56 0h56 _73H [1,1,3,1]\n" + " RLS 00:41 5h26 0h15 10h31 5h26(L)\n"
            + "\n"
            + "____________________________________________________________________________________________________\n"
            + "\n" + "TAFB: 32h10 Credit Time: 9h26(D) PERDIEM: 246.40\n" + "\n"
            + "____________________________________________________________________________________________________";

    public static final String PAIRINGS5 = "TRIP #348 V9027 (ML) [1,1,0,0] YVR: ____5__ effective JUN 21-JUN 28 no exceptions.\n"
            + "\n" + " MO TU WE TH FR SA SU DAY FLT# DEP ARR DEP ARR BLK TOG DUTY CREDIT LO A/C CREW COMP\n"
            + " -- -- ---- ----------- --- --- ----- ----- ----- ----- ----- --------- ----- --- ---------\n"
            + "J-- -- -- -- -- -- -- RPT 16:45 1h00\n"
            + "U-- -- -- -- -- -- -- Fr 1 01852 YVR OGG 17:45 20:53 6h08 6h08 _7M8 [1,1,3,1]\n" + "\n"
            + "N-- -- -- -- 21 -- -- 21:08 6h08 0h15 7h23 6h08(L)\n"
            + " -- -- -- -- 28 -- -- ---- OGG hotel TBD / VIP Transportation 808-226-2627 -- 24h02 (1h15*2) 21h32\n"
            + " 21:10 1h00 RE\n" + " Sa 2 01853 OGG YVR 22:10 06:49 5h39 5h39 _7M8 [1,1,3,1]\n"
            + " RLS 07:04 5h39 0h15 6h54 5h39(L)\n" + "\n"
            + "____________________________________________________________________________________________________\n"
            + "\n" + "TAFB: 38h19 Credit Time: 11h47(D) PERDIEM: 293.51\n" + "\n"
            + "____________________________________________________________________________________________________";

    public static final String PAIRING5 = "TRIP #804 C303A (ML) [1,1,0,0] YYC: ___4___ effective JUN 27-JUN 27 no exceptions.\n"
            + "\n" + " MO TU WE TH FR SA SU DAY FLT# DEP ARR DEP ARR BLK TOG DUTY CREDIT LO A/C CREW COMP\n"
            + " -- -- ---- ----------- --- --- ----- ----- ----- ----- ----- --------- ----- --- ---------\n"
            + "J-- -- -- -- -- -- -- RPT 09:00 0h45 MO\n"
            + "U-- -- -- -- -- -- -- Th 1 DH_01578 YYC DTW 09:45 15:28 3h43 0h30 1h51 _73G\n"
            + "N-- -- -- -- -- -- -- Th 1 GND DTW YQG 15:58 17:28 1h30 0h45\n"
            + " -- -- -- 27 -- -- -- 17:28 0h00 0h00 6h28 4h00(M)\n"
            + " ---- LO ----------------------------------------------- 36h22 (0h15*2) 35h52\n" + " 05:50 1h00 MO\n"
            + " Sa 3 00779 YQG YYC 06:50 08:54 4h04 4h04 _73H [1,1,3,1]\n" + " RLS 09:09 4h04 0h15 5h19 4h04(L)\n"
            + "\n"
            + "____________________________________________________________________________________________________\n"
            + "\n" + "TAFB: 48h09 Credit Time: 12h02(T) PERDIEM: 368.83\n" + "\n"
            + "____________________________________________________________________________________________________";

    public static final String PAIRINGS6 = "TRIP #1403 T322D (ML) [1,1,0,0] YYZ: ___4___ effective JUN 06-JUN 27 no exceptions.\n"
            + "\n" + " MO TU WE TH FR SA SU DAY FLT# DEP ARR DEP ARR BLK TOG DUTY CREDIT LO A/C CREW COMP\n"
            + " -- -- ---- ----------- --- --- ----- ----- ----- ----- ----- --------- ----- --- ---------\n"
            + "J-- -- -- 06 -- -- -- RPT 07:45 0h45 MO\n"
            + "U-- -- -- 13 -- -- -- Th 1 AC_08874 YYZ EWR 08:30 10:05 1h35 0h47\n"
            + "N-- -- -- 20 -- -- -- 10:05 0h00 0h00 2h20 4h00(M)\n"
            + " -- -- -- 27 -- -- -- ---- EWR- Hotel TBD / Everywhere Cars --------------- 21h40 (1h15*2) 19h10\n"
            + " 07:45 1h00 MO\n" + " Fr 2 09145 EWR BDA 08:45 12:09 2h24 2h36 2h24 _7F8 [1,1,3,1]\n"
            + " Fr 2 UA_02392 BDA EWR 14:45 16:25 2h40 1h35 1h20\n" + " Fr 2 UA_03504 EWR YYZ 18:00 20:00 2h00 1h00\n"
            + " RLS 20:00 2h24 0h00 12h15 6h08(R)\n" + "\n" + "\n"
            + "____________________________________________________________________________________________________\n"
            + "\n" + "TAFB: 36h15 Credit Time: 10h08(D) PERDIEM: 277.67\n" + "\n"
            + "____________________________________________________________________________________________________";

    public static final String PAIRINGS7 = "TRIP #138 E301U (ML) [1,1,0,0] YEG: ___4___ effective APR 11-APR 18 no exceptions.\n"
            + "\n" + " MO TU WE TH FR SA SU DAY FLT# DEP ARR DEP ARR BLK TOG DUTY CREDIT LO A/C CREW COMP\n"
            + " -- -- -- -- -- -- -- ---- ----------- --- --- ----- ----- ----- ----- ----- --------- ----- --- ---------\n"
            + "A-- -- -- 11 -- -- -- RPT 08:10 1h00 MO\n"
            + "P-- -- -- 18 -- -- -- Th 1 02264 YEG HUX 09:10 15:10 6h00 6h00 _73G [1,1,3,1]\n"
            + "R-- -- -- -- -- -- -- 15:25 6h00 0h15 7h15 6h00(L)\n"
            + " -- -- ---- HUX Hotel TBD / Amstar DMC 11-52-1-958-100-4898 -- 21h35 (0h30*2) 20h35\n" + " 13:00 1h00\n"
            + " Fr 2 02515 HUX YYZ 14:00 21:05 5h05 1h25 5h05 _73G [1,1,3,1]\n"
            + " Fr 2 GND00230 YYZ YHM 22:30 23:50 1h20 0h40\n" + " 23:50 5h05 0h00 8h50 5h45(L)\n"
            + " ---- YHM-A hotel TBD / Aircrew Express ------------- 15h35 (0h25*2) 14h45\n" + " 15:25 1h00\n"
            + " Sa 3 02442 YHM CUN 16:25 19:40 4h15 0h55 4h15 _7S8 [1,1,3,1]\n"
            + " Sa 3 02443 CUN YHM 20:35 01:24 3h49 3h49 _7S8 [1,1,3,1]\n" + " 01:39 8h04 0h15 10h14 8h04(L)\n"
            + " ---- YHM-A hotel TBD / Aircrew Express ------------- 12h56 (0h25*2) 12h06\n" + " 14:35 1h00\n"
            + " Su 4 02194 YHM PUJ 15:35 20:10 4h35 0h55 4h35 _7S8 [1,1,3,1]\n"
            + " Su 4 02777 PUJ YYZ 21:05 01:45 4h40 4h40 _7S8 [1,1,3,1]\n" + " 02:00 9h15 0h15 11h25 9h15(L)\n"
            + " ---- YYZ-A hotel TBD / Hotel Shuttle ----------------- 16h00 (0h25*2) 15h10\n" + " 18:00 1h00\n"
            + " Mo 5 00437 YYZ YEG 19:00 21:15 4h15 4h15 _7S8 [1,1,3,1]\n" + " RLS 21:30 4h15 0h15 5h30 4h15(L)\n"
            + "\n" + "\n"
            + "____________________________________________________________________________________________________\n"
            + "\n" + "TAFB: 109h20 Credit Time: 33h19(D) PERDIEM: 837.49\n" + "\n"
            + "____________________________________________________________________________________________________";

    @Test
    public void test() {
        String pairings = "";
        try {
            pairings = new String(
                    getClass().getClassLoader().getResourceAsStream(PAIRINGS_FINAL_JUNE_2024).readAllBytes());
            pairings = pairings.substring(pairings.indexOf(SEPARATOR) + SEPARATOR.length());
        } catch (IOException e) {
            e.printStackTrace();
        }
        // System.out.println(pairings);

        PairingsLexer lexer = new PairingsLexer(CharStreams.fromString(pairings));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        tokens.fill();

        for (Token token : tokens.getTokens()) {
            System.out.println(token.toString());
        }

        PairingsParser parser = new PairingsParser(tokens);
        parser.setBuildParseTree(true);
        System.out.println(parser.pairings().toStringTree());

    }

}
