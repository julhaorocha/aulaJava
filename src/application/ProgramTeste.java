package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import entities.Colaborador;
import entities.ContratoPh;
import entities.Departamento;
import entities.enums.NivelColaborador;

public class ProgramTeste {

	public static void main(String[] args) throws ParseException {
		String nome = "Alex";
		String nivel = "JR";
		double salarioBase = 1200.00;
		Departamento  departamento =new Departamento("Design");
		Colaborador colaborador = new Colaborador(nome, NivelColaborador.valueOf(nivel), salarioBase, departamento);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date data = sdf.parse("12/08/2018");
		double valorPorHora = 50.00;
		int horas = 20;
		ContratoPh contrato = new ContratoPh(data, valorPorHora, horas);
		System.out.println(contrato.valorTotal());
		colaborador.addContrato(contrato);
		String mesEAno = "08/2018";
		int mes = Integer.parseInt(mesEAno.substring(0, 2));
		int ano = Integer.parseInt(mesEAno.substring(3));
		
		System.out.println(colaborador.salarioBruto(mes, ano));
	}

}
