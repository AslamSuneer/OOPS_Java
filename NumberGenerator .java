import java.io.FileWriter;
import java.io.IOException;

public class NumberGenerator {
    public static void main(String[] args) {
        try {
            FileWriter armstrongWriter = new FileWriter("Armstrong.txt");
            FileWriter krishnamurthyWriter = new FileWriter("Krishnamurthy.txt");

            for (int i = 1; i <= 1000; i++) {
                if (isArmstrong(i)) {
                    armstrongWriter.write(String.valueOf(i) + "\n");
                }
                if (isKrishnamurthy(i)) {
                    krishnamurthyWriter.write(String.valueOf(i) + "\n");
                }
            }

            armstrongWriter.close();
            krishnamurthyWriter.close();

            System.out.println("Numbers generated and written to files successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to files.");
            e.printStackTrace();
        }
    }

    public static boolean isArmstrong(int number) {
        int originalNumber, remainder, result = 0;
        originalNumber = number;

        while (originalNumber != 0) {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }

        return result == number;
    }

    public static boolean isKrishnamurthy(int number) {
        int originalNumber, remainder, result = 0;
        originalNumber = number;

        while (originalNumber != 0) {
            remainder = originalNumber % 10;
            result += factorial(remainder);
            originalNumber /= 10;
        }

        return result == number;
    }

    public static int factorial(int n) {
        if (n == 0)
            return 1;
        else
            return (n * factorial(n - 1));
    }
}
