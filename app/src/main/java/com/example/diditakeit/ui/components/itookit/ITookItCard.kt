package com.example.diditakeit.ui.components.itookit

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.minimumInteractiveComponentSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ITookItButton(text: String, modifier: Modifier = Modifier) {
    ElevatedCard(
        onClick = { /* Do something */ },
        modifier = modifier
    ) {
        Column (
            modifier
                .minimumInteractiveComponentSize()
                .align(Alignment.CenterHorizontally)
        ) {
            Text(
                text,
                modifier
                    .align(Alignment.CenterHorizontally)
            )
        }
    }
}