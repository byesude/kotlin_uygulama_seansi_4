package com.example.kotlinuygulamaseansi.uygulamaseansi4_02082023.soru4

/*
Bir HashMap'teki en büyük değeri ve anahtarını bulan bir fonksiyon yazın.
 */
fun main() {
    val hashMap = hashMapOf(
        "A" to 10,
        "B" to 25,
        "C" to 5,
        "D" to 30
    )

    val enBuyukDeger = hashMap.values.max()
    val enBuyukDegerKey = hashMap.keys.max()

    println("$enBuyukDeger = $enBuyukDegerKey")
}
