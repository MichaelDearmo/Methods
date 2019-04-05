/**
 * Program Name: Basic_Bubble_Sort_Performance_Tester.java
 * Purpose: Tester class to test the efficeny of the basic bubble sort algorithm
 * Coder: Michael Dearmo 0679488
 * Date: Apr. 4, 2019
 */
import java.util.*;
public class Basic_Bubble_Sort_Performance_Tester
{

	public static void main(String[] args)
	{
	//constant for ARRAY_SIZE
		final int ARRAY_SIZE = 500000;
	
	//Create a test array and fill it with randomly generated numbers from 0 to ARRAY_SIZE
		int [] testArray = new int[ARRAY_SIZE];
	for(int i = 0; i < testArray.length; i++)
	{
		testArray[i] = (int)Math.random() * testArray.length;
	}
	
	//Create some variables to do the timing
	long startTime = 0;
	long finishTime = 0;
	double elapsedTime = 0.0;
	
	//Create a date object to hold the start time
	Date start = new Date();
	startTime = start.getTime();//Returns a long value that is the # of milliseconds since Jan 1, 1970
	System.out.println("Value of startTime is " + startTime + " milliseconds since Jan 1, 1970");
	//call the bubble sort method
	MyToolbox.basicBubbleSort(testArray);
	
	//Create a second new object to capture the finish time when the method returns to main()
	Date finish = new Date();
	finishTime = finish.getTime();
	System.out.println("Value of finishTime is " + finishTime + " milliseconds since Jan 1, 1970");
	
	//calculate the elapsed time in seconds and report
	elapsedTime = (finishTime - startTime)/1000.0;//using 1000.0 to avoid integer division and to conver to right number of decimals
	System.out.println("Time taken to sort " + ARRAY_SIZE + " elements was " + elapsedTime + " seconds");
	}
	//end main
}
//end class