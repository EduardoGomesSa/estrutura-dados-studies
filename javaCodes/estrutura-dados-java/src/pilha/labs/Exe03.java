package pilha.labs;

import pilha.Pilha;

public class Exe03 {
    public static void main(String[] args) {
        Pilha<Livro> pilha = new Pilha<Livro>(20);

        Livro livro1 = new Livro();
        livro1.setIsbn("1234");
        livro1.setNome("O guia do mochileiro das galaxias");
        livro1.setAutor("Douglas Adams");
        livro1.setAnoLancamento(2000);

        Livro livro2 = new Livro();
        livro2.setIsbn("2234");
        livro2.setNome("O restaurante no fim do universo");
        livro2.setAutor("Douglas Adams");
        livro2.setAnoLancamento(2001);

        Livro livro3 = new Livro();
        livro3.setIsbn("3234");
        livro3.setNome("A vida, o universo e tudo o mais");
        livro3.setAutor("Douglas Adams");
        livro3.setAnoLancamento(2002);

        Livro livro4 = new Livro();
        livro4.setIsbn("4234");
        livro4.setNome("Até mais e obrigado pelos peixes");
        livro4.setAutor("Douglas Adams");
        livro4.setAnoLancamento(2003);

        Livro livro5 = new Livro();
        livro5.setIsbn("5234");
        livro5.setNome("Praticamente inofenciva");
        livro5.setAutor("Douglas Adams");
        livro5.setAnoLancamento(2004);

        Livro livro6 = new Livro();
        livro6.setIsbn("6234");
        livro6.setNome("E tem outra coisa...");
        livro6.setAutor("Douglas Adams");
        livro6.setAnoLancamento(2005);

        System.out.println("Pilha de livro criada, pilha está vazia? "+pilha.estaVazia());
        System.out.println("Empilhando livros na pilha: ");

        pilha.empilha(livro1);
        pilha.empilha(livro2);
        pilha.empilha(livro3);
        pilha.empilha(livro4);
        pilha.empilha(livro5);
        pilha.empilha(livro6);

        System.out.println(pilha.tamanho()+" livros foram empilhados: ");
        System.out.println(pilha);

        System.out.println("Pilha de livro criada, pilha está vazia? "+pilha.estaVazia());
        System.out.println("Espiando o topo da pilha: "+pilha.topo());

        System.out.println("Desempilhando livros da pilha:");
        while (!pilha.estaVazia()){
            System.out.println("Desempilhando livro: "+ pilha.desempilha());
        }

        System.out.println("Todos os livros foram desempilhados. Pilha vazia? "+pilha.estaVazia());
    }
}
