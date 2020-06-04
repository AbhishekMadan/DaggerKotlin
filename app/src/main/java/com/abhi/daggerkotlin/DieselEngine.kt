package com.abhi.daggerkotlin

import javax.inject.Inject

class DieselEngine @Inject constructor(): Engine {

    override fun start() {
        println("Diesel engine started!")
    }
}