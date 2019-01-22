package com.example.user.weatherapptesting.data.network.response

import com.example.user.weatherapptesting.data.db.entity.CurrentWeatherEntry
import com.example.user.weatherapptesting.data.db.entity.Location
import com.google.gson.annotations.SerializedName

data class CurrentWeatherResponse(
    @SerializedName("current")
    val currentWeatherEntryWeatherEntry: CurrentWeatherEntry,
    val location: Location
)