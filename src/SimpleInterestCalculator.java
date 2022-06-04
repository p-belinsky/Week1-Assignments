
public class SimpleInterestCalculator {

	double pAmount, roi;
	int numYears;

	public static void main(String[] args) {
		new SimpleInterestCalculator().calculateSimpleInterest(200000, 12);
		new SimpleInterestCalculator().calculateSimpleInterest(50000, 12);
		new SimpleInterestCalculator().calculateSimpleInterest(50000, 5);

	}

	public void calculateSimpleInterest(double p, int n) {
		int simpleInterest = 0;
		pAmount = p;
		numYears = n;

		if (pAmount > 100000) {
			if (numYears > 10) {
				roi = 10;
				simpleInterest = (int) (pAmount * numYears * roi / 100);
			} else if (numYears < 10) {
				roi = 9.5;
				simpleInterest = (int) (pAmount * numYears * roi / 100);
			}

		}
		if (pAmount < 100000) {
			if (numYears > 10) {
				roi = 5;
				simpleInterest = (int) (pAmount * numYears * roi / 100);
			}

			else if (numYears < 10) {
				roi = 4.5;
				simpleInterest = (int) (pAmount * numYears * roi / 100);
			}

		}

		System.out.println("The interest amount for a principal of " + (int) pAmount + " and years " + numYears + " is "
				+ simpleInterest);

	}

}
