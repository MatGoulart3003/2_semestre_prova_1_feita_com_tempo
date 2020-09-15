package br.edu.univas.main;

import java.util.Scanner;

public class Questao1 {
	
	static Scanner read = new Scanner(System.in);
	
	static int tamanhoVetor = 10;
	
	public static void main(String[] args) {
		
		int notaInserida[] = new int [tamanhoVetor]; 
		int resultadoNotas[] = new int [tamanhoVetor*2];
		
		System.out.println("Digite as notas do seus "+ tamanhoVetor +" alunos" );
		capturaNotas(notaInserida);
		verificaAprovados (notaInserida,resultadoNotas);
		System.out.println("O numero de aprovados foi: " + verificaQuantAprov(resultadoNotas) );
					
		read.close();
	}
	
	public static void capturaNotas (int nota[]) {
		
		for (int i = 0; i < tamanhoVetor; i++) {
			nota[i] = read.nextInt();
		}
	
	}
	
	public static void verificaAprovados(int nota[],int result []) {
		
		int j = 0;
		
		for (int i = 0; i < (tamanhoVetor * 2); i++) {
			
			result [i] =  nota [j];
			i++;
			if (nota[j] >= 60) {
				
				result [i] = 1;
				
			}else {
				
				result [i] = 0;
				
			}
			
			j++;
			
		}
		
	}
	
	public static int verificaQuantAprov(int result []) {
		
		int cont = 0;
		for (int i = 1; i < tamanhoVetor * 2; i = i+2) {
			
			cont = cont + result[i];
					
		}
		
		return cont;
	}
	
}
