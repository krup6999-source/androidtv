package com.example.android.cast.presentation.casts

import com.example.androidtv.cast.domain.model.Cast

sealed interface CastsUiEvents {
    data class NavigateToCastDetails(val cast: Cast) :
        CastsUiEvents

    data object NavigateBack : CastsUiEvents
}