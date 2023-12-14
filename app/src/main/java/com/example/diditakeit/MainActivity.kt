package com.example.diditakeit

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.room.Room
import com.example.diditakeit.database.AppDatabase
import com.example.diditakeit.ui.components.itookit.ITookItButton
import com.example.diditakeit.ui.components.itookit.RecentDrugLazyColumn
import com.example.diditakeit.ui.theme.DidITakeItTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val database = Room.databaseBuilder(
            applicationContext,
            AppDatabase::class.java,
            "dev"
        )
            .createFromAsset("dev_1.db")
            .allowMainThreadQueries() //TODO: Remove me see iss2
            .build();

        setContent {
            DidITakeItTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxWidth(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ITookItButton(text = database.drugDao().getAll().toString())
                    RecentDrugLazyColumn()
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    DidITakeItTheme {
        ITookItButton(text = "I took it!")
    }
}
