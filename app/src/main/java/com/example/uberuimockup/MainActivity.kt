package com.example.uberuimockup

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.uberuimockup.presentation.navigation.ItemNavigation
import com.example.uberuimockup.ui.theme.UberUIMockUpTheme

class MainActivity : ComponentActivity() {

    private lateinit var navController: NavHostController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            UberUIMockUpTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier=Modifier.fillMaxSize(), color=MaterialTheme.colors.background) {
                    navController = rememberNavController()
                    ItemNavigation(navController = navController)


                }
            }
        }
    }
}

