package com.dlucci.home

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun KelvinHomeScreen() {
    val dummyList = listOf(
        DummyData("67", "45"),
        DummyData("67", "45"),
        DummyData("67", "45"),
        DummyData("67", "45"),
        DummyData("67", "45"),
        DummyData("67", "45"),
        DummyData("67", "45"),
        DummyData("67", "45"),
        DummyData("67", "45"),
        DummyData("67", "45")
    )

    Column {
        dummyList.forEach {
            Text("${it.highTemp}°K/${it.lowTemp}°K")
        }
    }
}

data class DummyData(
    val highTemp: String,
    val lowTemp: String
)