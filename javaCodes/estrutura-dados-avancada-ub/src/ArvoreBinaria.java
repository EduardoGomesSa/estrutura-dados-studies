public class ArvoreBinaria implements Arvore {
    private NoArvore raiz;

    public ArvoreBinaria() {
        this.setRaiz(null);
    }

    public void setRaiz(NoArvore raiz) {
        this.raiz = raiz;
    }

    public NoArvore getRaiz() {
        return raiz;
    }

    public NoArvore pesquisa(int valor){
        NoArvore noResultado = pesquisaRecursivo(this.raiz, valor);
        return noResultado;
    }

    private NoArvore pesquisaRecursivo(NoArvore raiz, int valor) {
        if(raiz != null) {
            if(raiz.getChave() == valor) {
                return raiz;
            } else if(valor < raiz.getChave()) {
                return pesquisaRecursivo(raiz.getFilhoEsquerda(), valor);
            } else {
                return pesquisaRecursivo(raiz.getFilhoDireita(), valor);
            }
        }
        return null;
    }

    public void inserir(int valor){
        if(this.raiz == null) {
            this.raiz = new NoArvore(valor);
        } else {
            insere(this.raiz, valor);
        }
    }

    private void insere(NoArvore raiz, int valor) {
        if(raiz.getChave() > valor) {
            if(raiz.getFilhoEsquerda() == null) {
                NoArvore no = new NoArvore(valor);
                raiz.setFilhoEsquerda(no);
            } else {
                insere(raiz.getFilhoEsquerda(), valor);
            }
        } else if(raiz.getChave() < valor) {
            if(raiz.getFilhoDireita() == null) {
                NoArvore no = new NoArvore(valor);
                raiz.setFilhoDireita(no);
            } else {
                insere(raiz.getFilhoDireita(), valor);
            }
        }
    }

    public void remover(int valor){}

    public void imprimePreOrdenado(){
        preOrdenado(this.raiz);
    }

    private void preOrdenado(NoArvore raiz) {
        if(raiz == null) return;
        System.out.print(raiz.getChave() + " ");
        preOrdenado(raiz.getFilhoEsquerda());
        preOrdenado(raiz.getFilhoDireita());
    }
}
