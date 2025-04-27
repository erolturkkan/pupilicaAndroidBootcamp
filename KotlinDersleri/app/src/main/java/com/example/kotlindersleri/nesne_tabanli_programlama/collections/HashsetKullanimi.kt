package com.example.kotlindersleri.nesne_tabanli_programlama.collections

fun main() {
    //HASHSET
    //Tanımlama
    val meyveler = HashSet<String>()
    //Any -> En üst sınıf demektir
    //Bütün türleri kapsar

    meyveler.add("Elma")
    meyveler.add("Muz")
    meyveler.add("Kiraz")
    println(meyveler)

    meyveler.add("Amasya Elma")
    println(meyveler)

    val y = meyveler.elementAt(2)
    println(y)

    println("Boyut : ${meyveler.size}")

    //for ile gezme
    for (meyve in meyveler) {
        println("Sonuc : $meyve")
    }

    //İndex ile for ile gezme
    for ((index, meyve) in meyveler.withIndex()) {
        println("$index -> $meyve")
    }

    meyveler.remove("Elma")
    println(meyveler)

    meyveler.clear()
    println(meyveler)

}