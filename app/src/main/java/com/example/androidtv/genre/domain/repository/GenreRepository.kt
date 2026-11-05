package com.example.androidtv.genre.domain.repository

import com.example.androidtv.core.util.Resource
import com.example.androidtv.genre.domain.model.Genre

interface GenreRepository {
    suspend fun getMovieGenres(): Resource<List<Genre>>
    suspend fun getTvSeriesGenres(): Resource<List<Genre>>
}