package last_minute.tax_excercise;

import java.math.BigDecimal;

import last_minute.tax_excercise.model.GeneralProduct;
import last_minute.tax_excercise.model.Product;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Basket basket1=new Basket();
        Product book=new GeneralProduct("book", new BigDecimal(12.49));
        Product musicCd=new GeneralProduct("music CD", new BigDecimal(0.1), new BigDecimal(14.99));
        Product chocolateBar=new GeneralProduct("chocolate bar", new BigDecimal(0.85));
        
        basket1.addProd(book);
        basket1.addProd(musicCd);
        basket1.addProd(chocolateBar);
        
        basket1.printReceive();
    }
}
