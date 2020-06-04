package com.abhi.daggerkotlin

import com.abhi.daggerkotlin.annotation.PetrolEngineAnno
import javax.inject.Inject

class Car @Inject constructor(@PetrolEngineAnno var engine: Engine, var wheels: Wheels) {

    fun start() {
        engine.start()
        println("Starting Car...!")
    }
}