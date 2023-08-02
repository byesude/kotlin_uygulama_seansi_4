package com.example.kotlinuygulamaseansi.uygulamaseansi4_02082023.soru7

class Mudur(val calismaSaati: Int, val saatlikUcret: Double) : Calisan {
    override fun maasHesapla(): Double {
        return calismaSaati * saatlikUcret
    }
}