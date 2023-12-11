package com.lixoten.bookshelf.di


import com.lixoten.bookshelf.data.BookshelfRepository
import com.lixoten.bookshelf.network.BookshelfApi

// notes: No Longer used. AppModule now handles DI-dagger-hilt
/**
 * Dependency Injection container at the application level.
 */
interface AppContainer {
    val bookshelfApiService: BookshelfApi
    val bookshelfRepository: BookshelfRepository
}