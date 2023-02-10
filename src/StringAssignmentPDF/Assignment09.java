package StringAssignmentPDF;

public class Assignment09 {
	//9) Program to Find the Duplicate Words in a String
	
	static void duplicateWord(String input) {
        String[] inputArray = input.split(" ");

		for (int i = 0; i < inputArray.length; i++) {
            int count = 0;
            for (int j = 0; j < inputArray.length; j++) {
                if (inputArray[i].equalsIgnoreCase(inputArray[j])) {
                    count++;
                }
            }
            if (count > 1 && inputArray[i] != " ") {
                System.out.println(inputArray[i] + ": " + count);
                //this will replace the character so its not counted in next run 
                inputArray[i] = inputArray[i].replace(inputArray[i], " ");
            }

        }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		duplicateWord("ridh ridh");
		duplicateWord("I have this and we and we want to want");

	}

}
