package Files;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

import Services.Product;

public class Main {

	public static void main(String[] args) {//Map
		
		Scanner sc = new Scanner(System.in);
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 10000.00));
		list.add(new Product("Iphone", 4320.00));
		list.add(new Product("Java EE", 234.00));
		list.add(new Product("bosta liquida", 2.00));
		
		Function<Product, String> func = p ->  p.getName().toUpperCase();
		
		//List<String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList());
		//List<String> names = list.stream().map(Product::staticToUppercase).collect(Collectors.toList());
		//List<String> names = list.stream().map(Product::nonStaticToUppercase).collect(Collectors.toList());
		//List<String> names = list.stream().map(func).collect(Collectors.toList());
		List<String> names = list.stream().map(p ->  p.getName().toUpperCase()).collect(Collectors.toList());
		
		names.forEach(System.out::println);
		
	}

	
}

