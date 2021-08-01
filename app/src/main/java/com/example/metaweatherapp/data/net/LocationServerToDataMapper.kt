package com.example.metaweatherapp.data.net

import com.example.metaweatherapp.core.Abstract
import com.example.metaweatherapp.data.LocationData

interface LocationServerToDataMapper : Abstract.Mapper {
    fun map(id: Int, title: String, days: List<LocationDay>): LocationData
}