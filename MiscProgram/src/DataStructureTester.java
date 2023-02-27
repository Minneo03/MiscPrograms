/**
 * The tester for all of my DataStructure classes, objects, methods, etc.
 * @author Ryan Minneo
 * @version 1.0
 */
public class DataStructureTester 
{
	public static void main(String[] args)
	{
		DataStructure tester = new DataStructure();
		
		System.out.println(tester.checkPalindrome("saippuakivikauppias"));
		System.out.println(tester.checkPalindrome("saippuakivikauppia"));
	}
}
