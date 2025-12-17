package com.example.jepackcomposelearning

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

@Composable

// the name:String is the parameter used over here in the Composable function properly
fun Greet(name:String ) {
    Text("Hello $name")
}

@Composable
fun ProfileCard(name: String, age:Int, color: Color){

    Text("$name $age ${color.toString()}")

}

// Recomposition is the process where  selective UI gets changed effecfiently, only that part of the UI gets changed and the rest doesn't get touched.
