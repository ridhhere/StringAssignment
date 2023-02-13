package StringAssignmentWordDoc;

public class ECC_54_Decryption {

	static String decrypt(String input) {
		String plainText = "abcdefghijklmnopqrstuvwxyz";
		String cipherText = "zyxwvutsrqponmlkjihgfedcba";
		StringBuilder result = new StringBuilder();

		for (int i = 0; i < input.length(); i++) {
			char currentChar = input.charAt(i);
			int index = cipherText.indexOf(currentChar);
			if (index == -1 || currentChar < 'a' || currentChar > 'z') {
				return null;
			}
			result.append(plainText.charAt(index));
		}

		return result.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(decrypt("irws"));
		System.out.println(decrypt("svool"));
		System.out.println(decrypt("#ddd"));
		System.out.println(decrypt("34567"));
	}

}
