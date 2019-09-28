
import generated.Miscaner;
import generated.Miparcer;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

import javax.swing.*;
import java.util.List;

public class Main {
    public void compile(){


        Miscaner scanner = null;
        Miparcer parser = null;
        CharStream input=null;
        CommonTokenStream tokens = null;
        try {
            input = CharStreams.fromFileName("test.txt");
            scanner = new Miscaner(input);
            tokens = new CommonTokenStream(scanner);
            parser = new Miparcer(tokens);

            try {
               // AST arbol = null;
               // arbol = parser.parseprogram();
               // java.util.concurrent.Future<JFrame> TreeGUI =org.antlr.v4.gui.Trees.inspect(arbol,parser);
                parser.program();
                System.out.println("Compilación Terminada!!!");

            }
            catch(RecognitionException e) {
                System.out.println("Error de parser!!!");
                e.printStackTrace();

            }
        }
        catch(Exception e){System.out.println("No hay archivo");e.printStackTrace();}

       // List<Token> lista = (List<Token>) scanner.getAllTokens();

       // for (Token t : lista)

          //  System.out.println(scanner.getTokenNames()[t.getType()] + ":" + t.getText() + " Line:"+ t.getLine() +"\n");
        //scanner = new Scanner(input);
        //scanner.reset();
    }
}
