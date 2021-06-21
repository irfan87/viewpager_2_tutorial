package com.irfanshukri203.viewpagertutorial

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val images = listOf(R.drawable.cat1, R.drawable.cat2)
        val viewImageAdapter = ViewPagerAdapter(images)

        viewPager.adapter = viewImageAdapter

        TabLayoutMediator(tabLayout, viewPager) { tab, position ->
            tab.text = "Cat #${position + 1}"
        }.attach()

        tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab?) {
                Toast.makeText(this@MainActivity, "Selected ${tab?.text}", Toast.LENGTH_LONG).show()
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {
                Toast.makeText(this@MainActivity, "Unselected ${tab?.text}", Toast.LENGTH_LONG).show()
            }

            override fun onTabReselected(tab: TabLayout.Tab?) {
                Toast.makeText(this@MainActivity, "Reselected ${tab?.text}", Toast.LENGTH_LONG).show()
            }
        })
    }
}