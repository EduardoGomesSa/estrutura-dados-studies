package com.eduardo.estruturadados.vetor.labs;

import com.eduardo.estruturadados.vetor.Lista;

import java.util.ArrayList;

public class Exe05 {
    public static void main(String[] args){
        ArrayList<String> arrayList = new ArrayList<String>(5);
        arrayList.add("a");
        arrayList.add("b");
        arrayList.add("c");
        arrayList.add("d");
        arrayList.add("e");

        System.out.println("Método ArrayList nativo");
        System.out.println(arrayList);
        arrayList.clear();
        System.out.println(arrayList);

        Lista<String> lista = new Lista<String>(5);
        lista.adiciona("A");
        lista.adiciona("B");
        lista.adiciona("C");
        lista.adiciona("D");
        lista.adiciona("E");

        System.out.println("Método Lista criado");
        System.out.println(lista);
        lista.limpar();
        System.out.println(lista);
    }
}
