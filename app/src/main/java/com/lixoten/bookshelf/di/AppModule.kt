package com.lixoten.bookshelf.di

import com.lixoten.bookshelf.data.BookshelfRepository
import com.lixoten.bookshelf.data.DefaultBookshelfRepository
import com.lixoten.bookshelf.network.BookshelfApi
import com.lixoten.bookshelf.network.BookshelfApi.Companion.BASE_URL
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton


// @Module annotation which will make this class a module
// to inject dependency to other class within it's scope.
// @InstallIn(SingletonComponent::class) this will make
// this class to inject dependencies across the entire application.
@Module
@InstallIn(SingletonComponent::class)
class AppModule {


    @Provides
    @Singleton
    fun provideBookshelfApi(): BookshelfApi {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(BookshelfApi::class.java)
    }

    @Provides
    @Singleton
    fun provideBookshelfRepository(api: BookshelfApi): BookshelfRepository {
        return DefaultBookshelfRepository(api)
    }
}