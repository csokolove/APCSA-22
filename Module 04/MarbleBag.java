public class MarbleBag {
    public static void main(String[] args) {
        int purple = 0;
	    int yellow = 0;
	    int drawCount = 0;
	    int totalDraws = 20;
	    double randNum = 0.0;

        while(drawCount < totalDraws)
	    {
            drawCount++;
	    	//Random value between 0.0 (inclusive) and 1.0 (exclusive)
	        randNum = Math.random();
	        System.out.print(drawCount + "\t" + randNum);

	        if(randNum < 0.4)          
	        {
	            purple++;
	            System.out.println("\t purple");
	        }
	        else
	        {
	            yellow++;
	            System.out.println("\t yellow");
	        }
	    }

	    //Output number of purple and yellow stones
	    System.out.println();
	    System.out.println("Number of Purple Stones = " + purple);
	    System.out.println("Number of Yellow Stones = " + yellow);
    }
}
