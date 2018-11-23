import java.text.NumberFormat;
import java.util.Locale;

public class JavaCurrency {

	public static void main(String[] args) {
		
		double payment=1233.6d;
		Locale indiaLocale = new Locale("en", "IN");
		String us=NumberFormat.getCurrencyInstance(Locale.US).format(payment);
		String IND=NumberFormat.getCurrencyInstance(indiaLocale).format(payment);
		String china=NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
		String france=NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);
		System.out.println(us);
		System.out.println(IND);
		System.out.println(china);
		System.out.println(france);
		
	}

}
