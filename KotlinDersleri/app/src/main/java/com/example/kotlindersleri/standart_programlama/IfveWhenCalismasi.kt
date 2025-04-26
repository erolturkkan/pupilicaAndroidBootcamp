package com.example.kotlindersleri.standart_programlama

fun main() {
    val yas = 17

    println(yas >= 18)

    if (yas >= 18){
        println("Resitsiniz.")
    }else{
        println("Resit degilsiniz.")
    }

    val ka = "admin"
    val s = 123457
    val sayi = 11

    if(ka == "admin" && s == 123456){//&& = And(Ve), true && true ise true, diğer durumlarda false
        println("Hosgeldiniz")
    }else{
        println("Hatali giris")
    }

    if (sayi == 9 || sayi == 10){//|| Or(veya), false || false ise false, diğer durumlarda true
        println("Sayi 9 veya 10dur")
    }else{
        println("Sayi 9 veya 10 değildir")
    }

    //When, diğer dillerde Switch
    val number = 1

    when(number){
        1 -> println("Sayi 1'dir")
        2 -> println("Sayi 2'dir")
        else -> println("Tanımlanmayan sayı")
    }

}