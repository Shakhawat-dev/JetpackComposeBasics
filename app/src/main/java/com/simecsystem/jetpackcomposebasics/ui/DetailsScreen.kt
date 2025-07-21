package com.simecsystem.jetpackcomposebasics.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kotlinx.serialization.Serializer

@Composable
fun DetailsScreen(
    onNavigateBack: () -> Unit = {}
) {
    Box(modifier = Modifier.padding(all = 32.dp)) {

        Card {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
                modifier = Modifier
//                    .fillMaxSize()
                    .padding()
            ) {
                Text(text = "Details Screen")

                Button(
                    onClick = onNavigateBack
                ) {
                    Text(text = "<- Go Back")
                }
            }
        }
    }
}
@Preview
@Composable
fun DetailsScreenPreview() {
    DetailsScreen()
}