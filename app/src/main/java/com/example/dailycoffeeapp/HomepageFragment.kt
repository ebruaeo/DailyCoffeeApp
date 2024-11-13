package com.example.dailycoffeeapp

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.dailycoffeeapp.databinding.FragmentHomepageBinding


class HomepageFragment : Fragment() {

    private lateinit var binding: FragmentHomepageBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomepageBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.homepageButton.setOnClickListener {
            val action = HomepageFragmentDirections.actionHomepageFragmentToWheelFragment()
            Navigation.findNavController(it).navigate(action)
        }
    }


}