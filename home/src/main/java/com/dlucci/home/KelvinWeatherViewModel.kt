package com.dlucci.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.dlucci.home.networking.KelvinWeatherRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class KelvinWeatherViewModel @Inject constructor(
    private val repository: KelvinWeatherRepository
)
: ViewModel() {

    fun getWeather() {
        viewModelScope.launch {
            val response = repository.getWeather()
        }
    }

}