package com.ibm.bank;
public abstract class Accounts implements Bank{
		private int acntNo;
		private String holder;
		protected double balance;
	
		

		private static int counter;

		// Executes at the time of class loading..
		static {                // Static initializer block, consider as constructor for static members
			//System.out.println("Account class loaded...");
			counter = INIT_ACCOUNT_NO;
		}

		public Accounts() {

		}

		public Accounts(String holder, double balance) {
			this.acntNo = counter++;
			this.holder = holder;
			this.balance = balance;  
		}

		public void summary() {
			System.out.println("A/C no:" + acntNo);
			System.out.println("Holder:" + holder);
			System.out.println("Balance:" + balance);
		}

		public void deposit(double amount) {
			balance += amount;
		}

		public void withdraw(double amount) throws BalanceException {
			if (amount <= balance)
				balance -= amount;
			else
				System.out.println("Insufficient Balance!");
		}
	}

