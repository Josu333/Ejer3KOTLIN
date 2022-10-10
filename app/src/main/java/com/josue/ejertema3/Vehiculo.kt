package com.josue.ejertema3

 class Vehiculo() {
    var marca: String = ""
        set(value) {
            field = if (value.isEmpty()) "Vacio" else value
        }
        get() {
            return "La marca es $field"
        }

    var modelo: String = ""
        set(value) {
            field = if (value.isEmpty()) "Empty" else value
        }
        get() {
            return "El modelo es $field"
        }

    var color: String = ""
        set(value) {
            field = if (value.isEmpty()) "Empty" else value
        }
        get() {
            return "El color es $field"
        }

    fun anadirV(marca: String, modelo: String, color: String) {
        this.marca = marca
        this.modelo = modelo
        this.color = color
    }
}