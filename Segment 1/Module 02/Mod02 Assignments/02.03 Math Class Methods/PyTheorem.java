import java.util.Random;

/**
 * Write a description of class PyTheorem here.
 *
 * @author Charles Sokolove
 * @version 11/02/22
 */
public class PyTheorem {
    public static void addSpace(int numberOfSpaces) {
        String space = "";
        for(int i = 0; i < numberOfSpaces; i++) {
            space += " ";
        }
        System.out.print(space);
    }
    public static void newTriangle(int number) {
        Random r = new Random();
        int low = 5; // inclusive
        int high = 23; // exclusive
        int legA = r.nextInt(low, high);
        r = new Random();
        int legB = r.nextInt(low, high);
        
        double hypot = Math.hypot(legA, legB);

        System.out.print("Triangle " + number);
        addSpace(10);
        System.out.print("Side 1: " + legA);
        addSpace(10);
        System.out.print("Side 2: " + legB);
        addSpace(10);
        System.out.print("Hypotenuse: " + hypot);
        System.out.println();
    }
    public static void main(String[] args) {
        newTriangle(1);
        newTriangle(2);
    }
}