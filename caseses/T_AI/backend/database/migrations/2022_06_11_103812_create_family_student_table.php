<?php

use Illuminate\Database\Migrations\Migration;
use Illuminate\Database\Schema\Blueprint;
use Illuminate\Support\Facades\Schema;

return new class extends Migration
{
    /**
     * Run the migrations.
     *
     * @return void
     */
    public function up()
    {
        Schema::create('family_student', function (Blueprint $table) {
            $table->unsignedBigInteger('family_id');
            $table->unsignedBigInteger('student_id');

            $table->foreign('family_id')->references('user_id')->on('families')
                ->cascadeOnDelete()->cascadeOnUpdate();
            $table->foreign('student_id')->references('id')->on('students')
                ->cascadeOnDelete()->cascadeOnUpdate();

            $table->primary(['family_id', 'student_id']);
        });
    }

    /**
     * Reverse the migrations.
     *
     * @return void
     */
    public function down()
    {
        Schema::dropIfExists('family_student');
    }
};
