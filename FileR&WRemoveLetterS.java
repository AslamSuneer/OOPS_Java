import java.io.*;

public class RemoveLetterS {

    public static void main(String[] args) {
        // Specify the path to your input file
        String inputFilePath = "path/to/your/input/file.txt";
        
        // Specify the path to your output file
        String outputFilePath = "path/to/your/output/file.txt";

        try {
            removeLetterS(inputFilePath, outputFilePath);
            System.out.println("Occurrences of letter 'S' removed successfully.");
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }

    private static void removeLetterS(String inputFilePath, String outputFilePath) throws IOException {
        BufferedReader reader = null;
        BufferedWriter writer = null;

        try {
            reader = new BufferedReader(new FileReader(inputFilePath));
            writer = new BufferedWriter(new FileWriter(outputFilePath));

            String line;
            while ((line = reader.readLine()) != null) {
                // Remove occurrences of 'S' (both uppercase and lowercase)
                line = line.replace("S", "").replace("s", "");
                
                writer.write(line);
                writer.newLine();
            }
        } finally {
            // Close the readers and writers in a finally block to ensure proper resource cleanup
            if (reader != null) {
                reader.close();
            }
            if (writer != null) {
                writer.close();
            }
        }
    }
}
