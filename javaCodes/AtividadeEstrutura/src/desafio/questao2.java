package desafio;

public class questao2 {

	public static void main(String[] args) {
		int[] elementos = {20, 2, 13,21, 5, 73, 0, 100, 9};
		
		String numerosInvertidos = "";
		for(int i=elementos.length-1; i>=0; i--) {
			numerosInvertidos += elementos[i]+" ";
		}
		
		System.out.println(numerosInvertidos);
	}

}
