/**
 * Calculates the BMI of a given person
 * 
 * @author Charles Sokolove
 * @version 01/06/2023
 */

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Full Name: ");
        String fullName = in.nextLine();

        System.out.print("Height (in feet + inches): ");
        String[] height = in.nextLine().split(" "); // Creates a List to separate feet from inches
        double feet = Double.parseDouble(height[0]); // The first value of the list is feet
        double inches = Double.parseDouble(height[1]); // The second value of the list is inches

        double heightInMeters = inchesToMeters(feetToInches(feet) + inches);

        System.out.print("Weight (in pounds): ");
        double weight = Double.parseDouble(in.next());

        double weightInKg = poundsToKg(weight);

        in.close();

        double BMI = calculateBMI(weightInKg, heightInMeters);

        System.out.println("\nBody Mass Index Calculator\n==========================");
        System.out.println("Name:        " + fullName);
        System.out.println("Height (m):  " + heightInMeters);
        System.out.println("Weight (kg): " + weightInKg);
        System.out.println("BMI:         " + BMI);
        System.out.println("Category:    " + categorizeBMI(BMI));
    }

    /**
     * Convert feet to inches
     * @param feet measurement in feet
     * @return inches
     */
    public static double feetToInches(double feet) {
        return feet * 12;
    }

    /**
     * Convert inches to meters
     * @param inches measurement in inches
     * @return meters
     */
    public static double inchesToMeters(double inches) {
        double conversionFactor = 39.37;
        return round((inches / conversionFactor), 2);
    }

    /**
     * Convert pounds to kilograms
     * @param pounds weight in pounds
     * @return kilograms
     */
    public static double poundsToKg(double pounds) {
        double conversionFactor = 2.205;
        return round((pounds / conversionFactor), 2);
    }

    /**
     * Calculates BMI to one decimal place
     * @param weightInKg
     * @param heightInMeters
     * @return BMI
     */
    public static double calculateBMI(double weightInKg, double heightInMeters) {
        return round(weightInKg / Math.pow(heightInMeters, 2), 2);
    }

    /**
     * Return the BMI category of a given BMI
     * @param BMI
     * @return the BMI category
     */
    public static String categorizeBMI(double BMI) {
        if(BMI < 18.5) {
            return "Underweight";
        } else if (BMI >= 18.5 && BMI < 25) {
            return "Healthy";
        } else if (BMI >= 25 && BMI < 30) {
            return "Overweight";
        } else if (BMI >= 30) {
            return "Obese";
        } else {
            return null;
        }
    }

    /**
     * Round a number to a specific amount of decimal places
     * @param value The value to round
     * @param places The amount of decimal places to round to
     */
    public static double round(double value, int places) {
        int scale = (int)Math.pow(10, places); // Creates the scale to round values to
        return (double)Math.round(value * scale) / scale; // Rounds to the closest long, which becomes the value with the amount of decimal places
    }
}