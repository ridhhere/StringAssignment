package StringAssignmentWordDoc;

public class ECC_51_FibbonacciSeries {

	static String getFibonacciSeries(int input) {
		//Return null, If input is zero or negative
		if(input<=0) {
			return null;
		}
		int[] fibonacci=new int[input];
		fibonacci[0]=0;
		fibonacci[1]=1;
		//Finding the next fibonacci number by Adding two numbers
		for(int i=2; i<input;i++) {
			fibonacci[i]=fibonacci[i-1]+fibonacci[i-2];
		}
		//Using String builder to build new string
		StringBuilder builder=new StringBuilder();
		for(int i=0;i<input-1;i++) {
			//Numbers must be separated by comma.
			builder.append(fibonacci[i] + ",");
		}
		builder.append(fibonacci[input-1]);

		return builder.toString();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getFibonacciSeries(-4));
		System.out.println(getFibonacciSeries(4));
		System.out.println(getFibonacciSeries(9));

	}

}
