package com.eduardo.estruturadados.vetor;

public class VetorObjetos {
    private Object[] elementos;
    private int tamanho;

    public VetorObjetos(int capacidade){
        this.elementos = new Object[capacidade];
        this.tamanho = 0;
    }

    public boolean adiciona(Object elemento){
        this.aumentaCapacidade();

        if(tamanho < elementos.length){
            this.elementos[tamanho] = elemento;
            this.tamanho++;

            return true;
        }

        return false;
    }

    public boolean adiciona(int posicao, Object elemento){
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
            Object[] elementosNovos = new Object[this.elementos.length * 2];

            for(int i=0; i<this.elementos.length; i++){
                elementosNovos[i] = elementos[i];
            }

            this.elementos = elementosNovos;
        }
    }

    public Object busca(int posicao){
        if(!(posicao >= 0 && posicao < this.tamanho)){
            throw new IllegalArgumentException("Posição inválida");
        }

        return this.elementos[posicao];
    }

    public int busca(Object elemento){
        for (int i = 0; i < this.tamanho; i++){
            if(elementos[i].equals(elemento)){
                return i;
            }
        }

        return -1;
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
