package com.example.globalenergy.Fragments

import android.os.Bundle
import android.service.autofill.TextValueSanitizer
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import com.example.globalenergy.R

class ProductsFragment : Fragment() {
    private lateinit var price1_title : TextView
    private lateinit var price2_title : TextView
    private lateinit var price3_title : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_products, container, false)
        price1_title = view.findViewById(R.id.price_title)
        price2_title = view.findViewById(R.id.price2_title)
        price3_title = view.findViewById(R.id.price3_title)




        return view
    }
}