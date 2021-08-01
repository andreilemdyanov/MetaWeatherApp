package com.example.metaweatherapp.core

import android.app.Application
import com.example.metaweatherapp.data.net.LocationService
import retrofit2.Retrofit

class WeatherApp: Application() {

    private companion object {
        const val BASE_URL = "https://www.metaweather.com/api/location/"
    }

    override fun onCreate() {
        super.onCreate()

        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .build()
        val service = retrofit.create(LocationService::class.java)
    }
}