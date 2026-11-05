package com.example.androidtv.filmdetail.data.mappers

import com.codelytical.muvyz.home.data.network.CreditsResponse
import com.example.androidtv.cast.data.network.CastResponse
import com.example.androidtv.cast.domain.model.Cast
import com.example.androidtv.cast.domain.model.Credits


internal fun CreditsResponse.toDomain() = Credits(
    id = id,
    cast = cast.map { it.toDomain() }
)

internal fun CastResponse.toDomain() = Cast(
    adult = adult,
    castId = castId,
    character = character,
    creditId = creditId,
    gender = gender,
    id = id,
    knownForDepartment = knownForDepartment,
    name = name,
    order = order,
    originalName = originalName,
    popularity = popularity,
    profilePath = profilePath,
)