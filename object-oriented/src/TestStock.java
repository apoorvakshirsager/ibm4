import ibm.com.stock.Broker;
import ibm.com.stock.Holder;
import ibm.com.stock.StockSingleton;

public class TestStock {
public static void main(String[] args) {
	//Stock telsa=new  Stock();
	Holder h=StockSingleton.getStock();
	h.viewQuote();
	Broker b=StockSingleton.getStock();
	b.getQuote();
	System.out.print(h==b);
}
}
