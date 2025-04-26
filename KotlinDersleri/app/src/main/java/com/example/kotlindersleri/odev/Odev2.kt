package com.example.kotlindersleri.odev

fun main() {
    val sonuc = celciusToFahrenhiet(32.0)
    println("Sonuc : $sonuc")

    val cevre = dikdortgenCevreHesapla(5, 10)
    println("Dikdortgen cevresi : $cevre")

    val faktoriyel = faktoriyelHesapla(5)
    println("Faktoriyel : $faktoriyel")

    val count = countALetterInWord("Merhaba", 'a')
    println("a harfi sayisi : $count")

    val count2 = countALetterInWord2("Merhaba", 'a')
    println("a harfi sayisi : $count2")

    val toplamIcAcilar = kenarSayisinaGoreIcAcilarToplami(4)
    println("Toplam ic acilar : $toplamIcAcilar")

    val maas = maasHesapla(20)
    println("Maas : $maas")

    val maas2 = maasHesapla(28)
    println("Maas : $maas2")

    val kota = kotaUcretHesapla(60)
    println("Ucret : $kota")

    val kota2 = kotaUcretHesapla(100)
    println("Ucret : $kota2")

}

fun celciusToFahrenhiet(celcius: Double) : Double {
    val fahrenhiet = (celcius * 1.8) + 32
    return fahrenhiet
}

fun dikdortgenCevreHesapla(kenar1: Int, kenar2: Int) : Int {
    val cevre = (kenar1 + kenar2) * 2
    return cevre
}

fun faktoriyelHesapla(sayi: Int) : Int {
    return  if(sayi - 1 > 0){
        sayi * faktoriyelHesapla(sayi-1)
    }else {
        1
    }
}

fun countALetterInWord(word: String, letter: Char) : Int {
    if (word.isEmpty()) {
        return 0
    }else{
        if (word.first() == letter) {
            return 1 + countALetterInWord(word.drop(1), letter)
        }else{
            return countALetterInWord(word.drop(1), letter)
        }
    }
}

fun countALetterInWord2(word: String, letter: Char) : Int {
    return word.count{ it == letter}
}

fun kenarSayisinaGoreIcAcilarToplami(kenarSayisi: Int) : Int {
    return (kenarSayisi-2) * 180
}

fun maasHesapla(gunSayisi: Int) : Int{
    var kaacSaatCalisti = gunSayisi * 8
    var calismaSaatUcreti = 10
    var mesaiUcreti = 20
    if (kaacSaatCalisti <= 160){
        return kaacSaatCalisti * calismaSaatUcreti
    }else{
        return (160 * calismaSaatUcreti) + ((kaacSaatCalisti - 160) * mesaiUcreti)
    }
}

fun kotaUcretHesapla(kota: Int) : Int {
    if (kota <= 50) {
        return 100
    }else{
        return 100 + ((kota - 50) * 4)
    }
}