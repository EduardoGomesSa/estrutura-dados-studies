package aula01;

import java.util.Scanner;

class q6 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de numeros: ");
		int numero = entrada.nextInt();
		
		System.out.println(fatorial(numero, numero));
		
		entrada.close();
	}
	
	public static int fatorial(int valor,int numero) {
		numero -= 1;
		
		if(numero > 0) {
			valor *= numero;
			return fatorial(valor, numero);
		}
		
		return valor;
	}
}