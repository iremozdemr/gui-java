import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame{

    JComboBox jComboBox;
    JButton jButton;

    public MyFrame(){
        String[] countries = {"India","USA","England","Turkey"};  
        jComboBox = new JComboBox(countries);
        jComboBox.setBounds(50,50,100,20);

        jButton = new JButton("show");
        jButton.setBounds(50,200,100,20);
        jButton.addActionListener(new Handler());

        this.add(jButton);
        this.add(jComboBox);

        this.setTitle("jcombobox example");
        this.setSize(400,400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setVisible(true);
    }

    private class Handler implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == jButton){
                JOptionPane.showMessageDialog(null,jComboBox.getSelectedItem(), "", 0);
            }
        }

    }
}