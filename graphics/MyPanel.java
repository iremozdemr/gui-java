import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;

public class MyPanel extends JPanel{

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        this.setBackground(Color.WHITE);

        g.setColor(Color.BLUE);
        g.drawLine(0,0,25,25);
        g.drawRect(50,50,70,90);
        g.setColor(Color.BLACK);
        g.fillRect(250,260,100,200);
        g.drawOval(400,400,70,90);
    }
}