package com.example.kotlinuygulamaseansi.uygulamaseansi4_02082023.soru6

fun main() {
    val dikdortgen = Dikdortgen(5.0, 3.0)
    val daire = Daire(4.0)

    println("Dikdörtgenin Alanı: ${dikdortgen.alanHesapla()}")
    println("Dairenin Alanı: ${daire.alanHesapla()}")
}