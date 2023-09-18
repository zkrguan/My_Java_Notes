package ca.senecacollege.views;

import java.util.Date;

import ca.senecacollege.models.Circle;

public class CircleView {

	private Circle cir = new Circle();
	
	public CircleView(Circle cir) {
		this.cir = cir;
	}
	
	public void printCircle(Date date, double radius) {
		System.out.println("The circle is created " + cir.getDateCreated() + 
						" and radius is " + radius);
	}
}
