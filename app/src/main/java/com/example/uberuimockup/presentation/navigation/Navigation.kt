package com.example.uberuimockup.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.uberuimockup.presentation.screens.HomeScreen
import com.example.uberuimockup.presentation.screens.LanguageScreen


@Composable
fun ItemNavigation(navController: NavHostController){

    NavHost(
        navController = navController,
        startDestination = NavigationItem.HomeScreen.route){
        composable(NavigationItem.HomeScreen.route) {
            HomeScreen(navController = navController)
        }

        composable(NavigationItem.LanguageScreen.route){
            LanguageScreen()
        }


    }

}