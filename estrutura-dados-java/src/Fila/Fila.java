package Fila;

import base.EstruturaEstatica;

public class Fila<T> extends EstruturaEstatica<T> {
    public Fila(){
        super();
    }

    public Fila(int capacidade){
        super(capacidade);
    }

    public void enfileira(T elemento){
        //this.elementos[this.tamanho] = elemento;
        //this.tamanho++;

        //this.elementos[this.tamanho++] = elemento;

        this.adiciona(elemento);
    }

    public T espiar(){
        if(this.estaVazia()) return null;
        
        return this.elementos[0];
    }
}
