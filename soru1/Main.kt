package com.example.kotlinuygulamaseansi.uygulamaseansi4_02082023.soru1

/*
Verilen iki HashMap'in kesişimini bulan bir fonksiyon yazın.
 */

fun<K,V> kesisim(map1 : HashMap<K,V>, map2 : HashMap<K,V>) : HashMap<K,V>{
    val kesisenler = HashMap<K,V>()


    for ((key,value) in map1){
    if(map2.containsKey(key) && map2[key]==value){
    kesisenler[key]=value
    }
 }
    return  kesisenler
}

fun main() {
    val map1 = hashMapOf(
        "A" to 1,
        "B" to 2,
        "C" to 3
    )

    val map2 = hashMapOf(
        "B" to 2,
        "C" to 3,
        "D" to 4
    )

    val kesisenler = kesisim(map1, map2)

    for ((key, value) in kesisenler) {
        println("Kesişenler: $key -> $value")
    }
}