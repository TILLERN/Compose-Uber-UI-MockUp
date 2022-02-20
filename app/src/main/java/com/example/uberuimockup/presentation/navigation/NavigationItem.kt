package com.example.uberuimockup.presentation.navigation


sealed class NavigationItem(var route: String, var title: String){
    object HomeScreen: NavigationItem("home_screen", "HomeScreen")
    object LanguageScreen: NavigationItem("language_screen", "LanguageScreen")
    object LogInPromptScreen: NavigationItem("log_in_prompt_screen", "LogInPromptScreen")
    object LogInScreen:NavigationItem("log_in_screen", "LogInScreen")
    object RegisterScreen: NavigationItem("register_screen", "RegisterScreen")
    object AcceptTripScreen: NavigationItem("accept_trip_screen", "AcceptTripScreen")
    object AddMoneyToWallet: NavigationItem("add_money_to_wallet", "AddMoneyToWallet")
    object ArrivedScreen: NavigationItem("arrived_screen", "ArrivedScreen")
    object CancelTrip: NavigationItem("cancel_trip", "CancelTrip")
    object DocumentUploadScreen: NavigationItem("document_upload_screen", "DocumentUploadScreen")
    object DriverNavDrawer: NavigationItem("driver_nav_drawer", "DriverNavDrawer")
    object DriverProfile: NavigationItem("driver_profile", "DriverProfile")
    object Earnings: NavigationItem("earnings_screen", "Earnings")
    object EndTrip: NavigationItem("end_trip", "EndTrip")
    object EnterMobileNumberScreen: NavigationItem("enter_mobile_number_screen", "EnterMobileNumberScreen")
    object OnTripScreen: NavigationItem("on_trip_screen", "OnTripScreen")
    object OtpVerificationScreen: NavigationItem("otp_verification_screen", "OtpVerificationScreen")
    object Ratings: NavigationItem("ratings", "Ratings")
    object Settings: NavigationItem("settings", "Settings")
    object StartTripMap: NavigationItem("start_trip_map", "StartTripMap")
    object TripDetails: NavigationItem("trip_details", "TripDetails")
    object Trips: NavigationItem("trips", "Trips")
    object ViewAllTrips: NavigationItem("view_all_trips", "ViewAllTrips")
    object Wallet: NavigationItem("wallet", "Wallet")
    object WhyCancelTrip: NavigationItem("why_cancel_trip", "WhyCancelTrip")
    object TripEnded: NavigationItem("trip_ended", "TripEnded")

}
