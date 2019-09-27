lexer grammar Miscaner;
// palabras reservadas
IF : ('if'|'IF'|'If')Alin;
Then:('Then'|'then'|'THEN')Alin;
Else:('Else'|'else'|'ELSE')Alin;
While:('While'|'while'|'WHILE')Alin;
Do:('Do'|'do'|'DO')Alin;
Let:('Ler'|'let'|'LET')Alin;
In:('IN'|'in'|'In')Alin;
End:('End'|'END'|'end')Alin;
Const:('Const'|'CONST'|'const')Alin;
Var:('Var'|'VAR'|'var')Alin;
Begin:('begin'|'BEGIN'|'Begin')Alin;
Estruc:'struct'|'STRUCT'|'Struct';
Function:'FUNCTION'|'Function'|'function';
//simbolos
Identifier : Letter ((Letter|Digit)*|Alin);
Literal: Digit((Digit)*|Alin);
Float:Digit+ (','|'.')Digit+ Alin;

Operator:('+'|'-'|'*'|'/'|'%'| '>='|'<='|'=='|'='|'<'|'>'|'!=')Alin;
Char:'\''('\\'(Letter|Digit|Float)|(Letter|Digit|Float)) '"';
String:'"'Char+'"';
Pyc:';';
Parnt:('(' |')')Alin;
Dpig:':='Alin;
Lin:'~'Alin;
Dp:':'Alin;
Com:'//'Alin;
Comf:'*/'Alin;
Comi:'/*'Alin;
Pc:('['|']')Alin;
Llave:('{'|'{')Alin;
fragment Letter : 'a'..'z' | 'A' ..'Z';
fragment Digit : '0' ..'9';
//complejas
NEXT:[\n];
TEXT                        : (CharContenido|[\n])+;
Lines  : Com  CharContenido+;
Alin:([\n\r\t]|' ')*;
fragment CharContenido
  :'0'..'9'
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

