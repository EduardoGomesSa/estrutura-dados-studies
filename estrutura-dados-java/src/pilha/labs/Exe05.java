package pilha.labs;

import pilha.Pilha;

public class Exe05 {
    public static void main(String[] args) {
        String palavra = "ada";
        imprimeResultado(palavra);

        palavra = "adam";
        imprimeResultado(palavra);

        palavra = "socorram me subi no onibus em marrocos";
        imprimeResultado(palavra);

        palavra = "aaa";
        imprimeResultado(palavra);

    }

    public static void imprimeResultado(String palavra){
        System.out.println(palavra + " é um palindromo? "+testaPalindromo(palavra));
    }

    public static boolean testaPalindromo(String palavra){
        Pilha<Character> pilha = new Pilha<>();

        for (int i=0; i<palavra.length(); i++){
            pilha.empilha(palavra.charAt(i));
        }

        String palavraInversa = "";

        while (!pilha.estaVazia()){
            palavraInversa += pilha.desempilha();
        }

        if(palavraInversa.equalsIgnoreCase(palavra)){
            return true;
        }

        return false;
    }
}
