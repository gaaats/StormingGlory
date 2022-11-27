package com.rubygames.assassino

import android.os.Bundle
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar
import com.rubygames.assassino.databinding.FragmentNextLevelBinding
import kotlinx.coroutines.delay
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AlertDialog
import androidx.lifecycle.lifecycleScope



class NextLevelFragment : Fragment() {
    private fun detdefdfetgtt() {
        Snackbar.make(
            gtgyhujuju.root,
            "Oops something went wrong, please try again...",
            Snackbar.LENGTH_LONG
        ).show()
        requireActivity().onBackPressed()
    }

    private var gtgtgthyjhujufrrfr: FragmentNextLevelBinding? = null
    private val gtgyhujuju
        get() = gtgtgthyjhujufrrfr ?: throw RuntimeException("FragmentNextLevelBinding = null")

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        gtgtgthyjhujufrrfr = FragmentNextLevelBinding.inflate(inflater, container, false)
        return gtgyhujuju.root
    }



    override fun onPause() {
        onDestroy()
        super.onPause()
    }

    override fun onDestroy() {
        gtgtgthyjhujufrrfr = null
        super.onDestroy()
    }

    private fun tgttgt() {
        AlertDialog.Builder(requireContext())
            .setTitle("Exit")
            .setMessage("Current data will not be saved, EXIT?")
            .setPositiveButton("Yes, Exit") { _, _ ->
                requireActivity().onBackPressed()
            }
            .setNegativeButton("No") { _, _ ->
            }
            .setCancelable(true)
            .create()
            .show()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        try {
            lifecycleScope.launchWhenCreated {
                delay(1500)
                findNavController().navigate(R.id.action_nextLevelFragment_to_plaaaayGaaameFragment )
            }

        } catch (e: Exception) {
            detdefdfetgtt()
        }


        super.onViewCreated(view, savedInstanceState)
    }
}