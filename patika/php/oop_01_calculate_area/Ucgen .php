<?php

class Ucgen extends Sekil
{
    public function cevre($margin1, $margin2, $margin3)
    {
        return $margin1 + $margin2 + $margin3;
    }

    public function alan($base, $height)
    {
        return ($base * $height) / 2;
    }
}

require_once('Sekil.php');
