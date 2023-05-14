package com.example.dessertclicker

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.dessertclicker.ui.theme.DessertClickerApp
import com.example.dessertclicker.ui.theme.DessertClickerTheme


class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        setContent {
            DessertClickerTheme {
                DessertClickerApp()
            }
        }
    }
}

