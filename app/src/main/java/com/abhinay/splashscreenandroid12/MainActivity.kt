package com.abhinay.splashscreenandroid12

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent

import com.abhinay.splashscreenandroid12.ui.theme.SplashScreenAndroid12Theme

class MainActivity : ComponentActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            SplashScreenAndroid12Theme {

            }
        }
    }
}