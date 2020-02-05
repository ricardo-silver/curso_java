package entities;

public class ProdutoPedido {
	
	private String nome;
	private Double preco;
	
	public ProdutoPedido() {	
		
	}
		
	public ProdutoPedido(String nome, Double preco) {	
		this.nome = nome;
		this.preco = preco;
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

	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
}
