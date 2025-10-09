package com.example.lab_week_05

import com.squareup.moshi.Json

data class ImageData(
    @field:Json(name = "id")
    val id: String,

    @field:Json(name = "url")
    val imageUrl: String
)
