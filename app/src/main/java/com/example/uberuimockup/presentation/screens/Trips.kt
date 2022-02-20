package com.example.uberuimockup.presentation.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material.Divider
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.uberuimockup.R

@Composable
fun Trips(){
    Column(modifier = Modifier.fillMaxSize()) {
        Row(Modifier
            .fillMaxWidth()
            .padding(start=20.dp), horizontalArrangement = Arrangement.Start) {
            Spacer(modifier=Modifier.height(15.dp))
            Icon(imageVector=Icons.Default.ArrowBack, contentDescription="back")
            Text(
                text= "Trips",
                fontSize = 23.sp,
                fontWeight = FontWeight.Bold,
                color = colorResource(id=R.color.slimmyGreen)
            )
        }
        Spacer(modifier=Modifier.height(15.dp))
        Divider()
        Spacer(modifier=Modifier.height(5.dp))
        Row(modifier=Modifier
            .padding(start=20.dp, end=20.dp, top=5.dp)
            .fillMaxWidth(),
            horizontalArrangement=Arrangement.SpaceBetween) {
            Column(modifier=Modifier
                .fillMaxWidth()) {
                Row(modifier=Modifier
                    .fillMaxWidth(),
                    horizontalArrangement=Arrangement.SpaceBetween) {
                    Text(text="Mon, 22 Feb", fontSize = 15.sp, color = colorResource(id=R.color.slimmyGreen), fontWeight = FontWeight.Bold)
                    Text(text="KES. 5,320", fontSize = 15.sp, color = colorResource(id=R.color.purple_700), fontWeight = FontWeight.Bold)


                }
                Spacer(modifier=Modifier.height(5.dp))
                Text(text="22 Trips", fontSize = 13.sp, color = colorResource(id=R.color.slimmyGreen))

            }

        }
        Spacer(modifier=Modifier.height(5.dp))
        Divider()
        Spacer(modifier=Modifier.height(5.dp))
        Row(modifier=Modifier
            .padding(start=20.dp, end=20.dp, top=5.dp)
            .fillMaxWidth(),
            horizontalArrangement=Arrangement.SpaceBetween) {
            Column(modifier=Modifier
                .fillMaxWidth()) {
                Row(modifier=Modifier
                    .fillMaxWidth(),
                    horizontalArrangement=Arrangement.SpaceBetween) {
                    Text(text="Tue, 23 Feb", fontSize = 15.sp, color = colorResource(id=R.color.slimmyGreen), fontWeight = FontWeight.Bold)
                    Text(text="KES. 6,320", fontSize = 15.sp, color = colorResource(id=R.color.slimmyGreen), fontWeight = FontWeight.Bold)


                }
                Spacer(modifier=Modifier.height(5.dp))
                Text(text="17 Trips", fontSize = 13.sp, color = colorResource(id=R.color.slimmyGreen))

            }


            Spacer(modifier=Modifier.height(5.dp))
            Divider()
            Spacer(modifier=Modifier.height(5.dp))
            Row(modifier=Modifier
                .padding(start=20.dp, end=20.dp, top=5.dp)
                .fillMaxWidth(),
                horizontalArrangement=Arrangement.SpaceBetween) {
                Column(modifier=Modifier
                    .fillMaxWidth()) {
                    Row(modifier=Modifier
                        .fillMaxWidth(),
                        horizontalArrangement=Arrangement.SpaceBetween) {
                        Text(text="Web, 24 Feb", fontSize = 15.sp, color = colorResource(id=R.color.slimmyGreen), fontWeight = FontWeight.Bold)
                        Text(text="KES. 5,320", fontSize = 15.sp, color = colorResource(id=R.color.slimmyGreen), fontWeight = FontWeight.Bold)


                    }
                    Spacer(modifier=Modifier.height(5.dp))
                    Text(text="12 Trips", fontSize = 13.sp, color = colorResource(id=R.color.slimmyGreen))

                }

            }

            Spacer(modifier=Modifier.height(5.dp))
            Divider()
            Spacer(modifier=Modifier.height(5.dp))
            Row(modifier=Modifier
                .padding(start=20.dp, end=20.dp, top=5.dp)
                .fillMaxWidth(),
                horizontalArrangement=Arrangement.SpaceBetween) {
                Column(modifier=Modifier
                    .fillMaxWidth()) {
                    Row(modifier=Modifier
                        .fillMaxWidth(),
                        horizontalArrangement=Arrangement.SpaceBetween) {
                        Text(text="Thur, 24 Feb", fontSize = 15.sp, color = colorResource(id=R.color.slimmyGreen), fontWeight = FontWeight.Bold)
                        Text(text="KES. 8,320", fontSize = 15.sp, color = colorResource(id=R.color.slimmyGreen), fontWeight = FontWeight.Bold)


                    }
                    Spacer(modifier=Modifier.height(5.dp))
                    Text(text="19 Trips", fontSize = 13.sp, color = colorResource(id=R.color.slimmyGreen))

                }

            }

    }

}
}
