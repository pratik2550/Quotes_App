package com.example.retrofit2.api

import com.example.retrofit2.model.Post
import retrofit2.http.GET

interface SimpleApi {
    @GET("posts/1")
    suspend fun getPost(): Post
}