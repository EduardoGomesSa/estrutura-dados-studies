package fila.encadeada;

public class Fila {
    Elemento frente, tras;

    public Fila() {
        this.frente = null;
        this.tras = null;
    }
 // {b, c, d} - d
    public void enfileirar(int dado) {
    	Elemento novoNo = new Elemento(dado);

        if (this.tras == null) {
            // Se a fila estiver vazia, o novo nó será tanto o primeiro quanto o último
            this.frente = this.tras = novoNo;
            return;
        }

        // Adiciona o novo nó ao final da fila
        this.tras.proximo = novoNo;
        this.tras = novoNo;
    }

    public Elemento desenfileirar() {
        if (this.frente == null) {
            // Se a fila estiver vazia, não há nada para remover
            return null;
        }

        Elemento temp = this.frente;
        this.frente = this.frente.proximo;

        if (this.frente == null) {
            // Se a fila ficar vazia após a remoção, atualiza o ponteiro 'tras'
            this.tras = null;
        }

        return temp;
    }
}
