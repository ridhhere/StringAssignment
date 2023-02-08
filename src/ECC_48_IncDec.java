
public class ECC_48_IncDec {
	
	static int[] getIncreseDecrease(int input) {
		// Return null if input is 1 or less.
		// Return null if input is more than 20.
		if (input <= 1 || input > 20) {
			return null;
		}
		int[] output = new int[input * 2 - 1];
		int value = 0;
		System.out.println(output.length);
		for (int i = 1; i <= input; i++) {
			output[value++] = i;
			output[value++] = input + 1 - i;
		}
		return output;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int input1 = 1;
//		int input2 = 0;
		int input3 = 20;
		int input4 = 21;
		int input5 = 15;

//		System.out.println(getIncreseDecrease(input1));
//		System.out.println(getIncreseDecrease(input2));
		System.out.println(getIncreseDecrease(input3));{
			sdfsdfds
		}
//		System.out.println(getIncreseDecrease(input4));
//		System.out.println(getIncreseDecrease(input5));


	}

}
