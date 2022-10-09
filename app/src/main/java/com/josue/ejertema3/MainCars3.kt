package com.josue.ejertema3

fun main(){
    var coche1 = Coche("Audi","A3","Gris",5,5)
    var coche2 = Coche ("","","",3,4)
    var moto1 = Motocicleta("Suzuki","Katana","Azul",1,false)
    var moto2 = Motocicleta("H. Davidson","Nightster","Negro",1,true)

    var listaMotos = mutableListOf<Motocicleta>(moto1,moto2)
    var listaCoches = mutableListOf<Coche>(coche1,coche2)
    var listaFinal = Pair (listaCoches,listaMotos)

    for (item in listaFinal.first){
        println(item.marca)
        println(item.modelo)
        println(item.color)
        println("Nº puertas: "+item.nPuertas)
        println("Nº plazas: "+item.nPlazas)
    }
    for (item in listaFinal.second){
        println(item.marca)
        println(item.modelo)
        println(item.color)
        println("Nº plazas: "+item.nPlazas)
        println("Con maletero: "+item.maletero)
    }






}
