package com.dev.momohut

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.dev.momohut.adapters.OnBoardingViewPagerAdapter
import com.dev.momohut.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var onBoardingAdapter: OnBoardingViewPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        onBoardingAdapter = OnBoardingViewPagerAdapter()
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.apply {
            onboardingViewPager.adapter = onBoardingAdapter
            onboardingViewPager.isUserInputEnabled = false
        }
    }
}