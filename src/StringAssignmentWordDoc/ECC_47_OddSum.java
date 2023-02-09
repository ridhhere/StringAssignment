package StringAssignmentWordDoc;

public class ECC_47_OddSum {
	
	static int getOddSum(int[] input) {
		//If array is null then return -4.
		if (input==null) {
			return -4;
		}
		//The array parameter can be of exact size 5 only, otherwise return -1.
		else if(input.length!=5) {
			return -1;
		}
		int count=0;
		int evenCount=0;
		int sum=0;
	
		for(int i=0;i<input.length;i++) {
			//If any of the array element is 0 or negative then return -2 as string
			if(input[i]<1) {
				return -2;
			} 
			//Checking for odd
			else if(input[i]%2!=0) {
				count++;
			}  
			else {
				//checking for even
				evenCount++;
			}
			sum +=count;
		}
		//If all array elements are even then return -3 as string
		if(evenCount==input.length) {
			return -3;
		}
		
						
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1= {1,2,3,4,5,6};
		int[] array2= null;
		int[] array3= {1,2,3,4,5};
		int[] array4= {25,32,4};
		int[] array5= {1,0,3,4,5};
		int[] array6= {-1,9,3,4,5};
		int[] array7= {6,2,8,2,4};




		System.out.println(getOddSum(array1));
		
		System.out.println(getOddSum(array2));
		System.out.println(getOddSum(array3));
		System.out.println(getOddSum(array4));
		System.out.println(getOddSum(array5));

		System.out.println(getOddSum(array6));
		System.out.println(getOddSum(array7));




	}

}
