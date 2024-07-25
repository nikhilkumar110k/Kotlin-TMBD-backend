package com.example.myapplication.data.datasourceimplementation

import com.example.myapplication.data.datasource.MovieCacheDataSource
import com.example.myapplication.data.model.Movie

class MovieCacheDataSourceImpl : MovieCacheDataSource {
    private var movieList= ArrayList<Movie>()
    override suspend fun getMovies(): List<Movie> {
        return movieList
    }

    override suspend fun saveMoviesToCache(movies: List<Movie>) {
        movieList.clear()
        movieList= ArrayList(movies)
    }
}