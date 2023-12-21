import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InputDisplayPanel {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Input Display Panel");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 200);
            frame.setLocationRelativeTo(null);

            JPanel mainPanel = new JPanel();
            frame.add(mainPanel);

            placeComponents(mainPanel);

            frame.setVisible(true);
        });
    }

    private static void placeComponents(JPanel mainPanel) {
        mainPanel.setLayout(new BorderLayout());

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new FlowLayout());

        JLabel label = new JLabel("Enter text:");
        inputPanel.add(label);

        JTextField textField = new JTextField(20);
        inputPanel.add(textField);

        JButton displayButton = new JButton("Display");
        inputPanel.add(displayButton);

        mainPanel.add(inputPanel, BorderLayout.NORTH);

        JPanel displayPanel = new JPanel();
        mainPanel.add(displayPanel, BorderLayout.CENTER);

        displayButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String enteredText = textField.getText();
                displayPanel.removeAll();
                displayPanel.add(new JLabel("You have typed: " + enteredText));
                mainPanel.revalidate();
                mainPanel.repaint();
            }
        });
    }
}

