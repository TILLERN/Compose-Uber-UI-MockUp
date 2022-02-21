package com.example.uberuimockup.presentation.screens

import android.widget.Space
import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.selection.selectable
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.uberuimockup.presentation.components.HeaderIcon
import com.example.uberuimockup.presentation.components.RadioButtons
import com.example.uberuimockup.presentation.navigation.NavigationItem
import org.intellij.lang.annotations.JdkConstants

@Composable
fun LanguageScreen(navController: NavController) {
    Column() {


        Box() {


            Column(modifier=Modifier.padding(5.dp)) {
                Spacer(modifier=Modifier.height(5.dp))
                HeaderIcon()
                Spacer(modifier=Modifier.height(3.dp))
                Icon(imageVector=Icons.Default.ArrowBack, contentDescription="back arrow")
                Spacer(modifier=Modifier.height(20.dp))
                Text(
                    text="Choose Language",
                    textAlign=TextAlign.Start,
                    fontWeight=FontWeight.Bold,
                    fontSize=20.sp
                )
                Spacer(modifier=Modifier.height(5.dp))
                Spacer(modifier=Modifier
                    .fillMaxWidth()
                    .height(1.dp)
                    .background(color=Color.Black))
                Divider()
                Spacer(modifier=Modifier.height(5.dp))


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
                                            horizontalArrangement =Arrangement.SpaceBetween,
                                            verticalAlignment =Alignment.CenterVertically) {
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
                                Spacer(modifier= Modifier.height(10.dp))

                            }
                        }
                    }

                }
                Spacer(modifier=Modifier
                    .fillMaxWidth()
                    .height(1.dp)
                    .background(color=Color.Black))
                Spacer(modifier=Modifier.height(5.dp))

            }
        }
        Spacer(modifier=Modifier.height(5.dp))


           Button(
               onClick={ navController.navigate(NavigationItem.LogInPromptScreen.route) },
               colors=ButtonDefaults.buttonColors(
                   backgroundColor=Color.Transparent,
                   contentColor=Color.Black,
               ),
           ) {
               Text(text="DONE")

           }

           Spacer(modifier=Modifier.height(30.dp))
       }





