package entities;

public class Product {

	public String name;
	public double price;
	public int quant;
	
	public double totalValueInStock() {
		return price * quant;
	}

	public void addProduct(int quant) {
		
		this.quant += quant; // this.quant = this.quant + quant; --> tanto faz
		
	}
	
	public void removeProduct(int quant) {
		
		this.quant -= quant; // this.quant = this.quant - quant; --> tanto faz
	}
}
