package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Conta;

public class ProgramConta {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Conta conta;
		
		System.out.println("Entre com os dados da Conta: ");
		System.out.print("N�mero: ");
		int  num = sc.nextInt();
		System.out.print("Nome do cliente: ");
		sc.nextLine();
		String nome = sc.nextLine();
		System.out.print("Ser� realizado algum dep�sito inicial(s/n)?");
		char resposta = sc.next().charAt(0);
			if(resposta == 's') {
		       System.out.print("Digite o valor de dep�sito inicial:");
		       double saldo = sc.nextDouble();
		       conta = new Conta(num, nome, saldo);
			}
			else {
				conta = new Conta(num, nome);
			}
		System.out.println("Dados da conta");
		System.out.println(conta);
		sc.nextLine();
		 System.out.println("Entre com o valor do dep�sito :");
		 double deposito = sc.nextDouble();
		 conta.depositar(deposito);
		 System.out.println("Dados da conta");
		 System.out.println(conta);
		 System.out.println("Entre com o valor do Saque :");
		 double saque = sc.nextDouble();
		 conta.sacar(saque);;
		 System.out.println("Dados da conta");
		 System.out.println(conta);
			
		sc.close();
	}		
	   
	}
