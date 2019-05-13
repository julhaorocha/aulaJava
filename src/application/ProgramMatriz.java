package application;

import java.util.Locale;
import java.util.Scanner;

public class ProgramMatriz {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o tamanho da matriz: ");
		int n = sc.nextInt();
		int[][] mat = new int[n][n]; //declaração e instanciação da matriz;
		
		for (int i=0; i<n; i++) {//dois for para percorrer a matriz;
			for(int j=0; j<n; j++) {
				System.out.println("Digite o numero desejado: ");
				mat[i][j] = sc.nextInt();	
			}
		}
		System.out.println("Diagonal principal: ");	
			for(int i=0; i<n; i++) {
				System.out.print(mat[i][i] + " ");
			}
			System.out.println();	
			
			int count = 0;
			for (int i=0; i<n; i++) {
				for(int j=0; j<n; j++) {
					if (mat[i][j] < 0)
					count++;	
				   }
			}
			
			sc.close();	
		}

	}


