import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class MyFrame extends JFrame{

    private JCheckBox boldBox;
    private JCheckBox italicBox;
    private JTextField textField;

    public MyFrame(){
        this.setVisible(true);
        this.setSize(500,500);
        this.setLayout(new FlowLayout());
        this.setTitle("the title");

        boldBox = new JCheckBox("bold");
        italicBox = new JCheckBox("italic");
        textField = new JTextField("this is a textfield");

        textField.setFont(new Font(Font.SERIF,Font.PLAIN,10));

        this.add(boldBox);
        this.add(italicBox);
        this.add(textField);

        Handler handler = new Handler();
        boldBox.addItemListener(handler);
        italicBox.addItemListener(handler);
    }

    private class Handler implements ItemListener{

        @Override
        public void itemStateChanged(ItemEvent e) {
            Font font = null;

            if(boldBox.isSelected()){
                if(italicBox.isSelected()){
                    font = new Font(Font.SERIF, Font.BOLD + Font.ITALIC, 20);
                }
            }
            else if(boldBox.isSelected()){
                font = new Font(Font.SERIF, Font.BOLD, 20);
            }
            else if(italicBox.isSelected()){
                font = new Font(Font.SERIF, Font.ITALIC, 20);
            }
            else{
                font = new Font(Font.SERIF, Font.PLAIN, 10);
            }

            textField.setFont(font);
        }
    }
}
