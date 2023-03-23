package listas;

public class testarLista {
	public static void main(String[] args) {
		listasSequenciais lista = new listasSequenciais(); 
		
		lista.inserirElemento(42);
		lista.inserirElemento(99);
		lista.inserirElemento(77);
		
		System.out.println("A lista esta cheia? "+lista.estaCheia());
		
		System.out.println("A lista esta vazia? "+lista.estaVazia());
		
		lista.remover(1);
		
		//lista.removerPorPosicao(0);
		lista.adicionarPorPosicao(0, 88);
		
		System.out.println("Elementos "+lista.imprimirLista());
	}
}
