
public class Assignment7 {

	public static void main(String[] args) {

		for (int i = 0; i <= 200; i++) {
			if (i % 2 != 0) {
				System.out.print(i);
				if (i != 199)
					System.out.print(",");
			}
		}

		System.out.println("\n");

		int outerLoop = 0, innerLoop = 0, number = 6;

		for (outerLoop = 1; outerLoop < number; outerLoop++) {
			for (innerLoop = 1; innerLoop <= outerLoop; innerLoop++) {

				System.out.print(innerLoop + " ");
			}
			System.out.println("");
		}

		for (outerLoop = number; outerLoop >= 1; outerLoop--) {
			for (innerLoop = 1; innerLoop <= outerLoop; innerLoop++) {

				System.out.print(innerLoop + " ");

			}
			System.out.println("");
		}

	}

}
