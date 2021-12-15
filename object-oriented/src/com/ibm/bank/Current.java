package com.ibm.bank;
public class Current extends Accounts {
   private double overdraft;
	public Current() {
		//super();
		// TODO Auto-generated constructor stub
	}

	public Current(String holder) {
		super(holder, 1000);
		// TODO Auto-generated constructor stub
		this.overdraft=10000;
	}
	public void summary()
	{
		super.summary();
		System.out.println("overdraft:"+overdraft);
	}
	public void deposit(double amount)
	{
		overdraft+=amount;
		if(overdraft>10000)
		{
			balance+=overdraft-10000;
			overdraft=10000;
		}
	}
public void withdraw(double amount) throws BalanceException
{
	if(amount<=(balance+overdraft))
	{
		balance-=amount;
		if(balance<0) {
			overdraft+=balance;
			balance=0;
		}
		else
			System.out.println("insufficient");
	}
}
}