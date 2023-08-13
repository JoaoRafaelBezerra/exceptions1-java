package Util;

import java.util.function.Function;

import Services.Product;

public class UpperCaseName implements Function<Product,String>{

	@Override
	public String apply(Product p) {
		
		return p.getName().toUpperCase();
	}

}
