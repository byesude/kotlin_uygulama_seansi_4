package com.example.kotlinuygulamaseansi.uygulamaseansi4_02082023.soru3

/*
Bir HashMap'teki tüm değerleri toplayan bir fonksiyon yazın.
 */
fun main() {
    val hashMap = hashMapOf(
        "a" to 50,
        "b" to 30,
        "c" to 20,
        "d" to 15
    )

    val toplam = hashMap.values.sum()

    println("Toplam: $toplam")
}

