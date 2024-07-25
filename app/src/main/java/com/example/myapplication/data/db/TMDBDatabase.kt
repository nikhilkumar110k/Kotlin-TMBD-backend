package com.example.myapplication.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.myapplication.data.model.Movie

@Database(entities = [Movie::class], version = 1)
abstract class TMDBDatabase : RoomDatabase() {
    abstract fun movieDao(): MovieDao
}