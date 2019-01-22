package com.example.user.weatherapptesting.data.db.unitlocalized

/**
 * Created by Bencoleng on 22/01/2019.
 */
interface UnitSpecifictCurrentWeatherEntry {
    val temperature: Double
    val conditionText : String
    val conditionIconUrl : String
    val windSpeed : Double
    val windDirection : String
    val precipitationVolume : Double
    val feelsLikeTemperature : Double
    val visibilityDistance : Double
}