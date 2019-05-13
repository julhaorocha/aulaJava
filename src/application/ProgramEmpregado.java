package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Empregado;

public class ProgramEmpregado {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Empregado> list = new ArrayList<>();

		System.out.println("Programa para registro de funcion�rio e respectivos sal�rios:");
		System.out.println("Quantos empregados ser�o registrados?");
		int n = sc.nextInt();
		for (int i=0; i<n; i++) {
			sc.nextLine();
			System.out.println("Empregado #" + (i + 1) +":" );
			System.out.println("Digite o ID do funcion�rio");
			Integer id = sc.nextInt();
			sc.nextLine();
			System.out.println("Digite o nome do funcion�rio :");
			String nome = sc.nextLine();
			System.out.println("Digite o sal�rio do funcion�rio");
			Double salario = sc.nextDouble();
			list.add(new Empregado(id, nome, salario));			
		}
		System.out.println();
		System.out.println("Digite o ID do funcion�rio para aumentar o sal�rio :");
		Integer id = sc.nextInt();
		System.out.println(id);
		Empregado emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
			if (emp == null) {
				System.out.println("Empregado n�o existe!");		
			}
			else {
				System.out.println("Entre com a porcentagem:");
				double porcentagem = sc.nextDouble();
				emp.aumentoSalario(porcentagem);
				
			}
		System.out.println();
		System.out.println("Lista de empregados: ");	
		for(Empregado obj : list) {
			
			System.out.println(obj);
			
		}
		sc.close();
	}

}
