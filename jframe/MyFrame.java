import java.awt.Color;
import javax.swing.JFrame;

public class MyFrame extends JFrame{
    
    public MyFrame(){
        this.setVisible(true);
        this.setSize(420,420);
        this.setTitle("jframes title");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        this.setResizable(false);
        this.setBackground(Color.blue);
        this.getContentPane().setBackground(Color.pink);
    }
}
