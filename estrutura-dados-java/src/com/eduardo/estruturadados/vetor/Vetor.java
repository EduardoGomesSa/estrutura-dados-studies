package com.eduardo.estruturadados.vetor;

import java.util.Arrays;

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

    public boolean adiciona(String elemento){
        this.aumentaCapacidade();

        if(tamanho < elementos.length){
            this.elementos[tamanho] = elemento;
            this.tamanho++;

            return true;
        }

        return false;
    }

    public boolean adiciona(int posicao, String elemento){
        if(!(posicao >= 0 && posicao < this.tamanho)){
            throw new IllegalArgumentException("Posição inválida");
        }

        this.aumentaCapacidade();

        // mover todos os elementos
        for(int i = this.tamanho-1; i >= posicao; i--){
            this.elementos[i+1] = this.elementos[i];
        }

        this.elementos[posicao] = elemento;
        this.tamanho++;

        return true;
    }

    private void aumentaCapacidade(){
        if(this.tamanho == elementos.length){
            String[] elementosNovos = new String[this.elementos.length * 2];

            for(int i=0; i<this.elementos.length; i++){
                elementosNovos[i] = elementos[i];
            }

            this.elementos = elementosNovos;
        }
    }

    public String busca(int posicao){
        if(!(posicao >= 0 && posicao < this.tamanho)){
            throw new IllegalArgumentException("Posição inválida");
        }

        return this.elementos[posicao];
    }

    public int busca(String elemento){
        for (int i = 0; i < this.tamanho; i++){
            if(elementos[i].equals(elemento)){
                return i;
            }
        }

        return -1;
    }

    public int getTamanho(){
        return this.tamanho;
    }

    @Override
    public String toString() {
        StringBuilder stringDoVetor = new StringBuilder();
        stringDoVetor.append("[");

        for (int i = 0; i < this.tamanho - 1; i++){
            stringDoVetor.append(this.elementos[i]);
            stringDoVetor.append(", ");
        }

        if(this.tamanho > 0){
            stringDoVetor.append(this.elementos[this.tamanho-1]);
        }

        stringDoVetor.append("]");
        return stringDoVetor.toString();
    }
}
