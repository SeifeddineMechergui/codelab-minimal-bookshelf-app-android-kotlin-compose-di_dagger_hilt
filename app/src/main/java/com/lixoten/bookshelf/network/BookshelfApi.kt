package com.lixoten.bookshelf.network

import com.lixoten.bookshelf.model.Book
import com.lixoten.bookshelf.model.QueryResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface BookshelfApi {

    companion object {
        const val BASE_URL = "https://www.googleapis.com/books/v1/"
    }

    // Notes: Install PLUGIN: "JSON to kotlin Class"
    //  - this plugin helps us generate the DTO.. the data class for a record
    //  - multiple options of set up, phillips seems to be using "gson", select fiends only as needed option too
    @GET("volumes")
    suspend fun getBooks(@Query("q") query: String): Response<QueryResponse>

    // "id" url path parameter
    @GET("volumes/{id}")
    suspend fun getBook(@Path("id") id: String): Response<Book>
}