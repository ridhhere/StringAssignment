package StringAssignmentPDF;

public class Assignment05 {
	// 5) Program to Determine Whether a Given String is Palindrome
	
	static String isPalindrome(String input) {
		StringBuilder reverse = new StringBuilder(input).reverse();
		String new1=reverse.toString();
		if(input.equalsIgnoreCase(new1)) {
			return "Is Palindrom : "+ new1;
		} else {
			return "Not Palindrom : " + new1;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPalindrome("ridh"));
		System.out.println(isPalindrome("welcome"));
		System.out.println(isPalindrome("racecar"));
		System.out.println(isPalindrome("civic"));
		System.out.println(isPalindrome("noon"));
		System.out.println(isPalindrome("level"));

	}

}
