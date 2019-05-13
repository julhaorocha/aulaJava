package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class ProgramDollarCoverter {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		

		System.out.println("What is th dollar price? ");
	    CurrencyConverter.price = sc.nextDouble();
		System.out.println("How many dollars will be bought? ");
		CurrencyConverter.qtt = sc.nextDouble();
		System.out.printf("What is th dollar price?  %.2f%n", CurrencyConverter.price);
		System.out.printf("How many dollars will be bought? %.2f%n", CurrencyConverter.qtt);
		System.out.printf("Amount to be paid in Reais =  %.2f%n",CurrencyConverter.converter());
	}

}
