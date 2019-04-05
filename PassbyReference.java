/**
 * Program Name: PassbyReference.java
 * Purpose: 
 * Coder: Michael Dearmo 0679488
 * Date: Mar. 27, 2019
 */
import java.util.*;
public class PassbyReference
{

	public static void main(String[] args)
	{
		//create an array in scrambled order
		int[] testArray = {45,2,67,6,-94};
		System.out.println("Order of elements in testArray BEFORE sorting is: ");
		MyToolbox.printArrayContents(testArray);
		System.out.println();
		System.out.println("Order of elements in testArray AFTER sorting is: ");
		Arrays.sort(testArray);
		MyToolbox.printArrayContents(testArray);
		
int [] testArray2 = Arrays.copyOf(testArray, 3);
MyToolbox.printArrayContents(testArray2);

	}
	//end main
}
//end class