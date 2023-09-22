package com.example.jobrecruitv1.data

import androidx.lifecycle.LiveData

class JobRecruitRepository(private val jobListingDao: JobListingDAO) {

    val getAllJobListing: LiveData<List<JobListing>> = jobListingDao.getAllJobListings()

    suspend fun addJobListing(jobListing: JobListing){
        jobListingDao.insertJobListing(jobListing)
    }
}