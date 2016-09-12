package last_minute.tax_excercise.model;

import java.math.BigDecimal;
import java.math.RoundingMode;

import last_minute.tax_excercise.util.RoundTax;

public class GeneralProduct implements Product{
	String name;
	BigDecimal shelfPrice;
	BigDecimal taxRate;
	BigDecimal taxLessPrice;
	BigDecimal taxPrice;
	
	//no taxes  product
	public GeneralProduct(String name, BigDecimal taxLessPrice){
		this.name=name;
		this.taxLessPrice=taxLessPrice;
		taxPrice=new BigDecimal(0);
		shelfPrice=taxLessPrice.add(taxPrice);
	}

	
	public GeneralProduct(String name,BigDecimal taxRate, BigDecimal taxLessPrice){
		this.name=name;
		this.taxRate=taxRate;
		this.taxLessPrice=taxLessPrice;
		taxPrice=RoundTax.roundTax(taxRate, taxLessPrice);
		shelfPrice=taxLessPrice.add(taxPrice).setScale(2, RoundingMode.HALF_DOWN);
	}

	public String print() {
		return name;
	}

	public BigDecimal getShelfPrice() {
		return shelfPrice;
	}

	public BigDecimal getTaxesPrice() {
		return taxPrice;
	}
	
}
