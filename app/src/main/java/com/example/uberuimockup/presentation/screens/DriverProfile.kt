package com.example.uberuimockup.presentation.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Edit
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.uberuimockup.R
import com.example.uberuimockup.presentation.navigation.DrawerNavigationItem
import com.example.uberuimockup.presentation.navigation.NavigationItem

@Composable
fun DriverProfile(navController: NavController){
    Column(modifier = Modifier.fillMaxSize()) {
        Box(
            modifier=Modifier
                .background(color=colorResource(id=R.color.slimmyGreen))
                .height(200.dp)
                .fillMaxWidth()
                .padding(0.dp),
        ) {
            Column() {


            Row(horizontalArrangement = Arrangement.SpaceBetween){
                Icons.Default.ArrowBack
                Icons.Default.Edit
            }

            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Image(
                    painter=painterResource(id=R.drawable.victor),
                    contentDescription="driver picture",
                    contentScale=ContentScale.Crop,
                    modifier=Modifier
                        .padding(top=25.dp)
                        .size(100.dp)
                        .clip(CircleShape)
                        .border(
                            2.dp,
                            color=colorResource(id=R.color.slimmyGreen),
                            CircleShape
                        )
                )
                Text(text="Tillern Minodi",
                    fontSize=32.sp,
                    color= Color.White,
                    fontWeight=FontWeight.Bold,
                    textAlign=TextAlign.Center,
                    modifier=Modifier.fillMaxWidth())
            }
            }


            }
            
        }

   Column() {
       Spacer(modifier=Modifier.height(300.dp))
       Text(text="Profile UI buit here",
           fontSize=32.sp,
           color= Color.Black,
           fontWeight=FontWeight.Bold,
           textAlign=TextAlign.Center,
           modifier=Modifier.fillMaxWidth())

       Spacer(modifier=Modifier.height(200.dp))
       Text(text="Home/ Tap Here To Accept Trip",
           fontSize=30.sp,
           color= Color.Black,
           fontWeight=FontWeight.Bold,
           textAlign=TextAlign.Center,
           modifier=Modifier.fillMaxWidth().clickable { navController.navigate(NavigationItem.AcceptTripScreen.route) })



   }


}


