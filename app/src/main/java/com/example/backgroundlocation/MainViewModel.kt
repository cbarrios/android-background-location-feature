package com.example.backgroundlocation

import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    var isLocationGranted by mutableStateOf(false)
        private set

    fun setLocationStatus(isGranted: Boolean) {
        isLocationGranted = isGranted
    }
}