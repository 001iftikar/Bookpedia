package com.iftikar.bookpedia.book.data.network

import com.iftikar.bookpedia.book.data.dto.BookWorkDto
import com.iftikar.bookpedia.book.data.dto.SearchedResponseDto
import com.iftikar.bookpedia.core.domain.DataError
import com.iftikar.bookpedia.core.domain.Result

interface RemoteBookDataSource {

    suspend fun searchBooks(
        query: String,
        resultLimit: Int? = null
    ): Result<SearchedResponseDto, DataError.Remote>

    suspend fun getBookDetails(bookWorkId: String): Result<BookWorkDto, DataError>
}