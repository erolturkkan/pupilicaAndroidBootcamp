package com.example.kotlindersleri.nesne_tabanli_programlama

data class Yemekler(var id:Int, var ad:String, var fiyat:Int) {
    // Constructor - init metodu  fonksiyonu
    // Bu sınıftan nesne oluşturulduğunda çağırılır.

    init {
        println("****** Yemekler sinifindan nesne olusturuldu. ******")
    }

    fun bilgiAl(){
        println("-------------------")
        println("Id   : ${id}")
        println("Ad   : ${ad}")
        println("Fiyat: ${fiyat}")
    }
    // this : bulunduğum sınıfı temsil eder. Swift dilinde self
    // super : Kalıtım ile bir üst sınıfı temsil eder.
}