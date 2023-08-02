package com.example.kotlinuygulamaseansi.uygulamaseansi4_02082023.soru2
/*
 Verilen bir liste içerisindeki elemanların sayısını bir HashMap olarak döndüren bir fonksiyon yazın.
 */
fun <T> countElements(list: List<T>): HashMap<T, Int> {
    val elementCounts = HashMap<T, Int>()

    for (element in list) {
        elementCounts[element] = elementCounts.getOrDefault(element, 0) + 1
    }

    return elementCounts
}

fun main() {
    val liste = listOf(1, 2, 3, 2, 1, 3, 3, 4, 5, 4, 6, 7, 6, 4)

    val elemanSayilari = countElements(liste)

    println("Eleman Sayıları:")
    for ((eleman, sayi) in elemanSayilari) {
        println("$eleman -> $sayi")
    }
}
