/**
 * Program Name: MyToolbox.java
 * Purpose: This is our very own "HELPER" or "UTILITY" class that just holds a bunch of methods
 * 					that do various things.
 * Coder: Michael Dearmo 0679488
 * Date: Mar. 20, 2019
 * 
 /* 
 /* Method Name: <br>
 * Purpose: <br>
 * Accepts: <br>
 * Returns: <br>
 * Coder: Mike Dearmo
 * Date: 
 */

public class MyToolbox
{
	 /* 
	 * Method Name: printArrayContents()
	 * Purpose: a public class method that prints out the contents of the submitted array
	 * 					putting 10 values on each line
	 * Accepts: an array of type int
	 * Returns: Nothing! void method.
	 * Coder: Mike Dearmo
	 * Date: March 20th 2019
	 */
	public static void printArrayContents (int [] array)
	{
		for(int i = 0; i < array.length; i++)
		{
			if(i % 10 == 0)
			{
			//System.out.println();
			}
		System.out.print(array[i] + " ");
		}
	}
	 /* 
	 * Method Name: printArrayContents() Overloaded for type double
	 * Purpose: a public class method that prints out the contents of the submitted array
	 * 					putting 10 values on each line
	 * Accepts: an array of type double
	 * Returns: Nothing! void method.
	 * Coder: Mike Dearmo
	 * Date: March 20th 2019
	 */
	public static void printArrayContents (double [] array)
	{
		for(int i = 0; i < array.length; i++)
		{
			if(i % 10 == 0)
			{
			System.out.println();
			}
		System.out.print(array[i] + " ");
		}
	}
	 /* 
	 * Method Name: printArrayContents() Overloaded for type char
	 * Purpose: a public class method that prints out the contents of the submitted array
	 * 					putting 10 values on each line
	 * Accepts: an array of type char
	 * Returns: Nothing! void method.
	 * Coder: Mike Dearmo
	 * Date: March 20th 2019
	 */
	public static void printArrayContents (char [] array)
	{
		for(int i = 0; i < array.length; i++)
		{
			if(i % 10 == 0)
			{
			System.out.println();
			}
		System.out.print(array[i] + " ");
		}
	}
	 /* 
	 * Method Name: printArrayContents() Overloaded for type String
	 * Purpose: a public class method that prints out the contents of the submitted array
	 * 					putting 10 values on each line
	 * Accepts: an array of type String
	 * Returns: Nothing! void method.
	 * Coder: Mike Dearmo
	 * Date: March 20th 2019
	 */
	public static void printArrayContents (String [] array)
	{
		for(int i = 0; i < array.length; i++)
		{
			if(i % 10 == 0)
			{
			System.out.println();
			}
		System.out.print(array[i] + " ");
		}
	}
	 /* 
	 * Method Name: printArrayContents() Overloaded for type double
	 * Purpose: a public class method that prints out the contents of the submitted array
	 * 					putting a user specified number of values on each line
	 * Accepts: an array of type int and an int value specifying how many characters per line
	 * Returns: Nothing! void method.
	 * Coder: Mike Dearmo
	 * Date: March 20th 2019
	 */
	public static void printArrayContents (int [] array, int valuesPerLine)
	{
		for(int i = 0; i < array.length; i++)
		{
			if(i % valuesPerLine == 0)
			{
			System.out.println();
			}
		System.out.println(array[i] + " ");
		}
	}
	 /* Method Name: sumArrayContents <br>
	 * Purpose: a public class method that sums up the contents of a numeric type array <br>
	 * Accepts: an array of type int <br>
	 * Returns: returns an int value that is the sum of all the values in the array <br>
	 * Coder: Mike Dearmo
	 * Date: March 22, 2019
	 */
	public static int sumArrayContents(int [] Array)
	{
		int sum = 0;
		for(int i = 0; i < Array.length; i++)
		{
			sum += Array[i];
		}
		return sum;
	}	 /* Method Name: sumArrayContents <br>
	 * Purpose: a public class method that sums up the contents of a numeric type array <br>
	 * Accepts: an array of type int <br>
	 * Returns: returns an int value that is the sum of all the values in the array <br>
	 * Coder: Mike Dearmo
	 * Date: March 22, 2019
	 */
	public double sumArrayContents(double [] Array)
	{
		double sum = 0;
		for(int i = 0; i < Array.length; i++)
		{
			sum += Array[i];
		}
		return sum;
	}
	
	 /* Method Name: calcArrayAverage <br>
	 * Purpose: a public class method that calculates the average of all numeric values in an array<br>
	 * Accepts: an array of type double<br>
	 * Returns: an int value that is the average of the values in an array<br>
	 * Coder: Mike Dearmo
	 * Date: March 22, 2019
	 */
	public static double calcArrayAverage(int [] Array)
	{
		double sum = 0;
		double average = 0;
		for(int i = 0; i < Array.length; i++)
		{
			sum += Array[i];
		}
		average = sum / Array.length;
		return average;
	}
	 /* Method Name: calcArrayAverage <br>
	 * Purpose: a public class method that calculates the average of all numeric values in an array<br>
	 * Accepts: an array of type double<br>
	 * Returns: a double value that is the average of the values in an array<br>
	 * Coder: Mike Dearmo
	 * Date: March 22, 2019
	 */
	public static double calcArrayAverage(double [] Array)
	{
		double sum = 0;
		double average = 0;
		for(int i = 0; i < Array.length; i++)
		{
			sum += Array[i];
		}
		average = sum / Array.length;
		return average;
	}
	 /* Method Name: roundtoTwoPlaces<br>
	 * Purpose: Round a number to 2 places<br>
	 * Accepts: a double<br>
	 * Returns: a double rounded to two decimal places<br>
	 * Coder: Mike Dearmo
	 * Date: 
	 */
	public static double roundToTwoPlaces(double rounded)
	{
		double numberRounded = Math.round(rounded * 100.0)/100.0;
		return numberRounded;
	}
	 /* Method Name: roundOff<br>
	 * Purpose: Takes in a double value and rounds it to a user specified number of decimal places<br>
	 * Accepts: a double value and an int value<br>
	 * Returns: a double value rounded to a specified amount of decimal spaces<br>
	 * Coder: Mike Dearmo
	 * Date: 
	 */
	public static double roundOff(double number, int roundPlaces)
	{
		double decimalPlaces = Math.pow(10, roundPlaces);
		return Math.round(number * decimalPlaces) / decimalPlaces;
	}
	 /* Method Name: copyArray()<br>
	 * Purpose: a public class method that makes a copy of a submitted array<br>
	 * Accepts: an array of type int<br>
	 * Returns: an array of type int aht is a copy of the original <br>
	 * Coder: Mike Dearmo
	 * Date: 
	 */
	public static int[] copyArray(int[]array)
	{
		int [] copiedArray = new int[array.length];
		//copy the values from parameter array to copy array
		for(int i = 0; i < array.length; i++)
		{
			copiedArray[i] = array[i];
		}
		return copiedArray;
	}
	 /* Method Name: copyArray()<br>
	 * Purpose: a public class method that makes a copy of a submitted array<br>
	 * Accepts: an array of type double<br>
	 * Returns: an array of type double that is a copy of the original <br>
	 * Coder: Mike Dearmo
	 * Date: 
	 */
	public static double[] copyArray(double[]array)
	{
		double [] copiedArray = new double[array.length];
		//copy the values from parameter array to copy array
		for(int i = 0; i < array.length; i++)
		{
			copiedArray[i] = array[i];
		}
		return copiedArray;
	}
	 /* Method Name: copyArray()<br>
	 * Purpose: a public class method that makes a copy of a submitted array<br>
	 * Accepts: an array of type String<br>
	 * Returns: an array of type String that is a copy of the original <br>
	 * Coder: Mike Dearmo
	 * Date: 
	 */
	public static String[] copyArray(String[]array)
	{
		String [] copiedArray = new String[array.length];
		//copy the values from parameter array to copy array
		for(int i = 0; i < array.length; i++)
		{
			copiedArray[i] = array[i];
		}
		return copiedArray;
	}
	 /* Method Name: calcMedianArray<br>
	 * Purpose: a public class method that calculates the median value in the submitted array<br>
	 * Accepts: an array of type int<br>
	 * Returns: double <br>
	 * Coder: Mike Dearmo
	 * Date: 
	 */
	public static double calcMedianArray(int [] array)
	{
		//make a copy and work on it instead of the original
		int[]copiedArray = copyArray(array);
		//sort the array
		java.util.Arrays.sort(copiedArray);
		//determine if the # of elements is ODD or EVEN and process as necessary
		if(copiedArray.length % 2 == 0)
		{
			int rightMiddleElementIndex = copiedArray.length / 2;
			int leftMiddleElementIndex = rightMiddleElementIndex - 1;
		
			//add the two values
			double median = (copiedArray[rightMiddleElementIndex] + copiedArray[leftMiddleElementIndex]) / 2.0;
			return median;
		}
		else
		{
			return copiedArray[copiedArray.length /2];
		}
	}
	 /* Method Name: swapArrayElements()<br>
	 * Purpose: a public class method that will swap the values of any two elements in an array<br>
	 * Accepts: an array of type int and two int values that are the indexes of the elements to be swapped<br>
	 * Returns: nothing. void method<br>
	 * Coder: Mike Dearmo
	 * Date: 
	 */
	public static void swapArrayElements(int[]array,int elementOne, int elementTwo)
	{
		int temp = array[elementOne];
		array[elementOne] = array[elementTwo];
		array[elementTwo] = temp;
	}
	public static void swapArrayElements(char[]array,int elementOne, int elementTwo)
	{
		char temp = array[elementOne];
		array[elementOne] = array[elementTwo];
		array[elementTwo] = temp;
	}
	 /* Method Name: reverseArrayElements()<br>
	 * Purpose: a public class method that will reverse the order of elements in an array<br>
	 * Accepts: an array of type int<br>
	 * Returns: an array of type int with the elements in reversed order<br>
	 * Coder: Mike Dearmo
	 * Date: 
	 */
	public static int[] reverseArrayElements(int[] array)
	{
		//step 1: make an array to hold the reversed values
		int[]reversedArray = new int[array.length];
		//step 2: for loop with a little piece of ELEGANT code
		for(int i = 0; i < array.length; i++)
		{
			reversedArray[i] = array[(array.length - 1) - i];
		}
		return reversedArray;
	}
	 /* Method Name: reverseArrayElements2() <br>
	 * Purpose: a public class method that will reverse the order of elements in the original array <br>
	 * Accepts: an array of type int<br>
	 * Returns: nothing works on the real array <br>
	 * Coder: Mike Dearmo
	 * Date: 
	 */
	public static void reverseArrayElements2(int[] array)
	{
 //use a loop and make calls to swapArrayElements
		for(int i = 0; i < array.length/2; i++)
		{
			MyToolbox.swapArrayElements(array, i, array.length -1 - i);
		}
	}
	 /* Method Name: reverseArrayElements2() Overloaded for type char arrays<br>
	 * Purpose: a public class method that will reverse the order of elements in the original array <br>
	 * Accepts: an array of type char<br>
	 * Returns: nothing works on the real array <br>
	 * Coder: Mike Dearmo
	 * Date: 
	 */
	public static void reverseArrayElements2(char[] array)
	{
 //use a loop and make calls to swapArrayElements
		for(int i = 0; i < array.length/2; i++)
		{
			MyToolbox.swapArrayElements(array, i, array.length  -1 - i);
		}
	}
	 /* Method Name: isPalindromicWord() <br>
	 * Purpose: determines if a submitted String is actually a palindromic word, in which
	 * the order of the characters reads the same in either directions<br>
	 * Accepts: an array of type String<br>
	 * Returns: Boolean<br>
	 * Coder: Mike Dearmo
	 * Date: 
	 */
	public static boolean isPalindromicWord(String word)
	{
		boolean answer = false;
		word = word.toLowerCase();
		char [] charArray = word.toCharArray();	
		MyToolbox.reverseArrayElements2(charArray);
		String reversedString = new String(charArray);
		if(word.contentEquals(reversedString))
		{
			answer = true;
		}
		else
		{
			answer = false;
		}
		return answer;
	}
	public static boolean isPalindromicWord2(String phrase)
	{
		//Step 1: SANITIZE the phrase to remove any spaces or punctuation characters
		StringBuffer sanitizedPhrase = new StringBuffer();
		
		//create a character class object to hold each character of the phrase for testing
		Character charToAppend;
		//Use a loop to analyze each character in the phrase. If it is a 
		for (int i = 0; i < phrase.length(); i++)
		{
			charToAppend = phrase.charAt(i);
			if(Character.isLetter(charToAppend))
			{
				sanitizedPhrase.append(charToAppend);
			}
		}
		//Step 3. We now have a sanitized Phrase in the stringbuffer objet. use it to create a reversed string
		String sanitizedString = new String(sanitizedPhrase);
		//step 4: pass the santized string to the isPalindromicWord() method to test it
		return MyToolbox.isPalindromicWord(sanitizedString);
	}
	 /* Method Name: basicBubbleSort() <br>
		 * Purpose: does a basic bubble sort
		 * Accepts: an array of type int<br>
		 * Returns: Nothing! void this method will do its work on the real McCoy<br>
		 * Coder: Mike Dearmo
		 * Date: 
		 */
	public static void basicBubbleSort(int [] testArray)
	{
		for(int ii = 0; ii < testArray.length - 1; ii++)
		{
		//do a pass using a loop
		for(int i = 0; i < testArray.length - 1; i++)
		{
			if(testArray[i] > testArray[i + 1])
			{
				MyToolbox.swapArrayElements(testArray, i, i + 1);
			}
	}
}
	}
	public static void enhancedBubbleSort(int [] testArray)
	{
		for(int ii = 0; ii < testArray.length; ii++)
		{
		//do a pass using a loop
		for(int i = 0; i < testArray.length - (ii + 1); i++)
		{
			if(testArray[i] > testArray[i + 1])
			{
				MyToolbox.swapArrayElements(testArray, i, i + 1);
			}
	}
}
	}
	 /* Method Name: ShortBubbleSort() <br>
		 * Purpose: does a basic bubble sort
		 * Accepts: an array of type int<br>
		 * Returns: Nothing! void this method will do its work on the real McCoy<br>
		 * Coder: Mike Dearmo
		 * Date: 
		 */
	public static void shortCircuitBubbleSort(int[]testArray)
	{
	
int swapCounter = 0;
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
				swapCounter ++;
				MyToolbox.swapArrayElements(testArray, i, i + 1);
			}
		}
		//Revision: check the swap counter
		if(swapCounter == 0)
		{
		break;
		}
	}
}
}
//end class