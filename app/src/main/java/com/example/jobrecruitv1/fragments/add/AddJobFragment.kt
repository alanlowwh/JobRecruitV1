package com.example.jobrecruitv1.fragments.add

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.jobrecruitv1.R
import com.example.jobrecruitv1.data.JobListing
import com.example.jobrecruitv1.data.JobRecruitViewModel
import com.google.android.material.floatingactionbutton.FloatingActionButton
import java.util.Date


class AddJobFragment : Fragment() {


    private lateinint var binding: JobRecruitViewModel
//    private lateinit var mjobRecruitViewModel: JobRecruitViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment

        val view = inflater.inflate(R.layout.fragment_add_job, container, false)


        val jobTitle = view.findViewById<EditText>(R.id.jobTitle_editText).toString()
        Log.d("YourTag", "Job Title: $jobTitle")


//        mjobRecruitViewModel = ViewModelProvider(this).get(JobRecruitViewModel::class.java)

        view.findViewById<Button>(R.id.post_job_btn).setOnClickListener {
            insertDataToDatabase(jobTitle)
        }



        return view
    }

    private fun insertDataToDatabase(jobTitle: String) {

        val date = Date(12-5-2023)
        val jobListing = JobListing(0, 0, "$jobTitle", "descrp", "comabc", "f2f", "cat1", "Type A", 5000.00, date)
        mjobRecruitViewModel.addJobListing(jobListing)
        Toast.makeText(requireContext(), "Added", Toast.LENGTH_LONG).show()
        findNavController().navigate(R.id.action_addJobFragment_to_listJobFragment)
    }

}