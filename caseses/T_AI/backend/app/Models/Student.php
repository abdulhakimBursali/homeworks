<?php

namespace App\Models;

use Illuminate\Database\Eloquent\Factories\HasFactory;
use Illuminate\Database\Eloquent\Model;
use Illuminate\Database\Eloquent\Relations\BelongsTo;
use Illuminate\Database\Eloquent\Relations\HasOneThrough;

class Student extends Model
{
    use HasFactory;

    protected $guareded = ['id'];

    public function family(): HasOneThrough
    {
        return $this->hasOneThrough(Family::class, FamilyStudent::class, 'student_id', 'user_id', 'id', 'family_id');
    }
}
