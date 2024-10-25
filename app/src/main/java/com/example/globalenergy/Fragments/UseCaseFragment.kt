package com.example.globalenergy.Fragments

import android.animation.ObjectAnimator
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.example.globalenergy.R

class UseCaseFragment : Fragment() {

    lateinit var image1: ImageView
    lateinit var image2: ImageView
    lateinit var image3: ImageView
    lateinit var image4: ImageView
    lateinit var image5: ImageView
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_use_case, container, false)
        image1 = view.findViewById(R.id.imageCase1)
        image2 = view.findViewById(R.id.imageCase2)
        image3 = view.findViewById(R.id.imageCase3)
        image4 = view.findViewById(R.id.imageCase4)
        image5 = view.findViewById(R.id.imageCase5)
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
            startDelay = 250
            start()
        }

        // Image 3: Animate from left to center
        ObjectAnimator.ofFloat(image3, "translationX", 0f).apply {
            duration = 800
            startDelay = 400
            start()
        }

        ObjectAnimator.ofFloat(image4, "translationX", 0f).apply {
            duration = 800
            startDelay = 550
            start()
        }

        // Image 3: Animate from left to center
        ObjectAnimator.ofFloat(image5, "translationX", 0f).apply {
            duration = 800
            startDelay = 700
            start()
        }
    }
}