import javax.swing.JOptionPane;

public class JOptionPaneBasics{
    public static void main(String[] args) {
        
        String firstNumber = JOptionPane.showInputDialog("enter first number");
        String secondNumber = JOptionPane.showInputDialog("enter second number");

        int num1 = Integer.parseInt(firstNumber);
        int num2 = Integer.parseInt(secondNumber);

        int sum = num1 + num2;

        JOptionPane.showMessageDialog(null,"the answer is " + sum,"the title",0);

    }
}