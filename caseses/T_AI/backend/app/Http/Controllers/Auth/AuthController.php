<?php

namespace App\Http\Controllers\Auth;

use App\Http\Controllers\Controller;
use App\Http\Requests\LoginRequest;
use App\Http\Requests\RegisterRequest;
use App\Models\Code;
use App\Models\User;
use Illuminate\Support\Facades\Auth;
use Illuminate\Support\Facades\DB;
use Illuminate\Support\Facades\Hash;
use Illuminate\Support\Facades\Log;

class AuthController extends Controller
{
    /**
     * Login
     */
    public function login(LoginRequest $request)
    {
        $user = User::where('email', $request->email)->first();

        if (!$user || !Hash::check($request->password, $user->password)) {
            return response(['description' => 'user not found', 'data' => []], 401);
        }

        return response([
            'description' => 'success',
            'data' => ['token' => $user->createToken("auth_token")->plainTextToken]
        ], 200);
    }

    /**
     * Register
     */
    public function register(RegisterRequest $request)
    {
        $code = Code::where('code', $request->code)->where('expired_at', '>', now())->first();
        if (!$code) {
            return response(['description' => 'code not found or expired'], 404);
        }

        $user = User::create([
            'role_id' => 2,
            'name' => $request->name,
            'email' =>$request->email,
            'password' => $request->password
        ]);

        $user->family()->create();
        $user->family->students()->sync([$code->student_id]);

        return response(['description' => 'success'], 200);
    }
}
