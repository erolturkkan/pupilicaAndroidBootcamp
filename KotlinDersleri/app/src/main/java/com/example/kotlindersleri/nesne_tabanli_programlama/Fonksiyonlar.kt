package com.example.kotlindersleri.nesne_tabanli_programlama

class Fonksiyonlar {
    //void - geri dönüş değeri olmayan - sadece işlem yapan
    fun selamla1() {// Swift -> func
        val sonuc = "Merhaba Erol"
        println(sonuc)
    }

    //return - geri dönüş değeri olan - işlem yapan - veri transferi yapar
    fun selamla2() : String {// Swift -> func
        val sonuc = "Merhaba Erol"
        return sonuc
    }

    //parametre
    fun selamla3(isim:String) {
        val sonuc = "Merhaba $isim"
        println(sonuc)
    }

    //Overloading - aynı isimde farklı parametreler alan fonksiyonlar
    fun topla(sayi1:Int, sayi2:Int) {
        println("İki sayinin toplami : ${sayi1+sayi2}")
    }

    fun topla(sayi1:Double, sayi2:Double) {
        println("İki sayinin toplami : ${sayi1+sayi2}")
    }

    fun topla(sayi1:Int, sayi2:Int, isim: String) {
        println("İki sayinin toplami : ${sayi1+sayi2} - Islem yapan : $isim")
    }



}