package application;

import java.util.Locale;
import java.util.Scanner;

public class ProgramExercicioMatriz {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Digite o numero de linhas da matriz: ");
		int l = sc.nextInt();
		System.out.println("Digite o numero de colunas da matriz: ");
		int c = sc.nextInt();
		int[][] mat = new int[l][c];
		for (int i=0; i<l; i++) {
			System.out.println("Digite os numeros desejados para a linha: " + (i + 1));
			for(int j=0; j<c; j++) {
				mat[i][j] = sc.nextInt();	
			}
		}
		for (int i=0; i<l; i++) {
			for(int j=0; j<c; j++) {
				System.out.print(mat[i][j] + " ");
				if (j == c - 1) {
					System.out.println();
				}
				
			}
		}
			System.out.println("Digite para fazer a pesquisa: ");
			int p = sc.nextInt();
			for (int i=0; i<l; i++) {
				for(int j=0; j<c; j++) {
					if (mat[i][j] == p) {
						System.out.println("Posição na matriz: " + "Linha: " + i + " Coluna: " + j);
						if(j -1 > -1) {
						System.out.println("Numero da Esquerda :  " + mat[i][j - 1]);
						}
						if(j + 1 < c - 1) {
						System.out.println("Numero da Direita :  " + mat[i][j + 1]);
						}
						if(i - 1 > -1) {
						System.out.println("Numero acima :  " + mat[i - 1][j]);
						}
						if(i + 1 < l) {
							System.out.println("Numero abaixo :  " + mat[i + 1][j]);
						}
					}
					
				}
		
	}
		sc.close();
	}
}



