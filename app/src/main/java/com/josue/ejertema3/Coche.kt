package com.josue.ejertema3

class Coche(marca:String,modelo:String,color:String, nPuertas:Int, nPlazas:Int):
    Vehiculo2(marca,modelo,color) {
        var nPuertas: Int = nPuertas
            get () = field
        var nPlazas: Int= nPlazas
            get() = field

    init{
        this.nPuertas=nPuertas
        this.nPlazas=nPlazas
    }

    override fun mostarVehiculo() {
        super.mostarVehiculo()
        println("Nº puertas: "+nPuertas)
        println("Nº plazas: $nPlazas")
    }

}