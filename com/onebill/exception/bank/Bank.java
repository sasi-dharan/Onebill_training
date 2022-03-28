package com.onebill.exception.bank;

public class Bank {
	private int balance;
	
	public int getBalance() {
		return balance;
	}
	public void deposit( int amount) {
		balance= balance + amount;
		System.out.println("the balance after the deposit is"+ balance);
	}
	public void withdraw( int amount) {
		if(amount<=balance && amount>0) {
			balance= balance-amount;
			System.out.println("the balance left"+ balance);
		}else {
			try {
				throw new InsufficientBalanceException("insufficient balance");
			}catch(InsufficientBalanceException e) {
				System.out.println(e.getMessage());
			}
		}
	}

}
