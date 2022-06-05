package com.cognizant.shapes;

public class Circle {

	private float radius;
	protected float pi = 3.5f;

	private Circle() {
		super();
		radius = 1.5f;
	}

	protected Circle(float radius) {
		this.radius = radius;
		Circle c3 = new Circle(1.5f, pi);
	}

	public Circle(float radius, float pi) {
		this.radius = radius;
		

	}
	
	public float calculateCircleArea(float radius) {
		float result = pi * radius * radius;
		return result;
	}
	
	public float calculateCircumference(float radius) {
		float result = 2 * pi * radius;
		return result;
	}
	
	public static void main(String[] args) {
		
		Circle c1 = new Circle();
		float circleArea = c1.calculateCircleArea(1.5f);
		System.out.println("The area of the circle is " + circleArea);
		float circleCircumference = c1.calculateCircumference(1.5f);
		System.out.println("The circumference of the circle is " + circleCircumference);

	}
	

}
