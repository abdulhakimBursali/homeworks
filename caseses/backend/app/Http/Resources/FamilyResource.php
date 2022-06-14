<?php

namespace App\Http\Resources;

use Illuminate\Http\Resources\Json\JsonResource;

class FamilyResource extends JsonResource
{
    /**
     * Transform the resource into an array.
     *
     * @param  \Illuminate\Http\Request  $request
     * @return array|\Illuminate\Contracts\Support\Arrayable|\JsonSerializable
     */
    public function toArray($request)
    {
        $students = $this->family->relationLoaded('students')
            ? StudentResource::collection($this->family->students)
            : null;

        return [
            'name' => $this->name,
            'email' => $this->name,
            'address' => $this->family->address,
            $this->mergeWhen($students !== null, [
                'students' => $students,
            ]),
        ];
    }
}
