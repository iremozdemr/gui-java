import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class BorderLayoutBasics {
    public static void main(String[] args) {

        JFrame jFrame = new JFrame();
        jFrame.setVisible(true);
        jFrame.setSize(500,500);
        // ana pencere oluşturuldu

        JLabel northLabel = new JLabel("bu kuzey bolgesi");
        jFrame.add(northLabel,BorderLayout.NORTH);

        JLabel southLabel = new JLabel("bu guney bolgesi");
        jFrame.add(southLabel,BorderLayout.SOUTH);

        JLabel westLabel = new JLabel("bu bati bolgesi");
        jFrame.add(westLabel,BorderLayout.WEST);

        JLabel eastLabel = new JLabel("bu dogu bolgesi");
        jFrame.add(eastLabel,BorderLayout.EAST);

        // border layout bileşenleri ekranına dört kenarına ve ortasına yerleştirir
    }
}