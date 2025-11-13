// Computes an approximation of PI.
public class CalcPi {
	public static void main(String[] args) {
		int nTerms = Integer.parseInt(args[0]);
		double finalSum = 0;

		// Iterates n times and determines if it should add or subtract to the total.
		for (int i = 0; i < nTerms; i++) {
			double nextSum = 1.0 / (2 * i + 1);
			nextSum = (i % 2 != 0) ? (nextSum * -1) : nextSum;
			finalSum += nextSum;
		}

		double myPi = finalSum * 4;
		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi, approximated:     " + myPi);
	}
}
