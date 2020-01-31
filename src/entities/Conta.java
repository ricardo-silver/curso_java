package entities;

public class Conta {

	private String numeroConta;
	private String nomeTitular;
	private double saldo;

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

	public void deposito(double valor ) {
		saldo += valor;
	}

	public void saque(double valor ) {
		saldo -= valor + 5;
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

