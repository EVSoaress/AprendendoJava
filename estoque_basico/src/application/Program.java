package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product product = new Product();
		
		System.out.println("Dados do Produto:");
		System.out.println("Name:");
		product.name = sc.nextLine();
		System.out.println("Price:");
		product.price = sc.nextDouble();
		System.out.println("QTD");
		product.quant = sc.nextInt();
		
		System.out.println(product);
		
		sc.close();
	}

}
