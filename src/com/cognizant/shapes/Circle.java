package com.cognizant.shapes;

public class Circle {
	
	void calculateArea(int radius) {
		
		int area = (int) (radius * radius * Math.PI);		
		System.out.println("The area of the Circle is "+ area);
	}

}
