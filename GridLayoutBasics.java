import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutBasics {
    public static void main(String[] args) {

        JFrame jFrame = new JFrame();
        jFrame.setVisible(true);
        jFrame.setSize(900,900);
        jFrame.setLayout(new GridLayout(3,3));

        for(int i = 1; i<=9; i++){
            jFrame.add(new JButton("button" + i));
        }
    }
}
