package services;

import Entities.Contract;
import Entities.Installment;

public class ContractService {

	private Contract contract;
	private Installment installment;
	
	public ContractService(Contract contract, Installment installment) {
		super();
		this.contract = contract;
		this.installment = installment;
	}

	public Contract getContract() {
		return contract;
	}

	public void setContract(Contract contract) {
		this.contract = contract;
	}

	public Installment getInstallment() {
		return installment;
	}

	public void setInstallment(Installment installment) {
		this.installment = installment;
	}
	
	public void processContract(Contract contract,int months){
		
		
	}
}
