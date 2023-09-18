package ca.senecacollege.main;

import ca.senecacollege.classes.HouseCat;
import ca.senecacollege.classes.Lion;
import ca.senecacollege.classes.SavingsAccount;
import ca.senecacollege.controllers.HomeController;
import ca.senecacollege.models.Circle;
import ca.senecacollege.views.CircleView;
import ca.senecacollege.views.GeometricView;

public class Main {

	public static void main(String[] args) {
		
		//BankAccount b = new BankAccount();
		
		SavingsAccount s = new SavingsAccount("Mike");
		
		System.out.println(s.getOwner());
		System.out.println(s.getBalance());
		
		s.deposit(120);
		System.out.println(s.getBalance());
		
		s.withdraw(20);
		System.out.println(s.getBalance());
		
		Circle cirM = CircleCreation();
		CircleView cv = new CircleView(cirM);
		
		GeometricView gv = new GeometricView();
		
		HomeController hm = new HomeController(cirM, cv, gv);
		
		hm.printCircle();
		System.out.println("A Circle color is "+ hm.getShapeColor());
		
		Circle circ = CircleCreation(4, "Black");
		HomeController hc = new HomeController(circ, cv,gv);
		System.out.println("A Circle color is "+ hc.getShapeColor());
		
		HouseCat hcat = new HouseCat();
		System.out.printf("%s with %s fur\n", hcat.getCatKind(), hcat.getFurDescription());
		hcat.walk();
		hcat.meow();
		
		Lion l = new Lion();
		System.out.printf("%s with %s fur\n", l.getCatKind(), l.getFurDescription());
		
	}
	
	
	private static Circle CircleCreation() {
		Circle cir = new Circle(1);
		return cir;
	}
	private static Circle CircleCreation(double radius, String color) {
		Circle cir = new Circle(radius, color);
		return cir;
	}
}
