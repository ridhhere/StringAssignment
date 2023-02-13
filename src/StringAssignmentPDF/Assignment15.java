package StringAssignmentPDF;

public class Assignment15 {

	// 15) Write a Java program to find the second most frequent character in a given string
	
	static char frequentCharacter(String input) {
		int[] count = new int[256];
        char maxChar = '0';
        char secondMaxChar = '0';
        
        for (int i = 0; i < input.length(); i++) {
            count[input.charAt(i)]++;
        }
        
        for (int i = 0; i < 256; i++) {
            if (count[i] > count[(int) maxChar]) {
                secondMaxChar = maxChar;
                maxChar = (char) i;
            } else if (count[i] > count[(int) secondMaxChar] && maxChar != i) {
                secondMaxChar = (char) i;
            }
        }
        
        return secondMaxChar;
    }
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(frequentCharacter("timeless"));
	}

}
