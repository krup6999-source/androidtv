package com.example.andriodtv.home.data.repository

import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData

import com.codelytical.muvyz.home.domain.model.Series
import com.codelytical.muvyz.home.data.paging.AiringTodayTvSeriesSource
import com.codelytical.muvyz.home.data.paging.OnTheAirSeriesSource
import com.example.andriodtv.home.data.paging.PopularSeriesSource

import com.example.andriodtv.muvyz.home.data.paging.TopRatedSeriesSource

import com.example.andriodtv.muvyz.home.data.paging.TrendingSeriesSource
import com.example.androidtv.core.util.Constants.PAGING_SIZE
import com.example.androidtv.muvyz.core.data.network.MovieApi
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class TvSeriesRepository @Inject constructor(private val api: MovieApi) {
    fun getTrendingThisWeekTvSeries(): Flow<PagingData<Series>> {
        return Pager(
            config = PagingConfig(enablePlaceholders = false, pageSize = PAGING_SIZE),
            pagingSourceFactory = {
                TrendingSeriesSource(api)
            }
        ).flow
    }

    fun getOnTheAirTvSeries(): Flow<PagingData<Series>> {
        return Pager(
            config = PagingConfig(enablePlaceholders = false, pageSize = PAGING_SIZE),
            pagingSourceFactory = {
                OnTheAirSeriesSource(api)
            }
        ).flow
    }

    fun getTopRatedTvSeries(): Flow<PagingData<Series>> {
        return Pager(
            config = PagingConfig(enablePlaceholders = false, pageSize = PAGING_SIZE),
            pagingSourceFactory = {
                TopRatedSeriesSource(api)
            }
        ).flow
    }

    fun getAiringTodayTvSeries(): Flow<PagingData<Series>> {
        return Pager(
            config = PagingConfig(enablePlaceholders = false, pageSize = PAGING_SIZE),
            pagingSourceFactory = {
                AiringTodayTvSeriesSource(api)
            }
        ).flow
    }

    fun getPopularTvSeries(): Flow<PagingData<Series>> {
        return Pager(
            config = PagingConfig(enablePlaceholders = false, pageSize = PAGING_SIZE),
            pagingSourceFactory = {
                PopularSeriesSource(api)
            }
        ).flow
    }
}