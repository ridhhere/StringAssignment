package StringAssignmentWordDoc;

public class ECC_52_Fibonacci_NthTerm {

	static int getNthTermOfFibonacci(int input) {
		//Return -1, If input is zero or negative.
		if(input<=0) {
			return -1;
		}
		int firstNum = 0;
	    int secondNum = 1;
	    int sum =0;
	    //The loop starts at 3
	    //For loop stops after nth number
	    for (int i = 3; i <= input; i++) {
	        sum=firstNum+secondNum;
	        firstNum=secondNum;
	        secondNum=sum;
	    }
	    return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getNthTermOfFibonacci(-4));
		System.out.println(getNthTermOfFibonacci(7));
		System.out.println(getNthTermOfFibonacci(4));


	}

}
