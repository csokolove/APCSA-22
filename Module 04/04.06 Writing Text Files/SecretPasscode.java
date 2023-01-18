/**
 * This assignment randomly generates passwords.
 *
 * @author Charles Sokolove
 * @version 01/16/2023
 * 
 */
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.util.Scanner;

public class SecretPasscode {
    public static void main(String [] args) throws IOException {
        File file = new File("passcodes.txt");
        file.createNewFile();
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(file);
        String userChoice = "Y";

        System.out.println("**********************************************************");
        System.out.println("Welcome to a simple passcode generator. \nThe password will include lowercase, uppercase, & numbers.");
        while(userChoice.equals("Y")) {
                System.out.print("Enter a passcode length (6 or more): ");
                int length = Integer.parseInt(in.nextLine());
                while (length < 6) {
                        System.out.println("Invalid length. Passcode must be at leas 6 characters long.");
                        System.out.print("Enter a passcode length (6 or more):  ");
                        length = Integer.parseInt(in.nextLine());
                }

                int counter = 0;
                int rand = 0;
                while (counter < length) {
                        rand = (int)(Math.random() * 62) + 48;
                        if (rand > 57) {
                            rand += 7;
                            if (rand > 90){
                                rand += 6;
                            }
                        }
                        outFile.print((char)rand);
                        counter++;
                    }
                out.print("\n");
        
                System.out.println("A password has been written to the text file");
                System.out.print("Would you like to generate another password (Y/N)? ");
                userChoice = in.nextLine().toUpperCase();
        }
        in.close();
        out.close();

        Scanner reader = new Scanner(file);
        
        System.out.println("Thank you for using the Passcode Generator.");

        System.out.println("Here are your randomly generated codes:");
        int counter = 1;
        while(reader.hasNextLine()) {
                System.out.println(counter + ". " + reader.nextLine());
                counter++;
        }
        reader.close();
  }
}
