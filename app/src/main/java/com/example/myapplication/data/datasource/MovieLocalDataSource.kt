package com.example.myapplication.data.datasource

import com.example.myapplication.data.model.Movie
import com.example.myapplication.data.model.MovieList
import retrofit2.Response

interface MovieLocalDataSource {
    suspend fun getMoviesFromDB(): List<Movie>
    suspend fun saveMoviestoDB(movies:List<Movie>)
    suspend fun clearall()
}