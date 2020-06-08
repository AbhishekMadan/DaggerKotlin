package com.abhi.daggerkotlin

import com.abhi.daggerkotlin.annotation.PetrolEngineAnno
import com.abhi.daggerkotlin.thirdpartyclass.Wheels
import javax.inject.Inject

class Car @Inject constructor(@PetrolEngineAnno var engine: Engine, var wheels: Wheels) {

    fun start() {
        println("Putting engine: $engine" )
        engine.start()
        println("Starting Car...!")
    }
}