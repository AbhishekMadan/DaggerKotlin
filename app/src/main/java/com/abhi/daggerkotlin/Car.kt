package com.abhi.daggerkotlin

import com.abhi.daggerkotlin.annotation.DieselEngineAnno
import com.abhi.daggerkotlin.thirdpartyclass.Wheels
import javax.inject.Inject

class Car @Inject constructor(@DieselEngineAnno var engine: Engine, var wheels: Wheels) {

    fun start() {
        engine.start()
        println("Starting Car...!")
    }
}