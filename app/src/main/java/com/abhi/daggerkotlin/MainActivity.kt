package com.abhi.daggerkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.abhi.daggerkotlin.application.MyApplication
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var car: Car

    @Inject
    lateinit var car2: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

      (application as MyApplication).appComponent
          .getActivitySubComponentBuilder()
          .bindCapacity(100)
          .build()
          .inject(this)

        car.start()
        car2.start()
    }
}
