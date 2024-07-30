package com.example.myapplication.data

import com.example.myapplication.data.datasource.MovieCacheDataSource
import com.example.myapplication.data.datasource.MovieLocalDataSource
import com.example.myapplication.data.datasource.MovieRemoteDataSource
import com.example.myapplication.data.model.Movie
import com.example.myapplication.domain.repository.MovieRepository

class MovieRepositoryImpl(
    private val movieRemoteDataSource: MovieRemoteDataSource,
    private val movieLocalDataSource: MovieLocalDataSource,
    private val movieCacheDataSource: MovieCacheDataSource
) : MovieRepository {
    override suspend fun getMovies(): List<Movie>? {
        return getMoviesFromCache()
    }

    private suspend fun getMoviesFromCache(): List<Movie>? {
        val newListOfMovies= getMoviesFromAPI()

    }

    suspend fun getMoviesFromAPI(): List<Movie> {
         lateinit var movieList: List<Movie>
         try {
             val response= movieRemoteDataSource.getMovies()
             val body = response.body()
             if(body !=null){
                 movieList= body.movies
             }

         }catch (exception :ExceptionInInitializerError){}
        return movieList

    }

    override suspend fun updateMovies(): List<Movie>? {
        TODO("Not yet implemented")
    }
}