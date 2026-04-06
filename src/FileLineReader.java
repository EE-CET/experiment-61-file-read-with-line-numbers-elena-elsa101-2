import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileLineReader {
    public static void main(String[] args) {
        String fileName = "input.txt";
        
        // Try-with-resources to automatically close the file
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            
            String line;
            int lineNumber = 1;
            
            // Read file line by line
            while ((line = br.readLine()) != null) {
                System.out.println(lineNumber + ": " + line);
                lineNumber++;
            }
            
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
