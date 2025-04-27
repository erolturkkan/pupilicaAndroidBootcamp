package com.example.kotlindersleri.nesne_tabanli_programlama.collections

fun main() {
    //Hashmap JSON veri modeline benzemektedir
    //Map, Dictionary (Swift)
    //Shared Preferences, DataStore, UserDefault(Swift) benziiyor
    val iller = HashMap<Int, String>()

    iller.put(27, "Gaziantep")
    iller.put(34, "Istanbul")
    iller.put(6, "Ankara")
    iller.put(35, "Zonguldak")
    iller[16] = "Bursa"
    iller[46] = "Kahramanmaras"

    iller[16] = "Yeni Bursa"
    println(iller)

    val il = iller.get(34)
    println(il)

    println("Boyut : ${iller.size}")

    for ((anahtar, deger) in iller) {
        println("$anahtar -> $deger")
    }

    iller.remove(16)
    println(iller)

    iller.clear()
    println(iller)

}