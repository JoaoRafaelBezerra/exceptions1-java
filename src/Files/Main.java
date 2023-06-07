package Files;

import java.util.Scanner;

import Services.PrintService;

public class Main {//Listing and creating files/folders

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		PrintService<String> ps = new PrintService<>();
		
		System.out.println("How many values?");
		
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			String value = sc.next();
			ps.addValue(value);
		}
		ps.print();
		System.out.println("First: " + ps.first());
	
	}
}


