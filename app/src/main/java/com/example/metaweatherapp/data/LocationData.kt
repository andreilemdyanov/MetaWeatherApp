package com.example.metaweatherapp.data

import com.example.metaweatherapp.core.Abstract
import com.example.metaweatherapp.domain.LocationDomain

sealed class LocationData : Abstract.Object<LocationDomain, Abstract.Mapper.Empty>() {
}