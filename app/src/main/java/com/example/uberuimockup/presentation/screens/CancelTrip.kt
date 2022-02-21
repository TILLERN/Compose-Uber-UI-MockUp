package com.example.uberuimockup.presentation.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.uberuimockup.R
import com.example.uberuimockup.presentation.components.HeaderIcon
import com.example.uberuimockup.presentation.navigation.NavigationItem

@Composable
fun CancelTrip(){

    MaterialTheme {
        Column (modifier =Modifier
            .background(color=colorResource(id=R.color.slimmyGreen))
            .fillMaxSize()
            .padding(start = 30.dp, end = 30.dp),
        horizontalAlignment = Alignment.CenterHorizontally){
            Spacer(modifier=Modifier.height(40.dp))
            HeaderIcon()
            Spacer(modifier=Modifier.height(55.dp))

            val openDialog = remember { mutableStateOf(false)  }
            Button(
                onClick = { openDialog.value = true },
                colors=ButtonDefaults.buttonColors(
                    backgroundColor= Color.White,
                    contentColor=Color.Red,
                ),
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(23.dp),
                border = BorderStroke(3.dp, Color.Red),
            ) {
                Text(text= "CLICk HERE TO CANCEL")

            }

            if (openDialog.value) {

                AlertDialog(
                    onDismissRequest = {
                        openDialog.value = false
                    },
                    title = {
                        Text(text = "Please Confirm", fontSize = 20.sp, fontWeight = FontWeight.Bold)
                    },
                    text = {
                        Text("Do you want to cancel the trip?", fontSize = 17.sp)
                    },
                    confirmButton = {
                        Button(
                            onClick = { openDialog.value = false },
                            colors=ButtonDefaults.buttonColors(
                                backgroundColor= Color.Red,
                                contentColor=Color.Black,
                            ),
                            modifier = Modifier.fillMaxWidth(),
                            shape = RoundedCornerShape(23.dp),
                            border = BorderStroke(3.dp, Color.Red),
                            ) {
                            Text("Yes Cancel",
                                fontWeight = FontWeight.Bold,
                                fontSize = 25.sp
                            )
                        }
                    },
                    dismissButton = {
                        Button(
                            onClick = { openDialog.value = false },
                            colors=ButtonDefaults.buttonColors(
                                backgroundColor= Color.White,
                                contentColor=Color.Black,

                            ),
                            modifier = Modifier.fillMaxWidth(),
                            shape = RoundedCornerShape(23.dp),
                            border = BorderStroke(3.dp, Color.Red),
                            ) {
                            Text("No",
                                fontWeight = FontWeight.Bold,
                                fontSize = 25.sp)
                        }
                    }
                )
            }
        }

    }
}
