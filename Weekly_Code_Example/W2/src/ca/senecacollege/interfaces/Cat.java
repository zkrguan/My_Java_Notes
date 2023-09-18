package ca.senecacollege.interfaces;

public interface Cat {

	String getCatKind();
	String getFurDescription();
	
	default void walk() {
		System.out.println(getCatKind() + " is walking");
	}
}
