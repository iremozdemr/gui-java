import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame extends JFrame{

    private JButton jButton;
    private JPanel jPanel;
    private Color color = Color.white;

    public MyFrame(){
        this.setVisible(true);
        this.setSize(400,400);
        this.setTitle("the title");

        jButton = new JButton("choose a color");
        jPanel = new JPanel();
        
        jPanel.setBackground(color);

        jPanel.add(jButton);
        this.add(jPanel);

        Handler handler = new Handler();
        jButton.addActionListener(handler);
    }

    private class Handler implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent event) {
            if(event.getSource() == jButton){
                color = JColorChooser.showDialog(null,"pick your color",color);
                jPanel.setBackground(color);
            }
        }
        
    }

    
}

