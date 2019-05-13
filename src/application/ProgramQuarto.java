package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ProdutoArray;
import entities.Quarto;

public class ProgramQuarto {

	public static void main(String[] args) {
		
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
			Quarto[] vetor = new Quarto[10];
			System.out.println("Programa de controle de aluguel de 10 Quartos: ");
			System.out.println("Quantos quartos serão alugados? ");
			int n = sc.nextInt();
			for (int i=0; i<n; i++) {
				sc.nextLine();
				System.out.println("Aluguel #" + (i + 1) +":" );
				System.out.println("Digite o nome do inquilino :");
				String nome = sc.nextLine();
				System.out.println("Digite o email :");
				String email = sc.nextLine();
				System.out.println("Digite o numero do quarto desejado :");
				int num = sc.nextInt();
				vetor[num] = new Quarto(nome, email);		
			}
			System.out.println("Quartos ocupados : ");
			for (int i=0; i<vetor.length; i++) {
				if (vetor[i] != null) {
					System.out.println( i + ": " + vetor[i].getNome() + ", " +
				vetor[i].getEmail());	
				}
				
				
			}
			sc.close();

	}

}
