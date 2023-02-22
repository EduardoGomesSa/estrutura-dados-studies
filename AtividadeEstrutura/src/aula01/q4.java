package aula01;

import java.util.Scanner;

class q4 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de numeros: ");
		int qtdNumeros = entrada.nextInt();
		
		int[] conjuntoNumeros = new int[qtdNumeros];
		for(int i=0; i<qtdNumeros; i++) {
			System.out.println("Digite o numero "+i+": ");
			
			conjuntoNumeros[i] = entrada.nextInt();;
		}
		String numeroDezExiste = "nao";
		for(int i=0; i<qtdNumeros; i++) {
			if(conjuntoNumeros[i] == 10) {
				numeroDezExiste = "sim";
			}
		}
		
		System.out.println("Numero dez existe no vetor? "+numeroDezExiste);

	}

}
