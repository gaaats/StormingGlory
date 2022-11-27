package com.rubygames.assassino

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AlertDialog
import androidx.core.content.ContextCompat
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar
import com.rubygames.assassino.databinding.FragmentPlaaaayGaaameBinding


class PlaaaayGaaameFragment : Fragment() {

    private var hyhhyhy = 1
    private var ffrrfrf = true

    private var dededdeed: FragmentPlaaaayGaaameBinding? = null
    private val frfrrfrfr
        get() = dededdeed ?: throw RuntimeException("FragmentPlaaaayGaaameBinding = null")


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        dededdeed = FragmentPlaaaayGaaameBinding.inflate(inflater, container, false)
        return frfrrfrfr.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        try {
            val frgtgtgt = ContextCompat.getDrawable(requireActivity(), R.drawable.en1)
            val kikik = ContextCompat.getDrawable(requireActivity(), R.drawable.en22)

            val gtgtt = listOf(frgtgtgt, kikik).shuffled()

            frfrrfrfr.imgMainEnemeefrgy.setImageDrawable(gtgtt.random())

            frfrrfrfr.root.background.alpha = 230

            gtgtgttg()
            ffrrfrf = false
            frfrrfrfr.btnPressMeefrgthy.setOnClickListener {
                if (hyhhyhy == 99) {
                    findNavController().navigate(R.id.action_plaaaayGaaameFragment_to_nextLevelFragment)
                    hyhhyhy = 1
                }
                frfrrfrfr.progBbbb.progress = hyhhyhy
                hyhhyhy += 1
            }

            frfrrfrfr.btnImgExiterfgt.setOnClickListener {
                frftggt()
            }


        } catch (e: Exception) {
            mfkrogkt()
        }

        super.onViewCreated(view, savedInstanceState)
    }



    private fun mfkrogkt() {
        Snackbar.make(
            frfrrfrfr.root,
            "I have some error, try again",
            Snackbar.LENGTH_LONG
        ).show()
    }


    private fun gtgtgttg() {
        frfrrfrfr.progBbbb.progress = hyhhyhy
    }

    private fun frftggt() {
        AlertDialog.Builder(requireContext())
            .setTitle("Exit")
            .setMessage("Are you reaaaaly want to exit, the current data will not be save?")
            .setPositiveButton("Yes, Exit") { _, _ ->
                requireActivity().finish()
            }
            .setNegativeButton("Deny") { _, _ ->
            }
            .setCancelable(true)
            .create()
            .show()
    }

    override fun onDestroy() {
        dededdeed = null
        super.onDestroy()
    }

    override fun onPause() {
        onDestroy()
        super.onPause()
    }
}