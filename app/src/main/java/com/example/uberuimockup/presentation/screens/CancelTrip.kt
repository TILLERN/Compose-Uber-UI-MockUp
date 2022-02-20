package com.example.uberuimockup.presentation.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.uberuimockup.R

@Composable
fun CancelTrip(){

    MaterialTheme {
        Column {
            val openDialog = remember { mutableStateOf(false)  }

            Button(onClick = {
                openDialog.value = true
            }) {
                Text("Click me")
            }

            if (openDialog.value) {

                AlertDialog(
                    onDismissRequest = {
                        openDialog.value = false
                    },
                    title = {
                        Text(text = "Please Confirm")
                    },
                    text = {
                        Text("Do you want to cancel the trip?")
                    },
                    confirmButton = {
                        Button(
                            onClick = {
                                openDialog.value = false
                            }) {
                            Text("Yes Cancel", fontWeight = FontWeight.Bold, color = Color.Red, fontSize = 26.sp )
                        }
                    },
                    dismissButton = {
                        Button(
                            onClick = {
                                openDialog.value = false
                            }) {
                            Text("No", fontWeight = FontWeight.Bold, color = colorResource(id= R.color.slimmyGreen), fontSize = 26.sp)
                        }
                    }
                )
            }
        }

    }
}
