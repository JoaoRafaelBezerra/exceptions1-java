package Files;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import Entities.CarRental;
import Entities.Vehicle;

public class Main {//Listing and creating files/folders

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		System.out.println("Entre com os dados do aluguel:");
		System.out.print("Modelo do carro: ");
		String carModel = sc.nextLine();
		System.out.println("retirada (dd/MM/yyyy HH:mm): ");
		LocalDateTime start  = LocalDateTime.parse(sc.nextLine(), fmt);
		System.out.println("retorno (dd/MM/yyyy HH:mm): ");
		LocalDateTime finish  = LocalDateTime.parse(sc.nextLine(), fmt);
		
		CarRental cr = new CarRental(start,finish,new Vehicle(carModel));
		
		
	}
}


