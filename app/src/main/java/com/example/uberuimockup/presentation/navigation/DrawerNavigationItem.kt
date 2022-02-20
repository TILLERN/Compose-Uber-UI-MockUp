package com.example.uberuimockup.presentation.navigation

import com.example.uberuimockup.R

sealed class DrawerNavigationItem(var route:String, val icon:Int, val title:String){
    object Home:DrawerNavigationItem("home", R.drawable.home, "Home")
    object DriverProfile:DrawerNavigationItem("driver_profile", R.drawable.ic_baseline_person_24, "DriverProfile")
    object Notifications:DrawerNavigationItem("notifications", R.drawable.notifications, "Notifications")
    object Settings:DrawerNavigationItem("settings", R.drawable.ic_baseline_settings_24, "settings")
    object LogOut:DrawerNavigationItem("logout", R.drawable.ic_baseline_power_settings_new_24, "LogOut")
}

