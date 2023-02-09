package StringAssignmentWordDoc;

public class ESS_50_CricketScores {

	static String getDisplayDetails(int runs, float overs) {
		// converting overs to ball
		int totalBall = (int) (overs * 10);
		int ball = totalBall % 10;
		int over = totalBall / 10;
		float rate = (float) runs / ((float) totalBall / 10.0f);
		if (runs < 100) {
			// if the number of runs required or the number of balls remaining is less than 100 use type (b)
			return runs + " runs in " + totalBall + " balls @ " + String.format("%.2f", rate) + " runs per ball";
		} else {
			//else use type (a)
			return runs + " runs in " + over + "." + ball + " Overs @ " + String.format("%.2f", rate)
					+ " runs per over";
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getDisplayDetails(127, 21));
		System.out.println(getDisplayDetails(56, 48));

	}

}
