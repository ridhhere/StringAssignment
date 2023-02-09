package StringAssignmentPDF;

public class Assignment03 {
	// 3) Program to replace the spaces of a string with a specific character
	
	static String replaceSpaceWithCharacter(String input, char inputChar) {
		return input.replace(' ', inputChar);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(replaceSpaceWithCharacter("Ridh Gurung ",'#'));
		System.out.println(replaceSpaceWithCharacter("Welcome to Java",'_'));

	}

}
