package pilha.implementacao;

public class Pilha {
	private Integer[] elementos = new Integer[10];
	
	private Integer topo = null;
	
	public void empilhar(Integer elemento) {
		if(estaCheia()) return;
		
		if(topo == null) {
			topo = 0;
		}else {
			topo +=1;
		}
		
		elementos[topo] = elemento;
	}
	
	public Integer desempilhar() {
		if(estaVazia()) return null;
		
		Integer desempilhado = elementos[topo];
		elementos[topo] = null;
		
		if(topo>0) {
			topo -= 1;
		}else {
			topo = null;
		}
		
		return desempilhado;
	}
	
	public boolean estaCheia() {
		if(topo == null) {
			return false;
		}
		
		return topo == elementos.length-1;
	}
	
	public boolean estaVazia() {
		return topo == null;
	}
	
	public void imprimir() {
		String elementos = "";
		
		for(int i=0; i<this.elementos.length; i++) {
			if(this.elementos[i] != null) {
				elementos += "[ "+ this.elementos[i] + " ]";
			}
		}
		
		System.out.println(elementos);
	}
	
	public void imprimirInverso() {
		String valores = "";
		for(int i = this.elementos.length-1; i >=0; i--) {
			if(this.elementos[i] != null) {
				valores += "[ "+elementos[i]+" ]";
			}
		}
		
		System.out.println(valores);
	}
}
