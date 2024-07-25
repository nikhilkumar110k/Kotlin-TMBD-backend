package com.example.myapplication.data.datasource

import com.example.myapplication.data.model.MovieList
import retrofit2.Response

interface MovieRemoteDataSource {
    suspend fun getMovies(): Response<MovieList>
}