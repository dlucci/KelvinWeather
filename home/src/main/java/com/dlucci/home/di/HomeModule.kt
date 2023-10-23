package com.dlucci.home.di

import com.dlucci.home.networking.KelvinWeatherRepository
import com.dlucci.home.networking.KelvinWeatherService
import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonConfiguration
import okhttp3.MediaType.Companion.toMediaType
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class HomeModule {

    @Provides
    @Singleton
    fun providesKelvinWeatherRepository(service: KelvinWeatherService) = KelvinWeatherRepository(service)

    @Provides
    @Singleton
    fun provideKelvinWeatherService(retrofit: Retrofit) = retrofit.create(KelvinWeatherService::class.java)


    @Provides
    @Singleton
    fun provideRetrofit() : Retrofit {

        val json = Json { ignoreUnknownKeys = true }

        return Retrofit
            .Builder()
            .baseUrl("https://api.open-meteo.com")
            .addConverterFactory(json.asConverterFactory("application/json".toMediaType()))
            .build()
    }

}