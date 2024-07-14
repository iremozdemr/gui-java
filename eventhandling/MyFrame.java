import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class MyFrame extends JFrame{

    private JTextField item1;
    private JTextField item2;
    private JTextField item3;
    private JPasswordField item4;

    public MyFrame(){
        this.setTitle("the title");
        this.setLayout(new FlowLayout());
        this.setVisible(true);
        this.setSize(500,500);

        item1 = new JTextField("enter ur name");
        item2 = new JTextField("enter ur surname");
        item3 = new JTextField("this is uneditable");
        item3.setEditable(false);
        item4 = new JPasswordField("enter ur password");

        this.add(item1);
        this.add(item2);
        this.add(item3);
        this.add(item4);

        Handler handler = new Handler();

        item1.addActionListener(handler);
        item2.addActionListener(handler);
        item3.addActionListener(handler);
        item4.addActionListener(handler);
    }

    private class Handler implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent event) {
            
            String string = " ";

            if(event.getSource() == item1){
                string = event.getActionCommand();
            }
            else if(event.getSource() == item2){
                string = event.getActionCommand();
            }
            else if(event.getSource() == item3){
                string = event.getActionCommand();
            }
            else if(event.getSource() == item4){
                string = event.getActionCommand();
            }

            JOptionPane jOptionPane = new JOptionPane();
            jOptionPane.showMessageDialog(null,string);
        }
    }
    
}


