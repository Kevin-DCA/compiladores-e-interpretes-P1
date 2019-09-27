parser grammar Miparcer;
options{
 tokenVocab=Miscaner;}
 program : singleCommand;
 command : singleCommand ( Pyc singleCommand)*;
 singleCommand :
 Identifier ( Dpig expression
                      |  expression  )
         | IF expression Then singleCommand (
                         Else  singleCommand )*
         | While expression Do Llave singleCommand Llave
         | Let declaration In Llave singleCommand Llave
         | Begin command End|Comi TEXT Comf |Lines Next;
 declaration  :
         singleDeclaration (Pyc singleDeclaration)*;
 singleDeclaration :
         Const Identifier Lin expression
     	   | Var Identifier Dp typedenoter|
     	   Var Identifier Dp typedenoter Pc Digit
     	   |Struct Llave (Var Identifier Dp typedenoter)* Llave;
 typedenoter :
            Identifier;
 expression :
   		primaryExpression (Operator primaryExpression)* ;
 primaryExpression :
 		Literal | Identifier | Parnt expression Parnt |Char|String;
metodDeclaration: Funtion Identifier Parnt Identifier+ Parnt Llave singleCommand Llave;
metodCall:Indetifier Parnt(expression)*Parnt ;
