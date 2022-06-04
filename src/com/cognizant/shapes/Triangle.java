package com.cognizant.shapes;

public class Triangle {

	public void calculateArea(int sides) {
		double area;
		area = 0.433 * sides * sides;
		System.out.println("The area of the triangle is " + area);
	}
}
