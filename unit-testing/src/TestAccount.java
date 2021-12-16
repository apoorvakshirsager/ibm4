/*import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestAccount {
private Account acnt;

@BeforeEach
public void init() {
	acnt=new Account(1000);
}
@Test
public void testWithdraw() throws BalanceException{
	assertEquals(500,acnt.withdraw(500));
}

@Test
public void testInvalidWithdraw() {
	assertThrows(BalanceException.class,()->acnt.withdraw(2000));
}

@Test
public void testNegativeWithdraw() {
	assertThrows(BalanceException.class,()->acnt.withdraw(-100));
}

@Test
public void testDeposit() {
	
}

@Test
public void testNegativeDeposit() {
	
}
}*/
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestAccount {
	private Account acnt;
	
	@BeforeEach
	public void init() {
		acnt=new Account(1000);
	}
	
	@Test
	public void testWithdraw() throws BalanceException{
		assertEquals(500, acnt.withdraw(500));
	}
	
	@Test
	public void testInvalidWithdraw() {
		assertThrows(BalanceException.class, () -> acnt.withdraw(2000));
	}
	
	@Test
	public void testNegativeInvalidWithdraw() {
		assertThrows(NumberFormatException.class, () -> acnt.withdraw(-100));
	}
	
	@Test
	public void testingNegativeWithdraw() {
		
	}
	

}
