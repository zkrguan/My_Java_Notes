package ca.senecacollege.views;

import java.util.Date;

public class GeometricView {

	public void printGeometricObject(Date date, String color, boolean filled) {
		System.out.println("Geometric Object Details");
		System.out.println("Color is " + color);
		System.out.println("Is Shape filled with the color?- " + filled);
		System.out.println("The date on whihc the shape was created: " + date);
	}
}
