package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Colaborador;
import entities.ContratoPh;
import entities.Departamento;
import entities.enums.NivelColaborador;

public class ProgramColaborador {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Digite o nome do Departamento: ");
		String departamento = sc.nextLine();
		System.out.println("Digite os dados do Trabalhador");
		System.out.println("Digite o nome:");
		String nome = sc.nextLine();
		System.out.println("Digite o nivel:");
		String nivel = sc.nextLine();
		System.out.println("Digite o salario base:");
		double  salarioBase = sc.nextDouble();
		
		Colaborador colaborador = new Colaborador(nome, NivelColaborador.valueOf(nivel), salarioBase, new Departamento(departamento));
		
		System.out.println("Digite Quantos contratos o trabalhador terá:");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println("Digite os dados do contrato #" + i );
			System.out.print("Data (DD/MM/YYYY): ");
			Date data = sdf.parse(sc.next()); 
			System.out.print("Valor por hora: ");
			double valorPorHora = sc.nextDouble();
			System.out.print("Duração do Contrato (Horas): ");
			int horas = sc.nextInt();
			ContratoPh contrato = new ContratoPh(data, valorPorHora, horas);
			colaborador.addContrato(contrato);
		}
		
		System.out.println();
		System.out.print("Digite o mês e ano para calcular o salário (MM/YYYY): ");
		String mesEAno = sc.next();
		Integer mes = Integer.parseInt(mesEAno.substring(0, 2));
		int ano = Integer.parseInt(mesEAno.substring(3));
		System.out.println("Nome: " + colaborador.getNome());
		System.out.println("Departamento: " + colaborador.getDepartamento().getNome());
		System.out.println("Salario Bruto:  " + mesEAno + ": " + String.format("%.2f", colaborador.salarioBruto(mes, ano)));
		
		sc.close();
	}

}
