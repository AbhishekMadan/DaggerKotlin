package com.abhi.daggerkotlin.component

import com.abhi.daggerkotlin.MainActivity
import com.abhi.daggerkotlin.annotation.PerActivity
import com.abhi.daggerkotlin.module.DieselEngineModule
import com.abhi.daggerkotlin.module.PetrolEngineModule
import com.abhi.daggerkotlin.module.WheelModule
import dagger.BindsInstance
import dagger.Subcomponent

@PerActivity
@Subcomponent(modules = [PetrolEngineModule::class, DieselEngineModule::class, WheelModule::class])
interface ActivitySubComponent {

    fun inject(activity: MainActivity)

    @Subcomponent.Builder
    interface Builder {

        @BindsInstance
        fun bindCapacity(capacity: Int): Builder

        fun build(): ActivitySubComponent
    }
}
