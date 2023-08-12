package Files;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

import Services.Product;

public class Main {

	public static void main(String[] args) {//Comparator
		
		Scanner sc = new Scanner(System.in);
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 10000.00));
		list.add(new Product("Iphone", 4320.00));
		list.add(new Product("Java EE", 23410000.00));
		list.add(new Product("bosta liquida", 2.00));
		
		Predicate<Product> pred = p -> p.getPrice() >= 100.0;
		
		//list.removeIf(new ProductPredicate());
		//list.removeIf(Product::staticProductPredicate);
		//list.removeIf(Product::nonStaticProductPredicate);
		//list.removeIf(pred);
		list.removeIf(p -> p.getPrice() >= 100.0);
		
		for(Product p : list) {
			System.out.println(p);
		}
		
		
	}

	
}

