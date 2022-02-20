package com.example.uberuimockup.presentation.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.uberuimockup.R
import com.example.uberuimockup.presentation.navigation.NavigationItem

@Composable
fun OtpVerificationScreen(navController: NavController){
    Column {
        Icon(imageVector= Icons.Default.ArrowBack, contentDescription= "arrow back")
        Spacer(modifier=Modifier.height(10.dp))
        Text(
            text="OTP Verification",
            fontSize=30.sp,
            fontWeight=FontWeight.Bold
        )
        Spacer(modifier=Modifier.height(10.dp))
        Text(
            text="Enter the 4-digit code sent to you at +25428444056",
            fontSize=30.sp,
            fontWeight=FontWeight.Bold
        )
        Spacer(modifier=Modifier.height(10.dp))
        Text(text="Edit",
            fontSize=30.sp,
            fontWeight=FontWeight.Bold,
            modifier=Modifier.clickable { }
        )
        Spacer(modifier=Modifier.height(25.dp))
        EnterOTPCode()
        Spacer(modifier=Modifier.height(10.dp))
        Button(
            onClick={ navController.navigate(NavigationItem.LogInPromptScreen.route) },
            colors=ButtonDefaults.buttonColors(
                backgroundColor=colorResource(id= R.color.slimmyGreen),
                contentColor=Color.Black,
            ),
        ) {
            Text(text= "SUBMIT")

        }
        Spacer(modifier=Modifier.height(10.dp))
        Text(
            text="Resend code in 02:59",
            textAlign = TextAlign.Center,
            fontSize = 15.sp
        )
    }

}

@Composable
fun EnterOTPCode() {
    var otpcode by remember { mutableStateOf("Hello") }

    TextField(
        value = otpcode,
        onValueChange = { otpcode = it },
        label = { Text("Label") }
    )
}