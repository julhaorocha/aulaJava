package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.ContratoPh;
import entities.Departamento;
import entities.enums.NivelColaborador;

public class Colaborador {
	
	private String nome;
	private NivelColaborador nivel;
	private double salarioBase;
	
	private Departamento departamento;
	private List<ContratoPh> contratos = new ArrayList<>();

	public Colaborador() {
		
	}

	public Colaborador(String nome, NivelColaborador nivel, double salarioBase, Departamento departamento) {
		this.nome = nome;
		this.nivel = nivel;
		this.salarioBase = salarioBase;
		this.departamento = departamento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public NivelColaborador getNivel() {
		return nivel;
	}

	public void setNivel(NivelColaborador nivel) {
		this.nivel = nivel;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public List<ContratoPh> getContratos() {
		return contratos;
	}
	
	public void addContrato(ContratoPh contrato) {
		contratos.add(contrato);
	}
	public void removerContrato(ContratoPh contrato) {
		contratos.remove(contrato);
	}
	
	public double salarioBruto(int mes, int ano) {
		
		double soma = salarioBase;
		Calendar cal = Calendar.getInstance();
		for (ContratoPh c : contratos) {
			cal.setTime(c.getData());
			int c_ano = cal.get(Calendar.YEAR);
			int c_mes = 1 + cal.get(Calendar.MONTH);
			if (mes == c_mes && ano == c_ano) {
				soma = soma + c.valorTotal();
			}
		}
		return soma;
	}

	@Override
	public String toString() {
		return "Colaborador [nome=" + nome + ", nivel=" + nivel + ", salarioBase=" + salarioBase + ", departamento="
				+ departamento + ", contratos=" + contratos + "]";
	}
		
	}
	

