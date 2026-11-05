package com.example.androidtv.filmdetail.presentation

import com.example.androidtv.cast.domain.model.Credits
import com.example.androidtv.home.data.network.MovieDetails
import com.example.androidtv.home.data.network.TvSeriesDetails

data class FilmDetailsUiState(
    val credits: Credits? = null,
    val isLoading: Boolean = false,
    val isLoadingCasts: Boolean = false,
    val error: String? = null,
    val errorCasts: String? = null,
    val tvSeriesDetails: TvSeriesDetails? = null,
    val movieDetails: MovieDetails? = null
)