package com.example.myapplication.data.datasourceimplementation

import com.example.myapplication.data.api.TMDBService
import com.example.myapplication.data.datasource.MovieRemoteDataSource
import com.example.myapplication.data.model.MovieList
import retrofit2.Response

class MovieRemoteDataSourceImpl(private val tmbdservice: TMDBService, private val apikey: String) :MovieRemoteDataSource {
    override suspend fun getMovies()= tmbdservice.getPopularMovies(apikey)
}