package jlabel;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.UnknownHostException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MyFrame extends JFrame implements ActionListener{

    JTextField jTextField;
    JLabel jLabel;
    JButton jButton;

    public MyFrame(){
        jTextField = new JTextField();
        jLabel = new JLabel();
        jButton = new JButton();

        jTextField.setBounds(50,50,150,20);
        jLabel.setBounds(50,100,250,20);
        jButton.setBounds(50,150,90,30);

        jButton.addActionListener(this);

        this.add(jTextField);
        this.add(jLabel);
        this.add(jButton);
        this.setSize(400,400);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        try {
            String host = jTextField.getText();
            String ip = java.net.InetAddress.getByName(host).getHostAddress();
            jLabel.setText("ip of " + host + " is " + ip);
        } catch (UnknownHostException e1) {
            System.out.println(e);
        }  
    }
    
}
