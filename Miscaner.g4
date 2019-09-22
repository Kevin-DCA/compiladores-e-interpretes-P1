lexer grammar Miscaner;
// palabras reservadas
IF : 'if'|'IF'|'If';
Then:'Then'|'then'|'THEN';
Else:'Else'|'else'|'ELSE';
While:'While'|'while'|'WHILE';
Do:'Do'|'do'|'DO';
Let:'Ler'|'let'|'LET';
In:'IN'|'in'|'In';
End:'End'|'END'|'end';
Const:'Const'|'CONST'|'const';
Var:'Var'|'VAR'|'var';
//simbolos
Identifier : Letter (Letter|Digit)*;
Literal: Digit+;
Float:Digit+ (','|'.')Digit+;
Operator:'+'|'-'|'*'|'/'|'%'| '>='|'<='|'=='|'='|'<'|'>'|'!=';
Pyc:';';
Parnt:'('|')';
Dpig:':=';
Lin:'~';
Dp:':';
Com:'//';
Comi:'*/';
Comf:'/*';
Pc:'['|']';
fragment Letter : 'a'..'z' | 'A' ..'Z';
fragment Digit : '0' ..'9';
//complejas
TEXT                        : CharContenido+;
fragment CharContenido
   : '0'..'9'
   | 'A'..'Z' | 'a'..'z'
   | '_'
   | '\u00C0'..'\u00D6'
   | '\u00D8'..'\u00F6'
   | '\u00F8'..'\u02FF'
   | '\u0300'..'\u036F'
   | '\u0370'..'\u037D'
   | '\u037F'..'\u1FFF'
   | '\u200C'..'\u200D'
   | '\u203F'..'\u2040'
   | '\u2070'..'\u218F'
   | '\u2C00'..'\u2FEF'
   | '\u3001'..'\uD7FF'
   | '\uF900'..'\uFDCF'
   | '\uFDF0'..'\uFFFD'
   | [ \t\n\r]+
   ;
Line: '0'..'9'
       | 'A'..'Z' | 'a'..'z'
       | '_'
       | '\u00C0'..'\u00D6'
       | '\u00D8'..'\u00F6'
       | '\u00F8'..'\u02FF'
       | '\u0300'..'\u036F'
       | '\u0370'..'\u037D'
       | '\u037F'..'\u1FFF'
       | '\u200C'..'\u200D'
       | '\u203F'..'\u2040'
       | '\u2070'..'\u218F'
       | '\u2C00'..'\u2FEF'
       | '\u3001'..'\uD7FF'
       | '\uF900'..'\uFDCF'
       | '\uFDF0'..'\uFFFD'
       | [ \t\r]+
       ;
WS : [ \t\n\r] + -> skip;
Next:[\n];
