package com.example.uberuimockup.presentation.navigation


sealed class NavigationItem(var route: String, var title: String){
    object HomeScreen: NavigationItem("home_screen", "HomeScreen")
    object LanguageScreen: NavigationItem("language_screen", "LanguageScreen")
    object LogInPromptScreen: NavigationItem("log_in_prompt_screen", "LogInPromptScreen")
    object LogInScreen:NavigationItem("log_in_screen", "LogInScreen")
    object RegisterScreen: NavigationItem("register_screen", "RegisterScreen")
    object AcceptTripScreen: NavigationItem("accept_trip_screen", "AcceptTripScreen")
    object ArrivedScreen: NavigationItem("arrived_screen", "ArrivedScreen")
    object CancelTrip: NavigationItem("cancel_trip", "CancelTrip")
    object DriverNavDrawer:NavigationItem("driver_nav_drawer", "DriverNavigationDrawer")
    object DocumentUploadScreen: NavigationItem("document_upload_screen", "DocumentUploadScreen")
    object EndTrip: NavigationItem("end_trip", "EndTrip")
    object EnterMobileNumberScreen: NavigationItem("enter_mobile_number_screen", "EnterMobileNumberScreen")
    object OnTripScreen: NavigationItem("on_trip_screen", "OnTripScreen")
    object OtpVerificationScreen: NavigationItem("otp_verification_screen", "OtpVerificationScreen")
    object StartTripMap: NavigationItem("start_trip_map", "StartTripMap")
    object ViewAllTrips: NavigationItem("view_all_trips", "ViewAllTrips")
    object WhyCancelTrip: NavigationItem("why_cancel_trip", "WhyCancelTrip")
    object TripEnded: NavigationItem("trip_ended", "TripEnded")
    object Rate:NavigationItem("rate", "Rate")

}
