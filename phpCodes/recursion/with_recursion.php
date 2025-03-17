<?php 

namespace phpCodes\recursion;

use function phpCodes\recursion\getByKey as RecursionGetByKey;

class Caixa {
    public $itens;

    public function __construct($itens = []) {
        $this->itens = $itens;
    }

    public function e_uma_caixa() {
        return is_array($this->itens); // Consideramos que uma caixa contém um array de itens
    }
}

class Busca {
    public function getByKey($box) {
        foreach ($box->itens as $item) {
            if ($item instanceof Caixa) { // Verifica se o item é uma caixa
                $this->getByKey($item); // Chama a recursão
            } elseif ($item === "chave") { // Simula um item sendo a chave
                echo "Achei a chave!\n";
                return; // Pode retornar para encerrar a busca se necessário
            }
        }
    }
}

// Exemplo de uso
$caixa3 = new Caixa(["moeda", "chave"]); // A chave está aqui
$caixa2 = new Caixa([$caixa3, "papel"]);
$caixa1 = new Caixa(["livro", $caixa2]);

$busca = new Busca();
$busca->getByKey($caixa1);