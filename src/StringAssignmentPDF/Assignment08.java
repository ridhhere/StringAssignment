package StringAssignmentPDF;

public class Assignment08 {
	//8) Program to Find the Duplicate Characters in a String
	
	static void duplicateCharacter(String input) {
		for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            int count = 0;
            for (int j = 0; j < input.length(); j++) {
                if (ch == input.charAt(j)) {
                    count++;
                }
            }
            if (count > 1 && ch != ' ') {
                System.out.println(ch + ": " + count);
                //this will replace the character so its not counted in next run 
                input = input.replace(ch, ' ');
            }

        }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		duplicateCharacter("rridhh");
		duplicateCharacter("rrridh");

	}

}
