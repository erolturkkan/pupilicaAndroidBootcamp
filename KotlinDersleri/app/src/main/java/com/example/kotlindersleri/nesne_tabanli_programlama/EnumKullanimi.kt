package com.example.kotlindersleri.nesne_tabanli_programlama

fun main() {
    val boyut = KonserveBoyut.ORTA
    val adet = 55
    ucretHesapla(boyut, adet)
}

fun ucretHesapla(boyut: KonserveBoyut, adet: Int){
    when (boyut) {
        KonserveBoyut.KUCUK -> println("Ücret : ${adet * 104} TL")
        KonserveBoyut.ORTA -> println("Ücret : ${adet * 207} TL")
        KonserveBoyut.BUYUK -> println("Ücret : ${adet * 309} TL")
    }
}