<?php

namespace phpCodes\binarySearch;

function binarySearch(array $list, int $item)
{
    $low = 0;
    $high = count($list) - 1;

    while ($low <= $high) {
        $mid = ($high + $low) / 2;
        $mid = floor($mid); // Arredonda para baixo
        // if ($mid % 2 !== 0) { // Se for ímpar
        //     $mid--; // Ajusta para o primeiro número par abaixo
        // }

        $kick = $list[$mid];
        //return $kick;

        if ($kick === $item){
            return $mid;
        }

        if ($kick > $item) {
            $high = $mid - 1;
        } else {
            $low = $mid + 1;
        }
    }
    return -1;
}

$list_test = [1, 3, 4, 5, 6, 7];

echo (binarySearch($list_test, 11));
echo "\n";

echo binarySearch($list_test, 7);
echo "\n";