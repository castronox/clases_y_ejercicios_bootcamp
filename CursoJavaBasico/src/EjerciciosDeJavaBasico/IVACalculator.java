package EjerciciosDeJavaBasico;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class IVACalculator extends JFrame {
    private JTextField amountField;
    private JLabel resultLabel;

    public IVACalculator() {
        setTitle("IVA Calculator");
        setSize(400, 200);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        amountField = new JTextField(10);
        add(amountField);

        JButton calculateButton = new JButton("Calculate");
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double amount = Double.parseDouble(amountField.getText());
                double result = amount * 0.21;
                resultLabel.setText(String.format("IVA: €%.2f", result));
            }
        });
        add(calculateButton);

        resultLabel = new JLabel("");
        add(resultLabel);
    }

    public static void main(String[] args) {
        IVACalculator calculator = new IVACalculator();
        calculator.setVisible(true);
    }
}