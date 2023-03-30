package pilha.implementacao;

public class TestePilha {
	public static void main(String[] args) {
		Pilha pilha = new Pilha();
		
		pilha.empilhar(10);
		pilha.empilhar(20);
		pilha.empilhar(30);
		pilha.empilhar(40);
		pilha.empilhar(50);
		pilha.empilhar(60);
		
		//pilha.desempilhar();
		//pilha.desempilhar();
		
		System.out.println("Pilha está cheia? "+pilha.estaCheia());
		System.out.println("Pilha está vazia? "+pilha.estaVazia());
		
		pilha.imprimir();
		pilha.imprimirInverso();
	}
}
