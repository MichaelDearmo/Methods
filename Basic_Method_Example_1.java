/**
 * Program Name: Basic_Method_Example_1.java
 * Purpose: shows the creation of a method below the main() method of a class
 * Coder: Michael Dearmo 0679488
 * Date: Mar. 20, 2019
 */

public class Basic_Method_Example_1
{

	public static void main(String[] args)
	{
		int numOne = 5;
		int numTwo = 8;
		int numThree = 0;
		
		System.out.println("Now calling the method addTwoInts....");
	  int total = addTwoInts(numOne, numTwo);
	  System.out.println(total);

	}
	//end main
	
	/*
	 * Method name: addTwoInts()
	 * Purpose: a public class method that will add two int values
	 * accepts: two int arguments or parameters
	 * returns: an int value that is the sum of the two arguments
	 */
	
	public static int addTwoInts(int a, int b)
	{
		return a + b;
	}
	
	
	
}
//end class