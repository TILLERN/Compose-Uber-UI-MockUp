package com.example.uberuimockup.presentation.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.MaterialTheme.colors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.uberuimockup.R
import com.example.uberuimockup.presentation.navigation.NavigationItem

@Composable
fun AcceptTripScreen(navController: NavController){
    Box(modifier=Modifier
        .fillMaxSize()
        .padding(0.dp)){
    Image(
        painter= painterResource(id=R.drawable.mapimage),
        contentDescription="map-background",
        contentScale=ContentScale.FillBounds,
        modifier = Modifier.fillMaxSize()
    )


    Box(modifier=Modifier
        .fillMaxWidth()) {


        Row(modifier=Modifier
            .fillMaxWidth()
            .padding(top=40.dp), verticalAlignment = Alignment.CenterVertically, horizontalArrangement=Arrangement.Center) {
            Button(
                onClick={ navController.navigate(NavigationItem.WhyCancelTrip.route) },
                modifier=Modifier.size(width=150.dp, height=40.dp),
                shape=RoundedCornerShape(25.dp),
                border=BorderStroke(2.dp, color=colorResource(id=R.color.slimmyGreen)),
                colors=ButtonDefaults.buttonColors(
                    backgroundColor=Color.White,
                    contentColor=colorResource(id=R.color.slimmyGreen))) {
                Text(
                    text="cancel",
                    fontSize=20.sp,
                    fontWeight=FontWeight.Bold,
                    color=colorResource(id=R.color.slimmyGreen),
                    textAlign=TextAlign.Center
                )
            }

            }


        }
    }

    Box(
        contentAlignment = Alignment.BottomCenter,
        modifier=Modifier
            .fillMaxWidth()
            .padding(top=650.dp, bottom=0.dp)
    ){
        Card(modifier =Modifier
            .background(color=Color.White)
            .fillMaxWidth()
            .padding(0.dp)) {
            Column(modifier = Modifier.fillMaxSize()) {


                Spacer(modifier=Modifier.height(10.dp))
              Box(
                  modifier= Modifier.padding(start=20.dp, end=20.dp)) {
                  Column(modifier = Modifier.fillMaxWidth(),) {
                      Text(text="25 min",
                          color = Color.Black,
                          fontSize = 26.sp,
                          textAlign = TextAlign.Center,
                          fontWeight = FontWeight.Bold,
                          modifier = Modifier.fillMaxWidth()
                      )
                      Spacer(modifier=Modifier.height(15.dp))
                      Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
                          Text(text=" KES. 1,570", color = Color.Black, fontWeight = FontWeight.Bold, fontSize = 20.sp )
                          Text(text=" 4.5 km", color = Color.Black, fontWeight = FontWeight.Bold, fontSize = 20.sp )
                          Text(text=" Rating 3.8", color = Color.Black, fontWeight = FontWeight.Bold, fontSize = 20.sp )

                      }
                      Spacer(modifier=Modifier.height(10.dp))
                      Text(text="Nziu Court Phase 5 hse. 879", color = Color.Black, fontWeight = FontWeight.Bold, fontSize = 16.sp )
                      Spacer(modifier=Modifier.height(10.dp))
                      Text(text=" 58 Buruburu, Nairobi", color = Color.Black, fontWeight = FontWeight.Bold, fontSize = 16.sp )
                      Spacer(modifier=Modifier.height(10.dp))

                      OutlinedButton(
                          onClick={ navController.navigate(NavigationItem.StartTripMap.route) },
                          modifier= Modifier.fillMaxWidth(),
                          shape = RoundedCornerShape(23.dp),
                          border = BorderStroke(3.dp, Color.White),
                          contentPadding = PaddingValues(0.dp),
                          colors = ButtonDefaults.outlinedButtonColors(
                              backgroundColor = colorResource(id=R.color.slimmyGreen),
                              contentColor =  Color.White)
                      ) {
                          Text(text="TAP TO ACCEPT",
                              fontWeight = FontWeight.Bold,
                              fontSize = 25.sp,
                              textAlign = TextAlign.Center)
                      }
                  }
              }
            }


        }
    }
}

