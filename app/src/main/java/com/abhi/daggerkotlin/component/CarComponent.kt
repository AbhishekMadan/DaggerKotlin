package com.abhi.daggerkotlin.component

import com.abhi.daggerkotlin.MainActivity
import com.abhi.daggerkotlin.module.DieselEngineModule
import com.abhi.daggerkotlin.module.PetrolEngineModule
import dagger.Component

@Component(modules = [PetrolEngineModule::class, DieselEngineModule::class])
interface CarComponent {

    fun inject(mainActivity: MainActivity)
}