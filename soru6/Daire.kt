package com.example.kotlinuygulamaseansi.uygulamaseansi4_02082023.soru6

class Daire(val yaricap: Double) : Shape {
    override fun alanHesapla(): Double {
        return Math.PI * yaricap * yaricap
    }
}