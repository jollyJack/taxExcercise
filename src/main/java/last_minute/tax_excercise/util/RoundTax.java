package last_minute.tax_excercise.util;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class RoundTax {

	public static BigDecimal roundTax(BigDecimal tax, BigDecimal price){
		BigDecimal scale=new BigDecimal(0.05);
		
		BigDecimal priceWithTax=price.multiply(tax);
		BigDecimal y=priceWithTax.divide(scale);
		
		BigDecimal q=y.setScale(0, RoundingMode.UP);
		BigDecimal result=q.multiply(scale);
		
		return result.setScale(2, RoundingMode.HALF_DOWN);
				
	}
}
