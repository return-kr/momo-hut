package com.dev.momohut.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.dev.momohut.R
import com.dev.momohut.databinding.OnboardingViewpagerItemLayoutBinding

class OnBoardingViewPagerAdapter : RecyclerView.Adapter<OnBoardingViewPagerAdapter.ViewHolder>() {

    inner class ViewHolder(private val binding: OnboardingViewpagerItemLayoutBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind() {
            binding.apply {
                when (adapterPosition) {
                    0 -> {
                        sliderImage.setImageResource(R.drawable.slider_first_image)
                    }

                    1 -> {
                        sliderImage.setImageResource(R.drawable.slider_second_image)
                    }
                }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = OnboardingViewpagerItemLayoutBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int = 2

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind()
    }
}