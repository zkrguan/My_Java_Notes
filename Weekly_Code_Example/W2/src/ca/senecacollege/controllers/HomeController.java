package ca.senecacollege.controllers;

import java.util.Date;

import ca.senecacollege.models.Circle;
import ca.senecacollege.views.CircleView;
import ca.senecacollege.views.GeometricView;

public class HomeController {

	private Circle circle;
	private CircleView cv;
	private GeometricView gv;
	
	public HomeController(Circle c, CircleView cv, GeometricView gv) {
		this.circle = c;
		this.cv = cv;
		this.gv = gv;
	}
	
	public void setShapeColor(String color) {
		circle.setColor(color);
	}
	
	public String getShapeColor() {
		return circle.getColor();
	}
	
	public void setShapeFilled(boolean filled) {
		circle.setFilled(filled);
	}
	
	public boolean getShapeFilled() {
		return circle.isFilled();
	}
	
	public Date getShapeDate() {
		return circle.getDateCreated();
	}
	
	public void setCircleRadius(double radius) {
		circle.setRadius(radius);
	}
	
	public double getCircleRadius() {
		return circle.getRadius();
	}
	
	public double getCircleArea() {
		
		return circle.getArea();
	}
	
	public void printCircle() {
		cv.printCircle(circle.getDateCreated(), circle.getRadius());
	}
}
