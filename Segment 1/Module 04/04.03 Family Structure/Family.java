import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * This assignment takes a file as input, and reads the file to analyze the average of the sample set of the gender of kids.
 *
 * @author Charles Sokolove
 * @version 01/16/2023
 */
public class Family {
    public static void main(String[] args) throws IOException {
        System.out.print("Enter file name: ");
        Scanner fileSelector = new Scanner(System.in);
        String selected = fileSelector.nextLine();
        fileSelector.close();

        File fileName = new File(selected);

        Scanner inFile = new Scanner(fileName);

        int families = 0;
        int twoBoys = 0;
        int twoGirls = 0;
        int oneEach = 0;

        while(inFile.hasNext()) {
            String token = inFile.next();
            if(token.equals("BB")) {
                twoBoys++;
                families++;
            } else if (token.equals("GG")) {
                twoGirls++;
                families++;
            } else if ((token.equals("BG")) || (token.equals("GB"))) {
                oneEach++;
                families++;
            }
        }

        inFile.close();

        System.out.println("\nComposition statistic for families with two children.\n");
        System.out.println("Total number of families: " + families + "\n");
        System.out.println("Number of families with");
        System.out.println("\t2 boys: " + twoBoys + " represents " + round(((twoBoys / (double)families) * 100), 2) + "%");
        System.out.println("\t2 girls: " + twoGirls + " represents " + round(((twoGirls / (double)families) * 100), 2) + "%");
        System.out.println(" 1 boy and 1 girl: " + oneEach + " represents " + round(((oneEach / (double)families) * 100), 2) + "%");
    }

    /*
     * Method used in my 03.05 BMI assignment
     */
    public static double round(double value, int places) {
        int scale = (int)Math.pow(10, places); // Creates the scale to round to
        return (double)Math.round(value * scale) / scale; // Rounds to the closest long, which becomes the value with the amount of decimal places
    }
}
