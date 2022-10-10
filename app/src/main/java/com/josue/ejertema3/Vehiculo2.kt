package com.josue.ejertema3

open class Vehiculo2 (marca:String, modelo:String, color:String) {
    var marca:String =marca
        set(value){
            field=if (value.isEmpty()) "indefinida" else value
        }
        get() {
            return "La marca es "+field
        }

    var modelo:String=modelo
        set(value){
            field=if(value.isEmpty()) "indefinido" else value
        }
        get() {
            return "El modelo es $field"
        }

    var color:String=color
        set(value){
            field=if(value.isEmpty()) "indefinido" else value
        }
        get(){
            return "El color es $field"
        }

    init{
        this.marca=marca
        this.modelo=modelo
        this.color=color
    }
    open fun mostarVehiculo(){
        println(marca)
        println(modelo)
        println(color)
    }
}