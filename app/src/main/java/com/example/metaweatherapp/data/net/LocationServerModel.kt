package com.example.metaweatherapp.data.net

import com.example.metaweatherapp.core.Abstract
import com.example.metaweatherapp.data.LocationData
import com.google.gson.annotations.SerializedName

data class LocationServerModel(
    @SerializedName("woeid")
    private val id: Int,
    @SerializedName("title")
    private val title: String,
    @SerializedName("consolidated_weather")
    private val days: List<LocationDay>
) : Abstract.Object<LocationData, LocationServerToDataMapper>() {
    override fun map(mapper: LocationServerToDataMapper): LocationData =
        mapper.map(id, title, days)

}