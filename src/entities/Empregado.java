package entities;

public class Empregado {
	
	private Integer id;
	private String nome;
	private Double salario;
	
	public Empregado(Integer id, String nome, Double salary) {
		this.id = id;
		this.nome = nome;
		this.salario = salary;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSalary() {
		return salario;
	}
	
    public void aumentoSalario(double porcentagem) {
		
		salario += salario * porcentagem / 100.0;
	
	}
    public String toString() {
    	return id + ", " + nome + ", " + String.format("%.2f", salario);
    	
    }

}
