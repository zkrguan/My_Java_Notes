package ca.senecacollege.classes;

public abstract class BankAccount {

	private String owner;
	private int accountNumnber;
	private float balance;
	
	public BankAccount() {
		this.owner = "";
		this.accountNumnber = 0;
		this.balance = 0;
	}
	
	public BankAccount(String ownerName) {
		this.owner = ownerName;
		this.accountNumnber = 0;
		this.balance = 0;
		
	}
	
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public int getAccountNumnber() {
		return accountNumnber;
	}
	public void setAccountNumnber(int accountNumnber) {
		this.accountNumnber = accountNumnber;
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	
	public void deposit(float amount) {
		this.balance += amount;
	}
	
	public void withdraw(float amount) {
		if(this.balance >= amount){
			this.balance -= amount;
		}
	}
	
	public abstract void sampleFunction();
}
