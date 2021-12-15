import com.ibm.bank.AccountsFactory;
import com.ibm.bank.Bank;

public class TestAccounts {

	public static void main(String[] args) {
		//AccountsFactory factory=new AccountsFactory();
		Bank c1 = AccountsFactory.openAccount("Ritika","anu");
		c1.summary();
		
		//Savings s1 = new Savings("Bob");
		//c1.summary();
c1.withdraw(3000);
c1.withdraw(5000);
c1.summary();
c1.deposit(2000);
c1.deposit(4000);
c1.summary();
Bank s1=AccountsFactory.openAccount("lil", "asa");
s1.withdraw(100);

		/*a1.deposit(2000);
		a1.summary();

		a1.withdraw(4000);
		a1.summary();

		a1.withdraw(5000);*/
	/*	Accounts a1=c1;
		a1.withdraw(300);
		Savings s1=new Savings("asddd");
		Accounts a2=s1;
		Bank b=s1;
		s1.withdraw(100);*/
		
	}
}
