// All the classes are inherits from the Object Class

package ca.senecacollege.first;

import ca.senecacollege.model.Person;

// This is not needed//
public class HiPpl extends Object{
	//	In java you can overload main
	// Why it is static? Class function, OOP101 static keyword//
	public static void main(String[] args) {
		// "final" is the keyword just like Constant in C//
		System.out.println("Hello"); 
		
		Person p1 = new Person("Mike");
		p1.setId(2);
		// If you don't have String toString() implemented, 
		// the output would be the memory address of the this object. 
		System.out.println("The name is " + p1);
		
	}
}


