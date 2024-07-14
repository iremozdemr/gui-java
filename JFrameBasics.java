import java.awt.Color;
import javax.swing.JFrame;

public class JFrameBasics{
    public static void main(String[] args) {
        
        // jframe = a gui window to add components to

        JFrame jFrame = new JFrame(); 
        // jframe oluşturuldu
        
        jFrame.setVisible(true);
        // jframe görünür hale getirildi

        jFrame.setSize(420,420);
        // jframein x ve y büyüklükleri değiştirildi

        jFrame.setTitle("jframes title");
        // jframein başlığı yazıldı

        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // çıkılmak istendiğinde programı tamamen kapatır
        
        jFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        // çıkılmak istendiğinde program tamamen kapanmaz

        jFrame.setResizable(false);
        // normalde pencere resize edilebilir
        // false yapıldığında pencere resize edilemez

        jFrame.setBackground(Color.blue);
        // pencerenin üst kısmını mavi yaptı

        jFrame.getContentPane().setBackground(Color.pink);
        // pencerenin arka planını pembe yaptı
    }
}