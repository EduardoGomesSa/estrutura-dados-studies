package pilha.teste;

import pilha.Pilha;

public class Aula14 {
    public static void main(String[] args){
        Pilha<Integer> pilha = new Pilha<Integer>();

        for (int i=0; i<=10; i++){
            pilha.empilha(i);
        }

        System.out.println(pilha);
        System.out.println(pilha.tamanho());
    }
}
