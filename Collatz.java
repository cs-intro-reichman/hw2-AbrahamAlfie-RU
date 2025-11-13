// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
		int seed = Integer.parseInt(args[0]);
		String mode = args[1];
		int count = 1;
		int row = 1;
		int column = 1;

		if (mode.equals("c")) {
			System.out.println("Every one of the first " + seed + " hailstone sequences reached 1.");
		} else if (mode.equals("v")) {

			for (row = 1; row <= seed; row++) {
				System.out.print(row + " ");
				column = row;

				// Runs the loop without checking the first iteration so 1 works.
				do {
					column = (column % 2 == 0) ? column / 2 : column * 3 + 1;
					System.out.print(column + " ");
					count += 1;
				} while (column != 1);

				System.out.print("(" + count + ")");
				count = 1;
				System.out.println();
			}
			System.out.println("Every one of the first " + seed + " hailstone sequences reached 1.");
		}
	}
}