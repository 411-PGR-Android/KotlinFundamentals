package com.example.lib

/* 1. Crea un programa que tenga un precio de comida y un porcentaje de propina.
e imprimir cuanto es el total a pagar
 */
//tring interpolatiton
//que es un hilo??? NULL SAFETY
fun main () {
    println("Hola mundo")
    //1.
    val price: Double = 150.0
    val percentage: Double = 0.10
    val tip: Double = price * percentage
    val total: Double = price + tip
    println("El costo de la comida es:  + $$total")

    //El portero de la discoteca. Verifica que una persona peueda entrar en la disco.
    // Solo si es mayor de edad
    println("Pon una edad")
    val input = readlnOrNull()
    val age = input?.toIntOrNull()
    //utilizar when en lugar de if else
//    if(age == null){
//        println("el número que pusiste no es u numero entero, insertalo bien !!")
//    }
//    else if(age > 18){
//        println("eres mayor de edad, pasale a la discteca")
//    }
//    else{
//        println("No puedes pasar pai")
//    }
//}

    for (i in 1..10) {
        println(i)
    }

    //Ciclo for al reves
    for (i in 10 downTo 2) {
        println(i)
    }
    for (i in 100 downTo 0 step 10) {
        println(i)
    }

    //when
    when (age) {
        null -> println("Ingresa un número valido pa")
        in 18..Integer.MAX_VALUE -> println("entrale")
        else -> println("No puedes pasar pai")
    }
    var counter: Int = 12
    while (counter < 20) {
        println("EL contador es menor que 20")
        counter++
    }

    //Do while -> Ejecuta primero el bloque de codigo y despues evalua la condicion
    //Operadores logicos: && ||
    //Operador aritmetico: + - * / %
    do {
        println("El contador vale menos que 30")
        counter++
    } while (counter < 30)

//Ejercicio Determinar si un número ingresado por el usuario es un número primo o no primo
    println("Pon un número para ver si es primo o no")
    val inputt = readlnOrNull()
    val number = inputt?.toIntOrNull()
    when (number) {
        null -> println("Ingresa un número valido pa")
        in 18..Integer.MAX_VALUE -> println("entrale")
        else -> println("No puedes pasar pai")
    }
    var counter: Int = 12
    while (counter < 20) {
        println("EL contador es menor que 20")
        counter++
    }
    }
}