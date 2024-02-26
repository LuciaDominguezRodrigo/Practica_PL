grammar Translator;
axioma : (REAL | NATURAL)+;
REAL : [0-9]+'.'[0-9]+ {System.out.println("<Real>");};
NATURAL : [0-9]+ {System.out.println("<Natural>");};
IGNORE  : [\n\r\t] -> skip;