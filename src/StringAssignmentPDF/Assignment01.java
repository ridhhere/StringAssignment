package StringAssignmentPDF;

public class Assignment01 {
	//1) Program to remove all the white spaces from a string
	
	static String removeWhiteSpace(String input) {
		return input.replaceAll(" ", "") ;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(removeWhiteSpace(" s t r i n g "));
	}

}
