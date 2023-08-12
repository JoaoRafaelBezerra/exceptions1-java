package Files;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;

import Services.Product;

public class Main {

	public static void main(String[] args) {//Consumer
		
		Scanner sc = new Scanner(System.in);
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 10000.00));
		list.add(new Product("Iphone", 4320.00));
		list.add(new Product("Java EE", 234.00));
		list.add(new Product("bosta liquida", 2.00));
		
		double factor = 1.1;
		Consumer<Product> cons = p -> {
			p.setPrice(p.getPrice() * factor);
		};
		
		//list.forEach(new PriceUpdate());
		//list.forEach(Product::staticProductUpdate);
		//list.forEach(Product::nonStaticProductUpdate);
		//list.forEach(cons);
		list.forEach(p -> p.setPrice(p.getPrice() * factor));
		
		list.forEach(System.out::println);
	}

	
}

