package ca.senecacollege.model;

public class Person {
	// --------------------
	// This is the recommended way//
	// Not the C++ way//
	// Understand why? string pool 
	// If you do c++ way
	// string name = new String()
	// java is doing reference(or pointer?) assignment twice based on the photo from professor. 
	// As a result, there is a waste inside the memory. 
	// Check the class photo
	private String name;
	
	//
	private int id;
	
	// getter and the setter of the private variable can be easily generated by the eclipse. 
	// Right click, source, generate getter and setter. 
	// Same as the 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	// --------------------------------
	
	// Try to overload the constructor.
	// This will cause the error. 
	// The compiler given default constructor will be removed//
	// So you have to declare default again if you want to overload the default// 
	// (I think C++ is the same) //
	public Person (String n) {
		this.name = n;
	}
	
	// A decorator or annotation is like providing meta info of a method to the compiler// 
	// A typical decorator in Java. 
	// For @Override
	// The super (parent) class must have the method. Then you can use Override//
	@Override
	// If you don't have a toString function, inside the main file, when you print this object 
	// This will be the memory address instead of the content inside this object. 
	public String toString() {
		return "Person [name=" + name + ", id=" + id + "]";
	}
		
	// Remember Java is pure OOP language
	// wrapper class is made for converting the primitive data type into object.
	//!!!! THIS IS NOT THE C#, THE SIMILAR THING IN C# IS FRAMEWORK LANGUAGE NOT A WRAPPER CLASS !!!!
	// This is why everything inside Java is Object//
	// Like Integer myInt = new Int(2)
	
	
}