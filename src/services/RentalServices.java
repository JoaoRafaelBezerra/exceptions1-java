package services;

import java.time.Duration;

import Entities.CarRental;
import Entities.InVoice;

public class RentalServices {

	private double pricePerHour;
	private double pricePerDay;
	
	private BrazilTaxService brasilTax;
	
	public RentalServices(double pricePerHour, double pricePerDay,BrazilTaxService brasilTax) {
		this.pricePerHour = pricePerHour;
		this.pricePerDay = pricePerDay;
		this.brasilTax = brasilTax;
	}
	public double getPricePerHour() {
		return pricePerHour;
	}
	public void setPricePerHour(double pricePerHour) {
		this.pricePerHour = pricePerHour;
	}
	public double getPricePerDay() {
		return pricePerDay;
	}
	public void setPricePerDay(double pricePerDay) {
		this.pricePerDay = pricePerDay;
	}
	public void processInvoice(CarRental carRental) {
		
		double minutes = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();
		double hours = minutes / 60.;
		double basicPayment;
		if(hours <= 12)
			basicPayment = pricePerHour * Math.ceil(hours);
		else
			basicPayment = pricePerDay * Math.ceil(hours/24.);
		
		double tax = brasilTax.Tax(basicPayment);
		
		
		carRental.setInVoice(new InVoice(basicPayment,tax));
	}
	
}
