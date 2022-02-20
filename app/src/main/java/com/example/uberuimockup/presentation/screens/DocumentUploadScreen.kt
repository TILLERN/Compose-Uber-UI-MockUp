package com.example.uberuimockup.presentation.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.uberuimockup.R
import com.example.uberuimockup.presentation.navigation.NavigationItem

@Composable
fun DocumentUploadScreen(navController: NavController){
    Column(modifier = Modifier.padding(5.dp)) {
        Row() {
            Icon(imageVector= Icons.Default.ArrowBack, contentDescription="back")
            Spacer(modifier= Modifier.width(20.dp))
            Text(text= "Personal Document")

        }
        Divider()
        
        Box {
            Card() {
                Column() {
                    Row() {
                        Text(text= "Birth Certificate", fontSize = 15.sp, fontWeight = FontWeight.Bold)
                        Spacer(modifier=Modifier.height(2.dp))
                        Button(
                            onClick = {
                                // do something here
                            }
                        ) {
                            Icon(
                                imageVector = Icons.Filled.Notifications,
                                contentDescription = "upload icon",
                                Modifier.padding(end = 8.dp)
                            )
                            Text(text = "Upload")
                        }

                    }
                    Text(text= "Vehicle Registration", fontSize = 12.sp)

                }
            }

            Divider()

            Card() {
                Column() {
                    Row() {
                        Text(text= "Driving Licence", fontSize = 15.sp, fontWeight = FontWeight.Bold)
                        Spacer(modifier=Modifier.height(2.dp))
                        Button(
                            onClick = {
                                // do something here
                            }
                        ) {
                            Icon(
                                imageVector = Icons.Filled.Notifications,
                                contentDescription = "upload icon",
                                Modifier.padding(end = 8.dp)
                            )
                            Text(text = "Upload")
                        }

                    }
                    Text(
                        text="A driving Licence is an official document showing validity of your driving skills.",
                        fontSize=12.sp,
                        maxLines=1,
                        overflow=TextOverflow.Ellipsis,
                    )

                }
            }
            Divider()

            Card() {
                Column() {
                    Row() {
                        Text(text= "Passport", fontSize = 15.sp, fontWeight = FontWeight.Bold)
                        Spacer(modifier=Modifier.height(2.dp))
                        Button(
                            onClick = {
                                // do something here
                            }
                        ) {
                            Icon(
                                imageVector = Icons.Filled.Notifications,
                                contentDescription = "upload icon",
                                Modifier.padding(end = 8.dp)
                            )
                            Text(text = "Upload")
                        }

                    }
                    Text(text= "Vehicle Registration", fontSize = 12.sp)

                }
            }

            Divider()

            Card() {
                Column() {
                    Row() {
                        Text(text= "Election Card", fontSize = 15.sp, fontWeight = FontWeight.Bold)
                        Spacer(modifier=Modifier.height(2.dp))
                        Button(
                            onClick = {
                                // do something here
                            }
                        ) {
                            Icon(
                                imageVector = Icons.Filled.Notifications,
                                contentDescription = "upload icon",
                                Modifier.padding(end = 8.dp)
                            )
                            Text(text = "Upload")
                        }

                    }
                    Text(text= "Vehicle Registration", fontSize = 12.sp)

                }
            }

            Divider()
            
        }

        Divider()

        Text(
            text="By continuing, i confirm that i have read and agree to the Terms & Conditions and Private Policy.",
            textAlign = TextAlign.Center,
            fontSize = 12.sp,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier=Modifier.height(30.dp))
        Button(
            onClick={ navController.navigate(NavigationItem.AcceptTripScreen.route) },
            colors=ButtonDefaults.buttonColors(
                backgroundColor=colorResource(id= R.color.slimmyGreen),
                contentColor=Color.Black,
            ),
        ) {
            Text(text= "NEXT")

        }

    }

}