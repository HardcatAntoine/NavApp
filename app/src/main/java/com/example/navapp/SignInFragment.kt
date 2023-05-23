package com.example.navapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.navapp.databinding.FragmentSignInBinding

class SignInFragment : Fragment() {
    lateinit var bindingSign: FragmentSignInBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        bindingSign = FragmentSignInBinding.inflate(layoutInflater)
        return bindingSign.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        bindingSign.btnBack.setOnClickListener {view ->
            view.findNavController().navigate(R.id.action_signInFragment_to_loginFragment)

        }

    }

}