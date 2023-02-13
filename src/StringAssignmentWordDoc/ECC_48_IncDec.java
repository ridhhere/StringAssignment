package StringAssignmentWordDoc;

import java.util.Arrays;

public class ECC_48_IncDec {
	
	static int[] getIncreseDecrease(int input) {
		// Return null if input is 1 or less.
		// Return null if input is more than 20.
		if (input <= 1 || input > 20) {
			return null;
		}

		int[] result = new int[input * 2 - 1];
		int index = 0;
		for (int i = 1; i <= input; i++) {
			result[index++] = i;
			result[result.length - index] = input - i + 1;
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input1 = 0;
		int input2 = 21;
		int input3 = 20;
		int input4 = 12;

		System.out.println(Arrays.toString(getIncreseDecrease(input1)));
		System.out.println(Arrays.toString(getIncreseDecrease(input2)));
		System.out.println(Arrays.toString(getIncreseDecrease(input3)));
		System.out.println(Arrays.toString(getIncreseDecrease(input4)));
	}

}
