package com.example.navapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.navapp.databinding.FragmentLoginBinding


class LoginFragment : Fragment() {
    lateinit var bindingLogin: FragmentLoginBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        bindingLogin = FragmentLoginBinding.inflate(layoutInflater, container, false)
        return bindingLogin.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        bindingLogin.btnSignIn.setOnClickListener { view ->
            if (checkUser() == true) {
                view.findNavController().navigate(R.id.action_loginFragment_to_signInFragment)
            } else {
                Toast.makeText(requireContext(), "Input is invalid", Toast.LENGTH_SHORT).show()
            }


        }
    }

    private fun checkUser(): Boolean {
        val checkMap = mapOf("111" to "222", "333" to "444")
        val login = bindingLogin.tvLogin.text.toString().orEmpty()
        val password = bindingLogin.tvPassword.text.toString().orEmpty()
        return checkMap.containsKey(login) && checkMap[login] == password
    }
}




