package com.example.jobrecruitv1.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [JobListing::class], version = 1, exportSchema = false)
abstract class JobRecruitDatabase : RoomDatabase() {

    abstract fun jobListingDao(): JobListingDAO

    companion object {
        @Volatile
        private var INSTANCE: JobRecruitDatabase? = null
        fun getDatabase(context: Context): JobRecruitDatabase {
            val tempInstance = INSTANCE
            if (tempInstance != null) {
                return tempInstance
            }
            synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    JobRecruitDatabase::class.java,
                    "jobRecruit_database"
                ).build()
                INSTANCE = instance
                return instance
            }
        }
    }
}