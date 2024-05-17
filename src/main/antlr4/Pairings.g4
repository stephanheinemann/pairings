grammar Pairings;

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

daysOfWeek : DAYS_OF_WEEK; //dayOne dayTwo dayThree dayFour dayFive daySix daySeven;
//dayOne :   UNDERSCORE | NAT; // '1';
//dayTwo :   UNDERSCORE | NAT; // '2';
//dayThree : UNDERSCORE | NAT; // '3';
//dayFour :  UNDERSCORE | NAT; // '4';
//dayFive :  UNDERSCORE | NAT; // '5';
//daySix :   UNDERSCORE | NAT; // '6';
//daySeven : UNDERSCORE | NAT; // '7';

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
accommodation : ((BASE_IATA | IATA) (DASH CAPITAL_LETTER?)? HOTEL)? (TBD | CAPITAL_LETTER | WORD | NAT)* phone?;
transportation : (BASE_IATA | IATA | HOTEL | CAPITAL_LETTER | WORD | NAT)* phone?;
layoverDurations : layoverDuration OPAR transportationDuration CPAR restDuration;
phone : OPAR? NAT CPAR? (NAT | DASH)*;

flight : (deadhead | airline)? NAT;
ground : GROUND NAT?;
deadhead : DEADHEAD;
airline : AIRLINE;
aircraft : AIRCRAFT;

origin : BASE_IATA | IATA; // IATA 3 letter code
destination : BASE_IATA | IATA; // IATA 3 letter code

out : time;
in : time;
block : duration;
tog : duration | duration ASTERISK | ASTERISK; // time on ground with or without tail swap
credit : duration creditAnnotation?;
creditAnnotation : CREDIT_ANNOTATION;
layoverDuration : duration;
transportationDuration : duration TWICE;
restDuration : duration;

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
fragment DOT : '.';
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
SLASH : '/';
DASH : '-';
TWO_DASHES : '--';
FOUR_DASHES : '----';
DASHES : DASH+;
UNDERLINE : '____________________________________________________________________________________________________';
COMMA : ',';
COLON : ':';
ASTERISK : '*';
TWICE : '*2';

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
//DAY_OF_WEEK : DIGIT | UNDERSCORE;
WEEKDAY : 'Mo' | 'Tu' | 'We' | 'Th' | 'Fr' | 'Sa' | 'Su';
//DAY_OF_MONTH : NAT; // DIGIT DIGIT;
MONTH : 'JAN' | 'FEB' | 'MAR' | 'APR' | 'MAY' | 'JUN' | 'JUL' | 'AUG' | 'SEP' | 'OCT' | 'NOV' | 'DEC';

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
IATA : CAPITAL_LETTER CAPITAL_LETTER CAPITAL_LETTER;

PAIRING_ID : BASE_INITIAL DIGIT DIGIT (DIGIT | CAPITAL_LETTER) (DIGIT | CAPITAL_LETTER);
PAIRING_ANNOTATION : OPAR PAIRING_LITERAL CPAR;
CREDIT_ANNOTATION : OPAR + CREDIT_LITERAL + CPAR;

TRIP : 'TRIP #';
TABLE_HEADER : 'MO TU WE TH FR SA SU DAY FLT# DEP ARR DEP ARR BLK TOG DUTY CREDIT LO A/C CREW COMP';
START : '----------- --- --- ----- ----- ----- ----- ----- --------- ----- --- ---------';

EFFECTIVE : 'effective';
EXCEPTIONS : 'except';
NO_EXCEPTIONS : 'no exceptions.';

CHECKIN_DUTY : 'MO' | 'RE';

DEADHEAD : 'DH' UNDERSCORE;
AIRLINE : ('AA' | 'AC' | 'DL' | 'UA' | 'HA' | 'FI' | 'AM' | 'EI') UNDERSCORE;
AIRCRAFT : ('_73W' | '_73H' | '_73G' | '_7M8' | '_7S8' | '_7F8' | '_789' | 'DH4');

HOTEL : 'hotel' | 'Hotel' | 'HOTEL';
TAFB : 'TAFB';
CREDIT : 'Credit Time';
PERDIEM : 'PERDIEM';

WORD : LETTER+;

WS : (SPACE | TAB | RETURN | NEWLINE)+ -> skip;
