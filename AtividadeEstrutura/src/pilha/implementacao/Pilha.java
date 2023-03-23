package pilha.implementacao;

public class Pilha {
	private Integer[] elementos = new Integer[10];
	
	private Integer topo = null;
	
	public boolean estaCheia() {
		if(topo == null) {
			return false;
		}
		
		return topo == elementos.length-1;
	}
	
	public boolean estaVazia() {
		return topo == null;
	}
}
