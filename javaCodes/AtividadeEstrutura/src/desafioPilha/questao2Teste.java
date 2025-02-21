package desafioPilha;

import pilha.implementacao.Pilha;

public class questao2Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		questao2 pilha = new questao2();
		
		pilha.empilhar(10);
		pilha.empilhar(9);
		pilha.empilhar(11);
		
		System.out.println("--------------------------------------------------------");
		
		questao3 pilha2 = new questao3();
		
		pilha2.empilhar("A");
		pilha2.empilhar("B");
		pilha2.empilhar("C");
		pilha2.empilhar("D");
		pilha2.empilhar("F");
		pilha2.empilhar("G");
		
		pilha2.desempilhar();
		
		System.out.println("--------------------------------------------------------");
		
		questao4 pilha3 = new questao4();
		
		pilha3.empilhar("Livro1");
		pilha3.empilhar("Livro2");
		pilha3.empilhar("Livro3");
		pilha3.empilhar("Livro4");
		pilha3.empilhar("Livro5");
		pilha3.empilhar("Livro6");
		pilha3.empilhar("Livro7");
		
		System.out.println("Quantos passo até encontrar o livro selecionado: "+pilha3.desempilharAte("Livro6"));
	}

}
