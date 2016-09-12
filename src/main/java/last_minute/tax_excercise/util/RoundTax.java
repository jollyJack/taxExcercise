package last_minute.tax_excercise.util;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class RoundTax {

	public static BigDecimal roundTax(BigDecimal tax, BigDecimal price){
		BigDecimal scale=new BigDecimal(0.05);
		
		BigDecimal priceWithTax=price.multiply(tax);
		BigDecimal pass1=priceWithTax.divide(scale);
		
		BigDecimal pass2=pass1.setScale(0, RoundingMode.UP);
		BigDecimal result=pass2.multiply(scale);
		
		return result.setScale(2, RoundingMode.HALF_DOWN);
				
	}
}
