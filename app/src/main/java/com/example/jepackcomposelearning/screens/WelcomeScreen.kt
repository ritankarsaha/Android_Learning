package com.example.jepackcomposelearning.screens

import com.example.jepackcomposelearning.R
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun WelcomeScreen(modifier: Modifier = Modifier) {

    Column (modifier = Modifier.fillMaxSize().background(color = Color.White)) {

        // weight indicates the fraction of the screen that is to be occupied properly
        // fixing the height messes with the layout and the other orientation of the devices
        // if we wanna use the gradient parameter we need to use brush



        Box(
            modifier = Modifier.fillMaxWidth().weight(0.65f).background(
                brush = Brush.verticalGradient(
                    colors = listOf(
                        Color(0XFFFF8C42),
                    Color(0XFFFF7A2B)
                    )
                )
            ), contentAlignment = Alignment.Center
        ){
            // alpha helps you to reduce the opacity of the color for a more smooth background properly
            Box(
                modifier = Modifier
                    .size(280.dp)
                    .background(
                        color = Color.White.copy(alpha = 0.1f),
                        shape = CircleShape
                    ),
                contentAlignment = Alignment.Center
            ){
                Image(
                    painter = painterResource(R.drawable.img),
                    contentDescription = null,
                    modifier = modifier.size(160.dp)
                )
            }

        }
    }

}

@Composable
@Preview(showBackground = true)
fun WelcomeScreenPreview(modifier: Modifier = Modifier) {

    WelcomeScreen()
}