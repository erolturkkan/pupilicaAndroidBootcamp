package com.example.kotlindersleri.nesne_tabanli_programlama

fun main() {
    val f = Fonksiyonlar()

    //void = Unit
    f.selamla1()

    //return
    val gelenSonuc = f.selamla2()
    println("Gelen sonuc : $gelenSonuc")

    //parametre
    f.selamla3("Erol")

    f.topla(10, 20, "Irem")

}