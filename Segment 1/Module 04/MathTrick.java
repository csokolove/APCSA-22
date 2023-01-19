/**
 * This assignment serves to convert a random number to the same String.
 * @author Charles Sokolove
 * @version 01/18/2023
 * 
 * @see This Math trick and many more can be found at: http://www.pleacher.com/handley/puzzles/mtricks.html
 */
public class MathTrick {
	public static int getRandomNum() {   
        int num = 0;
        int firstDigit = 0;
        int lastDigit = 0;
 
        while(Math.abs(firstDigit - lastDigit) < 2){
            num = (int)(Math.random() * (999 - 100 + 1) + 100);
            firstDigit = num / 100;
            lastDigit = num % 10;
        }
        return num;
    }

    // Reverse an original number (588 -> 885)
    public static int reverseDigits (int num) {
        int reversedNum = 0;
        while (num > 0) {
            reversedNum = (reversedNum * 10) + (num % 10);
            num = num / 10;
        }
        return reversedNum;
    }
    

    // Replace numbers in a string with a corresponding letter
    public static String replaceLtr(String str) {
        String string = "";
        for (int  x = 0; x < str.length(); x++) {
            String currentNum = str.substring(x, x + 1);

            if (currentNum.equals("0")) {
            currentNum = "Y"; 
            } else if (currentNum.equals("1")) {
            currentNum = "M";
            } else if (currentNum.equals("2")) {
            currentNum = "P";
            } else if (currentNum.equals("3")){
            currentNum = "L";
            } else if (currentNum.equals("4")){
            currentNum = "R";
            } else if (currentNum.equals("5")){
            currentNum = "O";
            } else if (currentNum.equals("6")){
            currentNum = "F";
            } else if (currentNum.equals("7")){
            currentNum = "A";
            } else if (currentNum.equals("8")){
            currentNum = "I";
            } else if (currentNum.equals("9")) {
            currentNum = "B";
            }

            string += currentNum;
        }
        return string; 
    }
    

    // Reverse a string (false -> eslaf)
    public static String reverseString(String str) {
        String reversedStr = "";

        for (int x = str.length(); x > 0; x--) {
            String currentNum = str.substring(x - 1, x);
            reversedStr += currentNum;
        }

        return reversedStr;
    }
        
    public static void main(String[] args) {
        // step a - generate random number 100-999
        int rand = getRandomNum();
        System.out.println("a. The random number is: " + rand);

        // step b - reverse random number
        int reversedRand = reverseDigits(rand);
        System.out.println("b. That number reversed is: " + reversedRand);

        // step c - difference between step 1 and step 2
        int difference = (rand > reversedRand) ? rand - reversedRand : reversedRand - rand;
        System.out.println("c. The difference between those numbers is: " + difference);
    
        // step d - add step 3 + reversed step 3
        int addedDiff = reverseDigits(difference) + difference;
        System.out.println("d. The sum of the difference + the reversed difference is: " + addedDiff);

        // step e - multiply step 4 by 1,000,000
        int multiplied = addedDiff * 1000000;
        System.out.println("e. That number * 1,000,000 is: " + multiplied);

        // step f - subtract 733,361,573 from step 5
        int subtracted = Math.abs(multiplied - 733361573);
        System.out.println("f. 733,361,573 - that number is: " + subtracted); 

        // step f-1 - convert step e to a String
        String subtractedString = String.valueOf(subtracted);
        System.out.println("f-1. That number as a String is also: " + subtractedString);

        // step g - convert step f-1 to a string of characters
        String convertedString = replaceLtr(subtractedString);
        System.out.println("g. That string's conversion is: " + convertedString);
    
        // step h - reverse step g to finalize the program
        String reversedString = reverseString(convertedString);
        System.out.println("h. That string reversed is: " + reversedString);
    } 
}
	    
	    
//		1.	Generate a random 3-digit number so that the first and third digits differ by more than one.

//		2.	Now reverse the digits to form a second number.

//		3.	Subtract the smaller number from the larger one.

//		4.	Now reverse the digits in the answer you got in step 3 and add it to that number.

//		5.	Multiply by one million.

//		6.	Subtract 733,361,573.

//		7.	Convert the number to a string in order to replace the numbers with letters.
// 				Ex: String str = String.valueOf(myNumber);
//			Then, replace each of the digits in your answer, with the letter it corresponds to using the table in the instructions.

//		8.	Now reverse the letters in the string to read your message backward.

	//} // end main
//} // end class