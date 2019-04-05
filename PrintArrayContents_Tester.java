/**
 * Program Name: PrintArrayContents_Tester.java
 * Purpose: tests the printarraycontents() method in my toolbox class
 * Coder: Michael Dearmo 0679488
 * Date: Mar. 21, 2019
 */

public class PrintArrayContents_Tester
{

	public static void main(String[] args)
	{
		// create an array with 50 numbers sing the loop counter
		int[]testArray = new int[50];
		for (int i = 0; i < testArray.length; i++)
		{
			testArray[i] = i+1;
		}
		MyToolbox.printArrayContents(testArray);
	//end main
}
}
//end class