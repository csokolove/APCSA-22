import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Scanner;

/**
 * Write a description of class BuyBaseballTickets here.
 *
 * @author Charlie Sokolove
 * @version 11/04/2022
 */
public class BuyBaseballTickets {
    public static void out() {
        System.out.println();
    }

    public static void out(String x) {
        System.out.println(x);
    }

    public static void out(String x, boolean inline) {
        if(inline) {
            System.out.print(x);
        } else {
            out(x);
        }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        out("Good Evening.");
        out("Please enter your first and last name: ", true);
        String name = input.nextLine();
        out("When would you like to go (mm/dd/yyyy)? ", true);
        String gameDate = input.nextLine();
        out("What team would you like to see? ", true);
        String team = input.nextLine();
        out("How many tickets would you like? ", true);
        String quantity = input.nextLine();
        out("Enter your debit card number (#####-###-####): ", true);
        String cardNum = input.nextLine();
        out("Enter your PIN (#####): ", true);
        String pin = input.nextLine();
        out();

        Date todaysDate = new Date();
        String dateFormatString = "MM/DD/YYYY";
        DateFormat dateFormat = new SimpleDateFormat(dateFormatString);
        String currentDate = dateFormat.format(todaysDate);

        String parsedName[] = name.split(" ");

        out("***************Order Confirmation***************");
        out();
        out(parsedName[0].substring(0, 1) + " " + parsedName[1]);
        out(currentDate);
        out("Order ID: " + parsedName[0].substring(0, 1) + parsedName[1].substring(0, 1) + );
        out();
        
        out(" Game date: " + gameDate);
        out(" ");

    }
}
