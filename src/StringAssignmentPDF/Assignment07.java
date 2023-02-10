package StringAssignmentPDF;

public class Assignment07 {

	//7) Program to Find Reverse of a String
	
	static String reverseString(String input) {
		String reverse="";
		//using for loop to read it from last char
		for(int i=input.length()-1; i>=0; i--) {
			reverse+=input.charAt(i);
		}
		return reverse;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverseString("ridh"));
		System.out.println(reverseString("welcome"));
	}

}
