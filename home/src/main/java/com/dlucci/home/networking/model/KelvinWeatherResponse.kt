package com.dlucci.home.networking.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class KelvinWeatherResponse(
    val latitude : Float,
    val longitude : Float,
    val hourly : Hourly
)

@Serializable
data class Hourly(
    val time : List<String>,
    @SerialName("temperature_2m")
    val temperature : List<Float>

)