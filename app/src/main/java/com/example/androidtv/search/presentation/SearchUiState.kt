package com.example.androidtv.search.presentation

import androidx.paging.PagingData

import com.example.androidtv.genre.domain.model.Genre
import com.example.androidtv.search.domain.model.Search
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.emptyFlow

data class SearchUiState(
    val isLoadingGenres: Boolean = false,
    val searchTerm: String = "",
    val searchResult: Flow<PagingData<Search>> = emptyFlow(),
    val moviesGenres: List<Genre> = emptyList(),
    val tvSeriesGenres: List<Genre> = emptyList()
)