package com.example.metaweatherapp.data.net

import retrofit2.http.GET

interface LocationService {
    @GET("44418")
    suspend fun fetchLocation(): LocationServerModel
}