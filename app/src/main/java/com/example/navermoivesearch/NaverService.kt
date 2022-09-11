package com.example.navermoivesearch


import android.telecom.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface NaverService {

    @GET("movie/popular")
    fun getPopularMovies(
        @Query("api_key") apiKey: String = "Your TMDB API Key",
        @Query("page") page : Int
    ): Call<GetMoviesResponse>



}