package br.edu.univas.main;

import java.util.Scanner;

public class Questao2 {
		
	public static void main(String[] args) {
		Scanner read = new Scanner (System.in);
		
		String palavra = read.nextLine();
		
		int tamanho = palavra.length();
		String novaPal = "";
		char leLetra = ' ';
		
		
		
		System.out.println(invertePalavra (tamanho, leLetra, novaPal, palavra));
		
		read.close();
	}

	public static String invertePalavra (int tamanho, char leLetra, String novaPal, String palavra) {
		
		for (int i = tamanho; i > 0 ; i--) {
			
			leLetra = palavra.charAt(i-1);
			
			novaPal = novaPal + leLetra;
			
		}
		
		return novaPal;
	}
	
}