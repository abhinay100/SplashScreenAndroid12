package com.abhinay.splashscreenandroid12

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch


/**
 * Created by Abhinay on 10/06/25.
 *
 *
 */
class MainViewModel: ViewModel() {

    private val _isLoading = MutableStateFlow(true)
    val isLoading = _isLoading.asStateFlow()

    init {

        viewModelScope.launch {
            delay(3000)
            _isLoading.value = false
        }
    }

}