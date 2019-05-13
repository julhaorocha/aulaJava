package entities;

public class Aluno {
	
	public String name;
	public double notaA, notaB, notaC;
	
	public double finalGrade() {
		return  notaA + notaB + notaC;	
	}
	
	public double missingPoints() {
		if (finalGrade() < 60.0) {
			return 60.0 - finalGrade();
		}
		else{
			return 0.0;
		}
}
}
