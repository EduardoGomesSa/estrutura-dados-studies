package com.eduardo.estruturadados.vetor.labs;

import com.eduardo.estruturadados.vetor.teste.Contato;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exe07 extends Exe06 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        ArrayList<Contato> ArrayList = new ArrayList<Contato>(20);

        criarContatosDinamicamente(5, ArrayList);

        int opcao = 1;

        while (opcao != 0){
            opcao = obterOpcaoMenu(scan);

            switch (opcao){
                case 1:
                    adicionarContatoFinal(scan, ArrayList);
                    break;
                case 2:
                    adicionarContatoPosicao(scan, ArrayList);
                    break;
                case 3:
                    obtemContatoPosicao(scan, ArrayList);
                    break;
                case 4:
                    obtemContato(scan, ArrayList);
                    break;
                case 5:
                    pesquisarUtilmoIndice(scan, ArrayList);
                    break;
                case 6:
                    pesquisarContatoExiste(scan, ArrayList);
                    break;
                case 7:
                    excluirPorPosicao(scan, ArrayList);
                    break;
                case 8:
                    excluirContato(scan, ArrayList);
                    break;
                case 9:
                    imprimeTamanhoVetor(ArrayList);
                    break;
                case 10:
                    limparVetor(ArrayList);
                    break;
                case 11:
                    imprimirVetor(ArrayList);
                    break;
            }
        }

        System.out.println("Usuário digitou 0 e o programa encerrou");
    }

    protected static void limparVetor(ArrayList<Contato> ArrayList){
        ArrayList.clear();

        System.out.println("Todos os contatos do vetor foram excluídos");
    }

    protected static void imprimirVetor(ArrayList<Contato> ArrayList){
        System.out.println(ArrayList);
    }

    protected static void imprimeTamanhoVetor(ArrayList<Contato> ArrayList){
        System.out.println("Tamanho do vetor é de "+ArrayList.size());
    }

    protected static void obtemContato(Scanner scan, ArrayList<Contato>ArrayList){
        int pos = lerInformacaoInt("Entre com a posição a ser pesquisada", scan);

        try {
            Contato contato = ArrayList.get(pos);

            System.out.println("Contato existe, seguem os dados");
            System.out.println(contato);

            System.out.println("Fazendo pesquisa do Contato encontrado: ");
            pos = ArrayList.indexOf(contato);

            System.out.println("Contato encontrado na posição "+pos);
        } catch (Exception e){
            System.out.println("Posição inválida, contato não adicionado");
        }
    }

    protected static void pesquisarContatoExiste(Scanner scan, ArrayList<Contato>ArrayList){
        int pos = lerInformacaoInt("Entre com a posição a ser pesquisada", scan);

        try {
            Contato contato = ArrayList.get(pos);

            boolean existe = ArrayList.contains(contato);

            if(existe){
                System.out.println("Contato existe, seguem os dados");
                System.out.println(contato);
            } else {
                System.out.println("Contato não existe");
            }
        } catch (Exception e){
            System.out.println("Posição inválida, contato não adicionado");
        }
    }

    protected static void excluirPorPosicao(Scanner scan, ArrayList<Contato>ArrayList){
        int pos = lerInformacaoInt("Entre com a posição a ser removida", scan);

        try {
            ArrayList.remove(pos);

            System.out.println("Contato removido com sucesso");
        } catch (Exception e){
            System.out.println("Posição inválida, contato não adicionado");
        }
    }

    protected static void excluirContato(Scanner scan, ArrayList<Contato>ArrayList){
        int pos = lerInformacaoInt("Entre com a posição a ser removida", scan);

        try {
            Contato contato = ArrayList.get(pos);

            ArrayList.remove(contato);

            System.out.println("Contato removido com sucesso");
        } catch (Exception e){
            System.out.println("Posição inválida, contato não adicionado");
        }
    }

    protected static void pesquisarUtilmoIndice(Scanner scan, ArrayList<Contato>ArrayList){
        int pos = lerInformacaoInt("Entre com a posição a ser pesquisada", scan);

        try {
            Contato contato = ArrayList.get(pos);

            System.out.println("Contato existe, seguem os dados");
            System.out.println(contato);

            System.out.println("Fazendo pesquisa do último índice do Contato encontrado: ");
            pos = ArrayList.lastIndexOf(contato);

            System.out.println("Contato encontrado na posição "+pos);
        } catch (Exception e){
            System.out.println("Posição inválida, contato não adicionado");
        }
    }

    protected static void obtemContatoPosicao(Scanner scan, ArrayList<Contato>ArrayList){
        int pos = lerInformacaoInt("Entre com a posição a ser pesquisada", scan);

        try {
            Contato contato = ArrayList.get(pos);

            System.out.println("Contato existe, seguem os dados");
            System.out.println(contato);
        } catch (Exception e){
            System.out.println("Posição inválida, contato não adicionado");
        }
    }

    protected  static void adicionarContatoFinal(Scanner scan, ArrayList<Contato>ArrayList){
        System.out.println("Criando um contato, entre com as informações: ");
        String nome = lerInformacao("Entre com nome", scan);
        String telefone = lerInformacao("Entre com telefone", scan);
        String email = lerInformacao("Entre com e-mail", scan);

        Contato contato = new Contato(nome, telefone, email);

        ArrayList.add(contato);

        System.out.println("Contato adicionado com sucesso!");
        System.out.println(contato);
    }

    protected  static void adicionarContatoPosicao(Scanner scan, ArrayList<Contato>ArrayList){
        System.out.println("Criando um contato, entre com as informações: ");
        String nome = lerInformacao("Entre com nome", scan);
        String telefone = lerInformacao("Entre com telefone", scan);
        String email = lerInformacao("Entre com e-mail", scan);

        Contato contato = new Contato(nome, telefone, email);

        int pos = lerInformacaoInt("Entre com a posição a adicionar o contato", scan);

        try{
            ArrayList.add(pos, contato);

            System.out.println("Contato adicionado com sucesso!");
            System.out.println(contato);
        } catch (Exception e){
            System.out.println("Posição inválida, contato não adicionado");
        }
    }

    protected static void criarContatosDinamicamente(int quantidade, ArrayList<Contato> ArrayList){
        Contato contato;
        for (int i=1; i<=quantidade; i++){
            contato = new Contato();
            contato.setNome("Contato "+ i);
            contato.setEmail("contato"+i+"@gmail.com");
            contato.setTelefone("111111"+ i);

            ArrayList.add(contato);
        }
    }
}
