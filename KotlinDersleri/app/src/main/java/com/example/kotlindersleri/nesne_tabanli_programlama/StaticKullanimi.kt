package com.example.kotlindersleri.nesne_tabanli_programlama

fun main() {
    val a = ClassA()

    //Standart nesne tabanlı erisim
    //println(a.x)
    //a.metod()

    //Sanal nesne - Virtual Object - Nameless(İsimsiz) Object
    //println(ClassA().x) //1. Nesne
    //ClassA().metod()    //2. Nesne

    //Static Kullanımı
    println(ClassA.x)
    ClassA.metod()

}