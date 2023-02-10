package StringAssignmentPDF;

public class Assignment15 {

	// 15) Write a Java program to find the second most frequent character in a given string
	
	static String replaceDwithF(String input) {
		if (input == null || input.length() < 2) {
            return null;
        }

        int[] frequency = new int[256];
        for (int i = 0; i < input.length(); i++) {
            frequency[input.charAt(i)]++;
        }

        int max1 = 0, max2 = 0;
        char char1 = '\0', char2 = '\0';
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > max1) {
                max2 = max1;
                char2 = char1;
                max1 = frequency[i];
                char1 = (char) i;
            } else if (frequency[i] > max2 && frequency[i] != max1) {
                max2 = frequency[i];
                char2 = (char) i;
            }
        }

        return char2;
    }
	
//	In this implementation, we use an array of integers frequency to store the frequency of each character in the input string.
//	The size of the array is set to 256, which is the maximum number of characters that can be represented in the ASCII character set. 
//	Then, we use two variables max1 and max2 to store the frequencies of the first and second most frequent characters, respectively. 
//	Finally, we use two variables char1 and char2 to store the characters corresponding to the first and second most frequent frequencies, 
//	respectively. After iterating through the frequency array, we return char2, which is the second most frequent character in the input string.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(replaceDwithF("dance"));
	}

}
