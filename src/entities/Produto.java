package entities;

public class Produto {

	private String nome;
	private Double preco;
	private int qtde;
	
	public Produto() {
			
	}
	
	public Produto(String nome, Double preco) {
		this.nome = nome;
		this.preco = preco;	
	}
	
	public Produto(String nome, Double preco, int qtde) {
		this.nome = nome;
		this.preco = preco;
		this.qtde = qtde;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Double getPreco() {
		return preco;
	}

	public void setQtde(int qtde) {
		this.qtde = qtde;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	public String priceTag() {
		return nome + " $ " + String.format("%.2f", preco );
	}

	@Override
	public String toString() {
	//	return "Produto [nome=" + nome + ", preco=" + preco + "]";
		return nome + "," + String.format("%.2f",preco*qtde);
	}
		
}
