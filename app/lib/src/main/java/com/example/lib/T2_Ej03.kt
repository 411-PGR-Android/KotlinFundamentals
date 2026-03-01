package com.example.lib

open class Animal(val nombre: String, val edad: Int) {
    open fun hacerSonido () {
        println("Sonido genérico")
    }
    fun describirse() {
        println("Soy $nombre y tengo $edad años")
    }
}

class Perro(nombre: String, edad: Int) : Animal (nombre, edad) {
    override fun hacerSonido() {
        println("Gooof")
    }
}

class Gato(nombre: String, edad: Int) : Animal (nombre, edad) {
    override fun hacerSonido() {
        println("Miaaauu")
    }
}

class Vaca(nombre: String, edad: Int) : Animal (nombre, edad) {
    override fun hacerSonido() {
        println("Muuuu")
    }
}

fun main () {
    val perro = Perro ("Rex", 3)
    perro.describirse()
    perro.hacerSonido()
    val gato = Gato ("Duque", 10)
    gato.describirse()
    gato.hacerSonido()
    val vaca = Vaca ("kiki", 2)
    vaca.describirse()
    vaca.hacerSonido()
}