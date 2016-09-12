package last_minute.tax_excercise.model;

import java.math.BigDecimal;

/*
 * imported Item in this case taxes is +5% (duty taxes)
 */
public class ImportedProduct extends GeneralProduct {
	final static BigDecimal dutyTax=new BigDecimal(0.05);
	
	public ImportedProduct(String name, BigDecimal taxRates, BigDecimal taxLessPrice){
		super(name,(taxRates.add(dutyTax)), taxLessPrice);
	}
	
	@Override
	public String print(){
		return "imported "+name;
	}
	
	
}
