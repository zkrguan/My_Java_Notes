package ca.senecacollege.classes;

import ca.senecacollege.interfaces.Cat;

public class Lion implements Cat{

	@Override
	public String getCatKind() {
		// TODO Auto-generated method stub
		return getClass().getSimpleName();
	}

	@Override
	public String getFurDescription() {
		// TODO Auto-generated method stub
		return "golden-brown";
	}

}
