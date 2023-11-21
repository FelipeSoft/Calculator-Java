import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {
    public JPanel calculatorPanel;
    private JTextField firstValue;
    private JLabel result;
    private JButton plus;
    private JButton division;
    private JButton minus;
    private JButton multiplication;
    private JTextField secondValue;

    public Calculator(){
        plus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double finalResult = Double.parseDouble(firstValue.getText()) + Double.parseDouble(secondValue.getText());
                result.setText("Soma: " + String.valueOf(finalResult));
            }
        });

        minus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double finalResult = Double.parseDouble(firstValue.getText()) - Double.parseDouble(secondValue.getText());
                result.setText("Subtração: " + String.valueOf(finalResult));
            }
        });

        multiplication.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double finalResult = Double.parseDouble(firstValue.getText()) * Double.parseDouble(secondValue.getText());
                result.setText("Multiplicação: " + String.valueOf(finalResult));
            }
        });

        division.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double finalResult = Double.parseDouble(firstValue.getText()) / Double.parseDouble(secondValue.getText());
                result.setText("Divisão: " + String.valueOf(finalResult));
            }
        });

    }
}
