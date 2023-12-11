package com.lixoten.bookshelf.model

data class QueryResponse(
    val items: List<Book>?,
    val totalItems: Int,
    val kind: String,
)
