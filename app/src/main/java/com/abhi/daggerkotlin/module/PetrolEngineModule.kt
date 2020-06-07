package com.abhi.daggerkotlin.module

import com.abhi.daggerkotlin.Engine
import com.abhi.daggerkotlin.PetrolEngine
import com.abhi.daggerkotlin.annotation.PetrolEngineAnno
import dagger.Module
import dagger.Provides

@Module
class PetrolEngineModule {

    @Provides
    @PetrolEngineAnno
    fun providesPetrolEngine(capacity: Int): Engine {
        return PetrolEngine(capacity)
    }
}