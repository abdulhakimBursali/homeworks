<?php

class Kare extends Sekil
{
    public function cevre($margin)
    {
        return 4 * $margin;
    }

    public function alan($margin)
    {
        return $margin * $margin;
    }
}

require_once('Sekil.php');
