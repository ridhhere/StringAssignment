
public class ECC_49_FindMax {
	
	static int findMax(int[] input) {
		//Return 0 if input array is null
		if(input==null) {
			return 0;
		}
		int countNegative=0;
		int max=0;
		for(int num:input) {
			if(num<0) {
				countNegative++;
			}
			if(num>max) {
				max=num;
			}
		}
		//Return -1 if input is not containing atleast 3 negative numbers.
		if(countNegative<3) {
			return -1;
		}
		return max;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1= {1,2,3,-3,-6,-6};
		int[] array2= {1,2,3,3,-6,-6};
		int[] array3= null;

		System.out.println(findMax(array1));
		System.out.println(findMax(array2));
		System.out.println(findMax(array3));

	}

}
