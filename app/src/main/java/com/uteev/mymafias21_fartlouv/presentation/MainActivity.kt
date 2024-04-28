package com.uteev.mymafias21_fartlouv.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.uteev.mymafias21_fartlouv.R
import com.uteev.mymafias21_fartlouv.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        startKoin {
            androidContext(this@MainActivity)
            modules(appModule)
        }
        setContentView(R.layout.activity_main)

    }
}