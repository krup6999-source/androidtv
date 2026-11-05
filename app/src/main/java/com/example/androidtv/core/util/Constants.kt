package com.example.androidtv.core.util

import androidx.datastore.preferences.core.intPreferencesKey
import com.example.androidtv.BuildConfig

object Constants {
    const val BASE_URL = BuildConfig.BASE_URL
    const val STARTING_PAGE_INDEX = 0
    const val IMAGE_BASE_UR = BuildConfig.IMAGE_BASE_UR
    const val DATABASE_NAME = "fav_database"
    const val TABLE_NAME = "fav_table"

    const val MOVIE_PREFERENCES = "MOVIE_PREFERENCES"
    val THEME_OPTIONS = intPreferencesKey(name = "theme_option")
    const val PAGING_SIZE = 20

    // Films
    const val TYPE_MOVIE = "movie"
    const val TYPE_TV_SERIES = "tv"
}