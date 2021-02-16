// Purpose: To print data from input txt file with double space to output file.

// importing required java packages
import java.util.*;
import java.io.*;

public class ReadFile {

    public static void main(String[] args) throws IOException {
        // Scanning input file and print in outut file using in-build packages.
        Scanner input = new Scanner(new File("hello.txt"));
        PrintStream output = new PrintStream("output.txt");
        // Calling doubleSpace method with input and output parameter
        doubleSpace(input, output);
    }

    // declare doubleSpacing method with two parameter(Scanner input and PrintStream
    // output) with throws exception
    public static void doubleSpace(Scanner input, PrintStream output) throws IOException {

        // Check if same name file exists, if not create new file
        try {
            File txt = new File("output.txt");
            if (!txt.exists()) {
                txt.createNewFile();
            }

            // using while loop to loop every line in input file and print data to output
            // file with double space
            while (input.hasNextLine()) {
                String data = input.nextLine();
                output.println(data.toString());
                output.println(" ");
                output.println(" ");
            }

            // Throw exceptions
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Closing input and output file.
        input.close();
        output.close();
    }
}
