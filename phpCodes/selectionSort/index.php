<?php

namespace phpCodes\selectionSort;

function getSmaller(array $arr): int
{
    $smaller = $arr[array_key_first($arr)];
    $smaller_index = array_key_first($arr);

    foreach ($arr as $index => $value) {
        if ($value < $smaller) {
            $smaller = $value;
            $smaller_index = $index;
        }
    }

    return $smaller_index;
}

function selectionSort(array $arr): array
{
    $newArr = [];

    while (!empty($arr)) {
        $smaller_index = getSmaller($arr);
        $newArr[] = $arr[$smaller_index];
        unset($arr[$smaller_index]);
    }

    return array_values($newArr);
}

//echo getSmaller([3, 1, 2, 3, 4, 0]);
print_r(selectionSort([3, 1, 2, 3, 4, 7, 6, 11, 8, 13]));
//selectionSort([3, 1, 2, 3, 4, 0]);
