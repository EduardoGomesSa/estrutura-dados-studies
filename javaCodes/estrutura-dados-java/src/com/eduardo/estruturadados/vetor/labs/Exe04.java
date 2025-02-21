package com.eduardo.estruturadados.vetor.labs;

import com.eduardo.estruturadados.vetor.Lista;

public class Exe04 {
    public static void main(String[] args){
        Lista<String> lista = new Lista<String>(5);
        lista.adiciona("a");
        lista.adiciona("b");
        lista.adiciona("c");
        lista.adiciona("d");
        lista.adiciona("e");

        System.out.println(lista.obtem(0));
        System.out.println(lista.obtem(2));
        System.out.println(lista.obtem(4));
    }
}
