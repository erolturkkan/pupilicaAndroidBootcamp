package com.example.kotlindersleri.standart_programlama

fun main() {
    //1,2,3
    for (i in 1..3){//Swift 1...3   i = index(Dizilerdeki indeks numarası)
        println("Dongu 1 : $i")
    }

    //10 ile 20 arasında 5 er artsın
    for (x in 10..20 step 5){//infix - step
        println("Dongu 2 : $x")
    }

    //20 ile 10 arasında 5 er azalsın
    for (x in 20 downTo 10 step 5){
        println("Dongu 3 : $x")
    }

    var sayac = 1

    while (sayac < 4){
        println("Dongu 4 : $sayac")
        sayac += 1//sayac = sayac + 1
    }

    for (i in 1 .. 5){
        if (i == 3){
            break//döngüyü durdurur
        }
        println("Dongu 5 : $i")
    }

    for (i in 1 .. 5){
        if (i == 3){
            continue//Bulunduğu adımı pas geçer
        }
        println("Dongu 6 : $i")
    }

}