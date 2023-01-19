package past;
import java.util.Scanner;

/**
 * This assignment will calculate your Total Daily Energy Expenditure (TDEE) by taking in some factors.
 *
 * @author Charles Sokolove
 * @version 01/16/2023
 */
public class TDEE {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        String name = in.nextLine();
 
        System.out.print("Please enter your BMR: ");
        String bmrString = in.nextLine();
 
        System.out.print("Please enter your gender [M/F]: ");
        String gender = in.nextLine().toUpperCase();
 
        while (!(gender.equals("M") || gender.equals("F"))) {
            System.out.println("Invalid input for gender.");
            System.out.print("Gender [M/F]: ");
            gender = in.nextLine().toUpperCase();
        }

        System.out.println("\nSelect your activity level:\n[A] Resting (Sleeping, Reclining)\n[B] Sedentary (Restricted Mobility]\n[C] Light (Sitting, Standing)\n[D] Moderate (Light Manual labor, Dancing, Riding Bike)\n[E] Very Active (Team Sports, Hard Manual Labor)\n[F] Extremely Active (Full-time Athlete, Heavy Manual Labor)\n");
         
        System.out.print("\nEnter the letter corresponding to your activity level: ");
        String choice = in.nextLine().toUpperCase();

        while (!(choice.equals("A") || choice.equals("B") || choice.equals("C") || choice.equals("D") || choice.equals("E") || choice.equals("F"))){
            System.out.println("Invalid input for activity level.");
            System.out.print("Enter the letter corresponding to your activity level: ");
            choice = in.nextLine().toUpperCase();
        }

        in.close();
 
        double bmr = Double.parseDouble(bmrString);
        double tdee = 0;
        double activityFactor = 0;

        activityFactor = getFactor(gender, choice).get();
        tdee = bmr * activityFactor;
 
        System.out.println("Your results:");
        System.out.print("Name: " + name + "\t\t");
        System.out.println("Gender: " + gender);
        System.out.print("BMR: " + bmr + " calories" + "\t\t");
        System.out.println("Activity factor: " + activityFactor);
        System.out.println("TDEE: " + tdee + " calories");
    }

    public static ActivityFactors getFactor(String gender, String activityLevel) {
        ActivityFactors factor = ActivityFactors.Default;

        if(gender == "M") {
            switch(activityLevel) {
                case("A"):
                    factor = ActivityFactors.MaleResting;
                    break;
                case("B"):
                    factor = ActivityFactors.MaleSedentary;
                    break;
                case("C"):
                    factor = ActivityFactors.MaleLight;
                    break;
                case("D"):
                    factor = ActivityFactors.MaleModerate;
                    break;
                case("E"):
                    factor = ActivityFactors.MaleVeryActive;
                    break;
                case("F"):
                    factor = ActivityFactors.MaleExtActive;
                    break;
            }
        } else {
            switch(activityLevel) {
                case("A"):
                    factor = ActivityFactors.FemaleResting;
                    break;
                case("B"):
                    factor = ActivityFactors.FemaleSedentary;
                    break;
                case("C"):
                    factor = ActivityFactors.FemaleLight;
                    break;
                case("D"):
                    factor = ActivityFactors.FemaleModerate;
                    break;
                case("E"):
                    factor = ActivityFactors.FemaleVeryActive;
                    break;
                case("F"):
                    factor = ActivityFactors.FemaleExtActive;
                    break;
            }
        }
        return factor;
     }

     enum ActivityFactors {
        MaleResting(1.0),
        FemaleResting(1.0),
        
        MaleSedentary(1.3),
        FemaleSedentary(1.3),

        MaleLight(1.6),
        FemaleLight(1.5),

        MaleModerate(1.7),
        FemaleModerate(1.6),

        MaleVeryActive(2.1),
        FemaleVeryActive(1.9),

        MaleExtActive(2.4),
        FemaleExtActive(2.2),

        Default(1.0);

        private double factor;

        public double get() {
            return this.factor;
        }
    
        ActivityFactors(double factor) {
            this.factor = factor;
        }
     }
}