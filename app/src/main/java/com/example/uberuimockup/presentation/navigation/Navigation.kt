package com.example.uberuimockup.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.uberuimockup.presentation.screens.*


@Composable
fun ItemNavigation(navController: NavHostController){

    NavHost(
        navController = navController,
        startDestination = NavigationItem.HomeScreen.route){
        composable(NavigationItem.HomeScreen.route) {
            HomeScreen(navController = navController)
        }

        composable(NavigationItem.LanguageScreen.route){
            LanguageScreen(navController = navController)
        }

        composable(NavigationItem.LogInPromptScreen.route){
            LogInPromptScreen(navController = navController)
        }

        composable(NavigationItem.LogInScreen.route){
            LogInScreen(navController = navController)
        }

        composable(NavigationItem.RegisterScreen.route){
            RegisterScreen(navController = navController)
        }
        composable(NavigationItem.AcceptTripScreen.route){
            AcceptTripScreen(navController = navController)
        }
        composable(DrawerNavigationItem.AddMoneyToWallet.route){
            AddMoneyToWallet()
        }
        composable(NavigationItem.ArrivedScreen.route){
            ArrivedScreen(navController = navController)
        }
        composable(NavigationItem.CancelTrip.route){
            CancelTrip()
        }
        composable(NavigationItem.DocumentUploadScreen.route){
            DocumentUploadScreen(navController = navController)
        }
        composable(DrawerNavigationItem.DriverProfile.route){
            DriverProfile()
        }
        composable(DrawerNavigationItem.Earnings.route){
            Earnings()
        }
        composable(NavigationItem.Rate.route){
            Rate()
        }
        composable(NavigationItem.DriverNavDrawer.route){
            DriverNavDrawer()
        }
        composable(NavigationItem.EndTrip.route){
            EndTrip(navController = navController)
        }
        composable(NavigationItem.EnterMobileNumberScreen.route){
            EnterMobileNumberScreen(navController= navController)
        }
        composable(NavigationItem.OnTripScreen.route){
            OnTripScreen()
        }
        composable(NavigationItem.OtpVerificationScreen.route){
            OtpVerificationScreen(navController=navController)
        }
        composable(DrawerNavigationItem.Ratings.route){
            Ratings()
        }
        composable(DrawerNavigationItem.Settings.route){
            Settings()
        }
        composable(NavigationItem.StartTripMap.route){
            StartTripMap(navController = navController)
        }
        composable(DrawerNavigationItem.TripDetails.route){
            TripDetails()
        }
        composable(NavigationItem.TripEnded.route){
            TripEnded()
        }
        composable(DrawerNavigationItem.Trips.route){
            Trips()
        }
        composable(NavigationItem.ViewAllTrips.route){
            ViewAllTrips()
        }
        composable(DrawerNavigationItem.Wallet.route){
            Wallet()
        }
        composable(NavigationItem.WhyCancelTrip.route){
            WhyCancelTrip(navController = navController)
        }


    }

}