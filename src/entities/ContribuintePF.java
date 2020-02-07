package entities;

public class ContribuintePF extends Contribuinte {

	private Double despesaSaude;
	private Double limiteRenda=20000.00;
	private Double percentuaImpostoMenor=15.00;
	private Double percentuaImpostoMaior=25.00;
	private Double percentualSaude=50.00;

	public ContribuintePF() {
		super();
	}

	public ContribuintePF(String nome, Double rendaAnual,Double despesaSaude) {
		super(nome, rendaAnual);
		this.despesaSaude = despesaSaude;
	}

	public Double getDespesaSaude() {
		return despesaSaude;
	}

	public void setDespesaSaude(Double despesaSaude) {
		this.despesaSaude = despesaSaude;
	}

	public Double getLimiteRenda() {
		return limiteRenda;
	}

	public void setLimiteRenda(Double limiteRenda) {
		this.limiteRenda = limiteRenda;
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

		if ( getRendaAnual() > limiteRenda ) {

			return  ( getRendaAnual()  * (percentuaImpostoMaior/100)) - (despesaSaude * (percentualSaude/100)) ;
		}
		else {
			return ( getRendaAnual()  * (percentuaImpostoMenor/100)) -  (despesaSaude * (percentualSaude/100)) ;
		}
	}
}