<?php

namespace App\Models;

use Illuminate\Database\Eloquent\Factories\HasFactory;
use Illuminate\Database\Eloquent\Model;
use Illuminate\Database\Eloquent\Relations\BelongsToMany;
use Illuminate\Database\Eloquent\Relations\HasMany;

class Family extends Model
{
    use HasFactory;

    protected $guarded = ['id'];

    public function students(): BelongsToMany
    {
        return $this->belongsToMany(Student::class, 'family_student', 'family_id', 'student_id', 'user_id');
    }
}
