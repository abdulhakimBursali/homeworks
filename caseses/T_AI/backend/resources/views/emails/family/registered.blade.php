@component('mail::message')
# Merhaba {{$userName}}

School sistemine kaydınız başarıyla gerçekleşmiştir.

@component('mail::button', ['url' => 'www.example.com/login'])
Giriş Yap
@endcomponent

Thanks,<br>
{{ config('app.name') }}
@endcomponent
