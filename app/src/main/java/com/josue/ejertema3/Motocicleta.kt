package com.josue.ejertema3

class Motocicleta(marca:String, modelo:String,color:String, nPlazas:Int, maletero:Boolean):
    Vehiculo2(marca,modelo,color) {
    var nPlazas: Int=nPlazas
        get() = field

    var maletero:Boolean = maletero
        get() = field

    init{
        this.nPlazas=nPlazas
        this.maletero=maletero
    }
    override fun mostarVehiculo(){
        super.mostarVehiculo()
        println("Nº plazas: $nPlazas")
        println("Maletero: $maletero")
    }

}