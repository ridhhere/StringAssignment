package StringAssignmentWordDoc;
import java.util.Arrays;

public class ECC_57_ArrayRowSum {

	static int[] getRowSum(int[][] input) {
		//Return null, If array size is not 3 X 3
		if(input.length !=3 || input[0].length !=3) {
			return null;
		}
		//Return null, If input is null
		if(input==null) {
			return null;
		}
		int[] sum=new int[3];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				sum[i] += input[i][j];
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] array =  {{1, 2, 3}, 
				          {1, 2, 3}, 
				          {1, 2, 3}};
		
		int[][] array1 = {{1, 2, 3}, 
						  {2, 3, 4}, 
						  {2, 2, 2}};
		
		int[][] array2 = {{1, 2}, 
						  {2, 3, 4}, 
						  {2, 2, 2}};
		
		int[][] array3 = null;



	    System.out.println("Row sums: " + Arrays.toString(getRowSum(array)));
	    System.out.println("Row sums: " + Arrays.toString(getRowSum(array1)));
	    System.out.println("Row sums null: " + Arrays.toString(getRowSum(array2)));
//	    System.out.println("Row sums null: " + Arrays.toString(getRowSum(array3))); getting nullpointer exception
	}

}
