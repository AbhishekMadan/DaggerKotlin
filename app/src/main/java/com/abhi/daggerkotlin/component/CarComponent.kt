package com.abhi.daggerkotlin.component

import com.abhi.daggerkotlin.MainActivity
import com.abhi.daggerkotlin.module.DieselEngineModule
import com.abhi.daggerkotlin.module.PetrolEngineModule
import com.abhi.daggerkotlin.module.WheelModule
import dagger.BindsInstance
import dagger.Component

@Component(
    modules = [
        PetrolEngineModule::class,
        DieselEngineModule::class,
        WheelModule::class]
)
interface CarComponent {

    fun inject(mainActivity: MainActivity)

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun capacity(capacity: Int): Builder

        fun build(): CarComponent
    }
}