package br.edu.univas.main;

import java.util.Scanner;

public class Questao3 {
	static int tamanhoInicial = 0;
	public static void main(String[] args) {
		Scanner read = new Scanner (System.in);
		
		String palavra = read.nextLine();
		
		int tamanho = palavra.length();
		tamanhoInicial = tamanho - 1;
		String novaPal = "";
		char leLetra = ' ';
				
		novaPal = invertePalavra (tamanho, leLetra, novaPal, palavra);
		if (verificaPalin(palavra,novaPal,tamanho - 1)){
			System.out.println("A palavra digitada é um palímetro!!");			
		}else {
			System.out.println("a palavra digitada não é um palímetro");			
		}
		
		
		read.close();
	}

	public static String invertePalavra (int tamanho, char leLetra, String novaPal, String palavra) {
		
		for (int i = tamanho; i > 0 ; i--) {
			
			leLetra = palavra.charAt(i-1);
			
			novaPal = novaPal + leLetra;
			
		}
		
		return novaPal;
	}
	
	public static boolean verificaPalin (String palavra, String novaPal, int tamanho) {
		
		if (tamanho == tamanhoInicial) {
			
			if (! palavra.substring(tamanho).equals(novaPal.substring(tamanho))) {
				
				return false;
			}
			
		}else if (! palavra.substring(tamanho, tamanho+1).equals(novaPal.substring(tamanho, tamanho+1))) {
			
			return false;
			
		}else if (tamanho == 0) {
			
			return true;
			
		}

		return verificaPalin(palavra,novaPal,tamanho - 1);
		
	}
}
