package com.example.myapplication.domain.usecases

import com.example.myapplication.data.model.Movie
import com.example.myapplication.domain.repository.MovieRepository

class GetMoviesUseCases(private val movieRepository: MovieRepository) {
    suspend fun execute(): List<Movie>?= movieRepository.getMovies()
}