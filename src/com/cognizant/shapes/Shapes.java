package com.cognizant.shapes;

public class Shapes {
	
	int numberOfSides;
	
	public void calculateShapeArea(int numberOfSides, int sideLength) {
		this.numberOfSides = numberOfSides;
		
		if(this.numberOfSides == 1) {
			new Circle().calculateArea(sideLength);
		}
		else if(this.numberOfSides == 3) {
			new Triangle().calculateArea(sideLength);
		}
		else if(this.numberOfSides == 4) {
			new Square().calculateArea(sideLength);
		}
		else {
			System.out.println("No Shapes Present");
		}
	}
	
	public static void main(String[] args) {
		Shapes shape = new Shapes();
		shape.calculateShapeArea(3, 12);
		shape.calculateShapeArea(4, 15);
		shape.calculateShapeArea(5, 15);
	}

}
