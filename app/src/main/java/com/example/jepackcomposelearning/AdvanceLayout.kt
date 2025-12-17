package com.example.jepackcomposelearning

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import org.intellij.lang.annotations.JdkConstants


//shows the data according to the screen size and the next portion in the next part.
@Composable
fun LazyColumnExample (modifier: Modifier = Modifier) {
    LazyColumn {

        // list of 100
        items(count = 100){ index ->

            Text("Item $index",modifier= Modifier.padding(8.dp))
        }
    }

}

@Composable
fun LazyRowExample(modifier: Modifier = Modifier) {

    LazyRow {
        
        items(count = 50) { index ->
            
            Text("Item $index",modifier= Modifier.padding(2.dp))

        }
    }
    
}

@Composable
fun MaxWidthExample(modifier: Modifier = Modifier) {

    Column(modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {

        Button(onClick = {}, modifier=Modifier.fillMaxWidth()){
            Text("Submit")
        }

    }
}

@Composable
@Preview(showSystemUi = true)
fun Prev (modifier: Modifier = Modifier) {

    LazyColumnExample()

}

@Composable
@Preview(showSystemUi = true)
fun PrevRow(modifier: Modifier = Modifier) {

    LazyRowExample()

    
    
}

@Composable
@Preview
fun MaxWidthPreview(modifier: Modifier = Modifier) {

    MaxWidthExample()
    
}