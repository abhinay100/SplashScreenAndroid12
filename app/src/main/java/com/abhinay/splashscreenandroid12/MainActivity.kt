package com.abhinay.splashscreenandroid12

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.activity.viewModels

import com.abhinay.splashscreenandroid12.ui.theme.SplashScreenAndroid12Theme

class MainActivity : ComponentActivity() {

    private val viewModel: MainViewModel by viewModels()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        installSplashScreen().apply {

            setKeepVisibleCondition {
                viewModel.isLoading.value
            }

        }

        setContent {
            SplashScreenAndroid12Theme {
                Box(
                    modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.Center
                ) {
                    Text(text = "Hello World!")

                }

            }
        }
    }
}