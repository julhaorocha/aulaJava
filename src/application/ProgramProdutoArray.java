package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ProdutoArray;

public class ProgramProdutoArray {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Programa para receber nome e preço de produtos "
				+ " e  calcular a média de preços!");
		System.out.println("Digite a quantidade de produtos a serem lidos: ");
		int n = sc.nextInt();
		ProdutoArray[] vetor = new ProdutoArray[n];
		
		for (int i=0; i<n; i++) {
			sc.nextLine();
			System.out.println("Digite o nome e o preço do produto :");
			String nome = sc.nextLine();
			double preco = sc.nextDouble();
			vetor[i] = new ProdutoArray(nome, preco);
				
		}
		
		double soma = 0.0;
		for (int i=0; i<n; i++) {
			soma += vetor[i].getPreco();
		}
		
		double media = soma / n;
		System.out.printf("A media de preço dos produtos é :%.2f%n", media);
			
	    sc.close();
	}
}
