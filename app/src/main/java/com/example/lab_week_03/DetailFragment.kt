package com.example.lab_week_03

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import android.widget.Button

class DetailFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_detail, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val coffeeTitle = view.findViewById<TextView>(R.id.coffee_title)
        val coffeeDesc = view.findViewById<TextView>(R.id.coffee_desc)
        val backButton = view.findViewById<Button>(R.id.back_button)

        val coffeeId = arguments?.getInt(ListFragment.COFFEE_ID) ?: 0

        when (coffeeId) {
            R.id.affogato -> {
                coffeeTitle.text = getString(R.string.affogato_title)
                coffeeDesc.text = getString(R.string.affogato_desc)
            }
            R.id.americano -> {
                coffeeTitle.text = getString(R.string.americano_title)
                coffeeDesc.text = getString(R.string.americano_desc)
            }
            R.id.latte -> {
                coffeeTitle.text = getString(R.string.latte_title)
                coffeeDesc.text = getString(R.string.latte_desc)
            }
            R.id.espresso -> {
                coffeeTitle.text = getString(R.string.espresso_title)
                coffeeDesc.text = getString(R.string.espresso_desc)
            }
            R.id.cappuccino -> {
                coffeeTitle.text = getString(R.string.cappuccino_title)
                coffeeDesc.text = getString(R.string.cappuccino_desc)
            }
        }

        backButton.setOnClickListener {
            parentFragmentManager.popBackStack()
        }
    }
}
