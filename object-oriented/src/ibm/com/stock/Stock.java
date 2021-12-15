package ibm.com.stock;

public class Stock implements Exchange {

	@Override
	public void setQuote() {
		// TODO Auto-generated method stub
System.out.println("GetQuote");
	}
public void getQuote() {
	System.out.println("getQuote");
}
public void viewQuote()
{
	System.out.println("viewQuote");
}
}
