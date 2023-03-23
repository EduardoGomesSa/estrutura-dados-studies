package fila;

public class FilaTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fila fila = new Fila();
		
		fila.enfileirar(4);
		fila.enfileirar(2);
		fila.enfileirar(7);
		fila.enfileirar(8);
		fila.enfileirar(5);
		
		System.out.println("A fila está cheia?"+fila.estaCheia());
		System.out.println("A fila está vazia?"+fila.estaVazia());
		System.out.println("Tamanho da fila: "+fila.tamanhoDaFila());
		System.out.println("Próximo elemento a sair: "+fila.proximoASair());
		
		fila.desenfileirar();
		
		System.out.println("Próximo elemento a sair: "+fila.proximoASair());
		
		fila.imprimir();
	}

}
