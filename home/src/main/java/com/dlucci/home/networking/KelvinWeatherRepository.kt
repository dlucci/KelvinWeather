package com.dlucci.home.networking

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class KelvinWeatherRepository @Inject constructor(
 private val service: KelvinWeatherService
) {

    suspend fun getWeather(latitude : Double = 52.52, longitude : Double = 13.41) = withContext(Dispatchers.IO) {
        val map = mutableMapOf<String, Any>()
        map["latitude"] = latitude
        map["longitude"] = longitude
        map["hourly"] = "temperature_2m"

        val response = service.getWeather(map)
        return@withContext if(response.isSuccessful) { response.body() } else null
    }

}