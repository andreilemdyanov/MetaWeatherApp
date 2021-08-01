package com.example.metaweatherapp.domain

import com.example.metaweatherapp.core.Abstract
import com.example.metaweatherapp.data.net.LocationServerModel
import com.example.metaweatherapp.presentation.LocationUi

sealed class LocationDomain : Abstract.Object<LocationUi, Abstract.Mapper.Empty>() {

    class Success() : LocationDomain() {
        override fun map(mapper: Abstract.Mapper.Empty): LocationUi {
            TODO("Not yet implemented")
        }

    }

    class Fail() : LocationDomain() {
        override fun map(mapper: Abstract.Mapper.Empty): LocationUi {
            TODO("Not yet implemented")
        }
    }
}