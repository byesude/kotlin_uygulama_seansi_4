package com.example.kotlinuygulamaseansi.uygulamaseansi4_02082023.soru7

class Memur(val calismaGun: Int, val gunlukMaas: Double) : Calisan {
    override fun maasHesapla(): Double {
        return calismaGun * gunlukMaas
    }
}