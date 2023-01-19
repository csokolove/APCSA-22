
/**
 * A simple grade calculator.
 *
 * @author Charlie Sokolove
 * @version 10/31/22
 */
public class GradesV2 {
    public static void main(String[] args) {
        int numTests = 0;      //counts number of tests
        int testGrade = 0;     //individual test grade
        int totalPoints = 0;   //total points for all tests
        double average = 0.0;  //average grade
        
        int test1 = 95;
        int test2 = 73;
        int test3 = 91;
        int test4 = 82;
        int test5 = 95;
        int test6 = 92;
        int test7 = 64;
        int test8 = 75;
        int test9 = 100;

        int testGrades[] = { test1, test2, test3, test4, test5, test6, test7, test8, test9 };

        for(int i = 0; i < testGrades.length; i++) {
            numTests++;
            testGrade = testGrades[i];
            totalPoints += testGrade;
            average = (double) totalPoints / numTests;
            System.out.println("Test # " + (i + 1) + " Test Grade: " + testGrade + " Total Points: " + totalPoints + " Average Score: " + average);
        }
    }
}
