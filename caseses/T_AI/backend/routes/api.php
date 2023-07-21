<?php

use App\Http\Controllers\Auth\AuthController;
use Illuminate\Support\Facades\Route;
use App\Http\Controllers\Family\{
    FamilyController,
    StudentController as FamilyStudentController,
};

use App\Http\Controllers\Admin\{
    StudentController as AdminStudentController,
    CodeController
};

/*
|--------------------------------------------------------------------------
| API Routes
|--------------------------------------------------------------------------
|
| Here is where you can register API routes for your application. These
| routes are loaded by the RouteServiceProvider within a group which
| is assigned the "api" middleware group. Enjoy building your API!
|
*/

//V1
Route::post('/login', [AuthController::class, 'login']);
Route::post('/register', [AuthController::class, 'register']);

Route::group(['prefix' => 'v1', 'middleware' => 'auth:sanctum'], function () {

    //Family
    Route::group(['middleware' => 'checkRole:family'], function () {
        //Auth User Operations
        Route::get('/me', [FamilyController::class, 'index']);
        Route::put('/me', [FamilyController::class, 'update']);

        //Student Operations
        Route::get('/me/students', [FamilyStudentController::class, 'index']);
    });

    //Admin
    Route::group(['middleware' => 'checkRole:admin'], function () {
        Route::post('/code', [CodeController::class, 'store']);
        Route::get('/code/{id}', [CodeController::class, 'show']);
        //Student Operations
        Route::get('/students', [AdminStudentController::class, 'index']);
    });
});
