/**
 * Program Name: PrintArrayContents_Tester.java
 * Purpose: tests the printarraycontents() method in my toolbox class
 * Coder: Michael Dearmo 0679488
 * Date: Mar. 21, 2019
 */

import java.util.*;
public class PrintArrayContents_Tester_1A
{

	public static void main(String[] args)
	{
	Scanner myInput = new Scanner(System.in);
	
		// create an array with 50 numbers sing the loop counter
		int[]testArray = new int[99];
		for (int i = 0; i < testArray.length; i++)
		{
			testArray[i] = i+1;
		}
		MyToolbox.printArrayContents(testArray);
		System.out.println();
		System.out.println(MyToolbox.sumArrayContents(testArray));
		MyToolbox.calcArrayAverage(testArray);
		System.out.println();
		System.out.println(MyToolbox.calcArrayAverage(testArray));
		
		//create second array of type double and fill it using the same for loop structure
		double [] doubleArray = new double[100];
		for (int i = 0; i < doubleArray.length; i++)
		{
			doubleArray[i] = i+1;
		}
		System.out.println("The values in the double array are: \n");
		MyToolbox.printArrayContents(doubleArray);
		MyToolbox.calcArrayAverage(doubleArray);
		System.out.println();
		System.out.println(MyToolbox.calcArrayAverage(doubleArray));
		
		//test the version allowing user to specify how many values per line
		//re use the array of type int
		System.out.print("\n\nPlease enter the amount of values per line ");
		int numValuesPerLine = myInput.nextInt();
  System.out.println("\n\nValues in the intArray with " + numValuesPerLine + " values per line ");
  MyToolbox.printArrayContents(testArray, numValuesPerLine);
}
}
//end class