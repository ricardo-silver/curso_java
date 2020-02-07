package entities;


public class ContribuintePJ extends Contribuinte {

	private int numeroFuncionarios;
	private int limiteFuncionario=10;
	private Double percentuaImpostoMenor=16.00;
	private Double percentuaImpostoMaior=14.00;
	
	public ContribuintePJ() {
		super();
	}

	public ContribuintePJ(String nome, Double rendaAnual,int numeroFuncionarios) {
		super(nome, rendaAnual);
		this.numeroFuncionarios = numeroFuncionarios;
	}

	public int getnumeroFuncionarios() {
		return numeroFuncionarios;
	}

	public void setnumeroFuncionarios(int numeroFuncionarios) {
		this.numeroFuncionarios = numeroFuncionarios;
	}

	public int getLimiteFuncionario() {
		return limiteFuncionario;
	}

	public void setLimiteRenda(int limiteFuncionario) {
		this.limiteFuncionario = limiteFuncionario;
	}

	public Double getPercentuaImpostoMenor() {
		return percentuaImpostoMenor;
	}

	public void setPercentuaImpostoMenor(Double percentuaImpostoMenor) {
		this.percentuaImpostoMenor = percentuaImpostoMenor;
	}

	public Double getPercentuaImpostoMaior() {
		return percentuaImpostoMaior;
	}

	public void setPercentuaImpostoMaior(Double percentuaImpostoMaior) {
		this.percentuaImpostoMaior = percentuaImpostoMaior;
	}

	@Override
	public Double impostoArrecadado()  {
		
		if ( numeroFuncionarios > limiteFuncionario ) {
			
			return ( getRendaAnual()  * (percentuaImpostoMaior/100));
		}
		else {
			return  ( getRendaAnual()  * (percentuaImpostoMenor/100));
		}
		
		
	}
}
