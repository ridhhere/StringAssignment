
public class ESS_50_CricketScores {

	static String getDisplayDetails(int runs,float overs) {
		int oversInt = (int) overs;
        int balls = (int) ((overs - oversInt) * 10);
        float rate = (float) runs / overs;
        if (runs < 100) {
            return runs + " runs in " + (oversInt * 6 + balls) + " balls @ " + String.format("%.2f", rate * 6) + " runs per ball";
        } else {
            return runs + " runs in " + oversInt + "." + balls + " Overs @ " + String.format("%.2f", rate) + " runs per over";
        }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getDisplayDetails(33,20));
		System.out.println(getDisplayDetails(130,20));

	}

}
