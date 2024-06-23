/**
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
grammar Pairings;

pairingsDocument : titlePage pairings;
titlePage : title TITLE_SEPARATOR;
title : .*? (month | longMonth) year .*?;
longMonth: LONG_MONTH;
year: NAT;

pairings : pairing*;
pairing : header contents footer;

header : headline tableHeader;

headline : preliminaryHeadline | finalHeadline;
tableHeader : TABLE_HEADER;

preliminaryHeadline : base commonHeadline;
finalHeadline : tripNumber pairingId commonHeadline;
commonHeadline : pairingAnnotation crew baseIata daysOfWeek effectiveness;

base : BASE;
baseIata : BASE_IATA COLON;

tripNumber : TRIP NAT;
pairingId : PAIRING_ID;
pairingAnnotation : PAIRING_ANNOTATION;

crew : OBRK captains COMMA firstOfficers COMMA flightAttendants COMMA extraFlightAttendants CBRK;
captains : NAT;
firstOfficers : NAT;
flightAttendants : NAT;
extraFlightAttendants : NAT;

daysOfWeek : DAYS_OF_WEEK;

effectiveness : EFFECTIVE period exceptions;
period : month dayToMonth dayOfMonth;
month : MONTH;
dayOfMonth : NAT;
daysOfMonth : (month dayOfMonth)+;
dayToMonth : dayOfMonth DASH month;
exceptions : withExceptions | withoutExceptions;
withExceptions : EXCEPTIONS daysOfMonth;
withoutExceptions : NO_EXCEPTIONS;

contents : content*;
content : calendarWeek? (contentSeparator | checkin | checkout | leg);

calendarWeek : calendarMonthLetter? calendarDaysOfMonth;
calendarMonthLetter : CAPITAL_LETTER;
calendarDaysOfMonth : calendarDayOfMonth+; // {1,7}
calendarDayOfMonth : TWO_DASHES | dayOfMonth;

contentSeparator : FOUR_DASHES (start | layover);
start : START;

checkin : report? out tog checkinDuty?;
report : REPORT;
checkinDuty : CHECKIN_DUTY;

checkout : release? in block tog checkoutDuty credit;
release : RELEASE;
checkoutDuty : duration;

leg : flightLeg | groundLeg;
flightLeg : dutyDay flight origin destination out in block tog? credit aircraft? crew?;
groundLeg : dutyDay ground origin destination out in block credit;

layover : accommodation SLASH? transportation (DASH | TWO_DASHES | FOUR_DASHES | DASHES)? layoverDurations;
accommodation : ((BASE_IATA | AIRPORT_IATA) DASH? CAPITAL_LETTER? DASH? HOTEL)? (TBD | CAPITAL_LETTER | WORD | NAT)* phone?;
transportation : (BASE_IATA | AIRPORT_IATA | HOTEL | CAPITAL_LETTER | WORD | NAT)* phone?;
layoverDurations : layoverDuration (OPAR transportationDuration CPAR)? accommodationDuration?;
phone : OPAR? NAT CPAR? (NAT | DASH)*;

flight : (deadhead | airline)? NAT;
ground : GROUND NAT?;
deadhead : DEADHEAD;
airline : AIRLINE;
aircraft : AIRCRAFT;

origin : BASE_IATA | AIRPORT_IATA; // IATA 3 letter code
destination : BASE_IATA | AIRPORT_IATA; // IATA 3 letter code

out : time;
in : time;
block : duration;
tog : duration | duration ASTERISK | ASTERISK; // time on ground with or without tail swap
credit : duration creditAnnotation?;
creditAnnotation : CREDIT_ANNOTATION;
layoverDuration : duration;
transportationDuration : duration TWICE;
accommodationDuration : duration;

hours : NATREAL;
time : TIME;

duration : DURATION;
dutyDay : weekday? dayOfDuty;
weekday : WEEKDAY;
dayOfDuty : NAT; // positive digit between 1 and 5 (semantics)

footer : footerSeparator summary footerSeparator;
footerSeparator : UNDERLINE;
summary : tafbSummary creditSummary perdiemSummary;
tafbSummary : TAFB COLON duration;
creditSummary : CREDIT COLON credit;
perdiemSummary : PERDIEM COLON hours;

fragment SPACE : ' ';
fragment TAB : '\t';
fragment RETURN : '\r';
fragment NEWLINE : '\n';
fragment HOUR : 'h';
fragment DIGIT : [0-9];
fragment BASE_INITIAL : 'E' | 'V' | 'W' | 'C' | 'T';
fragment PAIRING_LITERAL : 'OT' | 'OL' | 'MT' | 'ML';
fragment CREDIT_LITERAL : 'M' | 'L' | 'R' | 'D' | 'T';
fragment UNDERSCORE : '_';

OPAR : '(';
CPAR : ')';
OBRK : '[';
CBRK : ']';
ODQT : '“' | '"';
CDQT : '”' | '"';
SLASH : '/';
DASH : '-';
TWO_DASHES : '--';
FOUR_DASHES : '----';
DASHES : DASH+;
TITLE_SEPARATOR : '_______________________________________________________________________________________________________________________';
UNDERLINE : '____________________________________________________________________________________________________';
DOT : '.';
COMMA : ',';
COLON : ':';
ADD : '+';
ASTERISK : '*';
TWICE : '*2';
DOLLAR : '$';

CAPITAL_LETTER : [A-Z];
LETTER : [a-zA-Z];

DAYS_OF_WEEK :
	(UNDERSCORE | '1')
	(UNDERSCORE | '2')
	(UNDERSCORE | '3')
	(UNDERSCORE | '4')
	(UNDERSCORE | '5')
	(UNDERSCORE | '6')
	(UNDERSCORE | '7');
WEEKDAY : 'Mo' | 'Tu' | 'We' | 'Th' | 'Fr' | 'Sa' | 'Su';
MONTH : 'JAN' | 'FEB' | 'MAR' | 'APR' | 'MAY' | 'JUN' | 'JUL' | 'AUG' | 'SEP' | 'OCT' | 'NOV' | 'DEC';
LONG_MONTH : 'JANUARY' | 'FEBRUARY' | 'MARCH' | 'APRIL' | 'MAY' | 'JUNE' | 'JULY' | 'AUGUST' | 'SEPTEMBER' | 'OCTOBER' | 'NOVEMBER' | 'DECEMBER';

NAT : DIGIT+;
NATREAL : NAT DOT NAT;
HOURS : DIGIT DIGIT;
MINUTES : DIGIT DIGIT;
TIME : HOURS COLON MINUTES;
DURATION : NAT HOUR MINUTES;

REPORT : 'RPT';
RELEASE : 'RLS';
TBD : 'TBD';
GROUND : 'GND'| 'LIM';

BASE : 'EDMONTON' | 'VANCOUVER' | 'WINNIPEG' | 'CALGARY' | 'TORONTO';
BASE_IATA : 'YEG' | 'YVR' | 'YWG' | 'YYC' | 'YYZ';
AIRPORT_IATA : 'ANU' | 'ATL' | 'AUA' | 'AUS' | 'AZA' | 'AZS' | 'BDA' | 'BFS' | 'BGI' | 'BNA' | 'BON' | 'BOS' | 'BZE' | 'CCC' | 'CUN' | 'CUR' | 'CZM' | 'DEN' | 'DTW' | 'DUB' | 'EDI' | 'EWR' | 'FLL' | 'GCM' | 'GDL' | 'HAV' | 'HNL' | 'HOG' | 'HUX' | 'IAD' | 'IAH' | 'JFK' | 'KEF' | 'KIN' | 'KOA' | 'LAS' | 'LAX' | 'LGA' | 'LGW' | 'LHR' |  'LIH' | 'LIR' | 'LTO' | 'MBJ' | 'MCO' | 'MEX' | 'MIA' | 'MID' | 'MSP' | 'MZT' | 'NAS' | 'OGG' | 'ORD' | 'PDX' | 'PHX' | 'PLS' | 'POP' | 'PSP' | 'PUJ' | 'PVR' | 'RSW' | 'RTB' | 'SAN' | 'SEA' | 'SFO' | 'SJD' | 'SJU' | 'SNA' | 'SNU' | 'SXM' | 'TPA' | 'UVF' | 'VRA' | 'YCD' | 'YDF' | 'YEG' | 'YFC' | 'YFI' | 'YHM' | 'YHU' | 'YHZ' | 'YKA' | 'YKF' | 'YLW' | 'YMM' | 'YOW' | 'YQB' | 'YQG' | 'YQM' | 'YQQ' | 'YQR' | 'YQT' | 'YQU' | 'YUL' | 'YVR' | 'YWG' | 'YXE' | 'YXS' | 'YXU' | 'YXX' | 'YXY' | 'YYC' | 'YYG' | 'YYJ' | 'YYT' | 'YYZ' | 'YZF' | 'ZIH' | 'ZLO';
// a missing airport triggers an error at the parser level, the generic IATA code at the lexer level may help to identify missing airports at the visitor / mapping level
// AIRPORT_IATA : CAPITAL_LETTER CAPITAL_LETTER CAPITAL_LETTER;


PAIRING_ID : BASE_INITIAL DIGIT DIGIT (DIGIT | CAPITAL_LETTER) (DIGIT | CAPITAL_LETTER);
PAIRING_ANNOTATION : OPAR PAIRING_LITERAL CPAR;
CREDIT_ANNOTATION : OPAR CREDIT_LITERAL CPAR;

TRIP : 'TRIP #';
TABLE_HEADER : 'MO TU WE TH FR SA SU DAY FLT# DEP ARR DEP ARR BLK TOG DUTY CREDIT LO A/C CREW COMP';
START : '----------- --- --- ----- ----- ----- ----- ----- --------- ----- --- ---------';

EFFECTIVE : 'effective';
EXCEPTIONS : 'except';
NO_EXCEPTIONS : 'no exceptions.';

CHECKIN_DUTY : 'MO' | 'RE';

DEADHEAD : 'DH' UNDERSCORE;
AIRLINE :  AIRLINE_IATA UNDERSCORE;
AIRLINE_IATA : 'AA' | 'AC' | 'DL' | 'UA' | 'HA' | 'FI' | 'AM' | 'EI';
AIRCRAFT : ('_73W' | '_73H' | '_73G' | '_7M8' | '_7S8' | '_7F8' | '_789' | 'DH4');

HOTEL : 'hotel' | 'Hotel' | 'HOTEL';
TAFB : 'TAFB';
CREDIT : 'Credit Time';
PERDIEM : 'PERDIEM';

WORD : LETTER+;

WS : (SPACE | TAB | RETURN | NEWLINE)+ -> skip;
