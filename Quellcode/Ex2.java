import java.io.*;

public class ThrowsExample {

    static void readFile() throws IOException {
        FileReader fr = new FileReader("test.txt");
        System.out.println("File opened successfully");
    }

    public static void main(String[] args) {
        try {
            readFile();
        } catch (IOException e) {
            System.out.println("Exception Handled: " + e.getMessage());
        }
    }
}