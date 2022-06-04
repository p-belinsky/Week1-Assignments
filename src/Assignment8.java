
public class Assignment8 {
	public static void main(String[] args) {
		
		int checkPrime;
		int n = 1;
		int divCount;
		
		while(n <= 150) {
			divCount = 0;
			checkPrime = 2;
			while (checkPrime <= n /2) {
				if (n % checkPrime == 0) {
					divCount ++;
					break;
				}
				
				checkPrime ++;
			}
			
			if(divCount == 0 && n != 1) {
				System.out.print(n + " ");
			}
			
			n++;
		}
	}

}
