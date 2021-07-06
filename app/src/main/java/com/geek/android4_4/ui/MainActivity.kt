package com.geek.android4_4.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.geek.android4_4.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var ui: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        ui = ActivityMainBinding.inflate(layoutInflater)
        setContentView(ui.root)

        initViews()
    }

    private fun initViews() {
        val adapter = PagerAdapter(this)
        ui.pager.adapter = adapter
    }
}