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
import com.google.android.material.button.MaterialButton

class ProductsFragment : Fragment() {
    private lateinit var price1_title : TextView
    private lateinit var price2_title : TextView
    private lateinit var price3_title : TextView
    private lateinit var price0_title : TextView
    private lateinit var button0_prod : MaterialButton
    private lateinit var button1_prod : MaterialButton
    private lateinit var button2_prod : MaterialButton
    private lateinit var button3_prod : MaterialButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_products, container, false)
        price0_title = view.findViewById(R.id.price0_title)
        price1_title = view.findViewById(R.id.price_title)
        price2_title = view.findViewById(R.id.price2_title)
        price3_title = view.findViewById(R.id.price3_title)
        button0_prod = view.findViewById(R.id.button0_prod)
        button1_prod = view.findViewById(R.id.button1_prod)
        button2_prod = view.findViewById(R.id.button2_prod)
        button3_prod = view.findViewById(R.id.button3_prod)

        price0_title.setOnClickListener {
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.nav_host_fragment, ContactFragment()).commit()
        }

        price1_title.setOnClickListener {
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.nav_host_fragment, ContactFragment()).commit()
        }

        price2_title.setOnClickListener {
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.nav_host_fragment, ContactFragment()).commit()
        }

        price1_title.setOnClickListener {
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.nav_host_fragment, ContactFragment()).commit()
        }

        button0_prod.setOnClickListener {
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.nav_host_fragment, ContactFragment()).commit()
        }

        button1_prod.setOnClickListener {
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.nav_host_fragment, ContactFragment()).commit()
        }

        button2_prod.setOnClickListener {
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.nav_host_fragment, ContactFragment()).commit()
        }

        button3_prod.setOnClickListener {
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.nav_host_fragment, ContactFragment()).commit()
        }


        return view
    }
}