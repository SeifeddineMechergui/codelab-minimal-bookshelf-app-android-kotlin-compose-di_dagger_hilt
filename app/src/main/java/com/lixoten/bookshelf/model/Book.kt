package com.lixoten.bookshelf.model

// VolumeInfo
data class Book(
    val id: String,
    val volumeInfo: VolumeInfo,
)

data class VolumeInfo(
    val id: String,
    val title: String,
    val imageLinks: ImageLinks,
)

data class ImageLinks(
    val thumbnail: String
){
    val httpsThumbnail : String
        get() = thumbnail.replace("http", "https")
}