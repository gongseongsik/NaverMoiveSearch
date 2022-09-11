package com.example.navermoivesearch

import android.graphics.Movie
import com.google.gson.annotations.SerializedName

import com.squareup.moshi.Json

data class GetMoviesResponse(
        @SerializedName("page") val page: Int,
        @SerializedName("results") val movies: List<Movie>,
        @SerializedName("totla_pages") val pages: Int
)


