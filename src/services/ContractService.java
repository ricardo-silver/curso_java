package services;

import java.util.Calendar;
import java.util.Date;

import entities.Contract;
import entities.Installments;

public class ContractService {
	
private PaymentService paymentService;
	
	public ContractService(PaymentService paymentService) {
		this.paymentService = paymentService;
	}
	
	public void processContract(Contract contract, int months) {
		
		double basicQuota = contract.getContractValue() / months;
		
        for (int i = 1; i <= months; i++) {
            Date date = addMonths(contract.getContractDate(), i);
            double updatedQuota = basicQuota + paymentService.interest(basicQuota, i);
            double fullQuota =  updatedQuota + paymentService.paymentFee(updatedQuota);
            contract.addInstallment(new Installments(date, fullQuota));
        }
        
	}
	
	private Date addMonths(Date date, int n) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.MONTH, n);
		return cal.getTime();
	}
}
