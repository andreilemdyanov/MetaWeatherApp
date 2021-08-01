package com.example.metaweatherapp.domain

import com.example.metaweatherapp.core.Abstract
import com.example.metaweatherapp.presentation.LocationUi

sealed class LocationDomain : Abstract.Object<LocationUi, Abstract.Mapper.Empty>() {
}