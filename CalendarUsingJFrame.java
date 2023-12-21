import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

public class DisplayCalendarWithGUI {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Day of the Week Calculator");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 200);
            frame.setLocationRelativeTo(null);

            JPanel panel = new JPanel();
            frame.add(panel);
            placeComponents(panel);

            frame.setVisible(true);
        });
    }

    private static void placeComponents(JPanel panel) {
        panel.setLayout(null);

        JLabel yearLabel = new JLabel("Enter year:");
        yearLabel.setBounds(10, 20, 80, 25);
        panel.add(yearLabel);

        JTextField yearText = new JTextField(20);
        yearText.setBounds(100, 20, 165, 25);
        panel.add(yearText);

        JLabel monthLabel = new JLabel("Enter month:");
        monthLabel.setBounds(10, 50, 80, 25);
        panel.add(monthLabel);

        JTextField monthText = new JTextField(20);
        monthText.setBounds(100, 50, 165, 25);
        panel.add(monthText);

        JLabel dayLabel = new JLabel("Enter day:");
        dayLabel.setBounds(10, 80, 80, 25);
        panel.add(dayLabel);

        JTextField dayText = new JTextField(20);
        dayText.setBounds(100, 80, 165, 25);
        panel.add(dayText);

        JButton calculateButton = new JButton("Calculate");
        calculateButton.setBounds(10, 110, 100, 25);
        panel.add(calculateButton);

        JLabel resultLabel = new JLabel("");
        resultLabel.setBounds(10, 140, 300, 25);
        panel.add(resultLabel);

        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int year = Integer.parseInt(yearText.getText());
                int month = Integer.parseInt(monthText.getText());
                int day = Integer.parseInt(dayText.getText());

                Calendar calendar = Calendar.getInstance();
                calendar.set(year, month - 1, day);
                int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

                String[] daysOfWeek = {"", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
                String dayOfWeekString = daysOfWeek[dayOfWeek];

                resultLabel.setText("The day of the week for " + day + "/" + month + "/" + year + " is: " + dayOfWeekString);
            }
        });
    }
}
