package ca.senecacollege.models;

public class Circle extends GeometricObject{
	
	private double radius;
	
	public Circle() {}
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public Circle(double radius, String color, boolean filled) {
		super(color,filled);
		this.radius = radius;
		
	}

	public Circle(double radius, String color) {
		this.radius = radius;
		super.setColor(color);
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getArea() {
		return radius * radius * Math.PI;
	}
}
