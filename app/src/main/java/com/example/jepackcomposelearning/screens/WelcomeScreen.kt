package com.example.jepackcomposelearning.screens

import com.example.jepackcomposelearning.R
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

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

        // splitting the screen using the weight parameters
        Column(modifier = Modifier.fillMaxWidth()
            .weight(0.35f)
            .padding(horizontal = 24.dp, vertical = 32.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {

            Column(horizontalAlignment = Alignment.CenterHorizontally) {

                Text("Get the Freshest Fruits Here",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF272140),
                    textAlign = TextAlign.Center,
                    lineHeight = 28.sp
                )

                // providing the space between the two components properly
                Spacer(modifier = Modifier.height(16.dp))

                Text("I am Ritankar Saha, hehe",
                    fontSize = 16.sp,
                    color = Color(0xFF50577E),
                    textAlign = TextAlign.Center,
                    lineHeight = 24.sp
                )

                Spacer(modifier = Modifier.height(36.dp))

                Button(onClick = {}, modifier = modifier.fillMaxWidth()
                    .height(56.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFFF8C42)),
                    shape = RoundedCornerShape(16.dp)
                ) {

                    Text("Tap on Me Ahh !! ",
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Medium,
                        color = Color.White
                    )

                }

            }

        }
    }

}

@Composable
@Preview(showBackground = true)
fun WelcomeScreenPreview(modifier: Modifier = Modifier) {

    WelcomeScreen()
}