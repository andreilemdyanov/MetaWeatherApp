package com.example.metaweatherapp.data

import com.example.metaweatherapp.core.Abstract
import com.example.metaweatherapp.data.net.LocationServerModel
import com.example.metaweatherapp.domain.LocationDomain
import java.lang.Exception

sealed class LocationData : Abstract.Object<LocationDomain, LocationDataToDomainMapper>() {

    class Success(private val location: LocationServerModel) : LocationData() {
        override fun map(mapper: LocationDataToDomainMapper): LocationDomain =
            mapper.map(location)
    }

    class Fail(private val e: Exception) : LocationData() {
        override fun map(mapper: LocationDataToDomainMapper): LocationDomain =
            mapper.map(e)
    }
}