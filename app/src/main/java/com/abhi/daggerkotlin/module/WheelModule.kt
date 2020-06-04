package com.abhi.daggerkotlin.module

import com.abhi.daggerkotlin.thirdpartyclass.Rim
import com.abhi.daggerkotlin.thirdpartyclass.Tyre
import com.abhi.daggerkotlin.thirdpartyclass.Wheels
import dagger.Module
import dagger.Provides

@Module
class WheelModule {

    @Provides
    fun providesRim(): Rim {
        return Rim()
    }

    @Provides
    fun providesTyre(): Tyre {
        return Tyre()
    }

    @Provides
    fun providesWheels(rim: Rim, tyre: Tyre): Wheels {
        println("Proving wheels from WheelModule.")
        return Wheels(rim, tyre)
    }
}