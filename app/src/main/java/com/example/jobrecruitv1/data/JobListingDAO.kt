package com.example.jobrecruitv1.data

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update

@Dao
interface JobListingDAO {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertJobListing(jobListing: JobListing)

    @Update
    suspend fun updateJobListing(jobListing: JobListing)

    @Delete
    suspend fun deleteJobListing(jobListing: JobListing)

    @Query("SELECT * FROM JobListing")
    fun getAllJobListings(): LiveData<List<JobListing>>
}