package StringAssignmentPDF;

public class Assignment02 {
	//2) Program to replace lower-case characters with upper-case and vice versa
	
	static String changeCase(String input) {
		StringBuilder builder = new StringBuilder();
		for(int i=0; i<input.length(); i++) {
			char ch = input.charAt(i);
			if(Character.isUpperCase(ch)) {
				builder.append(Character.toLowerCase(ch));
			}
			else if(Character.isLowerCase(ch)) {
				builder.append(Character.toUpperCase(ch));
			}
			else {
				builder.append(ch);
			}
		}
		return builder.toString();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(changeCase("riDH"));
		System.out.println(changeCase("RIDH"));
		System.out.println(changeCase("ridh"));


	}

}
