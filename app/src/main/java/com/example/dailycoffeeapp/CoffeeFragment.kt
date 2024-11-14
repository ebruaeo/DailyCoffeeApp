package com.example.dailycoffeeapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.dailycoffeeapp.databinding.FragmentCoffeeBinding


class CoffeeFragment : Fragment() {

    private lateinit var binding: FragmentCoffeeBinding
    private lateinit var viewModel: CoffeeViewModel


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCoffeeBinding.inflate(inflater, container, false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this).get(CoffeeViewModel::class.java)
        viewModel.getRandomCoffee().let { coffee ->
            binding.run {
                coffeeNameText.text = coffee.coffeeName
                coffeeImage.setImageResource(coffee.coffeePic)
                coffeeInfoText.text = coffee.coffeeInfo
            }
        }
    }
}