import java.util.Scanner;
import java.io.*;

public class Story {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Add Scanner class

        System.out.print("Enter the name of a story: "); // Prompt user for story input
        String storySelect = scanner.nextLine(); // Scans users input

        try {
            FileReader fileReader = new FileReader(storySelect); // FileReader connects the file we call in the Scanner
            BufferedReader bufferedReader = new BufferedReader(fileReader); // BufferedReader efficiently displays the information
                                                                            // the FileReader connects to... (I think)

            String input; // We declare this string. It will be the vehicle where we will display the text of the file.
            while((input = bufferedReader.readLine()) !=null) { // input will display the buffered readers output
                System.out.println(input);                      // one line at a time (.readLine()) and will continue as long as != null is true. Meaning it will continue to read until the next line IS empty.
            }
        }
        catch(IOException e) { // this will catch runtime exceptions, so the code can still run and we can display certain outputs if an error occurs.
            e.printStackTrace();
        }


}

