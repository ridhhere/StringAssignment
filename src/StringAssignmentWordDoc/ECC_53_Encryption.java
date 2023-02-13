package StringAssignmentWordDoc;

public class ECC_53_Encryption {

	static String encrypt(String input) {
		String plainText = "abcdefghijklmnopqrstuvwxyz";
		String cipherText = "zyxwvutsrqponmlkjihgfedcba";
		StringBuilder result = new StringBuilder();

		for (int i = 0; i < input.length(); i++) {
			char currentChar = input.charAt(i);
			int index = plainText.indexOf(currentChar);
			if (index == -1 || currentChar < 'a' || currentChar > 'z') {
				return null;
			}
			result.append(cipherText.charAt(index));
		}

		return result.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(encrypt("ridh"));
		System.out.println(encrypt("hello"));
		System.out.println(encrypt("#ddd"));
		System.out.println(encrypt("34567"));
	}

}
