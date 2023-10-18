package base;

public class EstruturaEstatica<T> {
    protected T[] elementos;
    protected int tamanho;

    public EstruturaEstatica(int capacidade){
        this.elementos = (T[])new Object[capacidade];
        this.tamanho = 0;
    }

    public EstruturaEstatica(){
        this(10);
    }

    public boolean estaVazia(){
        return this.tamanho == 0;
    }

    protected boolean adiciona(T elemento){
        this.aumentaCapacidade();

        if(tamanho < elementos.length){
            this.elementos[tamanho] = elemento;
            this.tamanho++;

            return true;
        }

        return false;
    }

    protected boolean adiciona(int posicao, T elemento){
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

    public int tamanho(){
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
