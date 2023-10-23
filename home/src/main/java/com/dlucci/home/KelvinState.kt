package com.dlucci.home

import com.dlucci.home.networking.model.KelvinWeatherResponse

sealed class KelvinState {

    data class WeatherSuccessful(val response: KelvinWeatherResponse) : KelvinState()

    data class WeatherFailure(val errorMessage : String) : KelvinState()
}