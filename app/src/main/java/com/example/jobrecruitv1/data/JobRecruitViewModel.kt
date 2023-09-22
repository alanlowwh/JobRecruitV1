package com.example.jobrecruitv1.data

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class JobRecruitViewModel(application: Application) : AndroidViewModel(application) {
    private val getAllJobListing: LiveData<List<JobListing>>
    private val repository: JobRecruitRepository

    init {
        val jobListingDAO = JobRecruitDatabase.getDatabase(application).jobListingDao()
        repository = JobRecruitRepository(jobListingDAO)
        getAllJobListing = repository.getAllJobListing
    }

    suspend fun addJobListing(jobListing: JobListing) {
        viewModelScope.launch { Dispatchers.IO }
        repository.addJobListing(jobListing)
    }
}