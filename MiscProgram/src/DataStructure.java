import java.util.Stack;

/**
 * This program is essentially just testing out different Data Structures and seeing how they will work
 * @author Ryan Minneo
 * @version 1.0 - Added First Method checkPalindrome
 */
public class DataStructure 
{
	//Working with Stacks
		/**
		 * This method utilizes a stack to reverse a string and then compares the reverse of the string to the string itself. If the original and reverse of the string are the same, then the string is a palindrome and the method will return true. Otherwise the method will return false.
		 * 
		 * @param str - the input string
		 * @return true/false - true if the string is a palindrome, false otherwise
		 */
		public boolean checkPalindrome(String str)
		{
			Stack<String> stack = new Stack<String>();
			String palindrome = "";
			
			for (int i = 0; i < str.length(); i++)
			{
				stack.push(str.substring(i, i+1));
			}
			
			for (int i = 0; i < str.length(); i++)
			{
				palindrome += stack.pop();
			}
			
			if (palindrome.equals(str)) 
			{
				return true;
			}
			else return false;
		}
}
