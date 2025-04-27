package com.example.kotlindersleri.nesne_tabanli_programlama.collections

fun main() {
    val f1 = Filmler(1,"Interstellar",125)
    val f2 = Filmler(2,"The Hateful Eight",145)
    val f3 = Filmler(3,"Django",175)

    val filmler = ArrayList<Filmler>()
    filmler.add(f1)
    filmler.add(f2)
    filmler.add(f3)

    for (film in filmler) {
        println("ID : ${film.id} Ad : ${film.ad} Fiyat : ${film.fiyat}")
    }

    //Sıralama - sorting
    println("----- Fiyata gore artan -----")
    val siralama1 = filmler.sortedWith(compareBy { it.fiyat })
    for (film in siralama1) {
        println("ID : ${film.id} Ad : ${film.ad} Fiyat : ${film.fiyat}")
    }

    println("----- Ada gore azalan -----")
    //DESC
    val siralama2 = filmler.sortedWith(compareByDescending { it.ad })
    for (film in siralama2) {
        println("ID : ${film.id} Ad : ${film.ad} Fiyat : ${film.fiyat}")
    }

    //Filtreleme
    println("----- Filtreleme 1 Fiyati 150'den kucuk filmler -----")
    val filtreleme1 = filmler.filter { it.fiyat < 150 }
    for (film in filtreleme1) {
        println("ID : ${film.id} Ad : ${film.ad} Fiyat : ${film.fiyat}")
    }

    //Filtreleme 2
    println("----- Filtreleme 2 j karakteri iceren filmler -----")
    val filtreleme2 = filmler.filter { it.ad.contains("j") }
    for (film in filtreleme2) {
        println("ID : ${film.id} Ad : ${film.ad} Fiyat : ${film.fiyat}")
    }




}