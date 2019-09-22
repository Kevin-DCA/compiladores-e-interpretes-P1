import generated.Miscaner;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;

public class MIparcer1 {
    private Miscaner elscaner;
    private Token currentToken;
    private String[] lista ={
        "IF", "Then", "Else", "While", "Do", "Let", "In", "End", "Const", "Var",
                "Identifier", "Literal", "Operator", "Pyc", "Parnt", "Dpig", "Lin", "Dp",
                "Letter", "Digit", "WS"
    };
    public MIparcer1(Miscaner scaner) {
     elscaner=scaner;
        currentToken=  scaner.nextToken();
    }

    public void accept(int expected){
        if (currentToken.getType()==expected)
            currentToken=elscaner.nextToken();
        else
            System.out.println("Error Sintáctico: Se esperaba"+ elscaner.getTokenNames()[expected-1]+" y en su lugar viene"+ currentToken.getText()+ " en +("+currentToken.getLine() +";"+currentToken.getCharPositionInLine()+").");
    }
    public void parseprogram(){
        parseSingleCommand();
        while(currentToken.getType()==elscaner.Pyc){
            accept(elscaner.Pyc);
            parseSingleCommand();
        }

    }
    public void parseSingleCommand(){
        if(currentToken.getType()==elscaner.Identifier){
            accept(Miscaner.Identifier);

            if(currentToken.getType()==Miscaner.Dpig)
            {accept(Miscaner.Dpig);
            parseexprexion();


            }
            else if(currentToken.getType()==Miscaner.Parnt){
                accept(Miscaner.Parnt);
                parseexprexion();
                accept(Miscaner.Parnt);
            }
        }
         else if(currentToken.getType()==elscaner.IF){
            accept(Miscaner.IF);
            parseexprexion();
            accept(Miscaner.Then);
            parseSingleCommand();
            if(currentToken.getType()==Miscaner.Else){
            accept(Miscaner.Else);
            parseSingleCommand();}
        }
         else if (currentToken.getType()==elscaner.Com){
             accept(elscaner.Com);
             while(currentToken.getType()==elscaner.Line){
             accept(elscaner.Line);}
             if (currentToken.getType()==elscaner.Next) {
                 accept(elscaner.Next);
                 parseSingleCommand();
             } }
        else if (currentToken.getType()==elscaner.Comi){
            accept(elscaner.Comi);
            while(currentToken.getType()==elscaner.TEXT){
                accept(elscaner.TEXT);}
            if (currentToken.getType()==elscaner.Comf) {
                accept(elscaner.Comf);
                parseSingleCommand();
            } }
    }
    public void parseSingledeclaration(){
        if(currentToken.getType()==elscaner.Const)
        {accept(elscaner.Const);
        accept(elscaner.Identifier);
        accept(elscaner.Lin);
        parseexprexion();
        }
        else if(currentToken.getType()==elscaner.Var){
            accept(elscaner.Var);
        accept(elscaner.Identifier);
        accept(elscaner.Dp);
        parsesTypedenoter();
        }

    }
    public void parsesdeclaration(){
        parseSingledeclaration();
        while(currentToken.getType()==elscaner.Pyc){
            accept(elscaner.Pyc);
            parseSingledeclaration();
        }
    }
    public void parsesTypedenoter(){
        accept(elscaner.Identifier);
    }
    public void parseexprexion(){
        parseprimaryExpression();
        while(currentToken.getType()==elscaner.Operator){
            accept(elscaner.Operator);
            parseprimaryExpression();
        }
    }
    public void parseprimaryExpression(){
        if (currentToken.getType()==elscaner.Literal){
            accept(elscaner.Literal);
        }
        else if(currentToken.getType()==elscaner.Identifier){
            accept(elscaner.Identifier);
        }
        else if(currentToken.getType()==elscaner.Parnt){
            accept(elscaner.Parnt);
            parseexprexion();
            accept(elscaner.Parnt);
        }
    }
}
