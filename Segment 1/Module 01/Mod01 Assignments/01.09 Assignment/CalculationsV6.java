/**
 * The Calculations class performs addition, subtraction,
 * multiplication, division, and modulus operations on integers and
 * decimals.
 *  
 * @ author Charles Sokolove
 * @ version 10/26/2022
 */
public class CalculationsV6
{
    public static void main(String[ ] args)
    {
        // Addition
        int addNum1 = 25;
        int addNum2 = 9;
        System.out.println("Addition");
        System.out.println(addNum1 + " + " + addNum2 + " = " + (addNum1 + addNum2));
        double addNum3 = 43.21;
        double addNum4 = 3.14;
        System.out.println(addNum3 + " + " + addNum4 + " = " + (addNum3 + addNum4));
        System.out.println();
        
        // Subtraction
        int subNum1 = 11;
        int subNum2 = 9;
        int subNum3 = 25;
        System.out.println("Subtraction");
        System.out.println(subNum1 + " - " + subNum2 + " - " + subNum3 + " = " + (subNum1 - subNum2 - subNum3));
        double subNum4 = 3.14;
        double subNum5 = 10.0;
        System.out.println(subNum4 + " - " + subNum5 + " = " + (subNum4 - subNum5));
        System.out.println();
        
        // Multiplication
        int multNum1 = 25;
        int multNum2 = 9;
        System.out.println("Multiplication");
        System.out.println(multNum1 + " % " + multNum2 + " = " + (multNum1 * multNum2)); 
        double multNum3 = 3.14;
        double multNum45 = 10.0;
        System.out.println(multNum3 + " * " + multNum45 + " * " + multNum45 + " = " + (multNum3 * multNum45 * multNum45));
        System.out.println();
        
        // Division
        int divNum1 = 9;
        int divNum2 = 25;
        System.out.println("Division");
        System.out.println(divNum1 + " / " + divNum2 + " = " + (divNum1 / divNum2));
        double divNum3 = 43.21;
        double divNum4 = 10.0;
        System.out.println(divNum3 + " / " + divNum4 + " = " + (divNum3 / divNum4));
        System.out.println();
         
        // Modulus operator
        int modNum1 = 11;
        int modNum2 = 9;
        System.out.println("Modulus");
        System.out.println(modNum1 + " % " + modNum2 + " = " + (modNum1 % modNum2));
        double modNum3 = 10.0;
        double modNum4 = 3.14;
        System.out.println(modNum3 + " % " + modNum4 + " = " + (modNum3 % modNum4));
        System.out.println();
        
        // 1.08 Additional int Equations
        int exNum1 = 5;
        int exNum2 = 3;
        int exNum3 = 15;
        System.out.println("Additional int Examples");
        System.out.println(exNum1 + " - " + exNum2 + " + " + exNum3 + " = " + (exNum1 - exNum2 + exNum3));
        System.out.println(exNum1 + " % " + exNum2 + " = " + (exNum1 % exNum2));
        System.out.println(exNum3 + " / " + exNum1 + " * " + exNum2 + " = " + (exNum3 / exNum1 * exNum2));
        System.out.println();
        
        // 1.09 Additional double Equations
        double exNum4 = 2.1;
        double exNum5 = 10.9;
        double exNum6 = 6.28;
        System.out.println("Additional double Examples");
        System.out.println(exNum5 + " + " + exNum4 + " - " + exNum6 + " = " + (exNum5 + exNum4 - exNum6));
        System.out.println(exNum6 + " / " + exNum4 + " = " + (exNum6 / exNum4));
        System.out.println(exNum4 + " * " + exNum5 + " % " + exNum6 + " = " + (exNum4 * exNum5 % exNum6));
        System.out.println();
               
    } // end of main method
} // end of class