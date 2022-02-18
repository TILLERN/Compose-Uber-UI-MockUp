package com.example.uberuimockup.presentation.navigation


sealed class NavigationItem(var route: String, var title: String){
    object HomeScreen: NavigationItem("home_screen", "HomeScreen")
    object LanguageScreen: NavigationItem("language_screen", "LanguageScreen")

}
