package com.acme.financial;

public abstract class Account {
	// if we use double we need to worry about round-off error
	// many people use BigDecimal for monetary values
	private int balance;
	private int accountNumber;
	
	public Account(int startingBalance) {
		this.balance = startingBalance;
	}
	
	 // Getter
	public String getName() {
		return name;
	  }

	 // Setter
	  public void setName(String newName) {
	    this.name = newName;
	public void deposit(int amount) {
		this.balance += amount;
	}
	
	public int getBalance() {
		return balance;
	}
	
	public void withdraw(int amount) {
		this.balance = this.balance - amount;
	}
	
	public void transfer(int amount, Account other) {
		this.balance -= amount;
		other.balance += amount;
	}
}
