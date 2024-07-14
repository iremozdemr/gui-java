import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutBasics2 {
    public static void main(String[] args) {
        
        JFrame jFrame = new JFrame();
        jFrame.setVisible(true);
        jFrame.setSize(500,500);
        jFrame.setLayout(new FlowLayout(FlowLayout.CENTER));
        //jFrame.setLayout(new FlowLayout(FlowLayout.LEADING));
        //jFrame.setLayout(new FlowLayout(FlowLayout.TRAILING));
        //jFrame.setLayout(new FlowLayout(FlowLayout.RIGHT));
        //jFrame.setLayout(new FlowLayout(FlowLayout.LEFT));

        JButton jButton1 = new JButton("button1");
        JButton jButton2 = new JButton("button2");
        JButton jButton3 = new JButton("button3");
        JButton jButton4 = new JButton("button4");
        JButton jButton5 = new JButton("button5");
        JButton jButton6 = new JButton("button6");

        jFrame.add(jButton1);
        jFrame.add(jButton2);
        jFrame.add(jButton3);
        jFrame.add(jButton4);
        jFrame.add(jButton5);
        jFrame.add(jButton6);
    }
}
