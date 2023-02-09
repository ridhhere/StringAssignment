package StringAssignmentWordDoc;

public class ECC_55_MajorMinor {

	static boolean isMajor(int gender,int age) {
		if(gender==1 && age>=21) {
			return true;
		} else if(gender==2 && age>=18) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Expected - False : Actual - "+isMajor(2,17));//female 17 -false
		System.out.println("Expected - True : Actual - "+isMajor(2,18));//female 18 -true
		System.out.println("Expected - True : Actual - "+isMajor(2,40));//female 40 -true
		System.out.println("Expected - False : Actual - "+isMajor(1,20));//male 17 -false
		System.out.println("Expected - True : Actual - "+isMajor(1,21));//male 18 -true
		System.out.println("Expected - True : Actual - "+isMajor(1,50));//male 40 -true


	}

}
