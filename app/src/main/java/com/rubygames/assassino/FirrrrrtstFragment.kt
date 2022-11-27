package com.rubygames.assassino

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar
import com.rubygames.assassino.databinding.FragmentFirrrrrtstBinding
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup



class FirrrrrtstFragment : Fragment() {

    private fun afrhgthUygtgtgttt() {
        Snackbar.make(
            kikololo.root,
            "I have error, try again",
            Snackbar.LENGTH_LONG
        ).show()
        requireActivity().onBackPressed()
    }

    private var hyhhyhyyh: FragmentFirrrrrtstBinding? = null
    private val kikololo
        get() = hyhhyhyyh ?: throw RuntimeException("FragmentFirrrrrtstBinding = null")


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        hyhhyhyyh = FragmentFirrrrrtstBinding.inflate(inflater, container, false)
        return kikololo.root
    }


    override fun onDestroy() {
        hyhhyhyyh = null
        super.onDestroy()
    }

    override fun onPause() {
        onDestroy()
        super.onPause()
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        try {

            kikololo.root.background.alpha = 220

            kikololo.btnPlayGame.setOnClickListener {
                findNavController().navigate(R.id.action_firrrrrtstFragment_to_plaaaayGaaameFragment)
            }
            kikololo.btnImgQuestion.setOnClickListener {
                findNavController().navigate(R.id.action_firrrrrtstFragment_to_rulesssFragment)
            }

        } catch (e: Exception) {
            afrhgthUygtgtgttt()
        }

        super.onViewCreated(view, savedInstanceState)
    }




}