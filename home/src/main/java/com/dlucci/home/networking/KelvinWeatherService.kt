package com.dlucci.home.networking

import com.dlucci.home.networking.model.KelvinWeatherResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query
import retrofit2.http.QueryMap

interface KelvinWeatherService {

    @JvmSuppressWildcards
    @GET("/v1/forecast")
    suspend fun getWeather(@QueryMap map: Map<String, Any>) : Response<KelvinWeatherResponse>

}