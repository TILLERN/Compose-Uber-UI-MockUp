package com.example.uberuimockup.presentation.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Phone
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.uberuimockup.R
import com.example.uberuimockup.presentation.navigation.NavigationItem

@Composable
fun EnterMobileNumberScreen(navController:NavController){
    Column(modifier =Modifier
        .fillMaxSize()
        .padding(5.dp)) {
        Spacer(modifier= Modifier.height(8.dp))
        Text(
            text="Enter Mobile Number",
            textAlign = TextAlign.Start,
            fontWeight = FontWeight.Bold,
            fontSize = 25.sp
        )
        Row {
            CountryDropDownList( )
            Spacer(modifier= Modifier.width(10.dp))
            PhonenumberTextField()


        }
        Spacer(modifier=Modifier.height(30.dp))
        Divider()
        Text(
            text="By continuing, i confirm that i have read and agree to the Terms & Conditions and Private Policy.",
            textAlign = TextAlign.Center,
            fontSize = 12.sp,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier=Modifier.height(30.dp))
        Button(
            onClick={ navController.navigate(NavigationItem.LogInPromptScreen.route) },
            colors=ButtonDefaults.buttonColors(
                backgroundColor=colorResource(id= R.color.slimmyGreen),
                contentColor=Color.Black,
            ),
        ) {
            Text(text= "CONTINUE")

        }
    }
}

@Composable
fun CountryDropDownList(){
        val expanded = remember { mutableStateOf(false) }
        val items = listOf("Kenya", "Uganda", "Tanzania", "Romania", "Germany", "France")
//        val disabledValue = "B"
        val selectedIndex = remember { mutableStateOf(0) }
        Box(modifier = Modifier   .fillMaxSize()
        ) {

            Column(
                modifier=Modifier
                    .align(alignment=Alignment.Center)
                    .padding(all=0.dp),
            ) {

                Button(
                    modifier=Modifier.width(200.dp),
                    border = BorderStroke(width = 1.dp,color = Color.Red),
                    colors=ButtonDefaults.buttonColors(backgroundColor = Color.White),
                    onClick = {
                        expanded.value = true
                    },content = {
                        Text(items[selectedIndex.value])
                    })

                DropdownMenu(

                    expanded = expanded.value,
                    onDismissRequest = { expanded.value = false },
                    modifier =Modifier
                        .background(Color.White)
                        .border(BorderStroke(width=1.dp, color=Color.Red))
                        .shadow(elevation=2.dp)
                        .width(200.dp),
                ) {
                    items.forEachIndexed { index, s ->
                        DropdownMenuItem(onClick = {
                            selectedIndex.value = index
                            expanded.value = false
                        }) {

                            Text(text = s )

                        }
                    }
                }
            }

        }}


@Composable
fun PhonenumberTextField() {

    var phonenumber by remember { mutableStateOf(TextFieldValue("")) }
    return OutlinedTextField(
        value=phonenumber,
        leadingIcon={ Icon(imageVector=Icons.Default.Phone, contentDescription="phoneIcon") },
        onValueChange={
            phonenumber = it
        },
        label={ Text(text="Phone Number") },
        placeholder={ Text(text="Enter your phone number") },
    )
}
