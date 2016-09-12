package last_minute.tax_excercise;

import java.math.BigDecimal;

import junit.framework.TestCase;
import last_minute.tax_excercise.model.GeneralProduct;
import last_minute.tax_excercise.model.ImportedProduct;
import last_minute.tax_excercise.model.Product;

public class BasketsTest extends TestCase{
	
	public void testOutput2(){
		Basket basket2=new Basket();
        Product boxChocolateImported=new ImportedProduct("box of chocolatese", new BigDecimal(0), new BigDecimal(10.00));
        Product purfumeImported=new ImportedProduct("bottle of purfume",new BigDecimal(0.1), new BigDecimal(47.50));
        
        basket2.addProd(boxChocolateImported);
        basket2.addProd(purfumeImported);
        
        basket2.printReceive();
	}
	
	public void testOutput3(){
		Basket basket3=new Basket();
        Product purfumeImported=new ImportedProduct("bottle of purfume", new BigDecimal(0.1), new BigDecimal(27.99));
        Product purfume=new GeneralProduct("bottle of purfume", new BigDecimal(0.1), new BigDecimal(18.99));
        Product headache=new GeneralProduct("packet of headache pills",  new BigDecimal(9.75));
        Product importedChocolateBar=new ImportedProduct("box of chocolates",new BigDecimal(0), new BigDecimal(11.25));
        
        basket3.addProd(purfumeImported);
        basket3.addProd(purfume);
        basket3.addProd(headache);
        basket3.addProd(importedChocolateBar);
        
        basket3.printReceive();
	}
}
