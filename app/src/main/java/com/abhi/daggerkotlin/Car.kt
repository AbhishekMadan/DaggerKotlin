package com.abhi.daggerkotlin

import javax.inject.Inject

class Car @Inject constructor(var engine: Engine, var wheels: Wheels) {

    fun start() {
        println("Starting Car...!")
    }
}