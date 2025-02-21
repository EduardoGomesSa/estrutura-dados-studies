package pilha.labs;

import java.util.Stack;

public class Exe08 {
    public static void main(String[] args) {
        Stack<Integer> original = new Stack<>();
        Stack<Integer> destino = new Stack<>();
        Stack<Integer> aux = new Stack<>();

        original.push(4);
        original.push(3);
        original.push(2);
        original.push(1);

        torreDeHanoi(original.size(), original, destino, aux);
    }

    public static void torreDeHanoi(int n,
                                    Stack<Integer> original,
                                    Stack<Integer> destino,
                                    Stack<Integer> aux){
        if(n > 0){
            torreDeHanoi(n-1, original, aux, destino);
            destino.push(original.pop());

            System.out.println("------");
            System.out.println("Original: "+original);
            System.out.println("Destino: "+destino);
            System.out.println("Auxiliar: "+aux);

            torreDeHanoi(n-1, aux, destino, original);
        }
    }
}
