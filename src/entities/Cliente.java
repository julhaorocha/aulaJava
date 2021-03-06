package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Cliente {
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private String nome;
	private String email;
	private Date niver;
	
	public Cliente() {
		
	}
	
	public Cliente(String nome, String email, Date niver) {
		this.nome = nome;
		this.email = email;
		this.niver = niver;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getNiver() {
		return niver;
	}

	public void setNiver(Date niver) {
		this.niver = niver;
	}

	@Override
	public String toString() {
		return  nome + " -  " + "(" + sdf.format(niver) + ")"  + " -  "  + email + " ";
	}
	
	

}
