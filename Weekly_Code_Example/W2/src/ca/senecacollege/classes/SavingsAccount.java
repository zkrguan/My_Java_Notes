package ca.senecacollege.classes;

public class SavingsAccount extends BankAccount{

	int something;
	
	/*
	 * public SavingsAccount(String name):public BankAccount( name){
	 * 
	 * 		BankAccount(name);
	 * }
	 * */
	public SavingsAccount(String ownerName) {
		super(ownerName);
		this.something = 0;
		
	}
	
	@Override
	public void deposit(float amount) {
		this.something = 2;
		//super.deposit(amount);
		//int wholeDollars = (int)(amount/100);
		//float localBalance = this.getBalance() + wholeDollars * 0.50f;
		super.deposit(amount + ((int)(amount/100) * 0.50f));
	}

	@Override
	public void sampleFunction() {
		// TODO Auto-generated method stub
		
	}

	
}
