<?php

namespace App\Traits;

use App\Models\User;

trait hasRole
{

    public function hasRole(string $role)
    {
        return auth()->user()->role->slug == $role ? true : false;
    }
    
}
