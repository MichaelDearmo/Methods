
/*
Program Name: CommodityAnalyzer.java
      Author: Mike Clarkson
        Date: Oct 9, 2017 2:56:32 PM
 Description: This program will analyze the prices of any commodity entered
*/
/*
 PsuedoCode for Commodity Analyzer
 1. import scanner class
 2. create scanner object
 3. title program
 4. ask user for type of commodity
 5. ask user for number of days we will be tracking
 6. ask user for metric to be used
 7. state what program will be doing
 8. set up loop to take in data.
 9. call appropriate methods and capture results in variables
 10.make sure output is limited to two decimal places.  
 11.output the results to the screen. 
 */

import java.util.Scanner;

public class CommodityAnalyzer
{
	public static void main(String[] args)
	{
		//Create scanner object
		Scanner myInput = new Scanner(System.in);
		System.out.println("\n\t\t\tRupinder's Commodity Price Analyzer!");
		System.out.println("\t\t\t************************************\n");
		System.out.print("Please enter the Commodity you will be tracking: ");
		String commodity = myInput.nextLine();
		System.out.print("Please enter the number of days you will be recording " + commodity + " prices: ");
		int numDays = myInput.nextInt();
		//buffer flush
		myInput.nextLine();
		System.out.print("Please enter the metric to be used when tracking " + commodity + ": ");
		String metric = myInput.nextLine();		
		System.out.println("\nThis program will calculate statistics related to " + metric + " of " + commodity + " sold on the world market.\n");
		
		//create an array to hold the prices
		double [] prices = new double[numDays];
		//take in information
		for(int index = 0; index < prices.length; index++)
		{
			System.out.print("Enter price " + (index + 1) + " and press enter: $");
			prices[index] = myInput.nextDouble();
		}		
		
		//calculate results
		double average = CommodityAnalyzer.getAverage(prices);
		double lowest = CommodityAnalyzer.getLowest(prices);
		double highest = CommodityAnalyzer.getHighest(prices);
		double range = CommodityAnalyzer.getRange(prices);
		
		System.out.println("\nHere are the statistics for the " + commodity + " prices entered:\n");
		System.out.println("The average price is $" + average);
		System.out.println("The lowest price is $" + lowest);
		System.out.println("The highest price is $" + highest);
		System.out.println("The range of daily prices is $" + range);
	}

	/*
	    Method Name:  getAverage
	        Purpose:  find the average price of oil
	        Accepts:  double array
	        returns:  double
	 */
	
	public static double getAverage(double [] anArray)
	{
		double runningTotal = 0;
		for(int index = 0; index < anArray.length; index++)
		{
			runningTotal = runningTotal + anArray[index];
		}
		double average = runningTotal/anArray.length;
		average = (int)(average * 100 + .5)/100.0;
		return average;
	}
	
	/*
  Method Name:  getHighest
      Purpose:  find the highest price of oil
      Accepts:  double array
      returns:  double
	*/
	
	public static double getHighest(double [] anArray)
	{
		double highNumber = anArray[0];
		for(int index = 0; index < anArray.length; index++)
		{
			if(highNumber < anArray[index])
			{
				highNumber = anArray[index];
			}
		}
		return highNumber;
	}
	
	/*
  Method Name:  getLowest
      Purpose:  find the lowest price of oil
      Accepts:  double array
      returns:  double
	*/
	
	public static double getLowest(double [] anArray)
	{
		double lowNumber = anArray[0];
		for(int index = 0; index < anArray.length; index++)
		{
			if(lowNumber > anArray[index])
			{
				lowNumber = anArray[index];
			}
		}
		return lowNumber;
	}
	
	/*
  Method Name:  getRange
      Purpose:  find the range of oil prices
      Accepts:  double array
      returns:  double
	*/
	
	public static double getRange(double [] anArray)
	{
		double range = CommodityAnalyzer.getHighest(anArray) - CommodityAnalyzer.getLowest(anArray);
		return (int)(range * 100 + .5)/100.0;
	}
}


