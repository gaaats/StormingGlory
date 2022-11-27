package com.rubygames.assassino

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AlertDialog
import com.google.android.material.snackbar.Snackbar
import com.rubygames.assassino.databinding.FragmentRulesssBinding


class RulesssFragment : Fragment() {
    private var opoppo: FragmentRulesssBinding? = null
    private val hyhyhyyhyh get() = opoppo ?: throw RuntimeException("FragmentRulesssBinding = null")

    override fun onPause() {
        onDestroy()
        super.onPause()
    }



    private fun frfrrfr() {
        Snackbar.make(
            hyhyhyyhyh.root,
            "Oops something went wrong, please try again...",
            Snackbar.LENGTH_LONG
        ).show()
        requireActivity().onBackPressed()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        opoppo = FragmentRulesssBinding.inflate(inflater, container, false)
        return hyhyhyyhyh.root
    }



    private fun poopopop() {
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

            hyhyhyyhyh.root.background.alpha = 190
            hyhyhyyhyh.btnImgExitInfo.setOnClickListener {
                poopopop()
            }
            hyhyhyyhyh.btnUnderstandGameRules.setOnClickListener {
                requireActivity().onBackPressed()
            }

        } catch (e: Exception) {
            frfrrfr()
        }


        super.onViewCreated(view, savedInstanceState)
    }

    override fun onDestroy() {
        opoppo = null
        super.onDestroy()
    }

}