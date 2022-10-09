package com.josue.ejertema3

fun main(){
    var v1=Vehiculo()
    var v2=Vehiculo()
    var v3=Vehiculo()
    v1.anadirV("Opel","Corsa","Azul")
    v2.anadirV("","","")
    v3.anadirV("Fiat","","Gris")


    var lista1= listOf<Vehiculo>(v1,v2,v3)
    var pos=0;
    while (pos < lista1.size){
        println(lista1.get(pos).marca)
        println(lista1.get(pos).modelo)
        println(lista1.get(pos).color)
        pos++;
    }


    /*coche2.marca ="";
    println(lista1.get(1).marca)
    println(lista1.get(1).modelo)
    println(lista1.get(1).color)*/
}