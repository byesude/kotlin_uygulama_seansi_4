package com.example.kotlinuygulamaseansi.uygulamaseansi4_02082023.soru6

class Dikdortgen(val uzunluk: Double, val genislik: Double) : Shape {
    override fun alanHesapla(): Double {
        return uzunluk * genislik
    }
}
