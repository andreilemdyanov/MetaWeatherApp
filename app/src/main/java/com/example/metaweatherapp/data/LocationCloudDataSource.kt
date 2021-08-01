package com.example.metaweatherapp.data

import com.example.metaweatherapp.data.net.LocationServerModel
import com.example.metaweatherapp.data.net.LocationService

interface LocationCloudDataSource {

    suspend fun fetchLocation(): LocationServerModel

    class Base(private val service: LocationService) : LocationCloudDataSource {
        override suspend fun fetchLocation(): LocationServerModel =
            service.fetchLocation()
    }
}