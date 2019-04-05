/**
 * Program Name: Basic_BubbleSort_1.java
 * Purpose: 
 * Coder: Michael Dearmo 0679488
 * Date: Apr. 3, 2019
 */

public class Basic_BubbleSort_1
{

	public static void main(String[] args)
	{
		// create test array in worst possible case scenario...sorted in DESCENDING ORDER
		int [] testArray = {25, 20, 15, 10, 5};
		System.out.println("Starting order of array is ");
		MyToolbox.printArrayContents(testArray);
		System.out.println();
		
		for(int ii = 1; ii < testArray.length; ii++)
		{
		//do a pass using a loop
		for(int i = 0; i < testArray.length - 1; i++)
		{
			if(testArray[i] > testArray[i + 1])
			{
				MyToolbox.swapArrayElements(testArray, i, i + 1);
			}
		}
		System.out.println("\nIteration #" + ii + " is");
		MyToolbox.printArrayContents(testArray);
		System.out.println();
		}
	}
	//end main
}
//end class