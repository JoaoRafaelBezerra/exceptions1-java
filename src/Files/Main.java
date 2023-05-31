package Files;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import Entities.CarRental;
import Entities.Vehicle;
import services.BrazilTaxService;
import services.RentalServices;

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
		
		System.out.print("Entre com o preço por hora: ");
		double priceHour = sc.nextDouble();
		System.out.print("Entre com o preço por dia: ");
		double priceDay = sc.nextDouble();
		
		RentalServices rentalService =  new RentalServices(priceHour,priceDay,new BrazilTaxService());
		
		rentalService.processInvoice(cr);
		
		System.out.println("Fatura:");
		System.out.println("Pagamento basico: " + cr.getInVoice().getBasicPayment());
		System.out.println("Imposto: " + cr.getInVoice().getTax());
		System.out.println("Pagamento total: "+ cr.getInVoice().getTotalPayment());

	}
}


