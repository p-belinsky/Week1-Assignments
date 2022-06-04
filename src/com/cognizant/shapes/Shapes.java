package com.cognizant.shapes;

public class Shapes {

int numberOfSides;
	
	public static void main(String[] args) {

		Shapes shape = new Shapes();
		shape.calculateShapeArea(3, 12);
		shape.calculateShapeArea(4, 15);
		shape.calculateShapeArea(5, 15);

	}

	void calculateShapeArea(int numberOfSides, int sideLength) {
		this.numberOfSides = numberOfSides;
		
		switch(this.numberOfSides) {
		case 1: new Circle().calculateArea(sideLength); 
		break;
		
		case 3: new Triangle().calculateArea(sideLength);
		break;
		
		case 4: new Square().calculateArea(sideLength);
		break;
		
		default:
			System.out.println("No Shapes Present");
		}
		
		

	}

}
