import java.io.FileWriter;
import java.io.IOException;

public class ArmstrongNumbers {
    public static void main(String[] args) {
        try {
            FileWriter armstrongWriter = new FileWriter("Armstrong.txt");

            for (int i = 1; i <= 1000; i++) {
                if (isArmstrong(i)) {
                    armstrongWriter.write(String.valueOf(i) + "\n");
                }
            }

            armstrongWriter.close();

            System.out.println("Armstrong numbers generated and written to Armstrong.txt successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to Armstrong.txt.");
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
}
