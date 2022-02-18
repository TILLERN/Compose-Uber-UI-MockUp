package com.example.uberuimockup.presentation.components

import android.widget.Toast
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Arrangement.SpaceBetween
import androidx.compose.foundation.selection.selectable
import androidx.compose.material.Card
import androidx.compose.material.RadioButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun RadioButtons(){
    val radioOptions = listOf("English", "Japanese", "Swahili", "Latino", "Francais" ,"Germany")
    val (selectedOption, onOptionSelected) = remember { mutableStateOf(radioOptions[5]) }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Spacer(modifier=Modifier.height(30.dp))
        Column {
            //set data to each radio button
            radioOptions.forEach { text ->
                Row(
                    Modifier
                        .fillMaxWidth()
                        .selectable(
                            selected=(text == selectedOption),
                            onClick={ onOptionSelected(text) }
                        )
                        .padding(horizontal=16.dp)
                ) {
                   Card() {
                       Row(
                           modifier = Modifier.fillMaxWidth(),
                           horizontalArrangement = SpaceBetween,
                       verticalAlignment = CenterVertically) {
                           Text(
                               text = text,
                               modifier = Modifier.padding(start = 16.dp)
                           )

                           val context = LocalContext.current

                           RadioButton(
                               selected = (text == selectedOption),
                               modifier = Modifier.padding(all = Dp(value = 8F)),
                               onClick = {
                                   onOptionSelected(text)
                                   Toast.makeText(context, text, Toast.LENGTH_LONG).show()
                               }
                           )
                       }

                   }

                }
                Spacer(modifier=Modifier.height(10.dp))
            }
        }
    }

}