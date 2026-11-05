package com.example.androidtv.filmdetail.presentation

import com.example.androidtv.cast.domain.model.Cast
import com.example.androidtv.cast.domain.model.Credits
import com.example.androidtv.favorites.data.data.local.Favorite

sealed interface FilmDetailsUiEvents {
    data object NavigateBack : FilmDetailsUiEvents
    data class NavigateToCastsScreen(val credits: Credits) :
        FilmDetailsUiEvents

    data class AddToFavorites(val favorite: Favorite) :
        FilmDetailsUiEvents

    data class RemoveFromFavorites(val favorite: Favorite) :
        FilmDetailsUiEvents
    data class NavigateToCastDetails(val cast: Cast) : FilmDetailsUiEvents
}