package com.example.androidtv.genre.domain.usecase

import com.example.androidtv.genre.domain.repository.GenreRepository
import javax.inject.Inject

class GetMovieGenresUseCase @Inject constructor(
    private val repository: GenreRepository
) {
    suspend operator fun invoke() = repository.getMovieGenres()
}