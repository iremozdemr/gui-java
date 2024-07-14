package jbutton2;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        
        JFrame jFrame = new JFrame();

        ImageIcon icon = new ImageIcon("pngegg.png");
        
        JButton jButton1 = new JButton();
        //it creates a button with no text and icon
        JButton jButton2 = new JButton("click here");
        //it creates a button with text
        JButton jButton3 = new JButton(icon);
        //it creates a button with icon object

        jButton1.setBounds(10,20,50,50);
        jButton2.setBounds(100,200,60,60);
        jButton3.setBounds(200,200,150,50);

        jFrame.add(jButton1);
        jFrame.add(jButton2);
        jFrame.add(jButton3);

        jFrame.setSize(500,500);
        jFrame.setLayout(null);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
    }
}