import com.ibm.xe.CurrencyConvertor;
import com.ibm.xe.Dirham;
import  com.ibm.xe.*;
public class TestCurrency {
public static void main(String[] args) {
	Dollar usd=new Dollar();
	Rupee inr =new Rupee();
	CurrencyConverter cc=new CurrencyConvertor();
	System.out.println(cc.convert(100,usd,inr));
	System.out.println(cc.convert(4000,inr,usd));
	Dirham aed=new Dirham();
	System.out.println(cc.convert(100,usd,aed));
	System.out.println(cc.convert(100,aed,inr));
}
}
