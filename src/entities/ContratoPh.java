package entities;

import java.util.Date;

public class ContratoPh {
	
	private Date data;
	private Double valorPorHora;
	private Integer horas;
	
	public ContratoPh() {
		
	}

	public ContratoPh(Date data, Double valorPorHora, Integer horas) {
		this.data = data;
		this.valorPorHora = valorPorHora;
		this.horas = horas;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Double getValorPorHora() {
		return valorPorHora;
	}

	public void setValorPorHora(Double valorPorHora) {
		this.valorPorHora = valorPorHora;
	}

	public Integer getHoras() {
		return horas;
	}

	public void setHoras(Integer horas) {
		this.horas = horas;
	}
	public double valorTotal() {
		return valorPorHora * horas;
	}

	@Override
	public String toString() {
		return "ContratoPh [data=" + data + ", valorPorHora=" + valorPorHora + ", horas=" + horas + "]";
	}


}
