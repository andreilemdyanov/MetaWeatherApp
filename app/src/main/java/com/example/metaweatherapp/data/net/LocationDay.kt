package com.example.metaweatherapp.data.net

import com.google.gson.annotations.SerializedName

data class LocationDay(
    @SerializedName("id")
    private val id: Long,
    @SerializedName("the_temp")
    private val temp: Double
)