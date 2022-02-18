package com.example.uberuimockup

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.uberuimockup.ui.theme.UberUIMockUpTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            UberUIMockUpTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier=Modifier.fillMaxSize(), color=MaterialTheme.colors.background) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text="Hello $name!")
}

@Preview(showBackground=true)
@Composable
fun DefaultPreview() {
    UberUIMockUpTheme {
        Greeting("Android")
    }
}