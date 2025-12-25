package com.example.jepackcomposelearning.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Build
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jepackcomposelearning.R

@Composable
fun HomeScreen1(modifier: Modifier = Modifier){

    Column(
        modifier = modifier
            .fillMaxSize()
            .background(color = Color.White)
            .padding(horizontal = 16.dp)
    ) {

        // space between adds the space between the components properly and effeciently
        Row(
            modifier = modifier
                .fillMaxWidth()
                .padding(vertical = 16.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,



        ){
 //image vector is a format of the image to work with the image properly
            // tint adds color to the icons properly
            // we need to add content description here as well just like in the images properly
            Icon(
                imageVector = Icons.Default.Menu,
                contentDescription = null,
                tint = Color.Blue,
                modifier = modifier.size(24.dp)
            )

            Column(horizontalAlignment = Alignment.CenterHorizontally) {


                Image(painter = painterResource(R.drawable.basket),
                    contentDescription = null,
                    modifier = modifier.size(42.dp)
                )

//                Spacer(modifier=modifier.width(4.dp))

                Text("My basket", fontSize = 12.sp, color = Color.Green)


            }



        }

        //Greeting Message
        Text("Hello Ritankar What do you want today",
            fontSize = 24.sp,
            fontWeight = FontWeight.Medium,
            color = Color.Green,
            lineHeight = 28.sp,
            modifier = modifier
                .padding(bottom = 24.dp)
        )

        //Seacrh Bar Adding
        // Customisable Search Bar

        Row(modifier=modifier
            .fillMaxWidth()
            .background(
                color = Color(0xFFF3F1F1),
                shape = RoundedCornerShape(16.dp)
            )
            .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically){

            Icon(imageVector = Icons.Default.Search,
                contentDescription = null,
                tint = Color(0XFF86869E),
                modifier = modifier.size(24.dp)
            )

            // if we want to add space between components in the same row we use width
            Spacer(modifier=modifier.width(12.dp))

            Text("Search for Anything", fontSize = 14.sp, color = Color(0XFF86869E))


            // using weight for proper mobile responsiveness
            Spacer(modifier=modifier.weight(1f))

            Icon(imageVector = Icons.Default.Build,
                contentDescription = null,
                tint = Color(0XFF86869E),
                modifier = modifier.size(19.dp))


        }

        Text("Recommended Combo",
            fontSize = 20.sp,
            fontWeight = FontWeight.Medium,
            color = Color.Black,
            modifier=modifier
                .padding(bottom = 16.dp,
                    top = 26.dp)
        )


        // scrollable feature is already implemented by the lazy row feature in this properly
        //spaced by adds 16 dp space to all the card components properly

        LazyRow(horizontalArrangement = Arrangement.spacedBy(16.dp),
            modifier = modifier
                .padding(bottom = 16.dp)
        ) {

            // items show the number of times we want that component to be repeated properly
             items(count = 2){ index ->



             }

        }

    } // main column layout here
}


@Composable
fun RecommendedComboCard(modifier: Modifier = Modifier, name: String, price:String, imageRes: Int) {


    Card() {

        Column(modifier=modifier.padding(start = 26.dp)) {

            Row (modifier = modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.End
            ){

                Icon(imageVector = Icons.Default.FavoriteBorder,
                    contentDescription = null,
                    tint = Color(0XFFFF8C42),
                    modifier = modifier.size(20.dp)
                )


                Image(
                    painter = painterResource(id = imageRes),
                    contentDescription = null,
                    modifier=modifier.size(80.dp)
                )

                Spacer(modifier=modifier.height(12.dp))

                Text()

            }

        }

    }
    
}
@Composable
@Preview(showBackground = true)
fun HomeScreen1Preview(modifier: Modifier = Modifier) {

//    HomeScreen1()
    RecommendedComboCard()
}