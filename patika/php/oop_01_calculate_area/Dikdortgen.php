<?php

class Dikdortgen extends Sekil
{
    public function cevre($longMargin, $shortMargin)
    {
        return 2 * $longMargin + 2 * $shortMargin;
    }

    public function alan($longMargin, $shortMargin)
    {
        return $longMargin * $shortMargin;
    }
}

require_once('Sekil.php');
