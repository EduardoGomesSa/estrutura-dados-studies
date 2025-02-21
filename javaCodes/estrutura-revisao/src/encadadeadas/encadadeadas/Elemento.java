package encadadeadas.encadadeadas;

public class Elemento {
    private String valor;
    private Elemento proximo;

    public Elemento(String novoValor){
        this.valor = novoValor;
    }

    public String getValor() {
        return this.valor;
    }

    public Elemento getProximo() {
        return this.proximo;
    }

    public void setProximo(Elemento proximo) {
        this.proximo = proximo;
    }
}
