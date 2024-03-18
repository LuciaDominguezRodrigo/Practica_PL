grammar Translator;

program : DEFINES PARTES;
DEFINES : ('#define' IDENT CTES DEFINES)?;
CTES : CONSTINT | CONSTFLOAT | CONSTLIT;
PARTES : PART PARTES | PART;
PART : TYPE RESTPART;
RESTPART : IDENT '(' LISTPARAM ')' BLQ | IDENT '(' 'void' ')' BLQ;
BLQ : '{" sentlist "}';
LISTPARAM : TYPE IDENT LISTPARAM2;
LISTPARAM2 : (',' TYPE IDENT LISTPARAM2)?;
TYPE : 'void' | 'int' | 'float';
SENTLIST : SENT SENTLIST2;
SENTLIST2 : (SENT SENTLIST2)?;
SENT : TYPE LID ';' | IDENT '=' EXP ';' | IDENT '(' LEXP ')' ';' | IDENT '(' ')' ';' | 'return' EXP ';';
LID : IDENT LID2;
LID2 : (',' IDENT LID2)?;
LEXP : EXP LEXP2;
LEXP2 : (',' EXP LEXP2)?;
EXP : FACTOR EXP2;
EXP2 : (OP FACTOR EXP2)?;
OP : '+' | '-' | '*' | '/' | '%';
FACTOR : IDENT '(' LEXP ')' | IDENT '(' ')' | '(' EXP ')' | IDENT | CTES;

WS : [\n\r\t] -> skip;
SPACE : ' ';

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

CONSTLIT : '\'' ( ~['] | ('\\' [']))* '\'' WS* {System.out.println("<CONSTLIT>");};

// Comentarios de una línea
COMMENT_LINE : '//' ~[\r\n]* WS*;

// Comentarios multilínea
COMMENT_MULTILINE : '/*' .*? '*/' WS*;
