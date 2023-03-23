package desafio;

public class ListaSequencial {
	private int[] elementos = {20, 2, 13,21, 5, 73, 0, 100, 9};
	
	public void imprimirMaioresQueDez() {
		String numerosAprovado = "";

		for(int i=0; i<elementos.length; i++) {
			if(elementos[i]>10) {
				numerosAprovado+=elementos[i]+" ";
			}
		}
		
		System.out.println(numerosAprovado);
		
	}
}
