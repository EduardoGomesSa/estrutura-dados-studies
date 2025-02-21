package fila.encadeada;

public class FilaTeste {
    public static void main(String[] args) {
        Fila fila = new Fila();

        fila.enfileirar(10);
        fila.enfileirar(20);
        fila.enfileirar(30);

        System.out.println("Elemento da frente: " + fila.frente.valor);

        Elemento removido = fila.desenfileirar();

        System.out.println("Elemento removido: " + removido.valor);
        System.out.println("Novo elemento da frente: " + fila.frente.valor);
    }
}