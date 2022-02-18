package com.example.uberuimockup.presentation.screens

import android.widget.Space
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.Divider
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.uberuimockup.presentation.components.RadioButtons
import com.example.uberuimockup.presentation.navigation.NavigationItem
import org.intellij.lang.annotations.JdkConstants

@Composable
fun LanguageScreen(){
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
        Divider()
        Card(modifier= Modifier.padding(2.dp), elevation = 5.dp){
            RadioButtons()
        }
        Spacer(modifier= Modifier.height(25.dp))
    }
}

@Composable
@Preview(showBackground = true)
fun LanguageScreenPreview(){
    LanguageScreen()
}

