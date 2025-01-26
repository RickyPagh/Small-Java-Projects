import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Main {
    public static void main(String[] args) {
        //creates scanner and prompts user for a binary number
        Scanner userInputScanner = new Scanner(System.in);
        System.out.println("Type your binary number to be converted to decimal:");

        //stores user input as a string and closes scanner afterwards
        String userInput = userInputScanner.nextLine();
        userInputScanner.close();

        //detects wether or not the number contains anything other than 0 or 1, doesnt take letters into account
        Pattern pattern = Pattern.compile("[2-9]");
        Matcher matcher = pattern.matcher(userInput);
        boolean matchfound = matcher.find();

        //outputs an error if a number other than 0 or 1 is found, otherwise converts the binary number to decimal
        if (matchfound == true) {
            System.out.println("Error: input is not a binary number!");
        } else {
            //declares the variables used for binary-to-decimal conversion
            int convertedNum = 0;
            int i;
            int p = 0;
            
            //gets the length of the user inputted binary number
            int len = userInput.length();

            //for loop to convert the binary number
            for (i = len - 1; i >= 0; i--) {

                if (userInput.charAt(i) == '1') {
                    convertedNum += Math.pow(2, p);
                }

                p++;
            }

            System.out.println("Your binary number converted to decimal is: " + convertedNum);
        }

    }
    
}
