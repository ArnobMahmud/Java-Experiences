package w3Resources.FileHandling;

import java.io.FileWriter;  // Import the FileWriter class
import java.io.IOException; // Import the IOException class to handle errors

public class WriteInFile {
    public static void main(String[] args) {
        try {
            FileWriter myWriter = new FileWriter("filename.txt");
            myWriter.write("Files in Java might be tricky, but it is fun enough!");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}


// we use the FileWriter class together with its write() method to write some text to the file we created in the example above. Note that when you are done writing to the file,
// you should close it with the close() method: