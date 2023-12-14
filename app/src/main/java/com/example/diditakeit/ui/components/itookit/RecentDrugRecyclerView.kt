package com.example.diditakeit.ui.components.itookit

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.diditakeit.ui.components.domain.DrugView

@Composable
fun RecentDrugLazyColumn(modifier: Modifier = Modifier) {
    LazyColumn(modifier) {
        DrugView(modifier)
    }
}