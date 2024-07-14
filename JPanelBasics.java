import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JPanelBasics{
    public static void main(String[] args) {
        
        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.red);
        redPanel.setBounds(0,0,250,250);

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(250,0,250,250);

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.green);
        greenPanel.setBounds(0,250,500,250);

        JLabel jLabel = new JLabel();
        jLabel.setText("texttt");

        JFrame jFrame = new JFrame();
        jFrame.setVisible(true);
        jFrame.setSize(700,700);
        jFrame.setLayout(null);
        
        jFrame.add(redPanel);
        jFrame.add(bluePanel);
        jFrame.add(greenPanel);
        redPanel.add(jLabel);
        bluePanel.add(jLabel);
        greenPanel.add(jLabel);
        // panellere labellar eklenebilir
        // framelere labellar eklenebilir
        // framelere paneller eklenebilir
    }
}