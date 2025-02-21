package com.eduardo.estruturadados.vetor.labs;

import com.eduardo.estruturadados.vetor.Lista;

public class Exe01 {
    public static void main(String[] args){
        Lista<String> lista = new Lista<String>(5);

        lista.adiciona("A");
        lista.adiciona("C");
        lista.adiciona("C");

        System.out.println(lista.contem("A"));
        System.out.println(lista.contem("B"));
        System.out.println(lista.contem("E"));
    }
}
