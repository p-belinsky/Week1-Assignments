
public class Assignment12 {
	public static void main(String[] args) {

// 1:		
//		  String n = "Welcome to Java World"; System.out.println(n.charAt(5));
//		  
//		  String welcome = "Welcome";
//		  System.out.println(n.compareToIgnoreCase(welcome));
//		  
//		  System.out.println(welcome+ "-Let us learn");
//		  
//		  System.out.println(n.indexOf('a'));
//		  
//		  System.out.println(n.replace('a', 'e'));
//		  
//		  System.out.println(n.substring(4, 11));
//		  
//		  System.out.println(n.toLowerCase());
		
// 2:
//		StringBuffer n = new StringBuffer("This is StringBuffer");
//		n.append("- This is a sample program");
//		System.out.println(n);
//		
//		n.insert(21, "Object");
//		System.out.println(n);
//		
//		n.reverse();
//		System.out.println(n);
//		
//		n.reverse();
//		n.replace(14, 20, "Builder");
//		System.out.println(n);
		
		String path ="C:\\IBM\\DB2\\PROGRAM\\DB2COPY1.EXE";
		String sub = path.substring(0, 3);

		String[] pathArr = path.split("[\\\\]");
		System.out.println("Drive: " + sub.toLowerCase());
		System.out.println("Folders: " + pathArr[1] + " || " + pathArr[2] + " || " + pathArr[3] );
		System.out.println("File: " + pathArr[4]);
		
		 
	}

}
