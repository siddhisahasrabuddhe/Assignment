package assignment;

public class Palindrome {

	public static void main(String[] args) {
		
		 int n = 656, revNum = 0, rem, originalNum;

	        originalNum = n;

	        // reversed integer is stored in variable 
	        while( n != 0 )
	        {
	            rem = n % 10;
	            revNum = revNum * 10 + rem;
	            n= n/10;
	        }

	        // palindrome if orignalInteger and reversedInteger are equal
	        if (originalNum == revNum)
	            System.out.println(originalNum + " is a palindrome.");
	        else
	            System.out.println(originalNum + " is not a palindrome.");

	}

}
