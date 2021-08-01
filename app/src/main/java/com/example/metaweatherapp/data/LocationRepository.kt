package com.example.metaweatherapp.data

import java.lang.Exception

interface LocationRepository {

    suspend fun fetchLocation(): LocationData

    class Base(private val cloudDataSource: LocationCloudDataSource) : LocationRepository {
        override suspend fun fetchLocation(): LocationData =
            try {
                LocationData.Success(cloudDataSource.fetchLocation())
            } catch (e: Exception) {
                LocationData.Fail(e)
            }
    }
}
