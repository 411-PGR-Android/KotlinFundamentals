package com.example.lib

class CuentaBancaria (val titular: String) {
    var saldo: Double = 0.0

    fun depositar(cantidad: Double){
        saldo += cantidad
        println("Deposito realizado, Nuevo saldo: $saldo")
    }
    fun retirar(cantidad: Double){
        if (cantidad <= saldo ){
            saldo -= cantidad
            println("Retiro realizado. Nuevo saldo: $saldo")
        }else{
            println("Fondos insuficientes")
        }
    }

    fun mostrarSaldo(){
        println("Saldo actual de $titular: $saldo")
    }
}

fun main () {
    val cuenta = CuentaBancaria("Maria Garcia")
    cuenta.depositar(1000.0)
    cuenta.retirar(400.0)
    cuenta.retirar(800.0) // no debe permitirlo
    cuenta.mostrarSaldo()
}
