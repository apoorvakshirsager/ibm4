package com.ibm.bank;
public class Savings extends Accounts {

	public Savings() {
		//super();
		// TODO Auto-generated constructor stub
	}

	public Savings(String holder) {
		super(holder, 1000);
		// TODO Auto-generated constructor stub
	}
public void withdraw(double amount) throws BalanceException
{
	if(amount<=(balance-1000))
		balance-=amount;
	else
		System.out.println("insufficient");
}
}
