package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class ProgramAluno {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Aluno aln = new Aluno();
		System.out.println("Enter student data: ");
		System.out.print("Name: ");
		aln.name = sc.nextLine();
		System.out.print("Grade 1: ");
		aln.notaA = sc.nextDouble();
		System.out.print("Grade 2: ");
		aln.notaB = sc.nextDouble();
		System.out.print("Grade 3: ");
		aln.notaC = sc.nextDouble();
		
		System.out.printf("FINAL GRADE =  %.2f POINTS%n", aln.finalGrade());
		
		if (aln.finalGrade() < 60.0) {
			System.out.print("FAILED");
			System.out.printf("FINAL GRADE: %.2f POINTS%n", aln.missingPoints());
		}else {
			System.out.print("PASS");
		}
	}

}
