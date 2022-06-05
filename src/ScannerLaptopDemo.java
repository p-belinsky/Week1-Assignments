import java.util.Scanner;

public class ScannerLaptopDemo {
	
	public static Scanner scan = new Scanner(System.in);
	public static int num1;
	public static int num2;
	public static int result;
	public static boolean flag = true;

	public static void main(String[] args) {

		do {
		
		System.out.println("Enter Option:");
		System.out.println("Add------- 1");
		System.out.println("Subtract-- 2");
		System.out.println("Multiply-- 3");
		System.out.println("Quit------ 4");
		System.out.println();
		
		int option = scan.nextInt();
		
		if(option == 1) {
			System.out.println();
			System.out.println("Enter two numbers to be added:");
			num1 = scan.nextInt();
			num2 = scan.nextInt();
			result = num1 + num2;
			System.out.println("The result is " + result);
			System.out.println();
				
		}
		else if(option == 2) {
			System.out.println();
			System.out.println("Enter two numbers to be subtracted:");
			num1 = scan.nextInt();
			num2 = scan.nextInt();
			result = num1 - num2;
			System.out.println("The result is " + result);
			System.out.println();
		}
		
		else if(option == 3) {
			System.out.println();
			System.out.println("Enter two numbers to be multiplied:");
			num1 = scan.nextInt();
			num2 = scan.nextInt();
			result = num1 * num2;
			System.out.println("The result is " + result);
			System.out.println();
		}
		else if(option == 4) {
			flag = false;
			System.out.println();
			System.out.println("Quiting...");

		}
		else {
			System.out.println( option + " is not a valid option");
			System.out.println("Valid options are 1, 2, 3, 4");
			System.out.println("Please try again");
			System.out.println();
		}
		

		}while(flag);
	}
}
