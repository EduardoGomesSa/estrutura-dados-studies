package com.eduardo.estruturadados.vetor.teste;

import com.eduardo.estruturadados.vetor.Lista;

public class Aula11 {
    public static void main(String[] args){
        Lista<String> vetor = new Lista<String>(2);

        vetor.adiciona("elemento 1");
        vetor.adiciona("elemento 2");

        System.out.println(vetor);
    }
}
