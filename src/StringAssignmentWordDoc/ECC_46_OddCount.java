package StringAssignmentWordDoc;

public class ECC_46_OddCount {
	
	static String getOddCount(int[] input) {
		int count=0;
		int evenCount=0;
		//If array is null then return -4 as string
		if(input==null) {
			return "-4";
		} 
		//The array parameter can be of exact size 5 only, other wize return -1 as string.
		else if(input.length!=5) {
			return "-1";
		}
		for(int i=0;i<input.length;i++) {
			//If any of the array element is 0 or negative then return -2 as string
			if(input[i]<1) {
				return "-2";
			}
			//Checking for odd
			if(input[i]%2!=0) {
				count++;
			} 
			 else {
				evenCount++;
			}
		}
		//If all array elements are even then return -3 as string
		if(evenCount==input.length) {
			return "-3";
		}
		return "Number of odds :" +count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1={1,2,3,4,5};
		int[] array2= {2,4};
		int[] array3= null;
		int[] array4= {1,2,0,3,4};
		int[] array5= {6,2,6,-2,7};
		int[] array6= {6,2,1,2,5,6};



		System.out.println(getOddCount(array1));
		System.out.println(getOddCount(array2));
		System.out.println(getOddCount(array3));
		System.out.println(getOddCount(array4));
		System.out.println(getOddCount(array5));
		System.out.println(getOddCount(array6));





	}

}
