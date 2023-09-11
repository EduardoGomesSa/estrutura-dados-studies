package com.eduardo.estruturadados.vetor.teste;

import com.eduardo.estruturadados.vetor.VetorObjetos;

public class Aula10 {
    public static void main(String[] args){
        VetorObjetos vetor = new VetorObjetos(3);

        vetor.adiciona(2);
        vetor.adiciona(3);
        vetor.adiciona(4);

        System.out.println(vetor);
    }
}
