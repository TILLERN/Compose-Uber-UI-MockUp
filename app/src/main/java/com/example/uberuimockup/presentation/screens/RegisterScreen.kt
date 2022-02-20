package com.example.uberuimockup.presentation.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.uberuimockup.R
import com.example.uberuimockup.presentation.navigation.NavigationItem

@Composable
fun RegisterScreen(navController: NavController){
    Column(modifier=Modifier.padding(5.dp)) {
        Box {
            Icon(imageVector= Icons.Default.ArrowBack, contentDescription="back")
            Spacer(modifier=Modifier.height(10.dp))

            var firstname by remember { mutableStateOf("Tillern") }

            TextField(
                    value = firstname,
                    onValueChange = { firstname = it },
                    label = { Text("First Name") }
            )

            var lastname by remember { mutableStateOf("Minodi") }

            TextField(
                value = lastname,
                onValueChange = { lastname = it },
                label = { Text("Last Name") }
            )
            //from EnterPhoneNumberScreen
            //move to components since they share the same code
            Row {
                CountryDropDownList( )
                Spacer(modifier= Modifier.width(10.dp))
                PhonenumberTextField()


            }

           PasswordTextField()

        }
        Spacer(modifier=Modifier.height(3.dp))
        Box {
            Text(
                text="By continuing, i confirm that i have read and agree to the Terms & Conditions and Private Policy.",
                textAlign = TextAlign.Center,
                fontSize = 12.sp,
                fontWeight = FontWeight.Bold
            )
            Spacer(modifier=Modifier.height(30.dp))
            Button(
                onClick={ navController.navigate(NavigationItem.DocumentUploadScreen.route) },
                colors=ButtonDefaults.buttonColors(
                    backgroundColor=colorResource(id= R.color.slimmyGreen),
                    contentColor=Color.Black,
                ),
            ) {
                Text(text= "REGISTER")

            }
        }
    }
}

@Composable
fun PasswordTextField() {
    var password by rememberSaveable { mutableStateOf("") }

    TextField(
        value = password,
        onValueChange = { password = it },
        label = { Text("Enter password") },
        visualTransformation = PasswordVisualTransformation(),
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password)
    )
}