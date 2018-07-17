package me.dmba.teamworkboards.screens

import android.os.Bundle
import dagger.android.support.DaggerAppCompatActivity
import me.dmba.teamworkboards.R

class MainActivity : DaggerAppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

}
