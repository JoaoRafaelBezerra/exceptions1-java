package Entities;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Contract {

	private int numb;
	private LocalDateTime initialDate;
	private Double initialValue;
	
	private List<Installment> intallments = new ArrayList<>();
	public Contract(int numb, LocalDateTime initialDate, Double initialValue) 
	{
		this.numb = numb;
		this.initialDate = initialDate;
		this.initialValue = initialValue;
	}
	public int getNumb()
	{
		return numb;
	}
	public void setNumb(int numb)
	{
		this.numb = numb;
	}
	public LocalDateTime getInitialDate()
	{
		return initialDate;
	}
	public void setInitialDate(LocalDateTime initialDate)
	{
		this.initialDate = initialDate;
	}
	public Double getInitialValue()
	{
		return initialValue;
	}
	public void setInitialValue(Double initialValue)
	{
		this.initialValue = initialValue;
	}
	public List<Installment> getIntallments() {
		return intallments;
	}
	
	
	
}
