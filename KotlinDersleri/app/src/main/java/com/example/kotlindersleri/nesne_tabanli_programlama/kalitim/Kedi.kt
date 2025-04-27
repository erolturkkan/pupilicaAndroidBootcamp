package com.example.kotlindersleri.nesne_tabanli_programlama.kalitim

class Kedi : Memeli() {
    override fun sesCikar() {
        //super.sesCikar() -> Super: kalıtım ile üst sınıfı(MEMELİ) temsil eder
        println("Miyav Miyav")
    }
}