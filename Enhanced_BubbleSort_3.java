/**
 * Program Name: Enhanced_BubbleSort_3.java
 * Purpose: Shows the operation of the ENHANCED bubblesort alogorithm in this version
 * we reduce the number of comparisons made on each successive pass by 1
 * the result is we reduce the total number of comparisons by almost 50%
 * Coder: Michael Dearmo 0679488
 * Date: Apr. 3, 2019
 */

public class Enhanced_BubbleSort_3
{

	public static void main(String[] args)
	{
		// create test array in worst possible case scenario...sorted in DESCENDING ORDER
		int [] testArray = {25, 20, 15, 10, 5, 19, 10, 26, 32, 4, 6};
		System.out.println("Starting order of array is ");
		MyToolbox.printArrayContents(testArray);
		System.out.println();
		//add a comparison counter
		int comparison = 0;
		
		for(int ii = 0; ii < testArray.length-1; ii++)
		{
		//do a pass using a loop
		for(int i = 0; i < testArray.length - (ii + 1); i++)
		{
			//increment comparison counter
			comparison ++;
			if(testArray[i] > testArray[i + 1])
			{
				MyToolbox.swapArrayElements(testArray, i, i + 1);
			}
		}
		System.out.println("\nIteration #" + (ii + 1) + " is");
		MyToolbox.printArrayContents(testArray);
		System.out.println();
		
		//report number of comparisons
		System.out.println("\nThe number of comparisons is " + comparison);
		}
	}
	//end main
}
//end class