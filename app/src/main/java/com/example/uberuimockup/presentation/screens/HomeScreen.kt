package com.example.uberuimockup.presentation.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.uberuimockup.R
import com.example.uberuimockup.presentation.navigation.NavigationItem

@Composable
fun HomeScreen(navController: NavController){
    Column(
        modifier=Modifier
            .fillMaxSize()
            .background(color=Color.Green),
        horizontalAlignment=Alignment.CenterHorizontally,
        verticalArrangement=Arrangement.Center
    ) {

        Image(painter= painterResource(id= R.drawable.logo), contentDescription= "our logo")

        Spacer(modifier= Modifier.height(50.dp))

        Divider()

        Button(onClick = {
            navController.navigate(route = NavigationItem.LanguageScreen.route)},
            colors = ButtonDefaults.buttonColors(
                backgroundColor = Color.Transparent,
                contentColor = Color.Black))
        {
            Text(text= "CLICK TO LAUNCH APP")

        }
    }
}

