package com.lixoten.bookshelf.presentation

data class SearchUiState(
    val query: String = "trump", // Notes: just because I am a lazy typer
    val searchStarted: Boolean = false
)
