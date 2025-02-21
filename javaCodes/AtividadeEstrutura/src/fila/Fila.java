package fila;

public class Fila {
	private Integer[] elementos = new Integer[10];
	
	private int proximoElemento = 0;
	
	public boolean estaCheia() {
		return proximoElemento == elementos.length;
	}
	
	public boolean estaVazia() {
		return proximoElemento == 0;
	}
	
	public void enfileirar(Integer elemento) {
		if(estaCheia()) return;
		
		elementos[proximoElemento] = elemento;
		
		proximoElemento++;
	}
	
	public void imprimir() {
		String aFila = "";
		
		for(int i=0; i<elementos.length; i++) {
			if(elementos[i]!=null){
				aFila += "[ "+elementos[i]+" ] ";
			}
		}
		
		System.out.println(aFila);
	}
	
	public void desenfileirar() {
		if(estaVazia())return;
		
		for(int i=0; i<elementos.length-1; i++) {
			elementos[i] = elementos[i+1];
		}
		
		elementos[elementos.length - 1] = null;
		
		proximoElemento--;
	}
	
	public int tamanhoDaFila() {
		int tamanho = 0;
		if(estaVazia())return tamanho;
		
		for(int i=0; i<elementos.length; i++) {
			if(elementos[i]!=null) {
				tamanho++;
			}
		}
		return tamanho;
	}
	
	public int proximoASair() {
		return elementos[0];
	}
}
