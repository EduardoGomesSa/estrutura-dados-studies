package com.eduardo.estruturadados.vetor;

import java.lang.reflect.Array;

public class Lista<T> {
    private T[] elementos;
    private int tamanho;

    public Lista(int capacidade){
        this.elementos = (T[])new Object[capacidade];
        this.tamanho = 0;
    }

    public Lista(){
        this(10);
    }

    public Lista(int capacidade, Class<T> tipoClasse){
        this.elementos = (T[]) Array.newInstance(tipoClasse, capacidade);
        this.tamanho = 0;
    }

    public boolean adiciona(T elemento){
        this.aumentaCapacidade();

        if(tamanho < elementos.length){
            this.elementos[tamanho] = elemento;
            this.tamanho++;

            return true;
        }

        return false;
    }

    public boolean adiciona(int posicao, T elemento){
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
            T[] elementosNovos = (T[])new Object[this.elementos.length * 2];

            for(int i=0; i<this.elementos.length; i++){
                elementosNovos[i] = elementos[i];
            }

            this.elementos = elementosNovos;
        }
    }

    public T obtem(int posicao){
        return this.busca(posicao);
    }

    public T busca(int posicao){
        if(!(posicao >= 0 && posicao < this.tamanho)){
            throw new IllegalArgumentException("Posição inválida");
        }

        return this.elementos[posicao];
    }

    public int busca(T elemento){
        for (int i = 0; i < this.tamanho; i++){
            if(elementos[i].equals(elemento)){
                return i;
            }
        }

        return -1;
    }

    public int ultimoIndice(T elemento){
        int ultimaPos = -1;

        for(int i = this.tamanho-1; i >= 0; i--){
            if(elementos[i].equals(elemento)){
                return i;
            }
        }
        return -1;
    }

    public boolean contem(T elemento){
        return busca(elemento) > -1;
    }

    public void remove(int posicao){
        if(!(posicao >= 0 && posicao < this.tamanho)){
            throw new IllegalArgumentException("Posição inválida");
        }

        for(int i=posicao; i < this.tamanho-1; i++){
            this.elementos[i] = this.elementos[i+1];
        }

        this.tamanho--;
    }

    public void remove(T elemento){
        int pos = this.busca(elemento);

        if(pos > -1){
            this.remove(pos);
        }
    }

    public void limpar(){
        //opcao 1
        //this.elementos = (T[]) new Object[this.elementos.length];

        //opcao 2
        //this.tamanho = 0;

        //opcao 3
        for(int i=0; i<this.tamanho; i++){
            this.elementos[i] = null;
        }
        this.tamanho = 0;
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
