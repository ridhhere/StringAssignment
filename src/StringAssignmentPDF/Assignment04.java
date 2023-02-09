package StringAssignmentPDF;

public class Assignment04 {
	//4) Program to Count the Total Number of Characters in a String
	
	static int countOfCharacterInString(String input) {
		int size=input.replaceAll(" ", "").length();
		return size;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countOfCharacterInString("Welcome To Java"));
	}

}
