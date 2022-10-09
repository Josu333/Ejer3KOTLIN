package com.josue.ejertema3

fun main(){
    var coche1=Vehiculo2("","","")
    var coche2=Vehiculo2("Dacia","Logan","Rojo")
    var coche3=Vehiculo2("Mercedes","CLK","")
    var lista1= listOf<Vehiculo2>(coche1,coche2,coche3)
    var pos=0;
    while (pos < lista1.size) {
        println(lista1.get(pos).marca)
        println(lista1.get(pos).modelo)
        println(lista1.get(pos).color)
        pos++
    }
}