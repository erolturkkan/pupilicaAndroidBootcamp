package com.example.kotlindersleri.degiskenler

fun main(){
    println("Merhaba Dunya")

    val d = 89.6
    val i = 34

    val sonuc = d.toInt()
    val sonuc2 = i.toDouble()
    println(sonuc)
    println(sonuc2)

    //2 - Sayısaldan metne dönüşüm
    var x = 85
    val sonuc3 = x.toString()
    println(sonuc3)

    //3- Metinden sayısala
    val yazi = "48T"
    val sonuc4 = yazi.toIntOrNull()
    println(sonuc4)
}