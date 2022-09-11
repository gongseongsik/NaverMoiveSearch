package com.example.navermoivesearch

import android.graphics.Movie
import com.google.gson.annotations.SerializedName

import com.squareup.moshi.Json

data class Movie(
        @SerializedName("id") val id : Long,
        @SerializedName("title") val title : String,
        @SerializedName("overview") val overview : String,
        @SerializedName("poster_path") val poster_path: String
)


