import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SimpleFileStats {

    public static void main(String[] args) {
        String filePath = "path/to/your/textfile.txt";

        try {
            int[] stats = countFileStats(filePath);
            System.out.println("Number of characters: " + stats[0]);
            System.out.println("Number of lines: " + stats[1]);
            System.out.println("Number of words: " + stats[2]);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static int[] countFileStats(String filePath) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            int characterCount = 0;
            int lineCount = 0;
            int wordCount = 0;

            String line;
            while ((line = reader.readLine()) != null) {
                // Count characters
                characterCount += line.length();

                // Count lines
                lineCount++;

                // Count words
                String[] words = line.split("\\s+");
                wordCount += words.length;
            }

            return new int[]{characterCount, lineCount, wordCount};
        }
    }
}
