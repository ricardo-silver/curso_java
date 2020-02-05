package entities;

public class PedidoItem {

	private int quantidade;
	private Double preco;
	private ProdutoPedido produto;
	
	public PedidoItem() {
	}
		
	public PedidoItem(int quantidade, Double preco, ProdutoPedido produto) {		
		this.quantidade = quantidade;
		this.preco = preco;
		this.produto = produto;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public ProdutoPedido getProduto() {
		return produto;
	}

	public void setProduto(ProdutoPedido produto) {
		this.produto = produto;
	}
	public Double subTotal() {				
		return quantidade * preco;  
	}

	@Override
	public String toString() {
		return produto.getNome() 
				+ ", $" 
				+ String.format("%.2f", preco) 
				+ ", Quantity: " 
				+ quantidade + 
				", Subtotal: $" 
				+ String.format("%.2f", subTotal());
	}
	
}


