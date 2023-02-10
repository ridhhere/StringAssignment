package StringAssignmentPDF;

public class Assignment13 {

	// 13 Write a Java program to get the character at the given index within the
	// String

	static void charcterAtIndex(String input1, int input2) {
		if (input2 >= input1.length()) {
			System.out.println("Enter value less than : " + input1.length());
		} else {
			System.out.println("Character at index " + input1.length() + " is " + input1.charAt(input2));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		charcterAtIndex("cat", 4);

		charcterAtIndex("Welcome", 3);

	}

}
