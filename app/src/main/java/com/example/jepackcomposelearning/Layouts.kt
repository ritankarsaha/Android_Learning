package com.example.jepackcomposelearning

import com.example.jepackcomposelearning.R
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

// Column Layout Learning
@Composable
fun ColumnExample (modifier: Modifier = Modifier) {


    // Column Layouts
    Column(modifier = Modifier.background(color = Color.Cyan).fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center){

        Text("Hello")
        Text("My name is Ritankar, nice to meet you")
        Button(onClick = {}){
            Text("Ritankar")
        }
    }



    //Row Layout
    Row(modifier = Modifier.background(color = Color.Cyan).fillMaxSize(), verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.Center){

        Text("Hello")
        Text("My name is Ritankar, nice to meet you")
        Button(onClick = {}){
            Text("Ritankar")
        }
    }


    //Box Layout
    // Box stacks one component over another component serially and properly

    Box(modifier = Modifier.fillMaxSize()) {
        Image(painter = painterResource(R.drawable.ic_launcher_background),
            contentDescription = null,
            modifier = Modifier
                .width(200.dp)
                .height(200.dp)
                .align(Alignment.Center)
        )

        Text("Overlap Text", color = Color.Gray, modifier = Modifier.align(Alignment.Center))
    }


}

@Composable
@Preview(showSystemUi = true)
fun ColumnLayoutPreview(modifier: Modifier = Modifier) {

    ColumnExample()

}