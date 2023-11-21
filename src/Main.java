import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame calculator = new JFrame("Calculadora");
        calculator.setContentPane(new Calculator().calculatorPanel);
        calculator.setResizable(true);
        calculator.setSize(250, 200);
        calculator.setVisible(true);
        calculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}