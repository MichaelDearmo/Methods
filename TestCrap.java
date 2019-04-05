

/**
 * Program Name: TestCrap.java
 * Purpose: 
 * Coder: Michael Dearmo 0679488
 * Date: Mar. 22, 2019
 */
import java.util.*;
public class TestCrap
{

	public static void main(String[] args)
	{
	int [] myArray = {2,4,6,8};
	MyToolbox.reverseArrayElements2(myArray);
	MyToolbox.printArrayContents(myArray);
	String word = "madam, i'm adam";
	System.out.println();
	boolean answer = MyToolbox.isPalindromicWord2(word);
	System.out.println(answer);
	
	}
	//end main
}
//end class