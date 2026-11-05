package com.example.androidtv.search.presentation

import com.example.androidtv.search.domain.model.Search

sealed interface SearchUiEvents {
    data class SearchTermChanged(val value: String) : SearchUiEvents
    data class SearchFilm(val searchTerm: String) :
        SearchUiEvents

    data class OpenFilmDetails(val search: Search?) :
        SearchUiEvents
    data object ClearSearchTerm: SearchUiEvents
}