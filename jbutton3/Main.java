package jbutton3;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    public static void main(String[] args) {
        
        JFrame jFrame = new JFrame();

        JButton jButton = new JButton("click here");
        jButton.setBounds(50,50,90,30);

        JTextField jTextField = new JTextField("");
        jTextField.setBounds(50,100,150,20);

        ActionListener actionListener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Font font = new Font(Font.SERIF, Font.ITALIC, 15);
                jTextField.setFont(font);
                jTextField.setText("you clicked the button");
            }
        };

        jButton.addActionListener(actionListener);

        jFrame.add(jButton);
        jFrame.add(jTextField);

        jFrame.setSize(800,800);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLayout(null);
        jFrame.setVisible(true);
    }
}