package StringAssignmentPDF;

public class Assignment12 {

	// 12)Program to Swap two String Variables Without Using Third or Temp Variable

	static void swapTwoString(String input1, String input2) {

		System.out.println("Before Swapping : " + input1 + " - " + input2);
		// concatenate value
		input1 = input1 + input2;
		input2 = input1.substring(0, input1.length() - input2.length());
		input1 = input1.substring(input2.length());
		System.out.println("After Swapping : " + input1 + " - " + input2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		swapTwoString("Welcome", "Here");

	}

}
