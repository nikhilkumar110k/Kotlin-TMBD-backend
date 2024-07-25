package com.example.myapplication.domain.repository

import com.example.myapplication.data.model.Movie

interface MovieRepository {
    suspend fun getMovies():List<Movie>?
    suspend fun updateMovies(): List<Movie>?

}