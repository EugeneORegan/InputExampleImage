package com.example.inputexampletwo

import android.media.Image
import android.os.Bundle
import android.os.Message
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextDirection.Companion.Content
import androidx.compose.ui.tooling.preview.Preview
import com.example.inputexampletwo.ui.theme.InputExampleTwoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            InputExampleTwoTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Column {
                        Greeting(
                            name = "Android",
                            modifier = Modifier.padding(innerPadding)
                        )
                        MessageList()
                    }
                }
            }
        }
    }


    @Composable
    fun MessageList() {
        LazyColumn {
            // Add a single item
            item {
                Text(text = "First item")
                Image(
                    painter = painterResource(id = R.drawable.sql),
                    contentDescription = null
                )
            }

            // Add 50 items
            items(10) { index ->
                var counter = index+1
                Text(text = "Item: $counter")
            }

            // Add another single item
            item {
                Text(text = "Last item")
                Image(
                    painter = painterResource(id = R.drawable.ccfc),
                    contentDescription = null
                )
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
        InputExampleTwoTheme {
            Greeting("Android")
        }
    }
}