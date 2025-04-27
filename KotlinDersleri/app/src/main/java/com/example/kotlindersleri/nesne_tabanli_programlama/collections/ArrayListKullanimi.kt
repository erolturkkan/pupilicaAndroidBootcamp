package com.example.kotlindersleri.nesne_tabanli_programlama.collections

fun main() {

    //Meyveler adlı bir array list tanımla
    val meyveler = ArrayList<String>()

    //Array liste eleman ekle
    meyveler.add("Cilek")
    meyveler.add("Muz")
    meyveler.add("Elma")
    meyveler.add("Kivi")
    println(meyveler)

    //Güncelleme
    meyveler[1] = "Yeni Muz"
    println(meyveler)

    //Insert -> index, değer
    meyveler.add(2, "Portakal")
    println(meyveler)

    //okuma get
    val meyve = meyveler.get(3)
    println(meyve)

    //Boyut - size
    println("Boyut : ${meyveler.size}")

    //İçeriyor mu
    println("Iceriyor mu : ${meyveler.contains("Kiraz")}")

    //Ters çevirme
    meyveler.reverse()
    println(meyveler)

    //for ile gezme
    for (meyve in meyveler) {
        println("Sonuc : $meyve")
    }

    //İndex ile for ile gezme
    for ((index, meyve) in meyveler.withIndex()) {
        println("$index -> $meyve")
    }

    //Listeden veri silme
    meyveler.removeAt(2)
    println(meyveler)

    //Tüm listeyi silme
    meyveler.clear()
    println(meyveler)


}