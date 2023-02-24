/*
Um exercicio sobre matriz,
onde você escolhe a quantidade de linhas e colunas,
onde depois você onde um dos numeros digitador para saber
sua posição e a posição dos numero proximos.
*/

import java.util.Locale;
import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		
		char cont = 'S';
		
		while(cont == 'S'){
		
		System.out.println("Escolha a quantidade  de linhas para a matriz");
		int l = sc.nextInt();
		System.out.println("Escolha a quantidade de colunas");
		int c = sc.nextInt();
		
		int mat[][] = new int[l][c];
		
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[i].length;j++) {
				System.out.print("Digite o " + (j+1) +"º numero da "+ (i + 1)+"ª linha: ");
				mat[i][j] = sc.nextInt();
				
			}	
		}
		System.out.print("Deseja descobrir a posição de qual numero: ");
		int x = sc.nextInt();
	
		
		System.out.println("Numero: "+  x );
		
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[i].length;j++) {
				if(mat[i][j] == x) {
					System.out.println("Posição: " + i + "," + j);
					
					if ( j>0) {
						System.out.println("Esquerda: " + mat[i] [j-1])
					;}
					
					if ( j<mat[i].length-1) {
						System.out.println("Direita: " + mat[i] [j+1])
					;}
					
					if ( i<mat.length-1) {
						System.out.println("Em baixo: " + mat[i+1] [j])
					;}
					
					if ( i>0) {
						System.out.println("Em cima: " + mat[i-1] [j])
					;}
					
					;}
					}
					}
					System.out.println("Deseja fazer novamente? S/N");
					cont = sc.next().toUpperCase().charAt(0);
		
							
							
							                   
		
		;}
		sc.close();	
		
	}

	
		
}