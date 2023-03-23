package listas;

public class listasSequenciais {
	private Integer[] elementos = new Integer[10];
	
	public int quantidadeElementos() {
		int qtd = 0;
		for(int i=0; i<elementos.length; i++) {
			if(elementos[i] != null) {
				qtd++;
			}
		}
		
		return qtd;
	}
	
	public boolean estaCheia() {
		return quantidadeElementos() == elementos.length;
	}
	
	public boolean estaVazia() {
		return quantidadeElementos() == 0;
	}
	
	public void inserirElemento(int elemento) {
		if(estaCheia()) return;
		
		Integer posicaoDisponivel = null;
		for(int i=0; i<elementos.length; i++) {
			if(elementos[i]==null) {
				posicaoDisponivel = i;
				break;
			}
		}
		
		elementos[posicaoDisponivel] = elemento;
	}
	
	public String imprimirLista() {
		String valor = "";
		for(int i=0; i<elementos.length; i++) {
			if(elementos[i] != null) {
				valor += elementos[i]+" ";
			}
		}
		return valor;
	}
	
	public void remover(int valor) {
		
		for(int i=0; i<elementos.length; i++) {
			if(elementos[i] == valor) {
				elementos[i] = null;
				break;
			}
			break;
		}
	}
	
	public void removerPorPosicao(int posicao) {
		if(elementos.length < posicao) return;
		if(elementos[posicao] == null) return;
		
		elementos[posicao] = null;
	}
	
	public void adicionarPorPosicao(int posicao, int valor) {
		if(elementos.length < posicao) return;
		if(elementos[posicao] != null) return;
		
		elementos[posicao] = valor;
	}
}
