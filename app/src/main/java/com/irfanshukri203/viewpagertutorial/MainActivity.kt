package com.irfanshukri203.viewpagertutorial

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val images = listOf(R.drawable.cat1, R.drawable.cat2)
        val viewImageAdapter = ViewPagerAdapter(images)

        viewPager.adapter = viewImageAdapter

        viewPager.orientation = ViewPager2.ORIENTATION_VERTICAL

        viewPager.fakeDragBy(-10F)
        viewPager.endFakeDrag()
    }
}