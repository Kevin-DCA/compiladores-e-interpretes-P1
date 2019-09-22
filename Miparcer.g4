parser grammar Miparcer;
options{
 tokenVocab=Miscaner;}
 program : singleCommand;
 command : singleCommand ( Pyc singleCommand)*;
 singleCommand :
 Identifier ( Dpig expression
                      | Parnt expression Parnt )
         | IF expression Then singleCommand
                         Else singleCommand
         | While expression Do singleCommand
         | Eet declaration In singleCommand
         | Begin command End;
 declaration  :
         singleDeclaration (Pyc singleDeclaration)*;
 singleDeclaration :
         Const Identifier Lin expression
     	   | Var Identifier Dp typedenoter;
 typedenoter :
            Identifier;
 expression :
   		primaryExpression (Operator primaryExpression)*;
 primaryExpression :
 		Literal | Identifier | Parnt expression Parnt;

