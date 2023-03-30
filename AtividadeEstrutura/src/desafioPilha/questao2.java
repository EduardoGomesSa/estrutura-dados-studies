package desafioPilha;

public class questao2 {
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
		
		System.out.println("Elemento: "+elementos[topo]+" Posição: "+topo);
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
}
