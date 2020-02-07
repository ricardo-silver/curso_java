package entities;

public class ProdutoImportado extends Produto {

	private Double taxa;
	
	public ProdutoImportado(String nome, Double preco, Double taxa) {
		super(nome, preco);
		this.taxa = taxa;
	}

	public Double getTaxa() {
		return taxa;
	}

	public void setTaxa(Double taxa) {
		this.taxa = taxa;
	}

	public Double valorTotal() {
		return getPreco() + taxa;
	}
	@Override
	public String priceTag() {
		return getNome() + " $ " +  String.format("%.2f", this.valorTotal()) + " (Taxa:" +  String.format("%.2f", taxa)  +")";
	}	
}
