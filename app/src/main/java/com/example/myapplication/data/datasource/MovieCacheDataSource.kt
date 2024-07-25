package com.example.myapplication.data.datasource

import com.example.myapplication.data.model.Movie

interface MovieCacheDataSource {
    suspend fun getMovies(): List<Movie>
    suspend fun saveMoviesToCache(movies: List<Movie>)
}