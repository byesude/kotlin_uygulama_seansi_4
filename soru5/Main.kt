package com.example.kotlinuygulamaseansi.uygulamaseansi4_02082023.soru5

/*
Bir "Cizilebilir" (Drawable) arayüzü tanımlayın ve bu arayüzü uygulayan sınıfları
(Kalem ve Silgi) oluşturun. Her sınıfın "ciz" metodu olsun.
 */
fun main() {
    val kalem = Kalem()
    val silgi = Silgi()

    kalem.ciz()
    silgi.ciz()
}