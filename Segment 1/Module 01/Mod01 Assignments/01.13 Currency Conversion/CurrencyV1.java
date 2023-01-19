/**
 * The Currency class converts an amount of money from a specific
 * country into the equivalent currency of another country given 
 * the current exchange rate.
 *
 * @author Charles Sokolove
 * @version 11/01/22
 */
public class CurrencyV1 {
	static double balance = 6500; // in USD
	public static void logExpenditures(String country, String currency, double amountSpent, double exchangeRateInUsd) {
		// formatting
		String formattedCountry = country.substring(0, 1).toUpperCase() + country.substring(1).toLowerCase().trim();
		String formattedCurrency = currency.substring(0, 1).toUpperCase() + currency.substring(1).toLowerCase().trim();


		double dollarsSpent = amountSpent * exchangeRateInUsd;
		balance -= dollarsSpent;

		System.out.println(formattedCountry + ":");
		System.out.println(" " + formattedCurrency + " spent: " + amountSpent);
		System.out.println(" " + "US dollars equivalent: " + dollarsSpent);
		System.out.println(" " + "US dollars remaining: " + balance);
		System.out.println();
	}

    public static void main(String[] args) {
        // Message to user stating purpose
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("This program converts an amount of money");
        System.out.println("from a specific country into the equivalent");
        System.out.println("currency of another country given the current");
        System.out.println("exchange rate.");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println();
		System.out.println("Starting US dollars: " + balance);
		System.out.println();

        // Conversion
        // code goes below here
		logExpenditures("England", "Pounds", 500.00, 1.15);
		logExpenditures("Italy", "Euros", 762.24, 0.99);
		logExpenditures("Morocco", "Dirham", 2733.65, 0.091);

		System.out.println("Ending US dollars: " + balance);
        // Complete the code below for Souvenir Purchases
 		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Souvenir Purchases");
		System.out.println(" (all values in US Dollars) ");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

		//Calculations for Souvenir #1
		int costItem1 = 15;  						//cost per item of first souvenir
		int budget1 = 200;   						//budget for first item
		int totalItems1 = budget1 / costItem1; 		//how many items can be purchased
		int fundsRemaining1 = budget1 % costItem1;  //how much of the budget is left

		System.out.println("Item 1");
		System.out.println("   Cost per item: $" + costItem1 );
		System.out.println("   Budget: $"+ budget1);
		System.out.println("   Total items purchased: " +  totalItems1);
		System.out.println("   Funds remaining: $"  +  fundsRemaining1);
     	System.out.println();

		//Calculations for Souvenir #2
		double costItem2 = 34.28;  						//cost per item of second souvenir
		int budget2 = 750;   							//budget for second item
		int totalItems2 = (int) (budget2 / costItem2); 	//how many items can be purchased
		double fundsRemaining2 = (double) (budget2 % costItem2);	//how much of the budget is left
		System.out.println("Item 2");
		System.out.println("   Cost per item: $" + costItem2 );
		System.out.println("   Budget: $"+ budget2);
		System.out.println("   Total items purchased: " +  totalItems2);
		System.out.println("   Funds remaining: $"  +  fundsRemaining2);

    } // end of main method
} // end of class

