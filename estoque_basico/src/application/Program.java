package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("Dados do Produto:");
		System.out.println("Name:");
		String name = sc.nextLine();
		System.out.println("Price:");
		double price = sc.nextDouble();
		System.out.println("QTD");
	    int quant = sc.nextInt();
		Product product = new Product(name, price, quant);
		
		
		product.setName("Computer");//implementação do Set e Get
		System.out.println("Update name : " + product.getName());//********************* 
		
		System.out.println();
		System.out.println("Product Data : " + product);
		
		System.out.println();
		System.out.println("Enter the number of products to be added in stock:");
		quant = sc.nextInt();
		product.addProduct(quant);
		
		System.out.println();
		System.out.println("Update Data : " + product);
		
	    quant = sc.nextInt();
	    product.removeProduct(quant);
	    
	    System.out.println();
		System.out.println("Update Data : " + product);
		
		sc.close();
	}

}
