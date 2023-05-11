package encadadeadas.encadadeadas;

public class ListaLigada {
    private Elemento primeiro;
    private Elemento ultimo;
    private int tamanho;

    public Elemento getPrimeiro() {
        return primeiro;
    }

    public void setPrimeiro(Elemento primeiro) {
        this.primeiro = primeiro;
    }

    public Elemento getUltimo() {
        return ultimo;
    }

    public void setUltimp(Elemento ultimo) {
        this.ultimo = ultimo;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
    
    //elemento 1
    //elemento 2
    public  void Adicionar(String novoValor){//Laura //Lívia
        Elemento novoElemento = new Elemento(novoValor);//Laura //Lívia

        if(this.primeiro == null && this.ultimo == null){
            this.primeiro = novoElemento;
            this.ultimo = novoElemento;
        }else{
            this.ultimo.setProximo(novoElemento); //elemento 2
            this.ultimo = novoElemento;//elemento 2
        }

        this.tamanho++;
    }

    public Elemento getPosicao(int posicao){
        Elemento atual = this.primeiro;
        for(int i=0;i<posicao;i++){
            if(atual.getProximo() != null){
                atual = atual.getProximo();
            }
        }

        return atual;
    }
    //lista = {a, b, c}
    //b
    public void remover(String valorParaRemover){//b
        Elemento anterior = null;
        Elemento atual = this.primeiro;

        for(int i = 0; i < this.getTamanho(); i++){
            if(atual.getValor().equalsIgnoreCase(valorParaRemover)){//b
                if(this.tamanho == 1){
                    this.primeiro = null;
                    this.ultimo = null;
                }else if(atual == primeiro){
                    this.primeiro = atual.getProximo();
                    atual.setProximo(null);
                }else if(atual == ultimo){
                    this.ultimo = anterior;
                    anterior.setProximo(null);
                }else{
                    anterior.setProximo(atual.getProximo()); //anterior = a proximo = c
                    atual = null;
                }

                tamanho--;
                break;
            }
            anterior = atual; //a
            atual = atual.getProximo();//b
        }
    }
}