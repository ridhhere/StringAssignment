package StringAssignmentPDF;

public class Assignment14 {

	// 14) Write a Java program to replace all the 'd' characters with 'f'
	
	static String replaceDwithF(String input) {
		String output="";
		char[] ch = input.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == 'd') {
                ch[i] = 'f';
            }
        }
        output = new String(ch);
        return output;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(replaceDwithF("dance"));
	}

}
