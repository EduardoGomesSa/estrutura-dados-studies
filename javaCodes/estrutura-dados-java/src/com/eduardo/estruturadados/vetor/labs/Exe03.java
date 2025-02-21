package com.eduardo.estruturadados.vetor.labs;

import com.eduardo.estruturadados.vetor.Lista;

public class Exe03 {
    public static void main(String[] args){
        Lista<String> lista = new Lista<String>(5);

        lista.adiciona("A");
        lista.adiciona("B");
        lista.adiciona("C");
        lista.adiciona("E");
        lista.adiciona("L");

        System.out.println(lista);

        lista.remove("A");

        System.out.println(lista);

        lista.remove("C");

        System.out.println(lista);
    }
}
