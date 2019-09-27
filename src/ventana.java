import javax.swing.*;
import java.awt.*;
public class ventana {
        public static void main(String[] args) {
            JFrame ventanai = new JFrame("Mi Ventana");
            ventanai.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            JTextArea jtx = new JTextArea(10,50);
            jtx.setLineWrap(true);
            jtx.setWrapStyleWord(true);
            JScrollPane scroll = new JScrollPane(jtx);
            ventanai.getContentPane().add(scroll, BorderLayout.CENTER);
            ventanai.add(scroll);
            ventanai.pack();//método utilizado para que se muestren los //elementos de la ventanai
            ventanai.setVisible(true);
        }
    }

