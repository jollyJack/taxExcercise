package last_minute.tax_excercise;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

import last_minute.tax_excercise.model.Product;


public class Basket {
	List<Product> salesList;
	BigDecimal saleTaxes;
	BigDecimal totalPrice;
	
	public Basket(){
		salesList=new ArrayList<Product>();
		saleTaxes=new BigDecimal(0);
		saleTaxes.setScale(2, RoundingMode.CEILING);
		totalPrice=new BigDecimal(0);
		totalPrice.setScale(2, RoundingMode.CEILING);
	}

	public void addProd(Product p){
		salesList.add(p);

		totalPrice=totalPrice.add(p.getShelfPrice());
		saleTaxes=saleTaxes.add(p.getTaxesPrice());
		
	}

	public void printReceive() {		
		for (Product p:salesList){
			System.out.println("1 "+p.print()+":"+p.getShelfPrice().setScale(2, RoundingMode.CEILING));
		}
		System.out.println("Sales Taxes:"+ saleTaxes.setScale(2, RoundingMode.CEILING));
		System.out.println("Total Price:"+totalPrice.setScale(2, RoundingMode.CEILING));
	}
	
	
}
