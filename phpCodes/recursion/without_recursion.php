<?php 

namespace phpCodes\recursion;

function getByKey($principalBox) {
    $pilha = [$principalBox]; // Pilha inicia com a caixa principal

    while (!empty($pilha)) {
        $caixa = array_pop($pilha); // Remove e retorna a última caixa da pilha

        foreach ($caixa as $item) {
            if (is_array($item)) { // Se for uma caixa (outra lista)
                array_push($pilha, $item); // Adiciona a caixa na pilha
            } elseif ($item === "chave") { // Se encontrou a chave
                echo "Achei a chave!\n";
                return; // Para a busca
            }
        }
    }
    echo "Chave não encontrada!\n";
}

$caixas = [
    [1, 2, ["chave"], 3],
    [4, 5, [6, 7, [8, 9]]],
];

getByKey($caixas);