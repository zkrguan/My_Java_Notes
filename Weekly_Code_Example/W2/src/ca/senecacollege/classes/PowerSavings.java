package ca.senecacollege.classes;

public class PowerSavings extends SavingsAccount{

	public PowerSavings(String ownerName) {
		super(ownerName);
		
	}
	
	public void withdraw(float amount) {
		if(super.getBalance() >= (amount + 1.25f))
			super.withdraw(amount + 1.50f);
	}

}
