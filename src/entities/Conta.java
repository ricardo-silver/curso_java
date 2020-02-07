package entities;

import entities.exceptions.DomainException;

public class Conta {

	private String numeroConta;
	private String nomeTitular;
	private double saldo;
	private double limite;

	public Conta() {
	}

	public Conta(String numeroConta, String nomeTitular) {
		super();
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
	}

	public Conta(String numeroConta, String nomeTitular, double saldo) {
		super();
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
		deposito(saldo);		
	}

	public Conta(String numeroConta, String nomeTitular, double saldo,double limite) {
		super();
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
		deposito(saldo);
		this.limite = limite;
	}
	
	public String getNumeroConta() {
		return numeroConta;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public double getSaldo() {
		return saldo;
	}     
	
	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public void deposito(double valor ) {
		saldo += valor;
	}

	public void saque(double valor )  {
		
		if (valor > getLimite()) {
			throw new DomainException("Withdraw error: The amount exceeds withdraw limit");
		}
		if (getSaldo() - valor < 0 ) {
			throw new DomainException("Withdraw error: Not enough balance");
		}
		saldo -= valor;
	}

	public String toString() {
		return "Account "
                           + numeroConta
                           + ", Holder: "
                           + nomeTitular
                           + ", Balance: $ "
                           + String.format("%.2f", saldo);
	}
}

