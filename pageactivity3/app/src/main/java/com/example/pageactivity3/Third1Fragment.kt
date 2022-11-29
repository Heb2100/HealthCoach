package com.example.pageactivity3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.pageactivity3.databinding.FragmentSecondBinding
import com.example.pageactivity3.databinding.FragmentThird1Binding
import com.example.pageactivity3.databinding.FragmentThirdBinding

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class Third1Fragment : Fragment() {

    private var _binding: FragmentThird1Binding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentThird1Binding.inflate(inflater, container, false)
        return binding.root

    }
    //
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.button34.setOnClickListener {
            findNavController().navigate(R.id.action_third1Fragment_to_camera3Activity)
        }
        binding.button35.setOnClickListener {
            findNavController().navigate(R.id.action_third1Fragment_to_camera4Activity)
        }
        binding.button36.setOnClickListener {
            findNavController().navigate(R.id.action_third1Fragment_to_camera5Activity)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}