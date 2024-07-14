import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame{

    private JButton button1;
    private JButton button2; 
    
    public MyFrame(){
        this.setVisible(true);
        this.setTitle("the title");
        this.setSize(500,500);
        this.setLayout(new FlowLayout());

        button1 = new JButton("button1");
        button2 = new JButton("button2");

        this.add(button1);
        this.add(button2);

        Handler handler = new Handler();
        button1.addActionListener(handler);
        button2.addActionListener(handler);
    }

    private class Handler implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent event) {
            if(event.getSource() == button1){
                System.out.println("you entered button1!!!");
            }
            if(event.getSource() == button2){
                System.out.println("you entered button2!!");
            }
        }

    }
}
