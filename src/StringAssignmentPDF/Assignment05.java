package StringAssignmentPDF;

public class Assignment05 {
	// 5) Program to Determine Whether a Given String is Palindrome
	
	static String isPalindrome(String input) {
		StringBuilder reverse = new StringBuilder(input).reverse();
		String new1=reverse.toString();
		return new1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPalindrome("ridh"));
		System.out.println(isPalindrome("A man, a plan, a canal – Panama"));

	}

}
