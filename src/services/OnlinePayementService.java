package services;

public interface OnlinePayementService {

	public Double paymentFee(Double amount);
	public Double interest(Double amount,Integer months);
	
}
