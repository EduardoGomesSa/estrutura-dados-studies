package com.eduardo.estruturadados.vetor.teste;

import com.eduardo.estruturadados.vetor.VetorObjetos;

public class Aula10 {
    public static void main(String[] args){
        VetorObjetos vetor = new VetorObjetos(3);

        Contato c1 = new Contato("contato 1", "123-456", "contato1@gmail.com");
        Contato c2 = new Contato("contato 2", "321-546", "contato2@gmail.com");
        Contato c3 = new Contato("contato 3", "213-654", "contato3@gmail.com");

        Contato c4 = new Contato("contato 3", "213-654", "contato3@gmail.com");

        vetor.adiciona(c1);
        vetor.adiciona(c2);
        vetor.adiciona(c3);

        System.out.println(vetor);

        int pos = vetor.busca(c4);

        if(pos > -1){
            System.out.println("Elemento existe no vetor");
        }else {
            System.out.println("Elemento não existe no vetor");
        }
    }
}
