package com.abhi.daggerkotlin

import javax.inject.Inject

class PetrolEngine @Inject constructor(): Engine {
    override fun start() {
        println("Petrol engine started")
    }
}