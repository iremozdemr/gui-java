import javax.swing.JFrame;

public class Main{
    public static void main(String[] args) {
        
        MyPanel myPanel = new MyPanel();
        JFrame jFrame = new JFrame();
        jFrame.setVisible(true);
        jFrame.setSize(500,500);

        jFrame.add(myPanel);
    }
}