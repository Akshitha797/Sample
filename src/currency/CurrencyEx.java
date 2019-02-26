package currency;
import java.util.*; 
public class CurrencyEx {

	public static void main(String[] args) 
	{ 
		Currency c1 = Currency.getInstance("AUD"); //Australian Dollar 
		Currency c2 = Currency.getInstance("JPY"); //Japan Yen 
		Currency c3 = Currency.getInstance("USD"); //Japan Yen 

		String cCode1 = c1.getCurrencyCode(); 
		String cCode2 = c2.getCurrencyCode(); 
		System.out.println("Australian Dollar code : " + cCode1); 
		System.out.println("Japan Yen code : " + cCode2); 
		System.out.println(""); 

		int D1 = c1.getDefaultFractionDigits(); 
		System.out.println("AUD Fraction digits : " + D1); 

		int D2 = c2.getDefaultFractionDigits(); 
		System.out.println("JPY fraction digits : " + D2); 
		System.out.println(""); 

		System.out.println("AUD Display : "+c1.getDisplayName()); 
		System.out.println("JPY Display : "+c2.getSymbol()); 
		System.out.println(""); 

		System.out.println("JPY Symbol : "+c2.getSymbol()); 
		System.out.println("USD Symbol : "+c3.getSymbol()); 

	} 
} 
