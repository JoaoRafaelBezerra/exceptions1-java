package services;

public class paypalService implements OnlinePayementService{

	@Override
	public Double paymentFee(Double amount) {
		return amount + 0;
	}

	@Override
	public Double interest(Double amount, Integer months) {
		return amount + (amount/100) * months - 200;
	}

}
