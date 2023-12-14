package com.example.diditakeit.ui.components.itookit

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.diditakeit.database.entity.Drug
import com.example.diditakeit.ui.components.domain.DrugView

@Composable
fun RecentDrugLazyColumn(drugs: List<Drug>, modifier: Modifier = Modifier) {
    LazyColumn(modifier) {
        items(drugs) {
            DrugView(it, modifier = modifier)
        }
    }
}