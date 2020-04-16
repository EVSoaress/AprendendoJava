package entities;

public class Product {

	private String name;
	private double price;
	private int quant;
	
	public Product() {	
	}
	
	public Product(String name, double price, int quant) {
		this.name = name;
		this.price = price;
		this.quant = quant;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public int quant() {
		return quant;
	}
	
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	public double totalValueInStock() {
		return price * quant;
	}

	public void addProduct(int quant) {
		
		this.quant += quant; // this.quant = this.quant + quant; --> tanto faz
		
	}
	
	public void removeProduct(int quant) {
		
		this.quant -= quant; // this.quant = this.quant - quant; --> tanto faz
	}
	
	public String toString() {
		return name
		+ ", $"
		+ String.format("%.2f", price)
		+", "
		+ quant
		+" unity, total: $"
		+ String.format("%.2f", totalValueInStock());
	}
}
