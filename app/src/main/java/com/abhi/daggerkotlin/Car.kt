package com.abhi.daggerkotlin

import com.abhi.daggerkotlin.annotation.DieselEngineAnno
import com.abhi.daggerkotlin.thirdpartyclass.Driver
import com.abhi.daggerkotlin.thirdpartyclass.Wheels
import javax.inject.Inject

class Car @Inject constructor(var driver: Driver, @DieselEngineAnno var engine: Engine, var wheels: Wheels) {

    fun start() {
        println("Putting engine: $engine" )
        println("Assigned Driver: $driver" )
        engine.start()
        println("Starting Car...!")
    }
}