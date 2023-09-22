package com.example.jobrecruitv1.data

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.Date

@Entity
data class JobListing(
    @PrimaryKey(autoGenerate = true)
    val jobListingId: Int = 0,

    val adminId: Int,
    val jobTitle: String,
    val jobDescription: String,
    val companyName: String,
    val workplaceType: String,
    val jobCategory: String,
    val jobType: String,
    val salary: Double,
    val datePosted: Date,
)