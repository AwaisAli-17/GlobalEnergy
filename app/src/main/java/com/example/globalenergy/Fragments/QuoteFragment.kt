package com.example.globalenergy.Fragments


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.fragment.app.Fragment
import com.example.globalenergy.R
import com.google.android.material.textfield.MaterialAutoCompleteTextView


class QuoteFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_quote, container, false)
        val dropdownMenu = view.findViewById<MaterialAutoCompleteTextView>(R.id.property_type)

        val items = listOf(
            "Commercial - Agricultural",
            "Commercial - Communal Heating",
            "Commercial - Education",
            "Commercial - Hospitality",
            "Commercial - Industrial",
            "Commercial - Other",
            "Residential - Detached",
            "Residential - Semi-detached",
            "Residential - Terrace",
            "Residential - Other",
            )
        val adapter = ArrayAdapter(requireContext(), R.layout.dropdown_item, items)
        dropdownMenu.setAdapter(adapter)

        val dropdownHeatMenu = view.findViewById<MaterialAutoCompleteTextView>(R.id.heat_source)

        val heatSourceItems = listOf(
            "Gas",
            "Oil",
            "Electric Storage",
            "LPG",
            "Other"
        )
        val adapter2 = ArrayAdapter(requireContext(), R.layout.dropdown_item, heatSourceItems)
        dropdownHeatMenu.setAdapter(adapter2)
        return view

    }

}