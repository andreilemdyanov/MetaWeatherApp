package com.example.metaweatherapp.data

import com.example.metaweatherapp.core.Abstract
import com.example.metaweatherapp.data.net.LocationServerModel
import com.example.metaweatherapp.domain.LocationDomain

interface LocationDataToDomainMapper : Abstract.Mapper {
    fun map(locationServerModel: LocationServerModel): LocationDomain
    fun map(e: Exception): LocationDomain

    class Base : LocationDataToDomainMapper {
        override fun map(locationServerModel: LocationServerModel): LocationDomain =
            LocationDomain.Success()

        override fun map(e: Exception): LocationDomain =
            LocationDomain.Fail()
    }
}