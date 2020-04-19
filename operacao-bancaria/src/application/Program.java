package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		Account account;
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Account Number: ");
		int number = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter Account Holder: ");
		String holder = sc.nextLine();
		System.out.print("Is there an initial deposit (y/n)? ");
		char response = sc.next().charAt(0);
		sc.nextLine();
		if(response == 'y') 
		{
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			account = new Account(number, holder, initialDeposit);
			sc.nextLine();
			
		}
		
		else
		{
			account = new Account(number, holder);
		}
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter deposit value: ");
		double dValue = sc.nextDouble();
		account.deposit(dValue);
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter withdraw value: ");
		double wdValue = sc.nextDouble();
		account.withdraw(wdValue);
		System.out.println(account);
		
		sc.close();
	}

}
