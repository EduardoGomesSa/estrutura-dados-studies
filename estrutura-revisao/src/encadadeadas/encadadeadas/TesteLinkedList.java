package encadadeadas.encadadeadas;

public class TesteLinkedList {

    public static void main(String[] args) {
        ListaLigada lista = new ListaLigada();

        lista.Adicionar("Balsas");
        lista.Adicionar("Sambaiba");
        lista.Adicionar("Mangabeiras");
        lista.Adicionar("Loreto");

        System.out.println("Tamanho: "+lista.getTamanho());
        System.out.println("Primeiro: "+lista.getPrimeiro().getValor());
        System.out.println("Ultimo: "+lista.getUltimo().getValor());

        for(int i = 0; i < lista.getTamanho(); i++){
            System.out.println("[ "+lista.getPosicao(i).getValor()+" ]");
        }

        System.out.println("-----------------------------------");

        lista.remover("Sambaiba");

        System.out.println("Tamanho: "+lista.getTamanho());
        System.out.println("Primeiro: "+lista.getPrimeiro().getValor());
        System.out.println("Ultimo: "+lista.getUltimo().getValor());

        for(int i = 0; i < lista.getTamanho(); i++){
            System.out.println("[ "+lista.getPosicao(i).getValor()+" ]");
        }
    }
}
