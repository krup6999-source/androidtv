package com.example.androidtv.home.presentation

import com.example.androidtv.core.domain.model.Film
import com.example.androidtv.genre.domain.model.Genre


sealed interface HomeUiEvents {
    data object NavigateBack : HomeUiEvents
    data object OnPullToRefresh : HomeUiEvents

    data class NavigateToFilmDetails(
        val film: Film,
    ) : HomeUiEvents

    data class OnFilmGenreSelected(
        val genre: Genre,
        val filmType: String,
        val selectedFilmOption: String
    ) :
        HomeUiEvents

    data class OnFilmOptionSelected(val item: String) :
        HomeUiEvents
}