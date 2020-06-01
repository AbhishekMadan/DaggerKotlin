package com.abhi.daggerkotlin.component

import com.abhi.daggerkotlin.Car
import dagger.Component

@Component
interface CarComponent {

    fun getCar(): Car
}