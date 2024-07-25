package com.example.myapplication.data.datasourceimplementation

import com.example.myapplication.data.datasource.MovieLocalDataSource
import com.example.myapplication.data.datasource.MovieRemoteDataSource
import com.example.myapplication.data.db.MovieDao
import com.example.myapplication.data.model.Movie
import com.example.myapplication.data.model.MovieList
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import okhttp3.Dispatcher
import retrofit2.Response

class MovieLocalDataSourceImpl(private val movieDao: MovieDao): MovieLocalDataSource {
    override suspend fun getMoviesFromDB(): List<Movie> {
        return movieDao.getMovies()
    }

    override suspend fun saveMoviestoDB(movies: List<Movie>) {
        CoroutineScope(Dispatchers.IO).launch{
            movieDao.saveMovies(movies)
        }
    }

    override suspend fun clearall() {
        CoroutineScope(Dispatchers.IO).launch{
            movieDao.deleteAllMovies()
        }
    }

}