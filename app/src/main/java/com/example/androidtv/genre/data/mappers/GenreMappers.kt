package com.example.androidtv.genre.data.mappers

import com.example.androidtv.genre.data.network.GenresResponse
import com.example.androidtv.genre.domain.model.Genre

internal fun GenresResponse.GenreDto.toDomain() = Genre(
    id = id,
    name = name
)