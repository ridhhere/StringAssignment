package StringAssignmentPDF;

public class Assignment16 {

	// 16) Write a Java program to print after removing duplicates from a given string
	
	static String replaceDwithF(String input) {
		if (input == null || input.length() == 0) {
            return input;
        }

        int[] frequency = new int[256];
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (frequency[c] == 0) {
                result.append(c);
                frequency[c]++;
            }
        }

        return result.toString();
    }
	
//	In this implementation, we use an array of integers frequency to store 
//	the frequency of each character in the input string. The size of the array 
//	is set to 256, which is the maximum number of characters that can be represented 
//	in the ASCII character set. We use a StringBuilder to store the result after removing duplicates. 
//	Then, for each character in the input string, we check if its frequency is 0 in the frequency array.
//	If it is, we append the character to the StringBuilder and increase its frequency in the frequency array. 
//	Finally, we return the StringBuilder as a string.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(replaceDwithF("dance"));
	}

}
