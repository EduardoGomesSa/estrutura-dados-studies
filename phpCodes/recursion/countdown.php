<?php 

namespace phpCodes\recursion;

function regressive(int $i) {
    echo "$i\n";

    if($i <= 0) {
        return;
    }
    regressive($i-1);
}

regressive(42);