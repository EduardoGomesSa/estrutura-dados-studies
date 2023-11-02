package lista.teste;

import lista.ListaEncadeada;

public class ListaEncadeadaTeste {
    public static void main(String[] args) {
        ListaEncadeada<Integer> lista = new ListaEncadeada<Integer>();
        lista.adiciona(1);
        lista.adiciona(2);
        lista.adiciona(3);

        System.out.println("Tamanho: "+lista.getTamanho());
        System.out.println(lista);
    }
}
