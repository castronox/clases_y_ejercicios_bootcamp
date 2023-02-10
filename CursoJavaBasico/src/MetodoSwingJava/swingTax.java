package MetodoSwingJava;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class swingTax {
    private JLabel Total;
    private JLabel IVA;
    private JLabel Precio;
    private JPanel precioPane;
    private JPanel taxPane;
    private JPanel totalPane;
    private JPanel taxPanel;
    private JTextArea precioPanel;
    private JTextArea ivaPane;
    private JTextArea resultadoPane;
    private JButton calculate;


    public swingTax(){


        calculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double p = Double.parseDouble(precioPanel.getText());
                double t = Double.parseDouble(ivaPane.getText());

                double resultado = p + (p / 100 * t);
                resultadoPane.setText(Double.toString(resultado));

            }
        });
    }


    public static void main(String[] args) {
        JFrame frame = new JFrame("SwingTax");

        frame.setContentPane(new swingTax().taxPanel);
        frame.setVisible(true);

    }
}



