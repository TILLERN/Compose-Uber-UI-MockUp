package com.example.uberuimockup.presentation.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.uberuimockup.R
import com.example.uberuimockup.presentation.navigation.NavigationItem

@Composable
fun LogInPromptScreen(navController: NavController) {
    Box(
        modifier=Modifier
            .fillMaxSize()
            .background(
                brush=Brush.verticalGradient(colors=listOf(
                    Color.Transparent,
                    Color.Black
                ), startY=100f)
            )
    ) {

        Image(
            painter=painterResource(id=R.drawable.background),
            contentDescription="background image",
            modifier=Modifier.fillMaxSize(),
            contentScale=ContentScale.FillBounds,
        )

        Column(horizontalAlignment=Alignment.CenterHorizontally) {

            Column(
                modifier=Modifier
                    .height(200.dp)
                    .width(200.dp)
                    .fillMaxWidth(),
                horizontalAlignment=Alignment.CenterHorizontally,

            ) {

                Image(
                    painter=painterResource(id=R.drawable.logo),
                    contentDescription="logo",
                    contentScale=ContentScale.Crop,
                )

            }
            Spacer(modifier= Modifier.height(200.dp))
            Box(modifier= Modifier.padding(start = 50.dp, top = 10.dp, end = 50.dp)){
                Column() {
                    Button(
                        onClick={ navController.navigate(NavigationItem.LogInScreen.route)},
                        modifier = Modifier.fillMaxWidth(),
                        shape = RoundedCornerShape(23.dp),
                        border = BorderStroke(3.dp, colorResource(id=R.color.slimmyGreen)),
                        colors = ButtonDefaults.buttonColors(
                            backgroundColor = Color.Transparent,
                            contentColor = Color.White)
                    ) {
                        Text(text="SIGN IN", fontWeight=FontWeight.Bold, fontSize = 22.sp)

                    }

                    Spacer(modifier= Modifier.height(10.dp))

                    Button(
                        onClick={ navController.navigate(NavigationItem.RegisterScreen.route)},
                        modifier = Modifier.fillMaxWidth(),
                        shape = RoundedCornerShape(23.dp),
                        border = BorderStroke(3.dp, colorResource(id=R.color.slimmyGreen)),
                        colors = ButtonDefaults.buttonColors(
                            backgroundColor = Color.Transparent,
                            contentColor = Color.White)
                    ) {
                        Text(text="SIGN UP", fontWeight=FontWeight.Bold, fontSize = 22.sp)

                    }
                }
            }
            Spacer(modifier= Modifier.height(60.dp))


        }
    }
}