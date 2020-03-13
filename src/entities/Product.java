package entities;

public class Product {

	private String name;
	private double price;
	public int quantity;

	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}

	public Product() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	public double totalValueInStock() {
		return price* quantity;
	}

	public void addProducts(int quantity) {
		this.quantity+= quantity;
	}

	public void removeProducts(int quantity) {
		this.quantity-= quantity;
	}

	public String toString() {
		return name+ ", $ "+ String.format("%.2f", price)+ ", "+ quantity+ " units, Total: $ "+ String.format("%.2f", totalValueInStock());
	}

}