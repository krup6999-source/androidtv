package com.example.androidtv.search.data.repository

import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import com.example.androidtv.search.data.paging.SearchPagingSource

import com.example.androidtv.core.util.Constants.PAGING_SIZE
import com.example.androidtv.muvyz.core.data.network.MovieApi
import com.example.androidtv.search.domain.model.Search
import com.example.androidtv.search.domain.repository.SearchRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class SearchRepositoryImpl @Inject constructor(private val api: MovieApi): SearchRepository {
    override fun multiSearch(queryParam: String): Flow<PagingData<Search>> {
        return Pager(
            config = PagingConfig(enablePlaceholders = false, pageSize = PAGING_SIZE),
            pagingSourceFactory = {
                SearchPagingSource(api, queryParam)
            }
        ).flow
    }
}