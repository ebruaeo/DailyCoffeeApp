package com.example.dailycoffeeapp

import android.animation.ObjectAnimator
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.Animation
import android.view.animation.LinearInterpolator
import androidx.core.animation.doOnCancel
import androidx.navigation.Navigation
import com.example.dailycoffeeapp.databinding.FragmentWheelBinding


class WheelFragment : Fragment() {

    private lateinit var binding: FragmentWheelBinding

    private var count = 0
    private var flag = false


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentWheelBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val rotationAnimator = ObjectAnimator.ofFloat(binding.wheel, "rotation", 0f, 400f)
        rotationAnimator.duration = 1000 // Animation duration in milliseconds (2 seconds)
        rotationAnimator.repeatCount = 5 // Infinite rotation
        rotationAnimator.interpolator = LinearInterpolator() // Smooth linear rotation
        rotationAnimator.doOnCancel {
            val action = WheelFragmentDirections.actionWheelFragmentToCoffeeFragment()
            Navigation.findNavController(requireView()).navigate(action)
        }

        binding.spinButton.run {
            setOnClickListener {
                if (text == "Stop") {
                    text = "Spin the Wheel"
                    rotationAnimator.cancel()
                } else {
                    rotationAnimator.start()
                    text = "Stop"
                }

            }

        }


    }

    val coffees = arrayOf("latte", "americano", "cafe crema")


//    override fun onAnimationStart(animation: Animation?) {
//        binding.spinButton.isEnabled = false
//    }
//
//    override fun onAnimationEnd(animation: Animation?) {
//        val action = WheelFragmentDirections.actionWheelFragmentToCoffeeFragment()
//        Navigation.findNavController(requireView()).navigate(action)
//    }
//
//    override fun onAnimationRepeat(animation: Animation?) {}

}