package last_minute.tax_excercise.model;

import java.math.BigDecimal;

public interface Product {
	public String print();
	public BigDecimal getShelfPrice();
	public BigDecimal getTaxesPrice();
	
}
