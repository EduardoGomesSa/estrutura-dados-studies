package com.eduardo.estruturadados.vetor;

public class Vetor {
    private String[] elementos;
    private int tamanho;

    public Vetor(int capacidade){
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

    /*public void adiciona(String elemento){
        for(int i = 0; i < elementos.length; i++){
            if(elementos[i] == null){
                elementos[i] = elemento;
                break;
            }
        }
    } */

    public void adiciona(String elemento) throws Exception{
        if(tamanho < elementos.length){
            this.elementos[tamanho] = elemento;
            this.tamanho++;
        } else {
            throw new Exception("Tamanho do vetor insuficiente para novas adições");
        }
    }
}
