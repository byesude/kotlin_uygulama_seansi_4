package com.example.kotlinuygulamaseansi.uygulamaseansi4_02082023.soru2
/*
 Verilen bir liste içerisindeki elemanların sayısını bir HashMap olarak döndüren bir fonksiyon yazın.
 */

fun <T> hesapla(liste: List<T>): HashMap<T, Int> {
    val elemanSayilari = HashMap<T, Int>()

    for (i in liste) {
        elemanSayilari[i] = elemanSayilari.getOrDefault(i, 0) + 1
    }

    return elemanSayilari
}

fun main() {
    val liste = listOf(1, 2, 3, 2, 1, 3, 3, 4, 5, 4, 6, 7, 6, 4)

    val elemanSayilari = hesapla(liste)

    for ((eleman, sayi) in elemanSayilari) {
        println("$eleman -> $sayi")
    }
}

