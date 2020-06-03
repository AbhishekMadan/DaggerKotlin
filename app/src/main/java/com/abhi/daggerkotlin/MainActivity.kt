package com.abhi.daggerkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.abhi.daggerkotlin.component.DaggerCarComponent
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var car: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        DaggerCarComponent.create()
            .inject(this)

        car.start()
    }
}
