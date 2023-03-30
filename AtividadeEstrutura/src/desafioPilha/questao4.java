package desafioPilha;

public class questao4 {
	private String[] elementos = new String[10];
	
	private Integer topo = null;
	
	public void empilhar(String elemento) {
		if(estaCheia()) return;
		
		if(topo == null) {
			topo = 0;
		}else {
			topo +=1;
		}
		
		elementos[topo] = elemento;
	}
	
	public String desempilhar() {
		if(estaVazia()) return null;
		
		String desempilhado = elementos[topo];
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
	
	public Integer desempilharAte(String livro) {
		int count = 0;
		for(int i=0; i<elementos.length; i++) {
			if(desempilhar() != livro){
				count++;
			}else {
				break;
			}
		}
		return count;
	}
}
