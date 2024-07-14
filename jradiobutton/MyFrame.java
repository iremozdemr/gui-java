import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class MyFrame extends JFrame{
    
    JRadioButton jRadioButton1;
    JRadioButton jRadioButton2;
   
    public MyFrame(){
        jRadioButton1 = new JRadioButton("male");
        jRadioButton2 = new JRadioButton("female");

        jRadioButton1.setBounds(50,50, 100, 20);
        jRadioButton2.setBounds(50,100, 100, 20);

        Handler handler = new Handler();
        jRadioButton1.addActionListener(handler);
        jRadioButton2.addActionListener(handler);
    
        this.add(jRadioButton1);
        this.add(jRadioButton2);
        this.setSize(800,800);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    private class Handler implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            if(jRadioButton1.isSelected()){
                JOptionPane.showMessageDialog(null,"u r male","message",0);
            }
            if(jRadioButton2.isSelected()){
                JOptionPane.showMessageDialog(null,"u r female","message",0);
            }
        }
    }
}
