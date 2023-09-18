package ca.senecacollege.classes;

import ca.senecacollege.interfaces.Cat;
import ca.senecacollege.interfaces.Meowler;

public class HouseCat implements Cat, Meowler{

	@Override
	public String getCatKind() {
		// TODO Auto-generated method stub
		return "Domestic Cat";
	}

	@Override
	public String getFurDescription() {
		// TODO Auto-generated method stub
		return "mixed brown and white";
	}

}
