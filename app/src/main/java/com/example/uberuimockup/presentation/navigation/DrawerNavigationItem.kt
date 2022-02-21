package com.example.uberuimockup.presentation.navigation

import com.example.uberuimockup.R

sealed class DrawerNavigationItem(var route:String, val icon:Int, val title:String){
//    object Home:DrawerNavigationItem("driver_profile", R.drawable.home, "Home")
    object DriverProfile:DrawerNavigationItem("driver_profile", R.drawable.ic_baseline_person_24, "DriverProfile")
    object Notifications:DrawerNavigationItem("notifications", R.drawable.notifications, "Notifications")
    object Settings:DrawerNavigationItem("settings", R.drawable.ic_baseline_settings_24, "settings")
    object LogOut:DrawerNavigationItem("logout", R.drawable.ic_baseline_power_settings_new_24, "LogOut")
    object Trips: DrawerNavigationItem("trips", R.drawable.ic_baseline_directions_car_24, "Trips")
    object Ratings: DrawerNavigationItem("ratings", R.drawable.ic_baseline_star_rate_24,"Ratings")
    object Earnings: DrawerNavigationItem("earnings_screen", R.drawable.ic_baseline_monetization_on_24,"Earnings")
    object AddMoneyToWallet: DrawerNavigationItem("add_money_to_wallet", R.drawable.ic_baseline_account_balance_wallet_24,"AddMoneyToWallet")
    object TripDetails: DrawerNavigationItem("trip_details", R.drawable.ic_baseline_add_road_24,"TripDetails")
    object Wallet: DrawerNavigationItem("wallet", R.drawable.ic_baseline_account_balance_wallet_24,"Wallet")


}

