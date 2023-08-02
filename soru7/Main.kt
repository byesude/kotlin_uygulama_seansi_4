package com.example.kotlinuygulamaseansi.uygulamaseansi4_02082023.soru7


fun main() {
    val mudur = Mudur(40, 50.0)
    val memur = Memur(22, 100.0)

    println("Müdür'ün Maaşi: ${mudur.maasHesapla()} TL")
    println("Memur'un Maaşi: ${memur.maasHesapla()} TL")
}
