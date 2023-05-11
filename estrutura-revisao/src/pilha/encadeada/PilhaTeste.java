package pilha.encadeada;

public class PilhaTeste {

	public static void main(String[] args) {
		Pilha pilha = new Pilha();
		
		pilha.empilhar(42);
		pilha.empilhar(99);
		pilha.empilhar(7);
		
		pilha.exibirPilha();
		
		System.out.println("--------------");
		pilha.desempilhar();
		
		pilha.exibirPilha();

	}

}
