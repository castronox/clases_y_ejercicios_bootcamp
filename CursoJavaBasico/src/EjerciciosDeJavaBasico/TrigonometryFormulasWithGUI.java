package EjerciciosDeJavaBasico;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TrigonometryFormulasWithGUI {
    private JFrame frame;
    private JTextField angleInput;
    private JLabel resultLabel;

    public TrigonometryFormulasWithGUI() {
        frame = new JFrame("Fórmulas Trigonométricas");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new GridLayout(3, 2));
        panel.add(new JLabel("Ángulo (en grados):"));
        angleInput = new JTextField();
        panel.add(angleInput);
        panel.add(new JLabel(""));
        JButton sinButton = new JButton("Seno");
        sinButton.addActionListener(new SinButtonListener());
        panel.add(sinButton);
        JButton cosButton = new JButton("Coseno");
        cosButton.addActionListener(new CosButtonListener());
        panel.add(cosButton);
        JButton tanButton = new JButton("Tangente");
        tanButton.addActionListener(new TanButtonListener());
        panel.add(tanButton);
        panel.add(new JLabel("Resultado:"));
        resultLabel = new JLabel("");
        panel.add(resultLabel);

        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }

    private class SinButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                double angle = Double.parseDouble(angleInput.getText());
                double radians = Math.toRadians(angle);
                double result = Math.sin(radians);
                resultLabel.setText(String.valueOf(result));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame, "Por favor ingrese un número válido.");
            }
        }
    }

    private class CosButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                double angle = Double.parseDouble(angleInput.getText());
                double radians = Math.toRadians(angle);
                double result = Math.cos(radians);
                resultLabel.setText(String.valueOf(result));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame, "Por favor ingrese un número válido.");
            }
        }
    }

    private class TanButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            double angle = Double

                    .parseDouble(angleInput.getText());
            double radians = Math.toRadians(angle);
            double result = Math.tan(radians);
            resultLabel.setText(String.valueOf(result));
        }
    }

    public static void main(String[] args) {
        new TrigonometryFormulasWithGUI();
    }
}
