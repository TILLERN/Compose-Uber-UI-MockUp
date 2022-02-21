package com.example.uberuimockup.presentation.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
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
import com.example.uberuimockup.presentation.components.HeaderIcon
import com.example.uberuimockup.presentation.navigation.NavigationItem

@Composable
fun DocumentUploadScreen(navController: NavController){
    Column(modifier = Modifier.padding(start = 20.dp ,top= 5.dp, end = 20.dp)) {
        Spacer(modifier=Modifier.height(6.dp))
        HeaderIcon()
        Spacer(modifier=Modifier.height(6.dp))

        Row() {
            Icon(imageVector= Icons.Default.ArrowBack, contentDescription="back")
            Spacer(modifier= Modifier.width(20.dp))
            Text(text= "Personal Document")

        }

        Spacer(modifier=Modifier.height(20.dp))
        Divider()
        Spacer(modifier=Modifier.height(10.dp))


        Card(modifier =Modifier
            .fillMaxWidth()
            .padding(5.dp)) {
            Column(modifier=Modifier
                .fillMaxWidth()
                .padding(5.dp)) {
                Row(modifier=Modifier.fillMaxWidth().padding(end = 5.dp),
                    horizontalArrangement=Arrangement.SpaceBetween) {
                    Text(text="Birth Certificate", fontSize=15.sp, fontWeight=FontWeight.Bold)


                    Text(
                        text="Upload",
                        color = colorResource(id= R.color.slimmyGreen),
                        fontWeight = FontWeight.Bold,
                        fontSize = 14.sp,
                        modifier = Modifier.clickable {  })


                }
                Spacer(modifier=Modifier.height(2.dp))
                Text(text="Vehicle Registration", fontSize=12.sp)

            }

        }
            Divider()
        Spacer(modifier=Modifier.height(6.dp))

            Card(modifier =Modifier
                .fillMaxWidth()
                .padding(5.dp)) {
                Column() {
                    Row(modifier = Modifier.fillMaxWidth().padding(end = 5.dp),horizontalArrangement = Arrangement.SpaceBetween) {
                        Text(text= "Driving Licence", fontSize = 15.sp, fontWeight = FontWeight.Bold)

                        Text(
                            text="Upload",
                            color = colorResource(id= R.color.slimmyGreen),
                            fontWeight = FontWeight.Bold,
                            fontSize = 14.sp,
                            modifier = Modifier.clickable {  })

                    }
                    Spacer(modifier=Modifier.height(2.dp))
                    Text(
                        text="A driving Licence is an official document showing validity of your driving skills.",
                        fontSize=12.sp,
                        maxLines=1,
                        overflow=TextOverflow.Ellipsis,
                    )

                }
            }
            Divider()
        Spacer(modifier=Modifier.height(6.dp))

        Card(modifier =Modifier
            .fillMaxWidth()
            .padding(5.dp)) {
                Column() {
                    Row(modifier = Modifier.fillMaxWidth().padding(end = 5.dp),horizontalArrangement = Arrangement.SpaceBetween) {
                        Text(text= "Passport", fontSize = 15.sp, fontWeight = FontWeight.Bold)
                        Spacer(modifier=Modifier.height(2.dp))
                        Text(
                            text="Upload",
                            color = colorResource(id= R.color.slimmyGreen),
                            fontWeight = FontWeight.Bold,
                            fontSize = 14.sp,
                            modifier = Modifier.clickable {  })

                    }
                    Spacer(modifier=Modifier.height(2.dp))
                    Text(text= "Vehicle Registration", fontSize = 12.sp)

                }
            }

            Divider()
        Spacer(modifier=Modifier.height(6.dp))

        Card(modifier =Modifier
            .fillMaxWidth()
            .padding(5.dp)) {
                Column() {
                    Row(modifier = Modifier.fillMaxWidth().padding(end = 5.dp),horizontalArrangement = Arrangement.SpaceBetween) {
                        Text(text= "Election Card", fontSize = 15.sp, fontWeight = FontWeight.Bold)
                        Spacer(modifier=Modifier.height(2.dp))
                        Text(
                            text="Upload",
                            color = colorResource(id= R.color.slimmyGreen),
                            fontWeight = FontWeight.Bold,
                            fontSize = 14.sp,
                            modifier = Modifier.clickable {  })

                    }
                    Spacer(modifier=Modifier.height(2.dp))
                    Text(text= "Vehicle Registration", fontSize = 12.sp)

                }
            }

            Divider()
            


        Divider()
Spacer(modifier=Modifier.height(40.dp))
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
                contentColor=Color.White,
            ),
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(23.dp),
            border = BorderStroke(3.dp, Color.White),
        ) {
            Text(text= "NEXT")

        }

    }

}