package StringAssignmentWordDoc;

public class ECC_56_NameScore {

	static int getNameScore(String name) {
		//Method should work for upper case and lower case 
		name=name.toLowerCase();
		//Return -1, In case given input is null or empty string
		if(name==null||name.isEmpty()) {
			return -1;
		}
		int realValue=0;
		for(int i=0;i<name.length();i++) {
			char ch = name.charAt(i);
			//Return -1, if given name contains special characters or digits
			if(!Character.isLetter(ch)) {
				return -1;
			}
			//converting to ascii then -96 to get real value
			int ascii=ch-96;
			realValue+=ascii;
		}
		return realValue;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getNameScore("dad"));
		System.out.println(getNameScore("abc"));
		System.out.println(getNameScore("ridh"));
		System.out.println(getNameScore("DAD"));
		System.out.println(getNameScore(""));
		System.out.println(getNameScore("&"));
		System.out.println(getNameScore("abc#"));
	}

}
