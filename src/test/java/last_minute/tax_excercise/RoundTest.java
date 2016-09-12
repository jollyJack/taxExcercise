package last_minute.tax_excercise;

import java.math.BigDecimal;
import java.math.RoundingMode;

import junit.framework.TestCase;
import last_minute.tax_excercise.model.GeneralProduct;
import last_minute.tax_excercise.model.ImportedProduct;
import last_minute.tax_excercise.model.Product;
import last_minute.tax_excercise.util.RoundTax;

public class RoundTest extends TestCase{
	
	public void testRound1(){
		double price=14.99;
		double price2=Math.round((price*0.1)*20)/20.00;
		
		System.out.println(price2);
		System.out.println(Math.round((price+price2)*20)/20.00);
	}
	
	public void testBigDecimal(){
		BigDecimal partenza=new BigDecimal(14.99);
		BigDecimal risultato=RoundTax.roundTax(new BigDecimal(0.10), partenza);
		
		BigDecimal total=partenza;
		total.setScale(2, RoundingMode.HALF_DOWN);
		
		System.out.println(risultato);
		total.add(risultato);
		System.out.println(total);
	}
	
	
}
