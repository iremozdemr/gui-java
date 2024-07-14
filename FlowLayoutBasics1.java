import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class FlowLayoutBasics1{
    public static void main(String[] args) {
        
        JFrame jFrame = new JFrame();
        jFrame.setVisible(true);
        jFrame.setSize(500,500);
        // ana pencere oluşturuldu

        jFrame.setLayout(new FlowLayout());

        JLabel panel1 = new JLabel("panel 1");
        JLabel panel2 = new JLabel("panel 2");
        JLabel panel3 = new JLabel("panel 3");

        jFrame.add(panel1);
        jFrame.add(panel2);
        jFrame.add(panel3);

        // flow layout bileşenleri en üst satırdan başlayarak yerleştirir
        // sığmayınca alt satıra geçer

    }
}
