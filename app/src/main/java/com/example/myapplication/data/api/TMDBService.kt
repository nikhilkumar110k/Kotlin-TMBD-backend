package com.example.myapplication.data.api

import com.example.myapplication.data.model.MovieList
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface TMDBService {

    @GET("movie/popular")
    suspend fun getPopularMovies(
        @Query("api_key")apikey: String
    ): Response<MovieList>
}