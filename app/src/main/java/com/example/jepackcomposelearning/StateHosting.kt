package com.example.jepackcomposelearning

import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier

@Composable
fun GoodTextField(text: String, onTextChange:(String)->Unit) {

    TextField(
        value = text,
        onValueChange = onTextChange,
        label = {Text("Enter Text")}
    )


}

// code in this composable is passed from the earlier composable
@Composable
fun ParentComposable(modifier: Modifier = Modifier) {

    var text by remember { mutableStateOf("") }

    GoodTextField(text) {
        text = it
    }

}