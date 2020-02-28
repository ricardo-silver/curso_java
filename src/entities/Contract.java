package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contract {

	private Integer contractNumber;
	private Date contractDate;
	private Double contractValue;
		
	private List<Installments> installments = new ArrayList<>();

	public Contract(Integer contractNumber, Date contractDate, Double contractValue) {
		super();
		this.contractNumber = contractNumber;
		this.contractDate = contractDate;
		this.contractValue = contractValue;
	}

	public Integer getContractNumber() {
		return contractNumber;
	}

	public void setContractNumber(Integer contractNumber) {
		this.contractNumber = contractNumber;
	}

	public Date getContractDate() {
		return contractDate;
	}

	public void setContractDate(Date contractDate) {
		this.contractDate = contractDate;
	}

	public Double getContractValue() {
		return contractValue;
	}

	public void setContractValue(Double contractValue) {
		this.contractValue = contractValue;
	}

	public List<Installments> getInstallments() {
		return installments;
	}

	public void addInstallment(Installments installment) {
		installments.add(installment);
	}

	public void removeInstallment(Installments installment) {
		installments.remove(installment);
	}
	
	
}
