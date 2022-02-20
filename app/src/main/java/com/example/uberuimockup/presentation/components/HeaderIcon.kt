package com.example.uberuimockup.presentation.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.uberuimockup.R

@Composable
fun HeaderIcon(){
    Box(modifier=Modifier.fillMaxWidth(), contentAlignment = Alignment.Center ){
        Column() {
            Spacer(modifier=Modifier.height(20.dp))
            Image(
                painter= painterResource(id=R.drawable.logo),
                contentDescription="logo header",
                modifier = Modifier.size(height = 80.dp, width = 200.dp)
            )
            Spacer(modifier=Modifier.height(8.dp))
        }
    }
}