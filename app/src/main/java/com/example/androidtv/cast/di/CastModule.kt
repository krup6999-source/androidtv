package com.example.androidtv.cast.di

import com.example.androidtv.cast.data.repository.CastRepositoryImpl
import com.example.muvyz.cast.domain.repository.CastRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class CastModule {
    @Binds
    abstract fun bindCastRepository(
        castRepositoryImpl: CastRepositoryImpl
    ): CastRepository
}