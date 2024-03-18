grammar Translator;
axioma : (IDENT | CONSTINT | CONSTFLOAT | CONSTLIT)+;

WS : [\n\r\t];
SPACE: ' ';

IDENT : [a-zA-Z$] [a-zA-Z0-9$_]* WS* {System.out.println("<IDENT>");};

DEC_DIGIT: [0-9];
OCT_DIGIT: [0-7];
HEX_DIGIT: [0-9A-Fa-f];

DEC_INT : [+-]? DEC_DIGIT+;
OCT_INT : '0' [+-]? OCT_DIGIT+;
HEX_INT : '0x' [+-]? HEX_DIGIT+;

CONSTINT : (DEC_INT | OCT_INT | HEX_INT) WS* {System.out.println("<CONSTINT>");};

DEC_REAL : DEC_INT '.' DEC_DIGIT+;
OCT_REAL : OCT_INT '.' OCT_DIGIT+;
HEX_REAL : HEX_INT '.' HEX_DIGIT+;

CONSTFLOAT : (DEC_REAL | OCT_REAL | HEX_REAL) WS* {System.out.println("<CONSTFLOAT>");};

CONSTLIT : '\'' (~[\n\r\t] | '\'')+ '\'' {System.out.println("<CONSTLIT>");};

ENDOFLINE: '\r\n' -> skip;