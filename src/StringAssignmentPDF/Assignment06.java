package StringAssignmentPDF;

public class Assignment06 {

	// 6) Program to Find Maximum and Minimum Occurring Character in a String
	
	static void findMaxMinOccurance(String input) {
		int[] frequency = new int[256];
        int maxCount = 0, minCount = Integer.MAX_VALUE;
        char maxChar = ' ', minChar = ' ';

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            frequency[ch]++;
        }

        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0 && frequency[i] > maxCount) {
                maxCount = frequency[i];
                maxChar = (char) i;
            }
            if (frequency[i] > 0 && frequency[i] < minCount) {
                minCount = frequency[i];
                minChar = (char) i;
            }
        }

        System.out.println("Max : " + maxChar + " (" + maxCount + " times)");
        System.out.println("Min : " + minChar + " (" + minCount + " times)");
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		findMaxMinOccurance("reedem");
		findMaxMinOccurance("coupons");

	}

}
