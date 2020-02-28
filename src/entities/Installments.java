package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Installments {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private Date installmentDate;
	private Double installmentValue;
	
	public Installments(Date installmentDate, Double installmentValue) {		
		this.installmentDate = installmentDate;
		this.installmentValue = installmentValue;
	}

	public Date getInstallmentDate() {
		return installmentDate;
	}

	public void setInstallmentDate(Date installmentDate) {
		this.installmentDate = installmentDate;
	}

	public Double getInstallmentValue() {
		return installmentValue;
	}

	public void setInstallmentValue(Double installmentValue) {
		this.installmentValue = installmentValue;
	}
		
	@Override
	public String toString() {
		return sdf.format(installmentDate) + " - " + String.format("%.2f", installmentValue);
 	}
}
