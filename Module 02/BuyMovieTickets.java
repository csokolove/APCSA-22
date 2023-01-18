import java.util.Scanner;

/**
 * A program used to simulate buying movie tickets.
 * 
 * @author Charles Sokolove
 * @version 01/17/2023
 */
public class BuyMovieTickets {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Hello and welcome!");

        System.out.print("Please enter your first and last name: ");
        String name = in.nextLine();
        String[] parsedName = name.split(" "); // Separate first + last name
        
        System.out.print("Enter today's date (mm/dd/yyyy): ");
        String date = in.nextLine();
        String formattedDate = date.replace('/', '-'); // Format the date to mm-dd-yyyy

        System.out.print("What movie would you like to see? ");
        String movie = in.nextLine();

        System.out.print("How many tickets? ");
        int quantity = Integer.parseInt(in.nextLine()); // Convert quantity to an integer for math

        System.out.print("What is the ticket price? ");
        String price = in.nextLine();
        double formattedPrice = Double.parseDouble(price.replace("$", "")); // Convert price to a double for math + remove the $ symbol if applicable

        System.out.print("Enter your credit/debit card number (#####-###-####): ");
        String cardNumber = in.nextLine();
        String[] parsedCardNumber = cardNumber.split("-");
        while((parsedCardNumber.length != 3) || (parsedCardNumber[0].length() != 5 || parsedCardNumber[1].length() != 3 || parsedCardNumber[2].length() != 4)) { // Check that the card is valid
            System.out.println("Invalid credit/debit card number.");
            System.out.print("Enter your credit/debit card number (#####-###-####): ");
            cardNumber = in.nextLine();
            parsedCardNumber = cardNumber.split("-");
        }

        System.out.print("Enter your PIN (#####): ");
        String pinNumber = in.nextLine();
        while(pinNumber.length() != 5) { // Check that the pin is valid
            System.out.println("Invalid pin number.");
            System.out.print("Enter your PIN (#####): ");
            pinNumber = in.nextLine();
        }

        in.close();

        String orderNumber = parsedName[1].substring(1, 3) + parsedCardNumber[1]; // Dynamically generate an order number using last name + card number

        System.out.println("********************************************");        
        System.out.println("Your e-Receipt\n");
        
        System.out.println(formattedDate);
        System.out.println("Order number: " + orderNumber + "\n");
        
        System.out.println(" " + parsedName[0].substring(0, 1) + ". " + parsedName[1]);
        System.out.println(" Account: #####-###-" + parsedCardNumber[2]);
        System.out.println(" Movie: " + movie);
        System.out.println(" Number of Tickets: " + quantity);
        System.out.println(" Ticket Price: " + formattedPrice + "\n");
        
        System.out.println(" $" + (formattedPrice * quantity) + " will be charged to your account.\n");
        
        System.out.println(" Thank you. Enjoy your movie today!");
        System.out.println("********************************************");
    }
}
