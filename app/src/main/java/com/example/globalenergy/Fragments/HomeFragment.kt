package com.example.globalenergy.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.globalenergy.R
import com.google.android.material.card.MaterialCardView

class HomeFragment : Fragment() {

    private lateinit var commercial_card: MaterialCardView
    private lateinit var quote_card: MaterialCardView
    private lateinit var residential_card: MaterialCardView
    private lateinit var study_card: MaterialCardView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_home, container, false)
        commercial_card = view.findViewById(R.id.commercial_card)
        quote_card = view.findViewById(R.id.quote_card)
        residential_card = view.findViewById(R.id.residential_card)
        study_card = view.findViewById(R.id.study_card)
        commercial_card.setOnClickListener {
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.nav_host_fragment, CommercialFragment()).commit()
        }
        quote_card.setOnClickListener {
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.nav_host_fragment, QuoteFragment()).commit()
        }
        study_card.setOnClickListener {
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.nav_host_fragment, UseCaseFragment()).commit()
        }
        residential_card.setOnClickListener {
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.nav_host_fragment, ResidentialFragment()).commit()
        }

        return view
    }

}