package com.example.kotlindersleri.nesne_tabanli_programlama

fun main() {
    val sonuc = 5 carp 2
    println("Sonuc : $sonuc")
}

infix fun Int.carp(sayi1:Int) : Int{
    return this * sayi1//this = Int sınıfının kendisi
}