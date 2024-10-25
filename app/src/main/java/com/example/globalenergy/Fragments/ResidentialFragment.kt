package com.example.globalenergy.Fragments

import android.animation.ObjectAnimator
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.example.globalenergy.R

class ResidentialFragment : Fragment() {
    lateinit var image1: ImageView
    lateinit var image2: ImageView
    lateinit var image3: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_residential, container, false)
        image1 = view.findViewById(R.id.imageRes1)
        image2 = view.findViewById(R.id.imageRes2)
        image3 = view.findViewById(R.id.imageRes3)
        animateImages()
        return view
    }

    private fun animateImages() {
        // Image 1: Animate from left to center
        ObjectAnimator.ofFloat(image1, "translationX", 0f).apply {
            duration = 800
            startDelay = 100
            start()
        }

        // Image 2: Animate from right to center
        ObjectAnimator.ofFloat(image2, "translationX", 0f).apply {
            duration = 800
            startDelay = 200
            start()
        }

        // Image 3: Animate from left to center
        ObjectAnimator.ofFloat(image3, "translationX", 0f).apply {
            duration = 800
            startDelay = 300
            start()
        }
    }
}