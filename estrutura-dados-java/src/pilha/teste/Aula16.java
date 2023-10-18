package pilha.teste;

import pilha.Pilha;

public class Aula16 {
    public static void main(String[] args){
        Pilha<Integer> pilha = new Pilha<>();

        System.out.println(pilha.topo());

        pilha.empilha(42);
        System.out.println(pilha.topo());

        pilha.empilha(99);
        System.out.println(pilha.topo());
    }
}
