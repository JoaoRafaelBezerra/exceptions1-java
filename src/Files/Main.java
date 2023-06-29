package Files;

import java.util.Scanner;

import Services.Client;

public class Main {//Listing and creating files/folders

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Client client1 = new Client("Maria", "Maria@hamilc.com");
		Client client2 = new Client("Maria", "Maria@hamilc.com");
		
		System.out.println(client1.hashCode());
		System.out.println(client2.hashCode());
		System.out.println(client1.equals(client2));
		System.out.println(client1 == client2);
	
	}
}


