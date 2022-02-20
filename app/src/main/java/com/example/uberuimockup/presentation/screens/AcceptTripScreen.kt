package com.example.uberuimockup.presentation.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.uberuimockup.R

@Composable
fun AcceptTripScreen(navController: NavController){
    Image(painter= painterResource(id=R.drawable.mapimage), contentDescription="map-background")
    Column(modifier=Modifier.padding(0.dp)) {


    }

}