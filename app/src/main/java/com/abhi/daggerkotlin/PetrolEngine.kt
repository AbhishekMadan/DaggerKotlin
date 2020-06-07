package com.abhi.daggerkotlin

import javax.inject.Inject

class PetrolEngine @Inject constructor(val capacity: Int): Engine {

    override fun start() {
        println("Petrol engine started. Capacity $capacity")
    }
}