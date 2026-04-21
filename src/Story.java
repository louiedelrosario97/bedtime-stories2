import java.util.Scanner;
import java.io.*;

public class Story {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Add Scanner class

        System.out.println();                               // Menu (Visual)
        System.out.println("       Story Select");
        System.out.println("--------------------------");
        System.out.println("(1) Goldilocks");
        System.out.println("(2) Hansel and Gretel")    ;
        System.out.println("(3) Mary Had a Little Lamb");
        System.out.println();
        System.out.println("Select a Story (Enter number): "); // Prompt user for story input
        int storySelect = scanner.nextInt();                    // Scans users input

        //add in switch. First time using switches, found out you have to
        // declare a string variable as the vehicle for the text file we select... cool
        String fileTitle; // Declared variable
        switch(storySelect) {
            case 1:
                fileTitle = "goldilocks.txt";               // We are changing the value of 'fileTitle' to the file name
                break;                                      // as a String. In the try block below, when the 'fileTitle' string
            case 2:                                         // passes through the 'FileReader' class, the 'FileReader' uses
                fileTitle = "hansel_and_gretel.txt";        // the string as a FILE PATH to the exact file in the project.
                break;
            case 3:
                fileTitle = "mary_had_a_little_lamb.txt";
                break;
            default:
                fileTitle = "The story of your life is the funniest story of all. Get serious and enter a valid response.";
                break;
        }
        try {
            FileReader fileReader = new FileReader(fileTitle);               // FileReader connects the file we call in the Scanner. We plug in 'fileTitle' from the switch block setup as the file path we select.
            BufferedReader bufferedReader = new BufferedReader(fileReader); // BufferedReader efficiently displays the information
                                                                           // the FileReader connects to... (I think)

            String input;
            int lineNumber = 1;                                              // We declare this string. It will be the vehicle where we will display the text of the file.
            while ((input = bufferedReader.readLine()) != null) {                  // input will display the buffered readers output
                System.out.println(lineNumber+  ". " + input);
                lineNumber++;                                                    // one line at a time (.readLine()) and will continue as long as != null is true. Meaning it will continue to read until the next line IS empty.
            }
        } catch (
                IOException e) { // this will catch runtime exceptions, so the code can still run, and we can display certain outputs if an error occurs.
            e.printStackTrace();
        }
    }
}

