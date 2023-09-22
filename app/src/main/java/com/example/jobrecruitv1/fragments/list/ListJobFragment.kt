package com.example.jobrecruitv1.fragments.list

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import com.example.jobrecruitv1.R
import com.google.android.material.floatingactionbutton.FloatingActionButton


class ListJobFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_list_job, container, false)

        view.findViewById<FloatingActionButton>(R.id.floatingActionButton).setOnClickListener() {
            findNavController().navigate(R.id.action_listJobFragment_to_addJobFragment)
        }



        return view
    }


}