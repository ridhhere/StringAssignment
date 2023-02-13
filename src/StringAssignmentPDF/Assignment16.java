package StringAssignmentPDF;

public class Assignment16 {

	// 16) Write a Java program to print after removing duplicates from a given string
	
	static String removeDulplicate(String input) {
		if (input == null || input.length() == 0) {
            return input;
        }
		
		//Using int array to store the frequency
        int[] frequency = new int[256];
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (frequency[ch] == 0) {
                result.append(ch);
                frequency[ch]++;
            }
        }

        return result.toString();
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(removeDulplicate("mime"));
		System.out.println(removeDulplicate("school"));
		System.out.println(removeDulplicate("Hello"));


	}

}
