import javax.swing.*;
import java.awt.*;

public class Splash extends JWindow{
    public Splash(){
        JLabel Label = new JLabel(new ImageIcon("Splash.jpeg"));
        getContentPane().add(Label, BorderLayout.CENTER);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);

        try {
            Thread.sleep(3000);// show Splash 3 for seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        dispose(); //close splash form
        }
    public static void main(String[] args){
        new Splash();
        new LoginForm();
          }
    }