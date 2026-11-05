package com.example.androidtv.account.presentation

sealed interface AccountScreenUiEvents {
    data object OnShareClicked : AccountScreenUiEvents
    data object ShowThemesDialog: AccountScreenUiEvents
}