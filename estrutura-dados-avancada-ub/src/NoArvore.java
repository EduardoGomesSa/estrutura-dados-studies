public class NoArvore {
    private NoArvore filhoEsquerda;
    private int chave;
    private NoArvore filhoDireita;

    public NoArvore(int chave) {
        this.setChave(chave);
        this.setFilhoEsquerda(null);
        this.setFilhoDireita(null);
    }

    public NoArvore getFilhoEsquerda() {
        return filhoEsquerda;
    }

    public void setFilhoEsquerda(NoArvore filhoEsquerda) {
        this.filhoEsquerda = filhoEsquerda;
    }

    public int getChave() {
        return chave;
    }

    public void setChave(int chave) {
        this.chave = chave;
    }

    public NoArvore getFilhoDireita() {
        return filhoDireita;
    }

    public void setFilhoDireita(NoArvore filhoDireita) {
        this.filhoDireita = filhoDireita;
    }

    public String toString() {
        return "Chave: " + this.chave;
    }
}
