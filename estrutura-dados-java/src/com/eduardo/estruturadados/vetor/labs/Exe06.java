package com.eduardo.estruturadados.vetor.labs;

import com.eduardo.estruturadados.vetor.Lista;
import com.eduardo.estruturadados.vetor.teste.Contato;

import java.util.List;
import java.util.Scanner;

public class Exe06 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        Lista<Contato> lista = new Lista<Contato>(20);

        //criarContatosDinamicamente(5, lista);

        int opcao = 1;

        while (opcao != 0){
            opcao = obterOpcaoMenu(scan);

            switch (opcao){
                case 1:
                    adicionarContatoFinal(scan, lista);
                    break;
                case 2:
                    adicionarContatoPosicao(scan, lista);
                    break;
                case 3:
                    obtemContatoPosicao(scan, lista);
                    break;
                case 4:
                    obtemContato(scan, lista);
                    break;
                case 5:
                    pesquisarUtilmoIndice(scan, lista);
                    break;
                case 6:
                    pesquisarContatoExiste(scan, lista);
                    break;
                case 7:
                    excluirPorPosicao(scan, lista);
                    break;
                case 8:
                    excluirContato(scan, lista);
                    break;
                case 9:
                    imprimeTamanhoVetor(lista);
                    break;
                case 10:

                    break;
                case 11:

                    break;
            }
        }

        System.out.println("Usuário digitou 0 e o programa encerrou");
    }

    private static void limparVetor(Lista<Contato> lista){
        System.out.println("Tamanho do vetor é de "+lista.getTamanho());
    }

    private static void imprimeTamanhoVetor(Lista<Contato> lista){
        System.out.println("Tamanho do vetor é de "+lista.getTamanho());
    }

    private static void obtemContato(Scanner scan, Lista<Contato>lista){
        int pos = lerInformacaoInt("Entre com a posição a ser pesquisada", scan);

        try {
            Contato contato = lista.busca(pos);

            System.out.println("Contato existe, seguem os dados");
            System.out.println(contato);

            System.out.println("Fazendo pesquisa do Contato encontrado: ");
            pos = lista.busca(contato);

            System.out.println("Contato encontrado na posição "+pos);
        } catch (Exception e){
            System.out.println("Posição inválida, contato não adicionado");
        }
    }

    private static void pesquisarContatoExiste(Scanner scan, Lista<Contato>lista){
        int pos = lerInformacaoInt("Entre com a posição a ser pesquisada", scan);

        try {
            Contato contato = lista.busca(pos);

            boolean existe = lista.contem(contato);

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

    private static void excluirPorPosicao(Scanner scan, Lista<Contato>lista){
        int pos = lerInformacaoInt("Entre com a posição a ser removida", scan);

        try {
           lista.remove(pos);

            System.out.println("Contato removido com sucesso");
        } catch (Exception e){
            System.out.println("Posição inválida, contato não adicionado");
        }
    }

    private static void excluirContato(Scanner scan, Lista<Contato>lista){
        int pos = lerInformacaoInt("Entre com a posição a ser removida", scan);

        try {
            Contato contato = lista.busca(pos);

            lista.remove(contato);

            System.out.println("Contato removido com sucesso");
        } catch (Exception e){
            System.out.println("Posição inválida, contato não adicionado");
        }
    }

    private static void pesquisarUtilmoIndice(Scanner scan, Lista<Contato>lista){
        int pos = lerInformacaoInt("Entre com a posição a ser pesquisada", scan);

        try {
            Contato contato = lista.busca(pos);

            System.out.println("Contato existe, seguem os dados");
            System.out.println(contato);

            System.out.println("Fazendo pesquisa do último índice do Contato encontrado: ");
            pos = lista.ultimoIndice(contato);

            System.out.println("Contato encontrado na posição "+pos);
        } catch (Exception e){
            System.out.println("Posição inválida, contato não adicionado");
        }
    }

    private static void obtemContatoPosicao(Scanner scan, Lista<Contato>lista){
        int pos = lerInformacaoInt("Entre com a posição a ser pesquisada", scan);

        try {
            Contato contato = lista.busca(pos);

            System.out.println("Contato existe, seguem os dados");
            System.out.println(contato);
        } catch (Exception e){
            System.out.println("Posição inválida, contato não adicionado");
        }
    }

    private  static void adicionarContatoFinal(Scanner scan, Lista<Contato>lista){
        System.out.println("Criando um contato, entre com as informações: ");
        String nome = lerInformacao("Entre com nome", scan);
        String telefone = lerInformacao("Entre com telefone", scan);
        String email = lerInformacao("Entre com e-mail", scan);

        Contato contato = new Contato(nome, telefone, email);

        lista.adiciona(contato);

        System.out.println("Contato adicionado com sucesso!");
        System.out.println(contato);
    }

    private  static void adicionarContatoPosicao(Scanner scan, Lista<Contato>lista){
        System.out.println("Criando um contato, entre com as informações: ");
        String nome = lerInformacao("Entre com nome", scan);
        String telefone = lerInformacao("Entre com telefone", scan);
        String email = lerInformacao("Entre com e-mail", scan);

        Contato contato = new Contato(nome, telefone, email);

        int pos = lerInformacaoInt("Entre com a posição a adicionar o contato", scan);

        try{
            lista.adiciona(pos, contato);

            System.out.println("Contato adicionado com sucesso!");
            System.out.println(contato);
        } catch (Exception e){
            System.out.println("Posição inválida, contato não adicionado");
        }
    }

    private static String lerInformacao(String msg, Scanner scan){
        System.out.println(msg);

        String entrada = scan.nextLine();

        return entrada;
    }

    public static int lerInformacaoInt(String msg, Scanner scan){
        boolean entradaValida = false;
        int num = 0;

        while (!entradaValida){
            try{
                System.out.println(msg);

                String entrada = scan.nextLine();

                num = Integer.parseInt(entrada);

                entradaValida = true;
            } catch (Exception e){
                System.out.println("Entrada inválida, digite novamente");
            }

        }

        return num;
    }

    private static int obterOpcaoMenu(Scanner scan){
        boolean entradaValida = false;
        int opcao = 0;
        String entrada;

        while (!entradaValida){
            System.out.println("Digite a opção desejada: ");
            System.out.println("1: Adiciona contato no final do vetor");
            System.out.println("2: Adiciona contato em uma posição especifica do vetor");
            System.out.println("3: Obtém contato de uma posição específica");
            System.out.println("4: Busca contato");
            System.out.println("5: Consulta último índice do contato");
            System.out.println("6: Verifica se contato existe");
            System.out.println("7: Excluir por posição");
            System.out.println("8: Excluir contato");
            System.out.println("9: Verifica tamanho do vetor");
            System.out.println("10: Excluir todos os contatos do vetor");
            System.out.println("11: Imprime vetor");
            System.out.println("0: Sair");

            try{
                entrada = scan.nextLine();
                opcao = Integer.parseInt(entrada);

                if(opcao >= 0 && opcao <= 11){
                    entradaValida = true;
                } else{
                    throw new Exception();
                }
            } catch (Exception e){
                System.out.println("Entrada inválida, digite novamente \n\n");
            }
        }

        return opcao;
    }

    private static void criarContatosDinamicamente(int quantidade, Lista<Contato> lista){
        Contato contato;
        for (int i=1; i<=quantidade; i++){
            contato = new Contato();
            contato.setNome("Contato "+ i);
            contato.setEmail("contato"+i+"@gmail.com");
            contato.setTelefone("111111"+ i);

            lista.adiciona(contato);
        }
    }
}
