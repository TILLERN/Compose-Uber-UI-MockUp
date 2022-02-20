package com.example.uberuimockup.presentation.screens

import android.widget.Space
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.uberuimockup.presentation.components.RadioButtons
import com.example.uberuimockup.presentation.navigation.NavigationItem
import org.intellij.lang.annotations.JdkConstants

@Composable
fun LanguageScreen(navController: NavController){
    Column(modifier = Modifier.padding(5.dp)) {
        Icon(imageVector= Icons.Default.ArrowBack, contentDescription= "back arrow")
        Spacer(modifier= Modifier.height(25.dp))
        Text(
            text= "Choose Language",
            textAlign = TextAlign.Start,
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp
        )
        Spacer(modifier=Modifier.height(5.dp))
        Spacer(modifier=Modifier
            .fillMaxWidth()
            .height(1.dp)
            .background(color=Color.Black))
        Divider()
        Spacer(modifier=Modifier.height(5.dp))

        Card(modifier= Modifier.padding(2.dp), elevation = 2.dp){


                    RadioButtons()
                    Spacer(modifier= Modifier.fillMaxWidth().height(1.dp).background(color = Color.Black))
                    Spacer(modifier=Modifier.height(5.dp))
                    Button(
                        onClick={ navController.navigate(NavigationItem.LogInPromptScreen.route) },
                        colors=ButtonDefaults.buttonColors(
                            backgroundColor=Color.Transparent,
                            contentColor=Color.Black,
                        ),
                    ) {
                        Text(text= "DONE")

                    }



        }

        Spacer(modifier= Modifier.height(30.dp))


    }
}



