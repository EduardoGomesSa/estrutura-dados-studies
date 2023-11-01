package pilha.labs;

import pilha.Pilha;

import java.util.Scanner;

public class Exe02 {
    public static void main(String[] args) {
        Pilha<Integer> par = new Pilha<>();
        Pilha<Integer> impar = new Pilha<>();

        Scanner scan = new Scanner(System.in);

        for (int i=1; i<=10; i++){
            System.out.println("Entre com um número: ");
            int num = scan.nextInt();

            if(num==0){
                // pilha par
                Integer desempilhado = par.desempilha();
                if(desempilhado == null){
                    System.out.println("Pilha esta vazia");
                }else{
                    System.out.println("Desempilhando da pilha par: "+desempilhado);
                }

                // pilha impar
                desempilhado = impar.desempilha();
                if(desempilhado == null){
                    System.out.println("Pilha esta vazia");
                }else{
                    System.out.println("Desempilhando da pilha impar: "+desempilhado);
                }
            }else if(num%2==0){
                System.out.println("Numero par, empilhando na pilha par");
                par.empilha(num);
            }else{
                System.out.println("Numero impar, empilhando na pilha impar");
                impar.empilha(num);
            }
        }

        System.out.println("Desempilhando todos os elementos da pilha par");
        while (!par.estaVazia()){
            System.out.println("Desempilhando da pilha par: "+par.desempilha());
        }

        System.out.println("Desempilhando todos os elementos da pilha impar");
        while (!impar.estaVazia()){
            System.out.println("Desempilhando da pilha impar: "+impar.desempilha());
        }
    }
}
