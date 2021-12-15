import java.util.ResourceBundle;
import java.util.Locale;
public class LocaleDemo {
 public static void main(String[] args) {
	 Locale desi=new Locale("hi");
	ResourceBundle msgs=ResourceBundle.getBundle("msgs",desi);

	System.out.print(msgs.getString("greeting"));
	System.out.print(msgs.getString("message"));
}
}
