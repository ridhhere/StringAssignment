package StringAssignmentPDF;

public class Assignment11 {

	// 11)Program to Find the Largest and Smallest Word in a String

	static void findLargeAndSmall(String input) {
		String[] inputArray = input.split(" ");
		String largeWord = "";
		String smallWord = "";

		if (inputArray.length < 2) {
			System.out.println("Only has one word!");
		} else {
			for (String word : inputArray) {
				if (word.length() > largeWord.length()) {
					largeWord = word;
				}
				if (smallWord.isEmpty() || word.length() < smallWord.length()) {
					smallWord = word;
				}
			}
			System.out.println("Large word: " + largeWord);
			System.out.println("Small word: " + smallWord);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		findLargeAndSmall("ridh man");
		findLargeAndSmall("coupons");
		findLargeAndSmall("Lets test this funcionality and go");

	}

}
