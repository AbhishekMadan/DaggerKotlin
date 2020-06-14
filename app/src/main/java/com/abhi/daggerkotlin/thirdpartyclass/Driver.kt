package com.abhi.daggerkotlin.thirdpartyclass

class Driver constructor(var name: String) {

    override fun toString(): String {
        return super.toString() + " -> $name"
    }
}