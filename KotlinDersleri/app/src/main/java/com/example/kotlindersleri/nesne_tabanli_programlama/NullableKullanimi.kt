package com.example.kotlindersleri.nesne_tabanli_programlama

fun main() {
    //Nullable, Null Safety, Optional(Swift)
    //Genellikle mobil uygulama geliştirme dillerinde yer almaktadır
    //null, NaN, nil
    var mesaj: String? = null

    //mesaj = "Merhaba"

    //Yöntem 1
    //Sorun yoksa çalışır, sorun varsa uygulama çökmez
    println("Ypntem 1 : ${mesaj?.uppercase()}")

    //Yöntem 2
    //Sorun yoksa çalışır, sorun varsa uygulama çöker
    //Çok emin olduğunuz kodlarda kullanılır
    //println("Yontem 2 : ${mesaj!!.uppercase()}")

    //Yöntem 3
    //null kontrol
    if (mesaj != null) {
        println("Yontem 3 : ${mesaj.uppercase()}")
    }else{
        println("Yontem 3 : NULL")
    }

    mesaj?.let {
        println("Yontem 4 : ${mesaj.uppercase()}")
    }

}