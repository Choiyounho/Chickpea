package com.application.chickpea

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout


class MainActivity : AppCompatActivity() {
    private val viewPager by lazy{ findViewById<ViewPager>(R.id.calendar_grid) }
    private lateinit var slide : SliderAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cal_k)

        slide = SliderAdapter(this)
//        viewPager.adapter = slide
    }
}