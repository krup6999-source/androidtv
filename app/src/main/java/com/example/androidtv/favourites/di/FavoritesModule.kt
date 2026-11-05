package com.example.androidtv.favorites.di

import com.codelytical.muvyz.favorites.domain.repository.FavoritesRepository
import com.example.androidtv.favorites.data.data.repository.FavoritesRepositoryImpl

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class FavoritesModule {
    @Binds
    abstract fun bindFavoritesRepository(
        favoritesRepositoryImpl: FavoritesRepositoryImpl
    ): FavoritesRepository
}