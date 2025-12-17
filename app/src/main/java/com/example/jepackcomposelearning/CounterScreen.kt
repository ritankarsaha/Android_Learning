package com.example.jepackcomposelearning

import android.R
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.material3.Text
import androidx.compose.material3.Button
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp

@Composable
fun CounterScreen () {

    // recomposition will initially fail over here.
    // var count = 0


    // this is where recomposiiton will be working properly
    var count by remember { mutableStateOf(0) }

    // modifier is used to add paddings and stuff
    //Column and row helps us to show the stuff vertically or horizontally

    Text("$count", modifier = Modifier.padding(16.dp), color = colorResource(R.color.holo_orange_dark))

    Button (onClick ={
        count++
    }){

     Text("increase")

    } //we can put another composable function inside these curly braces, higher order fucntion

}