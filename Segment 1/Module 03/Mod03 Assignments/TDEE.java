

import java.util.Scanner;

public class TDEE {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        String name = in.nextLine();

        System.out.print("Please enter your BMR: ");
        double BMR = Double.parseDouble(in.nextLine());

        System.out.print("Please enter your gender (M/F): ");
        String gender = in.next().toUpperCase();
        while(!(gender.equals("M") || gender.equals("F"))) {
            System.out.println("Not a valid input.");
            System.out.print("Please enter your gender (M/F): ");
            gender = in.next().toUpperCase();
        }

        System.out.println("Select Your Activity Level\n[A] Resting (Sleeping, Reclining)\n[B] Sedentary (Restricted Mobility)\n[C] Light (Sitting, Standing)\n[D] Moderate (Light Manual Labor, Dancing, Riding Bike)\n[E] Very Active (Team Sports, Hard Manual Labor)\n[F] Extremely Active (Full-time Athlete, Heavy Manual Labor)\n\nEnter the letter corresponding to your activity level: ");
        String activityLevel = in.nextLine().toUpperCase();
        while(!(activityLevel.equals("A") || activityLevel.equals("B") || activityLevel.equals("C") || activityLevel.equals("D") || activityLevel.equals("E") || activityLevel.equals("F"))) {
            System.out.println("Not a valid input.");
            System.out.print("Enter the letter corresponding to your activity level: ");
            activityLevel = in.next().toUpperCase();
        }

        in.close();

        System.out.println("\n\n\nYour results:");
        System.out.print("Name:        " + name);
        System.out.println("\t Gender: " + gender);
        System.out.print("BMR:         " + BMR + " calories");
        System.out.println("Activity Factor: " + calculateAF(activityLevel, gender));
        System.out.println("TDEE: " + calculateTDEE(gender, BMR, activityLevel) + " calories");
    }

    public static double calculateTDEE(String gender, double BMR, String activityLevel) {
        return BMR * calculateAF(activityLevel, gender);
    }

    public static double calculateAF(String activityLevel, String gender) {
        double activityFactor = 0;
        if(gender == "M") {
            if(activityLevel == "A") {
                activityFactor = 1.0;
            } else if (activityLevel == "B") {
                activityFactor = 1.3;
            } else if (activityLevel == "C") {
                activityFactor = 1.6;
            } else if (activityLevel == "D") {
                activityFactor = 1.7;
            } else if (activityLevel == "E") {
                activityFactor = 2.1;
            } else if (activityLevel == "F") {
                activityFactor = 2.4;
            }
        } else if (gender == "F") {
            if(activityLevel == "A") {
                activityFactor = 1.0;
            } else if (activityLevel == "B") {
                activityFactor = 1.3;
            } else if (activityLevel == "C") {
                activityFactor = 1.5;
            } else if (activityLevel == "D") {
                activityFactor = 1.6;
            } else if (activityLevel == "E") {
                activityFactor = 1.9;
            } else if (activityLevel == "F") {
                activityFactor = 2.2;
            }
        }
        return activityFactor;
    }
}
