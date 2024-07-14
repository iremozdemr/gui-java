import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyFrame extends JFrame{

    private JPanel jPanel;
    private JLabel jLabel;

    public MyFrame(){
        this.setVisible(true);
        this.setSize(500,500);
        this.setTitle("the title");
        this.setLayout(new BorderLayout());

        jPanel = new JPanel();
        jLabel = new JLabel();

        jPanel.setBackground(Color.pink);

        Handler handler1 = new Handler();
        jPanel.addMouseListener(handler1);
        jLabel.addMouseListener(handler1);

        Handler handler2 = new Handler();
        jPanel.addMouseMotionListener(handler2);
        jLabel.addMouseMotionListener(handler2);

        this.add(jPanel, BorderLayout.CENTER);
        this.add(jLabel,BorderLayout.SOUTH);
    }

    private class Handler implements MouseListener, MouseMotionListener{

        @Override
        public void mouseClicked(MouseEvent event) {
            String x = event.getX() + "";
            String y = event.getY() + "";

            jLabel.setText("you clicked " + x + "," + y);
        }

        @Override
        public void mousePressed(MouseEvent event) {
            jLabel.setText("you pressed the mouse");
        }

        @Override
        public void mouseReleased(MouseEvent event) {
            jLabel.setText("you released the mouse");
        }

        @Override
        public void mouseEntered(MouseEvent event) {
            jLabel.setText("you entered the area");
            jPanel.setBackground(Color.GREEN);
        }

        @Override
        public void mouseExited(MouseEvent event) {
            jLabel.setText("you exited the area");
            jPanel.setBackground(Color.pink);
        }

        @Override
        public void mouseDragged(MouseEvent event) {
            jLabel.setText("you are dragging the mouse");
        }

        @Override
        public void mouseMoved(MouseEvent event) {
            jLabel.setText("you are moving the mouse");
        }

    }
}