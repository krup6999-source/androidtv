package com.example.muvyz.cast.domain.repository

import com.example.androidtv.cast.domain.model.Credits

import com.example.androidtv.core.util.Resource

interface CastRepository {
    suspend fun getTvSeriesCasts(id: Int): Resource<Credits>
    suspend fun getMovieCasts(id: Int): Resource<Credits>
    suspend fun getCastDetails(id: Int): Resource<Unit>
}