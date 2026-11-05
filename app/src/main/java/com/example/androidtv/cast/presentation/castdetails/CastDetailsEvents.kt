package com.example.androidtv.cast.presentation.castdetails

sealed interface CastDetailsEvents {
    data object NavigateBack : CastDetailsEvents
}