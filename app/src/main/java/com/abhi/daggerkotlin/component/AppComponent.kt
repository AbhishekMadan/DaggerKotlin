package com.abhi.daggerkotlin.component

import com.abhi.daggerkotlin.module.DriverModule
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [DriverModule::class])
interface AppComponent {

    fun getActivitySubComponentBuilder(): ActivitySubComponent.Builder

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun driver(name: String): Builder

        fun build(): AppComponent
    }
}