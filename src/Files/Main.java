package Files;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import Services.Product;

public class Main {

	public static void main(String[] args) {//Comparator
		
		Scanner sc = new Scanner(System.in);
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV",100.0));
		list.add(new Product("Tablet",1000.0));
		list.add(new Product("PS5",50000.0));
		
		//Comparator<Product> comp = (p1,p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
		
		/*Comparator<Product> comp = new Comparator<Product>() {

			@Override
			public int compare(Product p1, Product p2) {
				
				return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
			}
			
		};*/
		
		list.sort((p1,p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));
		for(Product p : list) {
			System.out.println(p);
		}
		
	}
}

