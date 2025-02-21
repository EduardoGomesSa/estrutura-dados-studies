public class App {
    public static void main(String[] args) throws Exception {
        ArvoreBinaria ab = new ArvoreBinaria();
        NoArvore raiz = new NoArvore(5);
        ab.setRaiz(raiz);
        
        NoArvore f3 = new NoArvore(3);
        NoArvore f8 = new NoArvore(8);
        raiz.setFilhoEsquerda(f3);
        raiz.setFilhoDireita(f8);

        NoArvore f2 = new NoArvore(2);
        NoArvore f4 = new NoArvore(4);
        f3.setFilhoEsquerda(f2);
        f3.setFilhoDireita(f4);

        NoArvore f6 = new NoArvore(6);
        NoArvore f7 = new NoArvore(7);
        f8.setFilhoEsquerda(f6);
        f6.setFilhoDireita(f7);

        ab.inserir(10);

        ab.imprimePreOrdenado();
        System.out.println();
        System.out.println(ab.pesquisa(10));
        System.out.println(ab.pesquisa(4));
    }
}
