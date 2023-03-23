package desafio;

public class questao1 {

	public static void main(String[] args) {
		int[] elementos = {20, 2, 13,21, 5, 73, 0, 100, 9};
		
		String numerosAprovado = "";

		for(int i=0; i<elementos.length; i++) {
			if(elementos[i]>10) {
				numerosAprovado+=elementos[i]+" ";
			}
		}
		
		System.out.println(numerosAprovado);
	}

}
