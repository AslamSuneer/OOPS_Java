import java.util.Calendar;
import java.util.Scanner;

public class DisplayCalendar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input date, month, and year
        System.out.print("Enter year (e.g., 2023): ");
        int year = scanner.nextInt();
        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();
        System.out.print("Enter day (1-31): ");
        int day = scanner.nextInt();

        // Create a Calendar instance
        Calendar calendar = Calendar.getInstance();

        // Set the calendar to the specified date
        calendar.set(year, month - 1, day);

        // Get the day of the week
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

        // Convert dayOfWeek to a string representation
        String[] daysOfWeek = {"", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        String dayOfWeekString = daysOfWeek[dayOfWeek];

        // Print the result
        System.out.println("The day of the week for " + day + "/" + month + "/" + year + " is: " + dayOfWeekString);

        scanner.close();
    }
}
