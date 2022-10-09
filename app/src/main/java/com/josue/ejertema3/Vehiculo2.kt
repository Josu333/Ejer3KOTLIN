package com.josue.ejertema3

open class Vehiculo2 (marca:String, modelo:String, color:String) {
    var marca:String =marca
        set(value){
            field=if(marca.isEmpty())"Empty" else value
        }
        get() {
            return "La marca es "+field
        }

    var modelo:String=modelo
        set(value){
            field=if(modelo.isEmpty()) "Empty" else value
        }
        get() {
            return "El modelo es $field"
        }

    var color:String=color
        set(value){
            field=if(color.isEmpty()) "Empty" else value
        }
        get(){
            return "El color es $field"
        }

    init{
        this.marca=marca
        this.modelo=modelo
        this.color=color
    }
}