package com.simecsystem.jetpackcomposebasics.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun HomeScreen(
    onNavigateToDetails: () -> Unit = {}
) {

    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(all = 32.dp)
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxSize()
                .padding()
        ) {
            Text(text = "Home Screen")

            Button(
                onClick = onNavigateToDetails
            ) {
                Text(text = "Go to Details ->")
            }
        }

    }
}

@Preview
@Composable
fun HomeScreenPreview() {
    HomeScreen()
}