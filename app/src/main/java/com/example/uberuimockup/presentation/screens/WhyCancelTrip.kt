package com.example.uberuimockup.presentation.screens

import androidx.compose.runtime.Composable
import android.widget.Toast
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.selection.selectable
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.uberuimockup.R
import com.example.uberuimockup.presentation.components.HeaderIcon
import com.example.uberuimockup.presentation.navigation.NavigationItem

@Composable
fun WhyCancelTrip(navController: NavController){
    Column(modifier = Modifier.fillMaxSize()) {
        Spacer(modifier=Modifier.height(5.dp))
        HeaderIcon()
        Spacer(modifier=Modifier.height(20.dp))
        Row(modifier = Modifier.padding(5.dp)) {
            Icon(imageVector= Icons.Default.ArrowBack, contentDescription="back")
            Spacer(modifier=Modifier.width(80.dp))
            Text(text= "Cancel Trip", fontSize = 28.sp, color = colorResource(id= R.color.slimmyGreen), fontWeight = FontWeight.Bold)

        }

        Spacer(modifier=Modifier.height(12.dp))
        Divider()
        Spacer(modifier=Modifier.height(5.dp))
        Text(
            modifier=Modifier.padding(start = 27.dp),
            text= "Why do you want to cancel the trip?",
            fontSize = 16.sp,
            color = colorResource(id= R.color.slimmyGreen),
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier=Modifier.height(10.dp))

        val radioOptions = listOf(
            "Rider Isn't here.",
            "Wrong address shown.",
            "Don't charge rider",
            "Reason one.",
            "Reason two.",
            "Reason three.",
            "Reason four.",
            "Other.")
        val (selectedOption, onOptionSelected) = remember { mutableStateOf(radioOptions[5]) }
        radioOptions.forEach { text ->
            Row(
                Modifier
                    .fillMaxWidth()
                    .selectable(
                        selected=(text == selectedOption),
                        onClick={ onOptionSelected(text) }
                    )
                    .padding(horizontal=15.dp)
            ) {

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically) {
                    Text(
                        text = text,
                        modifier = Modifier.padding(start = 16.dp)
                    )

                    val context = LocalContext.current

                    RadioButton(
                        selected = (text == selectedOption),
                        modifier = Modifier.padding(all = Dp(value = 8F)),
                        onClick = {
                            onOptionSelected(text)
                            Toast.makeText(context, text, Toast.LENGTH_LONG).show()
                        }
                    )
                }

            }
            Divider()
            Spacer(modifier= Modifier.height(8.dp))

        }

        Spacer(modifier= Modifier.height(3.dp))
        Button(
            onClick={navController.navigate(NavigationItem.CancelTrip.route)},
            colors=ButtonDefaults.buttonColors(
                backgroundColor=colorResource(id= R.color.slimmyGreen),
                contentColor=Color.White,
            ),
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(23.dp),
            border = BorderStroke(3.dp, Color.White),
        ) {
            Text(text= "DONE")

        }


//        Box(modifier= Modifier.padding(start = 20.dp, end = 20.dp, top =5.dp)){
//            Column (modifier = Modifier.fillMaxSize()){
//
//            }
//        }
    }

}

@Composable
fun ReasonsForTripCanceling(){
    val radioOptions = listOf(
        "Rider Isn't here.",
        "Wrong address shown.",
        "Don't charge rider",
        "Reason one.",
        "Reason two.",
        "Reason three.",
        "Reason four.",
        "Other.")
    val (selectedOption, onOptionSelected) = remember { mutableStateOf(radioOptions[5]) }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Spacer(modifier=Modifier.height(30.dp))
        Column {
            //set data to each radio button
            radioOptions.forEach { text ->
                Row(
                    Modifier
                        .fillMaxWidth()
                        .selectable(
                            selected=(text == selectedOption),
                            onClick={ onOptionSelected(text) }
                        )
                        .padding(horizontal=15.dp)
                ) {

                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically) {
                        Text(
                            text = text,
                            modifier = Modifier.padding(start = 16.dp)
                        )

                        val context = LocalContext.current

                        RadioButton(
                            selected = (text == selectedOption),
                            modifier = Modifier.padding(all = Dp(value = 8F)),
                            onClick = {
                                onOptionSelected(text)
                                Toast.makeText(context, text, Toast.LENGTH_LONG).show()
                            }
                        )
                    }

                }
                Divider()
                Spacer(modifier= Modifier.height(8.dp))

            }
        }
    }

}