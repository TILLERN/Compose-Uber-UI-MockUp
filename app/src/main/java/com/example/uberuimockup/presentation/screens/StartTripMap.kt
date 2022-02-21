package com.example.uberuimockup.presentation.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme.colors
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Text
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
fun StartTripMap(navController: NavController){
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
                .padding(top=40.dp), verticalAlignment = Alignment.CenterVertically, horizontalArrangement=Arrangement.End) {
                Button(
                    onClick={ },
                    modifier=Modifier.size(width=140.dp, height=50.dp),
                    shape=RoundedCornerShape(25.dp),
                    border=BorderStroke(2.dp, color=colorResource(id=R.color.slimmyGreen)),
                    colors=ButtonDefaults.buttonColors(
                        backgroundColor=Color.White,
                        contentColor=colorResource(id=R.color.slimmyGreen))) {
                    Text(
                        text="154.75",
                        fontSize=32.sp,
                        fontWeight=FontWeight.Bold,
                        color=colorResource(id=R.color.slimmyGreen),
                        textAlign=TextAlign.Center
                    )
                }
                Spacer(modifier=Modifier.width(75.dp))

                Image(
                    painter=painterResource(id=R.drawable.victor),
                    contentDescription="driver picture",
                    contentScale=ContentScale.Crop,
                    modifier=Modifier
                        .padding(end=25.dp)
                        .size(37.dp)
                        .clip(CircleShape)
                        .border(
                            2.dp,
                            color=colorResource(id=R.color.slimmyGreen),
                            CircleShape
                        )
                )

            }


        }
    }

    Box(
        contentAlignment = Alignment.BottomCenter,
        modifier= Modifier.fillMaxWidth().padding(top = 700.dp,  bottom = 30.dp)
    ){
        OutlinedButton(
            onClick = { navController.navigate(NavigationItem.EndTrip.route) },
            modifier= Modifier.size(65.dp),
            shape = CircleShape,
            border= BorderStroke(2.dp, color = Color.White),
            contentPadding = PaddingValues(0.dp),
            colors = ButtonDefaults.outlinedButtonColors(
                backgroundColor = colorResource(id=R.color.slimmyGreen),
                contentColor =  Color.White)
        ) {
            Text(text="GO",
                fontWeight = FontWeight.Bold,
                fontSize = 35.sp,
                textAlign = TextAlign.Center)
        }
    }
}

