package com.example.uberuimockup.presentation.screens

import androidx.compose.runtime.Composable
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Phone
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.uberuimockup.R
import com.example.uberuimockup.presentation.components.HeaderIcon
import com.example.uberuimockup.presentation.navigation.NavigationItem


@Composable
fun LogInScreen(navController: NavController){
    Column(modifier=Modifier
        .padding(5.dp)
        .fillMaxSize()) {
        HeaderIcon()
        Box (
            modifier = Modifier.padding(start = 20.dp, end = 20.dp),
            contentAlignment = Alignment.CenterStart){

            Column(modifier = Modifier.fillMaxSize()) {
                Spacer(modifier=Modifier.height(10.dp))
                Icon(imageVector= Icons.Default.ArrowBack, contentDescription="back")
                Spacer(modifier=Modifier.height(20.dp))
                Text(
                    text= "Welcome to EZ-Taxi",
                    fontWeight = FontWeight.Bold,
                    color = colorResource(
                        id=R.color.slimmyGreen),
                    fontSize = 26.sp, textAlign = TextAlign.Center,
                    modifier = Modifier.fillMaxWidth()
                )

                Spacer(modifier=Modifier.height(15.dp))

                var username by remember { mutableStateOf("Tillern") }
                TextField(
                    modifier = Modifier.fillMaxWidth(),
                    value = username,
                    onValueChange = { username = it },
                    label = { Text("First Name") }
                )
                Spacer(modifier=Modifier.height(10.dp))

                var password by rememberSaveable { mutableStateOf("") }

                TextField(
                    modifier = Modifier.fillMaxWidth(),
                    value = password,
                    onValueChange = { password = it },
                    label = { Text("Enter password") },
                    visualTransformation = PasswordVisualTransformation(),
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password)
                )

                Spacer(modifier=Modifier.height(20.dp))
                Divider()
                Spacer(modifier=Modifier.height(6.dp))
                Text(
                    text="By continuing, i confirm that i have read and agree to the Terms & Conditions and Private Policy.",
                    textAlign=TextAlign.Center,
                    fontSize=12.sp,
                    fontWeight=FontWeight.Bold,
                )
                Spacer(modifier=Modifier.height(30.dp))
                Button(
                    onClick={ navController.navigate(NavigationItem.DriverNavDrawer.route) },
                    colors=ButtonDefaults.buttonColors(
                        backgroundColor=colorResource(id= R.color.slimmyGreen),
                        contentColor=Color.Black,
                    ),
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(23.dp),
                    border = BorderStroke(3.dp, Color.White),
                ) {
                    Text(text= "LOG IN")

                }

            }

        }

    }

}

