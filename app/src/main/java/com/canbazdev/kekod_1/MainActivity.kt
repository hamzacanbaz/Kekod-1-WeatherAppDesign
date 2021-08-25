package com.canbazdev.kekod_1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.canbazdev.kekod_1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root

        setContentView(view)

        val fragments = arrayListOf(FirstFragment(), SecondFragment(), ThirdFragment())
        val adapter = ViewPagerAdapter(fragments,supportFragmentManager,lifecycle)
        binding.viewPager2.adapter = adapter
    }
}