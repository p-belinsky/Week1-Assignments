
public class Tester {
	
//	static int i = demo();
//	static {
//		System.out.println(i);
//	}
//	
//	Tester(){
//		System.out.println("Hello 1");
//	}
//	
//	static int demo() {
//		System.out.println("Inside Demo");
//		return 10;
//	}
	
	//Inside Demo
	//10
	//Hello 2
	
//	static int x = 4;
//	int y;
//	
//	public Tester(int a, int b) {
//		this.x = a;
//		this.y = b;
//		System.out.println("Value of x :" + this.x);
//		System.out.println("Value of y :" + this.y);
//		Tester();
//	}
//	
//	public static void testMethod() {
//		System.out.println(this.x);
//	}
// compiler error multiple errors exist no method Tester(), cant refer to non static members in static member
	
	
	

	public static void main(String[] args) {
// 1:		
//		int x = 0;
//		int y = 0;
//		
//		if((true & false)| (true & false) & x++ > 0) {
//			System.out.println("stmt1");
//		}
//		if(false || true | (++y>0)| y++>0) {
//			System.out.println("stmt2");
//			System.out.println(x+ " " + y); 
		
//			//stmt2
//			//1 2
//		}
		

// 2:
//		int x = 1, y = 0;
//		if((y == x++) && (x < ++y)) {
//			System.out.println(x+ " "+ y);
		
//			//Nothing will print
//		}
		
		
// 3:	
//		int x = 0, y = 0;
//		if((y == x++)| (x < ++ y)) {
//			++y;
//		}
//		System.out.println(x+ " "+ y);
		
//		// 1 2
		
// 4:		
//		do {
//			System.out.println("inside do");
//		} while(false);
//		
//		while(false) {
//			System.out.println("inside while");
//			
//		}
//		
//		System.out.println("outside");
		
		//compiler error unreachable code 
		
// 5:
//		int j = 10;
//		switch (1) {
//		case 20:
//			j += 1;
//		case 40:
//			j += 2;
//		default:
//			System.out.println("Im here");
//			j += 3;
//		case 0:
//			System.out.println("Im here");
//			j += 4;
//		}
//		System.out.print(j);
		//17
		//Default and case 0 will run 
		
/*	6:	
		char c = 'a';
		switch(c) {
		case 'a':
			System.out.println("a");
			break;
		
		case 97:
			System.out.println("97");
			break;*/
			
			// Compiler error duplicate case 
		

// 7:
//		int x= 0;
//		int y= 0;
//		for (int z = 0; z < 5; z++){
//			if (( ++x > 2 ) && (++y > 2))
//			{
//				x++;
//			}
//		}
//		System.out.println(x + " " + y);
		
		/*
		 * z=5 x=6 y=3
		 */
		
// 8:		
//		System.out.println(isEven(2));
//		System.out.println(isEven(3));
//		System.out.println(isEven(4));
		
		//Wont compile because isEven is not static 

// 9:		
//		String entries[] = {"entry1", "entry2"};
//		int count = 0;
//		while(entries [count++] != null) {
//	
//			System.out.println(count);
//		}
//		
//		System.out.println(count);
		
		//1
		//2
		//Throw ArrayIndexOutOfBoundsException
		

// 12:
//		System.out.println("Hello 2");

	}
	
	
	
	
	
	
	
//	boolean isEven(int x) {
//		return (x % 2 == 0) ? true: false;
//		
//	}

}
