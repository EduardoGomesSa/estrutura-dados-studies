package pilha.encadeada;

public class Pilha {
    private Elemento topo;
    private int tamanho;

    // Construtor da pilha
    public Pilha() {
        this.topo = null;
        this.tamanho = 0;
    }

    // Verifica se a pilha está vazia
    public boolean estaVazia() {
        return (this.tamanho == 0);
    }

    // Retorna o tamanho da pilha
    public int getTamanho() {
        return this.tamanho;
    }

    // Adiciona um elemento no topo da pilha
    public void empilhar(int valor) {
        Elemento novoElemento = new Elemento(valor);
        novoElemento.setProximo(this.topo);
        this.topo = novoElemento;
        this.tamanho++;
    }

    // Remove o elemento do topo da pilha
    public int desempilhar() {
        if (estaVazia()) {
            throw new RuntimeException("A pilha está vazia.");
        }
        int valor = this.topo.getValor();
        this.topo = this.topo.getProximo();
        this.tamanho--;
        return valor;
    }

    // Retorna o elemento do topo da pilha
    public int topo() {
        if (estaVazia()) {
            throw new RuntimeException("A pilha está vazia.");
        }
        return this.topo.getValor();
    }

    public void exibirPilha() {
        Elemento atual = topo;
        while (atual != null) {
            System.out.println(atual.getValor());
            atual = atual.getProximo();
        }
    }
}
