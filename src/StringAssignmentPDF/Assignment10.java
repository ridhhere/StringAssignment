package StringAssignmentPDF;

public class Assignment10 {
	//10)Program to Find the Frequency of Characters
	
	static void frequenceOfCharacter(String input) {
        //storing in int array
		int[] frequency = new int[256];

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            frequency[ch]++;
        }
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0 && (char) i != ' ') {
                System.out.println((char) i + ": " + frequency[i]);
            }
        }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		frequenceOfCharacter("test string");
	}

}
