import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JLabelBasics {
    public static void main(String[] args) {
        
        JLabel jLabel = new JLabel();
        jLabel.setText("jlabela yazilan text");
        jLabel.setForeground(Color.PINK);
        jLabel.setFont(new Font("MV Boli",Font.BOLD,20));
        // fontun ismi  fontun boldu  fontun boyutu
        jLabel.setBackground(Color.black);
        jLabel.setOpaque(true);
        // sadece setBackGround yapıldığında arkaplan değişmiyor
        
        JFrame jFrame = new JFrame();
        jFrame.setSize(500,500);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        jFrame.add(jLabel);

        // jFrame.pack();
        // jframein büyüklüğünü jlabelın büyüklüğüne eşitler

        jLabel.setHorizontalTextPosition(JLabel.RIGHT);
        // jLabel.LEFT
        // jLabel.CENTER
        // jLabel.RIGHT
        // yatayda nerede konumlanacağını belirtir
        
        jLabel.setVerticalTextPosition(JLabel.CENTER);
        // jLabel.TOP
        // jLabel.CENTER
        // jLabel.BOTTOM
        // dikeyde nerede konumlanacağını belirtir

    }
}